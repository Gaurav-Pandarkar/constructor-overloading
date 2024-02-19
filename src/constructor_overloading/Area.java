package constructor_overloading;

public class Area {
	private int length;
	private int width;

	public Area() {
		this.length = 0;
		this.width = 0;
	}

	public Area(int sideLength) {
		this.length = sideLength;
		this.width = sideLength;
	}

	public Area(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int calculateArea() {
		return length * width;
	}

	public static void main(String[] args) {
		Area rectangle1 = new Area();
		Area rectangle2 = new Area(5);
		Area rectangle3 = new Area(3, 4);

		System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
		System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
		System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
	}

}
