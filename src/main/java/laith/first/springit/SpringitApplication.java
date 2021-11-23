package laith.first.springit;

/*
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
*/
import laith.first.springit.domain.Comment;
import laith.first.springit.domain.Link;
import laith.first.springit.repository.CommentRepository;
import laith.first.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/*
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
*/

@SpringBootApplication
@EnableJpaAuditing // dont forget otherwise the auditing will not work if you forget this annotation
public class SpringitApplication {
 /*   private static final Logger log= LoggerFactory.getLogger(SpringitApplication.class);
   */
 public static void main(String[] args) {

    SpringApplication.run(SpringitApplication.class, args);

    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
     return args -> {
         Link link= new Link("Getting Started with spring boot 2 ","https://therealdanvega.com/spring-boot-2");
         linkRepository.save(link);
         Comment comment = new Comment("This spring boot 2 link is awesome",link);
         commentRepository.save(comment);
         link.addComment(comment);
        /* System.out.println(link.toString());
         System.out.println(link.getComments());*/

 /*        Link firstLink = linkRepository.findByTitle("Getting Started with spring boot 2 ");
         System.out.println("This the comment that we want to print"+firstLink.getTitle());*/
     };
    }







 /*   @Bean
    CommandLineRunner runner(){
        return args -> {
            log.error("CommandLineRunner.run()");
            log.warn("CommandLineRunner.run()");
            log.info("CommandLineRunner.run()");
            log.debug("CommandLineRunner.run()");
            log.trace("CommandLineRunner.run()");

        };
    }

*/
}