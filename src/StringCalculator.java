public class StringCalculator {
	private int sum;
	
	public int add(String numbersStr) {
		// Returns the sum of the numbers given in numbersStr

		String[] parts = replacer(numbersStr).split(",");
		
		int x = parts.length;
		sum = 0;
		
		while(x > 0) {
		
			sum += Integer.parseInt(parts[x-1]);
			//System.out.println(parts[x-1]);
			
			x--;
			// not yet implemented
		}
		return 0;
	}
	
	public String replacer(String fixThis) {
		String replaced = fixThis.replaceAll("\n", ",");		
		return replaced;
	}
	
	public int returnSum() {
		return sum;
	}
}
