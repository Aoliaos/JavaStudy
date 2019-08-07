package testjavassist;

/**
 * @PackageName:testjavassist
 * @ClassName: Emp
 * @Description:
 * @author:Dong
 * @data 8月1-001 17:26
 */
@Author(name ="dong",year = 2008)
public class Emp {
    private int empno;
    private String ename;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
