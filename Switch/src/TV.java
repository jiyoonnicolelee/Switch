
public class TV implements Switchable {

	boolean on;
	public TV(){	
	}

	public void On (){
		this.on = !this.on;
		if (this.on == true){
		System.out.println("TV is turned on.");
		}
		else{
			System.out.println("TV is turned off");
			}
		}
	}