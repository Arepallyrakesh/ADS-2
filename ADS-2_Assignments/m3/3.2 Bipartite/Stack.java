/**.
 * { item_description }
 */
import java.util.Iterator;
/**.
 * { item_description }
 */
import java.util.NoSuchElementException;
/**.
 * List of .
 *
 * @param      <Item>  The item
 */
public class Stack<Item> implements Iterable<Item> {
    /**.
     * { var_description }
     */
    private int n;
    /**.
     * { var_description }
     */
    private Node first;
    /**.
     * Class for node.
     */
    private class Node {
        /**.
         * { var_description }
         */
        private Item item;
        /**.
         * { var_description }
         */
        private Node next;
    }
    /**.
     * Constructs the object.
     */
    public Stack() {
        first = null;
        n = 0;
    }
    /**.
     * Determines if empty.
     *
     * @return     True if empty, False otherwise.
     * Time complexity is O(1)
     */
    public boolean isEmpty() {
        return first == null;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     * Time complexity is O(1)
     */
    public int size() {
        return n;

    }
    /**.
     * { function_description }
     * Time complexity is O(1)
     * @param      item  The item
     */
    public void push(final Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
    /**.
     * { function_description }
     * Time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public Item pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }
    /**.
     * { function_description }
     * Time complexity is O(1)
     * @return     { description_of_the_return_value }
     */
    public Item peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return first.item;
    }
    /**.
     * Returns a string representation of the object.
     * Time complexity is O(N)
     * @return     String representation of the object.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this) {
            s.append(item + " ");
        }
        return s.toString();
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    /**.
     * Class for list iterator.
     */
    private class ListIterator implements Iterator<Item> {
        /**.
         * { var_description }
         */
        private Node current = first;
        /**.
         * Determines if it has next.
         * Time complexity is O(1)
         * @return     True if has next, False otherwise.
         */
        public boolean hasNext() {
            return current != null;
        }
        /**.
         * { function_description }
         * Time complexity is O(1)
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
        /**.
         * { function_description }
         * Time complexity is O(1)
         * @return     { description_of_the_return_value }
         */
        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
