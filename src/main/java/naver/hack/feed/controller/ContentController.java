package naver.hack.feed.controller;

import com.google.gson.Gson;
import naver.hack.feed.container.ContentResponse;
import naver.hack.feed.model.ContentBody;
import naver.hack.feed.model.ContentRequest;
import naver.hack.feed.model.ContentsReq;
import naver.hack.feed.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contents", produces = "application/json")
public class ContentController {
    @Autowired
    private ContentService contentService;
    @Autowired
    private Gson gson;

    @PostMapping(value = "")
    public void insertContent(@RequestBody ContentsReq contentsReq){
        contentService.insertContent(contentsReq);
    }

    @RequestMapping(value = "/{content_id}", method = RequestMethod.PUT)
    public void modifyContent(@PathVariable("content_id") Integer content_id, @RequestBody String body) {
        ContentBody contentBody = gson.fromJson(body, ContentBody.class);
        contentService.modifyContent(content_id, contentBody.getBody());
    }

    @RequestMapping(value = "/{content_id}", method = RequestMethod.DELETE)
    public void deleteContent(@PathVariable("content_id") int content_id){
        contentService.deleteContent(content_id);
    }

    @RequestMapping(value = "/{content_id}", method = RequestMethod.GET)
    public ContentResponse getContentByContentId(@PathVariable("content_id") int content_id) {
        return contentService.getContentByContentId(content_id);
    }

    @RequestMapping(value = "/followings", method = RequestMethod.GET)
    public List<ContentResponse> getFollowerContent(@RequestParam("id") String id) {
        System.out.println(id);
        return contentService.getFollowerContent(id);
    }
}