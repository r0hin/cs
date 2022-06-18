package in.r0h;

public class Cone {
  // ************* Fields *************
  private double radius;
  private double height;

  private static int count = 0;

  // ************* Constructors *************
  /**
   * Constructs a Cone object with default values.
   */
  public Cone() {
    radius = 1.0;
    height = 1.0;
    count++;
  }

  /**
   * Constructor with parameters.
   * @param radius
   * @param height
   * @throws IllegalArgumentException
   */
  public Cone(double radius, double height) {
    if (radius <= 0.0) {
      throw new IllegalArgumentException("Radius cannot be negative.");
    }
    if (height <= 0.0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }
    this.radius = radius;
    this.height = height;
    count++;
  }

  /**
   * Constructor with parameters of type int.
   * @param radius
   * @param height
   * @throws IllegalArgumentException
   */
  public Cone(int radius, int height) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius cannot be negative.");
    }
    if (height <= 0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }
    this.radius = radius * 1.0; 
    this.height = height * 1.0; // convert to double.
    count++;
  }

  /**
   * Copy constructor.
   * @param c
   */
  public Cone(Cone c) { // Copy constructor.
    this.radius = c.getRadius();
    this.height = c.getHeight();
    count++;
  }

  // ************* Calculations *************
  /**
   * Calculates the volume of the cone.
   * @return double
   */
  public double calculateVolume() {
    return (Math.PI * radius * radius * height) / 3.0;
  }

  /**
   * Calculates the surface area of the cone.
   * @return double
   */
  public double calculateSurfaceArea() {
    return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
  }

  /**
   * Calculates the base area of the cone.
   * @return double
   */
  public double calculateBaseArea() {
    return Math.PI * radius * radius;
  }

  /**
   * Calculates the lateral surface area of the cone.
   * @return double
   */
  public double calculateLateralSurfaceArea() {
    return calculateSurfaceArea() - calculateBaseArea();
  }

  /**
   * Calculates the lateral surface area of the cone via base operations.
   * @return
   */
  public double calculateLateralSurfaceAreaFast() {
    return Math.PI * radius * Math.sqrt(radius * radius + height * height); 
  }

  // ************* Static Comparison Methods *************

  /**
   * Static method to check which one has greater volume
   * @return Cone
   * @param c1
   * @param c2
   */
  public static Cone whichHasGreaterVolume(Cone c1, Cone c2) {
    if (c1.calculateVolume() > c2.calculateVolume()) {
      return c1;
    } else {
      return c2;
    }
  }

  /**
   * Static method to check one has greater surface area
   * @return Cone
   * @param c1
   * @param c2
   */
  public static Cone whichHasGreaterSurfaceArea(Cone c1, Cone c2) {
    if (c1.calculateSurfaceArea() > c2.calculateSurfaceArea()) {
      return c1;
    } else {
      return c2;
    }
  }


  /**
   * Static method to check one has greater base area
   * @return Cone
   * @param c1
   * @param c2
   */

  public static Cone whichHasGreaterBaseArea(Cone c1, Cone c2) {
    if (c1.calculateBaseArea() > c2.calculateBaseArea()) {
      return c1;
    } else {
      return c2;
    }
  }

  /**
   * Static method to check one has greater lateral surface area
   * Returns copy of the cone instead of a reference to it.
   * @return Cone
   * @param c1
   * @param c2
   */
  public static Cone whichHasGreaterLateralSurfaceArea(Cone c1, Cone c2) {
    if (c1.calculateLateralSurfaceAreaFast() > c2.calculateLateralSurfaceAreaFast()) {
      return new Cone(c1);
    } else {
      return new Cone(c2);
    }
  }


  // ************* Getters & Setters *************
  /**
   * Returns the height of the cone.
   * @return double
   */
  public double getHeight() {
    return height;
  }

  /**
   * Sets the height of the cone.
   * @param height
   * @return void
   * @throws IllegalArgumentException
   */
  public void setHeight(double height) {
    if (height <= 0.0) {
      throw new IllegalArgumentException("Height cannot be negative.");
    }
    this.height = height;
  }

  /**
   * Returns the radius of the cone.
   * @return double
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the radius of the cone.
   * @param radius
   * @return void
   * @throws IllegalArgumentException
   */
  public void setRadius(double radius) {
    if (radius <= 0.0) {
      throw new IllegalArgumentException("Radius cannot be negative.");
    }
    this.radius = radius;
  }

  /**
   * Returns the number of Cone objects created.
   * @return int
   */
  public static int getCount() {
    return count;
  }
}
