package kr.codesqaud.cafe.cafeservice.controller;

import kr.codesqaud.cafe.cafeservice.exhandler.exception.ArticleNotFoundException;
import kr.codesqaud.cafe.cafeservice.exhandler.exception.LoginNotFoundException;
import kr.codesqaud.cafe.cafeservice.exhandler.exception.MemberNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandler {
    private final Logger log = LoggerFactory.getLogger(MemberController.class);

    @ExceptionHandler(ArticleNotFoundException.class)
    public String articleNotFoundException(ArticleNotFoundException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }

    @ExceptionHandler(MemberNotFoundException.class)
    public String memberNotFountException(MemberNotFoundException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }

    @ExceptionHandler(LoginNotFoundException.class)
    public String loginException(LoginNotFoundException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public String exHandle(Exception e, Model model) {
        log.error("[exceptionHandle] ex", e);
        model.addAttribute("errorMessage", e.getMessage());
        return "error";
    }
}
