import java.util.ArrayList;
import java.util.List;

public class PlaylistViewModel {
    private List<Track> tracks = new ArrayList<>();
    private int currentTrackIndex = -1;

    public PlaylistViewModel() {
        tracks.add(new Track("Bohemian Rhapsody", "Bag Raiders"));
        tracks.add(new Track("Пустой вокзал", "MORGEN"));
        tracks.add(new Track("С каждым", "PALC"));
        tracks.add(new Track("Abracadabra", "Lady Gaga"));
        tracks.add(new Track("Страшно", "PALC"));
        tracks.add(new Track("42", "5opka"));
    }

    public String getCurrentTrackInfo() {
        if (currentTrackIndex == -1 || tracks.isEmpty()) {
            return "Плейлист остановлен";
        }
        Track current = tracks.get(currentTrackIndex);
        String status = current.isPlaying ? " (Играет)" : " (Пауза)";
        return "Текущий трек: " + current.artist + " - " + current.title + status;
    }

    public void playNext() {
        if (tracks.isEmpty()) return;
        if(currentTrackIndex != -1) tracks.get(currentTrackIndex).isPlaying = false;
        
        currentTrackIndex = (currentTrackIndex + 1) % tracks.size();
        tracks.get(currentTrackIndex).isPlaying = true;
    }
}