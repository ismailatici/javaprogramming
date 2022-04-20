package TurkceOop1;

public class Book {
    public String name,autor,publicher;
    private int numberOfPage;

    public Book(String name, String autor, String publicher, int numberOfPage) {
        this.name = name;
        this.autor = autor;
        this.publicher = publicher;
        if (numberOfPage<1){
            this.numberOfPage=10;
        }else {
            this.numberOfPage=numberOfPage;
        }
    }
    /*public void PageSize(){
        System.out.println(numberOfPage);
    }

     */

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getPublicher() {
        return publicher;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPublicher(String publicher) {
        this.publicher = publicher;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
