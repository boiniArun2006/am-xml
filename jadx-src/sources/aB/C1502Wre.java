package aB;

import Pj0.fuX;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: aB.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C1502Wre implements fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C1502Wre f12737n;

    public static C1502Wre rl() {
        if (f12737n == null) {
            f12737n = new C1502Wre();
        }
        return f12737n;
    }

    private C1502Wre() {
    }

    @Override // Pj0.fuX
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(Bitmap bitmap) {
        bitmap.recycle();
    }
}
