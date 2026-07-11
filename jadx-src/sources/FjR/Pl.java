package FjR;

import GJW.xuv;
import Z.w6;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.view.Lifecycle;
import coil.request.NullRequestDataException;
import kYF.SPz;
import kYF.g9s;
import kYF.s4;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eQ.fuX f3014n;
    private final g9s rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final s4 f3015t;

    public final I28 n(fuX fux, Throwable th) {
        Drawable drawableZ;
        if (!(th instanceof NullRequestDataException) || (drawableZ = fux.XQ()) == null) {
            drawableZ = fux.Z();
        }
        return new I28(drawableZ, fux, th);
    }

    public Pl(eQ.fuX fux, g9s g9sVar, SPz sPz) {
        this.f3014n = fux;
        this.rl = g9sVar;
        this.f3015t = kYF.CN3.n(sPz);
    }

    private final boolean O(fuX fux) {
        if (!fux.bzg().isEmpty() && !ArraysKt.contains(kYF.C.ty(), fux.mUb())) {
            return false;
        }
        return true;
    }

    private final boolean nr(fuX fux, Z.fuX fux2) {
        if (!kYF.j.nr(fux.mUb())) {
            return true;
        }
        if (t(fux, fux.mUb()) && this.f3015t.n(fux2)) {
            return true;
        }
        return false;
    }

    private final boolean rl(C c2) {
        if (kYF.j.nr(c2.J2()) && !this.f3015t.rl()) {
            return false;
        }
        return true;
    }

    public final C J2(fuX fux, Z.fuX fux2) {
        Bitmap.Config configMUb;
        Z.CN3 cn3NHg;
        boolean z2;
        if (O(fux) && nr(fux, fux2)) {
            configMUb = fux.mUb();
        } else {
            configMUb = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config = configMUb;
        Z.w6 w6VarNr = fux2.nr();
        w6.n nVar = w6.n.f12274n;
        if (!Intrinsics.areEqual(w6VarNr, nVar) && !Intrinsics.areEqual(fux2.t(), nVar)) {
            cn3NHg = fux.nHg();
        } else {
            cn3NHg = Z.CN3.f12264t;
        }
        Z.CN3 cn3 = cn3NHg;
        if (fux.xMQ() && fux.bzg().isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C(fux.qie(), config, fux.gh(), fux2, cn3, kYF.aC.n(fux), z2, fux.N(), fux.r(), fux.aYN(), fux.wTp(), fux.E2(), fux.iF(), fux.o(), fux.fD());
    }

    public final C KN(C c2) {
        boolean z2;
        Bitmap.Config configJ2 = c2.J2();
        n nVarGh = c2.gh();
        boolean z3 = true;
        if (!rl(c2)) {
            configJ2 = Bitmap.Config.ARGB_8888;
            z2 = true;
        } else {
            z2 = false;
        }
        Bitmap.Config config = configJ2;
        if (c2.gh().rl() && !this.rl.rl()) {
            nVarGh = n.f3053o;
        } else {
            z3 = z2;
        }
        n nVar = nVarGh;
        if (z3) {
            return c2.n((16381 & 1) != 0 ? c2.f3006n : null, (16381 & 2) != 0 ? c2.rl : config, (16381 & 4) != 0 ? c2.f3007t : null, (16381 & 8) != 0 ? c2.nr : null, (16381 & 16) != 0 ? c2.f3005O : null, (16381 & 32) != 0 ? c2.J2 : false, (16381 & 64) != 0 ? c2.Uo : false, (16381 & 128) != 0 ? c2.KN : false, (16381 & 256) != 0 ? c2.xMQ : null, (16381 & 512) != 0 ? c2.mUb : null, (16381 & 1024) != 0 ? c2.gh : null, (16381 & 2048) != 0 ? c2.qie : null, (16381 & 4096) != 0 ? c2.az : null, (16381 & 8192) != 0 ? c2.ty : null, (16381 & 16384) != 0 ? c2.HI : nVar);
        }
        return c2;
    }

    public final qz Uo(fuX fux, xuv xuvVar) {
        Lifecycle lifecycleNY = fux.nY();
        fux.v();
        return new j(lifecycleNY, xuvVar);
    }

    public final boolean t(fuX fux, Bitmap.Config config) {
        if (!kYF.j.nr(config)) {
            return true;
        }
        if (!fux.KN()) {
            return false;
        }
        fux.v();
        return true;
    }
}
