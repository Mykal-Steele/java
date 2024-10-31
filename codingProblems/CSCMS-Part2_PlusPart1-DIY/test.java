import java.time.LocalTime;
public class test{
    public static void main(String[] args) {
        
        
        String x = "";
        char[] targer = {'H', 'e','l','l','o', '_', 'W','o','r','l','d', '!'};
        char cur = '0';
        int index = 0;
        
        for(int i = 0; i <targer.length; i++){
            
            while(cur <= targer[index]){
                if(cur == targer[i]){
                    break;
                }
                cur++;
                System.out.println(x + (char) cur);
                
                try{
                    Thread.sleep(5);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                
                
            }
            x+=cur;
            cur = '0';
            index++;
        }
        
       
    }
}