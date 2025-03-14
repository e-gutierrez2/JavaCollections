import Vista.Vista;
import java.util.regex.Pattern;
import java.util.Scanner;

public class SapaMercat {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static String respuesta(){
        String r;
        String regex = "^[0-3]$";
        do {
            Vista.mensaje("Introduce un num del 0-3");
            r = Scan.nextLine();
        }
        while (!r.matches(regex));
        return r;
    }
}