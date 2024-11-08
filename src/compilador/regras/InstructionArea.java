package compilador.regras;

public class InstructionArea<T> {

  private String instruction = "";
  private T parameter;

  public InstructionArea(String instruction, T parameter) {
    this.instruction = instruction;
    this.parameter = parameter;
  }

  public InstructionArea(String instruction) {
    this.instruction = instruction;
  }

  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public T getParameter() {
    return parameter;
  }

  public void setParameter(T parameter) {
    this.parameter = parameter;
  }
}
