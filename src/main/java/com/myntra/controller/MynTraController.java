package com.myntra.controller;

import com.myntra.registration.Delivery;
import com.myntra.registration.Payment;
import com.myntra.registration.UserRegistration;
import com.myntra.repository.DeliveryRepo;
import com.myntra.repository.MynTraRepo;
import com.myntra.repository.PaymentRepo;
import com.myntra.service.MynTraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MynTraController {

    @Autowired
    MynTraService mynTraService;

    @Autowired
    MynTraRepo mynTraRepo;

    @Autowired
    PaymentRepo paymentRepo;

    @Autowired
    DeliveryRepo deliveryRepo;

    @PostMapping
    public String addUserRegistrationDetails(@RequestBody UserRegistration userRegistration){
             mynTraRepo.saveAndFlush(userRegistration);
             return  "User Registration Details Added Successfully";
    }
    @PostMapping
    public String addPaymentDetails(@RequestBody Payment payment){
        paymentRepo.saveAndFlush(payment);
        return "Payment Details Added Successfully";
    }

    @PostMapping
    public String addDeliveryDetails(@RequestBody Delivery delivery){
        deliveryRepo.saveAndFlush(delivery);
        return  "Delivery Details Added Successfully";
    }

    @GetMapping("/UserDetails/{registrationId}")
    public UserRegistration retrieveUserRegistrationDetail(@PathVariable String registrationId){
        return  mynTraService.getUserDetail(registrationId);

    }

    @GetMapping("{pinCode}")
    public Delivery retrieveDeliveryDetails(@PathVariable String pinCode){
          return mynTraService.getDeliveryDetails(pinCode);
    }

    @GetMapping("{userId}")
    public UserRegistration getUserDetailsByPinCode(@PathVariable String userId){
        return mynTraService.retrieveUserDetail(userId);

    }

}
