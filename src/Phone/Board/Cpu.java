package Phone.Board;

class Cpu {
	private String name;
	private int size;
	void putCpu(String name, int size){
		this.name = name;
		this.size = size;
	}
	void print() {
		System.out.println("CPU이름 : "+name + "\n코어 : "+size);
	}

}
