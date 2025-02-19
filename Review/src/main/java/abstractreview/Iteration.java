package abstractreview;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<String>();
		s.add("blue");
		s.add("green");
		s.add("pink");
		s.add("white");
		System.out.println(s);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(s);
		
	}
		
}

