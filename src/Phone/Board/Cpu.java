package Phone.Board;

class Cpu {
	private String name;
	private int size;

	Cpu(String name, int size){
		this.name = name;
		this.size = size;
	}

	public void print() {
		System.out.println("CPU이름 : "+name + "\n코어 : "+size);
	}

}
