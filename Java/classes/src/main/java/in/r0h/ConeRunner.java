package in.r0h;

public class ConeRunner {
    
  public static void main(String[] args) {
    Cone cone = new Cone(5.0, 10.0);

    // Calculate difference in time for calculating lateral surface area.
    long startTime = System.nanoTime();
    cone.calculateLateralSurfaceArea();
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    long startTime2 = System.nanoTime();
    cone.calculateLateralSurfaceAreaFast();
    long endTime2 = System.nanoTime();
    long duration2 = (endTime2 - startTime2);
    System.out.println((1 - (1.0 * duration2) / (1.0 * duration)) * 100 + "% faster");


    // Test the calculations methods.
    System.out.println(cone.calculateVolume());
    System.out.println(cone.calculateSurfaceArea());
    System.out.println(cone.calculateBaseArea());
    System.out.println(cone.calculateLateralSurfaceArea());
    System.out.println(cone.calculateLateralSurfaceAreaFast());

    // Test the comparison methods.
    Cone cone2 = new Cone(10.0, 5.0);
    System.out.println(Cone.whichHasGreaterVolume(cone, cone2));
    System.out.println(Cone.whichHasGreaterSurfaceArea(cone, cone2));
    System.out.println(Cone.whichHasGreaterBaseArea(cone, cone2));
    System.out.println(Cone.whichHasGreaterLateralSurfaceArea(cone, cone2));

    // Test getters and setters.

    // cone.setHeight(-1.0); // Should throw an exception.
    cone.setHeight(1.0); // Should not throw an exception.

    // cone.setRadius(-1.0); // Should throw an exception.
    cone.setRadius(1.0); // Should not throw an exception.

    System.out.println(cone.getHeight()); // Should be 1.0.
    System.out.println(cone.getRadius()); // Should be 1.0.
    System.out.println(Cone.getCount()); // Should be 3. 
    // (3 because another one was created in a comparison method.)
  }  
}
