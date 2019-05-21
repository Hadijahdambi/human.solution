package com.example.humansolution;

public class fatuma extends Human{
    private  int height;
    public fatuma(String name, int age, int weight) {
        super(name, age, weight);
    }

    public fatuma(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        int fatumaweight = getWeight();
        fatumaweight = fatumaweight + 2;
        setHeight(fatumaweight);
    }

    @Override
    public void birthday() {
        super.birthday();
        int fatumaAge = getAge();
        fatumaAge = fatumaAge + 4;
        setAge(fatumaAge);
    }
}
