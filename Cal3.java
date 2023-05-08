public class Cal3{
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		String operation = args[1];
		int n2 = Integer.parseInt(args[2]);
		if (operation.equals("x")){
			System.out.println(n1 * n2);
		} else if (operation.equals(":")){
			System.out.println(n1 / n2);
		} else if (operation.equals("+")){
			System.out.println(n1 + n2);
		} else if (operation.equals("-")){
			System.out.println(n1 - n2);
		} else{
			System.out.println("HAE???");
		}
	}
}