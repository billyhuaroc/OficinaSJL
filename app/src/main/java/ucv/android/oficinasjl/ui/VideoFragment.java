package ucv.android.oficinasjl.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.URL;

import ucv.android.oficinasjl.R;
import ucv.android.oficinasjl.ui.actividades.VideoReunion;

public class VideoFragment extends Fragment {

    Button btn_reunirse;
    String sala = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn_reunirse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*try {
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
                    Toast.makeText(getContext(), exception.getMessage(), Toast.LENGTH_SHORT).show();
                }*/
                Toast.makeText(getContext(), "vIDEO FRAGMENT", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        btn_reunirse = (Button)getView().findViewById(R.id.btn_reunirse);
        return inflater.inflate(R.layout.fragment_video, container, false);
    }
}