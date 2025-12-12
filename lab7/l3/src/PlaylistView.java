public class PlaylistView {
    private PlaylistViewModel viewModel;

    public PlaylistView(PlaylistViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void render() {
        System.out.println("==========================");
        System.out.println("      МУЗЫКАЛЬНЫЙ ПЛЕЕР   ");
        System.out.println(viewModel.getCurrentTrackInfo());
        System.out.println("==========================");
    }
}