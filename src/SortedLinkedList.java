public class SortedLinkedList {
    static class Node {
        public SegmentLine segmentLine;
        public Node node;

        public Node(SegmentLine segmentLine) {
            this.segmentLine = segmentLine;
        }
    }

    private Node head;

    public void insert(SegmentLine segmentLine) {
        Node newNode = new Node(segmentLine);

        if (head == null || segmentLine.getLength() < head.segmentLine.getLength()) {
            newNode.node = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.node != null && temp.node.segmentLine.getLength() <= segmentLine.getLength()) {
                temp = temp.node;
            }
            newNode.node = temp.node;
            temp.node = newNode;
        }
    }

    public SegmentLine remove() {
        if (head == null) {
            return null;
        }

        SegmentLine removedSegmentLine = head.segmentLine;

        head = head.node;
        return removedSegmentLine;
    }

    public String getList() {
        StringBuilder s = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            s.append(temp.segmentLine.getLength());
            s.append("->");
            temp = temp.node;
        }
        s.append("null");
        return s.toString();
    }

    public SegmentLine find(double length) {
        Node temp = head;
        while (temp != null) {
            if (temp.segmentLine.getLength() == length) {
                return temp.segmentLine;
            }
            temp = temp.node;
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }
}

