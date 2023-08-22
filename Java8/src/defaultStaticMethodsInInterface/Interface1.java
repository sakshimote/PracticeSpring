package defaultStaticMethodsInInterface;

public interface Interface1 {

	default void methodA(){
		System.out.println("method a"+Interface1.class);
	}
}
