package N1;

import MoG.QJ;
import MoG.o;
import MoG.qz;
import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre {
    private final QJ J2;
    private final qz KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final d2n.j f6946O;
    private final MoG.Wre Uo;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6947n;
    private final Integer nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f6948t;
    private final o xMQ;

    public /* synthetic */ Wre(Uri uri, String str, String str2, Integer num, d2n.j jVar, QJ qj, MoG.Wre wre, qz qzVar, o oVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, str2, num, jVar, qj, wre, qzVar, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Intrinsics.areEqual(this.f6947n, wre.f6947n) && Intrinsics.areEqual(this.rl, wre.rl) && Intrinsics.areEqual(this.f6948t, wre.f6948t) && Intrinsics.areEqual(this.nr, wre.nr) && Intrinsics.areEqual(this.f6946O, wre.f6946O) && Intrinsics.areEqual(this.J2, wre.J2) && Intrinsics.areEqual(this.Uo, wre.Uo) && Intrinsics.areEqual(this.KN, wre.KN) && Intrinsics.areEqual(this.xMQ, wre.xMQ);
    }

    private Wre(Uri uri, String str, String str2, Integer num, d2n.j jVar, QJ qj, MoG.Wre wre, qz qzVar, o oVar) {
        this.f6947n = uri;
        this.rl = str;
        this.f6948t = str2;
        this.nr = num;
        this.f6946O = jVar;
        this.J2 = qj;
        this.Uo = wre;
        this.KN = qzVar;
        this.xMQ = oVar;
        this.mUb = (qj == null && wre == null && qzVar == null && oVar == null) ? false : true;
    }

    public static /* synthetic */ Wre rl(Wre wre, Uri uri, String str, String str2, Integer num, d2n.j jVar, QJ qj, MoG.Wre wre2, qz qzVar, o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uri = wre.f6947n;
        }
        if ((i2 & 2) != 0) {
            str = wre.rl;
        }
        if ((i2 & 4) != 0) {
            str2 = wre.f6948t;
        }
        if ((i2 & 8) != 0) {
            num = wre.nr;
        }
        if ((i2 & 16) != 0) {
            jVar = wre.f6946O;
        }
        if ((i2 & 32) != 0) {
            qj = wre.J2;
        }
        if ((i2 & 64) != 0) {
            wre2 = wre.Uo;
        }
        if ((i2 & 128) != 0) {
            qzVar = wre.KN;
        }
        if ((i2 & 256) != 0) {
            oVar = wre.xMQ;
        }
        qz qzVar2 = qzVar;
        o oVar2 = oVar;
        QJ qj2 = qj;
        MoG.Wre wre3 = wre2;
        d2n.j jVar2 = jVar;
        String str3 = str2;
        return wre.n(uri, str, str3, num, jVar2, qj2, wre3, qzVar2, oVar2);
    }

    public final Integer J2() {
        return this.nr;
    }

    public final qz KN() {
        return this.KN;
    }

    public final d2n.j O() {
        return this.f6946O;
    }

    public final String Uo() {
        return this.f6948t;
    }

    public final QJ gh() {
        return this.J2;
    }

    public int hashCode() {
        int iHashCode = this.f6947n.hashCode() * 31;
        String str = this.rl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6948t;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.nr;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        d2n.j jVar = this.f6946O;
        int iCk = (iHashCode4 + (jVar == null ? 0 : d2n.j.ck(jVar.WPU()))) * 31;
        QJ qj = this.J2;
        int iHashCode5 = (iCk + (qj == null ? 0 : qj.hashCode())) * 31;
        MoG.Wre wre = this.Uo;
        int iHashCode6 = (iHashCode5 + (wre == null ? 0 : wre.hashCode())) * 31;
        qz qzVar = this.KN;
        int iHashCode7 = (iHashCode6 + (qzVar == null ? 0 : qzVar.hashCode())) * 31;
        o oVar = this.xMQ;
        return iHashCode7 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final Uri mUb() {
        return this.f6947n;
    }

    public final Wre n(Uri uri, String str, String str2, Integer num, d2n.j jVar, QJ qj, MoG.Wre wre, qz qzVar, o oVar) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new Wre(uri, str, str2, num, jVar, qj, wre, qzVar, oVar, null);
    }

    public final String nr() {
        return this.rl;
    }

    public final MoG.Wre t() {
        return this.Uo;
    }

    public String toString() {
        return "FMMediaResourceInfo(uri=" + this.f6947n + ", containerMime=" + this.rl + ", filename=" + this.f6948t + ", fileSize=" + this.nr + ", duration=" + this.f6946O + ", videoAsset=" + this.J2 + ", audioAsset=" + this.Uo + ", imageAsset=" + this.KN + ", gifAsset=" + this.xMQ + ')';
    }

    public final boolean xMQ() {
        return this.mUb;
    }

    public /* synthetic */ Wre(Uri uri, String str, String str2, Integer num, d2n.j jVar, QJ qj, MoG.Wre wre, qz qzVar, o oVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : jVar, (i2 & 32) != 0 ? null : qj, (i2 & 64) != 0 ? null : wre, (i2 & 128) != 0 ? null : qzVar, (i2 & 256) != 0 ? null : oVar, null);
    }
}
