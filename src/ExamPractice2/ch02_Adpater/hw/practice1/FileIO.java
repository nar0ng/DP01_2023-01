package hw.ch02;

import java.io.IOException;
// 필요로 하는 타켓 역할 인터페이스
public interface FileIO { 
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
