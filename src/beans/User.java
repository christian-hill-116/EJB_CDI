package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Named @ViewScoped @ManagedBean @NotNull @Size(min = 5, max = 15)
public class User {
	public String firstName;
	public String lastName;
	
	public User() {
		firstName = "Christian";
		lastName = "Hill";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}


