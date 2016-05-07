package com.project.coen268.arttherapy;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by pallavi on 2/26/16.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent myintent = new Intent(context, Draw.class);

        PendingIntent pIntent = PendingIntent.getActivity(context, 0, myintent,
                PendingIntent.FLAG_UPDATE_CURRENT);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(
                context)

                .setSmallIcon(R.drawable.reminder)

                .setContentTitle("Reminder")

                .setContentText("Please draw!!!")

                .setContentIntent(pIntent)

                .setDefaults(Notification.DEFAULT_SOUND)

                .setAutoCancel(true);

        NotificationManager notificationmanager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);

        notificationmanager.notify(0, builder.build());
    }
}
