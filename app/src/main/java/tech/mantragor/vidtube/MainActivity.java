package tech.mantragor.vidtube;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private TextView videoTitle;

    String[] urlLists = {
            "https://videosourcefilesforapp.on.drv.tw/com.vidtube.mantra/Heeriye.mp4",
            "https://videosourcefilesforapp.on.drv.tw/com.vidtube.mantra/What%20Jhumka.mp4",
            "https://videosourcefilesforapp.on.drv.tw/com.vidtube.mantra/Tere%20Pyaar%20Mein.mp4",
    };
    String[] videoTitles = {
            "Heeriye | Jasleen Royal ft Arijit Singh",
            "What Jhumka? | Rocky Aur Rani Kii Prem Kahaani",
            "Tere Pyaar Mein | Tu Jhoothi Main Makkaar"
    };

    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        videoTitle = findViewById(R.id.videoTitle);

        videoView.getKeepScreenOn();

        videoTitle.setText(videoTitles[index]);

        Uri videoUri = Uri.parse(urlLists[index]);
        videoView.setVideoURI(videoUri);
        videoView.start();

        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}