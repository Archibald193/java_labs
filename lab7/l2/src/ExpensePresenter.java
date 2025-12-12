import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExpensePresenter {
    private List<Expense> modelList;
    private IExpenseView view;

    public ExpensePresenter(IExpenseView view) {
        this.view = view;
        this.modelList = new ArrayList<>();
    }

    public void addExpense(double amount, String category) {
        Expense newExpense = new Expense(amount, category, LocalDate.now());
        modelList.add(newExpense);
        System.out.println("\nДобавлен новый расход.");
        updateView();
    }

    public void updateView() {
        List<String> expenseStrings = modelList.stream().map(Expense::toString).collect(Collectors.toList());
        double total = modelList.stream().mapToDouble(exp -> exp.amount).sum();
        view.displayExpenses(expenseStrings);
        view.displayTotal(total);
    }
}