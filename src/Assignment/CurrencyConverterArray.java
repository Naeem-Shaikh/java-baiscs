package Assignment;

public class CurrencyConverterArray {

    int[] currencies = {63,3,3,595,18,107,2,63};
//    int rupee = 63;
//    int dirharm = 3;
//    int real = 3;
//    int chilean_peso = 595;
//    int mexican_pese = 18;
//    int _yen = 107;
//    int $austrlian = 2;
//    int dollar;
//    int Rupee = 63;

    public void printCurrencies(){
        System.out.println("rupee: "+ currencies[0]);
        System.out.println("Dirharm: "+ currencies[1]);
        System.out.println("Real: "+ currencies[2]);
        System.out.println("Chilean Peso: "+ currencies[3]);
        System.out.println("Mexican Pese: "+ currencies[4]);
        System.out.println("Austrlian: "+ currencies[5]);
        System.out.println("Rupee: "+ currencies[6]);


    }

    public static void main(String[] args) {
        CurrencyConverterArray cc = new CurrencyConverterArray();
        cc.printCurrencies();
    }
}
