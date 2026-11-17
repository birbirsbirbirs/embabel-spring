package co.ptm.embabel_spring.config;

import co.ptm.embabel_spring.service.DadJokeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class EmbabelSpringCommandLineRunner implements CommandLineRunner {
    private  final DadJokeService dadJokeService;

    @Override
    public void run(String... args) throws Exception {
        String s = dadJokeService.tellOneLinerDadJoke();
        log.info("Dad joke is: {}", s);
    }
}
