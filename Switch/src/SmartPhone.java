
public class SmartPhone implements Switchable{
	
	boolean on;


	public void On (){
		this.on = true;
		if (this.on == true){
		System.out.println("SmartPhone is turned on.");
	}
		else{
			System.out.println("Smartphone is turned off");
		}
	}
}