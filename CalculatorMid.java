/*
    Name: MUHAMMAD UZAIR
    Reg no: FA21-BCS-074
    Class: CS-2B
    Submitted to: Mr. Mustafa Khattak
    Date: 5/15/2022
*/

//package cal;
//import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CalculatorMid extends JFrame implements ActionListener {                  
    Container c;                                            // declaring container

    JLabel op1Label;
    JLabel op2Label;                                        // declaring labels
    JLabel resultLabel; 
    JLabel invalidLabel;                                    // for exception of invalid entries
    
    JTextField op1Field;
    JTextField op2Field;                                    // declaring fields
    JTextField resultField;
    
    JButton calButton;                                      // declaring Calculate buttons
    
    JLabel nsLabel;                                         // Number System Label
    JComboBox nsBox;                                        // declaring Number System combo box
    JLabel dtLabel;                                         // Data Type Label
    JComboBox dtBox;                                        // declare Datatype combo box
    
    JLabel arithLabel;                                      // Arithematic Label
    JRadioButton addButton;                                 
    JRadioButton minusButton;                               
    JRadioButton multiplyButton;                            // declaring 
    JRadioButton divideButton;                              // Arithematic Button
    JRadioButton modButton;
    
    JLabel trigLabel;                                      // Trignometric Label
    JRadioButton sinButton;                                 
    JRadioButton cosButton;                               
    JRadioButton tanButton;                                // declaring 
    JRadioButton cosecButton;                              // trignometric Button
    JRadioButton secButton;
    JRadioButton cotButton;
    
    JLabel trighLabel;                                      // Trignometric Hyperbolic Label
    JRadioButton sinhButton;                                 
    JRadioButton coshButton;                               
    JRadioButton tanhButton;                                // declaring 
    JRadioButton cosechButton;                              // Trignometric Hyperbolic Button
    JRadioButton sechButton;
    JRadioButton cothButton;
    
    JLabel arctrigLabel;                                     // Inverse Trignometric Label
    JRadioButton arcsinButton;                                 
    JRadioButton arccosButton;                               
    JRadioButton arctanButton;                                // declaring inverse arc buttons

    JLabel othersLabel;                                      // Other operations Label
    JRadioButton radtodegButton;                             // Radian To Degree   
    JRadioButton degtoradButton;                                // Degree to Radian     // buttons
    JRadioButton perButton;                                 // percentage 
    JRadioButton expButton;                                 // Exponent a^x
    
    JRadioButton nlogButton;                                // natural log ln(x)
    JRadioButton logButton;                                 // ln(base)(x)

    public CalculatorMid(){
        // *CONTAINER*
        c = getContentPane();
        c.setLayout(null);
        
        // *COMBO BOXS*
        nsLabel = new JLabel("NUMBER SYSTEM");                                 //Number System Label
        nsLabel.setForeground(Color.white);            
        nsLabel.setBackground(Color.DARK_GRAY);        
        nsLabel.setOpaque(true);                       
        nsLabel.setFont(new Font("Arial",Font.BOLD,15));
        nsLabel.setVerticalAlignment(JLabel.CENTER);   
        nsLabel.setHorizontalAlignment(JLabel.CENTER); 
        nsLabel.setBounds(20, 21, 150, 25);
        c.add(nsLabel);                     

        String[] ns = {"Decimal","Binary","Octal", "Hexa Decimal" };            // Number System box
        nsBox = new JComboBox(ns);
        nsBox.setBounds(180, 19, 90, 32);
        nsBox.setSelectedItem("Decimal");
        
        dtLabel = new JLabel("DATA TYPE");                                     // Data Type Box
        dtLabel.setForeground(Color.white);            
        dtLabel.setBackground(Color.DARK_GRAY);        
        dtLabel.setOpaque(true);                       
        dtLabel.setFont(new Font("Arial",Font.BOLD,15));                        // Data type Label
        dtLabel.setVerticalAlignment(JLabel.CENTER);   
        dtLabel.setHorizontalAlignment(JLabel.CENTER); 
        dtLabel.setBounds(350, 21, 100, 25);
        c.add(dtLabel);
        
        String[] dt = {"Byte","Short","Integer", "Long", "Float", "Double" };   // DataType Box
        dtBox = new JComboBox(dt);
        dtBox.setSelectedItem("Integer");
        dtBox.setBounds(460, 19, 80, 32);
        
        c.add(nsBox);
        c.add(dtBox);
        
        // *RADIO BUTTONS*
        arithLabel = new JLabel("ARITHEMATIC");                                 //Arithematic Label
        arithLabel.setForeground(Color.white);            
        arithLabel.setBackground(Color.DARK_GRAY);        
        arithLabel.setOpaque(true);                       
        arithLabel.setFont(new Font("Arial",Font.BOLD,15));
        arithLabel.setVerticalAlignment(JLabel.CENTER);   
        arithLabel.setHorizontalAlignment(JLabel.CENTER); 
        arithLabel.setBounds(230, 65, 130, 25);
        c.add(arithLabel);
        
        addButton = new JRadioButton(" + Add");                            // add button
        addButton.setBounds(40, 90, 95, 35);
        
        minusButton = new JRadioButton(" - Subtract");                            // subtract button
        minusButton.setBounds(240, 90, 95, 35);
        
        multiplyButton = new JRadioButton(" * Multiply");                       // multiply button
        multiplyButton.setBounds(440, 90, 95, 35);       

        divideButton = new JRadioButton(" / Divide ");                          //divide button
        divideButton.setBounds(40, 115, 95, 35);        
        
        modButton = new JRadioButton(" % Modulo");                                // mod button
        modButton.setBounds(240, 115, 95, 35);    
        
        // Trignometric 
        trigLabel = new JLabel("TRIGNOMETRIC");                                 //trigno Label
        trigLabel.setForeground(Color.white);            
        trigLabel.setBackground(Color.DARK_GRAY);        
        trigLabel.setOpaque(true);                       
        trigLabel.setFont(new Font("Arial",Font.BOLD,15));
        trigLabel.setVerticalAlignment(JLabel.CENTER);   
        trigLabel.setHorizontalAlignment(JLabel.CENTER); 
        trigLabel.setBounds(230, 155, 130, 25);
        c.add(trigLabel);
        
        sinButton = new JRadioButton("sin");                                     // sin button
        sinButton.setBounds(40, 180, 95, 35);
        
        cosButton = new JRadioButton("cos");                                    // cos button
        cosButton.setBounds(240, 180, 95, 35);
        
        tanButton = new JRadioButton("tan");                                     // tan button
        tanButton.setBounds(440, 180, 95, 35);       

        cosecButton = new JRadioButton("cosec");                                //cosec button
        cosecButton.setBounds(40, 205, 95, 35);        
        
        secButton = new JRadioButton("sec");                                    // sec button
        secButton.setBounds(240, 205, 95, 35); 
        
        cotButton = new JRadioButton("cot");                                    // cot button
        cotButton.setBounds(440, 205, 95, 35); 
     
        // Hyperbolic Trignometric
        trighLabel = new JLabel("HYPERBOLIC TRIGNOMETRIC");                     //hyper trigno Label
        trighLabel.setForeground(Color.white);            
        trighLabel.setBackground(Color.DARK_GRAY);        
        trighLabel.setOpaque(true);                       
        trighLabel.setFont(new Font("Arial",Font.BOLD,15));
        trighLabel.setVerticalAlignment(JLabel.CENTER);   
        trighLabel.setHorizontalAlignment(JLabel.CENTER); 
        trighLabel.setBounds(175, 245, 230, 25);
        c.add(trighLabel);
        
        sinhButton = new JRadioButton("sinh");                            // sinh button
        sinhButton.setBounds(20+20, 270, 95, 35);
        
        coshButton = new JRadioButton("cosh");                            // cosh button
        coshButton.setBounds(220+20, 270, 95, 35);
        
        tanhButton = new JRadioButton("tanh");                                // tanh button
        tanhButton.setBounds(420+20, 270, 95, 35);       

        cosechButton = new JRadioButton("cosech");                          //cosech button
        cosechButton.setBounds(20+20, 295, 95, 35);        
        
        sechButton = new JRadioButton("sech");                                // sech button
        sechButton.setBounds(220+20, 295, 95, 35); 
        
        cothButton = new JRadioButton("coth");                                // coth button
        cothButton.setBounds(420+20, 295, 95, 35); 

        // Inverse Trignometric 
        trigLabel = new JLabel("INVERSE TRIGNOMETRIC");                                 //Inverse Trigno Label
        trigLabel.setForeground(Color.white);            
        trigLabel.setBackground(Color.DARK_GRAY);        
        trigLabel.setOpaque(true);                       
        trigLabel.setFont(new Font("Arial",Font.BOLD,15));
        trigLabel.setVerticalAlignment(JLabel.CENTER);   
        trigLabel.setHorizontalAlignment(JLabel.CENTER); 
        trigLabel.setBounds(185, 335, 200, 25);
        c.add(trigLabel);
        
        arcsinButton = new JRadioButton("Arcsin");                            // arcsin button
        arcsinButton.setBounds(40, 360, 95, 35);
        
        arccosButton = new JRadioButton("Arccos");                            // arccos button
        arccosButton.setBounds(240, 360, 95, 35);
        
        arctanButton = new JRadioButton("Arctan");                                // arctan button
        arctanButton.setBounds(440, 360, 95, 35);
        
        // Others Operations
        othersLabel = new JLabel("OTHERS");                                 //Others Label
        othersLabel.setForeground(Color.white);            
        othersLabel.setBackground(Color.DARK_GRAY);        
        othersLabel.setOpaque(true);                       
        othersLabel.setFont(new Font("Arial",Font.BOLD,15));
        othersLabel.setVerticalAlignment(JLabel.CENTER);   
        othersLabel.setHorizontalAlignment(JLabel.CENTER); 
        othersLabel.setBounds(245, 395, 80, 25);
        c.add(othersLabel);
        
        radtodegButton = new JRadioButton("Radian To Degree");                            // Radian to Degree button
        radtodegButton.setBounds(20+20, 420, 135, 35);
        
        degtoradButton = new JRadioButton("Degree To Radian");                            // Degree to Radian button
        degtoradButton.setBounds(220+20, 420, 135, 35);
        
        perButton = new JRadioButton("Percentage");                                // Percenatge button
        perButton.setBounds(420+20, 420, 95, 35); 
        
        expButton = new JRadioButton("Exponent(x^y)");                                // Exponential button
        expButton.setBounds(20+20, 445, 135, 35);       

        nlogButton = new JRadioButton("Natural Log");                                // natural log button
        nlogButton.setBounds(240, 445, 135, 35); 
        
        logButton = new JRadioButton("Log(10)a");                                // log button (log(base)(value)
        logButton.setBounds(440, 445, 135, 35); 
        
        // *LABELS*
        // label 1 for op 1
        op1Label = new JLabel("Operand 1: ");           // instansiating of class
        
        //op1Label.setText("Operand1: ");               //set text of label            
        op1Label.setForeground(Color.white);            // set text color
        op1Label.setBackground(Color.DARK_GRAY);        // background color
        op1Label.setOpaque(true);                       // display bg color
        op1Label.setFont(new Font("Arial",Font.BOLD,15));         // font
        op1Label.setVerticalAlignment(JLabel.CENTER);   // align text vertically in label even if we resize windpw
        op1Label.setHorizontalAlignment(JLabel.CENTER); //  align text horizontally in label - - - -
        op1Label.setBounds(40, 510, 93, 32);            // set (x,y) of screen, width, height
        
        // label 2 for op 2
        op2Label = new JLabel("Operand 2: ");    
        op2Label.setForeground(Color.white);            // set text color
        op2Label.setBackground(Color.DARK_GRAY);        // background color
        op2Label.setOpaque(true);                       // display bg color
        op2Label.setFont(new Font("Arial",Font.BOLD,15));         // font
        op2Label.setVerticalAlignment(JLabel.CENTER);   // align text vertically in label even if we resize windpw
        op2Label.setHorizontalAlignment(JLabel.CENTER); //  align text horizontally in label - - - -
        op2Label.setBounds(335, 510, 93, 32);
        
        // label 3 for result
        resultLabel = new JLabel("Result: ");   
        resultLabel.setForeground(Color.white);            
        resultLabel.setBackground(Color.DARK_GRAY);        
        resultLabel.setOpaque(true);                                            
        resultLabel.setFont(new Font("Arail",Font.BOLD,15));
        resultLabel.setVerticalAlignment(JLabel.CENTER);   
        resultLabel.setHorizontalAlignment(JLabel.CENTER); 
        resultLabel.setBounds(180-30, 600, 90, 32);
        
        c.add(op1Label);        // add op1 label to container
        c.add(op2Label);        // add op2 label to container
        c.add(resultLabel);     // add result label to container
        
        // *TEXT FIELDS*
        // op1 text field 
        op1Field = new JTextField();
        op1Field.setBounds(145, 510, 100, 32);
        
        // op2 text field 
        op2Field = new JTextField();
        op2Field.setBounds(440, 510, 100, 32);

        // result text field 
        resultField = new JTextField();
        resultField.setBounds(290-30, 600, 200, 32);
        resultField.setEditable(false);                 // makes field un editable 
        
        c.add(op1Field);
        c.add(op2Field);
        c.add(resultField);
        
        // *BUTTONS*
        calButton = new JButton("CALCULATE");
        calButton.setFont(new Font("Arial",Font.BOLD,15));
        calButton.setVerticalAlignment(JLabel.CENTER);   
        calButton.setHorizontalAlignment(JLabel.CENTER);        
        calButton.setBounds(225, 550, 130, 40);
        
        c.add(calButton);

        // RADIO BUTTONS GROUP 
        ButtonGroup group = new ButtonGroup();
        group.add(addButton);
        group.add(minusButton);
        group.add(multiplyButton);                                              // arithematic
        group.add(divideButton);
        group.add(modButton);
        
        group.add(sinButton);
        group.add(cosButton);
        group.add(tanButton);
        group.add(cosecButton);                                                 // trignometric
        group.add(secButton);
        group.add(cotButton);
        
        group.add(sinhButton);
        group.add(coshButton);
        group.add(tanhButton);
        group.add(cosechButton);                                                 // hyperbolic trignometric
        group.add(sechButton);
        group.add(cothButton);
        
        group.add(arcsinButton);
        group.add(arccosButton);                                                   // inverse trigno
        group.add(arctanButton);
        
        group.add(radtodegButton);
        group.add(degtoradButton);
        group.add(perButton);
        group.add(expButton);
        group.add(nlogButton);
        group.add(logButton);
        
        // adding radio buttons to container
        c.add(addButton);
        c.add(minusButton);
        c.add(multiplyButton);                                                  // arithematic
        c.add(divideButton);
        c.add(modButton);
        
        c.add(sinButton);
        c.add(cosButton);
        c.add(tanButton);
        c.add(cosecButton);                                                     // trignometric
        c.add(secButton);
        c.add(cotButton);
        
        c.add(sinhButton);
        c.add(coshButton);
        c.add(tanhButton);
        c.add(cosechButton);                                                     // hyperbolic trignometric
        c.add(sechButton);
        c.add(cothButton);
        
        c.add(arcsinButton);
        c.add(arccosButton);                                                       // inverse trigno
        c.add(arctanButton);

        c.add(radtodegButton);
        c.add(degtoradButton);
        c.add(perButton);
        c.add(expButton);
        c.add(nlogButton);
        c.add(logButton);
        
        // *Add Action listerners*
        nsBox.addActionListener(this);
        dtBox.addActionListener(this);
         
        addButton.addActionListener(this);
        minusButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        modButton.addActionListener(this);
        
        sinButton.addActionListener(this);
        cosButton.addActionListener(this);
        tanButton.addActionListener(this);
        cosecButton.addActionListener(this);
        secButton.addActionListener(this);
        cotButton.addActionListener(this);
        
        sinhButton.addActionListener(this);
        coshButton.addActionListener(this);
        tanhButton.addActionListener(this);
        cosechButton.addActionListener(this);
        sechButton.addActionListener(this);
        cothButton.addActionListener(this);
        
        arcsinButton.addActionListener(this);
        arccosButton.addActionListener(this);
        arctanButton.addActionListener(this);
        
        radtodegButton.addActionListener(this);
        degtoradButton.addActionListener(this);
        perButton.addActionListener(this);
        expButton.addActionListener(this);
        nlogButton.addActionListener(this);
        logButton.addActionListener(this);
        
        calButton.addActionListener(this);

        // Disable everything
        op1Field.setEnabled(false);                                             // operand fields disable by default
        op2Field.setEnabled(false);
        
        sinButton.setEnabled(false);                                            
        cosButton.setEnabled(false);
        tanButton.setEnabled(false);
        cosecButton.setEnabled(false);
        secButton.setEnabled(false);
        cotButton.setEnabled(false);                                            // Disable trigno fs.
        sinhButton.setEnabled(false);                                           
        coshButton.setEnabled(false);
        tanhButton.setEnabled(false);
        cosechButton.setEnabled(false);
        sechButton.setEnabled(false);
        cothButton.setEnabled(false);
        arcsinButton.setEnabled(false);                                            
        arccosButton.setEnabled(false);
        arctanButton.setEnabled(false);
   
        radtodegButton.setEnabled(false);
        degtoradButton.setEnabled(false);
 
    }                                                       // end of constructor
    
    // DISABLE BUTTONS METHOD fot int types
    public void disableButtons(){

        sinButton.setEnabled(false);                                            
        cosButton.setEnabled(false);
        tanButton.setEnabled(false);
        cosecButton.setEnabled(false);
        secButton.setEnabled(false);
        cotButton.setEnabled(false);                                            // disable trig buttons
        sinhButton.setEnabled(false);                                           // for int types
        coshButton.setEnabled(false);
        tanhButton.setEnabled(false);
        cosechButton.setEnabled(false);
        sechButton.setEnabled(false);
        cothButton.setEnabled(false);
        arcsinButton.setEnabled(false);                                            
        arccosButton.setEnabled(false);
        arctanButton.setEnabled(false);

        radtodegButton.setEnabled(false);
        degtoradButton.setEnabled(false);
    }
    
    // ENABLE BUTTONS METHODS
    public void enableButtons(){

        sinButton.setEnabled(true);                                            
        cosButton.setEnabled(true);
        tanButton.setEnabled(true);
        cosecButton.setEnabled(true);
        secButton.setEnabled(true);
        cotButton.setEnabled(true);                                            // enable trig buttons
        sinhButton.setEnabled(true);                                           
        coshButton.setEnabled(true);
        tanhButton.setEnabled(true);
        cosechButton.setEnabled(true);
        sechButton.setEnabled(true);
        cothButton.setEnabled(true);
        arcsinButton.setEnabled(true);                                            
        arccosButton.setEnabled(true);
        arctanButton.setEnabled(true);

        radtodegButton.setEnabled(true);
        degtoradButton.setEnabled(true);
    }
    
    // DISABLE BUTTONS 2 METHODS for NS
    public void disableButtons2(){

        radtodegButton.setEnabled(false);                                            
        degtoradButton.setEnabled(false);
        perButton.setEnabled(false);
        expButton.setEnabled(false);
        nlogButton.setEnabled(false);                                           // fot bin , hex, oct
        logButton.setEnabled(false);                                            // disable buttons for bin,oct,hex
    }
   
    // ENABLE BUTTON 2 METHOD
    public void enableButtons2(){

        radtodegButton.setEnabled(true);                                            
        degtoradButton.setEnabled(true);
        perButton.setEnabled(true);
        expButton.setEnabled(true);
        nlogButton.setEnabled(true);
        logButton.setEnabled(true);                                                                            
    }
    
    // Check Binary number method
    public static boolean isBinary(long n){   //check if number is binary 
        
        while(n!=0)
        {
            if(n%10>1)
                return false;
            n = n/10;
        }
        return true;
    }
    // Check Octal number method
    public static boolean isOctal(long n){  //check if number is octal
   
        while(n!=0)
        {
            if(n%10>7)
            {
                return false;
            }
            n = n/10;
        }
        return true;        
    }
    // Check Hexa Decimal number method
    public static boolean isHex(String s){

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if ((ch < '0' || ch > '9')&& (ch < 'A' || ch > 'F'))
            {
                return false;
            }

        }
        return true;
    }

    // **ACTION METHOD**
   //@Override
    public void actionPerformed(ActionEvent ev){
    
        try{
            // Decimal
            // #####################################################################
            if(nsBox.getSelectedItem()=="Decimal" )
            {
                // ==================INT======================
                enableButtons2();
                if(dtBox.getSelectedItem()== "Integer")
                {
                    disableButtons();                                       // call disable method 
                        if(addButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            int op1 = Integer.parseInt(op1Field.getText());
                            int op2 = Integer.parseInt(op2Field.getText());
                            int result = op1 + op2;

                            resultField.setText(Integer.toString(result));
                        }
                        // ----------SUBTRACT--------------
                        else if(minusButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            int op1 = Integer.parseInt(op1Field.getText());
                            int op2 = Integer.parseInt(op2Field.getText());
                            int result = op1 - op2;
                            resultField.setText(Integer.toString(result));
                        }
                        // ----------MULTIPLY--------------
                        else if(multiplyButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            int op1 = Integer.parseInt(op1Field.getText());
                            int op2 = Integer.parseInt(op2Field.getText());
                            int result = op1 * op2;

                            resultField.setText(Integer.toString(result));
                        }
                        // ----------DIVIDE--------------
                        else if(divideButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            int op1 = Integer.parseInt(op1Field.getText());
                            int op2 = Integer.parseInt(op2Field.getText());
                            //if(op2 == 0)                                                // exception for op1/0;
                            //    resultField.setText("Divison by 0 not possible");
                            int result = op1 / op2;
                            resultField.setText(Integer.toString(result));

                        }
                        // ----------MOD--------------
                        else if(modButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            int op1 = Integer.parseInt(op1Field.getText());
                            int op2 = Integer.parseInt(op2Field.getText());
                            int result = op1 % op2;

                            resultField.setText(Integer.toString(result));

                        }

                        // ----------PERCENTAGE--------------

                        else if(perButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            double op1 = Double.parseDouble(op1Field.getText());
                            double op2 = Double.parseDouble(op2Field.getText());
                            
                            if((op1<-2147483648)||(op1>2147483647)||(op2>2147483647)||(op2<-2147483648)||(op2 == 0))
                            {
                                resultField.setText("Enter Valid Numbers");
                            }
                            else
                            {
                                int result = (int)((op1 / op2)*100.0);
                                resultField.setText(Integer.toString(result));
                            }
                        }

                        // ----------EXPONENT(x^y)--------------
                        else if(expButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);          // enable op Fields

                            double op1 = Double.parseDouble(op1Field.getText());
                            double op2 = Double.parseDouble(op2Field.getText());
                            if((op1<-2147483648)||(op1>2147483647)||(op2>2147483647)||(op2<-2147483648))
                            {
                                resultField.setText("Enter Valid Numbers");
                            }
                            else
                            {                           
                            int result = (int)(Math.pow(op1,op2));

                            resultField.setText(Integer.toString(result));
                            }
                        }  


                        // ----------LOG(x)--------------

                        else if(nlogButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setText(null);                                     // empty second field
                            op2Field.setEnabled(false);

                            double op1 = Double.parseDouble(op1Field.getText());
                            if((op1<-2147483648)||(op1>2147483647))
                            {
                                resultField.setText("Enter Valid Numbers");
                            }
                            else
                            {
                            int result = (int)(Math.log(op1));  
                            resultField.setText(Integer.toString(result));
                            }
                        }

                        // ----------LOG(10)(a)--------------

                        else if(logButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setText(null);                                     // empty second field
                            op2Field.setEnabled(false);

                            double op1 = Double.parseDouble(op1Field.getText());
                            if((op1<-2147483648)||(op1>2147483647))
                            {
                                resultField.setText("Enter Valid Numbers");
                            }
                            else
                            {
                            int result = (int)(Math.log10(op1));
                            resultField.setText(Integer.toString(result));                           
                            }
                        }
            }
                // ==================BYTE======================
                else if(dtBox.getSelectedItem()== "Byte")
                {
                    disableButtons();
                    // ----------ADD--------------
                    if(addButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        byte op1 = Byte.parseByte(op1Field.getText());
                        byte op2 = Byte.parseByte(op2Field.getText());
                        byte result =(byte)(op1 + op2);

                        resultField.setText(Byte.toString(result));

                    }
                    // ----------SUBTRACT--------------
                    else if(minusButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        byte op1 = Byte.parseByte(op1Field.getText());
                        byte op2 = Byte.parseByte(op2Field.getText());
                        byte result =(byte)(op1 - op2); 
                        resultField.setText(Byte.toString(result));
                    }
                    // ----------MULTIPLY--------------
                    else if(multiplyButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        byte op1 = Byte.parseByte(op1Field.getText());
                        byte op2 = Byte.parseByte(op2Field.getText());
                        byte result = (byte)(op1 * op2);

                        resultField.setText(Byte.toString(result));

                    }
                    // ----------DIVIDE--------------
                    else if(divideButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        byte op1 = Byte.parseByte(op1Field.getText());
                        byte op2 = Byte.parseByte(op2Field.getText());

                        //if(op2 == 0)                                                // exception for op1/0;
                        //    resultField.setText("Divison by 0 not possible");
                        byte result = (byte)(op1 / op2);
                        resultField.setText(Byte.toString(result));

                    }
                    // ----------MOD--------------

                    else if(modButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        byte op1 = Byte.parseByte(op1Field.getText());
                        byte op2 = Byte.parseByte(op2Field.getText());
                        byte result = (byte)(op1 % op2);

                        resultField.setText(Byte.toString(result));

                    }

                    // ----------PERCENTAGE--------------

                    else if(perButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        if((op1<-128)||(op1>127)||(op2<-128)||(op2>127)||(op2 == 0))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                        byte result = (byte)((op1 / op2)*100.0);

                        resultField.setText(Byte.toString(result));
                        
                        }

                    }

                    // ----------EXPONENT(x^y)--------------

                    else if(expButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        
                        if((op1<-128)||(op1>127)||(op2<-128)||(op2>127))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                        byte result = (byte)(Math.pow(op1,op2));
 
                        resultField.setText(Byte.toString(result));
                        }
                    }  

                    // ----------LOG(x)--------------

                    else if(nlogButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);

                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);
                        double op1 = Double.parseDouble(op1Field.getText());
                        
                        if((op1<-128)||(op1>127))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                        byte result = (byte)(Math.log(op1));
                           
                        resultField.setText(Byte.toString(result));
                        }
                    }

                    // ----------LOG(10)(a)--------------

                    else if(logButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        if((op1<-128)||(op1>127))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                        byte result = (byte)(Math.log10(op1));
                           
                        resultField.setText(Byte.toString(result));
                        }
                    }

                }

                // ==================SHORT======================
                else if(dtBox.getSelectedItem()== "Short")
                {
                    disableButtons();

                    // ----------ADD--------------
                    if(addButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        short op1 = Short.parseShort(op1Field.getText());
                        short op2 = Short.parseShort(op2Field.getText());
                        short result =(short)(op1 + op2);

                        resultField.setText(Short.toString(result));

                    }
                    // ----------SUBTRACT--------------
                    else if(minusButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        short op1 = Short.parseShort(op1Field.getText());
                        short op2 = Short.parseShort(op2Field.getText());
                        short result =(short)(op1 - op2);
                        
                        resultField.setText(Short.toString(result));
                    }
                    // ----------MULTIPLY--------------
                    else if(multiplyButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        short op1 = Short.parseShort(op1Field.getText());
                        short op2 = Short.parseShort(op2Field.getText());
                        short result = (short)(op1 * op2);

                        resultField.setText(Short.toString(result));

                    }
                    // ----------DIVIDE--------------
                    else if(divideButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        short op1 = Short.parseShort(op1Field.getText());
                        short op2 = Short.parseShort(op2Field.getText());
                        //if(op2 == 0)                                                // exception for op1/0;
                        //    resultField.setText("Divison by 0 not possible");
                        short result = (short)(op1 / op2);
                        
                        resultField.setText(Short.toString(result));

                    }
                    // ----------MOD--------------

                    else if(modButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        short op1 = Short.parseShort(op1Field.getText());
                        short op2 = Short.parseShort(op2Field.getText());

                        short result = (short)(op1 % op2);

                        resultField.setText(Short.toString(result));

                    }

                    // ----------PERCENTAGE--------------

                    else if(perButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        if((op1<-32768)||(op1>32767)||(op2<-32768)||(op2>32767)||(op2 == 0))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                            short result = (short)((op1 / op2)*100.0);

                            resultField.setText(Short.toString(result));
                        }
                    }

                    // ----------EXPONENT(x^y)--------------

                    else if(expButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields
                        
                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        
                        if((op1<-32768)||(op1>32767)||(op2<-32768)||(op2>32767))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                            short result = (short)(Math.pow(op1,op2));

                            resultField.setText(Short.toString(result));
                    }   }

                    // ----------LOG(x)--------------

                    else if(nlogButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        if((op1<-32768)||(op1>32767))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                            short result = (short)(Math.log(op1));

                            resultField.setText(Short.toString(result));
                    
                        }
                    }   

                    // ----------LOG(10)(a)--------------

                    else if(logButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        if((op1<-32768)||(op1>32767))
                        {
                            resultField.setText("Enter Valid Numbers");
                        }
                        else
                        {
                            short result = (short)(Math.log10(op1));

                            resultField.setText(Short.toString(result));
                        }
                    }

                }

                // ==================LONG======================
                else if(dtBox.getSelectedItem()== "Long")
                {
                    disableButtons();
                    
                    // ----------ADD--------------
                    if(addButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        long op1 = Long.parseLong(op1Field.getText());
                        long op2 = Long.parseLong(op2Field.getText());
                        long result =(long)(op1 + op2);

                        resultField.setText(Long.toString(result));
                    }
                    // ----------SUBTRACT--------------
                    else if(minusButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        long op1 = Long.parseLong(op1Field.getText());
                        long op2 = Long.parseLong(op2Field.getText());
                        long result =(long)(op1 - op2);
   
                        resultField.setText(Long.toString(result));
                    }
                    // ----------MULTIPLY--------------
                    else if(multiplyButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        long op1 = Long.parseLong(op1Field.getText());
                        long op2 = Long.parseLong(op2Field.getText());
                        long result = (long)(op1 * op2);

                        resultField.setText(Long.toString(result));
                    }
                    // ----------DIVIDE--------------
                    else if(divideButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        long op1 = Long.parseLong(op1Field.getText());
                        long op2 = Long.parseLong(op2Field.getText());
                        //if(op2 == 0)                                                // exception for op1/0;
                        //    resultField.setText("Divison by 0 not possible");
                        long result = op1 / op2;
                        resultField.setText(Long.toString(result));

                    }
                    // ----------MOD--------------

                    else if(modButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        long op1 = Long.parseLong(op1Field.getText());
                        long op2 = Long.parseLong(op2Field.getText());
                        long result = op1 % op2;

                        resultField.setText(Long.toString(result));

                    }

                    // ----------PERCENTAGE--------------

                    else if(perButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        //if(op2 == 0.0)                                                // exception for op1/0;
                        //    resultField.setText("Divison by 0 not possible");
                        long result = (long)((op1 / op2)*100.0);

                        resultField.setText(Long.toString(result));
                    }

                    // ----------EXPONENT(x^y)--------------

                    else if(expButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        long result = (long)(Math.pow(op1,op2));

                        resultField.setText(Long.toString(result));
                    }                  

                    // ----------LOG(x)--------------

                    else if(nlogButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());

                        long result = (long)(Math.log(op1));
   
                        resultField.setText(Long.toString(result));
                    }

                    // ----------LOG(10)(a)--------------

                    else if(logButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());

                        long result = (long)(Math.log10(op1));
   
                        resultField.setText(Long.toString(result));
                    }

                }
                // ==================FLOAT======================
                else if(dtBox.getSelectedItem()== "Float")
                {

                    enableButtons();                                       // call disable method 
                    // ----------ADD--------------
                    if(addButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        float op1 = Float.parseFloat(op1Field.getText());
                        float op2 = Float.parseFloat(op2Field.getText());
                        float result = op1 + op2;

                        resultField.setText(Float.toString(result));

                    }
                    // ----------SUBTRACT--------------
                    else if(minusButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        float op1 = Float.parseFloat(op1Field.getText());
                        float op2 = Float.parseFloat(op2Field.getText());
                        float result = op1 - op2;
                          
                        resultField.setText(Float.toString(result));
                    }
                    // ----------MULTIPLY--------------
                    else if(multiplyButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        float op1 = Float.parseFloat(op1Field.getText());
                        float op2 = Float.parseFloat(op2Field.getText());
                        float result = op1 * op2;


                        resultField.setText(Float.toString(result));

                    }
                    // ----------DIVIDE--------------
                    else if(divideButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields


                        float op1 = Float.parseFloat(op1Field.getText());
                        float op2 = Float.parseFloat(op2Field.getText());

                        float result = (float)(op1 / op2);

                        resultField.setText(Float.toString(result));

                    }
                    // ----------MOD--------------

                    else if(modButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        float op1 = Float.parseFloat(op1Field.getText());
                        float op2 = Float.parseFloat(op2Field.getText());
                        float result = op1 % op2;

                        resultField.setText(Float.toString(result));

                    }

                    // ----------PERCENTAGE--------------

                    else if(perButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        float result = (float)((op1 / op2)*100.0);

                        resultField.setText(Float.toString(result));

                    }

                    // ----------EXPONENT(x^y)--------------

                    else if(expButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        float result = (float)(Math.pow(op1,op2));
      
                        resultField.setText(Float.toString(result));
                    }  

                    // ----------LOG(x)--------------

                    else if(nlogButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);

                        op2Field.setText(null);
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());

                        float result = (float)(Math.log(op1));
  
                        resultField.setText(Float.toString(result));

                    }

                    // ----------LOG(10)(a)--------------

                    else if(logButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);

                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());

                        float result = (float)(Math.log10(op1));
   
                        resultField.setText(Float.toString(result));
 
                    }

                    // ---------=====TRIGNOMETRIC=====-----------

                    //----------------sin------------------
                    else if(sinButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.sin(op1));
 
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------cos------------------
                    else if(cosButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.cos(op1));

                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------tan------------------
                    else if(tanButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.tan(op1));
  
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------cosec------------------
                    else if(cosecButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(1/(Math.sin(op1)));
  
                        resultField.setText(Float.toString(result));

                    }

                    //----------------sec------------------
                    else if(secButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(1/(Math.cos(op1)));
  
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------cot------------------
                    else if(cotButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(1/(Math.tan(op1)));

                        resultField.setText(Float.toString(result));

                    }

                    // ---------=====HYPER TRIGNOMETRIC=====-----------

                    //----------------sinh------------------
                    else if(sinhButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.sinh(op1));
 
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------cosh------------------
                    else if(coshButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.cosh(op1));
    
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------tanh------------------
                    else if(tanhButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.tanh(op1));
  
                        resultField.setText(Float.toString(result));

                    }

                    //----------------cosech------------------
                    else if(cosechButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(1/(Math.sinh(op1)));
   
                        resultField.setText(Float.toString(result));

                    }

                    //----------------sech------------------
                    else if(sechButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(1/(Math.cosh(op1)));
   
                        resultField.setText(Float.toString(result));

                    }

                    //----------------coth------------------
                    else if(cothButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(1/(Math.tanh(op1)));
        
                        resultField.setText(Float.toString(result));

                    }

                    // ---------=====INVERSE TRIGNOMETRIC=====-----------

                    //----------------arcsin------------------
                    else if(arcsinButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.asin(op1));
   
                        resultField.setText(Float.toString(result));

                    }

                    //----------------arccos------------------
                    else if(arccosButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.acos(op1));
  
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------arctan------------------
                    else if(arctanButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        float result = (float)(Math.atan(op1));
   
                        resultField.setText(Float.toString(result));
  
                    }

                    //----------------RADIAN TO DEGREE------------------
                    else if(radtodegButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        float result = (float)(Math.toDegrees(op1));
      
                        resultField.setText(Float.toString(result));
 
                    }

                    //----------------DEGREE TO RADIAN-------------
                    else if(degtoradButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        float result = (float)(Math.toRadians(op1));
 
                        resultField.setText(Float.toString(result));

                    }



                }

                // ==================DOUBLE======================
                else if(dtBox.getSelectedItem()== "Double")
                {
                    enableButtons();                                       // call disable method 

                    // ----------ADD--------------
                    if(addButton.isSelected() == true)
                    {   

                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Double
                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        double result = op1 + op2;

                        resultField.setText(Double.toString(result));

                    }
                    // ----------SUBTRACT--------------
                    else if(minusButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        double result = op1 - op2;
   
                        resultField.setText(Double.toString(result));
                    }
                    // ----------MULTIPLY--------------
                    else if(multiplyButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        double result = op1 * op2;

                        resultField.setText(Double.toString(result));

                    }
                    // ----------DIVIDE--------------
                    else if(divideButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields


                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        //if(op2 == 0)                                                // exception for op1/0;
                        //    resultField.setText("Divison by 0 not possible");
                        double result = op1 / op2;

                        resultField.setText(Double.toString(result));
                    }
                    // ----------MOD--------------

                    else if(modButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        double result = op1 % op2;

                        resultField.setText(Double.toString(result));
                    }

                    // ----------PERCENTAGE--------------

                    else if(perButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        double result = ((op1 / op2)*100.0);

                        resultField.setText(Double.toString(result));
                    }

                    // ----------EXPONENT(x^y)--------------

                    else if(expButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setEnabled(true);          // enable op Fields

                        double op1 = Double.parseDouble(op1Field.getText());
                        double op2 = Double.parseDouble(op2Field.getText());
                        double result = (Math.pow(op1,op2));

                        resultField.setText(Double.toString(result));
                    }  

                    // ----------LOG(x)--------------

                    else if(nlogButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);

                        double op1 = Double.parseDouble(op1Field.getText());

                        double result = (Math.log(op1));
  
                        resultField.setText(Double.toString(result));

                    }

                    // ----------LOG(10)(a)--------------

                    else if(logButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());

                        double result = (Math.log10(op1));

                        resultField.setText(Double.toString(result));

                    }

                    // ---------=====TRIGNOMETRIC=====-----------

                    //----------------sin------------------
                    else if(sinButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = Math.sin(op1);
 
                        resultField.setText(Double.toString(result));

                    }

                    //----------------cos------------------
                    else if(cosButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.cos(op1));
    
                        resultField.setText(Double.toString(result));

                    }

                    //----------------tan------------------
                    else if(tanButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.tan(op1));
  
                        resultField.setText(Double.toString(result));
 
                    }

                    //----------------cosec------------------
                    else if(cosecButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (1/(Math.sin(op1)));
    
                        resultField.setText(Double.toString(result));

                    }

                    //----------------sec------------------
                    else if(secButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (1/(Math.cos(op1)));
   
                        resultField.setText(Double.toString(result));

                    }

                    //----------------cot------------------
                    else if(cotButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (1/(Math.tan(op1)));

                        resultField.setText(Double.toString(result));
 
                    }

                    // ---------=====HYPER TRIGNOMETRIC=====-----------

                    //----------------sinh------------------
                    else if(sinhButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.sinh(op1));
  
                        resultField.setText(Double.toString(result));

                    }

                    //----------------cosh------------------
                    else if(coshButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.cosh(op1));
  
                        resultField.setText(Double.toString(result));

                    }

                    //----------------tanh------------------
                    else if(tanhButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.tanh(op1));
       
                        resultField.setText(Double.toString(result));                   
                    }

                    //----------------cosech------------------
                    else if(cosechButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (1/(Math.sinh(op1)));
   
                        resultField.setText(Double.toString(result));
                    }

                    //----------------sech------------------
                    else if(sechButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (1/(Math.cosh(op1)));

                        resultField.setText(Double.toString(result));

                    }

                    //----------------coth------------------
                    else if(cothButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (1/(Math.tanh(op1)));
    
                        resultField.setText(Double.toString(result));

                    }

                    // ---------=====INVERSE TRIGNOMETRIC=====-----------

                    //----------------arcsin------------------
                    else if(arcsinButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.asin(op1));
   
                        resultField.setText(Double.toString(result));
                    }

                    //----------------arccos------------------
                    else if(arccosButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.acos(op1));
    
                        resultField.setText(Double.toString(result));

                    }

                    //----------------arctan------------------
                    else if(arctanButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Math.toRadians(Double.parseDouble(op1Field.getText()));
                        double result = (Math.atan(op1));
                        
                        resultField.setText(Double.toString(result));
                    }

                    //----------------RADIAN TO DEGREE------------------
                    else if(radtodegButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        double result = (Math.toDegrees(op1));
                        
                        resultField.setText(Double.toString(result));
                    }

                    //----------------DEGREE TO RADIAN-------------
                    else if(degtoradButton.isSelected() == true)
                    {   
                        op1Field.setEnabled(true);
                        op2Field.setText(null);                                     // empty second field
                        op2Field.setEnabled(false);

                        double op1 = Double.parseDouble(op1Field.getText());
                        double result = (Math.toRadians(op1));
                        
                        resultField.setText(Double.toString(result));
                    }

                }
              
            }


            // ####################################################################
            else if(nsBox.getSelectedItem() == "Binary")
            {   
                disableButtons2();
                disableButtons(); 
                op1Field.setEnabled(true);
                op2Field.setEnabled(true); 
                long opA = Long.parseLong(op1Field.getText());
                long opB = Long.parseLong(op2Field.getText());
                                
                if((isBinary(opA) == true )&&(isBinary(opB)==true))             // check number for binary
                
                {   
                    
                        //=================LONG/INT=================
                        if((dtBox.getSelectedItem()== "Long")||(dtBox.getSelectedItem()== "Integer"))
                    {
                        // ----------ADD--------------
                            if(addButton.isSelected() == true)
                            {   
                                op1Field.setEnabled(true);
                                op2Field.setEnabled(true);          // enable op Fields

                                long op1 = Long.parseLong(op1Field.getText(),2);
                                long op2 = Long.parseLong(op2Field.getText(),2);
                                long result = op1 + op2;

                                resultField.setText(Long.toBinaryString(result));
                            }
                            // ----------SUBTRACT--------------
                            else if(minusButton.isSelected() == true)
                            {   
                                op1Field.setEnabled(true);
                                op2Field.setEnabled(true);          // enable op Fields

                                long op1 = Long.parseLong(op1Field.getText(),2);
                                long op2 = Long.parseLong(op2Field.getText(),2);
                                long result = op1 - op2;
    
                                resultField.setText(Long.toBinaryString(result));

                            }
                            // ----------MULTIPLY--------------
                            else if(multiplyButton.isSelected() == true)
                            {   
                                op1Field.setEnabled(true);
                                op2Field.setEnabled(true);          // enable op Fields

                                long op1 = Long.parseLong(op1Field.getText(),2);
                                long op2 = Long.parseLong(op2Field.getText(),2);
                                long result = op1 * op2;

                                resultField.setText(Long.toBinaryString(result));
                            }
                            // ----------DIVIDE--------------
                            else if(divideButton.isSelected() == true)
                            {   
                                op1Field.setEnabled(true);
                                op2Field.setEnabled(true);          // enable op Fields

                                long op1 = Long.parseLong(op1Field.getText(),2);
                                long op2 = Long.parseLong(op2Field.getText(),2);
                                //if(op2 == 0)                                                // exception for op1/0;
                                //    resultField.setText("Divison by 0 not possible");
                                long result = op1 / op2;


                                resultField.setText(Long.toBinaryString(result));
                            }
                            // ----------MOD--------------

                            else if(modButton.isSelected() == true)
                            {   
                                op1Field.setEnabled(true);
                                op2Field.setEnabled(true);          // enable op Fields

                                long op1 = Long.parseLong(op1Field.getText(),2);
                                long op2 = Long.parseLong(op2Field.getText(),2);
                                long result = op1 % op2;

                                resultField.setText(Long.toBinaryString(result));
 
                            }

                        }

                        //=================OTHER DATA TYPES=================
                        else if((dtBox.getSelectedItem()== "Short") || (dtBox.getSelectedItem()== "Byte") || (dtBox.getSelectedItem()== "Float") || (dtBox.getSelectedItem()== "Double"))
                        {
                            resultField.setText("Select Integer or Long");
                        }
                        
                    }
                    else
                        resultField.setText("Number is not Binary");

            }

            //######################################################################
            else if(nsBox.getSelectedItem() == "Octal")
            {   
                disableButtons2();
                disableButtons(); 
                op1Field.setEnabled(true);
                op2Field.setEnabled(true); 

                long opA = Long.parseLong(op1Field.getText());
                long opB = Long.parseLong(op1Field.getText());
                if((isOctal(opA) == true )&&(isOctal(opB)==true))             // check number for octal
                {
                    if((dtBox.getSelectedItem()== "Integer") || (dtBox.getSelectedItem()== "Long"))
                    {

                        // ----------ADD--------------
                        if(addButton.isSelected() == true)
                        {   
                            long op1 = Long.parseLong(op1Field.getText(),8);
                            long op2 = Long.parseLong(op2Field.getText(),8);
                            long result = op1 + op2;

                            resultField.setText(Long.toOctalString(result));
                        }
                        // ----------SUBTRACT--------------
                        else if(minusButton.isSelected() == true)
                        {   
                            long op1 = Long.parseLong(op1Field.getText(),8);
                            long op2 = Long.parseLong(op2Field.getText(),8);
                            long result = op1 - op2;
   
                            resultField.setText(Long.toOctalString(result));
                        }
                        // ----------MULTIPLY--------------
                        else if(multiplyButton.isSelected() == true)
                        {   
                            long op1 = Long.parseLong(op1Field.getText(),8);
                            long op2 = Long.parseLong(op2Field.getText(),8);
                            long result = op1 * op2;

                            resultField.setText(Long.toOctalString(result));
                        }
                        // ----------DIVIDE--------------
                        else if(divideButton.isSelected() == true)
                        {   
                            long op1 = Long.parseLong(op1Field.getText(),8);
                            long op2 = Long.parseLong(op2Field.getText(),8);
                            //if(op2 == 0)                                                // exception for op1/0;
                            //    resultField.setText("Divison by 0 not possible");
                            long result = op1 / op2;
                            
                            resultField.setText(Long.toOctalString(result));                          
                        }
                        // ----------MOD--------------

                        else if(modButton.isSelected() == true)
                        {   
                            long op1 = Long.parseLong(op1Field.getText(),8);
                            long op2 = Long.parseLong(op2Field.getText(),8);
                            long result = op1 % op2;

                            resultField.setText(Long.toOctalString(result));

                        }
                    }
                    
                    else if((dtBox.getSelectedItem()== "Short") || (dtBox.getSelectedItem()== "Byte") || (dtBox.getSelectedItem()== "Float") || (dtBox.getSelectedItem()== "Double"))
                    {
                        resultField.setText("Select Integer or Long");
                    }                   

                }
                else
                    resultField.setText("Number is not Octal");
            }
            //######################################################################
            else if(nsBox.getSelectedItem()== "Hexa Decimal")
            {   
                disableButtons2();
                disableButtons(); 
                String opA = op1Field.getText();
                String opB = op2Field.getText();
                if((isHex(opA.toUpperCase()) == true )&&(isHex(opB.toUpperCase())==true))             // check number for hexa deci
                {
                    if((dtBox.getSelectedItem()== "Integer") || (dtBox.getSelectedItem()== "Long"))
                    {

                        // ----------ADD--------------
                        if(addButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);                           // enable op Fields

                            long op1 = Long.parseLong(op1Field.getText(),16);
                            long op2 = Long.parseLong(op2Field.getText(),16);
                            long result = op1 + op2;

                            resultField.setText(Long.toHexString(result).toUpperCase());
                        }
                        // ----------SUBTRACT--------------
                        else if(minusButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);                          // enable op Fields

                            long op1 = Long.parseLong(op1Field.getText(),16);
                            long op2 = Long.parseLong(op2Field.getText(),16);
                            long result = op1 - op2;  
                            
                            resultField.setText(Long.toHexString(result).toUpperCase());

                        }
                        // ----------MULTIPLY--------------
                        else if(multiplyButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);                          // enable op Fields

                            long op1 = Long.parseLong(op1Field.getText(),16);
                            long op2 = Long.parseLong(op2Field.getText(),16);
                            long result = op1 * op2;

                            resultField.setText(Long.toHexString(result).toUpperCase());
                        }
                        // ----------DIVIDE--------------
                        else if(divideButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);                          // enable op Fields

                            long op1 = Long.parseLong(op1Field.getText(),16);
                            long op2 = Long.parseLong(op2Field.getText(),16);
                            //if(op2 == 0)                                                // exception for op1/0;
                            //    resultField.setText("Divison by 0 not possible");
                            long result = op1 / op2;
                            
                            resultField.setText(Long.toHexString(result).toUpperCase().toUpperCase());

                        }
                        // ----------MOD--------------

                        else if(modButton.isSelected() == true)
                        {   
                            op1Field.setEnabled(true);
                            op2Field.setEnabled(true);                          // enable op Fields

                            long op1 = Long.parseLong(op1Field.getText(),16);
                            long op2 = Long.parseLong(op2Field.getText(),16);
                            long result = op1 % op2;

                            resultField.setText(Long.toHexString(result).toUpperCase());

                        }
                    }
                    
                    else if((dtBox.getSelectedItem()== "Short") || (dtBox.getSelectedItem()== "Byte") || (dtBox.getSelectedItem()== "Float") || (dtBox.getSelectedItem()== "Double"))
                    {
                        resultField.setText("Select Integer or Long");
                    }  
                }
                else
                    resultField.setText("Number is not Hexa Decimal");
            }
            
        }   
        
        catch(NumberFormatException ex){
            resultField.setText("Enter Valid Numbers");}
        catch(ArithmeticException ex){
            resultField.setText("Division by 0 not possible");}
             
    }   // end of action method
    
    // MAIN METHOD
    public static void main(String[] args) {
       CalculatorMid frame = new CalculatorMid();                                               // call of class check JFrame
       final int width = 600, height = 700;                                     // width and height of window frame

        frame.setBounds(8, 8, width, height);
        frame.setTitle("Calculator");                                           // title 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   // exit app
    frame.setResizable(false);                                              // window not resizeable
       
        frame.setVisible(true);
        
        System.out.println("\nName: MUHAMMAD UZAIR\nReg no: FA21-BCS-074\nClass: CS-2B\nSubmitted to: Mr. Mustafa Khattak\nDate: 5/15/2022");
       
    }                                       // end of main
    
}   // end of class