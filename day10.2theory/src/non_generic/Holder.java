package non_generic;

public class Holder {
	// add data member which can hold primitive or any ref type
	private Object ref;

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}
	
	public Object getRef() {
		return ref;
	}

}
