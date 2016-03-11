package test

class Car {

    static constraints = {

    }

    Integer year
    String make
    String model

    static mapping = {
        table 'VehicleModelYear'
    }
}
