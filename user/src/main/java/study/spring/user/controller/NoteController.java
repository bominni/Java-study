package study.spring.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import study.spring.user.domain.Note;
import study.spring.user.service.NoteService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/")
public class NoteController {

    private NoteService noteService;

    @Autowired
    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping("/write")
    public String write() {
        return "note/write";
    }

    @PostMapping("/write-save.do")
    public String writeSave(
            @RequestParam("title") String title
            , @RequestParam("content") String content
            , @RequestParam("writer") String writer) {

        LocalDateTime time = LocalDateTime.now();
        Long count = Long.valueOf(0);
        Note note = new Note(title, content, writer, time, count);
        noteService.writeNote(note);

        return "redirect:list";
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("note/list");

        List<Note> list = noteService.getList();
        mv.addObject("list", list);

        return mv;
    }

    @RequestMapping("/view/{idx}")
    public ModelAndView view(
            @PathVariable("idx") Long idx) {
        ModelAndView mv = new ModelAndView("note/view");

        Note note = noteService.read(idx);
        mv.addObject("note", note);

        return mv;
    }

    @GetMapping("/update/{idx}")
    public ModelAndView update(
            @PathVariable("idx") Long idx) {
        ModelAndView mv = new ModelAndView("note/update");

        Note note = noteService.read(idx);
        mv.addObject("note", note);

        return mv;
    }

    @RequestMapping("/update-save.do")
    public String updateSave(
            @RequestParam("idx") Long idx
            , @RequestParam("title") String title
            , @RequestParam("content") String content
            , @RequestParam("writer") String writer) {

        LocalDateTime time = LocalDateTime.now();
        Long count = Long.valueOf(0);
        Note note = new Note(title, content, writer, time, count);
        note.setIdx(idx);

        noteService.update(note);

        return "redirect:list";
    }

    @RequestMapping("/delete.do/{idx}")
    public String delete(@PathVariable("idx") Long idx) {
        noteService.delete(idx);

        return "redirect:../list";
    }
}
