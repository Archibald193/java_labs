import java.util.List;

public interface IExpenseView {
    void displayExpenses(List<String> expenseStrings);
    void displayTotal(double total);
}