package br.com.ifba;

import br.com.ifba.cursos.entity.Curso;
import br.com.ifba.cursos.repository.CursoRepository;
import br.com.ifba.cursos.view.CursoTela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CursoSave {

    @Autowired
    private CursoRepository cursoRepository;
    
	public static void main(String[] args) {
             ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(CursoSave.class)
                .headless(false).run(args);
        
            CursoTela telalistar = context.getBean(CursoTela.class);
            telalistar.setVisible(true);
            
           
            
         
        
    }
   
}