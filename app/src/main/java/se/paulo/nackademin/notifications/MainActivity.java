package se.paulo.nackademin.notifications;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btn = (Button)findViewById(R.id.btnNotification);

    }


    public void showNotifications(View view) {
        //Vi behöver bygga ihop en Notification först
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        //Bestäm hur det ska se ut
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("Titel på notification");
        builder.setContentText("Text på notification");

        int notificationId = 1;
        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        manager.notify(notificationId, builder.build());


    }
}
