import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        peopleList();
//        printRandomMapKeyValueElement(); // key: E, value: 5
//        printRandomMapKeyValueElement(); // key: A, value: 1
//        printRandomMapKeyValueElement(); // key: D, value: 4

    }

    public static void peopleList() {
        Map<String, Integer> peopleWithShare = new HashMap();
        Scanner scanner = new Scanner(System.in);
        int allCount, shares, number = 1, bigMoney = 0, shareEqualsTo = 1000000, test = 10, randomValueWinner;
        String name, randomKey = null;
        Object randomValue = new Object();

        System.out.println("Enter the number of candidates");
        allCount = scanner.nextInt();

        while (allCount > 0) {

            System.out.println("Enter the " + number + "th person name.");

            name = scanner.next();

            System.out.println("Enter the " + name + "'s shares.");
            number++;

            shares = scanner.nextInt();
            peopleWithShare.put(name, shares);

            Set<String> keySet = peopleWithShare.keySet();
            List<String> keyList = new ArrayList<>(keySet);

            int size = keyList.size();
            int randIdx = new Random().nextInt(size);

            randomKey  = keyList.get(randIdx);
            randomValueWinner = peopleWithShare.get(randomKey);

//            Random random = new Random();
//            Object[] values = peopleWithShare.values().toArray();
//            randomValue = values[random.nextInt(values.length)];

            bigMoney = bigMoney + (shares * shareEqualsTo);
            allCount--;
        }
//        System.out.println(bigMoney);
//        System.out.println(randomValue);
//        String convertedToString = String.valueOf(randomValue);  //method 1
        String convertedStringObject = randomValue.toString();
//        ReflectionToStringBuilder.toString(object);
//        System.out.println("Winner is " + randomKey + " With " ++ " shares.");

    }

//    public static void printRandomMapKeyValueElement() {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("A", 1);
//        map.put("B", 2);
//        map.put("C", 3);
//        map.put("D", 4);
//        map.put("E", 5);
//
//        Set<String> keySet = map.keySet();
//        List<String> keyList = new ArrayList<>(keySet);
//
//        int size = keyList.size();
//        int randIdx = new Random().nextInt(size);
//
//        String randomKey = keyList.get(randIdx);
//        Integer randomValue = map.get(randomKey);
//
//        System.out.println("key: " + randomKey + ", value: " + randomValue);
//    }



}
