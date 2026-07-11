package androidx.compose.runtime.internal;

import android.util.Log;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "message", "", "e", "", c.f62177j, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utils_androidKt {
    public static final void n(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
