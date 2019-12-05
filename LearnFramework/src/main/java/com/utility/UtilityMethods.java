package com.utility;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityMethods {
	//Taking Screenshot Methods
	public String Screenshot(WebDriver driver)
    {
		String src_path = "D:\\Framework\\LearnFramework\\Reports\\Screenshots";
        UUID uuid = UUID.randomUUID();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(src_path+uuid+".jpeg"));
        }catch(Exception e) {
            System.out.println("Unable to take screenshot");
        }
        String src_name = src_path + uuid +".jpeg";
        return src_name;
}
	
}
