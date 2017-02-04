package curp;

import javax.swing.JOptionPane;

/**
 *
 * @author KB-01
 */
public class curp {

    int dia = 0;
    int ano = 0;
    int mes = 0;
    
    public curp() {
        
    }
    
    public void getFecha(String a, String b, String c) {
        
        dia = Integer.parseInt(a);
        mes = Integer.parseInt(b);
        ano = Integer.parseInt(c);
        
        JOptionPane.showMessageDialog(null, "La fecha es: " + dia + "/" + mes + "/" + ano);
    }
    
    
}
