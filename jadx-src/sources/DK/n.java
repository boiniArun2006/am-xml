package DK;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bundle f1415n = new Bundle();

    public final Bundle n() {
        return this.f1415n;
    }

    public final void rl(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f1415n.putString(key, value);
    }
}
