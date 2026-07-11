package androidx.compose.runtime.internal;

import android.os.Looper;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", c.f62177j, "J", "()J", "MainThreadId", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Thread_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f30883n;

    public static final long n() {
        return f30883n;
    }

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f30883n = id;
    }
}
