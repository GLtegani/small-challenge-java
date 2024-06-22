import entities.Rent;
import entities.Students;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
//         EX SOLO

//      int[] rooms = new int[10];
//      Students student = new Students();
//      System.out.print("How many rooms will be rented? ");
//      student.setRoomsToOccupy(sc.nextInt());
//
//      sc.nextLine();
//
//      for(int i = 0; i < student.getRoomsToOccupy(); i++) {
//         System.out.printf("Rent #%d: %n", i + 1);
//         System.out.print("Name: ");
//         student.setName(sc.next());
//         sc.nextLine();
//         System.out.print("Email: ");
//         student.setEmail(sc.next());
//         sc.nextLine();
//         System.out.print("Room: ");
//         student.setRoomToStay(sc.nextInt());
//         rooms[student.getRoomToStay()] = student.getRoomToStay();
//
//         student.setStudentNames();
//         student.setStudentEmails();
//         student.setStudentsRoom();
//      }
//
//      sc.nextLine();
//      for(int i = 0; i < rooms.length; i++) {
//         if(rooms[i] != 0) {
//            if(student.getStudentNames(i) != null && student.getStudentEmails(i) != null && student.getStudentsRoom(i) != 0) {
//               System.out.printf("%d: %s, %s %n", rooms[i], student.getStudentNames(i), student.getStudentEmails(i));
//            }
//         }
//      }

//      CORRECTION

      Rent[] rooms = new Rent[10];
      System.out.print("How many rooms will be rented? ");
      int quantity = sc.nextInt();

      for(int i = 0; i < quantity; i++) {
         System.out.println("Rent #" + (i + 1) + ":");
         System.out.print("Name: ");
         sc.nextLine();
         String name = sc.nextLine();
         System.out.print("Email: ");
         String email = sc.next();
         System.out.print("Room: ");
         int roomNumber = sc.nextInt();

         rooms[roomNumber] = new Rent(name, email);
      }

      for(int i = 0; i < rooms.length; i++) {
         if(rooms[i] != null) {
            System.out.printf("%d: %s%n", i, rooms[i]);
         }
      }

      sc.close();
   }
}
