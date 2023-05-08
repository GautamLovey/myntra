package com.myntra.service;

import com.myntra.registration.Address;
import com.myntra.registration.Delivery;
import com.myntra.registration.UserRegistration;
import com.myntra.repository.DeliveryRepo;
import com.myntra.repository.MynTraRepo;
import com.myntra.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MynTraService {
    @Autowired
    DeliveryRepo deliveryRepo;

    @Autowired
    MynTraRepo mynTraRepo;

    @Autowired
    PaymentRepo paymentRepo;

    public UserRegistration getUserDetail(String registrationId){
        Optional<UserRegistration> userRegistration = mynTraRepo.findById(registrationId);
        UserRegistration userRegistration1 = userRegistration.get();
        return  userRegistration1;

    }
//findbyaddress-pincode
    public Delivery getDeliveryDetails(String pinCode) {
        List<Delivery> deliveryList = deliveryRepo.findAll();
        for (Delivery delivery : deliveryList) {
            if (pinCode.equals(delivery.getAddress().getPinCode())) {
                return delivery;

            }
        }
        return new Delivery();
    }
    public UserRegistration retrieveUserDetail(String userId){
          List<UserRegistration> userRegistrationList = mynTraRepo.findAll();
          for(UserRegistration userRegistration : userRegistrationList){
              if(userId.equals(userRegistration.getSignUp().getUserId())){
                  return userRegistration;
              }
          }
          return new UserRegistration();
    }

}
