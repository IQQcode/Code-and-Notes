package displayrandomnumber;

import java.util.Scanner;

public class DisplayRandomNumber {
    
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        int[] List = new int[100];
     
        for(int i = 0; i  < List.length; i++) {
            List[i] =(int) (Math.random() * 100);            
        }
         showList(List);
         
        while(true) {
          
        try {
                   System.out.print("\n\nPlease enter Index : ");
                   int index = input.nextInt();
                   System.out.print("Your display Array index is : " + List[index]);

        }
         catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Out Of Bounds...Your Indes is Error,Please enter agein! ");
                }
        
                     input.nextLine();
      }
      
    }
    
    public static int[] showList(int[ ] showList) {
        
        for(int i : showList) {
             System.out.print(i + "  ");
             if(i % 20 == 0) {
                 System.out.println();
             }
        }
        return showList;
    }
    
}
