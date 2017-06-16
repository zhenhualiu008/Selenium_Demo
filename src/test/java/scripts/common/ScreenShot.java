package scripts.common;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {

    private TakesScreenshot driver;
    // 测试失败截屏保存的路径
    private String path;
    protected static final Logger logger = Logger.getLogger(ScreenShot.class);

    public ScreenShot(TakesScreenshot driver){
        this.driver=driver;
        path=System.getProperty("user.dir")+ "//snapshot//"+ this.getClass().getSimpleName()+"_"+getCurrentTime() + ".png";
    }

    public void getScreenShot() {

        File screen = driver.getScreenshotAs(OutputType.FILE);
        File screenFile = new File(path);
        try {
            FileUtils.copyFile(screen, screenFile);
            logger.info("截图保存的路径:" + path);
        } catch (Exception e) {
            logger.error("截图失败");
            e.printStackTrace();
        }
    }

    /**
     * 获取当前时间
     */
    public String getCurrentTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String currentTime=sdf.format(date);
        return currentTime;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
