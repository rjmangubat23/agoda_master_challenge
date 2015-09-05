
package news.agoda.com.sample.entities;

import com.google.gson.annotations.Expose;

public class MediaEntity {

    @Expose
    private String url;
    @Expose
    private String format;
    @Expose
    private Integer height;
    @Expose
    private Integer width;
    @Expose
    private String type;
    @Expose
    private String subtype;
    @Expose
    private String caption;
    @Expose
    private String copyright;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @return
     *     The format
     */
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @return
     *     The subtype
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    public String getCopyright() {
        return copyright;
    }


}
