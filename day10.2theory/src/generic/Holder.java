package generic;
// generic class definition--containing parameterized type
public class Holder<T> {
	// add data member which can hold primitive or any ref type
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}
	
	public T getRef() {
		return ref;
	}

}
