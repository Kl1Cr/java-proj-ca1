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
        // Create 8 initial students one by one using createStudent

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
                }else if(student==3){
                //Call method or something here
                createNewStudents newStudent = new createNewStudents();
                                newStudent.createStudent(studentList);
                                if (!newStudent.getName().isEmpty()) {
                                    studentList.add(newStudent);
                                }
                }else if(student==4){
                //Call method or something here 
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

