package testjavassist;

import javassist.*;

import java.io.IOException;

/**
 * @PackageName:testjavassist
 * @ClassName: JavassistTest01
 * @Description:
 * @author:Dong
 * @data 8月1-001 17:28
 */
public class JavassistTest01 {
    public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.makeClass("testjavassist.NewEmp");

        // 创建属性
        CtField f1 = CtField.make("private int empno;",cc);
        CtField f2 = CtField.make("private String ename;",cc);
        cc.addField(f1);
        cc.addField(f2);

        //创建方法
        CtMethod m1 = CtMethod.make("public int getEmpno(){return empno;}",cc);
        CtMethod m2 = CtMethod.make("public String getEname(){return ename;}",cc);
        cc.addMethod(m1);
        cc.addMethod(m2);

        //添加构造器
        CtConstructor constructor = new CtConstructor(new CtClass[]{CtClass.intType,pool.get("java.lang.String")},cc);
        constructor.setBody("{this.empno = empno; this.ename = ename;}");
        cc.addConstructor(constructor);
        cc.writeFile("D:/1JavaCode");
        }
}
