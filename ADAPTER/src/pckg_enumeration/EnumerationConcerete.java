package pckg_enumeration;

import java.util.Enumeration;

public class EnumerationConcerete<E> implements Enumeration<String> {
    @Override
    public boolean hasMoreElements() {
        return true;
    }

    @Override
    public String nextElement() {
        return new String("1000");
    }
}
