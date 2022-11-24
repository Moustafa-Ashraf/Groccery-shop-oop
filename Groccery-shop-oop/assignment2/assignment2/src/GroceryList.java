public class GroceryList {
    GroceryItemOrder[] groceries;
    int count;

    public GroceryList() {
        groceries = new GroceryItemOrder[10];
        count=0;
    }
    public void add(GroceryItemOrder item){
        if(count<9){
        this.groceries[count] = item;
            count++;
        }

    }
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < this.count; i++) {
            totalCost += this.groceries[i].getCost();
        }
        return totalCost;
    }
}
