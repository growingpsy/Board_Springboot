package com.psy.board.controller;

import com.psy.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor //final이 붙은 필드만 가지고 생성자를 만들겠다.
public class BoardController {
    private final BoardService boardService; //주입받고자하는 클래스
}
