package Biblioteca.Model;

public class Usuario {
    private String user = "admin";
    private String password = "1234";

    public boolean login(String user, String password){
        return user.equals(user) && password.equals(password);
    }
}
