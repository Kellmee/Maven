package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter participant details (name, phone number, email, age) - separate each detail with a comma: ");
        String participantDetails = scanner.nextLine();
        String[] participantDetailsArray = participantDetails.split(",");
        List<Participant> participants = new ArrayList<>();

        for (int i = 0; i < participantDetailsArray.length; i += 4) {
            String name = participantDetailsArray[i].trim();
            String phoneNumber = participantDetailsArray[i + 1].trim();
            String email = participantDetailsArray[i + 2].trim();
            int age = Integer.parseInt(participantDetailsArray[i + 3].trim());

            Participant participant = new Participant(name, phoneNumber, email, age);
            participants.add(participant);
        }

      
        System.out.println("Enter batch name: ");
        String batchName = scanner.nextLine();
        Batch batch = new Batch(batchName);

        
        for (Participant participant : participants) {
            batch.addParticipant(participant);
        }

        
        batch.startBatch();

        
        for (Participant participant : participants) {
            System.out.println("Participant: " + participant.getName() +
                    ", Batch: " + participant.getBatch().getBatchName());
        }

        scanner.close();
    }
}
