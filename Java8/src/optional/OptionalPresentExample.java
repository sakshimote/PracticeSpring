package optional;

import java.util.Optional;

public class OptionalPresentExample {
	

	public static void main(String[] args) {
		Optional<String> opt=Optional.ofNullable("heelllo");
		
		System.out.println(opt.isPresent());
		
		opt.ifPresent(s->System.out.println(s));
		
	}

}
