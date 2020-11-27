public class Factorial {
    static void findFactorial(int n){
        int i=n;
        int fact=1;
        String num_pattern="";
        do{
           fact*=i;
           if(i>1) {
               num_pattern += i + "*";
           }else{
               num_pattern+=i;
           }
           i--;

        }while (i>0);
        System.out.println("factorial of "+n+"is "+num_pattern+"="+fact);
    }

    public static void main(String[] args) {
        Factorial.findFactorial(8);
    }
}
