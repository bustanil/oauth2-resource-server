package com.bustanilarifin.resserver1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class ProtectedApiController {

    @PostMapping("/protected/api")
    public ResponseEntity<?> api(){
        return ResponseEntity.ok(Collections.singletonMap("protected", "api"));
    }

}
