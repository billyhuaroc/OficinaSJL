package ucv.android.oficinasjl.ui.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.URL;

import ucv.android.oficinasjl.R;

public class VideoReunion extends AppCompatActivity {

    Button btn_reunirse;
    String sala = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_reunion);


        btn_reunirse = findViewById(R.id.btn_reunirse);
        btn_reunirse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    URL url = new URL("https://meet.jit.si");

                    JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()
                            .setServerURL(url)
                            .setRoom("test123")
                            .setAudioMuted(false)
                            .setVideoMuted(false)
                            .setAudioOnly(false)
                            .setWelcomePageEnabled(false)
                            .build();
                }
                catch (Exception exception){
                    Toast.makeText(VideoReunion.this, exception.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}