package rWZ;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n {
    private final int E2;
    private final int HI;
    private final int Ik;
    private final int J2;
    private final String KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final pq.w6 f73092N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f73093O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final String f73094S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f73095T;
    private final String Uo;
    private final int ViF;
    private final pq.w6 WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final int f73096X;
    private final String XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final boolean f73097Z;
    private final int aYN;
    private final boolean az;
    private final int ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f73098e;
    private final int fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f73099g;
    private final String gh;
    private final int iF;
    private final Double mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f73100n;
    private final boolean nHg;
    private final int nY;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f73101o;
    private final String qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f73102r;
    private final long rl;
    private final boolean s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Long f73103t;
    private final int te;
    private final boolean ty;
    private final Integer xMQ;

    public static /* synthetic */ n rl(n nVar, long j2, long j3, Long l2, int i2, int i3, int i5, String str, String str2, Integer num, Double d2, String str3, String str4, boolean z2, boolean z3, int i7, int i8, int i9, int i10, String str5, boolean z4, String str6, String str7, pq.w6 w6Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, pq.w6 w6Var2, boolean z5, boolean z6, int i22, int i23, Object obj) {
        boolean z7;
        boolean z9;
        String str8;
        boolean z10;
        String str9;
        String str10;
        pq.w6 w6Var3;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        pq.w6 w6Var4;
        int i35;
        boolean z11;
        Long l5;
        int i36;
        int i37;
        int i38;
        String str11;
        String str12;
        Integer num2;
        Double d4;
        String str13;
        String str14;
        boolean z12;
        int i39;
        int i40;
        int i41;
        long j4 = (i22 & 1) != 0 ? nVar.f73100n : j2;
        long j5 = (i22 & 2) != 0 ? nVar.rl : j3;
        Long l6 = (i22 & 4) != 0 ? nVar.f73103t : l2;
        int i42 = (i22 & 8) != 0 ? nVar.nr : i2;
        int i43 = (i22 & 16) != 0 ? nVar.f73093O : i3;
        int i44 = (i22 & 32) != 0 ? nVar.J2 : i5;
        String str15 = (i22 & 64) != 0 ? nVar.Uo : str;
        String str16 = (i22 & 128) != 0 ? nVar.KN : str2;
        Integer num3 = (i22 & 256) != 0 ? nVar.xMQ : num;
        Double d5 = (i22 & 512) != 0 ? nVar.mUb : d2;
        String str17 = (i22 & 1024) != 0 ? nVar.gh : str3;
        String str18 = (i22 & 2048) != 0 ? nVar.qie : str4;
        long j6 = j4;
        boolean z13 = (i22 & 4096) != 0 ? nVar.az : z2;
        boolean z14 = (i22 & 8192) != 0 ? nVar.ty : z3;
        boolean z15 = z13;
        int i45 = (i22 & 16384) != 0 ? nVar.HI : i7;
        int i46 = (i22 & 32768) != 0 ? nVar.ck : i8;
        int i47 = (i22 & 65536) != 0 ? nVar.Ik : i9;
        int i48 = (i22 & 131072) != 0 ? nVar.f73102r : i10;
        String str19 = (i22 & 262144) != 0 ? nVar.f73101o : str5;
        boolean z16 = (i22 & 524288) != 0 ? nVar.f73097Z : z4;
        String str20 = (i22 & 1048576) != 0 ? nVar.XQ : str6;
        String str21 = (i22 & 2097152) != 0 ? nVar.f73094S : str7;
        pq.w6 w6Var5 = (i22 & 4194304) != 0 ? nVar.WPU : w6Var;
        int i49 = (i22 & 8388608) != 0 ? nVar.aYN : i11;
        int i50 = (i22 & 16777216) != 0 ? nVar.ViF : i12;
        int i51 = (i22 & 33554432) != 0 ? nVar.nY : i13;
        int i52 = (i22 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nVar.f73099g : i14;
        int i53 = (i22 & 134217728) != 0 ? nVar.te : i15;
        int i54 = (i22 & 268435456) != 0 ? nVar.iF : i16;
        int i55 = (i22 & 536870912) != 0 ? nVar.fD : i17;
        int i56 = (i22 & 1073741824) != 0 ? nVar.E2 : i18;
        int i57 = (i22 & Integer.MIN_VALUE) != 0 ? nVar.f73098e : i19;
        int i58 = (i23 & 1) != 0 ? nVar.f73096X : i20;
        int i59 = (i23 & 2) != 0 ? nVar.f73095T : i21;
        pq.w6 w6Var6 = (i23 & 4) != 0 ? nVar.f73092N : w6Var2;
        boolean z17 = (i23 & 8) != 0 ? nVar.nHg : z5;
        if ((i23 & 16) != 0) {
            z9 = z17;
            z7 = nVar.s7N;
            z10 = z16;
            str9 = str20;
            str10 = str21;
            w6Var3 = w6Var5;
            i24 = i49;
            i25 = i50;
            i26 = i51;
            i27 = i52;
            i28 = i53;
            i29 = i54;
            i30 = i55;
            i31 = i56;
            i32 = i57;
            i33 = i58;
            i34 = i59;
            w6Var4 = w6Var6;
            i35 = i45;
            z11 = z14;
            l5 = l6;
            i36 = i42;
            i37 = i43;
            i38 = i44;
            str11 = str15;
            str12 = str16;
            num2 = num3;
            d4 = d5;
            str13 = str17;
            str14 = str18;
            z12 = z15;
            i39 = i46;
            i40 = i47;
            i41 = i48;
            str8 = str19;
        } else {
            z7 = z6;
            z9 = z17;
            str8 = str19;
            z10 = z16;
            str9 = str20;
            str10 = str21;
            w6Var3 = w6Var5;
            i24 = i49;
            i25 = i50;
            i26 = i51;
            i27 = i52;
            i28 = i53;
            i29 = i54;
            i30 = i55;
            i31 = i56;
            i32 = i57;
            i33 = i58;
            i34 = i59;
            w6Var4 = w6Var6;
            i35 = i45;
            z11 = z14;
            l5 = l6;
            i36 = i42;
            i37 = i43;
            i38 = i44;
            str11 = str15;
            str12 = str16;
            num2 = num3;
            d4 = d5;
            str13 = str17;
            str14 = str18;
            z12 = z15;
            i39 = i46;
            i40 = i47;
            i41 = i48;
        }
        return nVar.n(j6, j5, l5, i36, i37, i38, str11, str12, num2, d4, str13, str14, z12, z11, i35, i39, i40, i41, str8, z10, str9, str10, w6Var3, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, w6Var4, z9, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f73100n == nVar.f73100n && this.rl == nVar.rl && Intrinsics.areEqual(this.f73103t, nVar.f73103t) && this.nr == nVar.nr && this.f73093O == nVar.f73093O && this.J2 == nVar.J2 && Intrinsics.areEqual(this.Uo, nVar.Uo) && Intrinsics.areEqual(this.KN, nVar.KN) && Intrinsics.areEqual(this.xMQ, nVar.xMQ) && Intrinsics.areEqual((Object) this.mUb, (Object) nVar.mUb) && Intrinsics.areEqual(this.gh, nVar.gh) && Intrinsics.areEqual(this.qie, nVar.qie) && this.az == nVar.az && this.ty == nVar.ty && this.HI == nVar.HI && this.ck == nVar.ck && this.Ik == nVar.Ik && this.f73102r == nVar.f73102r && Intrinsics.areEqual(this.f73101o, nVar.f73101o) && this.f73097Z == nVar.f73097Z && Intrinsics.areEqual(this.XQ, nVar.XQ) && Intrinsics.areEqual(this.f73094S, nVar.f73094S) && Intrinsics.areEqual(this.WPU, nVar.WPU) && this.aYN == nVar.aYN && this.ViF == nVar.ViF && this.nY == nVar.nY && this.f73099g == nVar.f73099g && this.te == nVar.te && this.iF == nVar.iF && this.fD == nVar.fD && this.E2 == nVar.E2 && this.f73098e == nVar.f73098e && this.f73096X == nVar.f73096X && this.f73095T == nVar.f73095T && Intrinsics.areEqual(this.f73092N, nVar.f73092N) && this.nHg == nVar.nHg && this.s7N == nVar.s7N;
    }

    public n(long j2, long j3, Long l2, int i2, int i3, int i5, String str, String str2, Integer num, Double d2, String projectId, String projectType, boolean z2, boolean z3, int i7, int i8, int i9, int i10, String projectBackground, boolean z4, String str3, String str4, pq.w6 w6Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, pq.w6 templatePPIdList, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(projectType, "projectType");
        Intrinsics.checkNotNullParameter(projectBackground, "projectBackground");
        Intrinsics.checkNotNullParameter(templatePPIdList, "templatePPIdList");
        this.f73100n = j2;
        this.rl = j3;
        this.f73103t = l2;
        this.nr = i2;
        this.f73093O = i3;
        this.J2 = i5;
        this.Uo = str;
        this.KN = str2;
        this.xMQ = num;
        this.mUb = d2;
        this.gh = projectId;
        this.qie = projectType;
        this.az = z2;
        this.ty = z3;
        this.HI = i7;
        this.ck = i8;
        this.Ik = i9;
        this.f73102r = i10;
        this.f73101o = projectBackground;
        this.f73097Z = z4;
        this.XQ = str3;
        this.f73094S = str4;
        this.WPU = w6Var;
        this.aYN = i11;
        this.ViF = i12;
        this.nY = i13;
        this.f73099g = i14;
        this.te = i15;
        this.iF = i16;
        this.fD = i17;
        this.E2 = i18;
        this.f73098e = i19;
        this.f73096X = i20;
        this.f73095T = i21;
        this.f73092N = templatePPIdList;
        this.nHg = z5;
        this.s7N = z6;
    }

    public final int E2() {
        return this.HI;
    }

    public final Long HI() {
        return this.f73103t;
    }

    public final boolean Ik() {
        return this.f73097Z;
    }

    public final long J2() {
        return this.rl;
    }

    public final int KN() {
        return this.nr;
    }

    public final String N() {
        return this.XQ;
    }

    public final boolean O() {
        return this.ty;
    }

    public final int S() {
        return this.f73098e;
    }

    public final String T() {
        return this.gh;
    }

    public final String Uo() {
        return this.Uo;
    }

    public final int ViF() {
        return this.E2;
    }

    public final int WPU() {
        return this.aYN;
    }

    public final int X() {
        return this.Ik;
    }

    public final int XQ() {
        return this.te;
    }

    public final int Z() {
        return this.fD;
    }

    public final int aYN() {
        return this.ViF;
    }

    public final int az() {
        return this.f73093O;
    }

    public final boolean ck() {
        return this.s7N;
    }

    public final int e() {
        return this.f73102r;
    }

    public final String fD() {
        return this.f73101o;
    }

    public final int g() {
        return this.f73099g;
    }

    public final String gh() {
        return this.KN;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f73100n) * 31) + Long.hashCode(this.rl)) * 31;
        Long l2 = this.f73103t;
        int iHashCode2 = (((((((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f73093O)) * 31) + Integer.hashCode(this.J2)) * 31;
        String str = this.Uo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.KN;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.xMQ;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.mUb;
        int iHashCode6 = (((((((((((((((((((((iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31) + this.gh.hashCode()) * 31) + this.qie.hashCode()) * 31) + Boolean.hashCode(this.az)) * 31) + Boolean.hashCode(this.ty)) * 31) + Integer.hashCode(this.HI)) * 31) + Integer.hashCode(this.ck)) * 31) + Integer.hashCode(this.Ik)) * 31) + Integer.hashCode(this.f73102r)) * 31) + this.f73101o.hashCode()) * 31) + Boolean.hashCode(this.f73097Z)) * 31;
        String str3 = this.XQ;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73094S;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        pq.w6 w6Var = this.WPU;
        return ((((((((((((((((((((((((((((iHashCode8 + (w6Var != null ? w6Var.hashCode() : 0)) * 31) + Integer.hashCode(this.aYN)) * 31) + Integer.hashCode(this.ViF)) * 31) + Integer.hashCode(this.nY)) * 31) + Integer.hashCode(this.f73099g)) * 31) + Integer.hashCode(this.te)) * 31) + Integer.hashCode(this.iF)) * 31) + Integer.hashCode(this.fD)) * 31) + Integer.hashCode(this.E2)) * 31) + Integer.hashCode(this.f73098e)) * 31) + Integer.hashCode(this.f73096X)) * 31) + Integer.hashCode(this.f73095T)) * 31) + this.f73092N.hashCode()) * 31) + Boolean.hashCode(this.nHg)) * 31) + Boolean.hashCode(this.s7N);
    }

    public final int iF() {
        return this.f73095T;
    }

    public final int mUb() {
        return this.J2;
    }

    public final n n(long j2, long j3, Long l2, int i2, int i3, int i5, String str, String str2, Integer num, Double d2, String projectId, String projectType, boolean z2, boolean z3, int i7, int i8, int i9, int i10, String projectBackground, boolean z4, String str3, String str4, pq.w6 w6Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, pq.w6 templatePPIdList, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(projectType, "projectType");
        Intrinsics.checkNotNullParameter(projectBackground, "projectBackground");
        Intrinsics.checkNotNullParameter(templatePPIdList, "templatePPIdList");
        return new n(j2, j3, l2, i2, i3, i5, str, str2, num, d2, projectId, projectType, z2, z3, i7, i8, i9, i10, projectBackground, z4, str3, str4, w6Var, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, templatePPIdList, z5, z6);
    }

    public final String nHg() {
        return this.f73094S;
    }

    public final int nY() {
        return this.f73096X;
    }

    public final boolean nr() {
        return this.az;
    }

    public final int o() {
        return this.iF;
    }

    public final Double qie() {
        return this.mUb;
    }

    public final pq.w6 r() {
        return this.WPU;
    }

    public final String s7N() {
        return this.qie;
    }

    public final long t() {
        return this.f73100n;
    }

    public final int te() {
        return this.nY;
    }

    public String toString() {
        return "ExportSnapshot(availableStorage=" + this.f73100n + ", estimatedFileSize=" + this.rl + ", fileSize=" + this.f73103t + ", exportFormat=" + this.nr + ", exportWidth=" + this.f73093O + ", exportHeight=" + this.J2 + ", exportCodec=" + this.Uo + ", exportImageFormat=" + this.KN + ", exportFps=" + this.xMQ + ", exportQuality=" + this.mUb + ", projectId=" + this.gh + ", projectType=" + this.qie + ", createdFromProjectPackage=" + this.az + ", createdFromXml=" + this.ty + ", projectDuration=" + this.HI + ", projectWidth=" + this.ck + ", projectHeight=" + this.Ik + ", projectFps=" + this.f73102r + ", projectBackground=" + this.f73101o + ", hasWatermark=" + this.f73097Z + ", projectPackageId=" + this.XQ + ", projectPackageSharingFormat=" + this.f73094S + ", layers=" + this.WPU + ", numLayers=" + this.aYN + ", numLiveShape=" + this.ViF + ", numVectorShape=" + this.nY + ", numText=" + this.f73099g + ", numDrawing=" + this.te + ", numAudio=" + this.iF + ", numCamera=" + this.fD + ", numNullObject=" + this.E2 + ", numGroup=" + this.f73098e + ", numPhoto=" + this.f73096X + ", numVideo=" + this.f73095T + ", templatePPIdList=" + this.f73092N + ", exportedWithTemplateToggleOn=" + this.nHg + ", hasSpeedKeyframes=" + this.s7N + ")";
    }

    public final boolean ty() {
        return this.nHg;
    }

    public final pq.w6 v() {
        return this.f73092N;
    }

    public final int wTp() {
        return this.ck;
    }

    public final Integer xMQ() {
        return this.xMQ;
    }
}
