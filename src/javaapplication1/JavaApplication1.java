
package javaapplication1;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JavaApplication1 {
    private static final DecimalFormat df2 = new DecimalFormat("#.####");
    public static void main(String[] args) {
        int i;
        List<Diamonds> jewelry;
        jewelry = new ArrayList<>();
        Random rand = new Random();
        double value;
        for(i=0;i<6;i++) {
            value=rand.nextInt(1000);

            if(value%2==0){
                jewelry.add(new Gems(" Gem #"+value,value/100,value/10,rand.nextBoolean()));
            }else{
                jewelry.add(new semiPreciousStones(" semi-precious Stone #"+value,value/100,value/10,rand.nextBoolean()));
            }
        }
        jewelry.forEach((diamond) -> {
            System.out.println(diamond.getName()+" Weight: "+diamond.getWeight()+" price: "+diamond.getPrice()+" transparency: "+diamond.getTransparency());
        });

        double totalWeight = 0;
        double totalCost =0;
        for(Diamonds diamond : jewelry){
            totalWeight=totalWeight+diamond.getWeight();
            totalCost=totalCost+diamond.getPrice();}
        System.out.println("Total cost is : "+df2.format(totalCost)+"\nTotal weight is : "+ df2.format(totalWeight));
        System.out.println("Sort by price: ");
        jewelry.sort((Diamonds o1, Diamonds o2) -> (int) (o1.getPrice() - o2.getPrice()));
        jewelry.forEach((diamond) -> {
            System.out.println(diamond.getName()+" Weight: "+diamond.getWeight()+" price: "+diamond.getPrice()+" transparency: "+diamond.getTransparency());
        });

        System.out.println("Find stones in jewelery which are transparent: ");
        jewelry.stream().filter(Diamonds::getTransparency).forEachOrdered((diamond) -> {
            System.out.println(diamond.getName());
        });


    }
}
