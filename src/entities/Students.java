package entities;
import java.util.Arrays;

public class Students {
   private int roomsToOccupy;
   private String name;
   private String email;
   private int roomToStay;
   private String[] studentNames = new String[10];
   private String[] studentEmails = new String[10];
   private int[] studentsRoom = new int[10];

   public Students() {
   }

   public Students(String name, String email, int roomToStay) {
      this.name = name;
      this.email = email;
      this.roomToStay = roomToStay;
   }

   public int getRoomsToOccupy() {
      return roomsToOccupy;
   }

   public void setRoomsToOccupy(int roomsToOccupy) {
      this.roomsToOccupy = roomsToOccupy;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getRoomToStay() {
      return roomToStay;
   }

   public void setRoomToStay(int roomToStay) {
      this.roomToStay = roomToStay;
   }

   public String getStudentNames(int index) {
      if(index >= 0 && index < this.studentNames.length) {
         return studentNames[index];
      } else {
         System.out.print("Erro");
         return null;
      }
   }

   public void setStudentNames() {
      this.studentNames[this.getRoomToStay()] = this.name;
   }

   public String getStudentEmails(int index) {
      if(index >= 0 && index < this.studentEmails.length) {
         return studentEmails[index];
      } else {
         System.out.print("Erro");
         return null;
      }
   }

   public void setStudentEmails() {
      this.studentEmails[this.getRoomToStay()] = this.email;
   }

   public int getStudentsRoom(int index) {
      if(index >= 0 && index < this.studentsRoom.length) {
         return studentsRoom[index];
      } else {
         System.out.print("Erro");
         return 0;
      }
   }

   public void setStudentsRoom() {
      this.studentsRoom[this.getRoomToStay()] = this.roomToStay;
   }

   @Override
   public String toString() {
      return "Students{" +
         "roomsToOccupy=" + roomsToOccupy +
         ", name='" + name + '\'' +
         ", email='" + email + '\'' +
         ", roomToStay=" + roomToStay +
         ", studentNames=" + Arrays.toString(studentNames) +
         ", studentEmails=" + Arrays.toString(studentEmails) +
         ", studentsRoom=" + Arrays.toString(studentsRoom) +
         '}';
   }
}
