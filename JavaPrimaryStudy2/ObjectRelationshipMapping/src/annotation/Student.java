package annotation;

/**
 * @PackageName:annotation
 * @ClassName: Student
 * @Description:
 * @author:Dong
 * @data 7月31-031 17:50
 */
@doTable("tb_student")
public class Student {

    @doFiled(columnName="id", type="int",length=10)
    private int id;
    @doFiled(columnName="sname", type="varchar",length=20)
    private String studentName;
    @doFiled(columnName="id", type="int",length=3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
