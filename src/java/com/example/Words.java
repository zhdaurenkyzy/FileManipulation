package src.java.com.example;

public enum Words {
    HELLO("hello"),
    BUY("buy-buy");

    private String name;

    Words(String name) {
        this.name=name();
    }

    public String getName() {
        return name;
    }
}
