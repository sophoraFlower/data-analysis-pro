package com.houle.x.utils;

public class PathUtil {

    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");  // Mac OS X
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/Users/houle/Desktop/image";
            System.out.println(basePath);  // /Users/baidu/work/image
        }
        basePath = basePath.replace("/", seperator);
        System.out.println(basePath);  // /Users/baidu/work/image
        return basePath;
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/images/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
    public static String getHeadLineImagePath() {
        String imagePath = "/upload/images/item/headtitle/";
        return imagePath.replace("/", seperator);
    }
    public static String getShopCategoryPath() {
        String imagePath = "/upload/images/item/shopcategory/";
        return imagePath.replace("/", seperator);
    }

    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);
        getImgBasePath();
        System.out.println(seperator);  // /
    }

}
