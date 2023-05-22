package exceptionhandling;

class InvalidCountryException extends Exception{
	public InvalidCountryException(String message) {
		super(message);
	}
}
public class UserRegistration {
	public void Registeruser(String name, String Countryname) throws InvalidCountryException {
		
		if(!Countryname.equals("India"))
			throw new InvalidCountryException("User outside country cannot be registered");
		else
			System.out.println("Registration done uccessfully");
	}

	public static void main(String[] args) {
		UserRegistration Register = new UserRegistration();

		try {
			Register.Registeruser("Tamil","China");
			
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e.getMessage());
			
		}
	}

}
