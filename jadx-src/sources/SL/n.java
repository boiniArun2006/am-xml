package SL;

import dI8.Ml;
import dI8.w6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final dI8.w6 n(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new w6.C0838w6("MAX: " + jVar.t().nr(), jVar.getMessage() + "\nNetwork error: " + jVar.rl() + " (code: " + jVar.n() + ")");
    }

    public static final dI8.Ml rl(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return new Ml.w6("MAX: " + jVar.t().nr(), jVar.getMessage() + "\nNetwork error: " + jVar.rl() + " (code: " + jVar.n() + ")");
    }
}
