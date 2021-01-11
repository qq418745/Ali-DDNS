import java.io.*;
import java.util.Properties;

/**
 * hjcDDNS
 * info:
 * Mr.liuchengming
 * 2020-08-04 14:43
 **/
public class Config {

     static  String accessKeyID;
     static  String accessKeySecret;
     static  String subDomain;
     static  String profile;
     static  String RR;
     static  String type;

    static {
        init();
    }
    //加载属性
    private static void init() {
        FileInputStream in = null;
        try {

            File file = new File("");
            String absolutePath = file.getAbsolutePath();//设定为上级文件夹 获取绝对路径
            System.out.println("配置文件绝对路径 = " + absolutePath);
            Properties prop = new Properties();

            in = new FileInputStream(absolutePath+ "/DDNS.properties");
            prop.load(in);

            accessKeyID = prop.getProperty("accessKeyID");
            accessKeySecret = prop.getProperty("accessKeySecret");
            accessKeyID = prop.getProperty("accessKeyID");
            accessKeySecret = prop.getProperty("accessKeySecret");
            subDomain = prop.getProperty("subDomain");
            profile = prop.getProperty("profile");
            RR = prop.getProperty("RR");
            type = prop.getProperty("type");

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            if( in != null ){
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
