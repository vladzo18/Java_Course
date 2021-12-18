package lab_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCollection {

    private String _buffer;
    private String _delimiter;

    public StringCollection() {
        _delimiter = " ";
        _buffer = "";
    }
    public StringCollection(String delimiter) {
        _delimiter = delimiter;
        _buffer = "";
    }

    public void AddValue(String value) {
        _buffer += value + _delimiter;
    }
    public void RemoveValue(String value) throws Exception {
        Pattern pattern = Pattern.compile(value);
        Matcher matcher = pattern.matcher(_buffer);

        if (matcher.find()) {
            _buffer = _buffer.replace(value + _delimiter, "");
        } else {
            throw new Exception("А такого значения у нас нет, увы!");
        }

    }
    public String GetStringCollection() {
        return _buffer;
    }

}
