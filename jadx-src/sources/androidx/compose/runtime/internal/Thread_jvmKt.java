package androidx.compose.runtime.internal;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", c.f62177j, "()J", "", "rl", "()Ljava/lang/String;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Thread_jvmKt {
    public static final long n() {
        return Thread.currentThread().getId();
    }

    public static final String rl() {
        return Thread.currentThread().getName();
    }
}
