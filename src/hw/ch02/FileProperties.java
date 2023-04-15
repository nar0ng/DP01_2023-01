package hw.ch02;

import java.util.Properties;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 속성 집합을 파일에 저장한다
// 어댑터 (상속을 이용함)
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}