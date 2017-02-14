
public class Computer implements Switchable{

	boolean on;
	public Computer(){
	}
	
	public void On (){
		this.on= ! this.on;
		if(this.on==true){
			System.out.println("Computer is turned on.");
		}
		else{
			System.out.println("Computer is turned off");
			}
		}
	}