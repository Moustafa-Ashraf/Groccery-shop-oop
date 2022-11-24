public class Main {
    public static void main(String[] args) {
        GroceryList a = new GroceryList();
        GroceryItemOrder b = new GroceryItemOrder("can", 1, 2);
        b.setQuantity( 3 );
        System.out.println(b.getCost());
        a.add( b );
        GroceryItemOrder c = new GroceryItemOrder("coffe", 1, 3);
        a.add( c );
        System.out.println(a.getTotalCost());
    }
}