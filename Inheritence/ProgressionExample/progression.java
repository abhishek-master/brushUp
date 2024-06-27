public class Progression {
    protected long current ;

    public Progression () {
        this(0);
    }

    public Progression (long start) {
        current = start ;
    }

    protected long nextValue () {
        long answer = current ; 
        advance();
        return answer ;
    }

    public void advance () {
        current ++ ;
    }
}

/**Now Create follwing subclasses from this : 
 * 1. Arithmatic Progression Class
 * 2. Geometric Progression Class
 * 3. Fibbonacci Progression Class
 */
 