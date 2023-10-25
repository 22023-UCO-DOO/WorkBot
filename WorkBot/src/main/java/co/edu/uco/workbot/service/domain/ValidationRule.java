package co.edu.uco.workbot.service.domain;

public interface ValidationRule<T> {
	void validator(T dato);
}
