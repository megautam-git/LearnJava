public class SwapNumber {

    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a"+a+" "+"value of a"+b);
    }
    public static void main(String[] args) {
        SwapNumber.swap(12,34);
    }
}
