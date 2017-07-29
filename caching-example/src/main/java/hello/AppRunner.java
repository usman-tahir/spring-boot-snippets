package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final BookRepository bookRepository;

    public AppRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Fetching books...");
        logger.info("isbn-0001 -->" + bookRepository.getByIsbn("isbn-0001"));
        logger.info("isbn-0002 -->" + bookRepository.getByIsbn("isbn-0002"));
        logger.info("isbn-0003 -->" + bookRepository.getByIsbn("isbn-0003"));
        logger.info("isbn-0004 -->" + bookRepository.getByIsbn("isbn-0004"));
        logger.info("isbn-0005 -->" + bookRepository.getByIsbn("isbn-0005"));
        logger.info("isbn-0006 -->" + bookRepository.getByIsbn("isbn-0006"));
    }
}