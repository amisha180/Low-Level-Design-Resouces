package DesignPatterns.creational.Prototype;

public class ExcelSheet implements Prototype{
        private String title;
        private int rows;
        private int  cols;
        public ExcelSheet(String title, int rows , int cols){
            this.title = title;
            this.rows = rows;
            this.cols = cols;
        }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    @Override
        public ExcelSheet clone(){
            return new ExcelSheet(title,rows,cols);
        }
        @Override
        public String toString(){
            return "title: "+title+" , rows: "+rows +" ,cols : "+cols;
        }

}
