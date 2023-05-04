package Utils;

import java.sql.*;

public class Maconnexion {

    private static String url = "jdbc:mysql://localhost:3306/gamegalaxy";
    private static String login = "root";
    private static String pwd = "";

    static Maconnexion instance = null;
    private Connection cnx;

    private Maconnexion() {
        try {
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connexion établie!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static Maconnexion getInstance() {
        if (instance == null) {
            instance = new Maconnexion();
        }
        return instance;
    }

    public Connection getConnection() {
        return cnx;
    }
}
