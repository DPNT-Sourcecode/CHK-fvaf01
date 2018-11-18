package befaster.solutions.CHK;

import java.util.List;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        
       int total = 0;
       int counterA=0;
       int counterB=0;
       int counterE=0;
    
       
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
            else if (x=='E'){
            	counterE++;
               }
            else {
	          return -1;
	         }
        }
        
          //5A offer
            int numberOfGroupA = counterA/5;
            int numberRemainA =  counterA%5;
            counterA=counterA-(numberOfGroupA*5);
            total=total+(numberOfGroupA*200);
            
          //3A offer
            numberOfGroupA = counterA/3;
            numberRemainA =  counterA%3;
            total=total+((numberOfGroupA*130)+(numberRemainA*50));
           
          //E Calculation
            int numberOfGroupE = counterE/2;
            //int numberRemainE=  counterE%2;
            total=total+(counterE*40);
            counterB=counterB-numberOfGroupE;
            
          //B Calculation
            if(counterB>0) {
            int numberOfGroupB = counterB/2;
            int numberRemainB =  counterB%2;
            total=total+((numberOfGroupB*45)+(numberRemainB*30));
            }
            return total;
            
    }    
    
}
