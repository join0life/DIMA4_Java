package vo;

import java.util.Objects;

public class Emp {
	private Integer empno; // 사원번호
	private String name; // 직원명
	private Integer salary; // 월급
	private String depart; // 부서명
	
	public Emp() {
		super();
	}
	public Emp(Integer empno, String name, Integer salary, String depart) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary + ", depart=" + depart + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(depart, empno, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(depart, other.depart) && Objects.equals(empno, other.empno)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary);
	}
	
	
	
}
