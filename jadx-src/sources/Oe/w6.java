package Oe;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {
    public static final j J2 = new j(null);
    private static final w6 Uo = new w6(0, 0);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f7490O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f7491n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f7492t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.f7491n == w6Var.f7491n && this.rl == w6Var.rl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f7491n) * 31) + Integer.hashCode(this.rl);
    }

    public final float n() {
        return this.f7492t;
    }

    public final int rl() {
        return this.rl;
    }

    public final int t() {
        return this.f7491n;
    }

    public String toString() {
        return "IntRectSize(width=" + this.f7491n + ", height=" + this.rl + ')';
    }

    public w6(int i2, int i3) {
        this.f7491n = i2;
        this.rl = i3;
        LRC.j.rl(i2, "width");
        LRC.j.rl(i3, "height");
        this.f7492t = i2 / i3;
        this.nr = Math.min(i2, i3);
        this.f7490O = Math.max(i2, i3);
    }
}
