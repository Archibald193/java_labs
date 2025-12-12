import java.util.List;

public class ExpenseConsoleView implements IExpenseView {
    @Override
    public void displayExpenses(List<String> expenseStrings) {
        System.out.println("Список расходов");
        for (String exp : expenseStrings) {
            System.out.println(exp);
        }
    }

    @Override
    public void displayTotal(double total) {
        System.out.printf("Общий расход: %.2f\n", total);
    }
}