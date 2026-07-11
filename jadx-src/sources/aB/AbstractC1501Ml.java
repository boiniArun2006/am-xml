package aB;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: aB.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC1501Ml {
    public abstract Pj0.j nr(int i2, int i3, Bitmap.Config config);

    public Pj0.j rl(int i2, int i3, Bitmap.Config config) {
        return t(i2, i3, config, null);
    }

    public Pj0.j n(int i2, int i3) {
        return rl(i2, i3, Bitmap.Config.ARGB_8888);
    }

    public Pj0.j t(int i2, int i3, Bitmap.Config config, Object obj) {
        return nr(i2, i3, config);
    }
}
