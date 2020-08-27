/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put your own methods here
    
  public void moveBackward(){
  turnAround();
  hop();
  turnAround();
  }
  public void turnAround(){
  turn(LEFT);
  turn(LEFT);
  }
    
    
    
    
    
    

    // Do NOT touch the following code.
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
