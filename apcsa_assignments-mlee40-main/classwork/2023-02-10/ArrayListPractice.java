import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args){
		ArrayList<String> listStrings = new ArrayList<String>();
		
		listStrings.add("fuschia");
		listStrings.add("sunset orange");
		listStrings.add("lemon pie");
		listStrings.add("baby blue");
		listStrings.add("pearl white");
		System.out.println(listStrings);
		
		//add
		listStrings.add(0, "royal purple");
		System.out.println(listStrings);
		
		//set
		listStrings.set(1, "sage");
		System.out.println(listStrings);
		
		//remove
		listStrings.remove(0);
		System.out.println(listStrings);
		
		//get
		System.out.println(listStrings.get(4));
	}
}
