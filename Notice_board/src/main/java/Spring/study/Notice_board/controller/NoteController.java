package Spring.study.Notice_board.controller;

import Spring.study.Notice_board.domain.Note;
import Spring.study.Notice_board.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/note")
public class NoteController {

    private NoteService noteService;

    @Autowired
    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping("add")
    public String add() {
        return "note/add";
    }

    public String addSave(
            @RequestParam("title") String title
            , @RequestParam("content") String content
            , @RequestParam("writer") String writer) {
        Note note = new Note(title, content, writer);
        noteService.addNote(note);

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
        Note note = new Note(title, content, writer);
        note.setIdx(idx);

        noteService.update(note);

        return "redirect:view/" + idx;
    }

    @RequestMapping("/delete.do/{idx}")
    public String delete(@PathVariable("idx") Long idx) {
        noteService.delete(idx);

        return "redireact:../list";
    }
}
