import java.io.IOException;
import java.io.InputStream;
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
    //类加载的时候执行
    static {
        init();
    }

    //加载属性
    private static void init() {
        InputStream in = null;
        try {
            Properties prop = new Properties();
            //getClassLoader()很重要
            in = DDNS.class.getClassLoader().getResourceAsStream("DDNS.properties");
            prop.load(in);

            accessKeyID = prop.getProperty("accessKeyID");
            accessKeySecret = prop.getProperty("accessKeySecret");
            subDomain = prop.getProperty("subDomain");
            profile = prop.getProperty("profile");
            RR = prop.getProperty("RR");
            type = prop.getProperty("type");


            assert in != null;
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
