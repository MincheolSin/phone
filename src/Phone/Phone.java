package Phone;

import Phone.Board.Board;

public class Phone {
	public Battery battery = new Battery("배터리1",25);
	public Board board = new Board("cpu1",4,"gpu1",128,"ram1",16);
	public Frame frame = new Frame("골격1", "노랑");
	public Mic mic = Mic.makeMic("마이크1", "좋은성능"); //
	public Touchpad touch = new Touchpad("터치패드1", "적당한 성능");
	public Display display = new Display("액정1", "18:9");
	public Speaker speaker = new Speaker("스피커1", "적당한 성능");
	
	public void print(Phone phone) {
		
		board.printBoard();
		frame.print();
		mic.print();
		touch.print();
		display.print();
		speaker.print();
		battery.print();
		System.out.println();
	}
	
	public void print(Display display) {
		display.print();
		System.out.println();
		
	}
	public void print(Frame frame) {
		frame.print();
		System.out.println();
	}
	public void print(Battery battery) {
	battery.print();
	System.out.println();
	}
	public void print(Board board) {
	board.printBoard();
	System.out.println();
	}
	public void print(Mic mic) {
	touch.print();
	System.out.println();
	}
	public void print(Speaker speaker) {
		touch.print();
		System.out.println();
	}
	public void print(Touchpad touch) {
		touch.print();
		System.out.println();
	}
	
}
