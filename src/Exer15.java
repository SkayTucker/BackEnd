
public class Exer15 {

	public static void main(String[] args) {
		String text = "1";
		
		int v1 = Integer.parseInt(text);
		System.out.println(v1);

		byte v2 = Byte.parseByte(text);
		System.out.println(v2);
		

		
		short v3 = Short.parseShort(text);
		System.out.println(v3);
		
		float v4 = Float.parseFloat(text);
		System.out.println(text);
		
		double v5 = Double.parseDouble(text);
		System.out.println(v5);
		
		long v6 = Long.parseLong(text);
		System.out.println(text);
		
		
		text = String.valueOf(v1);
		System.out.println(text);
		text = String.valueOf(v2);
		System.out.println(text);
		text = String.valueOf(v3);
		System.out.println(text);
		text = String.valueOf(v4);
		System.out.println(text);
		text = String.valueOf(v5);
		System.out.println(text);
		text = String.valueOf(v6);
		System.out.println(text);
		
	}

}

