package edu.wgu.d387_sample_code.translation;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConvert {
    public static String getTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        //Set timezones based of zonedDateTime per respective zone
        ZonedDateTime ET = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

        //Set time formatting to hour/minutes
        String timeFormat = "hh:mm a";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(timeFormat);

        return ET.format(dateTimeFormatter) + " ET, " + MT.format(dateTimeFormatter) + " MT, " + UTC.format(dateTimeFormatter) + " UTC ";


    }
}
