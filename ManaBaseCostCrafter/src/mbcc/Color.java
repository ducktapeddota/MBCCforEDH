package mbcc;

public class Color {
    private Integer[] colors;
    private final Integer NUM_COLORS = 5;
    public Color(Integer[] c) {
        assert c.length == NUM_COLORS;
        colors = new Integer[] {c[0], c[1], c[2], c[3], c[4]};
    }

    public Color(String c) {
        assert c.length() <= NUM_COLORS;
        Integer[] colorString = new Integer[NUM_COLORS];
        for (int i = 0; i < c.length(); i++) {
            switch(c.charAt(i)) {
                case 'w':
                case 'W':
                    colorString[0] = 1;
                    break;
                case 'u':
                case 'U':
                    colorString[1] = 1;
                    break;
                case 'b':
                case 'B':
                    colorString[2] = 1;
                    break;
                case 'r':
                case 'R':
                    colorString[3] = 1;
                    break;
                case 'g':
                case 'G':
                    colorString[4] = 1;
                    break;
                default:
                    throw new IllegalArgumentException("Letter found that does not represent a color");
            }
        }

    }
}
