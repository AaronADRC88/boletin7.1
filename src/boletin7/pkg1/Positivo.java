
package boletin7.pkg1;

import javax.swing.JOptionPane;

public class Positivo {
    public double numero;
    
    public Positivo(){
        }
    public Positivo(double n){
        this.numero=n;
    }
     public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }
        public double pedirDato(){
        String respuesta = JOptionPane.showInputDialog("Introduce  dato");
        double b = Double.parseDouble(respuesta);
        return b;
    }
        public void comparacionSimple (double numero){
        if (numero>0){
            JOptionPane.showMessageDialog(null, "O numero "+numero+" é positivo ");
        }      
}
}