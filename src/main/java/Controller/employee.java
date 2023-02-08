package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller


public class employee {
    ArrayList<String> Doctor=new ArrayList<>();
    @ResponseBody
    @PostMapping("/doctor/add")
    public String adddoctor(@RequestParam String doctorname){
        this.Doctor.add(doctorname);
        return "successfully add"+doctorname;
    }
    @ResponseBody
    @GetMapping("/doctor/search/{id}")
    public String search(@PathVariable ("id")int id){
        return this.Doctor.get(id);}


    @ResponseBody
    @GetMapping("/teacher/all")
    public ArrayList<String>alldoctor(){
        return this.Doctor;
    }

    @ResponseBody
    @PutMapping("/teacher/update/{id}")
    public String doctorupdate(@RequestParam String doctorname ,@PathVariable("id")int id){
        this.Doctor.set(id,doctorname);
        return "successfully Update ";}
    @ResponseBody
    @DeleteMapping("/teacher/delete/{id}")
    public String delete(@PathVariable("id")int id){
        this.Doctor.remove(id);
        return "delete";}
}
