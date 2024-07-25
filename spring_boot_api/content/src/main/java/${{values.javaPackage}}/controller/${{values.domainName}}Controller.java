package ${{values.groupId}}.controller;

import ${{values.groupId}}.entity.${{values.domainName}};
import ${{values.groupId}}.service.${{values.domainName}}Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/${{values.domainNameLc}}s")
public class ${{values.domainName}}Controller {
    private final ${{values.domainName}}Service ${{values.domainNameLc}}Service;

    public ${{values.domainName}}Controller(${{values.domainName}}Service ${{values.domainNameLc}}Service) {
        this.${{values.domainNameLc}}Service = ${{values.domainNameLc}}Service;
    }

    @GetMapping("/")
    public ResponseEntity<List<${{values.domainName}}>> getAll() {
        return ResponseEntity.ok(this.${{values.domainNameLc}}Service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<${{values.domainName}}> getById(Long id) {
        return ResponseEntity.ok(this.${{values.domainNameLc}}Service.getById(id));
    }
}