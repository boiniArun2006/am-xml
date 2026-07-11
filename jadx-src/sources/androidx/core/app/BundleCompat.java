package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Deprecated
public final class BundleCompat {
    public static IBinder n(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void rl(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
