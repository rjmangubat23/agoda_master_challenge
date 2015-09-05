package news.agoda.com.sample.entities;

import android.content.Context;
import android.test.InstrumentationTestCase;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import news.agoda.com.sample.activities.MainActivity;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class MediaEntityTest extends InstrumentationTestCase {
    String response = null;

    @Before
    public void SetUp() throws IOException {
        Context context = Mockito.mock(MainActivity.class);

        //response = loadResource();

/*
    Context context = Mockito.mock(Context.class);

    String newsListSource = Utilities.loadResource(context);

        Gson gson = new GsonBuilder().create();
        NewsEntity newsEntity = gson.fromJson(newsListSource, NewsEntity.class);
        List<Result> resultsList = newsEntity.getResults();
        Result result = resultsList.get(resultListIndex);
        List<MediaEntity> mediaEntityList = result.getMultimedia();
        mediaEntity = mediaEntityList.get(mediaListIndex); //get the first entry of multimedia entity
*/

        //mediaEntity = newsEntity.getNumResults()

    }

    public void testMediaEntity() throws Exception {
       assertNotNull(response);
    }

    public void testGetUrl() throws Exception {

    }

    public void testGetFormat() throws Exception {

    }

    public void testGetHeight() throws Exception {

    }

    public void testGetWidth() throws Exception {

    }

    public void testGetType() throws Exception {

    }

    public void testGetSubtype() throws Exception {

    }

    public void testGetCaption() throws Exception {

    }

    public void testGetCopyright() throws Exception {

    }

    private static File getFileFromPath(Object obj, String fileName) {
        ClassLoader classLoader = obj.getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        return new File(resource.getPath());
    }

    @Test
    public void fileObjectShouldNotBeNull() throws Exception {
        File file = getFileFromPath(this, "res/raw/news_list.json");
        assertThat(file, notNullValue());
    }
}