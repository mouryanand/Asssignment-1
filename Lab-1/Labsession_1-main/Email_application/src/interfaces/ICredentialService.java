package interfaces;

import model.Employee;

public interface ICredentialService {

		String generatePassword();
		String generateEmailAddress(Employee employee);
		void showCredentials(Employee employee);
	}


