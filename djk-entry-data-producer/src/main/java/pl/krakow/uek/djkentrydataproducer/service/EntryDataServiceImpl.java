package pl.krakow.uek.djkentrydataproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.krakow.uek.djkentrydataproducer.entity.Website;
import pl.krakow.uek.djkentrydataproducer.kafka.producer.Sender;

@Component
public class EntryDataServiceImpl implements EntryDataService {

    @Value("${spring.kafka.topic.pageToScrap}")
    private String PAGE_TO_SCRAP_TOPIC;

    private Sender sender;

    @Autowired
    public EntryDataServiceImpl(Sender sender) {
        this.sender = sender;
    }

    @Override
    public Website scrap(Website website) {
        sender.send(PAGE_TO_SCRAP_TOPIC, website);
        return website;
    }
}
