public class recur{
    public static void main(String[] args){
        int x= 0;
        int y= 2;
        int z = Gcd(x,y);



    }
    private static int Gcd(int x,int y){

        if(x%y == 0) return y;
        else
            return Gcd(y,x&y);
    }
    
}