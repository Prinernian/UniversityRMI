package it.workStation.interfaces;
import it.workStation.model.Course;
import it.workStation.model.Student;
import java.util.List;

public interface CourseService extends java.rmi.Remote{
    void enrollStudent(Student studentId, String courseId) throws java.rmi.RemoteException;
    List<Student> studentsEnrolled(String courseId) throws java.rmi.RemoteException;
    List<Course> listCourses() throws java.rmi.RemoteException;
    List<Course> getStudentCourses(String studentId) throws java.rmi.RemoteException;
}
