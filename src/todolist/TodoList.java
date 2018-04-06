/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;
import java.util.Date;

/**
 *
 * @author lorenzobengzon
 */
public class TodoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code starts here
       Model model = new Model();
       ViewController viewController = new ViewController(model);
       viewController.setVisible(true);


    }
    
}
