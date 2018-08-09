package Com.primos;

/**
 *
 * @author Jastur
 */
public class BuscarNumerosPrimos {

    static boolean primo(int x) {
        for (int i = 2; i < ((x / 2) + 1); i++) {
            if ((x % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int count = 0;      //cuenta los numeros primos contados
        int limite = 1000;  //numero hasta donde se buscaran numeros primos
        for (int i = 2; i <= limite; i++) {
            if (i == 2 || ((i % 2) != 0)) {
                if (primo(i)) {
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("Hay " + count + " numeros primos entre los numeros 1 y "+limite);
       
    }

}
