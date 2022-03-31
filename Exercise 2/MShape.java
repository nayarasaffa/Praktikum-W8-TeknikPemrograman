
public class MShape {

	public static void main(String[] args) {
		// Instansiasi Objek
		Shape S1 = new Shape("Blue", true);
		Circle C1 = new Circle(14, "Red", true);
		Rectangle R1 = new Rectangle (2, 10, "Pink", false);
		Square Sq1 = new Square (5);
		
		System.out.println(S1.toString());
		
		System.out.println(C1.toString());
		System.out.println(C1.getArea());
		System.out.println(C1.getPerimeter());
		
		System.out.println(R1.toString());
		System.out.println(R1.getArea());
		System.out.println(R1.getPerimeter());
		
		System.out.println(Sq1.toString());
		System.out.println(Sq1.getArea());
		System.out.println(Sq1.getPerimeter());
	}

}
