package co.edu.uco.workbot.service.businesslogic;

public interface UseCase<D> {

	void execute(D domain);
	
}
