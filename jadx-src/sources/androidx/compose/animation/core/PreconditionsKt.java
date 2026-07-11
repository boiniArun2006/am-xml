package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "message", "", c.f62177j, "(Ljava/lang/String;)V", "rl", "", "t", "(Ljava/lang/String;)Ljava/lang/Void;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PreconditionsKt {
    public static final void n(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void rl(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void t(String str) {
        throw new IllegalStateException(str);
    }
}
