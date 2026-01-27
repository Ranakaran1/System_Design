package solid.S;
class Marker{
    String name;
    String color;
    int price;

    public Marker(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}

class Invoice{
    Marker marker;
    int quantity;

    public Invoice(Marker marker) {
        this.marker = marker;
    }

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getTotalPrice(){
        return marker.price * quantity;
    }
//    public void saveToDb(){
//        System.out.println("saving to Db");
//    }
}

class InvoiceDao{
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb(){
        System.out.println("saving to Db");

    }
}
public class SRP {
    public static void main(String[] args) {
        Marker marker = new Marker("Camlin","Blue",25);
        Invoice invoice = new Invoice(marker,5);
        System.out.println(invoice.getTotalPrice());
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDb();
    }
}
