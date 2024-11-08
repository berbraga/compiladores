package compilador.regras;

public class Auxst <T>{
  Integer category ;
  Integer attribute ;

  public Auxst(Integer category, Integer attribute) {
    this.category = category;
    this.attribute = attribute;
  }
  public Auxst(Integer category) {
    this.category = category;
  }

  public Integer getAttribute() {
    return attribute;
  }

  public void setAttribute(Integer attribute) {
    this.attribute = attribute;
  }

  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

}
