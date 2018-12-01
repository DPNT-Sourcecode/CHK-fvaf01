package befaster.solutions.CHK;


import java.util.HashMap;
import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
	
	int total;
	
    public Integer checkout(String skus) {
    	
    if(skus.matches("^[A-Z]*$")){ 
    
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
     
     total=0;
     
     items.forEach((k,v)->{
    	   
  	
			if ('A'==k) {

				int numberOfGroupA = v / 5;
				int numberRemainA = v % 5;
				v = v - (numberOfGroupA * 5);
				items.put('A',v);
				total = total + (numberOfGroupA * 200);

				numberOfGroupA = v / 3;
				numberRemainA = v % 3;
				total = total + ((numberOfGroupA * 130) + (numberRemainA * 50));
			}

			else if ('B'==k) {	
				Integer Evalue = items.get('E');
				if(Evalue!=null && Evalue>0 )
				{
				 int numberOfGroupE = Evalue / 2;
				 v=v-numberOfGroupE;
				 items.put('B',v);
				}
				 int numberOfGroupB = v / 2;
				 
				 int numberRemainB = v % 2;
				
				total = total + ((numberOfGroupB * 45) + (numberRemainB * 30));

			}

			
			else if ('C'==k) {
				total = total +(v*20);

			}

			else if ('D'==k) {
				total = total +(v*15);

			}
			
			else if ('E'==k) {

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
				total = total +(v* 20);

			}

			else if ('H'==k) {
				
				
				int numberOfGroupH = v / 10;
				int numberRemainH = v % 10;
				v = v - (numberOfGroupH * 10);
				items.put('H',v);
				total = total + (numberOfGroupH * 80);

				numberOfGroupH = v / 5;
				numberRemainH = v % 5;
				total = total + ((numberOfGroupH * 45) + (numberRemainH * 10));


			}

			else if ('I'==k) {
				total = total +(v*35);
			}

			else if ('J'==k) {
				total = total +(v*60);
			}

			else if ('K'==k) {
				
				int numberOfGroupK = v / 2;
				int numberRemainK = v % 2;
				total = total + ((numberOfGroupK * 120) + (numberRemainK * 70));


			}

			else if ('L'==k) {
				total = total +(v*90);
			}

			else if ('M'==k) {
				
				
				Integer Nvalue = items.get('N');
				if(Nvalue!=null && Nvalue>0 )
				{
			     int numberOfGroupN = Nvalue / 3;
				 v=v-numberOfGroupN;
				 items.put('M',v);
				}
				total = total +(v*15);
			}

			else if ('N'==k) {
			    total = total + (v * 40);	
				
			}

			else if ('O'==k) {
				total = total +(v*10);
			}

			else if ('P'==k) {
				
				int numberOfGroupP = v / 5;
				int numberRemainP = v % 5;
				
				total = total + ((numberOfGroupP * 200) + (numberRemainP * 50));

			}

			else if ('Q'==k) {
				
				Integer Rvalue = items.get('R');
				if(Rvalue!=null && Rvalue>0 )
				{
			    int numberOfGroupR = Rvalue / 3;
				 v=v-numberOfGroupR;
				 items.put('Q',v);
				}
				int numberOfGroupQ = v / 3;
				int numberRemainQ = v % 3;
				total = total + ((numberOfGroupQ * 80) + (numberRemainQ * 30));
				
			}

			else if ('R'==k) {
				
				total = total + (v * 50);
			}

			else if (('S'==k) || ('T'==k) || ('X'==k) || ('Y'==k)|| ('Z'==k)){
				Integer Svalue = items.get('S');	
				Integer Tvalue = items.get('T');
				Integer Xvalue = items.get('X');
				Integer Yvalue = items.get('Y');
				Integer Zvalue = items.get('Z');
				if(Svalue!=null &&Tvalue!=null &&Xvalue!=null &&Yvalue!=null && Zvalue!=null)
				{
				int sum = Svalue + Tvalue + Xvalue + Yvalue + Zvalue;
				
				int numberOfGroupsum = sum / 3;
				int numberRemainsum = sum % 3;
				if (sum > 2 ) {
					if (numberRemainsum== 0 && numberOfGroupsum > 0 ) 
						total = total +(numberOfGroupsum* 45);
					else if (numberRemainsum== 1 && numberOfGroupsum > 0 && (Zvalue > 1))
						total = total +(numberOfGroupsum* 45)+ 21;
					else if (numberRemainsum== 1 && numberOfGroupsum > 0 && ((Yvalue > 1)|| ( Svalue > 1)||(Tvalue > 1)))
						total = total +(numberOfGroupsum* 45)+ 20;
					else if (numberRemainsum== 1 && numberOfGroupsum > 0 && ( Xvalue > 1))
						total = total +(numberOfGroupsum* 45)+ 17;
					else if (numberRemainsum== 2 && numberOfGroupsum > 0 && ( Zvalue > 2))
						total = total +(numberOfGroupsum* 45)+ (2*21);
					else if (numberRemainsum== 2 && numberOfGroupsum > 0 && (( Yvalue > 2)||(Svalue > 2)||(Tvalue > 2)))
						total = total +(numberOfGroupsum* 45)+(2* 20);
					else if (numberRemainsum== 2 && numberOfGroupsum > 0 && (Xvalue > 2))
						total = total +(numberOfGroupsum* 45)+(2* 17);
									
				}			
				else
				{	
					if (('S'==k) || ('T'==k) || ('Y'==k)) {
			    	total = total +(v* 20);
			    }else if ('X'==k) {
			    	total = total +(v* 17);
			    }else if ('Z'==k) {
			    	total = total +(v* 21);
			    }
				}
			    }
			
			}
			/*else if ('T'==k) {
				total = total +(v* 20);
			}*/

            else if ('U'==k) {
				
				int numberOfGroupU = v / 4;
				int numberRemainU = v % 4;
				if(numberRemainU==0 && numberOfGroupU>0 )
					total=total+(numberOfGroupU*3*40);
				else 
				total = total + (numberRemainU *40)+(numberOfGroupU*3*40);
				

			}

			else if ('V'==k) {
				
				int numberOfGroupV = v / 3;
				int numberRemainV = v % 3;
				v = v - (numberOfGroupV * 3);
				items.put('V',v);
				total = total + (numberOfGroupV * 130);

				numberOfGroupV = v / 2;
				numberRemainV = v % 2;
				total = total + ((numberOfGroupV * 90) + (numberRemainV * 50));

			}

			else if ('W'==k) {
				total = total +(v* 20);

			}

			/*else if ('X'==k) {
			total = total +(v* 90);
			}

			else if ('Y'==k) {
				total = total +(v* 10);
			}

			else if ('Z'==k) {
				total = total +(v* 50);
			}*/
			/*else {
				total=0;
			}*/
				
	});

		return total;

	} else if(skus.equals(""))
		
	{
		return 0;
	}
    
    else
    {
    	return -1;
    }

}
    
}

