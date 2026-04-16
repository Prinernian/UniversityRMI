package it.workStation.impl;

import it.workStation.interfaces.CourseService;
import it.workStation.model.Course;
import it.workStation.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class CourseServiceImpl extends UnicastRemoteObject implements CourseService {
    private final Map<String, Course> courses = new HashMap<>();
    private final Map<String, List<Student>> enrollments = new HashMap<>();
    public CourseServiceImpl() throws Exception {
        super();
        courses.put("1", new Course("1", "Management", "Roger", 23));
        courses.put("2", new Course("2", "CS", "Lion", 11));
        courses.put("3", new Course("3", "AI", "NeuroThing", 17));
    }

    @Override
    public void enrollStudent(Student studentId, String courseId) throws RemoteException {
        if (enrollments.containsKey(courseId)){
            List<Student> stds = enrollments.get(courseId);
            stds.add(studentId);
            enrollments.put(courseId, stds);
        }
        else {
            List<Student> stds = new ArrayList<>();
            stds.add(studentId);
            enrollments.put(courseId, stds);
        }
    }

    @Override
    public List<Student> studentsEnrolled(String courseId) throws RemoteException {
        if (enrollments.containsKey(courseId)){
            return enrollments.get(courseId);
        }
        return List.of();
    }

    @Override
    public List<Course> listCourses() throws RemoteException{
        // ArrayList accepts any Collection in its constructor and converts it automatically
        return new ArrayList<>(courses.values());
    }
}