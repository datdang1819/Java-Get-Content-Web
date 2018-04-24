/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testappgethtml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;

/**
 *
 * @author DAT
 */
public class TestAppGetHtml {

public static void main(String[] args) throws IOException {     
        
        PrintWriter writer = new PrintWriter("Index" + ".html");
        URL url = new URL("https://vnexpress.net/");
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            writer.println(line);
        }
    }
}
