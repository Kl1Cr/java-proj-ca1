/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Kamal
 */
public class createNewStudents extends addStudent {
   
     public createNewStudents(){
     super();
     }
     public void createStudent(ArrayList<createNewStudents> studentList) {
        String name = JOptionPane.showInputDialog(null,
                "Enter the new student's name:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Name cannot be empty.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (createNewStudents student : studentList) {
            if (student.getName().equalsIgnoreCase(name.trim())) {
                JOptionPane.showMessageDialog(null,
                        "Student with name \"" + name.trim() + "\" already exists.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        String adminNum = JOptionPane.showInputDialog(null,
                "Enter the new student's admin number:",
                "Input",
                JOptionPane.QUESTION_MESSAGE);

        if (adminNum == null || adminNum.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Admin number cannot be empty.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } for (createNewStudents student : studentList) {
            if (student.getAdminNum().equalsIgnoreCase(adminNum.trim())) {
                JOptionPane.showMessageDialog(null,
                        "Admin number \"" + adminNum.trim() + "\" already exists.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        setStudent(name.trim(), adminNum.trim());
        JOptionPane.showMessageDialog(null,
                "Student added:\n" + getStudent(),
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
