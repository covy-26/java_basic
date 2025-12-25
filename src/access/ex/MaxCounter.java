package access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // codig style 1
        if (checkMax()) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            this.count++;
        }

        // codig style 2 (검증과 실행 로직을 분리해서 볼 수 있는 장점)
//        if (checkMax()) { // 검증 로직
//            System.out.println("최대값을 초과할 수 없습니다.");
//            return;
//        }
//
//        this.count++; // 실행 로직
    }

    public int getCount() {
        return count;
    }

    private boolean checkMax() {
        return this.count >= max;
    }
}
