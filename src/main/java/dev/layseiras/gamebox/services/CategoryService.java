package dev.layseiras.gamebox.services;

import dev.layseiras.gamebox.model.Category;
import dev.layseiras.gamebox.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;

    public Category addNewCategory(Category category) {
        return repository.save(category);
    }

    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    public Optional<Category> getCategoryById(Long id) {
        return repository.findById(id);
    }

    public void deleteCategoryById(Long id) {
        repository.deleteById(id);
    }
}
