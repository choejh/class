package jdbc;

public class jdbcdata {

	private String deptno;
	private String dname;
	private String dloc;

	public jdbcdata() {
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDloc() {
		return dloc;
	}

	public void setDloc(String dloc) {
		this.dloc = dloc;
	}

	@Override
	public String toString() {
		return "jdbcdata [deptno=" + deptno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
}
	