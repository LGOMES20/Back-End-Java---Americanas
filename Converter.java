import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        System.out.println("Informe o número de minutos: ");

        double minutos = teclado.nextDouble();
        double hora = minutos / 60;
        double dia = hora / 24;
        double ano = dia / 365;

        System.out.println("Os minutos informados equivalem a: " + (int)ano + " anos e " + (int)dia + " dias.");

    }
}
