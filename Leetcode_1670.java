
import java.util.LinkedList;
import java.util.Queue;

class FrontMiddleBackQueue {

    Queue<Integer> q = new LinkedList<>();

    public FrontMiddleBackQueue() {
    }

    public void pushFront(int val) {
        int n = q.size();

        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }

        q.add(val);

        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
    }

    public void pushMiddle(int val) {
        int n = q.size();
        int idx = n / 2;

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        q.add(val);

        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }

    public void pushBack(int val) {
        q.add(val);
    }

    public int popFront() {
        if (q.isEmpty()) {
            return -1;
        }

        return q.remove();
    }

    public int popMiddle() {
        if (q.isEmpty()) {
            return -1;
        }

        int n = q.size();
        int idx = (n - 1) / 2;

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        int result = q.remove();

        for (int i = 0; i < n - idx - 1; i++) {
            q.add(q.remove());
        }

        return result;
    }

    public int popBack() {
        if (q.isEmpty()) {
            return -1;
        }

        int n = q.size();

        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }

        int result = q.remove();

        return result;
    }
}
