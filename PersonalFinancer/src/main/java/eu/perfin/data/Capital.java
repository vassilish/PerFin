package eu.perfin.data;

public class Capital extends AbstractPFData{

	private User user;
	private double initialAmount;
	private double currentAmmount;

        public Capital() {
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

	public double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public double getCurrentAmmount() {
		return currentAmmount;
	}
	public void setCurrentAmmount(double currentAmmount) {
		this.currentAmmount = currentAmmount;
	}
	
}
