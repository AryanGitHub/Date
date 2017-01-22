
public class PrimesPrime {
	
	int [] primes = new int [10000]; 
    int process = 0;
	int [] data;
	int [] dataManager;
	
	public PrimesPrime (int process){
		if (process <= 100) this.process = process;
		else process = 100;
	}
	
	public void getPrimes (){
		int num = 0;
		int prime = 2;
		int primeController = 0;
		int [] previousdata =  new int [prime -1] ;
		
		while (process > 1){
			
			int keeper = 0;
			
			
			while (keeper < process){
				
				
				if (keeper == 1 || keeper == 0){
					keeper ++;
					continue;
				}
				
				
				previousdata [keeper] = keeper;
				keeper++;
			}
			
			
			while (num <= previousdata.length){
			
				if (num == 1 || num == 0){
				num ++;
				continue;
				}
				if (process % previousdata [num] == 0) {
					break;
			
				}
				else {
					num++;
				}
			
			}
			if (num == previousdata.length){
			primes [primeController] = process;
			primeController++;
			
			}
			process--;
			}
			
			
	}
	
	public int getter (){
		return primes[7];
	}
	
	
	
	public static void main (){
		PrimesPrime aa = new PrimesPrime(10);
		System.out.print(aa.getter());
	}
	
	
	
	
}
