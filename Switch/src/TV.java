
public class TV implements Switchable {

	boolean on;

	public void On (){
		this.on = true;
		if (this.on == true){
		System.out.println("TV is turned on.");
	}
		else{
			System.out.println("TV is turned off");
			}
		}
	}