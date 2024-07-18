package DesignPatterns.creational.Prototype;

public class clientCode {
    public static void main(String[] args) {

        //WordDoc
        WordDocument originaldoc = new WordDocument("Atomic habits","make habits using habit stacking");
        WordDocument cloneddoc = originaldoc.clone();
        System.out.println("orignal: "+originaldoc);
        System.out.println("cloned: "+cloneddoc);

        cloneddoc.setContent("make habit easy");
        System.out.println("cloned: "+cloneddoc);


        //Excelsheet
        ExcelSheet originalsheet = new ExcelSheet("testcases",5,4);
        ExcelSheet clonedsheet = originalsheet.clone();
        clonedsheet.setRows(2);
        System.out.println("orignal: "+originalsheet);
        System.out.println("cloned: "+clonedsheet);
    }
}
