package com.email.sender.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    
    @GetMapping("/email")
    public ResponseEntity<String> enviarEmail(){
        try {
            return ResponseEntity.ok()
            .body("Email enviado sastifactoriamente.");
        } catch (Exception e) {
            return ResponseEntity.ok()
            .body("Email no se pudo enviar.");
        }
        
    }
}
