package it.workStation.interfaces;

public interface GradeService extends java.rmi.Remote{
    public void getGrade(String studentId, String courseId, int grade) throws java.rmi.RemoteException;
}
