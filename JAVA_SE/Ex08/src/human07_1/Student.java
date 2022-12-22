package human07_1;

import human04_2.Member;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return id + this.name.hashCode();
	}
	public boolean equals(Object obj) {
		//Object obj = new Student(1, "강현준");
		//자동타입변환.
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(this.id == st.id && this.name.equals(st.name)) {
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
