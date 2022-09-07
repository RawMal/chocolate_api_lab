package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/chocolates")

public class ChocolateController {

        @Autowired
        ChocolateRepository chocolateRepository;

        @GetMapping
        public ResponseEntity<List<Chocolate>> getChocolates() {
            List<Chocolate> chocolates = chocolateRepository.findAll();
            return new ResponseEntity<>(chocolates, HttpStatus.OK);
        }
    }

