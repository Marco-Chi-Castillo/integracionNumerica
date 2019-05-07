
package tema4;

public class ctrlIntegraciones {

    private csEntrada entrada;

    public ctrlIntegraciones(csEntrada entrada) {
        this.entrada = entrada;
    }

    private double fx(double x) {
        return Math.sqrt(1 + Math.pow(x, 2));
        //return Math.pow(Math.E, -1*Math.pow(x, 2));
        //return Math.pow(x, 3) - 2*Math.pow(x,2) + x + 2;
       // return 3*Math.pow(x, 3) + 5*x -1; //ejercicio 1
        // return Math.pow(x, 4) + Math.pow(x, 3) - Math.pow(x, 2) + x + 3;
        // return Math.pow(Math.E, x);
        //return Math.sin(x);
    }

    public double Trapecio() {
        double integral;
        double suma = 0;
        double fa = this.fx(this.entrada.getA());

        double fb = this.fx(this.entrada.getB());

        integral = fa + fb;
        for (int i = 1; i <= this.entrada.getN() - 1; i++) {
            suma += this.fx(this.entrada.getH() * i + this.entrada.getA());
        }
       
        integral = (integral + 2 * suma) * (this.entrada.getH() / 2);

        return integral;
    }

    public double Simpson() {
        double integral;
        double suma1 = 0, suma2 = 0;

        double fa = this.fx(this.entrada.getA());
        double fb = this.fx(this.entrada.getB());

        for (int i = 1; i < this.entrada.getN(); i++) {
            if(i % 2 == 0){
                suma2 += this.fx(this.entrada.getH() * i + this.entrada.getA());
            }else{
                suma1 += this.fx(this.entrada.getH() * i + this.entrada.getA());
            }
        }
        
        integral = (fa + (4*suma1) + (2*suma2) + fb) * (this.entrada.getH() / 3);
        return integral ;
    }
}
