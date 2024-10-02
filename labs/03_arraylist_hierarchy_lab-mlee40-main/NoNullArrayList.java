import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
	public NoNullArrayList(){
		super();
	}
	public NoNullArrayList(int initialCapacity){
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
	public boolean add(T element) throws IllegalArgumentException{
		if(element.equals(null)){
			throw new IllegalArgumentException("A null cannot be added");
		}
		else{
			return super.add(element);
		}
	}
	public T set(int i, T element) throws IllegalArgumentException{
		if(element.equals(null)){
			throw new IllegalArgumentException("A null cannot be added");
		}
		else{
			return super.set(i, element);
		}
	}
}
