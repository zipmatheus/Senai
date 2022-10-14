package exemplos;

import java.util.Scanner;

public class Calculadora {
	
    public static void main(String[] args) {
    	
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a operação");
        String operador = ler.nextLine();
        System.out.println("Digite 1 numero");
        double n1 = ler.nextDouble();
        System.out.println("Digite 1 numero");
        double n2 = ler.nextDouble();
        double r = 0;
        ler.close();
        switch (operador) {
            case "+":
                r = n1 + n2;
                break;
            case "-":
                r = n1 - n2;
                break;
            case "*":
                r = n1 * n2;
                break;
            case "/":
                r = n1 / n2;
                break;
            default:
                break;
        }
        System.out.println("Resultado = " + r);
    }

}
