package juniarto.ta.notiftrash;

import android.app.Application;

import com.onesignal.OneSignal;

/**
 * Created by taufik on 10/07/18.
 */

public class ApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // penerima notifikasi OneSignal
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
