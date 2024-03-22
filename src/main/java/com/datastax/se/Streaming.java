package com.datastax.se;

import org.apache.pulsar.client.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Streaming {

    private static volatile Streaming instance;
    private static final Object lock = new Object();
    //private final PulsarClient client;
    private PulsarClient client = null;
    private Producer<TelemetryData> producer = null;
    private static final String SERVICE_URL = "pulsar+ssl://pulsar-gcp-uscentral1.streaming.datastax.com:6651";
    private static final String PULSAR_TOKEN = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTEwNzI1ODYsImlhdCI6MTcxMDQ2Nzc4NiwiaXNzIjoiZGF0YXN0YXgiLCJzdWIiOiJjbGllbnQ7OTY5NTJlNmMtN2ZlMC00MjEwLThjZDktNmY3MmMzNmU4YzU2O2JYVnNiR1Z1O2U3OWJlYjAyNzQiLCJ0b2tlbmlkIjoiZTc5YmViMDI3NCJ9.FFWFpM4qn5TKMCboAAA8Koj6wlmRrmcZddDBpuozXwzcFUsNizVwIkUIvifWqbB_vWXwmQpUwv5Bz1Qa7jaXMBqZcOmQZPqmONd5RAvdiV1OVwQlbjISmNnuG9UMOl157NsR-v0kUHZDySAlQbqdNSCjT-Q-OJul29xPGwFPD5Nrwr4sJXFRmhxbQeDP1SlHTrfpRQicTnTL1Vt2bbMQbbkqPQ9nbk5t15pDWI19OIbFb57JKigu94a303_R59OfFGhVoiEgGFOSAGijUz2rEeCbqR9i63IFB_gIymKZ2sMS0ntq4O67qJiZ4LTzMmszl83xW7gJWOh3FldKUZ2tgw";
    private static final Logger logger = LoggerFactory.getLogger(TelemetryData.class);

    public static Streaming getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    try {
                        instance = new Streaming();
                    } catch (Exception e) {
                        throw new RuntimeException("Error creating PulsarSingleton instance", e);
                    }
                }
            }
        }
        return instance;
    }

    private Streaming() throws PulsarClientException {
        client = PulsarClient.builder()
                .serviceUrl(SERVICE_URL)
                .authentication(
                        AuthenticationFactory.token(PULSAR_TOKEN)
                )
                .build();
        producer = client.newProducer(Schema.AVRO(TelemetryData.class))
                .topic("<your streaming EP here>")
                .create();
    }

    public void produce(TelemetryData data) throws PulsarClientException {
            producer.send(data);
    }

    public void close() throws PulsarClientException {
        producer.close();
        client.close();
    }

    private void silence() {
        Schema<TelemetryData> avro = Schema.AVRO(TelemetryData.class);

    }
}
