package solid.O;

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

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getTotalPrice(){
        return marker.price * quantity;
    }
}
interface InvoiceDao{
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
       System.out.println(invoice.getTotalPrice() + " sacved to DB");
    }

}

class FileInvoiceDao implements InvoiceDao{

    @Override
    public void save(Invoice invoice) {
       System.out.println(invoice.getTotalPrice() + " sacved to File");
    }

}

public class OCP {
    public static void main(String[] args) {
        Marker marker = new Marker("Doms", "Red", 25);
        Invoice invoice = new Invoice(marker, 6);
        InvoiceDao invoiceDao = new FileInvoiceDao();
        invoiceDao.save(invoice);
    }
}
