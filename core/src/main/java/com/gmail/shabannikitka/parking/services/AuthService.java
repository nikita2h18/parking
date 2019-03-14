package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.AuthenticationRenterDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.Token;
import com.gmail.shabannikitka.parking.exception.AuthenticationException;
import com.gmail.shabannikitka.parking.exception.NoSuchEntityException;
import com.gmail.shabannikitka.parking.repositories.RenterCredentialsRepository;
import com.gmail.shabannikitka.parking.repositories.TokenRepository;
import com.gmail.shabannikitka.parking.sequrity.TokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AuthService {

    @Autowired
    private final RenterCredentialsRepository renterCredentialsRepository;
    @Autowired
    private final TokenRepository tokenRepository;

    public AuthService(RenterCredentialsRepository renterCredentialsRepository, TokenRepository tokenRepository) {
        this.renterCredentialsRepository = renterCredentialsRepository;
        this.tokenRepository = tokenRepository;
    }

    public String authenticate(AuthenticationRenterDto authenticationRenterDto) throws AuthenticationException, NoSuchEntityException {
        Renter renter = renterCredentialsRepository.findByLogin(authenticationRenterDto.login)
                .orElseThrow(() -> new NoSuchEntityException("No such renter"))
                .getRenter();

        Token token = new Token(renter, TokenGenerator.generate());

        return tokenRepository.save(token).getToken();
    }
}
