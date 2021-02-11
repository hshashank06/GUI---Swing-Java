import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class DetailsEmployee implements ActionListener,ListSelectionListener,ItemListener
{
JTextField t1;
JTextField t2;
JTextField t3; 
JButton jb;
String text1 = "";
String text2 = "";
String text3 = "";
String text4 = "";
String text5 = "";
String s = "";
String str6 = "";
String str7 = "";
String str8 = "";
String str9 = "";
String str10 = "";
String str11 = "";
String str12 = "";
String str13 = "";
String str14 = "";
String str15 = "";

JLabel l1;
JLabel l2;
JLabel l3;
JLabel l4;
JLabel l5;
JLabel l6;
JLabel l7;
JLabel l8;
JLabel l9;
JLabel l10;
JLabel l11;
JLabel l12;
JLabel l13 = new JLabel("Extra-Curricular Activities");

JPanel jp12 = new JPanel(new FlowLayout(FlowLayout.CENTER));


JTextArea ja;
JTextArea ja2;
JTextArea ja3 = new JTextArea(20,20);

JCheckBox jc1;
JCheckBox jc2;
JCheckBox jc3;
JCheckBox jc4;
JCheckBox jc5;
JCheckBox jc6;
JCheckBox jc7;
JCheckBox jc8;
JCheckBox jc9;
JCheckBox jc10;

JFrame jf = new JFrame();

String sex[] = {"Male","Female","Bi-Gender","Prefer Not to Say"};
String Qualification[] = {"Bachelor's ( B- Tech/ B- Arch/ BS)", "Bachelor's and Master's (MS/ Mtech/ MBA)", "Bachelor's, Master's and PHD"};
String Departement[] = {"CSE","IT","Physics","Mechanical","Biotechnology","ECE","EIE","EEE","ICT","Mechatronics","Chemistry","Chemical Engineering"};
JList<String> jcb;
String Date[] = {"1","2","3","4","5","6","7","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String Month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
String Year[] = {"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007"};
JComboBox<String> jcc;
JComboBox<String> jcc2;
JComboBox<String> jcc3;
JComboBox<String> jcc4;
JComboBox<String> jcc5;


public DetailsEmployee()
{

t1 = new JTextField("Name",10);
t2 = new JTextField("Number",10);
t3 = new JTextField("Email",18);
l1 = new JLabel("Employee Name");
l2 = new JLabel("Employee Number");
l3 = new JLabel();
l4 = new JLabel("Gender");
l5 = new JLabel("Qualification");
l6 = new JLabel("Departement");
l7 = new JLabel("Date");
l8 = new JLabel("Month");
l9 = new JLabel("Year");
l10 = new JLabel("Address");
l11 = new JLabel("Email-ID");
l12 = new JLabel("Hobbies");
l13 = new JLabel("Extra-Curricular Activities");

jcb = new JList<String>(sex);
jcb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
JScrollPane jsp = new JScrollPane(jcb);

jcc = new JComboBox<String>(Qualification);
jcc.addActionListener(this);

jcc2 = new JComboBox<String>(Departement);
jcc2.addActionListener(this);

jcc3 = new JComboBox<String>(Date);
jcc3.addActionListener(this);

jcc4 = new JComboBox<String>(Month);
jcc4.addActionListener(this);

jcc5 = new JComboBox<String>(Year);
jcc5.addActionListener(this);


ja = new JTextArea(4,20);
ja2 = new JTextArea(4,20);
ja3 = new JTextArea(20,20);


jc1 = new JCheckBox("Swimming");
jc2 = new JCheckBox("Reading");
jc3 = new JCheckBox("Teaching - Speaking");
jc4 = new JCheckBox("FootBall");
jc5 = new JCheckBox("Painting - Drawing");
jc6 = new JCheckBox("Writing Novels - Blogs - Contents");
jc7 = new JCheckBox("BasketBall - VolleyBall - Circket");
jc8 = new JCheckBox("Designing - Modelling");
jc9 = new JCheckBox("Coding - App Building");
jc10 = new JCheckBox("Playing PC - Games");


JPanel jp1 = new JPanel();
JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
JPanel jp5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
JPanel jp6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp9 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp10 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp11 = new JPanel(new FlowLayout(FlowLayout.CENTER));
JPanel jp12 = new JPanel(new FlowLayout(FlowLayout.CENTER));
jb = new JButton("Submit");
jf.setTitle("Employee Response Forum");

jp1.add(l1);
jp1.add(t1);
jp1.add(l2);
jp1.add(t2);
jf.add(jp1);
jf.add(jp2);
jp3.add(l4);
jp3.add(jsp);
jf.add(jp3);
jp4.add(l5);
jp4.add(jcc);
jf.add(jp4);
jp5.add(l6);
jp5.add(jcc2);
jf.add(jp5);
jp6.add(l7);
jp6.add(jcc3);
jp6.add(l8);
jp6.add(jcc4);
jp6.add(l9);
jp6.add(jcc5);
jf.add(jp6);
jp7.add(l10);
jp7.add(ja);
jp7.add(l11);
jp7.add(t3);
jf.add(jp7);
jp10.add(l12);
jp8.add(jc1);
jp8.add(jc2);
jp8.add(jc3);
jp8.add(jc4);
jp8.add(jc5);
jp9.add(jc6);
jp9.add(jc7);
jp9.add(jc8);
jp9.add(jc9);
jp9.add(jc10);
jf.add(jp10);
jf.add(jp8);
jf.add(jp9);
jp11.add(l13);
jp11.add(ja2);
jf.add(jp11);

jf.add(jb);

jp12.add(l3);

jp12.add(ja3);
jf.add(jp12);



jf.setLayout(new FlowLayout());
jf.setSize(900,900);
jb.addActionListener(this);
jc1.addActionListener(this);
jc2.addActionListener(this);
jc3.addActionListener(this);
jc4.addActionListener(this);
jc5.addActionListener(this);
jc6.addActionListener(this);
jc7.addActionListener(this);
jc8.addActionListener(this);
jc9.addActionListener(this);
jc10.addActionListener(this);
/*
jc1.addItemListener(this);
jc2.addItemListener(this);
jc3.addItemListener(this);
jc4.addItemListener(this);
jc5.addItemListener(this);
jc6.addItemListener(this);
jc7.addItemListener(this);
jc8.addItemListener(this);
jc9.addItemListener(this);
jc10.addItemListener(this);
*/
jcb.addListSelectionListener(this);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae)
{
s = ae.getActionCommand();
if(s.equals("Submit"))
{
s = "Submit";

text1 = t1.getText();
text2 = t2.getText();
text3 = t3.getText();
text4 = ja.getText();
text5 = ja2.getText();

String str = (String)jcc.getSelectedItem();
String str2 = (String)jcc2.getSelectedItem();
String str3 = (String)jcc3.getSelectedItem();
String str4 = (String)jcc4.getSelectedItem();
String str5 = (String)jcc5.getSelectedItem();

if(jc1.isSelected())
{
str6 = jc1.getText();
}

if(jc2.isSelected())
{
str7 = jc2.getText();
}

if(jc3.isSelected())
{
str8 = jc3.getText();
}

if(jc4.isSelected())
{
str9 = jc4.getText();
}

if(jc5.isSelected())
{
str10 = jc5.getText();
}

if(jc6.isSelected())
{
str11 = jc6.getText();
}

if(jc7.isSelected())
{
str12 = jc7.getText();
}

if(jc8.isSelected())
{
str13 = jc8.getText();
}

if(jc9.isSelected())
{
str14 = jc9.getText();
}

if(jc10.isSelected())
{
str15 = jc10.getText();
}

int idx = jcb.getSelectedIndex();
if(idx != -1)
{
System.out.println(sex[idx]);
ja3.append("The Gender of Employee is -" + sex[idx] + "\n");
}

if(text1 == "" || (text2.length() < 9 || text2.length() > 9))
{
l3.setText("Please re-enter. Employee Number or Employee name must be according to format");
}
else
{
l3.setText("Submission Successfull");
}

ja3.append("The Employee Name is - " + text1 + "\n" + "The Employee Number is -" + text2 + "\n");
ja3.append("The Qualification of the Employee is -" + str + "\n");
ja3.append("\n");
ja3.append("The Email-Address is - " + text3 + "\n");
ja3.append("The Address is - " + text4 + "\n");
ja3.append("\n");
ja3.append("Participated in the Following Extra Curiccilar Activities" + text5 + "\n");
ja3.append("The DOB of the Employee is - " + str3+ "-" + str4 + "-" + str5 + "\n");
ja3.append("The Employee belongs to " + str2 + " Departement \n");
String we = str6 + " " + str7 + " " + str8 + " " + str9 + " " + str10 + " " + str11 + " " + str12 + " " + str13 + " " + str14 + " " + str15 + "\n";
we = we.replaceAll("\\s","");
ja3.append("The Employee Hobbies are " + "\n" + we);
}
}


public void valueChanged(ListSelectionEvent ls)
{

int idx = jcb.getSelectedIndex();
if(idx != -1)
{
if(s.equals("Submit"))
{
ja3.append("The Gender of Employee is -" + sex[idx] + "\n");
}
}
}

public void itemStateChanged(ItemEvent ie)
{
if(jc1.isSelected())
{
if(s.equals("Submit"))
{
ja3.append("Hobby -" + jc1.getText() + "\n");
}
}

if(jc2.isSelected())
{
System.out.println(jc2.getText());
ja3.append("Hobby -" + jc2.getText() + "\n");
}

if(jc3.isSelected())
{
System.out.println(jc3.getText());
ja3.append("Hobby -" + jc3.getText() + "\n");
}

if(jc4.isSelected())
{
System.out.println(jc4.getText());
ja3.append("Hobby -" + jc4.getText() + "\n");
}

if(jc5.isSelected())
{
System.out.println(jc5.getText());
ja3.append("Hobby -" + jc5.getText() + "\n");
}

if(jc6.isSelected())
{
System.out.println(jc6.getText());
ja3.append("Hobby -" + jc6.getText() + "\n");
}

if(jc7.isSelected())
{
System.out.println(jc7.getText());
ja3.append("Hobby -" + jc7.getText() + "\n");
}

if(jc8.isSelected())
{
System.out.println(jc8.getText());
ja3.append("Hobby -" + jc8.getText() + "\n");
}

if(jc9.isSelected())
{
System.out.println(jc9.getText());
ja3.append("Hobby -" + jc9.getText() + "\n");
}

if(jc10.isSelected())
{
System.out.println(jc10.getText());
ja3.append("Hobby -" + jc10.getText() + "\n");
}

}


public static void main(String args[])
{
DetailsEmployee de = new DetailsEmployee();
}
}





 





