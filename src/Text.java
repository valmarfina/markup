public class Text implements Markable {
  private final String text;

  public Text(String text) {
    this.text = text;
  }

  @Override
  public void toMarkdown(StringBuilder dest) {
    dest.append(text);
  }

}
