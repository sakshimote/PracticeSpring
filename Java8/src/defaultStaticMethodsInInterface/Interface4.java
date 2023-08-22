package defaultStaticMethodsInInterface;

public interface Interface4 {
	
	default void methodA(){
		System.out.println("method a"+Interface4.class);
	}
}
