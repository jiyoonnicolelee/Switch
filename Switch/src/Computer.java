
public class Computer implements Switchable{

	boolean on;

	
	public void On (){
		this.on = true;
		if (this.on == true){
		System.out.println("Computer is turned on.");
		}
		else{
			System.out.println("Computer is turned off.");
			}
		}
	}