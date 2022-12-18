import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        float b;
        double c;
        boolean d;
        String s;

        System.out.println("Digite um número inteiro: ");
        a = scan.nextInt();

        System.out.println("Digite um número com 1 casa decimal: " + "Ex.: 1,5 ");
        b = scan.nextFloat();

        System.out.println("Digite um número com duas casas decimais: ");
        c = scan.nextDouble();

        System.out.println("Digite se verdadeiro ou falso: ");
        d = scan.nextBoolean();

        System.out.println("Int = " + a);
        System.out.println("Float = " + b);
        System.out.println("Double = " + c);
        System.out.println("String = " + d);
    }
}
