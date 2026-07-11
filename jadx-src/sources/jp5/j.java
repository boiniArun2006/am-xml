package jp5;

import SY6.w6;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j extends w6 {
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f69625t = -1;
    private long nr = -1;

    @Override // SY6.w6, SY6.Ml
    public void O(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f69625t = System.currentTimeMillis();
    }

    @Override // SY6.w6, SY6.Ml
    public void nr(String id, Object obj, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id, "id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.nr = jCurrentTimeMillis;
        n nVar = this.rl;
        if (nVar != null) {
            nVar.n(jCurrentTimeMillis - this.f69625t);
        }
    }

    public j(n nVar) {
        this.rl = nVar;
    }
}
