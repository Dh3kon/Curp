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
    String sexo = "";
    String estado = "";

    public curp() {

    }

    public void getFecha(String a, String b, String c) {

        dia = Integer.parseInt(a);
        mes = Integer.parseInt(b);
        ano = Integer.parseInt(c);

    }

    public void getSexo(String radio) {

        sexo = radio;
    }

    public void getEstado(String boxEstado) {

        estado = boxEstado;
    }

    public void mostrarDados() {

        JOptionPane.showMessageDialog(null, "La fecha es: " + dia + "/" + mes + "/" + ano);
        JOptionPane.showMessageDialog(null, "El boton de radio selelccionado es: " + sexo);
        JOptionPane.showMessageDialog(null, "El item del combo box es: \n" + estado);
    }

}
