package A;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TechnicalAlgoTraders {

	static List<AlgoTraderJob> jobs = new ArrayList<AlgoTraderJob>();

	public static void main(String[] args) {
		TechnicalAlgoTraders technicalAlgoTraders = new TechnicalAlgoTraders();
		ArrayList<Long> dependencies1 = new ArrayList<Long>();
		TechnicalAlgoTraders.jobs.add(new AlgoTraderJob(1, "CRM", "select * from CRM", dependencies1));

		ArrayList<Long> dependencies2 = new ArrayList<Long>();
		dependencies2.add((long) 1);
		TechnicalAlgoTraders.jobs.add(new AlgoTraderJob(2, "CRM", "select * from RealStateJobs", dependencies2));

		ArrayList<Long> dependencies3 = new ArrayList<Long>();
		dependencies3.add((long) 1);
		dependencies3.add((long) 2);

		TechnicalAlgoTraders.jobs.add(new AlgoTraderJob(3, "CRM", "select * from MedicalJobs", dependencies3));

		ArrayList<Long> dependencies4 = new ArrayList<Long>();
		dependencies4.add((long) 2);
		TechnicalAlgoTraders.jobs.add(new AlgoTraderJob(4, "CRM", "select * from SaaS", dependencies4));

		// dependencies

		technicalAlgoTraders.findJobDependenciesByID(4);

		Country countryEg = new Country(100000000, 10000, Date.valueOf(LocalDate.now()));
		Country countryUSA = new Country(800000000, 10000, Date.valueOf(LocalDate.now()));
		Country countryLebanon = new Country(10000000, 10000, Date.valueOf(LocalDate.now()));
		Country countrySaude = new Country(5000000, 1000, Date.valueOf(LocalDate.now()));

		List<Country> countries = new ArrayList<Country>();
		countries.add(countrySaude);
		countries.add(countryLebanon);
		countries.add(countryUSA);
		countries.add(countryEg);

		int N = 5;
		int days = technicalAlgoTraders.findRequiredDaysToReachAdditionalFlightsGlobally(countries, N);
		System.out.print("Required Days to incread global flights by " + N + ": " + days);

	}
	/*
	 * TODO consider N 
	 */
	private int findRequiredDaysToReachAdditionalFlightsGlobally(List<Country> countries, int N) {
		int result = -1;
		List<Integer> requiredDaysPerCountry = new ArrayList<Integer>();
		for (int i = 0; i < countries.size(); i++) {
			Country c = countries.get(i);
			long requiredDays = c.totalPopulation / c.vaccineDosesPerDay;

			if (c.vaccinationStartDate.getDate() > Date.valueOf(LocalDate.now()).getDate()) {
				int toBeAdded = c.vaccinationStartDate.getDate() - Date.valueOf(LocalDate.now()).getDate();
				requiredDaysPerCountry.add((int) (toBeAdded + requiredDays));
			} else {
				int toBeSub = Date.valueOf(LocalDate.now()).getDate() - c.vaccinationStartDate.getDate();
				requiredDaysPerCountry.add((int) (requiredDays - toBeSub));
			}
		}
		return Collections.max(requiredDaysPerCountry);
	}

	public float findMaxFloatInArray(float[] arr) {
		float maxi = Float.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		return maxi;

	}

	/*
	 * return job dependencies from all jobs.
	 */
	public List<Long> findJobDependenciesByID(long id) {
		List<Long> jobDependencies = jobs.stream().filter(job -> job.ID == id).findFirst().get().getDependencies();
		for (AlgoTraderJob job : TechnicalAlgoTraders.jobs) {
			if (jobDependencies.contains(job.ID)) {
				System.out.println("from dependencies: " + job.toString());
			} else {
				System.out.println("NOT from dependencies: " + job.toString());
			}
		}
		return jobDependencies;
	}

}
