
public class SmartPhone implements Switchable{
	
	boolean on;
	public SmartPhone(){
	}

	public void On (){
		this.on = ! this.on;
		if (this.on == true){
		System.out.println("SmartPhone is turned on.");
	}
		else{
			System.out.println("Smartphone is turned off");
			}
		}
	}