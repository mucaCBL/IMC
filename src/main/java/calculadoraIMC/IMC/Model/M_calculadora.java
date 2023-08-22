package calculadoraIMC.IMC.Model;

public class M_calculadora {

    private double somaIMC;
    private String resultado;

    public M_calculadora( double somaIMC, String resultado) {
        this.somaIMC = somaIMC;
        this.resultado = resultado;
    }

    public M_calculadora() {

    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getSomaIMC() {
        return somaIMC;
    }

    public void setSomaIMC(double somaIMC) {
        this.somaIMC = somaIMC;
    }
}
