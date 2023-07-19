package com.driver;

public class Pizza {

    private int price;
    private int totalPrice;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int basePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isPaperBagAdded;
    private Boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true){
            basePrice=300;
            toppingPrice=70;
        }else{
            basePrice=400;
            toppingPrice=120;
        }
        paperBagPrice=20;
        cheesePrice=80;
        totalPrice=basePrice;
        bill="Base Price Of The Pizza:"+basePrice+"\n";
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            totalPrice=totalPrice+cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            totalPrice=totalPrice+totalPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice=totalPrice+paperBagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated=true;
            if(isCheeseAdded)
                bill=bill+"Extra Cheese Added:"+cheesePrice+"\n";
            if(isToppingsAdded)
                bill=bill+"Extra Toppings Added:"+toppingPrice+"\n";
            if(isPaperBagAdded)
                bill=bill+"paperbag Added:"+paperBagPrice+"\n";
            bill=bill+"Total Price:"+totalPrice+"\n";

        }
        return this.bill;
    }
}
