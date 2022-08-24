package Practice_problem;

import java.util.HashMap;
import java.util.Map;

public class Counter extends NameJob {
    protected Map<String, Integer> map;

    public Counter() {
        super();
        this.map = new HashMap<>();
    }

    @Override
    protected void doJob(String name) {
        // 방문 회수를 출력한다.
        Integer count = map.get(name);
        if (count == null) {
            count = 0;
        }

        count++;
        map.put(name, count);

        System.out.printf("%s님의 %d번째 방문입니다.\n", name, count);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.execute();
    }
}