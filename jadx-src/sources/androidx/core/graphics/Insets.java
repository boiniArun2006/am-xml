package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Insets {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Insets f36409O = new Insets(0, 0, 0, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f36410n;
    public final int nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f36411t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.nr == insets.nr && this.f36410n == insets.f36410n && this.f36411t == insets.f36411t && this.rl == insets.rl;
    }

    @RequiresApi
    static class Api29Impl {
        static android.graphics.Insets n(int i2, int i3, int i5, int i7) {
            return android.graphics.Insets.of(i2, i3, i5, i7);
        }
    }

    public static Insets n(Insets insets, Insets insets2) {
        return t(Math.max(insets.f36410n, insets2.f36410n), Math.max(insets.rl, insets2.rl), Math.max(insets.f36411t, insets2.f36411t), Math.max(insets.nr, insets2.nr));
    }

    public static Insets nr(Rect rect) {
        return t(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static Insets rl(Insets insets, Insets insets2) {
        return t(Math.min(insets.f36410n, insets2.f36410n), Math.min(insets.rl, insets2.rl), Math.min(insets.f36411t, insets2.f36411t), Math.min(insets.nr, insets2.nr));
    }

    public static Insets t(int i2, int i3, int i5, int i7) {
        return (i2 == 0 && i3 == 0 && i5 == 0 && i7 == 0) ? f36409O : new Insets(i2, i3, i5, i7);
    }

    public android.graphics.Insets J2() {
        return Api29Impl.n(this.f36410n, this.rl, this.f36411t, this.nr);
    }

    public int hashCode() {
        return (((((this.f36410n * 31) + this.rl) * 31) + this.f36411t) * 31) + this.nr;
    }

    public String toString() {
        return "Insets{left=" + this.f36410n + ", top=" + this.rl + ", right=" + this.f36411t + ", bottom=" + this.nr + '}';
    }

    private Insets(int i2, int i3, int i5, int i7) {
        this.f36410n = i2;
        this.rl = i3;
        this.f36411t = i5;
        this.nr = i7;
    }

    public static Insets O(android.graphics.Insets insets) {
        return t(insets.left, insets.top, insets.right, insets.bottom);
    }
}
