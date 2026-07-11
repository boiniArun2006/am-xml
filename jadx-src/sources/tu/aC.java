package tu;

import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC extends SPz {
    private final long HI;
    private final String Ik;
    private final Ml J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final u f73908O;
    private final int Uo;
    private final String az;
    private final boolean ck;
    private final int gh;
    private final String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f73909n;
    private final Dsr nr;
    private final long qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f73910t;
    private final Throwable ty;
    private final int xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return Intrinsics.areEqual(this.f73909n, aCVar.f73909n) && Intrinsics.areEqual(this.rl, aCVar.rl) && this.f73910t == aCVar.f73910t && Intrinsics.areEqual(this.nr, aCVar.nr) && Intrinsics.areEqual(this.f73908O, aCVar.f73908O) && Intrinsics.areEqual(this.J2, aCVar.J2) && this.Uo == aCVar.Uo && this.KN == aCVar.KN && this.xMQ == aCVar.xMQ && Intrinsics.areEqual(this.mUb, aCVar.mUb) && this.gh == aCVar.gh && this.qie == aCVar.qie && Intrinsics.areEqual(this.az, aCVar.az) && Intrinsics.areEqual(this.ty, aCVar.ty) && this.HI == aCVar.HI && this.ck == aCVar.ck && Intrinsics.areEqual(this.Ik, aCVar.Ik);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aC(Uri uri, String mimeType, long j2, Dsr dsr, u uVar, Ml ml, int i2, int i3, int i5, String str, int i7, long j3, String str2, Throwable th, long j4, boolean z2, String str3) {
        super(null);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f73909n = uri;
        this.rl = mimeType;
        this.f73910t = j2;
        this.nr = dsr;
        this.f73908O = uVar;
        this.J2 = ml;
        this.Uo = i2;
        this.KN = i3;
        this.xMQ = i5;
        this.mUb = str;
        this.gh = i7;
        this.qie = j3;
        this.az = str2;
        this.ty = th;
        this.HI = j4;
        this.ck = z2;
        this.Ik = str3;
    }

    public final int J2() {
        return this.KN;
    }

    public final String KN() {
        return this.rl;
    }

    public final String O() {
        return this.Ik;
    }

    public final Dsr Uo() {
        return this.nr;
    }

    public final u gh() {
        return this.f73908O;
    }

    public int hashCode() {
        int iHashCode = ((((this.f73909n.hashCode() * 31) + this.rl.hashCode()) * 31) + Long.hashCode(this.f73910t)) * 31;
        Dsr dsr = this.nr;
        int iHashCode2 = (iHashCode + (dsr == null ? 0 : dsr.hashCode())) * 31;
        u uVar = this.f73908O;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        Ml ml = this.J2;
        int iHashCode4 = (((((((iHashCode3 + (ml == null ? 0 : ml.hashCode())) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ)) * 31;
        String str = this.mUb;
        int iHashCode5 = (((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.gh)) * 31) + Long.hashCode(this.qie)) * 31;
        String str2 = this.az;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Throwable th = this.ty;
        int iHashCode7 = (((((iHashCode6 + (th == null ? 0 : th.hashCode())) * 31) + Long.hashCode(this.HI)) * 31) + Boolean.hashCode(this.ck)) * 31;
        String str3 = this.Ik;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String mUb() {
        return this.az;
    }

    public final Ml n() {
        return this.J2;
    }

    public final long nr() {
        return this.qie;
    }

    public final int qie() {
        return this.Uo;
    }

    public final int rl() {
        return this.gh;
    }

    public final long t() {
        return this.f73910t;
    }

    public String toString() {
        Uri uri = this.f73909n;
        String str = this.rl;
        boolean zTy = r.ty(this);
        boolean zCk = r.ck(this);
        boolean zHI = r.HI(this);
        boolean zIk = r.Ik(this);
        boolean zAz = r.az(this);
        long j2 = this.f73910t;
        String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String strPrependIndent = StringsKt.prependIndent(String.valueOf(this.nr), "                    ");
        String strPrependIndent2 = StringsKt.prependIndent(String.valueOf(this.f73908O), "                    ");
        String strPrependIndent3 = StringsKt.prependIndent(String.valueOf(this.J2), "                    ");
        int i2 = this.Uo;
        int i3 = this.KN;
        int i5 = this.xMQ;
        String str3 = this.mUb;
        int i7 = this.gh;
        long j3 = this.qie;
        String str4 = this.az;
        long j4 = this.HI;
        String str5 = String.format("%.4f", Arrays.copyOf(new Object[]{Double.valueOf(j4 / 1.0E9d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        return StringsKt.trimIndent("\n            [MediaInfo for '" + uri + "'\n                mimeType: " + str + "\n                hasAudio: " + zTy + "\n                hasVideo: " + zCk + "\n                hasImage: " + zHI + "\n                supported: " + zIk + "\n                fullySupported: " + zAz + "\n                duration: " + j2 + "us (" + str2 + "s)\n                imageInfo: \n" + strPrependIndent + "\n                videoInfo: \n" + strPrependIndent2 + "\n                audioInfo: \n" + strPrependIndent3 + "\n                width: " + i2 + "\n                height: " + i3 + "\n                orientation: " + i5 + "\n                copyright: " + str3 + "\n                bitrate: " + i7 + "\n                fileSize: " + j3 + "\n                title: " + str4 + "\n                parseTimeNanos: " + j4 + " (" + str5 + "s)\n            ]\n        ");
    }

    public final int xMQ() {
        return this.xMQ;
    }
}
