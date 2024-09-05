/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compilador;

import compilador.telas.CompiladorGui;

import javax.swing.JFrame;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Matheus Lourenço
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws BadLocationException {
        CompiladorGui obj = new CompiladorGui();
        obj.setBounds(0, 0, 700, 500);
        obj.setTitle("Compilador");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(obj.isVisible()){
            obj.LineColumn.setText("Line: " +  obj.linenum+ " Column: " + obj.columnnum);
        }
    }
    
}
