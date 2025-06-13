/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA1;

/**
 *
 * @author Kamal
 */
public class addStudent {
    private String name,admin_num;
    public addStudent(){
    this.name = " ";
    this.admin_num = " ";
    }
    
    public addStudent(String name, String admin_num){
    this.name = name;
    this.admin_num = admin_num;
    }
    public void setStudent(String name, String admin_num){
    this.name = name;
    this.admin_num =admin_num;
    }
    public String getStudent() {
    return "Student name: " + this.name + " Admin No: " + this.admin_num;
}

}
