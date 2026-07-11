package androidx.compose.foundation.text.handwriting;

import android.os.Build;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", c.f62177j, "Z", "()Z", "isStylusHandwritingSupported", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StylusHandwriting_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final boolean f19971n;

    static {
        f19971n = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean n() {
        return f19971n;
    }
}
