package prototype;

/**
 * @author ydcun 测试类
 */
public class Main {
	public static void main(String[] args) throws Exception {
		//创建第一个建立对象
		Resume resume1 = new Resume();
		resume1.setName("ydcun");
		resume1.setAge(21);
		resume1.setSex("man");
		resume1.setWorkExperience("1991-3-12", "2001-2-12", "home");
		
		//克隆一个简历对象
		Resume resume2 = resume1.clone();
		resume2.setName("ydcuner");
		resume2.setAge(22);
		resume2.setSex("weman");
		resume2.setWorkExperience("2013-3-12", "2013-9-12", "xkj");
		
		//在克隆个简历对象
		Resume resume3 = resume1.clone();
		resume3.setName("Edward Yu");
		resume3.setAge(25);
		resume3.setSex("weman");
		resume3.setWorkExperience("2013-3-12", "2013-9-12", "icssc");
		
		
		System.out.println(resume1);
		System.out.println(resume2);
		System.out.println(resume3);
	}
}
