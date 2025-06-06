
    import java.util.*;

public class codevita2 {
    private static final int NUM_SEGMENTS = 10;
    private static final int SEGMENT_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading 7-segment representations for digits 0-9
        String[] digitSegments = new String[SEGMENT_SIZE];
        for (int i = 0; i < SEGMENT_SIZE; i++) {
            digitSegments[i] = scanner.nextLine();
        }

        Map<String, Integer> segmentToDigit = new HashMap<>();
        for (int i = 0; i < NUM_SEGMENTS; i++) {
            StringBuilder digitRepresentation = new StringBuilder();
            for (int j = 0; j < SEGMENT_SIZE; j++) {
                digitRepresentation.append(digitSegments[j], i * SEGMENT_SIZE, (i + 1) * SEGMENT_SIZE);
            }
            segmentToDigit.put(digitRepresentation.toString(), i);
        }

        // Reading the input number in 7-segment display
        String[] inputSegments = new String[SEGMENT_SIZE];
        for (int i = 0; i < SEGMENT_SIZE; i++) {
            inputSegments[i] = scanner.nextLine();
        }

        // Convert the 7-segment input to individual digits
        int numDigits = inputSegments[0].length() / SEGMENT_SIZE;
        List<String> digitStrings = new ArrayList<>();
        for (int i = 0; i < numDigits; i++) {
            StringBuilder digitRepresentation = new StringBuilder();
            for (int j = 0; j < SEGMENT_SIZE; j++) {
                digitRepresentation.append(inputSegments[j], i * SEGMENT_SIZE, (i + 1) * SEGMENT_SIZE);
            }
            digitStrings.add(digitRepresentation.toString());
        }

        long totalSum = 0;
        boolean invalid = false;

        // Calculate all possible numbers by toggling one segment per digit
        for (int d = 0; d < numDigits; d++) {
            String original = digitStrings.get(d);
            Set<Integer> possibleDigits = new HashSet<>();

            // Check the original digit
            if (segmentToDigit.containsKey(original)) {
                possibleDigits.add(segmentToDigit.get(original));
            }

            // Check all possible toggles
            char[] segments = original.toCharArray();
            for (int i = 0; i < segments.length; i++) {
                segments[i] = (segments[i] == '0') ? '1' : '0';
                String toggled = new String(segments);
                if (segmentToDigit.containsKey(toggled)) {
                    possibleDigits.add(segmentToDigit.get(toggled));
                }
                // Revert the toggle
                segments[i] = (segments[i] == '0') ? '1' : '0';
            }

            if (possibleDigits.isEmpty()) {
                invalid = true;
                break;
            }

            // Form all possible numbers with this digit toggled
            Set<Long> possibleNumbers = new HashSet<>();
            for (int digit : possibleDigits) {
                for (long baseSum : (d == 0) ? Collections.singleton(0L) : possibleNumbers) {
                    possibleNumbers.add(baseSum * 10 + digit);
                }
            }

            // Update the total sum with the new possible numbers
            if (d == 0) {
                totalSum = possibleNumbers.stream().mapToLong(Long::longValue).sum();
            } else {
                totalSum = possibleNumbers.stream().mapToLong(Long::longValue).sum();
            }
        }

        if (invalid) {
            System.out.println("Invalid");
        } else {
            System.out.println(totalSum);
        }
    }
}

}
