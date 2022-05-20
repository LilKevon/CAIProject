//Package
package GUI;

//public class ProgressChecker. This class is designed to check the progress of the user's learning. If a user has completed a section of learning, the bar will then progress 25. 
//Progressing to 100 will open the activity button. Note that completing the same section does not increase the progress bar. This is because of a algorithm below.
public class ProgressChecker {
	
	//static booleans Progress(i). They are all predefined to false. These will be the status checkers for each section. They are false because when the user starts out, none of the sections are completed.
	static boolean Progress1 = false;
	static boolean Progress2 = false;
	static boolean Progress3 = false;
	static boolean Progress4 = false;


	//int method called ProgressCheck with parameter int B.
	public int ProgressCheck(int B ) {

		//if B == 25(Meaning the first section was completed), then check if it has already been completed with progress1. If not, then set Progress1 to true and return 25. 
		//Otherwise, if Progress1 = true, the first section as already been completed, so then just return 0.
		if(B == 25) {

			if(Progress1 == false) {
				Progress1 = true;
				return 25;

			}
			else if(Progress1 == true) return 0;
		}
		//if B == 50(Meaning the second section was completed), then check if it has already been completed with Progress2. If not, then set Progress1 to true and return 25. 
		//Otherwise, if Progress2 = true, the second section as already been completed, so then just return 0.
		if(B == 50) {

			if(Progress2 == false) {
				Progress2 = true;
				return 25;
			}
			else if(Progress2 == true) return 0;
		}

		//if B == 75(Meaning the third section was completed), then check if it has already been completed with Progress3. If not, then set Progress1 to true and return 25. 
		//Otherwise, if Progress3 = true, the third section as already been completed, so then just return 0.
		if(B == 75) {

			if(Progress3 == false) {
				Progress3 = true;
				return 25;
			}
			else if(Progress3 == true) return 0;
		}

		//if B == 100(Meaning the fourth section was completed), then check if it has already been completed with Progress4. If not, then set Progress4 to true and return 25. 
		//Otherwise, if Progress4 = true, the fourth section as already been completed, so then just return 0.
		if(B == 100) {

			if(Progress4 == false) {
				Progress4 = true;
				return 25;
			}
			else if(Progress4 == true) return 0;
		}


		return 0;









	}



}
