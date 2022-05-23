public class AverageMethod {
    public static void main(String[] args) {

        double average = averageMethod(3, 6, 13);
        System.out.println("The average is:" + average);

    }

    public static int sumMethod(int sumNum1, int sumNum2, int sumNum3) {
        int sum = sumNum1 + sumNum2 + sumNum3;
        return sum;
    }

    public static double averageMethod(int avrg1, int avrg2, int avrg3){
        double average = sumMethod(avrg1, avrg2, avrg3)/3.0;
        return average;
    }
}
