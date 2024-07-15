package Phone;

public class Touchpad {
	private String name;
	private String performance;

	public Touchpad(String name, String performance){
		this.name = name;
		this.performance = performance;
	}

	public void print() {
		System.out.println("터치패드 이름 : "+name + "\n터치패드 성능 : "+performance);
	}
}
