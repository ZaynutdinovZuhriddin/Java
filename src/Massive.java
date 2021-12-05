import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {

//        Scanner inp = new Scanner(System.in);
//
//        String[] names = new String[10];
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.print((i + 1) + "- elementini kirirting: ");
//            names[i] = inp.nextLine();
//        }
//        System.out.println(Arrays.toString(names));


//        String[] names = {"samsung", "nokia", "matarola", "iphone", "redmi", "xiaomi", "lg"};
//
//        for (String name :
//                names) {
//            if (!name.equals("matarola") && !name.equals("iphone")) {
//                System.out.println(name);
//            }
//        }



//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("massiv olchamini kiriting: ");
//        int n= inp.nextInt();
//        int[] numbers = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.print((i + 1) + "- elementini kirirting: ");
//            numbers[i] = inp.nextInt();
//        }
//        int sum = 0;
//        for (int number :
//                numbers) {
//            sum += number;
//        }
//        double result = (double) sum / (double) n;
//        System.out.println("orta arifmetik " + result + " ga teng");


        int [][] matrix = new int[5][5];
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = count++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        System.out.println();
        }


    }
}