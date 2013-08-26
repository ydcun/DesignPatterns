package prototype;

/**
 * @author ydcun
 *工作履历
 */
public class WorkExperience implements Cloneable{
	private  String startDate;
	private String endDate;
	private String Company;
	
	protected WorkExperience clone() throws CloneNotSupportedException {
		return (WorkExperience) super.clone();
	}
	
	/**  
	 * 获取  startDate  
	 * @return startDate startDate  
	 */
	public String getStartDate() {
		return startDate;
	}
	/**  
	 * 设置  startDate  
	 * @param startDate startDate  
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**  
	 * 获取  endDate  
	 * @return endDate endDate  
	 */
	public String getEndDate() {
		return endDate;
	}
	/**  
	 * 设置  endDate  
	 * @param endDate endDate  
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**  
	 * 获取  company  
	 * @return company company  
	 */
	public String getCompany() {
		return Company;
	}
	/**  
	 * 设置  company  
	 * @param company company  
	 */
	public void setCompany(String company) {
		Company = company;
	}

	
	
	
	
}
