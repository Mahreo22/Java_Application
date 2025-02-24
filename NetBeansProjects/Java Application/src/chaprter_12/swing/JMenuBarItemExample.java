/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaprter_12.swing;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenuBarItemExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Bar Item Demo");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("View");
        JMenu menu4 = new JMenu("Navigate");
        JMenu menu5 = new JMenu("Source");
        
        JMenuItem newProject = new JMenuItem("New Project..");
        JMenuItem newFile = new JMenuItem("New File..");
        
        JMenuItem undo = new JMenuItem("Undo..");
        JMenuItem redo = new JMenuItem("Redo..");
        JMenuItem cut = new JMenuItem("Cut..");
        JMenuItem copy = new JMenuItem("Copy..");
        
        menu1.add(newProject);
        menu1.add(newFile);
        
        menu2.add(undo);
        menu2.add(redo);
        menu2.add(cut);
        menu2.add(copy);
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setJMenuBar(menuBar);
        
    }
}
