package human27;

public class Student {
    String studentId;
	String studentName;
	String studentMajor;
	
	//수강과목과 점수를 배열로 선언했었음.
	//새로운 클래스를 통해서 만들 예정.
	Subject[] sub = new Subject[5];
	//5개의 과목방을 만들어서 과목명과 점수를 관리할수있게끔 만듬
	
	public Student(String studentId, String studentName,
			String studentMajor, String[] couresName) {
		this.studentId = studentId;   
		this.studentName = studentName; 
		this.studentMajor = studentMajor;
		for(int a=0; a<5; a++) {
			sub[a] = new Subject(couresName[a]);
		}
	}
	public void setCouresScore(String couresName, 
			int couresScore) {
		for (int a=0; a<5; a++) {
			if(couresName.equals(sub[a].subjectName)) {
				sub[a].subjectScore = couresScore;
				break;
			}
		}
	}
	public void showInfo(int i) {
		System.out.printf("%s 님의 점수 \n", this.studentName);
		for(int a = 0; a < i; a++) {
			System.out.printf("%s : %d \n"
					, sub[a].subjectName
					, sub[a].subjectScore);
		}
	}
}