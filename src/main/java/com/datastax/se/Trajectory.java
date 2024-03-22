package com.datastax.se;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Trajectory {

    public static class LocationData {
        public double lat;
        public double lon;
        public double alt;
        public double dateTime;
        public String date;
        public String time;
        public int trajectory;
    }

    private static final Logger logger = LoggerFactory.getLogger(Trajectory.class);

    public static void main(String[] args) throws IOException {

        List<Map<String, String>> response = new LinkedList<Map<String, String>>();
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        MappingIterator<LocationData> iterator = null;
        try {
            iterator = mapper.readerFor(LocationData.class)
                    .with(schema)
                    .readValues(new File("/Users/pedropacheco/Projects/Geolife Trajectories 1.3/trajectory.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            while (iterator.hasNextValue()) {
                LocationData ld = iterator.nextValue();
                logger.info("jsonObject: {}", ld);
            }
        } finally {
            iterator.close();
        }


    }
}