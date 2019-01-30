package Chapter1;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/1/30
 */
public class UnsafeSequence {
    private int value;
    public int getNext(){
        return value++;
    }
}
