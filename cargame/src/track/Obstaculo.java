package track;

public class Obstaculo {
         
    private int tipo;
    private int daño;
    private int tamaño;

    public Obstaculo(tipo);{
        daño = (tipo % 4 + 2) * 3;
        tamaño = tipo % 3 + 1;
    }

}
