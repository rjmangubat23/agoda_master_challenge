package news.agoda.com.sample.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import news.agoda.com.sample.R;
import news.agoda.com.sample.adapters.NewsListAdapter;
import news.agoda.com.sample.entities.MediaEntity;
import news.agoda.com.sample.entities.NewsEntity;
import news.agoda.com.sample.entities.NewsEntity.Result;
import news.agoda.com.sample.utils.Utilities;

public class MainActivity extends ListActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private List<Result> newsItemList;

    protected void init() {
        Fresco.initialize(this);
        newsItemList = new ArrayList<>();

        String newsListSource = Utilities.loadResource(MainActivity.this);
        Gson gson = new GsonBuilder().create();

        if (!newsListSource.isEmpty()) {
            NewsEntity newsJsonEntity = gson.fromJson(newsListSource, NewsEntity.class);
            newsItemList = newsJsonEntity.getResults();
        }

        NewsListAdapter adapter = new NewsListAdapter(this, R.layout.list_item_news, newsItemList);
        setListAdapter(adapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init(); //Initialize all components used

        ListView listView = getListView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Result newsEntity;
                List<MediaEntity> mediaEntity;
                String storyURL = "";
                String title = "";
                String summary = "";
                String imageURL = "";
                try {
                    newsEntity = newsItemList.get(position);
                    mediaEntity = newsEntity.getMultimedia();
                    storyURL = newsEntity.getArticleUrl();
                    title = newsEntity.getTitle();
                    summary = newsEntity.getSummary();
                    imageURL = mediaEntity.get(position).getUrl();
                } catch (IndexOutOfBoundsException err) {
                    err.printStackTrace();
                }

                Intent intent = new Intent(MainActivity.this, DetailViewActivity.class);
                intent.putExtra("title", title);
                intent.putExtra("summary", summary);
                intent.putExtra("storyURL", storyURL);
                intent.putExtra("imageURL", imageURL);

                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
