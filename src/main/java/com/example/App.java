package com.example;

import java.io.File;
import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	System.out.printf("Size of POM: %d%n", FileUtils.sizeOf(new File("pom.xml")));
    }
}
