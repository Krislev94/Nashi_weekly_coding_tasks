package Week02;

public class Behzod_Solutions_Week02 {

    public static void main(String[] args) {

        swap(-19, 10);



    }

    //Swap two variables without using a third variable
    public static void swap(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is " + a + "\nb is " + b);
    }

}
