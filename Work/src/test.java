
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int [10];  
		Prime aa = new Prime(a);
		aa.getPrimes(100);
		int as = 1;
		while (as >= a.length){
		System.out.print(a[as]);
		as++;
		}
	}

}
