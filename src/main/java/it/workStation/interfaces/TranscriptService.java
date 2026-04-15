package it.workStation.interfaces;

import it.workStation.model.Transcript;

public interface TranscriptService extends java.rmi.Remote{
    public Transcript getTranscript(String studentId) throws java.rmi.RemoteException;
}