package ex0831;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        new Main().execute();
    }

    public static final String CONFIG_FILE_PATH = "C:/90_ETC/hello.config";

    protected HelloIF hello;

    protected void prepareDependencies() {
        // 설정 파일에서 의존성 정보를 읽어온다.
        String className = readConfigFile();

        // 의존성 정보에 따라 HelloIF instance을 생성한다.
        try {
            hello = (HelloIF)Class.forName(className).newInstance();
            System.out.println("hello : " + hello);
        } catch (Exception e) {
            throw new RuntimeException("Invalid configuration");
        }
    }

    protected String readConfigFile() {
        try {
            File file = new File(CONFIG_FILE_PATH);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String className = reader.readLine();

            reader.close();

            return className;
        } catch (Exception e) {
            throw new RuntimeException("Cannot read the config file", e);
        }
    }

    public void execute() {
        prepareDependencies();

        Bower bower = new Bower();
        bower.execute(hello);
    }

}