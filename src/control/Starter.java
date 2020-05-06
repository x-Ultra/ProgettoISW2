package control;

import entity.Constants;

public class Starter {
	
	private Starter() {
		throw new IllegalStateException("Utility class");
	}
	
	public static void main(String[] args) {
		
		
		//project DAFFODIL
		Constants.JIRA_PROJ_NAME = "DAFFODIL";
		Constants.GIT_PROJ_NAME = "incubator-daffodil";
		GitInteractor.getLastCommits();
		
		//project BOOKKEEPER
		Constants.JIRA_PROJ_NAME = "BOOKKEEPER";
		Constants.GIT_PROJ_NAME = "bookkeeper";
		Buggy.getBuggyFiles();
		GitFilesAttributesFinder.getFinalTable();
		
		
		//project SYNCOPE
		Constants.JIRA_PROJ_NAME = "SYNCOPE";
		Constants.GIT_PROJ_NAME = "syncope";
		Buggy.getBuggyFiles();
		GitFilesAttributesFinder.getFinalTable();
	}

}
