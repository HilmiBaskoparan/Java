public class Main {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();

        System.out.println("Number of Elements  : " + list.size());
        System.out.println("Length of Array     : " + list.getCapacity());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(30);

        System.out.println("\nNumber of Elements  : " + list.size());
        System.out.println("Length of Array     : " + list.getCapacity());

        System.out.println(list.get(1));
        list.set(1, 100);
        System.out.println(list.get(1));
        System.out.println(list.toString());
        list.remove(3);
        System.out.println(list.toString());

        System.out.println();
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.isEmpty());

        System.out.println("----------------------------");
        System.out.println(list.subList(2,5));

        Object[] arr = list.toArray();
        System.out.println(arr[2]);
        System.out.println(list.contains(100));

        //list.clear();


    }
}