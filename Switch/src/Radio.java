
public class Radio implements Switchable{

	boolean on;
	public Radio(){
		
	}

	public void On (){
		this.on = !this.on;
		if(this.on==true){
		System.out.println("Radio is turned on.");	
		}
		else{
			System.out.println("Radio is turned off.");
			}
		}
	}