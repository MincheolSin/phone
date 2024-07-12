package Phone;

class Speaker {
	private String name;
	private String performance;
	Speaker(String name, String performance){
		this.name = name;
		this.performance = performance;
	}
	void print() {
		System.out.println("스피커 이름 : "+name + "\n스피커 성능 : "+performance);
	}
}