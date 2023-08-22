package calculadoraIMC.IMC.Controller;

import calculadoraIMC.IMC.Model.M_calculadora;
import calculadoraIMC.IMC.Service.S_calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_calcu {

        @GetMapping("/")
        public String helloWorld() {
            return "Home";
        }

        @PostMapping("/")
        public String calc(@RequestParam("altura") double altura,
                                @RequestParam("peso") double peso,
                                Model model) {
            M_calculadora m_calculadora = S_calculadora.calcularIMC(altura,peso);

            model.addAttribute("imc", m_calculadora.getSomaIMC());
            model.addAttribute("resultado", m_calculadora.getResultado());

            return "Home";
        }
}
