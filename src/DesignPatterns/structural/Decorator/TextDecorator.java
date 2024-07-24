package DesignPatterns.structural.Decorator;

public abstract class TextDecorator implements Text{
    Text text;
    public TextDecorator(Text text){
        this.text = text;
    }
    @Override
    public String getContent(){
       return text.getContent();
    }
}
