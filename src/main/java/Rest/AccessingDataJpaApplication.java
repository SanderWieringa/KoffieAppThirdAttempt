package Rest;

import Rest.Entities.KoffieApparaatItem;
import Rest.Entities.Milk;
import Rest.Entities.Sugar;
import Rest.Repositories.KoffieApparaatItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.logging.Logger;

public class AccessingDataJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KoffieAppApplication.class, args);
    }


    private final static Logger log = Logger.getLogger(String.valueOf(AccessingDataJpaApplication.class));

    @Bean
    public CommandLineRunner demo(KoffieApparaatItemRepository repository) {
        return (args) -> {
            ArrayList<Sugar> sugar = new ArrayList<Sugar>();
            ArrayList<Milk> milk = new ArrayList<Milk>();

            // save a few customers
            repository.save(new KoffieApparaatItem(1, "Cappuccino", 0.60, sugar, milk));
            repository.save(new KoffieApparaatItem(2, "Black coffee", 0.50, sugar, milk));
            repository.save(new KoffieApparaatItem(3, "Latte", 0.60, sugar, milk));
            repository.save(new KoffieApparaatItem(4, "aids", 0.60, sugar, milk));

            // fetch all customers
            log.info("KoffieApparaatItems found with findAll():");
            log.info("-------------------------------");
            for (KoffieApparaatItem koffieApparaatItem : repository.findAll()) {
                log.info(koffieApparaatItem.toString());
            }
            log.info("");
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }
}
