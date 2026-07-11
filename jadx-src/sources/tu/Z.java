package tu;

import android.net.Uri;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Z {
    private int HI;
    private int Ik;
    private String J2;
    private String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f73900O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f73901S;
    private String Uo;
    private int ViF;
    private long WPU;
    private long XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f73902Z;
    private int aYN;
    private String az;
    private int ck;
    private long fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73903g;
    private String gh;
    private String iF;
    private String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Uri f73904n;
    private int nY;
    private String nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f73905o;
    private String qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f73906r;
    private Ew rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f73907t;
    private int te;
    private String ty;
    private long xMQ;

    public Z(Uri uri, Ew type, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i5, long j4, long j5, int i7, long j6, long j7, long j9, int i8, int i9, int i10, int i11, int i12, String str11, long j10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f73904n = uri;
        this.rl = type;
        this.f73907t = j2;
        this.nr = str;
        this.f73900O = str2;
        this.J2 = str3;
        this.Uo = str4;
        this.KN = str5;
        this.xMQ = j3;
        this.mUb = str6;
        this.gh = str7;
        this.qie = str8;
        this.az = str9;
        this.ty = str10;
        this.HI = i2;
        this.ck = i3;
        this.Ik = i5;
        this.f73906r = j4;
        this.f73905o = j5;
        this.f73902Z = i7;
        this.XQ = j6;
        this.f73901S = j7;
        this.WPU = j9;
        this.aYN = i8;
        this.ViF = i9;
        this.nY = i10;
        this.f73903g = i11;
        this.te = i12;
        this.iF = str11;
        this.fD = j10;
    }

    public static /* synthetic */ Z rl(Z z2, Uri uri, Ew ew, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i5, long j4, long j5, int i7, long j6, long j7, long j9, int i8, int i9, int i10, int i11, int i12, String str11, long j10, int i13, Object obj) {
        long j11;
        String str12;
        int i14;
        long j12;
        int i15;
        long j13;
        long j14;
        long j15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str13;
        String str14;
        long j16;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        int i20;
        int i21;
        int i22;
        long j17;
        Ew ew2;
        long j18;
        String str20;
        String str21;
        String str22;
        Uri uri2 = (i13 & 1) != 0 ? z2.f73904n : uri;
        Ew ew3 = (i13 & 2) != 0 ? z2.rl : ew;
        long j19 = (i13 & 4) != 0 ? z2.f73907t : j2;
        String str23 = (i13 & 8) != 0 ? z2.nr : str;
        String str24 = (i13 & 16) != 0 ? z2.f73900O : str2;
        String str25 = (i13 & 32) != 0 ? z2.J2 : str3;
        String str26 = (i13 & 64) != 0 ? z2.Uo : str4;
        String str27 = (i13 & 128) != 0 ? z2.KN : str5;
        long j20 = (i13 & 256) != 0 ? z2.xMQ : j3;
        String str28 = (i13 & 512) != 0 ? z2.mUb : str6;
        String str29 = (i13 & 1024) != 0 ? z2.gh : str7;
        String str30 = (i13 & 2048) != 0 ? z2.qie : str8;
        Uri uri3 = uri2;
        String str31 = (i13 & 4096) != 0 ? z2.az : str9;
        String str32 = (i13 & 8192) != 0 ? z2.ty : str10;
        int i23 = (i13 & 16384) != 0 ? z2.HI : i2;
        int i24 = (i13 & 32768) != 0 ? z2.ck : i3;
        int i25 = (i13 & 65536) != 0 ? z2.Ik : i5;
        int i26 = i23;
        long j21 = (i13 & 131072) != 0 ? z2.f73906r : j4;
        long j22 = (i13 & 262144) != 0 ? z2.f73905o : j5;
        int i27 = (i13 & 524288) != 0 ? z2.f73902Z : i7;
        long j23 = (i13 & 1048576) != 0 ? z2.XQ : j6;
        long j24 = (i13 & 2097152) != 0 ? z2.f73901S : j7;
        long j25 = (i13 & 4194304) != 0 ? z2.WPU : j9;
        int i28 = (i13 & 8388608) != 0 ? z2.aYN : i8;
        int i29 = (i13 & 16777216) != 0 ? z2.ViF : i9;
        int i30 = i28;
        int i31 = (i13 & 33554432) != 0 ? z2.nY : i10;
        int i32 = (i13 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? z2.f73903g : i11;
        int i33 = (i13 & 134217728) != 0 ? z2.te : i12;
        String str33 = (i13 & 268435456) != 0 ? z2.iF : str11;
        if ((i13 & 536870912) != 0) {
            i14 = i29;
            str12 = str33;
            j11 = z2.fD;
            i15 = i27;
            j13 = j23;
            j14 = j24;
            j15 = j25;
            i16 = i30;
            i17 = i31;
            i18 = i32;
            i19 = i33;
            j16 = j20;
            str15 = str28;
            str16 = str29;
            str17 = str30;
            str18 = str31;
            str19 = str32;
            i20 = i24;
            i21 = i26;
            i22 = i25;
            j17 = j21;
            j12 = j22;
            ew2 = ew3;
            j18 = j19;
            str20 = str23;
            str21 = str24;
            str22 = str25;
            str13 = str26;
            str14 = str27;
        } else {
            j11 = j10;
            str12 = str33;
            i14 = i29;
            j12 = j22;
            i15 = i27;
            j13 = j23;
            j14 = j24;
            j15 = j25;
            i16 = i30;
            i17 = i31;
            i18 = i32;
            i19 = i33;
            str13 = str26;
            str14 = str27;
            j16 = j20;
            str15 = str28;
            str16 = str29;
            str17 = str30;
            str18 = str31;
            str19 = str32;
            i20 = i24;
            i21 = i26;
            i22 = i25;
            j17 = j21;
            ew2 = ew3;
            j18 = j19;
            str20 = str23;
            str21 = str24;
            str22 = str25;
        }
        return z2.n(uri3, ew2, j18, str20, str21, str22, str13, str14, j16, str15, str16, str17, str18, str19, i21, i20, i22, j17, j12, i15, j13, j14, j15, i16, i14, i17, i18, i19, str12, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return Intrinsics.areEqual(this.f73904n, z2.f73904n) && this.rl == z2.rl && this.f73907t == z2.f73907t && Intrinsics.areEqual(this.nr, z2.nr) && Intrinsics.areEqual(this.f73900O, z2.f73900O) && Intrinsics.areEqual(this.J2, z2.J2) && Intrinsics.areEqual(this.Uo, z2.Uo) && Intrinsics.areEqual(this.KN, z2.KN) && this.xMQ == z2.xMQ && Intrinsics.areEqual(this.mUb, z2.mUb) && Intrinsics.areEqual(this.gh, z2.gh) && Intrinsics.areEqual(this.qie, z2.qie) && Intrinsics.areEqual(this.az, z2.az) && Intrinsics.areEqual(this.ty, z2.ty) && this.HI == z2.HI && this.ck == z2.ck && this.Ik == z2.Ik && this.f73906r == z2.f73906r && this.f73905o == z2.f73905o && this.f73902Z == z2.f73902Z && this.XQ == z2.XQ && this.f73901S == z2.f73901S && this.WPU == z2.WPU && this.aYN == z2.aYN && this.ViF == z2.ViF && this.nY == z2.nY && this.f73903g == z2.f73903g && this.te == z2.te && Intrinsics.areEqual(this.iF, z2.iF) && this.fD == z2.fD;
    }

    public final void B(int i2) {
        this.ViF = i2;
    }

    public final void D(int i2) {
        this.HI = i2;
    }

    public final void E(int i2) {
        this.Ik = i2;
    }

    public final int E2() {
        return this.f73903g;
    }

    public final void FX(String str) {
        this.nr = str;
    }

    public final void GR(long j2) {
        this.f73905o = j2;
    }

    public final String HI() {
        return this.Uo;
    }

    public final void I(int i2) {
        this.te = i2;
    }

    public final long Ik() {
        return this.fD;
    }

    public final void J(int i2) {
        this.nY = i2;
    }

    public final String J2() {
        return this.gh;
    }

    public final String KN() {
        return this.ty;
    }

    public final void M(long j2) {
        this.f73907t = j2;
    }

    public final void M7(long j2) {
        this.f73906r = j2;
    }

    public final void N(String str) {
        this.mUb = str;
    }

    public final void Nxk(String str) {
        this.f73900O = str;
    }

    public final long O() {
        return this.xMQ;
    }

    public final void P5(String str) {
        this.Uo = str;
    }

    public final int S() {
        return this.HI;
    }

    public final void T(String str) {
        this.KN = str;
    }

    public final void U(String str) {
        this.J2 = str;
    }

    public final String Uo() {
        return this.az;
    }

    public final Ew ViF() {
        return this.rl;
    }

    public final long WPU() {
        return this.f73905o;
    }

    public final void X(int i2) {
        this.aYN = i2;
    }

    public final String XQ() {
        return this.nr;
    }

    public final void Xw(long j2) {
        this.WPU = j2;
    }

    public final void Y(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.f73904n = uri;
    }

    public final long Z() {
        return this.f73907t;
    }

    public final void a(int i2) {
        this.f73903g = i2;
    }

    public final String aYN() {
        return this.f73900O;
    }

    public final long az() {
        return this.XQ;
    }

    public final void bzg(long j2) {
        this.f73901S = j2;
    }

    public final long ck() {
        return this.f73906r;
    }

    public final int e() {
        return this.te;
    }

    public final void eF(String str) {
        this.iF = str;
    }

    public final int fD() {
        return this.nY;
    }

    public final int g() {
        return this.ck;
    }

    public final long gh() {
        return this.f73901S;
    }

    public int hashCode() {
        int iHashCode = ((((this.f73904n.hashCode() * 31) + this.rl.hashCode()) * 31) + Long.hashCode(this.f73907t)) * 31;
        String str = this.nr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73900O;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.J2;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.Uo;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.KN;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Long.hashCode(this.xMQ)) * 31;
        String str6 = this.mUb;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.gh;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.qie;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.az;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ty;
        int iHashCode11 = (((((((((((((((((((((((((((((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.HI)) * 31) + Integer.hashCode(this.ck)) * 31) + Integer.hashCode(this.Ik)) * 31) + Long.hashCode(this.f73906r)) * 31) + Long.hashCode(this.f73905o)) * 31) + Integer.hashCode(this.f73902Z)) * 31) + Long.hashCode(this.XQ)) * 31) + Long.hashCode(this.f73901S)) * 31) + Long.hashCode(this.WPU)) * 31) + Integer.hashCode(this.aYN)) * 31) + Integer.hashCode(this.ViF)) * 31) + Integer.hashCode(this.nY)) * 31) + Integer.hashCode(this.f73903g)) * 31) + Integer.hashCode(this.te)) * 31;
        String str11 = this.iF;
        return ((iHashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31) + Long.hashCode(this.fD);
    }

    public final int iF() {
        return this.ViF;
    }

    public final void jB(long j2) {
        this.XQ = j2;
    }

    public final void k(int i2) {
        this.ck = i2;
    }

    public final String mUb() {
        return this.qie;
    }

    public final Z n(Uri uri, Ew type, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i5, long j4, long j5, int i7, long j6, long j7, long j9, int i8, int i9, int i10, int i11, int i12, String str11, long j10) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Z(uri, type, j2, str, str2, str3, str4, str5, j3, str6, str7, str8, str9, str10, i2, i3, i5, j4, j5, i7, j6, j7, j9, i8, i9, i10, i11, i12, str11, j10);
    }

    public final void nHg(long j2) {
        this.xMQ = j2;
    }

    public final Uri nY() {
        return this.f73904n;
    }

    public final String nr() {
        return this.mUb;
    }

    public final int o() {
        return this.Ik;
    }

    public final void p5(long j2) {
        this.fD = j2;
    }

    public final long qie() {
        return this.WPU;
    }

    public final String r() {
        return this.iF;
    }

    public final void rV9(String str) {
        this.qie = str;
    }

    public final void s7N(String str) {
        this.gh = str;
    }

    public final String t() {
        return this.KN;
    }

    public final int te() {
        return this.aYN;
    }

    public String toString() {
        return "MediaSummaryInfo(uri=" + this.f73904n + ", type=" + this.rl + ", id=" + this.f73907t + ", mime=" + this.nr + ", title=" + this.f73900O + ", description=" + this.J2 + ", displayName=" + this.Uo + ", album=" + this.KN + ", albumId=" + this.xMQ + ", albumArt=" + this.mUb + ", artist=" + this.gh + ", composer=" + this.qie + ", bucketDisplayName=" + this.az + ", bucketId=" + this.ty + ", orientation=" + this.HI + ", width=" + this.ck + ", height=" + this.Ik + ", duration=" + this.f73906r + ", size=" + this.f73905o + ", childCount=" + this.f73902Z + ", dateTaken=" + this.XQ + ", dateAdded=" + this.f73901S + ", dateModified=" + this.WPU + ", isAlarm=" + this.aYN + ", isMusic=" + this.ViF + ", isNotification=" + this.nY + ", isPodcast=" + this.f73903g + ", isRingtone=" + this.te + ", genreName=" + this.iF + ", genreId=" + this.fD + ")";
    }

    public final String ty() {
        return this.J2;
    }

    public final void v(String str) {
        this.ty = str;
    }

    public final void wTp(String str) {
        this.az = str;
    }

    public final int xMQ() {
        return this.f73902Z;
    }

    public /* synthetic */ Z(Uri uri, Ew ew, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6, String str7, String str8, String str9, String str10, int i2, int i3, int i5, long j4, long j5, int i7, long j6, long j7, long j9, int i8, int i9, int i10, int i11, int i12, String str11, long j10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? Uri.EMPTY : uri, ew, (i13 & 4) != 0 ? 0L : j2, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? 0L : j3, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & 2048) != 0 ? null : str8, (i13 & 4096) != 0 ? null : str9, (i13 & 8192) != 0 ? null : str10, (i13 & 16384) != 0 ? 0 : i2, (i13 & 32768) != 0 ? 0 : i3, (i13 & 65536) != 0 ? 0 : i5, (i13 & 131072) != 0 ? 0L : j4, (i13 & 262144) != 0 ? 0L : j5, (i13 & 524288) != 0 ? 0 : i7, (i13 & 1048576) != 0 ? 0L : j6, (i13 & 2097152) != 0 ? 0L : j7, (i13 & 4194304) != 0 ? 0L : j9, (i13 & 8388608) != 0 ? 0 : i8, (i13 & 16777216) != 0 ? 0 : i9, (i13 & 33554432) != 0 ? 0 : i10, (i13 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? 0 : i11, (i13 & 134217728) != 0 ? 0 : i12, (i13 & 268435456) != 0 ? null : str11, (i13 & 536870912) != 0 ? 0L : j10);
    }
}
