package Phone;

class Mic {
	private String name;
	private String performance;
	Mic(String name, String performance){
		this.name = name;
		this.performance = performance;
	}
	void print() {
		System.out.println("마이크 이름 : "+name + "\n마이크 성능 : "+performance);
	}
}
