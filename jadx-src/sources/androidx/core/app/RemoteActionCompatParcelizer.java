package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class RemoteActionCompatParcelizer {
    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.aYN(false, false);
        versionedParcel.v(remoteActionCompat.f36323n, 1);
        versionedParcel.fD(remoteActionCompat.rl, 2);
        versionedParcel.fD(remoteActionCompat.f36324t, 3);
        versionedParcel.T(remoteActionCompat.nr, 4);
        versionedParcel.nY(remoteActionCompat.f36322O, 5);
        versionedParcel.nY(remoteActionCompat.J2, 6);
    }

    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f36323n = (IconCompat) versionedParcel.S(remoteActionCompat.f36323n, 1);
        remoteActionCompat.rl = versionedParcel.qie(remoteActionCompat.rl, 2);
        remoteActionCompat.f36324t = versionedParcel.qie(remoteActionCompat.f36324t, 3);
        remoteActionCompat.nr = (PendingIntent) versionedParcel.r(remoteActionCompat.nr, 4);
        remoteActionCompat.f36322O = versionedParcel.KN(remoteActionCompat.f36322O, 5);
        remoteActionCompat.J2 = versionedParcel.KN(remoteActionCompat.J2, 6);
        return remoteActionCompat;
    }
}
