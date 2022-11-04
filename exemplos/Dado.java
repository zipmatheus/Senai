package exemplos;

import java.util.Random;

public class Dado {
	
    int lados;

    Dado(int lados){
        this.lados = lados;
    }

    public int rolar() {
        Random r = new Random();
        return r.nextInt(1, lados + 1);
    }
}
