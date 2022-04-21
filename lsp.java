/**
* The base Transaction class that defines a buy and sell feature.
*/
class Transaction{
    
    public void buy(String stock, int quantity, float price){
        // implement buy logic here
    };
    public void sell(String stock, int quantity, float price){
        // implement sell logic here
    }; 
}
/**
* A subclass implementation of the Transaction class that 
* defines Stock-specific buy and sell action logic.
*/
class StockTransaction extends Transaction{
    
    @Override
    public void buy(String stock, int quantity, float price){
        // implement Stock-specific buy logic here
    }
    @Override
    public void sell(String stock, int quantity, float price){
        // implement Stock-specific sell logic here
    }
}
