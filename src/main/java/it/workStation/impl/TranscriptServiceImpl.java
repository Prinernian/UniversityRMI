package it.workStation.impl;

import it.workStation.interfaces.TranscriptService;
import it.workStation.model.Course;
import it.workStation.model.Grade;
import it.workStation.model.Student;
import it.workStation.model.Transcript;

import java.net.MalformedURLException;
// accesses to rmiregistry (bind, rebind, lookup, ...) are provided by static
// methods of class below:
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import it.workStation.impl.StudentServiceImpl;
import it.workStation.interfaces.GradeService;
import it.workStation.interfaces.StudentService;
import it.workStation.interfaces.CourseService;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

public class TranscriptServiceImpl extends UnicastRemoteObject implements TranscriptService {
    public TranscriptServiceImpl() throws Exception{
        super();
    }

    @Override
    public Transcript getTranscript(String studentId) throws RemoteException, MalformedURLException, NotBoundException, ParseException {

        StudentService stdService = (StudentService) Naming.lookup("rmi://localhost:1099/StudentService");
        Student std = stdService.getStudent(studentId);

        CourseService crsService = (CourseService)Naming.lookup("rmi://localhost:1099/CourseService");
        List<Course> crs = crsService.getStudentCourses(studentId);


        GradeService grdService = (GradeService)Naming.lookup("rmi://localhost:1099/GradeService");
        List<Grade> grd = grdService.getStudentAllGrades(std);
        double sum = 0;
        for (Grade grade : grd) {
            sum = sum + grade.getGrade();
        }
        double average = sum/grd.size();

        Transcript transcript = new Transcript(std, crs, grd, LocalDate.now().toString(), average);
        return transcript;
    }
}