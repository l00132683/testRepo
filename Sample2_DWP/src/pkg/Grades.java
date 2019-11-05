/**
 * 
 */
package pkg;

/**
 * @author Patrick
 *
 */
public class Grades {
	private int studentid = 12345;
	private String moduleid = "DevOps";
	private double grade = 0.0;
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getStudentid() {
		return studentid;
	}
	public String getModuleid() {
		return moduleid;
	}
}
