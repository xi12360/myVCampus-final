package seu.list.common;

import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable {
    private static final long serialVersionUID = 6424750174292826127L;
    private String Semester;
    private String CourseID;
    private String CourseMajor;
    private String CourseName;
    private String teacherID;
    private String CourseType;
    private String CourseDate;
    private String CoursePeriod;

    public Course(String courseID, String semester, String courseName, String courseMajor, String teacherID, String courseType, String courseDate, String coursePeriod) {
        Semester = semester;
        CourseID = courseID;
        CourseMajor = courseMajor;
        CourseName = courseName;
        this.teacherID = teacherID;
        CourseType = courseType;
        CourseDate = courseDate;
        CoursePeriod = coursePeriod;
    }

    /**
     * 无参构造器
     */

    public Course() {
    }

    public String getCourseDate() {
        return CourseDate;
    }

    public void setCourseDate(String courseDate) {
        CourseDate = courseDate;
    }

    public String getCoursePeriod() {
        return CoursePeriod;
    }

    public void setCoursePeriod(String coursePeriod) {
        CoursePeriod = coursePeriod;
    }

    /**
     * @return 授课学期
     */
    public String getSemester() {
        return Semester;
    }

    /**
     * @param semester 书号
     */
    public void setSemester(String semester) {
        Semester = semester;
    }

    /**
     * @return 课程编号
     */
    public String getCourseID() {
        return CourseID;
    }

    /**
     * @param courseID 课程编号
     */
    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    /**
     * @return 专业
     */
    public String getCourseMajor() {
        return CourseMajor;
    }

    /**
     * @param courseMajor 专业
     */
    public void setCourseMajor(String courseMajor) {
        CourseMajor = courseMajor;
    }

    /**
     * @return 课程名称
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     * @param courseName 课程名称
     */
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    /**
     * @return 授课教师
     */
    public String getTeacherID() {
        return teacherID;
    }

    /**
     * @param teacherID 授课教师
     */
    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    /**
     * @return 课程状态
     */


    /**
     * @param courseState 课程状态
     */


    /**
     * @return 课程类型
     */
    public String getCourseType() {
        return CourseType;
    }

    /**
     * @param courseType 课程类型
     */
    public void setCourseType(String courseType) {
        CourseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Semester='" + Semester + '\'' +
                ", CourseID='" + CourseID + '\'' +
                ", CourseMajor='" + CourseMajor + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", teacherID='" + teacherID + '\'' +
                ", CourseType='" + CourseType + '\'' +
                '}';
    }

    /**
     * @return 课程信息（授课学期，课程编号，专业，课程名称，授课教师，课程状态，课程类型)
     */
    public Vector<String> getContent() {
        Vector<String> courseContents = new Vector<String>();
        courseContents.add(Semester);
        courseContents.add(CourseID);
        courseContents.add(CourseMajor);
        courseContents.add(CourseName);
        courseContents.add(teacherID);
        courseContents.add(CourseType);
        courseContents.add(CourseDate);
        courseContents.add(CoursePeriod);
        return courseContents;
    }

    /**
     * @param content 课程信息
     */
    public void setContent(Vector<String> content) {
        Semester = content.get(1);
        CourseID = content.get(0);
        CourseMajor = content.get(3);
        CourseName = content.get(2);
        teacherID = content.get(4);
        CourseType = content.get(5);
        CourseDate = content.get(6);
        CoursePeriod = content.get(7);
    }
}
