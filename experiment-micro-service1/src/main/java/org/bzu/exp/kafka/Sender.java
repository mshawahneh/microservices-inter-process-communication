/**
 * 
 */
package org.bzu.exp.kafka;


import org.bzu.exp.model.ExpModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;


import lombok.extern.slf4j.Slf4j;

/**
 * @author mshawahn
 *
 */
@Slf4j
@Component
public class Sender<T> {

	private KafkaTemplate<String, T> kafkaTemplate;
	
	public void send(String topic, T data) {
		log.info(" %%% device-support-servcie %%%  Sending Kafka message, topic {} ,  Value {}", topic, data);
		
		kafkaTemplate.send(topic, data);
	}
	
	/*
	 * 
	 *  MessageProducer Class & Bean of this class
	 *  	is the class used to prepare the Kafka message to be sent when event triggered.
	 *  	Currently the used attribute used in class of DeviceDelete is deviceId. 
	 *  	other attributes can be added later on
	 * 
	 * 
	 * */
	
	@Bean
	public MessageProducer messageProducer() {
		return new MessageProducer();
	}
	
	public static class MessageProducer {
		@Autowired
		private KafkaTemplate<String, ExpModel> doctorKafkaTemplate;

		@Value(value = "deviceTopic")
		private String topicName;
		public void sendDeviceDeleteMessage(Long deviceId) {

			ExpModel expModel = new ExpModel();
			//deviceDelete.setDeviceId(deviceId);
			
			ListenableFuture<SendResult<String,ExpModel>> future = doctorKafkaTemplate.send(topicName,expModel);
			
			future.addCallback(new ListenableFutureCallback<SendResult<String, ExpModel>>() {

				@Override
				public void onSuccess(SendResult<String, ExpModel> result) {
					log.info("%%%%% Message Sent = {} %%%", expModel);
					
				}

				@Override
				public void onFailure(Throwable ex) {
					log.info("Unable to Send message = [ Kafka Message ] due to : " + ex.getMessage());
					
				}
				
			});
		}
	}
	
}
