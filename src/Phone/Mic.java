package Phone;

class Mic {
	private String name;
	private String performance;
	private Mic(String name, String performance){
		this.name = name;
		this.performance = performance;
	}
	void print() {
		System.out.println("마이크 이름 : "+name + "\n마이크 성능 : "+performance);
	}
	static Mic makeMic(String name, String performance) {
		Mic mic = new Mic(name,performance);
		return mic;
	}
}
