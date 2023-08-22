package defaultStaticMethodsInInterface;

public interface Interface3 extends Interface2 {

	default void methodC(){
		System.out.println("method c");
	}
}
