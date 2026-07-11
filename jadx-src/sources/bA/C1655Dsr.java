package bA;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: bA.Dsr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class C1655Dsr extends C1662n {
    protected C1655Dsr(Pj0.j jVar, eO eOVar, int i2, int i3) {
        super(jVar, eOVar, i2, i3);
    }

    protected C1655Dsr(Bitmap bitmap, Pj0.fuX fux, eO eOVar, int i2, int i3) {
        super(bitmap, fux, eOVar, i2, i3);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Dzy.j.ViF("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
