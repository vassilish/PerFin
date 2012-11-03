package eu.perfin.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User extends AbstractPFData {

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date registrationDate;
        private List<Capital> capitals = new ArrayList<Capital> (0);
        private List<Category> categories = new ArrayList<Category>(0);

        public User() {
        
        }

        public List<Capital> getCapitals() {
            return capitals;
        }

        public void setCapitals(List<Capital> capitals) {
            this.capitals = capitals;
        }

        public List<Category> getCategories() {
            return categories;
        }

        public void setCategories(List<Category> categories) {
            this.categories = categories;
        }
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
}
