package api;

import model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserApi {


    private final UserService service;

    public UserApi(UserService service) {
        this.service = service;
    }

    @GetMapping()
    public List<User> findAllBooks() {
        return service.findAllUsers();
    }
}
