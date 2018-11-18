package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        throw new SolutionNotImplementedException();
       int total = 0;
        for(String x: skus){
            if (x.equals("A")){
                total += 50;
            }else if (x.equals("B")){
                total += 30;
            }else if (x.equals("C")){
                total += 20;
            }
        }
    }
}
