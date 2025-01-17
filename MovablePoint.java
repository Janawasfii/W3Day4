public class MovablePoint {

  private int x;
  private int y;
  private int xSpeed;
  private int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
      this.x = x;
      this.y = y;
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
  }
  public void moveUp(){
      x += xSpeed;
      System.out.println("Moving up: "+ x);
  }
  public void moveDown(){
      y += ySpeed;
      System.out.println("Moving down: "+ y);
  }
  public void moveLeft(){
      x -= xSpeed;
      System.out.println("Moving left: "+ x);
  }
  public void moveRight(){
      x += xSpeed;
      System.out.println("Moving right: "+ x);
  }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
