package Assignment;

public class CurrencyConverterArray {

    int[] currencies;

    public void setCurrencies(int[] currencies){
        this.currencies=currencies;
    }

    public double getExchangeRate(int arrayIndex){
        return currencies[arrayIndex];
    }

    public double computeTransferAmount(int arrayIndex, double amount){
        return getExchangeRate(arrayIndex) * amount;
    }
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

        int[] rates = {63,3,3,595,18,107,2,63};
        CurrencyConverterArray cc = new CurrencyConverterArray();

        cc.setCurrencies(rates);
        cc.printCurrencies();

        double exchangeRate = cc.getExchangeRate(3);
        System.out.println("Exchange Rate: "+ exchangeRate);

        double amount = 1000;
        double v = cc.computeTransferAmount(0, amount);
        System.out.println("Transefer Amount: "+v);
    }
}
