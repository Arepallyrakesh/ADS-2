/**
 * Class for lsd.
 */
class LSD {
    /**
     * Constructs the object.
     */
    protected LSD() {

    }
    /**
     * private bits.
     */
    private static final int BITS_PER_BYTE = 8;
    /**
     * tfs.
     */
    public static final int T_FS = 256;

   /**
     * Rearranges the array of W-character strings in ascending order.
     *
     * @param      a     the array to be sorted
     * @param      w     the number of characters per string
     *
     * @return     { description_of_the_return_value }
     */
    public static String[] sort(final String[] a, final int w) {
        int n = a.length;
        int ra = T_FS;   // extend ASCII alphabet size
        String[] aux = new String[n];

        for (int d = w - 1; d >= 0; d--) {
            // sort by key-indexed counting on dth character

            // compute frequency counts
            int[] count = new int[ra + 1];
            for (int i = 0; i < n; i++) {
                count[a[i].charAt(d) + 1]++;
            }

            // compute cumulates
            for (int r = 0; r < ra; r++) {
                count[r + 1] += count[r];
            }

            // move data
            for (int i = 0; i < n; i++) {
                aux[count[a[i].charAt(d)]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++) {
                a[i] = aux[i];
            }
        }
        return a;
    }
    /**
     * tfs.
     */
    public static final int BI_TS = 32;

    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     */
    public static void sort(final int[] a) {
        //final int BITS = 32;                 // each int is 32 bits
        final int ra = 1 << BITS_PER_BYTE;    // each bytes is between 0 and 255
        final int m = ra - 1;              // 0xFF
        final int w = BI_TS / BITS_PER_BYTE;  // each int is 4 bytes

        int n = a.length;
        int[] aux = new int[n];

        for (int d = 0; d < w; d++) {

            // compute frequency counts
            int[] count = new int[ra + 1];
            for (int i = 0; i < n; i++) {
                int c = (a[i] >> BITS_PER_BYTE * d) & m;
                count[c + 1]++;
            }

            // compute cumulates
            for (int r = 0; r < ra; r++) {
                count[r + 1] += count[r];
            }

            // for most significant byte, 0x80-0xFF comes before 0x00-0x7F
            if (d == w - 1) {
                int shift1 = count[ra] - count[ra / 2];
                int shift2 = count[ra / 2];
                for (int r = 0; r < ra / 2; r++) {
                    count[r] += shift1;
                }
                for (int r = ra / 2; r < ra; r++) {
                    count[r] -= shift2;
                }
            }

            // move data
            for (int i = 0; i < n; i++) {
                int c = (a[i] >> BITS_PER_BYTE * d) & m;
                aux[count[c]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++) {
                a[i] = aux[i];
            }
        }
    }
}
