package Collection_Practice;
import java.util.ArrayList;
public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList x = new ArrayList();
		
		x.add(100);
		x.add(200);
		x.add(300);
		System.out.println(x);
		
		ArrayList y = new ArrayList();
		y.add("aaa");
		y.add("bbb");
		y.add("ccc");
		System.out.println(y);
		
		x.addAll(y);
		System.out.println(x);
		System.out.println(y);
	}

}
