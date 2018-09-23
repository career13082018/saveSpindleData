package com.concretepage.listener;

import com.concretepage.entity.SpindleMachineDetailsBean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.concretepage.service.MachineSpindleService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class KafkaConsumer {

    @Autowired
    private MachineSpindleService machineSpindleService;

    @KafkaListener(topics = "mqtt-listener-topic",containerFactory = "kafkaListenerContainerFactory")
    public void consume(SpindleMachineDetailsBean spindleMachineBean) {
        System.out.println("Consumed message: " + spindleMachineBean.getMachineUUID());
        System.out.println("Consumed message: " + spindleMachineBean.getSpindleMaster());
        System.out.println("Consumed message: " + spindleMachineBean.getSpindleMasterDetailsSet());

        machineSpindleService.addSpindleData(spindleMachineBean);
    }

    /*@KafkaListener(topics = "mqtt-listener-topic")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }*/


   /* @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }*/
}
