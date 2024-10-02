import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
	public OrderedArrayList(){
		super();
	}
	public OrderedArrayList(int initialCapacity){
		super(initialCapacity);
	}
	public void add(int i, T element) throws IllegalArgumentException{
		if(element.equals(null)){
			throw new IllegalArgumentException("A null cannot be added");
		}
		else{
			super.add(i, element);
		}
	}
	public boolean add(T element){
		try{
			for(int i = 0; i < this.size()-1; i++){
				if(this.get(i).compareTo(element) >= 0){
					super.add(i, element);
					return true;
				}
			}
			return super.add(element);
		}
		catch(NullPointerException x){
			return super.add(null);
		}

	}
	public T set(int i, T element){
		this.remove(i);
		this.add(element);
		return element;
	}
}
