package Date;

public class StingArray {
     String [] data;
     StingArray (String[] input) {
    	 data = input;
     }
     
     
     
     
     public void copyTo (String [] input){
    	input = new String[data.length];
    	int porcess = 0;
    	while(porcess < data.length){
    		input [porcess] = data [porcess];
    		porcess++;
    	}
    	 
     }
     
     public void copyFrom (String [] input){
    	data = new String[input.length];
    	int porcess = 0;
    	while(porcess < data.length){
    		data [porcess] = input [porcess];
    		porcess ++;
    	}
    	 
     }
     
     public String toString (){
    	 
    	int b =0 ;
    			while (b < data.length){
    				return data [b];
    			
    			}
    			return null;
     }
     boolean search(String input){
    	 
    	 
		String[] process = new String[data.length];
		int noofmatch = 0;
		 
		 String[] value;
		 int take;
		 
		 int position[] = new int[2147483];
		 int positionProcess = 0;
		 int processint = 0;
		 int subStart = 1;
		 int SubEnd = 0;
    	 while (process.length == 1){

    		 if (data[processint].substring(subStart, SubEnd).equals(input.substring(subStart, SubEnd)))
    		 {
    			 noofmatch++;
    			 
    			 position[positionProcess] = processint;

    		 }
    		 processint++;
    	/*	 subStart ++;
    		 SubEnd ++;*/
    	 }
		 return (data[processint].substring(subStart, SubEnd).equals(input.substring(subStart, SubEnd)));
    	 
     }
     
     public int search1 (String input){
		
    	 String [] test = new String [0];
    	 int process = 0;
    	 int same =0;
    	 while(process < input.length()-1){
    		 if (process ==0) test = new String [data.length];
    		 // int same =0;
    		  int contiProcess = process;
    		  while (process < input.length()-1) {
    			 if (input.substring(process, process+1).equalsIgnoreCase(data[process].substring(process, process+1))){
    				 same++;
    		 }
    			 process++;
    		 
    		 }
    		  process = contiProcess;
    		  process ++;
    		 
    	 }
    	 
    	 
    	 return same;
		
    	 
     }
     public int totalnum (){
    	 int process = 0;
    	 int sum = 0;
    	 while (process < this.data.length){
    		sum += this.data[process].toString().length() ;
    		process ++;
    	 }
    	 return sum;
     }
     public void searchForever (String input){
    	int processOfString = 0;
    	int searchItems = 0;
    	int storeValue = 0;

    	String [] processedMaterial = new String[this.data.length];
    	
    	
    	while (processOfString < input.length()){
    		
    	
    	 while (searchItems < this.data.length-1){
    		 
    		if (searchItems == data.length - 1) processedMaterial = new String[this.data.length];
    		 
    		 if (data[searchItems].toString().substring(processOfString, processOfString+1).equals(input.substring(processOfString, processOfString+1)))
    		 {
    				 
    				 processedMaterial[storeValue] = data [searchItems];
    				 storeValue++;
    		 }
    		 searchItems++;
    		 
    	 }
    	 
    	 data = processedMaterial;
    	 
    	 processOfString ++;
    	 searchItems =0;
    	 storeValue =0;
    	 
    	 
           }
    	 this.copyFrom(processedMaterial);
 
    	     }
}
