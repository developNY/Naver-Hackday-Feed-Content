package naver.hack.feed.repository;

import naver.hack.feed.dto.ContentDto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ContentRepository {
    @Insert("INSERT INTO contents (user_id, body) VALUES (#{user_id}, #{body})")
    void insertContent(@Param("user_id") String user_id, @Param("body") String body);

    @Update("UPDATE contents SET  body = #{body} WHERE content_id = #{content_id}")
    void modifyContent(@Param("content_id") int content_id,  @Param("body") String body);

    @Delete("DELETE FROM contents WHERE content_id = #{content_id}")
    void deleteContent(@Param("content_id") int content_id);

    @Select("SELECT * FROM  contents WHERE  user_id = #{user_id} ORDER BY  created_at DESC LIMIT  #{offset}, #{maxPost}")
    List<ContentDto> getContentByUser(@Param("user_id") String user_id, @Param("offset") int offset, @Param("maxPost")
            int maxPost);

    @Select("SELECT * FROM contents WHERE content_id = #{content_id}")
    ContentDto getContentByContentId(@Param("content_id") int content_id);

    @Select("SELECT * FROM  contents WHERE  user_id = #{user_id}")
    List<ContentDto> getContentByOnlyUser(@Param("user_id") String user_id);
}

