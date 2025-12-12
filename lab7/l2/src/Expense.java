import java.time.LocalDate;

public class Expense {
    public double amount;
    private String category;
    private LocalDate date;

    public Expense(double amount, String category, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Расход [Сумма: " + amount + ", Категория: '" + category + "', Дата: " + date + "]";
    }
}