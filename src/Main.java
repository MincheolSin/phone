import Phone.*;
import Phone.Board.Board;

public class Main {
	public static void main(String[] args) {
		Phone rolipop = new Phone("배터리1",25);
		
		rolipop.print();

		rolipop.setBattery(new Battery("새로운 베터리", 100));
		rolipop.setDisplay(new Display("새로운 디스플레이", "18:9"));

		rolipop.print();

		Phone phone1 = new Phone(new Battery("", 123),
					new Display("", ""),
					new Board("", 1,"", 1, "", 128),
					new Frame("", ""),
					new Mic("", ""),
					new Touchpad("", ""),
					new Speaker("", ""));
		phone1.print();


	}
}
