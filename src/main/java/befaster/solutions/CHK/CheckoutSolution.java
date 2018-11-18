package befaster.solutions.CHK;

import java.util.List;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
       int total = 0;
       int counterA=0;
       int counterB=0;
      char[] items=skus.toCharArray();
        for(int i=0;skus.length();i++){
        	
            if (x.equals("A")){
              counterA++;
            }else if (x.equals("B")){
                counterB++;
            }else if (x.equals("C")){
                total += 20;
            }
            else if (x.equals("D")){
            total += 15;
           }
            else {
	          return -1;
	         }
        }
            int numberOfGroupA = counterA/3;
            int numberRemainA =  counterA%3;
            int numberOfGroupB = counterB/2;
            int numberRemainB =  counterB%2;
            
            total=total+((numberOfGroupA*130)+(numberRemainA*50))+((numberOfGroupB*45)+(numberRemainB*30));
            return total;
            
    }    
    
}



