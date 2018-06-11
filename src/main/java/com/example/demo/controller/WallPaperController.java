package com.example.demo.controller;

import com.example.demo.IWallPaperRespository;
import com.example.demo.bean.WallPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WallPaperController {
    @Autowired
    private IWallPaperRespository wallPaperRespository;

    /**
     * 获取全部的壁纸信息
     *
     * @return
     */
    @RequestMapping(value = "/wallpapers", method = RequestMethod.GET)
    public List<WallPaper> getGirlList(){
        return wallPaperRespository.findAll();
    }
}
