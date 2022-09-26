package com.cyn;

import com.cyn.config.Tess4jClient;
import net.sourceforge.tess4j.TesseractException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

/**
 * @author G0dc
 * @description:
 * @date 2022/9/26 11:48
 */
@SpringBootTest(classes = App.class)
public class OCRTest {
    @Autowired
    private Tess4jClient tess4jClient;

    @Test
    void testOCR() throws TesseractException {
        File file = new File("C:\\Users\\G0dc\\Desktop\\resourse\\car\\Snipaste_2022-09-26_12-08-29.png");
        String licensePlate = tess4jClient.doOCR(file);
        System.out.println("licensePlate = " + licensePlate);
    }
}
