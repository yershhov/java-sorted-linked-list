import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {
        SortedLinkedList sortedLinkedList = new SortedLinkedList();

        SegmentLine segmentLine1 = new SegmentLine(1, 1, 1, 6);
        SegmentLine segmentLine2 = new SegmentLine(1, 1, 1, 2);
        SegmentLine segmentLine3 = new SegmentLine(1, 1, 1, 4);

        sortedLinkedList.insert(segmentLine1);
        sortedLinkedList.insert(segmentLine2);
        sortedLinkedList.insert(segmentLine3);

        System.out.println(sortedLinkedList.getList());


        SortedList sortedList = new SortedList(
                new SegmentLine[]{
                        segmentLine1, segmentLine2, segmentLine3
                }
        );

        System.out.println(Arrays.toString(sortedList.getArray()));
    }
}
