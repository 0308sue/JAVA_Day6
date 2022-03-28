package JAVA_06;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void recievedCall();
	default void printLogo() {
		System.out.println("*** Phone ***");
	}
}
 interface MobileInterface extends PhoneInterface{
	 void sendSMS();
	 void recieveSMS();
 }
 interface MP3Interface extends PhoneInterface{
	 void play();
	 void stop();
 }
 class PDA{
	 public int calculate(int x,int y) {
		 return x+y;
	 }
 }
public class InterfaceEx extends PDA implements MobileInterface,MP3Interface {
	public static void main(String[] args) {
		InterfaceEx ex = new InterfaceEx();
		ex.printLogo();
		ex.sendCall();
		ex.recievedCall();
		ex.sendSMS();
		ex.play();
		System.out.println("3+5 = "+ex.calculate(3, 5));
		
	}

	@Override
	public void sendCall() {
		System.out.println("TIMEOUT");
		System.out.println("sendCall");
		
	}

	@Override
	public void recievedCall() {
		System.out.println("recievedCall");
		
	}

	@Override
	public void play() {
		System.out.println("play");
		
	}

	@Override
	public void stop() {
		System.out.println("stop");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("sendSMS");
		
	}

	@Override
	public void recieveSMS() {
		System.out.println("recieveSMS");
		
	}

}
