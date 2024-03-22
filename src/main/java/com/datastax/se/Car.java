package com.datastax.se;
import org.apache.pulsar.client.api.PulsarClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Car implements Runnable {

    private String vin;
    private static final Logger logger = LoggerFactory.getLogger(Car.class);
    public Car(String vin) {
        this.vin = vin;
        logger.info("New Car " + this.vin + "running");
    }

    @Override
    public void run() {
        while (true) {
            TelemetryData data =new TelemetryData(this.vin);
            logger.info(data.toString());
            try {
                Streaming.getInstance().produce(data);
            } catch (PulsarClientException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
