public class Employee {
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;

	Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double taxSalary = 0.0;
		if (this.salary <= 1000) {
			taxSalary = 0.0;
			return 0.0;
		} else if (this.salary > 1000) {
			taxSalary = this.salary * 0.03;
		}
		return taxSalary;
	}

	public double bonus() {
		double over_time;
		double bonus_salary = 0.0;
		if (this.workHours > 40) {
			over_time = this.workHours - 40;
			bonus_salary = over_time * 30.0;
		}
		return bonus_salary;
	}

	public double raiseSalary() {
		double raiseAmount = 0.0;
		int current_year = 2021;
		if (current_year - this.hireYear < 10) {
			raiseAmount = this.salary * 0.05;
		} else if (9 < current_year - this.hireYear && current_year - this.hireYear < 20) {
			raiseAmount = this.salary * 0.10;
		} else if (current_year - this.hireYear > 19) {
			raiseAmount = this.salary * 0.15;
		}
		return raiseAmount;
	}

	public String writeAll() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma Saati: " + this.workHours);
		System.out.println("Başlangıç Yılı: " + this.hireYear);
		System.out.println("Kesilecek Vergi: " + tax());
		System.out.println("Bonus(fazla mesai): " + bonus());
		System.out.println("Maaş Zammı (deneyime göre): " + raiseSalary());
		System.out.println("Toplam Maaş: " + (this.salary + bonus() + raiseSalary()));
		System.out.println("Vergiler Kesildikten Sonraki Maaş: " + ((this.salary + bonus() + raiseSalary()) - tax()));
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

}