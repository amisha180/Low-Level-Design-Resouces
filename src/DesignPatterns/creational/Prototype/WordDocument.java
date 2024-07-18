package DesignPatterns.creational.Prototype;

public class WordDocument implements Prototype{
    private String title;
    private String content;
    public WordDocument(String title, String content){
        this.title = title;
        this.content = content;
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public WordDocument clone(){
        return new WordDocument(title,content);
    }
    @Override
    public String toString(){
        return "title: "+title+" , content: "+content;
    }

}
