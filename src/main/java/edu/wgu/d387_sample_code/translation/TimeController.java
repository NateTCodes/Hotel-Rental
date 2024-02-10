package edu.wgu.d387_sample_code.translation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimeController {
    @GetMapping("/presentation")
    public ResponseEntity<String> livePresentation() {
        String startTime = "A live presentation will begin at: " + TimeZoneConvert.getTime();
        return new ResponseEntity<String> (startTime, HttpStatus.OK);
    }
}
