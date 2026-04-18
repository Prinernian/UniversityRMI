package it.workStation.server;

import it.workStation.impl.TranscriptServiceImpl;
import it.workStation.impl.StudentServiceImpl;
import it.workStation.impl.CourseServiceImpl;
import it.workStation.impl.GradeServiceImpl;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;
import java.time.LocalDate;

public class UniversityServer {
    public static void main(String[] args) throws InterruptedException{
        try {
            // Create an object of the interface
            // implementation class
            System.out.println("server is started ...");
            StudentServiceImpl students = new StudentServiceImpl();
            CourseServiceImpl courses = new CourseServiceImpl();
            GradeServiceImpl grades = new GradeServiceImpl();
            TranscriptServiceImpl transcripts = new TranscriptServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099" + "/StudentService", students);
            Naming.rebind("rmi://localhost:1099" + "/CourseService", courses);
            Naming.rebind("rmi://localhost:1099" + "/GradeService", grades);
            Naming.rebind("rmi://localhost:1099" + "/Transcripts", transcripts);
            Thread.sleep(Long.MAX_VALUE);
        } catch (RemoteException | MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}