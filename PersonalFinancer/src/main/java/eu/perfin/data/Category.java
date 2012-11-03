package eu.perfin.data;

import java.util.ArrayList;
import java.util.List;

public class Category extends AbstractPFData{

	private User user;
	private String type;
       

        public Category(){}

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }


        public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
