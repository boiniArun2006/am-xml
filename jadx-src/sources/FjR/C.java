package FjR;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C {
    private final n HI;
    private final boolean J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Z.CN3 f3005O;
    private final boolean Uo;
    private final n az;
    private final eO gh;
    private final Headers mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3006n;
    private final Z.fuX nr;
    private final o qie;
    private final Bitmap.Config rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ColorSpace f3007t;
    private final n ty;
    private final String xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        if (Intrinsics.areEqual(this.f3006n, c2.f3006n) && this.rl == c2.rl) {
            return (Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f3007t, c2.f3007t)) && Intrinsics.areEqual(this.nr, c2.nr) && this.f3005O == c2.f3005O && this.J2 == c2.J2 && this.Uo == c2.Uo && this.KN == c2.KN && Intrinsics.areEqual(this.xMQ, c2.xMQ) && Intrinsics.areEqual(this.mUb, c2.mUb) && Intrinsics.areEqual(this.gh, c2.gh) && Intrinsics.areEqual(this.qie, c2.qie) && this.az == c2.az && this.ty == c2.ty && this.HI == c2.HI;
        }
        return false;
    }

    public final Z.fuX HI() {
        return this.nr;
    }

    public final Bitmap.Config J2() {
        return this.rl;
    }

    public final String KN() {
        return this.xMQ;
    }

    public final ColorSpace O() {
        return this.f3007t;
    }

    public final Context Uo() {
        return this.f3006n;
    }

    public final boolean az() {
        return this.KN;
    }

    public final eO ck() {
        return this.gh;
    }

    public final n gh() {
        return this.HI;
    }

    public int hashCode() {
        int iHashCode = ((this.f3006n.hashCode() * 31) + this.rl.hashCode()) * 31;
        ColorSpace colorSpace = this.f3007t;
        int iHashCode2 = (((((((((((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.nr.hashCode()) * 31) + this.f3005O.hashCode()) * 31) + Boolean.hashCode(this.J2)) * 31) + Boolean.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN)) * 31;
        String str = this.xMQ;
        return ((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.mUb.hashCode()) * 31) + this.gh.hashCode()) * 31) + this.qie.hashCode()) * 31) + this.az.hashCode()) * 31) + this.ty.hashCode()) * 31) + this.HI.hashCode();
    }

    public final Headers mUb() {
        return this.mUb;
    }

    public final C n(Context context, Bitmap.Config config, ColorSpace colorSpace, Z.fuX fux, Z.CN3 cn3, boolean z2, boolean z3, boolean z4, String str, Headers headers, eO eOVar, o oVar, n nVar, n nVar2, n nVar3) {
        return new C(context, config, colorSpace, fux, cn3, z2, z3, z4, str, headers, eOVar, oVar, nVar, nVar2, nVar3);
    }

    public final boolean nr() {
        return this.Uo;
    }

    public final o qie() {
        return this.qie;
    }

    public final boolean t() {
        return this.J2;
    }

    public final Z.CN3 ty() {
        return this.f3005O;
    }

    public final n xMQ() {
        return this.ty;
    }

    public C(Context context, Bitmap.Config config, ColorSpace colorSpace, Z.fuX fux, Z.CN3 cn3, boolean z2, boolean z3, boolean z4, String str, Headers headers, eO eOVar, o oVar, n nVar, n nVar2, n nVar3) {
        this.f3006n = context;
        this.rl = config;
        this.f3007t = colorSpace;
        this.nr = fux;
        this.f3005O = cn3;
        this.J2 = z2;
        this.Uo = z3;
        this.KN = z4;
        this.xMQ = str;
        this.mUb = headers;
        this.gh = eOVar;
        this.qie = oVar;
        this.az = nVar;
        this.ty = nVar2;
        this.HI = nVar3;
    }
}
