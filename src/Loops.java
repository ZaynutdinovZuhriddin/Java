public class Loops {
    public static void main(String[] args) {


//        String great = "hello world";
//
//        for (int i = 1; i <= 7; i++) {
//            System.out.println(great);
//        }


//        int sum = 0;
//        int n = 1000;
//
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
//            System.out.println(sum);

        // 1000 gacha bolgan juft sonlani yigindisi

//        int sum = 0;
//        int n = 1000;
//
//        for (int i = 1; i <= n; i++) {
//            if (isPrime(i)) {
//                sum = sum + i;
//            }
//        }
//            System.out.println(sum);
//    }
//
//    private static boolean isPrime(int number) {
//        //soni tublika tekwiriw
//
//        int count = 0;
//
//        for (int i = 2; i <= number; i++) {
//            if (count % i == 0){
//                count++;
//            }
//        }
//        if (count > 2){
//            return false;
//        }
//        else {
//            return true;
//        }

        int sum  = 0;
        for (int i = 100; i < 1000; i++) {
            if (checkNumber(i)) sum += i;
        }
        System.out.println("summa = " + sum);

    }

    private static boolean checkNumber(int numbers) {
        return false;
    }
}
