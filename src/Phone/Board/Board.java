package Phone.Board;

public class Board{
	
	private Cpu cpu = new Cpu();
	private Gpu gpu = new Gpu();
	private Ram ram = new Ram();
	
	public Board(String cpuname, int cpusize,String gpuname, int gpusize,String ramname, int ramsize) {
		cpu.putCpu(cpuname,cpusize);
		gpu.putGpu(gpuname, gpusize);
		gpu.putGpu(ramname, ramsize);
		
	}
	public void printBoard() {
		cpu.print();
		gpu.print();
		ram.print();
	}

}
