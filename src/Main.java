import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Lógica", "Pensamento lógico.", 10);
        //System.out.println(curso1);
        Curso curso2 = new Curso("Java", "Introdução Java.", 22);
        //System.out.println(curso2);
        Mentoria mentoria = new Mentoria("Desafio", "Resoluções.", LocalDate.now().plusDays(3));
        //System.out.println(mentoria);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Super Java Dev");
        bootcamp.setDescricao("Superior Desenvolvedor Java Jr.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        devAna.progredir();
        System.out.println(devAna.calcularTotalXP());

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        devJohn.progredir();
        devJohn.progredir();
        System.out.println(devJohn.getConteudosConcluidos());

        System.out.println(devAna);
        System.out.println(devJohn);
        
    }

}
