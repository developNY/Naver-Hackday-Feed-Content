package naver.hack.feed.model;

public class ContentsReq {

    private String body;
    private String user_id;

    public ContentsReq() {

    }

    public ContentsReq(String body, String user_id) {
        this.body = body;
        this.user_id = user_id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
