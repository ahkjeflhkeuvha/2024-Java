
public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setColor("red");
		cp.set(2,  4);
		cp.showPoint();
		cp.showColorPoint();
	}

}
