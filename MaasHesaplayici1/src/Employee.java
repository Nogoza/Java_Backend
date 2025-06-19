public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesabı
    public double tax() {
        if (this.salary < 1000) {
            return 0.0;
        }
        return this.salary * 0.03;
    }

    // Bonus hesabı
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0.0;
    }

    // Maaş artışı hesabı (2021 yılına göre)
    public double raiseSalary() {
        int yearsWorked = 2021 - this.hireYear;
        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Bilgileri bastırır
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = this.salary + raise;

        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus +
                "\nToplam Maaş : " + totalSalary;
    }
}
