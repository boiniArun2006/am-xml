package Lf;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 extends fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f6165n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Be4.CN3 f6166t;

    public CN3(Drawable drawable, boolean z2, Be4.CN3 cn3) {
        super(null);
        this.f6165n = drawable;
        this.rl = z2;
        this.f6166t = cn3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f6165n, cn3.f6165n) && this.rl == cn3.rl && this.f6166t == cn3.f6166t;
    }

    public int hashCode() {
        return (((this.f6165n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + this.f6166t.hashCode();
    }

    public final Be4.CN3 n() {
        return this.f6166t;
    }

    public final Drawable rl() {
        return this.f6165n;
    }

    public final boolean t() {
        return this.rl;
    }
}
