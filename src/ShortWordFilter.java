public class ShortWordFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        String s = (String) x;
        return s.length() < 5;
    }
}


