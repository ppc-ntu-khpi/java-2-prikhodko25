public class TestResult {

    public static void main(String[] args) {

        int start = 10; 
        int end = 50; 

        String primesList = Exercise.Calculate(start, end);
        System.out.println("Прості числа між " + start + " та " + end + ": " + primesList);
    }
}

