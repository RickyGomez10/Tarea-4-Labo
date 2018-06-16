package Operacion;

public class binario implements Operacion {

    @Override
    public int operar(int numero1, int numero2) {
        int numero= 0;
    return numero;
    }

    @Override
    public void operar2(double[] numero1) {

        double[] decimal2 = numero1;
        double binario2 = 0;
        for(int n = 0; n < decimal2.length; n++) {
            binario2 = decimal2[n] % 2;
        }
        System.out.println(binario2);
    }
}
