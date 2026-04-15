package it.workStation;

import it.workStation.impl.StudentServiceImpl;
import it.workStation.interfaces.StudentService;
import it.workStation.model.Student;

import java.rmi.RemoteException;

public class Main {
    static void main() throws RemoteException {

        StudentService studentService = new StudentServiceImpl();
        studentService.registerStudent(new Student("123456789", "Mario", "", 2021));

        }
 }