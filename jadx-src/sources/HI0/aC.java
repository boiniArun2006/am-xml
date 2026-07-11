package HI0;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class aC {
    public static final boolean n() {
        return Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread());
    }
}
