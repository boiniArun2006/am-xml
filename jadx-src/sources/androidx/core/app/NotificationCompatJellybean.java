package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class NotificationCompatJellybean {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f36295n = new Object();
    private static final Object rl = new Object();

    static Bundle n(NotificationCompat.Action action) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatNr = action.nr();
        bundle.putInt("icon", iconCompatNr != null ? iconCompatNr.az() : 0);
        bundle.putCharSequence("title", action.KN());
        bundle.putParcelable("actionIntent", action.n());
        Bundle bundle2 = action.t() != null ? new Bundle(action.t()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", action.rl());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", t(action.O()));
        bundle.putBoolean("showsUserInterface", action.Uo());
        bundle.putInt("semanticAction", action.J2());
        return bundle;
    }

    private static Bundle rl(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteInput.xMQ());
        bundle.putCharSequence("label", remoteInput.KN());
        bundle.putCharSequenceArray("choices", remoteInput.O());
        bundle.putBoolean("allowFreeFormInput", remoteInput.t());
        bundle.putBundle("extras", remoteInput.Uo());
        Set setNr = remoteInput.nr();
        if (setNr != null && !setNr.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setNr.size());
            Iterator it = setNr.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] t(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i2 = 0; i2 < remoteInputArr.length; i2++) {
            bundleArr[i2] = rl(remoteInputArr[i2]);
        }
        return bundleArr;
    }
}
