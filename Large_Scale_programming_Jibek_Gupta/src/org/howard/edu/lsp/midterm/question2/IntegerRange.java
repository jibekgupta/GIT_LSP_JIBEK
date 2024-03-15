package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {
    private int startPoint;
    private int endPoint;

    public IntegerRange(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    
    public boolean contains(int value) {
        return value >= startPoint && value <= endPoint;
    }

    
    public boolean overlaps(Range other) {
        return !(endPoint < other.getStartPoint() || startPoint > other.getEndPoint());
    }

    
    public int size() {
        return endPoint - startPoint + 1;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IntegerRange other = (IntegerRange) obj;
        return startPoint == other.startPoint && endPoint == other.endPoint;
    }
}
