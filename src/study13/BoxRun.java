package study13;

class Banana extends Object{}
class Orange extends Object{}
class Hammer extends Object{}

class Box{
	private Object obj = new Object();
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class BoxRun {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Banana());
		box.setObj(new Orange());
		box.setObj(new Hammer());
		
	}
}
