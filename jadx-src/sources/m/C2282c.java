package m;

import android.graphics.drawable.Drawable;
import com.alightcreative.app.motion.persist.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2282c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j.EnumC0648j f70585n;
    private final int nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Drawable f70586t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2282c)) {
            return false;
        }
        C2282c c2282c = (C2282c) obj;
        return this.f70585n == c2282c.f70585n && Intrinsics.areEqual(this.rl, c2282c.rl) && Intrinsics.areEqual(this.f70586t, c2282c.f70586t) && this.nr == c2282c.nr;
    }

    public C2282c(j.EnumC0648j browserMode, String categoryLabel, Drawable categoryIcon, int i2) {
        Intrinsics.checkNotNullParameter(browserMode, "browserMode");
        Intrinsics.checkNotNullParameter(categoryLabel, "categoryLabel");
        Intrinsics.checkNotNullParameter(categoryIcon, "categoryIcon");
        this.f70585n = browserMode;
        this.rl = categoryLabel;
        this.f70586t = categoryIcon;
        this.nr = i2;
    }

    public int hashCode() {
        return (((((this.f70585n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f70586t.hashCode()) * 31) + Integer.hashCode(this.nr);
    }

    public final j.EnumC0648j n() {
        return this.f70585n;
    }

    public final int nr() {
        return this.nr;
    }

    public final Drawable rl() {
        return this.f70586t;
    }

    public final String t() {
        return this.rl;
    }

    public String toString() {
        return "AudioCategory(browserMode=" + this.f70585n + ", categoryLabel=" + this.rl + ", categoryIcon=" + this.f70586t + ", songCount=" + this.nr + ")";
    }
}
