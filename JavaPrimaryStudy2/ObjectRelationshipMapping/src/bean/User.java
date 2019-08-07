package bean;

/**
 * @PackageName:bean
 * @ClassName: User
 * @Description:
 * @author:Dong
 * @data 7月31-031 19:33
 */
public class User {
    public int id;
    public int age;
    public String uname;
    private String socer;

    public User(){
    }
    public User(int id,int age,String uname){
        this.id = id;
        this.age = age;
        this.uname = uname;
    }

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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
