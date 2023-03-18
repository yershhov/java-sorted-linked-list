public class SegmentLine implements Comparable<SegmentLine> {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    public SegmentLine(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public int compareTo(SegmentLine other) {
        return Double.compare(this.getLength(), other.getLength());
    }

    @Override
    public String toString() {
        return "SegmentLine{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}