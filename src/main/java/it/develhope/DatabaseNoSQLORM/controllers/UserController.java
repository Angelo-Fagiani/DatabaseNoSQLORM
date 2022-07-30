package it.develhope.DatabaseNoSQLORM.controllers;

import it.develhope.DatabaseNoSQLORM.entities.Users;
import it.develhope.DatabaseNoSQLORM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    //UserRepository è necessario per creare gli utenti e comunicarli al nostro mongoDb
    @Autowired
    private UserRepository userRepository;

    //possiamo anche crearlo con medoto void
    @PostMapping(value ="", produces = "application/json")
    public Users createUser(@RequestBody Users users){
        return userRepository.save(users);
    }

    //Con questo metodo prendiamo tutti gli utenti
    @GetMapping
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }
    //Questo metodo invece, ricerca l'utente inserendo l'id

    //Con questo ricerchiamo un utente tramite ID
    @GetMapping("/{id}")
    public Optional<Users> getUser(@PathVariable String id){
        return userRepository.findById(id);
    }

    //Con questo metodo modifichiamo un utente già presente nel DB
    @PutMapping(value = "/{id}")
    public Users editUser(@PathVariable String id, @RequestBody Users user){
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping(value = "{id}")
    public void deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
    };

}
