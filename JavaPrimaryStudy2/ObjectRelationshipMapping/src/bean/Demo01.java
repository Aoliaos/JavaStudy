package bean;

/**
 * @PackageName:bean
 * @ClassName: Demo01
 * @Description:
 * @author:Dong
 * @data 7月31-031 19:29
 */
public class Demo01 {
    public static void main(String[] args){
        String path = "bean.User";
        try{
            Class<?> clazz = Class.forName(path);
            System.out.println(clazz);
            System.out.println(clazz.hashCode());

            Class strClazz = String.class;
            Class strClazz2 = path.getClass();
            System.out.println(strClazz==strClazz2);

        }catch(Exception e){
            e.printStackTrace();
        }
        }
}
