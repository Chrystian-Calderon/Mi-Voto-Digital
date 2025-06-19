package logic;

import persistence.ArchivoEstudiante;
import view.Login;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        //login.setLocationRelativeTo(null);
        
        ArchivoEstudiante e = new ArchivoEstudiante();
        e.getVotantes();
    }
}
