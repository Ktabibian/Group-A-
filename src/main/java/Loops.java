public class Loops {
    //Q1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }
    //Q2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
    //Q3
    public static String getFirstElement(String[] names) {
        return names[0];
    }
    //Q4
    public static String getLastElement(String[] names) {
        return names[5];
    }
    //Q5
    public static String getSecondToLastElement(String[] names) {
        return names[4];
    }
    //Q6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int value : ints){
            sum += value;
        }
        return sum;
    }
    //Q7
    public static int getAverage(int[] ints) {
        double sum = 0;
        int i = 0;
        while (i < ints.length) {
            sum += ints[i];
            i++;
        }
        double average = (sum / ints.length);
        return (int) average;
    }
    //Q8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumbers = "";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                oddNumbers = oddNumbers + String.valueOf(numbers[i]) + " ";
            }
        }
        return oddNumbers;
    }
    //Q9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbers = "";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenNumbers = evenNumbers + String.valueOf(numbers[i]) + " ";
            }
        }
        return evenNumbers;
    }
    //Q10
    public static boolean contains(String[] names, String element) {
        for(String n : names){
            if(element == n){
                return true;
            }
        }
        return false;
    }
    //Q11
    public static int getIndexByElement(String[] names, String element) {
        for(int i = 0; i < names.length; i++){
            if(names[i] == element){
                return i;
            }
        }
        return -1;
    }
    //Q12
    public static void printOddNumbersInRange(int start, int end){
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    //Q13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String good = str.repeat(n);
        return good;
    }
    //Q14
    public static String repeatFirstThreeLetters(String str, int n) {
        String bad = "";
        if(n >= 3){
            System.out.println(str.substring(0,3));
        }else if(n == 1){
            System.out.println(str.charAt(n) + "##");
        }else{
            System.out.println("###");
        }
        return bad;
    }
    //Q15
    //Write a java method to count all the words in a string
    public static int wordsInAStringCounter(String str){
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] names = {"How", "Do", "I", "Code", "This", "Shit"};
        int[] numbers = {2, 3, 6, 9, 10};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));
        System.out.println(contains(names, "Balls"));
        System.out.println(getIndexByElement(names, "This"));
        printOddNumbersInRange(2, 10);
        System.out.println(printGivenStringTimesNumberGiven("Balls ", 3));
        System.out.println(repeatFirstThreeLetters("Difficult", 3));
        System.out.println(wordsInAStringCounter("I finally finished my flipping work"));
    }
}
