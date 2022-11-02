package JavaPractice_Team105;

public class İnterviev_Question {

    public static void main(String[] args) {

        int input = 45;

        System.out.println("Girdiginiz sayinin ters cevirilmis hali = " + reverseNumber(input));

    }

    public static int reverseNumber(int input) {

        int reverseNum = 0;

        while(input>0){

            reverseNum = input%10 + reverseNum*10;
            input = input/10;
        }
        return reverseNum;

}}










