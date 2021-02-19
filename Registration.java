import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner input = new Scanner(System.in);

	// First name validation first name starts with Caps
	public void firstNameValidation() {
		System.out.println("Enter your First Name ");
		String firstName = input.next();
		if (Pattern.matches("^[A-Z][A-Za-z]{2,}$", firstName)) {
		} else {
			System.out.println(
					"Invalid format for First Name it should start with minimum One Caps re-enter your first name");
			firstNameValidation();
		}
	}

	// Last name validation last name starts with Caps
	public void lastNameValidation() {
		System.out.println("Enter your last Name ");
		String lastName = input.next();
		if (Pattern.matches("^[A-Z][A-Za-z]{2,}$", lastName)) {
		} else {
			System.out.println(
					"Invalid format for Last Name it should start with minimum One Caps re-enter your last name");
			lastNameValidation();
		}
	}

	// Email validation
	public void emailValidation() {
		System.out.println("Enter your email id: ");
		String email = input.next();
		if (Pattern.matches("^[a-z]{3,}\\@[a-z]*\\.[a-z]*$", email)) {
		} else {
			System.out.println("Invalid email id re-enter your email id");
			emailValidation();
		}
	}

	// Mobile Number Validation
	public void mobileNumberValidation() {
		System.out.println("Enter your mobile number: ");
		String mobileNumber = input.next();
		if (Pattern.matches("^(\\+91)?[6-9]{1}[0-9]{9}$", mobileNumber)) {
		} else {
			System.out.println("Invalid mobile number re-enter your mobile number");
			mobileNumberValidation();
		}
	}

	// password rule one passed of minimum eight characters
	public void passwordRuleOneValidation() {
		System.out.println("Enter your password: ");
		String password = input.next();
		if (Pattern.matches("^[a-z]{8,}$", password)) {
		} else {
			System.out.println("Invalid password format minimum eight characters required for passing rule one");
			passwordRuleOneValidation();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome for Registration");
		Registration validation = new Registration();
		validation.firstNameValidation();
		validation.lastNameValidation();
		validation.emailValidation();
		validation.mobileNumberValidation();
		validation.passwordRuleOneValidation();
	}

}
