package compilador.regras;

public class InstructionArea {

  private String instruction = "";
  private String parameter;

  public InstructionArea(String instruction, String parameter) {
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

  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }
}
