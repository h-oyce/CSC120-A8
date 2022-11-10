Methods from Contract we must include:   
    void grab(String item);
    String drop(String item);
    void examine(String item);
    void use(String item);
    boolean walk(String direction);
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest();
    void undo();



Class petShelter(num of pets it can hold)
    array for pets (name and what type of animal)

    Number shrink(); 
    Number grow(); // shrink or grow the capacity
    void examine(String item);  // input "dog", "cat", etc and it prints out all the ones avaible at shelter
    void undo();
    void adopt(String item);
    void open();
    void close();


Class Pet:
    energyLevel // variable that decreases after every action so rest() is needed
    hungerLevel // same as above but for eat()


    void grab(String item);
    String drop(String item);
    void use(String item);  // grab, drop, and use different toys
    boolean walk(String direction);
    void rest();
    void eat(String item);

    Class Dog extends Pet:



    Class Cat extends Pet:



    Class Bird extends Pet:
        boolean fly(int x, int y); 

