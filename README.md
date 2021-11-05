# markup
a set of classes for text markup

- Разработайте набор классов для текстовой разметки.
- Класс Paragraph может содержать произвольное число других элементов разметки и текстовых элементов.
- Класс Text – текстовый элемент.
- Классы разметки Emphasis, Strong, Strikeout – выделение, сильное выделение и зачеркивание. Элементы разметки могут содержать произвольное число других элементов разметки и текстовых элементов.
- Все классы должны реализовывать метод toMarkdown(StringBuilder), который должен генерировать Markdown-разметку по следующим правилам: 
текстовые элементы выводятся как есть;
- выделенный текст окружается символами '*';
- сильно выделенный текст окружается символами '__';
- зачеркнутый текст окружается символами '~'.

Следующий код должен успешно компилироваться:
```java
Paragraph paragraph = new Paragraph(List.of(
    new Strong(List.of(
            new Text("1"),
            new Strikeout(List.of(
                new Text("2"),
                new Emphasis(List.of(
                    new Text("3"),
                    new Text("4")
                )),
                new Text("5")
            )),
            new Text("6")
        ))
    ));
```
Вызов paragraph.toMarkdown(new StringBuilder()) должен заполнять переданный StringBuilder следующим содержимым:
   `__1~2*34*5~6__`
   
   
# markup
a set of classes for text markup
   
- Develop a set of classes for text markup.
- The Paragraph class can contain any number of other markup elements and text elements.
- The Text class is a text element.
- The Emphasis, Strong, Strikeout classes are Emphasis, Strong Selection and Strikeout. Markup elements can contain any number of other markup elements and text elements.
- All classes must implement the toMarkdown(StringBuilder) method, which must generate Markdown markup according to the following rules: 
text elements are rendered as is;
- selected text is surrounded by '*' symbols;
- heavily selected text is surrounded by '__' symbols;
- Strikethrough text is surrounded by '~'.

The following code should compile successfully:
```java
Paragraph paragraph = new Paragraph(List.of(
    new Strong(List.of(
            new Text("1"),
            new Strikeout(List.of(
                new Text("2"),
                new Emphasis(List.of(
                    new Text("3"),
                    new Text("4")
                )),
                new Text("5")
            )),
            new Text("6")
        ))
    ));
```
Calling paragraph.toMarkdown(new StringBuilder()) should fill the passed StringBuilder with the following content:
 `__1~2*34*5~6__`
