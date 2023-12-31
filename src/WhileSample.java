
public class WhileSample {

    public static void main(String[] args) {
        int num = 2000; //初期値設定
        
        do {
            
            num = num * 2 ;
            
            System.out.println(num);
            
        } while(num < 1024) ;
    }

}
