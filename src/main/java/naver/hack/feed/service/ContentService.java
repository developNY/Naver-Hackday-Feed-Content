package naver.hack.feed.service;

import naver.hack.feed.container.ContentResponse;
import naver.hack.feed.dto.ContentDto;
import naver.hack.feed.model.ContentsReq;
import naver.hack.feed.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContentService {
    @Autowired
    private ContentRepository repository;

    public void insertContent(ContentsReq contentsReq){
        repository.insertContent(contentsReq.getUser_id(), contentsReq.getBody());
    }
    public void modifyContent(int content_id, String body){
        repository.modifyContent(content_id, body);
    }
    public void deleteContent(int content_id){
        repository.deleteContent(content_id);
    }
    public List<ContentResponse> getContentByUser(String user_id, int offset, int count){
        List<ContentDto> dto = repository.getContentByUser(user_id, offset, count);
        return dto.stream().map(ContentResponse::fromDTO).collect(Collectors.toList());
    }
    public ContentResponse getContentByContentId(int content_id) {
        ContentDto dto =  repository.getContentByContentId(content_id);

        return ContentResponse.fromDTO(dto);
    }

    public List<ContentResponse> getFollowerContent(String id) {
        List<ContentDto> dto = dto = repository.getContentByOnlyUser(id);
        return dto.stream().map(ContentResponse::fromDTO).collect(Collectors.toList());
    }
}
