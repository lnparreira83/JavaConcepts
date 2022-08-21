import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Conversor extends JFrame{

    private JButton bLimpar;
    private JButton bConverter;
    private JTextField tfValor1;
    private JTextField tfValor2;
    private JLabel lUnidade1, lUnidade2;
    DecimalFormat df = new DecimalFormat("###,##0.00");

    public Conversor(){
        super("Conversor");
        lUnidade1 = new JLabel("Celsius");
        lUnidade2 = new JLabel("Fahrenheit");
        tfValor1 = new JTextField();
        tfValor2 = new JTextField();
        bLimpar = new JButton("Limpar");
        bLimpar.setToolTipText("limpa as caixas de entrada");
        bConverter = new JButton("Converter");
        bConverter.setToolTipText("Efetua a conversão do valor dado");
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(3,2,5,5));
        cp.add(lUnidade1);
        cp.add(tfValor1);
        cp.add(lUnidade2);
        cp.add(tfValor2);
        cp.add(bLimpar);
        cp.add(bConverter);
        bLimpar.addActionListener(
                (e) -> { bLimparClick();}
        );
        bConverter.addActionListener(
                (e) -> { bConverterClick();}
        );
        cp.setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void bConverterClick() {
        if(tfValor2.getText().equals("") && !tfValor1.getText().equals("")){
            try{
                double res = 9*Double.parseDouble(tfValor1.getText())/5 + 32;
                tfValor1.setText("");
                tfValor2.setText("" + df.format(res));
            } catch(NumberFormatException exc){
                tfValor1.selectAll();
                tfValor1.requestFocus();
                Toolkit.getDefaultToolkit().beep();
            }
        } else if(tfValor1.getText().equals("") && !tfValor2.getText().equals("")){
            try{
                double res = 5*(Double.parseDouble(tfValor2.getText())-32)/9;
                tfValor2.setText("");
                tfValor1.setText("" + df.format(res));
            } catch(NumberFormatException exc){
                tfValor2.selectAll();
                tfValor2.requestFocus();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    private void bLimparClick() {
        tfValor1.setText("");
        tfValor2.setText("");
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

}
