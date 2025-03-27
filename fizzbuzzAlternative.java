import java.util.HashMap;

public class fizzbuzzAlternative {
    public static void main(String[] args) {
        HashMap<Integer, String> checkMap = new HashMap<>();
        checkMap.put(3, "Fizz");
        checkMap.put(5, "Buzz");
        checkMap.put(7, "Bazz");
        for (int i = 0; i < 30; i++) {
            String response = "";
            for (int key : checkMap.keySet()) {
                if (i % key == 0)
                    response += checkMap.get(key);
            }
            if (response.isEmpty())
                response = String.valueOf(i);

            System.out.println(response);
            // if(i%3==0&&i%5==0){
            // System.out.println("FizzBuzz");
            // }
            // else if (i%3==0){
            // System.out.println("Fizz");
            // }
            // else if (i%5==0){
            // System.out.println("Buzz");
            // }
            // else if (i%7==0){
            // System.out.println("Bazz");
            // }

        }

    }
}
