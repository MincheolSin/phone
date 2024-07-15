package Phone;

public class Mic {
	private String name;
	private String performance;

	//private static Mic mic = new Mic("", "");

	public Mic(String name, String performance){
		this.name = name;
		this.performance = performance;
	}

	public void print() {
		System.out.println("마이크 이름 : "+name + "\n마이크 성능 : "+performance);
	}

	// public static Mic getInstance() {
	// 	return mic;
	// }
}
