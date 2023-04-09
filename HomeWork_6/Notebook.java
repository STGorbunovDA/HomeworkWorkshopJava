public class Notebook {
    private String company;
    private String model;
    private String color;
    private float diagonal;
    private int volHardDisk;
    private int volRam;
    private String os;
    private int price;


    public Notebook(String company, String model, String color, float diagonal, int volHardDisk, int volRam, String os, int price){
        this.company = company;
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.volHardDisk = volHardDisk;
        this.volRam = volRam;
        this.os = os;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.company + " " + this.model + "\nЦвет " + color + "\nДиагональ " + diagonal +
                "\nОбъем жесткого диска " + volHardDisk + "\nОбъем оперативной памяти " + volRam + "\nОперационная система " + os + "\nЦена " + price + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook)
            return ((Notebook) obj).company.equals(this.company) &&
                    ((Notebook) obj).model.equals(this.model) &&
                    ((Notebook) obj).color == this.color &&
                    ((Notebook) obj).diagonal == this.diagonal &&
                    ((Notebook) obj).volHardDisk == this.volHardDisk &&
                    ((Notebook) obj).volRam == this.volRam &&
                    ((Notebook) obj).os == this.os &&
                    ((Notebook) obj).price == this.price;
        else return false;
    }

    public String getCompany(){
        return company;
    }

    public String getColor(){
        return color;
    }

    public float getDiagonal(){
        return diagonal;
    }
    public int getVolHardDisk(){
        return volHardDisk;
    }

    public int getVolRam(){
        return volRam;
    }
    public String getOS(){
        return os;
    }

    public int getPrice(){
        return price;
    }
}
