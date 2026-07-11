package NP;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f6998n = new n();

    public static final boolean n(j jVar, Pj0.j jVar2) {
        if (jVar == null || jVar2 == null) {
            return false;
        }
        Object objEF = jVar2.eF();
        Intrinsics.checkNotNullExpressionValue(objEF, "get(...)");
        Bitmap bitmap = (Bitmap) objEF;
        if (jVar.n()) {
            bitmap.setHasAlpha(true);
        }
        jVar.rl(bitmap);
        return true;
    }

    private n() {
    }
}
