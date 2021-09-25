package A;

import java.util.Date;

public class Country {
	long  totalPopulation;
	long vaccineDosesPerDay;
	
	Date vaccinationStartDate;
	
	
	public Date getVaccinationStartDate() {
		return vaccinationStartDate;
	}
	public void setVaccinationStartDate(Date vaccinationStartDate) {
		this.vaccinationStartDate = vaccinationStartDate;
	}
	public long getTotalPopulation() {
		return totalPopulation;
	}
	public void setTotalPopulation(long totalPopulation) {
		this.totalPopulation = totalPopulation;
	}
	public long getVaccineDosesPerDay() {
		return vaccineDosesPerDay;
	}
	public void setVaccineDosesPerDay(long vaccineDosesPerDay) {
		this.vaccineDosesPerDay = vaccineDosesPerDay;
	}
	public Country(long totalPopulation, long vaccineDosesPerDay) {
		super();
		this.totalPopulation = totalPopulation;
		this.vaccineDosesPerDay = vaccineDosesPerDay;
	}
	public Country(long totalPopulation, long vaccineDosesPerDay, Date vaccinationStartDate) {
		super();
		this.totalPopulation = totalPopulation;
		this.vaccineDosesPerDay = vaccineDosesPerDay;
		this.vaccinationStartDate = vaccinationStartDate;
	}
	
}
