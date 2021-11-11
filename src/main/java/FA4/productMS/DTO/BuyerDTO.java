package FA4.ProductMS.DTO;

public class BuyerDTO {
	
	private String name;
	private String email;
	private String phoneNumber;
	private String password;
	private int isPrivileged;
	private String rewardPoints;
	private String isActive;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsPrivileged() {
		return isPrivileged;
	}
	public void setIsPrivileged(int isPrivileged) {
		this.isPrivileged = isPrivileged;
	}
	public String getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(String rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "BuyerDTO [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password=" + password
				+ ", isPrivileged=" + isPrivileged + ", rewardPoints=" + rewardPoints + ", isActive=" + isActive + "]";
	}
	
	

}
