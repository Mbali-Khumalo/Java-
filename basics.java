package Sl;
//GETTING A LOOK AT DATA TYPES AND VARIABLES
// short, int, byte, boolean, long, double, float, char, string are all data types
//range, temparature, x, myString, letter, number, type are all variables
public class basis {
    public static void main(String[] args){
        short range;
        range = (byte) 2;
        System.out.println(range);

        boolean is_true = false;
        System.out.println(is_true);

        int x = 10;
        System.out.println(x);

        String myString = "Mbali Khumalo";
        System.out.println(myString);

        char letter = '\u0053';
        System.out.println(letter);
        //char letter prints out any random letter within the unicode

        long scale = -42332200000L;
        System.out.println(scale);

        double number = -42.3;
        System.out.println(number);

        float pun = -42.3f;
        System.out.println(pun);
    }
}

