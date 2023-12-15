package thecsdev.uiinputundo.client;


public class HistoryEntry {
    public final String text;
    public final int cursorPosition;

    public HistoryEntry(String text, int cursorPosition)
    {
        if(text == null) text = "";
        this.text = text;
        this.cursorPosition = cursorPosition;
    }

    @Override
    public HistoryEntry clone()
    {
        return new HistoryEntry(text, cursorPosition);
    }

    public static HistoryEntry empty()
    {
        return new HistoryEntry("", 0);
    }
}
