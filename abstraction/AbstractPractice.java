package abstraction;
abstract class Instagram{
	abstract void process();
	abstract void server();
	
}
class PhotoUpload extends Instagram{
	public void process() {
		System.out.println("Uploading");
	}
	void server() {
		System.out.println("photo saved in server");
	}
}
public class AbstractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhotoUpload ph = new PhotoUpload();
		ph.process();
		ph.server();
		
		

	}

}
