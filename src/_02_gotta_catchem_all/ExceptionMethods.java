package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	//one
	public Double divide(Double y, Double x){
		except(x);
		Double value = y / x ;
		return value;
		
	}
	
	public static void except(Double no) throws IllegalArgumentException {
		if(no == 0) {
			throw new IllegalArgumentException();
		}
	}
	
	//two
	public String mirror(String str){
		except1(str);
		String back = "";
		for(int i = 0; i < str.length(); i++){
			back += str.substring(str.length()-i, str.length()-i+1);
		}
		return back;
		
	}
	
	public static void except1(String stop) throws IllegalStateException {
		if(stop.length() == 0) {
			throw new IllegalStateException();
		}
	}
}

