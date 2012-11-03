package eu.perfin.data;

import eu.perfin.data.AbstractPFData;
import java.util.Date;
import eu.perfin.enums.TransactionTypeEnum;

public class PFTransaction extends AbstractPFData{

	private long categoryId;
	private long capitalId;
	private TransactionTypeEnum type;
	private User user;

        
        public PFTransaction() {
        }

        public long getCapitalId() {
            return capitalId;
        }

        public void setCapitalId(long capitalId) {
            this.capitalId = capitalId;
        }

        public long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(long categoryId) {
            this.categoryId = categoryId;
        }

        public TransactionTypeEnum getType() {
            return type;
        }

        public void setType(TransactionTypeEnum type) {
            this.type = type;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
	
        
}
