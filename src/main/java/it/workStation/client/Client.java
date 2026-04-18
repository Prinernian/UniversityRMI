package it.workStation.client;

import it.workStation.interfaces.CourseService;
import it.workStation.interfaces.GradeService;
import it.workStation.interfaces.StudentService;
import it.workStation.interfaces.TranscriptService;
import it.workStation.model.Course;
import it.workStation.model.Grade;
import it.workStation.model.Student;
import it.workStation.model.Transcript;

import java.net.MalformedURLException;
import java.rmi.*;
import java.text.ParseException;
import java.time.LocalDate;

public class Client {
    public static void main(String [] args) throws MalformedURLException, NotBoundException, RemoteException, ParseException {
        StudentService stdService = (StudentService) Naming.lookup("rmi://localhost:1099/StudentService");
        Student std = new Student("1121", "Ali Francis Asadnia", "asadniali@gmail.com", 2014);
        Student std1 = new Student("1122", "Pearson Hardman", "p.hardman@gmail.com", 2016);
        Student std2 = new Student("1123", "Terry Garret", "t.garret@gmail.com", 2015);
        Student std3 = new Student("1124", "Oasis Barry", "barrio@gmail.com", 2014);
        stdService.registerStudent(std);
        stdService.registerStudent(std1);
        stdService.registerStudent(std2);
        stdService.registerStudent(std3);

        CourseService crsService = (CourseService)Naming.lookup("rmi://localhost:1099/CourseService");
        Course crs = new Course("1", "Computer Networking", "Marcelloni", 6);
        Course crs1 = new Course("2", "Artificial Intelligence", "Cimino", 12);
        Course crs2 = new Course("3", "Mathematics", "Masteroni", 9);
        crsService.enrollStudent(std, crs.getId());
        crsService.enrollStudent(std1, crs2.getId());
        crsService.enrollStudent(std3, crs1.getId());

        GradeService grdService = (GradeService)Naming.lookup("rmi://localhost:1099/GradeService");
        Grade grd = new Grade(std, crs1, 25, LocalDate.now().toString());
        Grade grd1 = new Grade(std, crs, 23, LocalDate.now().toString());
        Grade grd2 = new Grade(std1, crs1, 28, LocalDate.now().toString());
        Grade grd3 = new Grade(std3, crs2, 24, LocalDate.now().toString());
        grdService.assignGrade(std, crs1, grd.getGrade());   // std + crs1 + grd ✅
        grdService.assignGrade(std, crs, grd1.getGrade());   // std + crs + grd1 ✅
        grdService.assignGrade(std1, crs1, grd2.getGrade()); // std1 + crs1 + grd2 ✅
        grdService.assignGrade(std3, crs2, grd3.getGrade()); // std3 + crs2 + grd3 ✅

        TranscriptService tranService = (TranscriptService) Naming.lookup("rmi://localhost:1099/Transcripts");
        Transcript trs = tranService.getTranscript(std.getId());
        System.out.println(trs);
        System.out.println(trs.getStudent().getName());
        System.out.println(trs.getAverage());
        System.out.println(trs.getDate());



    }
}