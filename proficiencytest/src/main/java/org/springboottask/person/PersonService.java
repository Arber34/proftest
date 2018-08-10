package org.springboottask.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

   public List<Person> getAllPersons() {

       List<Person> people = new ArrayList<>();
       personRepository.findAll().forEach(people::add);
       return people;
   }
    public List<Person> sortByName() {
       List<Person> temp = getAllPersons( );
       Collections.sort(temp);
       return temp;
    }
   public Person getPerson(int id){
      return personRepository.findById(id).orElse(null);

   }

   public void addPerson(Person person){
       personRepository.save(person);
   }

   public void addPerson(Person[] persons){
       for(Person p: persons) {
           addPerson(p);
       }
   }

   public void updatePerson(Person person){
        personRepository.save(person);
   }

   public void deletePerson(int id){
       personRepository.deleteById(id);
   }

}
