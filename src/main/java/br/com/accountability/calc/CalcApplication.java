package br.com.accountability.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages = "br.com.accountability.calc")
@EntityScan(basePackages = "br.com.accountability.calc.sistema.pagamento.model")
public class CalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalcApplication.class, args);
    }

}
