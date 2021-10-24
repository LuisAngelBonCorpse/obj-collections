package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PersonService {
    private final List<Person> personList = new ArrayList<>();
    private final HashMap<String,Person> personsById = new HashMap<>();

    public Person findPersonByName( String name )
    {
        for ( Person person : personList )
        {
            if ( person.getName().equals( name ) )
            {
                return person;
            }
        }
        return null;
    }

    public void showPersonsById(){
        for(String id: personsById.keySet()){
            System.out.println(personsById.get(id));
        }
    }

    public void addPerson( Person person )
    {
        personList.add( person );
        personsById.put(person.getId(), person);
    }

    public Person findPersonById( String id )
    {
        for(String cadaId : personsById.keySet()){
            if ( personsById.get(cadaId) == personsById.get(id)) {
                return personsById.get(id);
            }
        }
        return null;
    }

}
