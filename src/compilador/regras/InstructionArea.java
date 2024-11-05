package compilador.regras;

public class InstructionArea<T> {

  private Integer pointer = 0;
  private String instruction = "";
  private T parameter;

  public InstructionArea(Integer pointer, String instruction, T parameter) {
    this.pointer = pointer;
    this.instruction = instruction;
    this.parameter = parameter;
  }

  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public Integer getPointer() {
    return pointer;
  }

  public void setPointer(Integer pointer) {
    this.pointer = pointer;
  }

  public T getParameter() {
    return parameter;
  }

  public void setParameter(T parameter) {
    this.parameter = parameter;
  }
}
