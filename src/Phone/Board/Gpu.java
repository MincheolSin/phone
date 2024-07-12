package Phone.Board;

class Gpu {
	private String name;
	private int size;
	void putGpu(String name, int size){
		this.name = name;
		this.size = size;		
	}
	void print() {
		System.out.println("GPU이름 : "+name + "\n용량 : "+size);
	}

}
