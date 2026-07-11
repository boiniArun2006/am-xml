package PJ;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements CO9.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f7665n;

    public w6(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f7665n = applicationContext;
    }

    @Override // CO9.w6
    public CO9.j invoke() {
        YgZ.w6 w6Var = YgZ.w6.f12217n;
        return new CO9.j(w6Var.t(this.f7665n), w6Var.rl(this.f7665n));
    }
}
