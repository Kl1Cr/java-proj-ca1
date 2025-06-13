/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1;
import javax.swing.JOptionPane;
/**
 *
 * @author Kamal
 */
public class createNewStudents extends addStudent {
   
     public createNewStudents(){
     super();
     }
    
     public void createStudent(){
      String name = JOptionPane.showInputDialog(null,
                "Enter the new student's name:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

        String adminNum = JOptionPane.showInputDialog(null,
                "Enter the new student's admin number:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
        setStudent(name, adminNum);
     }
}
