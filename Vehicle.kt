package Clases



class Vehicle {

    init {

        println("vehiculo creado")

    }

    companion object Factory{

        fun create (): Vehicle = Vehicle()

    }

    val vehicleIntance = Vehicle.create()

}
