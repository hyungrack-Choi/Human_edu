package human11.domain.dao.mysql;

import human11.domain.dao.UserInfo;
import human11.domain.dao.UserInfoDao;

public class MySQLDao implements UserInfoDao {

	@Override
	public void insertInfo(UserInfo userinfo) {
		System.out.printf
		("Insert MYSQL ID(%s), PW(%s), NAME(%s) \n"
				, userinfo.getUserId()
				, userinfo.getUserPassword()
				, userinfo.getUserName());
	}

	@Override
	public void deleteInfo(UserInfo userinfo) {
		System.out.printf
		("delete MYSQL ID(%s), PW(%s), NAME(%s) \n"
				, userinfo.getUserId()
				, userinfo.getUserPassword()
				, userinfo.getUserName());		
	}

	@Override
	public void searchInfo(UserInfo userinfo) {
		System.out.printf
		("search MYSQL ID(%s), PW(%s), NAME(%s) \n"
				, userinfo.getUserId()
				, userinfo.getUserPassword()
				, userinfo.getUserName());		
	}

}
