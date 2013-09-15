/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111;

/**
 *
 * @author admin
 */
//package apriori;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class gui extends JFrame implements ActionListener{
    JButton jbtn,s_path;
    JTextArea text1,text2,text3;
    JLabel label1,label2,label3;
    JFileChooser jf;
    Container c;
    String path;
    Double min_s;
    Double min_c;
    boolean wait=true;
    public gui(){
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        jf =new JFileChooser();
        label1=new JLabel("Enter The Path:");
        label1.setOpaque(true);
        label2=new JLabel("Enter The Min Support:");
        label2.setOpaque(true);
        label3=new JLabel("Enter The Min Confidence:");
        label3.setOpaque(true);
        text1=new JTextArea(2,10);
        text2=new JTextArea(2,10);
        text3=new JTextArea(2,10);
        s_path=new JButton("Select");
        jbtn=new JButton("Click");
        c.add(label1);
        c.add(text1);
        c.add(s_path);
        c.add(label2);
        c.add(text2);
        c.add(label3);
        c.add(text3);
        s_path.addActionListener(this);
        jbtn.addActionListener(this);
        c.add(jbtn);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String bs=e.getActionCommand();
        
        if(bs.equals("Click")){
            path=text1.getText();
            min_s=Double.parseDouble(text2.getText());
            min_c=Double.parseDouble(text3.getText());
            wait=false;
            
        }
        if(bs.equals("Select")){
            int openChoice = jf.showOpenDialog(this);

            if (openChoice == JFileChooser.APPROVE_OPTION){
                File openFile = jf.getSelectedFile();
                String file_name = openFile.toString();
                text1.setText(file_name);
                
            }

        }
    }
    
}
