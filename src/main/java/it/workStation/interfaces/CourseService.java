package it.workStation.interfaces;
import it.workStation.model.Course;
import it.workStation.model.Student;
import java.util.List;

public interface CourseService extends java.rmi.Remote{
    public void enrollStudent(Student studentId, String courseId) throws java.rmi.RemoteException;
    public List<Student> studentsEnrolled(String courseId) throws java.rmi.RemoteException;
    public List<Course> listCourses() throws java.rmi.RemoteException;
    public List<Course> getStudentCourses(String studentId) throws java.rmi.RemoteException;
}
