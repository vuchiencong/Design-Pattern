package behavioralPattern.strategy.sort;

import behavioralPattern.strategy.sort.MergeSort;
import behavioralPattern.strategy.sort.QuickSort;
import behavioralPattern.strategy.sort.SortedList;

/**
 * Chương trình của chúng ta cung cấp nhiều giải thuật sắp xếp khác nhau: quick sort, merge sort, selection sort, heap sort, tim sort, ….
 * Tùy theo loại dữ liệu, số lượng phần tử, … mà người dùng có thể chọn một giải thuật sắp xếp phù hợp.
 */
public class StrategyPatternExample {
    public static void main(String[] args) {

        SortedList sortedList = new SortedList();
        sortedList.add("Java Core");
        sortedList.add("Java Design Pattern");
        sortedList.add("Java Library");
        sortedList.add("Java Framework");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
