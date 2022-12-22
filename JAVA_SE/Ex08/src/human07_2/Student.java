package human07_2;

import human04_2.Member;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return this.name.hashCode();
		//같은 이름만으로 같은 key라는 것을 인지하게끔 함.
	}
	public boolean equals(Object obj) {
		//Object obj = new Student(1, "강현준");
		//자동타입변환.
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(this.name.equals(st.name)) {
				return true;
			}
		}
		return false;
	}			
}

//{human07.Student@2a0ae52=80
//human07.Student@29f275d=95
//human07.Student@2a0ae52=91
//human07.Student@29ee028=90}
