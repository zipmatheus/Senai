package exemplos;

public class IfElse {
	
	public static void main(String[] args) {
        boolean x = true;
        // se sozinho
        if (x) {
            System.out.println("Esse código só é executado se x for true.");
        }
        // se com o senão
        if (x == false) {
            System.out.println("Esse código só é executado se x for false.");
        } else {
            System.out.println("Esse código só é executado se x for true.");
        }
        int n = 2;
        if (n == 2) {
            System.out.println("dois");
        } else if (n == 2) {
            System.out.println("quatro");
        } else {
            System.out.println("nem 2 nem 4");
        }
        //
        if (n == 2) {
            System.out.println("n = 2");
        }
        if (n == 2) {
            System.out.println("na variavel n esta o valor 2");
        }
        String key = "/";
        switch (key) {
            case "+":
                System.out.println("somar");
                break;
            case "-":
                System.out.println("subtrair");
                break;
            case "*":
                System.out.println("multiplicar");
                break;
            case "/":
                System.out.println("dividir");
                break;
            default:
                System.out.println("Não identificado");
                break;
        }
    }

}
