package com.houle.x.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class ImageUtil {

    private static String basePath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();

    /**
     * 生成随机文件名，当前年月日小时分钟秒钟+五位随机数
     *
     * @return
     */
    public static String getRandomFileName() {
        // 获取随机的五位数
        int rannum = r.nextInt(89999) + 10000;
        System.out.println(rannum);
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr + rannum;
    }

    /**
     * 获取输入文件流的扩展名
     *
     * @param thumbnail
     * @return
     */
    private static String getFileExtension(File thumbnail) {
        String originalFileName = thumbnail.getName();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }

    /**
     * 创建目标路径所涉及到的目录，即/home/work/houle/xxx.jpg, 那么 home work houle
     * 这三个文件夹都得自动创建
     *
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        System.out.println(realFileParentPath);  // /Users/houle/Desktop/image/level1/level2/level3/test.text
        File dirPath = new File(realFileParentPath);
        System.out.println(dirPath);  // /Users/houle/Desktop/image/level1/level2/level3/test.text
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    public static void main(String[] args) {
        System.out.println(basePath);  // /Users/houle/Desktop/general-practice/target/classes/
        // 20220415135238 + 19432
        System.out.println(getRandomFileName());
        String extensionName = getFileExtension(new File("/Users/houle/Desktop/R-C.jpeg"));
        System.out.println(extensionName);  // .jpeg

        File thumbnail = new File("/Users/houle/Desktop/R-C.jpeg");
        String originalFileName = thumbnail.getName();  // R-C.jpeg
        System.out.println(originalFileName);  // R-C.jpeg
        System.out.println(originalFileName.lastIndexOf("."));  // 3
        String newString = originalFileName.substring(3);
        System.out.println(newString);  // .jpeg

        makeDirPath("/level1/level2/level3");
    }
}
