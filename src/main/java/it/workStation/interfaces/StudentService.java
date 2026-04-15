package it.workStation.interfaces;

public interface StudentService extends java.rmi.Remote{
    public void getStudent(String studentId) throws java.rmi.RemoteException;
}