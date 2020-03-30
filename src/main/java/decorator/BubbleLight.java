package main.java.decorator;

public class BubbleLight extends TreeDecorator {

    public BubbleLight(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate(){
        return super.decorate() + " + bubblelights";
    }



}
