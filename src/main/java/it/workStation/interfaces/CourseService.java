package it.workStation.interfaces;

public interface CourseService extends java.rmi.Remote{
    public void getCourse(String courseId) throws java.rmi.RemoteException;
}
