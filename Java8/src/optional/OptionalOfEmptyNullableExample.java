package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
	
	public static Optional<String> ofNullablee(){
	Optional<String> stringOptional=Optional.ofNullable(null);
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptional=Optional.of("helloo");
			return stringOptional;
		}
	
	public static Optional<String> empty(){
		
		
		return Optional.empty();
	}
	public static void main(String[] args) {
		
		System.out.println(ofNullablee());
		
		System.out.println(of());
		System.out.println(empty());
		
		
	}

}
