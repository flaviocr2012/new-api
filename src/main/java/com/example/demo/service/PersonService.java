package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PersonService {

    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDAO.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDAO.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personDAO.deletePersonById(id);

    }

    public int updatePerson(UUID id, Person person) {
        return personDAO.updatePersonById(id, person);
    }
}
