package prototype;

/**
 * @author ydcun
 *简历类
 */
public class Resume implements Cloneable{
	private String name;
	private String sex;
	private int age;
	private WorkExperience workExperience;
	
	
	//打印建立
	public String toString() {
		System.out.println(this.getName()+","+this.getSex()+","+this.getAge());
		if(workExperience!=null)
			System.out.println("工作时间"+workExperience.getStartDate()+"-"+workExperience.getEndDate()+":"+workExperience.getCompany());
		return "";
	}
	//可以进行深度复制
	protected Resume clone() {
		Resume resume = null;
		try {
			resume = (Resume) super.clone();
			resume.setWorkExperience((WorkExperience) this.workExperience.clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return resume;
	}
	
	
	public Resume() {
		workExperience = new WorkExperience();
	}
	/**  
	 * 获取  name  
	 * @return name name  
	 */
	public String getName() {
		return name;
	}
	/**  
	 * 设置  name  
	 * @param name name  
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**  
	 * 获取  sex  
	 * @return sex sex  
	 */
	public String getSex() {
		return sex;
	}
	/**  
	 * 设置  sex  
	 * @param sex sex  
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**  
	 * 获取  age  
	 * @return age age  
	 */
	public int getAge() {
		return age;
	}
	/**  
	 * 设置  age  
	 * @param age age  
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**  
	 * 设置  workExperience  
	 *  
	 */
	public void setWorkExperience(String startDate,String endDate,String company) {
		workExperience.setCompany(company);
		workExperience.setStartDate(startDate);
		workExperience.setEndDate(endDate);
	}

	/**  
	 * 设置  workExperience  
	 * @param workExperience workExperience  
	 */
	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}
	
	
	
	
}
