package com.gmail.shabannikitka.parking.services;


import com.gmail.shabannikitka.parking.dto.RegisterRenterDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.RenterCredentials;
import com.gmail.shabannikitka.parking.entity.RenterInfo;
import com.gmail.shabannikitka.parking.exception.RegistrationException;
import com.gmail.shabannikitka.parking.repositories.RenterCredentialsRepository;
import com.gmail.shabannikitka.parking.repositories.RenterRepository;
import com.gmail.shabannikitka.parking.sequrity.Hasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RegisterService {

    @Autowired
    private final RenterCredentialsRepository renterCredentialsRepository;
    @Autowired
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

        renter.setRenterCredentials(new RenterCredentials(renter, registerRenterDto.login, Hasher.getHash(registerRenterDto.password)));
        renter.setRenterInfo(new RenterInfo(renter, registerRenterDto.firstName, registerRenterDto.secondName, registerRenterDto.patronymic, registerRenterDto.passportNumber));
        renterRepository.save(renter);
    }
}
