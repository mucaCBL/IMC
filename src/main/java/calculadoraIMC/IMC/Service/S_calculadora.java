package calculadoraIMC.IMC.Service;

import calculadoraIMC.IMC.Model.M_calculadora;

public class S_calculadora {

    public static M_calculadora calcularIMC(double altura, double peso) {

        altura = altura / 100;
        double imc = peso / (altura * altura);

        M_calculadora m_calculadora = new M_calculadora();

        String resultado;

        if (imc < 18.5) {
            resultado = "Magreza grave";
        } else if (imc < 24.9) {
            resultado = "Peso saudável";
        } else if (imc < 30) {
            resultado = "Sobrepeso";
        } else if (imc < 34.9) {
            resultado = "Obesidade Grau I";
        } else if (imc < 34.9 && imc > 40) {
            resultado = "Obesidade Grau II (severa)";
        } else {
            resultado = "Obesidade Grau III (mórbida)";
        }

        m_calculadora.setSomaIMC(imc);
        m_calculadora.setResultado(resultado);
        return m_calculadora;
    }
}
