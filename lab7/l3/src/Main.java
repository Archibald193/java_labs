public class Main {
    public static void main(String[] args) throws InterruptedException {
        PlaylistViewModel viewModel = new PlaylistViewModel();
        PlaylistView view = new PlaylistView(viewModel);
        view.render();
        System.out.println("\n>|'Next'");
        viewModel.playNext();
        view.render();
        Thread.sleep(1500);
        System.out.println("\n>|'Next'");
        viewModel.playNext();
        view.render();
    }
}