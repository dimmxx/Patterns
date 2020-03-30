package main.java.decorator;

public class AppDecorator {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTreeImpl();
        System.out.println(christmasTree.decorate());

        ChristmasTree garland = new Garland(christmasTree);
        System.out.println(garland.decorate());

        ChristmasTree garland1 = new Garland(new Garland(new ChristmasTreeImpl()));
        System.out.println(garland1.decorate());

        ChristmasTree bubblelight
                = new BubbleLight(new BubbleLight(new Garland(new ChristmasTreeImpl())));
        System.out.println(bubblelight.decorate());

    }



}
