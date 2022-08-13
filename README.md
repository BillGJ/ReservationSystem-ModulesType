# Reservation System - Exercise: Module Types

This is a simple project to demonstrate how modules can be interconnected to each other.

The `ReservationSystem-ModulesTypes` folder contains a project that has been separated in modules, `com.udacity.flight` is a small module 
 stubbing a search engine for getting flights availability, similarly `com.udacity.hotel` simulates a search 
 engine for hotel availability.
 
 `com.udacity.packagesearch` uses the previous two modules to get a list of available hotels and flights
 and show it to the user to create a package. 
 

## Compiling and Running

 The project can be compiled when by running this command from the `ReservationSystem-ModulesTypes` directory:
 
```
javac -d out --module-source-path . --module com.udacity.flight,com.udacity.hotel,com.udacity.packagesearch
```

 Run the project using the command:

```
java --module-path out --module com.udacity.packagesearch/com.udacity.packagesearch.search.Main
```
