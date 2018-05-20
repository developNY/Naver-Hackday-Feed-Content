package naver.hack.feed.container;

import naver.hack.feed.dto.ContentDto;

import java.sql.Timestamp;

public class ContentResponse {
    private String user_id;
    private String body;
    private Integer content_id;
    private Timestamp created_at;

    public static ContentResponse fromDTO(ContentDto dto) {
        return new ContentResponse(dto.getcontent_id(), dto.getuser_id(), dto.getcreated_at(),
                dto.getBody());
    }

    public ContentResponse(Integer content_id, String user_id, Timestamp created_at, String body) {
        super();
        this.user_id = user_id;
        this.body = body;
        this.content_id = content_id;
        this.created_at = created_at;
    }

    public ContentResponse(String user_id, String body) {
        super();
        this.user_id = user_id;
        this.body = body;
    }
    public String getuser_id() {
        return user_id;
    }
    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public Integer getcontent_id() {
        return content_id;
    }
    public void setcontent_id(Integer content_id) {
        this.content_id = content_id;
    }
    public Timestamp getcreated_at() {
        return created_at;
    }
    public void setcreated_at(Timestamp content_id) {
        this.created_at = created_at;
    }
}
