package edu.jalc.automobile.parts;

public class Paint{
  private String paint;

  public Paint(String paint){
    this.paint = paint;
  }

  public String getPaint(){return this.paint;}

  String setPaint(String paint){
    this.paint = paint;
    return this.paint;
  }

  public String toString(){
    return "Adding paint";
  }
}
