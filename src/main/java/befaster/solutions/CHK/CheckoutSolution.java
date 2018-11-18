package befaster.solutions.CHK;

import java.util.List;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
       int total = 0;
       int counterA=0;
       int counterB=0;
       char[] items=skus.toCharArray();
        for(char x:items) {   	
           if (x=='A'){
              counterA++;
            }else if (x=='B'){
                counterB++;
            }else if(x=='C'){
                total += 20;
            }
            else if (x=='D'){
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
