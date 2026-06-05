package Assigment.Ques5;

public class Point2D {
	private int x;
	private int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String show() {
		return "(" + x + ", " + y + ")";
	}

	public boolean isEqual(Point2D other) {
		if (other == null) return false;
		return this.x == other.x && this.y == other.y;
	}

	public double calculateDistance(Point2D other) {
		if (other == null) return Double.NaN;
		int dx = this.x - other.x;
		int dy = this.y - other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
