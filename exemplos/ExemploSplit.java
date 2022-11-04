package exemplos;

public class ExemploSplit {
	
    public static void main(String[] args) {
        String[] nome = "Luiz Felipe Freire Maia".split(" ");
        for (String n : nome) {
            System.out.println(n);
        }
        String[] palavra = "SENAI".split("");
        for (String l : palavra) {
            System.out.println(l);
        }

        String frase = "Eu-estou-no senai hoje";
                     // 123456789012345
        System.out.println(frase.substring(3,8).toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.indexOf("senai"));
    }
}
