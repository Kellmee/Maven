package com.model;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    private String batchName;
    private List<Participant> participants;

   
    public Batch(String batchName) {
        this.batchName = batchName;
        this.participants = new ArrayList<>();
    }

    
    public String getBatchName() {
        return batchName;
    }

    
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    
    public void addParticipant(Participant participant) {
        participants.add(participant);
        participant.setBatch(this); 
    }

   
    public void startBatch() {
        System.out.println("Batch " + batchName + " has started!");

        for (Participant participant : participants) {
            participant.receiveBatchStartMessage();
        }
    }
    
}
