import com.example.demo.entity.WorkflowTemplate;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.WorkflowTemplateRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkflowTemplateService {

    private final WorkflowTemplateRepository repository;

    public WorkflowTemplateService(WorkflowTemplateRepository repository) {
        this.repository = repository;
    }

    public WorkflowTemplate getTemplateById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("WorkflowTemplate not found with id: " + id));
    }
}