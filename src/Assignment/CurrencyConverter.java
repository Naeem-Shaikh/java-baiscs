package Assignment;

public class CurrencyConverter {
    int rupee = 63;
    int dirharm = 3;
    int real = 3;
    int chilean_peso = 595;
    int mexican_pese = 18;
    int _yen = 107;
    int $austrlian = 2;
    int dollar;
    int Rupee = 63;

    public void printCurrencies(){
        System.out.println("rupee: "+ rupee);
        System.out.println("dirharm: "+ dirharm);
        System.out.println("real: "+ real);
        System.out.println("chilean_peso: "+ chilean_peso);
        System.out.println("mexican_pese: "+ mexican_pese);
        System.out.println("$austrlian: "+ $austrlian);
        System.out.println("Rupee: "+ Rupee);


    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }

}
