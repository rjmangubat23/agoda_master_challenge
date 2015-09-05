package news.agoda.com.sample.utils;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;

import news.agoda.com.sample.R;

/**
 * This class contains static utility methods
 */
public class Utilities {

    private Utilities() {
        //Prevents instantiation
    }

    public static String loadResource(Context context) {
        InputStream inputStream = context.getResources().openRawResource(R.raw.news_list);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];

        try {
            InputStreamReader inputReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferReader = new BufferedReader(inputReader);
            int n;
            while ((n = bufferReader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
            inputStream.close();
        } catch (IOException ioException) {
            return null;
        }

        return writer.toString();
    }



}
