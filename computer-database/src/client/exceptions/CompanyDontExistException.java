package client.exceptions;

public class CompanyDontExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public CompanyDontExistException(Long idCompany) {
		super(String.format("Company %d does not exist !", idCompany));
	}
	
}
