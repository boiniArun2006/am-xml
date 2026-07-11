package Lf;

import Lf.Dsr;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kYF.l3D;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f6168n;
    private final FjR.C rl;

    public static final class j implements Dsr.j {
        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(Drawable drawable, FjR.C c2, eQ.fuX fux) {
            return new Wre(drawable, c2);
        }
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) {
        Drawable bitmapDrawable;
        boolean Z2 = kYF.C.Z(this.f6168n);
        if (Z2) {
            bitmapDrawable = new BitmapDrawable(this.rl.Uo().getResources(), l3D.f69954n.n(this.f6168n, this.rl.J2(), this.rl.HI(), this.rl.ty(), this.rl.t()));
        } else {
            bitmapDrawable = this.f6168n;
        }
        return new CN3(bitmapDrawable, Z2, Be4.CN3.f520t);
    }

    public Wre(Drawable drawable, FjR.C c2) {
        this.f6168n = drawable;
        this.rl = c2;
    }
}
