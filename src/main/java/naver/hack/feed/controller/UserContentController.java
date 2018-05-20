package naver.hack.feed.controller;

import naver.hack.feed.container.ContentResponse;
import naver.hack.feed.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = "application/json")
public class UserContentController {
    @Autowired
    private ContentService contentService;

    @RequestMapping(value = "/{user_id}/contents", method = RequestMethod.GET)
    public List<ContentResponse> getContentByUser(@PathVariable("user_id") String user_id,
                                                  @RequestParam int page, @RequestParam int count){
        int offset = (page -1) * count;
        return contentService.getContentByUser(user_id, offset, count);
    }
}
