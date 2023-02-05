
public class JSample12_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 7;
		int b = 4;
		
		System.out.println(a < 0 && b > 5); //false
		System.out.println(a < 5 && b > 3); //false
		System.out.println(a < 9 && b > 7); //false
		System.out.println(a < 9 && b > 3); //true
		
		System.out.println(a < 0 || b > 5); //false
		System.out.println(a < 5 || b > 3); //true
		System.out.println(a < 9 || b > 7); //true
		System.out.println(a < 9 || b > 3); //true
		
		System.out.println(!(a > 0)); //false
		System.out.println(!(a > 9)); //true
		
	}

}
