package br.com.ifba;

import br.com.ifba.cursos.view.CursoTela;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CursoSave {

	public static void main(String[] args) {
             ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(CursoSave.class)
                .headless(false).run(args);
        
            CursoTela telalistar = context.getBean(CursoTela.class);
            telalistar.setVisible(true);
}
             
}
