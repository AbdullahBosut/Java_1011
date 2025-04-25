class Firs {
    
    //Nitelikler
    String type = " Sedan";
    String model;
    String color;
    int speed;
    int sppedLimit = 180;

    Firs(String model,String type,String color,int speed){
        this.model = model;
        this.type = type;
        this.color = color;
        this.speed = speed;
    }
    Firs(String model,String color,int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;
    }


    void increasSpeed(int increment){
        if ((speed+increment)<sppedLimit) {
            speed += increment;
        }

    }
    void decreaseSpeed(int deceares){
        if (speed>0){
            speed -= deceares;
        }

    }
    void printSpeed(){
        System.out.println("Hızınız: "+speed);
    }
    void printinfo(){
        System.out.println(model + type + color + " Hızı: "+speed);

    }





}
