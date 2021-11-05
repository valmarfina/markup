import java.util.List;

public class Paragraph implements Markable {
  private List<Markable> data;

  public Paragraph(List<Markable> data) {
    this.data = data;
  }

  @Override
  public void toMarkdown(StringBuilder dest) {
    for (Markable text : data) {
      text.toMarkdown(dest);
    }
  }
}
