public class ExempBreakContinue {
    public static void main(String[] args) {
        for (int x =1; x<=5; x ++){
            if(x ==4 )
                break;
            
            System.out.println(x);
           
      
        }
        System.out.println("...............");
        for (int num =1; num<=5; num ++){
            if(num ==3)
            continue;
            System.out.println(num);
        }
    }
}
