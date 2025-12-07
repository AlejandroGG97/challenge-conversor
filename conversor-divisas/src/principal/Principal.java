package principal;
import conexion.api.ConexionApi;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException{

        ConexionApi conecta = new ConexionApi();
        InterfazU menu = new InterfazU();
        Scanner scan = new Scanner(System.in);

        String base = "";
        String objetivo = "";
        String opcion = "";
        double can = 0.0;
        double rateD = 0.0;
        double resultado = 0;

            menu.inicio();
            base = scan.nextLine();
        System.out.println(base);

            if (base != "salir") {

                    menu.objetivo();
                    objetivo = scan.nextLine();

                    menu.cantidad();
                    can = scan.nextDouble();

                    rateD = conecta.conexion(base, objetivo);

                    resultado = can * rateD;

                    System.out.println("****************************************************");
                    System.out.print(can + " ");
                    System.out.print(base + " EQUIVALE A " + resultado + " ");
                    System.out.println(objetivo);
                    System.out.println("****************************************************");

            }
    }
}
