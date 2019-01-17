package java.modules;

public abstract class Player {
    private String name;
    
    public String getName() { return name; }
    public abstract Move makeMove();
}

