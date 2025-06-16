/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CA1;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author Kamal
 */
public class StudentLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<createNewStudents> studentList = new ArrayList<>();
       // ArrayList<>();
        // Initialized 8 default students
        studentList.add(new createNewStudents());
        studentList.get(0).setStudent("Alice Tan", "p2429167");
        studentList.add(new createNewStudents());
        studentList.get(1).setStudent("Bob Lim", "p2427154");
        studentList.add(new createNewStudents());
        studentList.get(2).setStudent("Charlie Ng", "p2423141");
        studentList.add(new createNewStudents());
        studentList.get(3).setStudent("Daisy Koh", "p2427689");
        studentList.add(new createNewStudents());
        studentList.get(4).setStudent("Ethan Wong", "p2429961");
        studentList.add(new createNewStudents());
        studentList.get(5).setStudent("Fiona Lee", "p2429223");
        studentList.add(new createNewStudents());
        studentList.get(6).setStudent("George Tan", "p2427800");
        studentList.add(new createNewStudents());
        studentList.get(7).setStudent("Hannah Sim", "p2420089");

        // TODO code application logic here
        while(true){
       String userOption = JOptionPane.showInputDialog(null, 
                "Enter your option:\n" +
                "1. Student management\n" +
                "2. Books in Library\n" +
                "3. Exit",
                "Mini Library System",
                JOptionPane.QUESTION_MESSAGE);
        
       int option = Integer.parseInt(userOption);
        
        if(userOption == null){
        JOptionPane.showMessageDialog(null, 
                "Program terminated. \nThank You!",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
             break;
        }
        switch (option) {
            case 1:
                boolean isStudentOption = true;
                while(isStudentOption){
                String studentOption = JOptionPane.showInputDialog(null, 
                "Enter your option:\n" +
                "1. Display all students\n" +
                "2. Search students by name\n" +
                "3. Add new student\n"+
                "4. Display total number of students \n" +
                "5. Exit\n",
                "Mini Library System",
                JOptionPane.QUESTION_MESSAGE);
                int student = Integer.parseInt(studentOption);
                if(student==1){
                //To do
                 String displayAllStudents = " ";
                for(int i = 0; i<studentList.size();i++){
                createNewStudents studentObj = studentList.get(i);
                displayAllStudents = displayAllStudents + "Admin No: " + studentObj.getAdminNum() + "\nName: " + studentObj.getName() + "\n\n";
                }
                JOptionPane.showMessageDialog(null,
                                           displayAllStudents,
                                            "Student Management",
                                            JOptionPane.INFORMATION_MESSAGE);
                
                }else if(student==2){
                //Call method or something here
                String searchName = JOptionPane.showInputDialog(null,
                                        "Enter the student's name to search:",
                                        "Search Student",
                                        JOptionPane.QUESTION_MESSAGE);
                                if (searchName == null || searchName.trim().isEmpty()) {
                                    JOptionPane.showMessageDialog(null,
                                            "Search canceled or no name entered.",
                                            "Search Student",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                                String searchResults = "";
                                boolean found = false;
                                for (createNewStudents studentObj : studentList) {
                                    if (studentObj.getName().equalsIgnoreCase(searchName.trim())) {
                                        searchResults += "Admin No: " + studentObj.getAdminNum() + "\nName: " + studentObj.getName() + "\n\n";
                                        found = true;
                                    }
                                }
                                if (found) {
                                    JOptionPane.showMessageDialog(null,
                                            searchResults,
                                            "Search Results",
                                            JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "No student found with name \"" + searchName.trim() + "\".",
                                            "Search Results",
                                            JOptionPane.ERROR_MESSAGE);
                                }
                }else if(student==3){
                //Call method or something here
                createNewStudents newStudent = new createNewStudents();
                                newStudent.createStudent(studentList);
                                if (!newStudent.getName().isEmpty()) {
                                    studentList.add(newStudent);
                                }
                }else if(student==4){
                //Call method or something here 
                JOptionPane.showMessageDialog(null,
                                        "Total number of students: " + studentList.size(),
                                        "Student Management",
                                        JOptionPane.INFORMATION_MESSAGE);
                }else if(studentOption == null){
                isStudentOption = false;
                continue;
                }else if(student==5){
                isStudentOption=false;
                }else{
                JOptionPane.showMessageDialog(null,
                                "Invalid option. Please try again.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                }
                }
                break;
            case 2:
                //To do code ah boy thompson
                break;
             case 3:
                    JOptionPane.showMessageDialog(null,
                        "Program terminated.\nThank you!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
             default:
                    JOptionPane.showMessageDialog(null,
                        "Invalid option. Please try again.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                    break;
        }
    }
    }
    
}

