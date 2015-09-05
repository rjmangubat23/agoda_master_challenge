
package news.agoda.com.sample.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class NewsEntity {


    private static final String TAG = NewsEntity.class.getSimpleName();

    @Expose
    private String status;
    @Expose
    private String copyright;
    @Expose
    private String section;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @Expose
    private List<Result> results = new ArrayList<>();

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }


    /**
     * @return The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * @return The section
     */
    public String getSection() {
        return section;
    }

    /**
     * @return The lastUpdated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @return The numResults
     */
    public Integer getNumResults() {
        return numResults;
    }

    /**
     * @return The results
     */
    public List<Result> getResults() {
        return results;
    }

    public static class Result {

        @Expose
        private String section;
        @Expose
        private String subsection;
        @Expose
        private String title;
        @SerializedName("abstract")
        @Expose
        private String summary;
        @Expose
        private String articleUrl;
        @Expose
        private String byline;
        @SerializedName("published_date")
        @Expose
        private String publishedDate;
        @Expose
        private List<MediaEntity> multimedia;

        /**
         * @return The section
         */
        public String getSection() {
            return section;
        }

        /**
         * @return The subsection
         */
        public String getSubsection() {
            return subsection;
        }

        /**
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * @return The abstract or summary
         */
        public String getSummary() {
            return summary;
        }

        /**
         * @return The articleUrl
         */
        public String getArticleUrl() {
            return articleUrl;
        }

        /**
         * @return The byline
         */
        public String getByline() {
            return byline;
        }

        /**
         * @return The publishedDate
         */
        public String getPublishedDate() {
            return publishedDate;
        }

        /**
         * @return The multimedia
         */
        public List<MediaEntity> getMultimedia() {
            return multimedia;
        }
    }

}



