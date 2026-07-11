package y8;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y8.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n implements y8.j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f75558O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y8.j f75559n;
    private Rect nr;
    private int rl = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorFilter f75560t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Override // y8.j
    public void J2(ColorFilter colorFilter) {
        y8.j jVar = this.f75559n;
        if (jVar != null) {
            jVar.J2(colorFilter);
        }
        this.f75560t = colorFilter;
    }

    @Override // y8.j
    public boolean KN(Drawable parent, Canvas canvas, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        y8.j jVar = this.f75559n;
        return jVar != null && jVar.KN(parent, canvas, i2);
    }

    @Override // y8.j
    public int O() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return -1;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.O();
    }

    @Override // y8.Ml
    public int Uo() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return 0;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.Uo();
    }

    @Override // y8.Ml
    public int az() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return 0;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.az();
    }

    @Override // y8.j
    public void clear() {
        y8.j jVar = this.f75559n;
        if (jVar != null) {
            jVar.clear();
        }
    }

    @Override // y8.Ml
    public int gh(int i2) {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return 0;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.gh(i2);
    }

    @Override // y8.Ml
    public int mUb() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return 0;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.mUb();
    }

    @Override // y8.Ml
    public int n() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return 0;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.n();
    }

    @Override // y8.j
    public void nr(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        y8.j jVar = this.f75559n;
        if (jVar != null) {
            jVar.nr(bounds);
        }
        this.nr = bounds;
    }

    @Override // y8.j
    public void qie(int i2) {
        y8.j jVar = this.f75559n;
        if (jVar != null) {
            jVar.qie(i2);
        }
        this.rl = i2;
    }

    @Override // y8.Ml
    public int rl() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return 0;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.rl();
    }

    @Override // y8.j
    public int t() {
        y8.j jVar = this.f75559n;
        if (jVar == null) {
            return -1;
        }
        Intrinsics.checkNotNull(jVar);
        return jVar.t();
    }

    @Override // y8.j
    public void ty(j.InterfaceC1280j interfaceC1280j) {
        y8.j jVar = this.f75559n;
        if (jVar != null) {
            jVar.ty(interfaceC1280j);
        }
    }

    public n(y8.j jVar) {
        this.f75559n = jVar;
    }
}
