
public class RectanglePlus implements Relatable {
	public int width = 0;
	public int height = 0;

	public RectanglePlus(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}

	public int isLargerThan(Relatable other) {
		RectanglePlus otherRect = (RectanglePlus)other;
		if (getArea() > otherRect.getArea()) {
			return 1;
		} else if (getArea() == otherRect.getArea()) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		RectanglePlus rect1 = new RectanglePlus(3, 4);
		RectanglePlus rect2 = new RectanglePlus(5, 6);

		if (rect1.isLargerThan(rect2) == 1) {
			System.out.println("Rect1 is larger than Rect2");
		} else if (rect1.isLargerThan(rect2) == 0) {
			System.out.println("Rect1 is equal with Rect2");
		} else {
			System.out.println("Rect1 is smaller than Rect2");
		}
	}


}