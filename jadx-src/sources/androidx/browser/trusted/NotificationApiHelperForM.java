package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@RestrictTo
public class NotificationApiHelperForM {
    static Parcelable[] n(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
