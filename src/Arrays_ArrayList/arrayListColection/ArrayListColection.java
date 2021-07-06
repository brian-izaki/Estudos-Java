package Arrays_ArrayList.arrayListColection;

import java.util.ArrayList;

public class ArrayListColection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "yellow");

        System.out.print("Mostrando lista com contador no loop (.get(i)): {");

        for(int i = 0; i < items.size(); i++)
            System.out.printf(" \n%s", items.get(i));

        display(items, "\n}\nMostrando lista com for aprimorado: {");

        items.add("green");
        items.add("yellow");
        display(items, "}\nListando com mais 2 novos elementos: {");

        items.remove("yellow");
        display(items, "}\nRemovendo o primeiro yellow que aparecer na lista{");

        items.remove(1);
        display(items, "}\nRemovendo o segundo elemento da lista (green){");

        System.out.printf("}\n\"red\"%s está na lista\n", items.contains("red") ? "" : " não");

        System.out.printf("\nSize: %s\n", items.size());
    }

    public static void display(ArrayList<String> items, String header){
        System.out.print(header);

        for (String item : items)
            System.out.printf("\n %s", item);

        System.out.println();
    }
}
