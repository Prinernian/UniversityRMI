package it.workStation.interfaces;

import it.workStation.model.Transcript;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.text.ParseException;

public interface TranscriptService extends java.rmi.Remote{
    public Transcript getTranscript(String studentId) throws java.rmi.RemoteException, MalformedURLException, NotBoundException, ParseException;
}