package human10;

import java.util.Iterator;

public class ExitExam {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager(){
			public void checkExit ( int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
				
				//System.exit 메서드가 실행되면 checkExit이 자동으로 호출됨.
				//checkExit이 정삭적으로 끝나면 JVM이 자동적으로 동작됨.
				//0~4까지는 checkExit이 정상 작동 하지 않으므로(Exception이 발생하므로) JVM이 끝나지 않음.
				//5일때 자동종료됨.
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
