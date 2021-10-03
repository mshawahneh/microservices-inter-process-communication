/**
 * 
 */
package org.bzu.exp.kafka;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mshawahn
 *
 */
@Slf4j
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);
	
	@KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public <T> void receive(T payload) {
        log.info("received payload='{}'", payload);
       
        latch.countDown();
    }
}
