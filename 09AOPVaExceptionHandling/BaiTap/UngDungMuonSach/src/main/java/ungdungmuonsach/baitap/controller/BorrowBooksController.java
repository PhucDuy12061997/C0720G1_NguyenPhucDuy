package ungdungmuonsach.baitap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ungdungmuonsach.baitap.entity.Books;
import ungdungmuonsach.baitap.service.BookService;

import java.awt.print.Book;
import java.util.List;

@Controller
public class BorrowBooksController {
    @Autowired
    BookService bookService;

    @GetMapping({"/", "/index"})
    public String home(Model model) {
        List<Books> booksList = bookService.findAll();
        model.addAttribute("books", booksList);
        return "index";

    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("books", new Books());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Books books, RedirectAttributes redirectAttributes) {

        this.bookService.save(books);
        redirectAttributes.addFlashAttribute("message",
                "book added !");
        return "redirect:/index";
//        return "index";
    }

    @GetMapping("/view")
    public String viewBlog(@RequestParam Integer id, Model model) {
        model.addAttribute("books", bookService.findById(id));
        return "view";
    }

    @GetMapping("/borrow")
    public String Borrow(@RequestParam(value = "idBook") Integer id,Model model) throws Exception {
        List<Books> booksList = bookService.findAll();
        model.addAttribute("books", booksList);
        String borrow="Borrow Complete And  !"+ this.bookService.borrow(id);
        model.addAttribute("message",borrow);
//        redirectAttributes.addFlashAttribute("message", "Borrow Complete !"+ this.bookService.borrow(id));
        return "index";
//        return "index";
    }

    @GetMapping("/give-back")
    public String showGiveBack(@RequestParam Integer id, Model model) {
        model.addAttribute("id", id);
        return "give-back";
    }
    @PostMapping("/give-back")
    public String giveBack(@RequestParam Integer rentNumber, @RequestParam Integer idBook,
                           RedirectAttributes redirectAttributes) {
        String message = this.bookService.giveBack(rentNumber, idBook);
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:/index";
    }
    @ExceptionHandler(value = Exception.class)
    public String handleException() {
        return "error-book";
    }
}
