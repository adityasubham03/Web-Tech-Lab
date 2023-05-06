class Plate {
  private int length;
  private int breadth;

  public Plate(int l, int b) {
    length = l;
    breadth = b;
    // System.out.println("Creating a Plate with length " + length + " and breadth " + breadth);
  }

  public int getLength() {
    return length;
  }

  public int getBreadth() {
    return breadth;
  }
}

class Box extends Plate {
  private int height;

  public Box(int l, int b, int h) {
    super(l, b);
    height = h;
    // System.out.println("Creating a Box with length " + getLength() + ", breadth " + getBreadth() + ", and height " + height);
  }

  public int getHeight() {
    return height;
  }
}

class WoodBox extends Box {
  private int thickness;

  public WoodBox(int l, int b, int h, int t) {
    super(l, b, h);
    thickness = t;
    System.out.println("Creating a WoodBox with length " + getLength() + ", breadth " + getBreadth() + ", height " + getHeight() + ", and thickness " + thickness);
  }

  public int getThickness() {
    return thickness;
  }
}

public class Main_02 {
  public static void main(String[] args) {
    WoodBox myBox = new WoodBox(10, 20, 30, 5);
  }
}
