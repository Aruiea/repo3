package SIMS.pojo;

import java.io.Serializable;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName Student
 * @Version 1.0
 * @Date 2020/7/3 14:07
 * 学员实体类
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -1344630742454666128L;
    private int StudentId;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int studentId, String name) {
        StudentId = studentId;
        this.name = name;
    }
}
