package com.example.demo;

import com.example.demo.bean.WallPaper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWallPaperRespository extends JpaRepository<WallPaper, Integer> {

}
