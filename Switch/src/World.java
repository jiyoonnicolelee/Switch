import java.util.ArrayList;
public class World {
	public static void main(String[] args){
		ArrayList<Switchable> myList= new ArrayList<>();
		
		myList.add(new Computer());
		myList.add(new TV());
		myList.add(new Radio());
		myList.add(new SmartPhone ());
		
		for(int i=0; i <4; i++){
			myList.get(i).On();
			
		}
	}
}
