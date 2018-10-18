package pl.krakow.uek.djkscrapper.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import pl.krakow.uek.djkscrapper.entity.dto.WebsiteDto;

public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @KafkaListener(topics = "${spring.kafka.topic.pageToScrap}")
    public void receive(WebsiteDto payload) {
        LOGGER.info("received payload='{}'", payload);

    }
}
