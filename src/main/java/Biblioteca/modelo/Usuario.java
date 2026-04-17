package Biblioteca.modelo;

public class Usuario {
    private String user = "admin";
    private String password = "1234";

    public boolean login(String user, String pass) {
        return  user.equals(user) && password.equals(pass);
    }
}
