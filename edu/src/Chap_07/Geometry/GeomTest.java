package Chap_07.Geometry;

public class GeomTest {
	public static void main(String[] args) {
		Point p = new Point();
		p.addPoint(10, 20);
		p.getPoint();
		System.out.println("길이 : " + p.getLength());
		System.out.println("면적 : " + p.getArea());
	}
}