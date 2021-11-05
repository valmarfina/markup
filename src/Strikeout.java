import java.util.List;

public class Strikeout implements Markable {
  private final List<Markable> data;

  public Strikeout(List<Markable> data) {
    this.data = data;
  }

  @Override
  public void toMarkdown(StringBuilder dest) {
    StringBuilder tmp = new StringBuilder();
    for (Markable text : data) {
      text.toMarkdown(tmp);
    }
    tmp.insert(0, "~");
    tmp.append("~");
    dest.append(tmp);
  }

}
