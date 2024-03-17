package Controller;

import Model.Empleado;
import com.employees.crud.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository repo;
    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return repo.findAll();
    }

}
