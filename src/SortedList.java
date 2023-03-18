import java.util.Arrays;


 interface SortedListInterface {
    SegmentLine[] getArray();
}


public class SortedList implements SortedListInterface {
    private final SegmentLine[] segmentLines;

    public SortedList(SegmentLine[] segmentLines) {

        this.segmentLines = segmentLines;
        Arrays.sort(this.segmentLines);

    }

    public SegmentLine[] getArray() {
        return segmentLines;
    }
}