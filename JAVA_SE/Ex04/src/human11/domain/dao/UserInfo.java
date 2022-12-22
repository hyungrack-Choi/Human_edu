package human11.domain.dao;

public class UserInfo {
	// 1.멤버 변수
	private String userId;
	private String userPassword;
	private String userName;
//	//2.생성자
	public UserInfo(String userId
			, String userPassword
			, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;

	//. 메서드
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
