package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	Student fabricio = new Student(129305, "Gonzalez", "Fabricio", "fabrigonzalez171@gmail.com", "https://github.com/FabriGonzalez", "/images/Screenshot_5(2).png");
            public void run() {
            	SimplePresentationScreen s = new SimplePresentationScreen(fabricio);
            	s.setVisible(true);
            }
        });
    }
}