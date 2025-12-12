public class Main {
    public static void main(String[] args) {
        IExpenseView view = new ExpenseConsoleView();
        ExpensePresenter presenter = new ExpensePresenter(view);
        presenter.updateView();
        
        presenter.addExpense(500, "Продукты");
        presenter.addExpense(2000, "Коммунальные услуги");
        presenter.addExpense(350, "Транспорт");
    }
}