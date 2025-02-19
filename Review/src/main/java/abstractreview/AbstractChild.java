package abstractreview;

public class AbstractChild extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj =new AbstractChild();
		obj.display();
		obj.display1();
		obj.display2();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class method");
	}
public void display2()
{
	System.out.println("normal class method");
}
}
