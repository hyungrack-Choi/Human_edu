package human26;

public class Student {
		
	String StudentId;		// 학번
	String StudentName;		// 학생 이름
	String StudentMajor;    // 전공
	
	String[] couresName; //수강신청 과목명
	int[] couresScore;
	//수강신청 점수 ==> 처음에는 0 이었다가. 점수 확정 후 업데이트
	
	public Student(String StudentId, String StudentName, String StudentMajor, String[] couresName) {
	this.StudentId = StudentId;
	this.StudentName = StudentName;
	this.StudentMajor = StudentMajor;
	this.couresName = couresName;
	}
	
	public void setCouresScore(int[] couresScore) {
		this.couresScore = couresScore;
		
	}
	public void showInfo() {
		int sum=0;
		System.out.printf("%s학생의 점수 \n", this.StudentName);
		for(int a=0; a<5; a++) {
			System.out.printf
			("%s : %d \n", this.couresName[a], this.couresScore[a]);
//			sum = sum + this.couresScore[a];
		}
//		System.out.printf("sum = %d \n", sum);
//		System.out.printf("sum = %d \n", sum/5.0); 
		//count++구해서 넣어도됨
	}
}
