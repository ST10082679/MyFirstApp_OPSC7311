package com.example.myfirstapp_opsc7311

class Order() {
    //properties of the customer and customers order
    //late init as they will only be initialised later
    lateinit var productName: String
    lateinit var customerName: String
    lateinit var customerCell: String
    lateinit var orderDate: String

    //secondary constructor
    //constructor will he called when an "Order" instance is created
    constructor(pName: String): this(){
        productName = pName
    }

    constructor (pName: String, cName: String, cCell: String, oDate: String) : this(pName){
        customerName = pName
        customerCell = cCell
        orderDate = oDate
    }
}