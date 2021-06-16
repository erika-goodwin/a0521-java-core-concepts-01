import org.a0521.phone.GooglePixel;
import org.a0521.phone.Iphone12;
import org.a0521.phone.Phone;

public class Main {

	public static void main(String[] args) {
		
		//GooglePixel gp = new GooglePixel();
		Phone gp = new GooglePixel();
		System.out.println(gp.processor());

		Phone ip12 = new Iphone12();
		System.out.println(ip12.processor());
	}

}
