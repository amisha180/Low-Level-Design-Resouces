package DesignPatterns.structural.Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Text text = new PlainText("Hello, world!");

        Text boldText = new BoldDecorator(text);
        System.out.println(boldText.getContent());

        Text italicText = new ItalicDecorator(boldText);
        System.out.println(italicText.getContent());

        Text underlinedText = new UnderlineDecorator(italicText);
        System.out.println(underlinedText.getContent());
    }
}
