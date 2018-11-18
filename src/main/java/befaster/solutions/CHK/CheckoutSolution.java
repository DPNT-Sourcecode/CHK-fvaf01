package befaster.solutions.CHK;

import java.util.List;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(List<String> skus) {
        
       int total = 0;
       int counterA=0;
       int counterB=0;
        for(String x: skus){
            if (x.equals("A")){
               
               total += 50;
            }else if (x.equals("B")){
                total += 30;
            }else if (x.equals("C")){
                total += 20;
            }
        else if (x.equals("D")){
            total += 15;
        }
            
        
    }
}

