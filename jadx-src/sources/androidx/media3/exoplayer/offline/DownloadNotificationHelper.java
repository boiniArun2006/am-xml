package androidx.media3.exoplayer.offline;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.R;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    private Notification buildEndStateNotification(Context context, @DrawableRes int i2, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i3) {
        return buildNotification(context, i2, pendingIntent, str, i3, 0, 0, false, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Notification buildProgressNotification(Context context, @DrawableRes int i2, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list, int i3) {
        int i5;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        float f3 = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z9 = false;
        int i10 = 0;
        boolean z10 = true;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Download download = list.get(i11);
            int i12 = download.state;
            if (i12 == 0) {
                z6 = true;
            } else if (i12 == 2) {
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f3 += percentDownloaded;
                    z10 = false;
                }
                z7 |= download.getBytesDownloaded() > 0;
                i10++;
                z5 = true;
            } else if (i12 == 5) {
                z9 = true;
            } else if (i12 != 7) {
            }
        }
        if (z5) {
            i7 = R.string.exo_download_downloading;
        } else {
            if (z6 && i3 != 0) {
                i5 = (i3 & 2) != 0 ? R.string.exo_download_paused_for_wifi : (i3 & 1) != 0 ? R.string.exo_download_paused_for_network : R.string.exo_download_paused;
                z2 = false;
                if (z2) {
                }
                return buildNotification(context, i2, pendingIntent, str, i5, i8, i9, z3, true, false);
            }
            if (!z9) {
                i5 = 0;
                z2 = true;
                if (z2) {
                    if (z5) {
                        int i13 = (int) (f3 / i10);
                        if (z10 && z7) {
                            z4 = true;
                        }
                        i9 = i13;
                        z3 = z4;
                    } else {
                        i9 = 0;
                        z3 = true;
                    }
                    i8 = 100;
                } else {
                    i8 = 0;
                    i9 = 0;
                    z3 = false;
                }
                return buildNotification(context, i2, pendingIntent, str, i5, i8, i9, z3, true, false);
            }
            i7 = R.string.exo_download_removing;
        }
        i5 = i7;
        z2 = true;
        if (z2) {
        }
        return buildNotification(context, i2, pendingIntent, str, i5, i8, i9, z3, true, false);
    }

    @RequiresApi
    private static final class Api31 {
        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.Z(1);
        }

        private Api31() {
        }
    }

    private Notification buildNotification(Context context, @DrawableRes int i2, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i3, int i5, int i7, boolean z2, boolean z3, boolean z4) {
        this.notificationBuilder.iF(i2);
        this.notificationBuilder.ck(i3 == 0 ? null : context.getResources().getString(i3));
        this.notificationBuilder.ty(pendingIntent);
        this.notificationBuilder.fD(str != null ? new NotificationCompat.BigTextStyle().KN(str) : null);
        this.notificationBuilder.g(i5, i7, z2);
        this.notificationBuilder.aYN(z3);
        this.notificationBuilder.te(z4);
        if (Util.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.t();
    }

    public Notification buildDownloadCompletedNotification(Context context, @DrawableRes int i2, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i2, pendingIntent, str, R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, @DrawableRes int i2, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(context, i2, pendingIntent, str, R.string.exo_download_failed);
    }

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }
}
