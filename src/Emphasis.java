import java.util.List;

public class Emphasis implements Markable{
    private final List<Markable> data;

    public Emphasis(List<Markable> data) {
        this.data = data;
    }

    @Override
    public void toMarkdown(StringBuilder dest) {
        StringBuilder tmp = new StringBuilder();
        for(Markable text : data){
            text.toMarkdown(tmp);
        }
        tmp.insert(0, "*");
        tmp.append("*");
        dest.append(tmp);
    }
}
