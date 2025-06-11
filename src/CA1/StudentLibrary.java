/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CA1;
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
        // TODO code application logic here
       String userOption = JOptionPane.showInputDialog(null, 
                "Enter your option:\n" +
                "1. Student management\n" +
                "2. Books in Library\n" +
                "3. Exit",
                "Mini Library System",
                JOptionPane.QUESTION_MESSAGE);
        int option = Integer.parseInt(userOption);
        
        switch (option) {
            case 3:
                JOptionPane.showMessageDialog(null,
                        "Program terminated.\nThank you!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        //To do code
            case 1:
                break;
        //To do code
            case 2:
                break;
            default:
                break;
        }
    }
    
}
