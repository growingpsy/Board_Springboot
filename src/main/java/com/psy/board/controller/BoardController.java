package com.psy.board.controller;

import com.psy.board.dto.BoardDTO;
import com.psy.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor //final이 붙은 필드만 가지고 생성자를 만들겠다.
public class BoardController {
    private final BoardService boardService; //주입받고자하는 클래스

    @GetMapping("/save") //주소
    public String save() { //자바 메서드 이름
        return "save"; //리턴 화면
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO) { //BoardDTO앞에 @ModelAttribute 어노테이션 생략가능
        System.out.println("boardDTO = " + boardDTO);
        return "index";
    }
}


