public class recur{
    public static void main(String[] args){
        int x= 0;
        int y= 2;
        int z = Gcd(5);
        System.out.println(z);




    }
    private static int Gcd(int x){

    if(x == 1){
        return 1;
    }
    return x* Gcd(x - 1);

    }
    
}