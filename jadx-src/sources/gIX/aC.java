package gIX;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Bitmap f67404n;
    private final Bitmap nr;
    private final Bitmap rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Bitmap f67405t;

    public aC(Bitmap large, Bitmap medium, Bitmap small, Bitmap tiny) {
        Intrinsics.checkNotNullParameter(large, "large");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(tiny, "tiny");
        this.f67404n = large;
        this.rl = medium;
        this.f67405t = small;
        this.nr = tiny;
    }

    public final Bitmap n() {
        return this.rl;
    }
}
