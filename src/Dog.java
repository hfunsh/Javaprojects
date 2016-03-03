public class Dog extends Pet
{
    // instance variables
    private String breed;
    private boolean trained;

    // no-arg constructor
    public Dog()
    {
        this("", "", 0,"",false);
    }

    // overloaded constructors
    public Dog(String name)
    {
        this(name, "", 0,"",false);
    }
    public Dog(String name, String color)
    {
        this(name, color, 0,"",false);
    }
    public Dog(String name, String color, int position)
    {
        this(name, color, position,"",false);
    }
    public Dog(String name, String color, int position, String breed)
    {
        this(name, color, position, breed,false);
    }
    public Dog(String name, String color, int position, String breed, boolean trained)
    {
        super(name, color, 4, position);
        this.breed = breed;
        this.trained = trained;
    }

    // overrided toString
    public String toString()
    {
       return String.format("Breed: %s%nTrained: %b%n%s", breed, trained, super.toString());
    }

    // overrided equals
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Dog))
            return false;
        else if (!(super.equals(obj)))
            return false;
        else if (breed.equals(((Dog)obj).breed) && this.trained == ((Dog)obj).trained)
            return true;
        else 
            return false;
    }

    // set breed
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    // set trained
    public void setTrained(boolean trained)
    {
        this.trained = trained;
    }

    // get trained
    public boolean getTrained()
    {
        return trained;
    }

    // get breed
    public String getBreed()
    {
        return breed;
    }

    // override inherited getters
    public String getName()
    {
        return super.getName();
    }
    public String getColor()
    {
        return super.getColor();
    }
    public int getPosition()
    {
        return super.getPosition();
    }
    public int getNumberLegs()
    {
        return super.getNumberLegs();
    }

    // override setters
    public void setName(String name)
    {
        super.setName(name);
    }
    public void setColor(String color)
    {
        super.setColor(color);
    }

    public void move(int step)
    {
        super.setPosition(step);
    }
}
