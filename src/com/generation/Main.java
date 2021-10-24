package com.generation;

public class Main {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.addPerson( new Person( "Elise", 33, "3434343" ) );
        personService.addPerson( new Person( "Santiago", 33, "1020212" ) );
        personService.addPerson( new Person( "Ian", 33, "42141" ) );

        Person foundPerson = personService.findPersonByName( "Santiago" );
        System.out.println("Person: "+foundPerson + "\n");
        personService.showPersonsById();
        System.out.println("\n");

        Person personaBuscadaPorId = personService.findPersonById("42141");
        System.out.println("Persona buscada por Id. \nNombre: " + personaBuscadaPorId.getName() + "\nEdad: " + personaBuscadaPorId.getAge());
    }
}
