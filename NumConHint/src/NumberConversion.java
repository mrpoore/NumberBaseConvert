import javax.swing.JOptionPane;


public class NumberConversion {

	static String binary = "";
	static int decimal;
	
	public static void main(String[] args) {
	
		String strNbr = "";
		do{strNbr = JOptionPane.showInputDialog("Enter \n"
				+ " 1 to convert from decimal to binary \n"
				+ " 2 to convert from binary to decimal ");
		}while (!(strNbr.charAt(0) == '1' || strNbr.charAt(0) == '2'));
		
		if (strNbr.charAt(0) =='1')
		{
				binary = JOptionPane.showInputDialog("Enter a binary number:");
				decimal = bintodec(binary);
				JOptionPane.showMessageDialog(null, binary + " = " + decimal +" in base 10");
		} else {	
				decimal = Integer.parseInt(JOptionPane.showInputDialog("Enter a decimal numbe:r"));
				binary = dectobin(decimal);
				JOptionPane.showMessageDialog(null, decimal + " = " + binary + " in base 2");
		}
	}
	
	static private int bintodec(String bin)
	{
		return Integer.parseInt(bin, 2);
	}
	
	static private String dectobin(int dec)
	{
		binary = "";
		int exp = 0;
		while (Math.pow(2, exp) <= dec)
			exp++;
		System.out.println(exp);
		
		for (int i = exp-1; i >= 0 ; i--)
		{
			binary = binary + dec / (int)Math.pow(2, i);
			dec %= Math.pow(2, i); 
		}
		System.out.println(binary);
		return binary;
	}
}
