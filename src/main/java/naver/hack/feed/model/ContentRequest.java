package naver.hack.feed.model;


public class ContentRequest {
    private int content_id;
    private String user_id;
    private String body;

    public ContentRequest(int content_id, String user_id, String body) {
        this.content_id = content_id;
        this.user_id = user_id;
        this.body = body;
    }

    public int getContent_id() {
        return content_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getBody() {
        return body;
    }
}
