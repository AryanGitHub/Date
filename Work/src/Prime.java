
public class Prime {
 
	int prime [] ;
   public Prime() {
		
	
	}
   public Prime(int [] a) {
		
		prime = a;
		}

	public boolean getPrime(int a){
     int process = 2;
     boolean data = true;
     
     while (a > process ){
    	 
    	 if (a % process == 0 ){
    		 data = false;
    		 break;
    	 }
    	 
    	 
    	 process++;
     }
     if (a == 1 || a == 0 ) data = false;
      return data;
	}
	
	public void getPrimes (int lenght){
		int process = 1; 
		int processArray = 1;
		prime = new int [lenght];
		
		while (process <= lenght)
		{
		prime [0] = 0;
			if (this.getPrime(process)){
				prime[processArray] = process;
				processArray++;
			}
			
			process++;
			
			
		}
	
		
	}
	
	
	
}
