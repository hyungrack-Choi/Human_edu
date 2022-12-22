package human11.domain.dao.oracle;

import human11.domain.dao.UserInfo;
import human11.domain.dao.UserInfoDao;

public class OracleDao implements UserInfoDao{

	@Override
	public void insertInfo(UserInfo userinfo) {
		System.out.printf
		("Insert Oracle ID(%s), PW(%s), NAME(%s) \n"
				, userinfo.getUserId()
				, userinfo.getUserPassword()
				, userinfo.getUserName());		
	}

	@Override
	public void deleteInfo(UserInfo userinfo) {
		System.out.printf
		("delete Oracle ID(%s), PW(%s), NAME(%s) \n"
				, userinfo.getUserId()
				, userinfo.getUserPassword()
				, userinfo.getUserName());		
	}

	@Override
	public void searchInfo(UserInfo userinfo) {
		System.out.printf
		("Search Oracle ID(%s), PW(%s), NAME(%s) \n"
				, userinfo.getUserId()
				, userinfo.getUserPassword()
				, userinfo.getUserName());		
	}

}
