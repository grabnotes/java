2015:
Grabnotes:
    -GNBrowseBooksWithInterface.jar

TXLibrary:
    -TXInventory.jar

WALibrary:
    -WAInventory.jar


2018:
Grabnotes:
    -GNBrowseBooks.jar
    -GNInterface.jar

2018:
TXLibrary:
    -TXInventory.jar
        -GNInterface.jar
        
WALibrary:
    -WAInventory.jar
        -GNInterface.jar
        
        
=====================================
2019:
Without Spring:

Grabnotes:
    -GNBrowseBooks.jar (new TXInventory(), new WAInventory();)
    -GNInterface.jar
    -TXInventory.jar
    -WAInventory.jar


**************GOAL******************
With Spring:
Grabnotes:
    -GNBrowseBooks.jar
    -GNInterface.jar

Dynamically get whatever jar I want use whenever I want to use and not during code creation
or compile time.



