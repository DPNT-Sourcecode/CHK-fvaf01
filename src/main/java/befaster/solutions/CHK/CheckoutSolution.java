package befaster.solutions.CHK;


import java.util.HashMap;
import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
	
	private static int total=0;
	
    public Integer checkout(String skus) {
    	
    
    HashMap<Character, Integer> items = new HashMap<Character, Integer>();
    
    char[] strArray = skus.toCharArray();
     for (char c : strArray)
      {
       if(items.containsKey(c))
       {
    	   items.put(c, items.get(c)+1);
        }else{
        	items.put(c, 1);
            }
       }
     

     
     items.forEach((k,v)->{
    	
 	
			if ('A'==k) {

				int numberOfGroupA = v / 5;
				int numberRemainA = v % 5;
				v = v - (numberOfGroupA * 5);
				total = total + (numberOfGroupA * 200);

				numberOfGroupA = v / 3;
				numberRemainA = v % 3;
				total = total + ((numberOfGroupA * 130) + (numberRemainA * 50));
			}

			else if ('B'==k) {	
				int numberOfGroupB = v / 2;
				int numberRemainB = v % 2;
				total = total + ((numberOfGroupB * 45) + (numberRemainB * 30));

			}
			
			else if ('C'==k ) {
				total = total + 20;

			}

			else if ('D'==k) {
				total = total + 15;

			}
			
			else if ('E'==k) {

                int numberOfGroupE = v / 2;
				Integer Bvalue = items.get('B');
				if(Bvalue!=null && Bvalue>0 )
				total = total + (v * 40)-(numberOfGroupE*30);
				else
					total = total + (v * 40);
			}

			else if ('F'==k) {

				int numberOfGroupF = v / 2;
				int numberRemainF = v % 2;
				if (numberRemainF == 0)
					total = total + (numberOfGroupF * 10) + 10;
				else
					total = total + ((numberOfGroupF * 10) + (numberRemainF * 10));

			}

			else if ('G'==k) {
				total = total + 20;

			}

			else if ('H'==k) {
				
				
				int numberOfGroupH = v / 10;
				int numberRemainH = v % 10;
				v = v - (numberOfGroupH * 10);
				total = total + (numberOfGroupH * 80);

				numberOfGroupH = v / 5;
				numberRemainH = v % 5;
				total = total + ((numberOfGroupH * 45) + (numberRemainH * 10));


			}

			else if ('I'==k) {
				total = total + 35;
			}

			else if ('J'==k) {
				total = total + 60;
			}

			else if ('K'==k) {
				
				int numberOfGroupK = v / 2;
				int numberRemainK = v % 2;
				total = total + ((numberOfGroupK * 150) + (numberRemainK * 80));


			}

			else if ('L'==k) {
				total = total + 90;
			}

			else if ('M'==k) {
				total = total + 15;
			}

			else if ('N'==k) {
				int numberOfGroupN = v / 3;
				Integer Mvalue = items.get('M');
				if(Mvalue!=null && Mvalue>0 )
				total = total + (v * 40)-(numberOfGroupN*15);
				else
			    total = total + (v * 40);	
				
			}

			else if ('O'==k) {
				total = total + 10;
			}

			else if ('P'==k) {
				
				int numberOfGroupP = v / 5;
				int numberRemainP = v % 5;
				
				total = total + ((numberOfGroupP * 200) + (numberRemainP * 50));

			}

			else if ('Q'==k) {
				int numberOfGroupQ = v / 3;
				int numberRemainQ = v % 3;
				total = total + ((numberOfGroupQ * 80) + (numberRemainQ * 30));

			}

			else if ('R'==k) {
				
				int numberOfGroupR = v / 3;
				Integer Qvalue = items.get('Q');
				if(Qvalue!=null && Qvalue>0 )
				total = total + (v * 50)-(numberOfGroupR*30);
				else
				total = total + (v * 50);
			}

			else if ('S'==k) {
				total = total + 30;
			}

			else if ('T'==k) {
				total = total + 20;
			}

			else if ('U'==k) {
				
				int numberOfGroupU = v / 3;
				int numberRemainU = v % 3;
				if(numberRemainU>0 && numberOfGroupU>0)
			     numberRemainU=numberRemainU-1;
				total = total + (numberRemainU * 40)+(numberOfGroupU*3*40);
				

			}

			else if ('V'==k) {
				
				int numberOfGroupV = v / 3;
				int numberRemainV = v % 3;
				v = v - (numberOfGroupV * 3);
				total = total + (numberOfGroupV * 130);

				numberOfGroupV = v / 2;
				numberRemainV = v % 2;
				total = total + ((numberOfGroupV * 90) + (numberRemainV * 50));

			}

			else if ('W'==k) {
				total = total + 20;

			}

			else if ('X'==k) {
				total = total + 90;
			}

			else if ('Y'==k) {
				total = total + 10;
			}

			else if ('Z'==k) {
				total = total + 50;
			}
			
			else {
				total=-1;
			}

		});

		return total;

	}

}

