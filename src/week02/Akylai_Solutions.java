package week02;

public class Akylai_Solutions {
    public static void main(String[] args) {
consecutiveNum(17);
swapNum(10,3);


    }



    public static void consecutiveNum(int n){

        for (int i = 1; i <= n ; i++) {

            if(i%2==0){
                System.out.print("Codility");
            }
            if(i%3==0){
                System.out.print("Test");
            }
            if(i%5==0){
                System.out.print("Coders");
            }

            if(!(i%2==0) && !(i%3==0) && !(i%5==0)){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void swapNum(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
    }
}
