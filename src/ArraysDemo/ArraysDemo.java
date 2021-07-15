package ArraysDemo;

public class ArraysDemo {

    public static void main(String[] args) {
        System.out.println("\n Inside Arrays");

//        int[] scores = new int[4]; // method 1
//        scores[0] = 90;
//        scores[1] = 70;
//        scores[2] = 80;
//        scores[3]= 100;
   //      int[] scores = new int[]{90,80,70,100}; // method 2
        int[] scores = {90,80,70,100}; // method 3

        for (int score: scores) {
            System.out.println(score);
        }
        System.out.println("Size of Array: "+scores.length);
    }
}
