package com.sat.listener;

import com.sat.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "kafka_consume", groupId = "group_id")
    public void consumer(String message){
        System.out.println("Consumed Message: "+message);
    }

/*    @KafkaListener(topics = "kafka_consume", groupId = "group_id_json",containerFactory = "KafkaUSerListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("Consumed Json Message: "+user);
    }*/
}
