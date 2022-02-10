
public class Test {

	public static void main(String[] args) {
		Dragon dragon1 = new Dragon("Rex", 100, false);
		Dragon dragon2 = new Dragon("Protos", 700, true);
		
//		dragon1.name = "Rex"; избавляемся от копипаста
//		dragon1.age = 100;
//		dragon1.isfire = false;
		
//		dragon2.name = "Protos";
//		dragon2.age = 700;
//		dragon2.isfire = true;
		
		System.out.printf("\n%s has %d heads\n", dragon1.name, dragon1.countHeads());
		System.out.printf("\n%s has %d heads\n", dragon2.name, dragon2.countHeads());

	}

}
