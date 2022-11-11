package com.cursoBackEndFiado.projeto_fiado_curso.controller;

import com.twilio.Twilio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
public class SmsController {
    @GetMapping(value = "api/sendSMS")
    public ResponseEntity<String> sendSMS() {

        Twilio.init("AC576078e26a5f50811876be3e97a2d325","04a10560d3ef2d24caf8317b14a67ee6");

        Message.creator(new PhoneNumber("5514996110553"),
                new PhoneNumber("18585440187"), "Hello from Twilio 📞").create();

        return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }
}
