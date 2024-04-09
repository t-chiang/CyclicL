/**
 * TODO description
 */
public   class  Main {
	
	 private void  print__wrappee__Hello  () {
		System.out.print("Hello");
	}

	
	protected void print() {
		print__wrappee__Hello();
		System.out.print(" World!");
	}

	
	public static void main(String[] args){
		new Main().print();
	}


}
