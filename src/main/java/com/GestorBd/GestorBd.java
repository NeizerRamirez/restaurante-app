package com.GestorBd;
import org.example.ClientePila;
import org.example.Reservas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GestorBd {
    private static final String URL = "jdbc:sqlite:restaurante.db"; // Ruta al archivo SQLite
    private Connection conn;
    private Queue<String> colaReservas = new LinkedList<>(); // FIFO
    private Stack<String> pilaEspera = new Stack<>();

    // Constructor para manejar la conexión inicial
    public GestorBd() {
        try {
            conn = DriverManager.getConnection(URL);
            if (conn != null) {

                crearTablas(); // Crear tablas al inicializar el objeto
            }
        } catch (SQLException e) {

        }
    }

    private void crearTablas() {
        String createTableReservasSQL = "CREATE TABLE IF NOT EXISTS reservas (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_cliente TEXT NOT NULL," +
                "hora_reserva TEXT NOT NULL," +
                "hora_fin TEXT NOT NULL," +
                "numero_mesa INTEGER NOT NULL," +
                "numero_personas INTEGER NOT NULL," +
                "fecha_reserva DATE NOT NULL);";

                //Insertar los valores base para las reservas


        String createTableClientesEsperaSQL = "CREATE TABLE IF NOT EXISTS clientes_espera (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_cliente TEXT NOT NULL," +
                "tiempo_espera INTEGER NOT NULL," +
                "fecha_entrada DATE DEFAULT (DATE('now')));";


 // Cierre de paréntesis


        try (Statement stmt = conn.createStatement()) {
            stmt.execute(createTableReservasSQL);      // Ejecutar la primera instrucción SQL
            stmt.execute(createTableClientesEsperaSQL); // Ejecutar la segunda instrucción SQL
            insertarReservasBase();
        } catch (SQLException e) {
            System.err.println("Error al crear las tablas: " + e.getMessage());
        }
    }

    // Método para insertar una reserva
    public void insertarReserva(Reservas gestionarReservas) {
        colaReservas.add(gestionarReservas.getNombreCliente());
        String insertSQL = "INSERT INTO reservas (nombre_cliente, hora_reserva, hora_fin, numero_personas, numero_mesa, fecha_reserva) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, gestionarReservas.getNombreCliente());
            pstmt.setString(2, gestionarReservas.getHoraReserva().toString());
            pstmt.setString(3, gestionarReservas.getHoraFin().toString());
            pstmt.setInt(4, gestionarReservas.getNumeroPersonas());
            pstmt.setInt(5, gestionarReservas.getNumeroMesa());
            pstmt.setString(6, gestionarReservas.getFechaReserva());
            pstmt.executeUpdate();
            System.out.println("Reserva insertada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar reserva: " + e.getMessage());
        }
    }

    public void insertarReservasBase() {
        String checkSQL = "SELECT COUNT(*) FROM reservas";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(checkSQL)) {

            rs.next();
            int count = rs.getInt(1);

            if (count == 0) { // Si no hay registros en la tabla
                insertarReserva(new Reservas(1,"Peña", LocalTime.of(7, 0), LocalTime.of(9, 0), 2, 1, "2024-11-12"));
                insertarReserva(new Reservas(2,"Dzul", LocalTime.of(8, 0), LocalTime.of(10, 0), 1, 2, "2024-11-12"));
                insertarReserva(new Reservas(3,"Ramirez", LocalTime.of(10, 0), LocalTime.of(12, 0), 8, 4, "2024-11-12"));
                insertarReserva(new Reservas(4,"Sanchez", LocalTime.of(11, 0), LocalTime.of(13, 0), 7, 5, "2024-11-12"));
                insertarReserva(new Reservas(5,"Alberto", LocalTime.of(10, 0), LocalTime.of(12, 0), 4, 1, "2024-11-12"));
                insertarReserva(new Reservas(7,"Josafat", LocalTime.of(13, 0), LocalTime.of(15, 0), 3, 2, "2024-11-12"));
                insertarReserva(new Reservas(8,"Neizer", LocalTime.of(18, 0), LocalTime.of(20, 0), 2, 3, "2024-11-12"));
                insertarReserva(new Reservas(9,"Antonio", LocalTime.of(14, 0), LocalTime.of(16, 0), 5, 4, "2024-11-12"));
                insertarReserva(new Reservas(10, "Isaí", LocalTime.of(12, 0), LocalTime.of(14, 0), 3, 5, "2024-11-12"));
                insertarReserva(new Reservas(11,"Sinaí", LocalTime.of(17, 0), LocalTime.of(19, 0), 2, 6, "2024-11-12"));
                insertarReserva(new Reservas(12,"Armando", LocalTime.of(11, 0), LocalTime.of(13, 0), 4, 7, "2024-11-12"));
                insertarReserva(new Reservas(13,"Rojas", LocalTime.of(20, 0), LocalTime.of(22, 0), 6, 8, "2024-11-12"));

                System.out.println("Reservas base insertadas correctamente.");
            } 
        } catch (SQLException e) {
            System.err.println("Error al verificar o insertar reservas base: " + e.getMessage());
        }
    }



    // Agregar cliente a espera (pila) en memoria y base de datos
    public void agregarAEspera(ClientePila clientePila) {
        pilaEspera.push(clientePila.getNombreCliente());
        String insertSQL = "INSERT INTO  clientes_espera (nombre_cliente, tiempo_espera) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, clientePila.getNombreCliente());
            pstmt.setInt(2, clientePila.getTiempoEspera());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al agregar a la espera: " + e.getMessage());
        }
    }

    // Método para obtener todas las reservas
    public List<Reservas> obtenerReservas() {
        List<Reservas> listaReservas = new ArrayList<>();
        String selectSQL = "SELECT * FROM reservas ORDER BY fecha_reserva ASC, hora_reserva ASC ";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre_cliente");
                LocalTime horaReserva = LocalTime.parse(rs.getString("hora_reserva")); // Convertir cadena a LocalTime
                LocalTime horaFin = LocalTime.parse(rs.getString("hora_fin")); // Nuevo campo
                int numeroPersonas = rs.getInt("numero_personas");
                int numeroMesa = rs.getInt("numero_mesa");
                String fecha = rs.getString("fecha_reserva");

                Reservas reserva = new Reservas(id, nombre, horaReserva, horaFin, numeroPersonas,numeroMesa, fecha);
                listaReservas.add(reserva);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener las reservas: " + e.getMessage());
        }
        return listaReservas;
    }

    // Método para obtener todas las mesas
    public List<Reservas> obtenerMesas() {
        List<Reservas> listaMesas = new ArrayList<>();
        String selectSQL = "SELECT * FROM reservas ORDER BY numero_mesa ASC, hora_reserva ASC";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            while (rs.next()) {
                int numeroMesa = rs.getInt("numero_mesa");
                LocalTime horaReserva = LocalTime.parse(rs.getString("hora_reserva")); // Convertir cadena a LocalTime
                LocalTime horaFin = LocalTime.parse(rs.getString("hora_fin")); // Nuevo campo
                String fecha = rs.getString("fecha_reserva");
                Reservas mesa = new Reservas(numeroMesa, horaReserva, horaFin, fecha);
                listaMesas.add(mesa);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener las mesas: " + e.getMessage());
        }
        return listaMesas;
    }




    // Atender cliente en espera (de pila) desde memoria y base de datos
    public ClientePila atenderEspera() {
        // Cargar la espera en memoria (pila)
        Stack<ClientePila> pilaEspera = cargarEsperaEnMemoria();

        // Verificar si la pila no está vacía
        if (!pilaEspera.isEmpty()) {
            // Obtener el cliente a atender (lo eliminamos de la pila)
            ClientePila clienteAtendido = pilaEspera.pop();

            // Eliminar el cliente de la base de datos
            String deleteSQL = "DELETE FROM clientes_espera WHERE id = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                pstmt.setInt(1, clienteAtendido.getId());  // Usamos el ID del cliente
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.err.println("Error al atender espera: " + e.getMessage());
            }

            // Retornar el cliente atendido (eliminado de la pila y base de datos)
            return clienteAtendido;
        } else {
            // Si la pila está vacía, retornar null (sin clientes para atender)
            return null;
        }
    }

    // Método para cargar los clientes en espera y devolver el Stack de ClientePila
    public Stack<ClientePila> cargarEsperaEnMemoria() {
        Stack<ClientePila> pilaEspera = new Stack<>();

        String selectSQL = "SELECT id, nombre_cliente, tiempo_espera, fecha_entrada FROM clientes_espera ORDER BY fecha_entrada DESC";

        try (Statement stmt = conn.createStatement();

             ResultSet rs = stmt.executeQuery(selectSQL)) {

            while (rs.next()) {
                // Recuperar los datos de cada cliente
                int id = rs.getInt("id");
                String nombreCliente = rs.getString("nombre_cliente");
                int tiempoEspera = rs.getInt("tiempo_espera");
                LocalDate fechaEntrada = LocalDate.parse(rs.getString("fecha_entrada"));

                // Crear el objeto ClientePila con los datos obtenidos
                ClientePila cliente = new ClientePila(id, nombreCliente, tiempoEspera, fechaEntrada);

                // Añadir el objeto ClientePila al Stack
                pilaEspera.push(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar espera: " + e.getMessage());
        }
        return pilaEspera;
    }


    // Método para cargar reservas en memoria (FIFO)
    private Queue<Reservas> cargarReservasEnMemoria() {
        Queue<Reservas> colaReservas = new LinkedList<>();
        String selectSQL = "SELECT id, nombre_cliente, hora_reserva, hora_fin, numero_mesa, numero_personas, fecha_reserva FROM reservas ORDER BY id ASC";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombreCliente = rs.getString("nombre_cliente");
                LocalTime horaReserva = LocalTime.parse(rs.getString("hora_reserva"), DateTimeFormatter.ofPattern("HH:mm"));
                LocalTime horaFin = LocalTime.parse(rs.getString("hora_fin"), DateTimeFormatter.ofPattern("HH:mm"));
                int numeroMesa = rs.getInt("numero_mesa");
                int numeroPersonas = rs.getInt("numero_personas");
                String fechaReserva = rs.getString("fecha_reserva");

                // Crear objeto de reservas con todos los datos
                Reservas reserva = new Reservas(id, nombreCliente, horaReserva, horaFin, numeroPersonas, numeroMesa, fechaReserva);
                colaReservas.add(reserva);
            }
        } catch (SQLException e) {
            System.err.println("Error al cargar reservas: " + e.getMessage());
        }
        return colaReservas;
    }

    // Método para atender la primera reserva en la cola
    public Reservas atenderReserva() {
        Queue<Reservas> colaReservas = cargarReservasEnMemoria();

        // Verificar si la cola no está vacía
        if (!colaReservas.isEmpty()) {
            Reservas reservaAtendida = colaReservas.poll(); // Obtener y eliminar la primera reserva

            String deleteSQL = "DELETE FROM reservas WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                pstmt.setInt(1, reservaAtendida.getId());
                pstmt.executeUpdate();
                System.out.println("Reserva atendida y eliminada: " + reservaAtendida.getNombreCliente());
            } catch (SQLException e) {
                System.err.println("Error al atender la reserva: " + e.getMessage());
            }
            return reservaAtendida; // Devolver la reserva atendida
        } else {
            System.out.println("No hay reservas en la cola.");
            return null;
        }
    }


    // Cerrar la conexión (opcional)
    public void cerrarConexion() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}