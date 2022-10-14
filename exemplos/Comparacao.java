package exemplos;

public class Comparacao {
	
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        // operações de comparação !!
        System.out.println("== Operações de Comparação ==");
        System.out.println(x == y); // true or false???
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println("== Operações lógicas ==");
        boolean a = true;
        System.out.println(a && true && 3 < 8);
        boolean vaiTerAula; //??
        boolean diaSemana = true;
        boolean feriado = true;
        vaiTerAula = diaSemana && !feriado;
        System.out.println(vaiTerAula);
        System.out.println(diaSemana == true && feriado == false);

    }

}
