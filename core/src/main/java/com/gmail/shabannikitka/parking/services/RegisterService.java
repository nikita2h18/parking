package com.gmail.shabannikitka.parking.services;


import com.gmail.shabannikitka.parking.dto.RegisterRenterDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.RenterCredentials;
import com.gmail.shabannikitka.parking.entity.RenterInfo;
import com.gmail.shabannikitka.parking.exception.RegistrationException;
import com.gmail.shabannikitka.parking.repositories.RenterCredentialsRepository;
import com.gmail.shabannikitka.parking.repositories.RenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RegisterService {

    private final RenterCredentialsRepository renterCredentialsRepository;
    private final RenterRepository renterRepository;

    public RegisterService(RenterCredentialsRepository renterCredentialsRepository, RenterRepository renterRepository) {
        this.renterCredentialsRepository = renterCredentialsRepository;
        this.renterRepository = renterRepository;
    }

    public void register(RegisterRenterDto registerRenterDto) throws RegistrationException {
        if (renterCredentialsRepository.findByLogin(registerRenterDto.login).isPresent()) {
            throw new RegistrationException("user with such login already exist");
        }

        Renter renter = new Renter();

        renterRepository.save(renter);
        //TODO: save renter info

        renter.setRenterCredentials(new RenterCredentials(renter, registerRenterDto.login, registerRenterDto.hash));
        renterRepository.save(renter);

    }
}
