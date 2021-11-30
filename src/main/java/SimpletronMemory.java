import java.util.Arrays;

public class SimpletronMemory {
    private int[] memory = new int[GlobalConstants.MEM_SIZE];

    public SimpletronMemory() {
        Arrays.fill(memory, 0);
    }

    public int getWord(int i) {
        if (i >= 0 && i < GlobalConstants.MEM_SIZE) {
            return memory[i];
        } else {
            throw new IllegalArgumentException("Out of range memory location provided.");
        }
    }
}
