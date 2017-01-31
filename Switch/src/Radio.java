
public class Radio implements Switchable{

	boolean on;


	public void On (){
		this.on = true;
		if (this.on == true){
		System.out.println("Radio is turned on.");
	}
		else{
			System.out.println("Radio is turned off");
			}
		}
	}