package com.huyuya.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huyu
 * @version 1.0
 * @date 2021/3/29 20:08
 */
@Controller
public class RouterController {
    @RequestMapping({"/", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "views/login";
    }

    @PreAuthorize("hasAuthority('user_root')")
    @RequestMapping("/level1/{id}")
    public String levelOne(@PathVariable("id") int id) {
        return "views/level1/" + id;
    }

    @PreAuthorize("hasAuthority('user_insert')")
    @RequestMapping("/level2/{id}")
    public String levelTwo(@PathVariable("id") int id) {
        return "views/level2/" + id;
    }

    @PreAuthorize("hasAuthority('user_delete')")
    @RequestMapping("/level3/{id}")
    public String levelThree(@PathVariable("id") int id) {
        return "views/level3/" + id;
    }

    @PreAuthorize("hasAuthority('user_edit')")
    @RequestMapping("/level4/{id}")
    public String levelFour(@PathVariable("id") int id) {
        return "views/level4/" + id;
    }

    @PreAuthorize("hasAuthority('user_select')")
    @RequestMapping("/level5/{id}")
    public String levelFive(@PathVariable("id") int id) {
        return "views/level5/" + id;
    }
}
