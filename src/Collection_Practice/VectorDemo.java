package Collection_Practice;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add('A');
		v.add(null);
		System.out.println("Vector elements are ");
		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add('A');
		v.add(null);
		System.out.println("Vector elements are ");
		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
	}
}
}
