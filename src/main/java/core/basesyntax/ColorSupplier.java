package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final Random random = new Random();

    public static Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
