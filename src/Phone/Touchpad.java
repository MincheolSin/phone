package Phone;

class Touchpad {
	private String name;
	private String performance;
	Touchpad(String name, String performance){
		this.name = name;
		this.performance = performance;
	}
	void print() {
		System.out.println("터치패드 이름 : "+name + "\n터치패드 성능 : "+performance);
	}
}
