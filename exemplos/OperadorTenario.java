package exemplos;

public class OperadorTenario {
	
    public static void main(String[] args) {
        int hora = 12;
        String turno = (hora >= 18) ? "Noite" : "Dia";
        System.out.println(turno);
    }
    
}
