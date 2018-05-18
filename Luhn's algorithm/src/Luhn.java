import java.security.SecureRandom;

public class Luhn {

	private static SecureRandom random = new SecureRandom();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = generateVoucherCode("EXAM1", "-");
		System.out.println(result);

	}
	
	public static String generateVoucherCode(String category,String delimeter){
		String code ="";
		Integer length;
		Boolean partition;
		if(category.equals("EXAM")){
			length = 10;
			partition = false;
			code = "C1";
		}
		else{
			length = 9;
			partition = true;
		}
		/*
		 * Generate random digits
		 */
		while(code.length() < (length -1)){
			
			code = code+random(0,9);
		}
		//Calculate Sum
		
		Integer sum = 0;
		Integer pos = 0;
		
		String reversedCode = stringReverse(code);
		
		while(pos < (length - 1)){
			Integer odd = reversedCode.charAt(0) * 2;
			if(odd > 9){
				odd -= 9;
			}
			sum += odd;
			if(pos != (length - 2)){
				sum = sum + reversedCode.charAt(pos + 1);
			}
			pos += 2;
		}
		// Calculate check digit
		
		Double checkDigitDouble = (((Math.floor((sum/10)) + 1) * 10 - sum) % 10);
		Integer checkDigit = checkDigitDouble.intValue();
		code = code + checkDigit;
		if(partition){
			return filter(code);
		}
		else{
			return code;
		}
		
		
	}
	/**
	 * Generate random digits between intervals
	 * @param min
	 * @param max
	 * @return generated random integer
	 */
	public static Integer random(Integer min, Integer max) {
		int i = random.nextInt(max - min) + min;
	    return i;
	
	 }
	
	/**
	 * Generate reverse of string
	 * @param str
	 * @return reversed string
	 */
	public static String  stringReverse (String str){
		
		StringBuilder string = new StringBuilder();
		string.append(str);
		String result = string.reverse().toString();
		return result;
	}
	
	public static String filter(String str){
		StringBuilder string = new StringBuilder(str);
			string.insert(3, "-");
			string.insert(7, "-");
		String result = string.toString();
		return result;
	}


}
