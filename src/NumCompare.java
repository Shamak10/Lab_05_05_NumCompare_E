public class NumCompare {
    public static void main(String[] args) {
        double num1 = 20;//Choose the value of number 1
        double num2 = 20;//Choose the value of number 2

        if (num1 == num2) {//If num1 and num2 are equal
            System.out.println(num1 + " and " + num2 + " are equal");//output num1 and num2 are equal
        } else if (num1 < num2) {//If num1 is less than num2
            System.out.println(num1 + " is less than " + num2);//output num1 is less than num2
        } else {
            System.out.println(num2 + " is less than " + num1);//output num2 is less than num1
        }
    }
}
