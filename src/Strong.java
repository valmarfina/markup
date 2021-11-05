import java.util.List;

public class Strong implements Markable {
  private final List<Markable> data;

  public Strong(List<Markable> data) {
    this.data = data;
  }

  @Override
  public void toMarkdown(StringBuilder dest) {
    StringBuilder tmp = new StringBuilder();
    for (Markable text : data) {
      text.toMarkdown(tmp);
    }
    tmp.insert(0, "__");
    tmp.append("__");
    dest.append(tmp);
  }
}
