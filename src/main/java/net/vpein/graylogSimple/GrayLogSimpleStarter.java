package net.vpein.graylogSimple;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Log
@Component
public class GrayLogSimpleStarter implements CommandLineRunner{


    public void run(String[] args) throws Exception {
        log.info("application started");
    }
}