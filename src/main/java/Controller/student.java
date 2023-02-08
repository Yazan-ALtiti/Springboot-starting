package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class student {
    ArrayList<String> student=new ArrayList<>();
    @ResponseBody
    @PostMapping("/teacher/add")
    public String addstudant(@RequestParam String studantname){
        this.student.add(studantname);
        return "Successfully add"+studantname;}


    @ResponseBody
    @GetMapping("/teacher/search/{id}")
    public String search(@PathVariable("id")int id){
        return this.student.get(id);
    }
    @ResponseBody
    @GetMapping("/teacher/all")
    public ArrayList<String>allstudant(){
        return this.student;
    }
    @ResponseBody
    @PutMapping("/teacher/update/{id}")
    public String employeeupdate(@RequestParam String studantname ,@PathVariable("id")int id){
        this.student.set(id,studantname);
        return "successfully Update ";

    }
    @ResponseBody
    @DeleteMapping("/teacher/delete/{id}")
    public String delete(@PathVariable("id")int id){
        this.student.remove(id);
        return "delete";
    }
}
