import java.util.ArrayList;
import java.util.List;

public class LC_1352 {
        private List<Integer> prefixProduct;

    public LC_1352() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Initializing with 1 for multiplication purposes
    }

    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1); // Reset the list
        } else {
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num); // Store cumulative product
        }
    }

    public int getProduct(int k) {
        int size = prefixProduct.size();
        if (k >= size) {
            return 0; // Zero encountered, return 0
        }
        return prefixProduct.get(size - 1) / prefixProduct.get(size - 1 - k);
    }
}
