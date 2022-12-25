package com.example.domasna2.service;
import com.example.domasna2.repository.JPA.UserRepository;
import com.example.domasna2.model.Userr;
import com.example.domasna2.model.exceptions.PasswordsDoNotMatchException;
import com.example.domasna2.model.exceptions.InvalidUserCredentialsException;
import com.example.domasna2.model.exceptions.UsernameAlreadyExistsException;
import com.example.domasna2.model.exceptions.InvalidArgumentsException;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Userr login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCredentialsException::new);
    }

    @Override
    public Userr register(String username, String password, String repeatPassword, String name, String surname,String telefon,
                          String pol, String email) {
        if (username==null || username.isEmpty()  || password==null || password.isEmpty())
            throw new InvalidArgumentsException();
        if (!password.equals(repeatPassword))
            throw new PasswordsDoNotMatchException();
        if(this.userRepository.findByUsername(username).isPresent()
        )
            throw new UsernameAlreadyExistsException(username);

        Userr user = new Userr(username,password,name,surname,telefon,pol,email);
        return userRepository.save(user);
    }
}

