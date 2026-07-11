package tu;

import java.util.Arrays;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class u {
    private final int HI;
    private final long Ik;
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f74033O;
    private final j Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final String f74034Z;
    private final int az;
    private final long ck;
    private final List gh;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f74035n;
    private final Integer nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f74036o;
    private final int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f74037r;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f74038t;
    private final int ty;
    private final long xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ EnumEntries mYa;
        private static final /* synthetic */ j[] qm;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f74067n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f74064t = new j("BGR888", 0, 12);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f74050O = new j("RawBayer8bit", 1, 30);
        public static final j J2 = new j("RawBayer10bit", 2, 31);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final j f74063r = new j("RawBayer8bitcompressed", 3, 32);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final j f74062o = new j("L8", 4, 35);

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final j f74056Z = new j("L16", 5, 36);

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final j f74051S = new j("Surface", 6, 2130708361);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final j f74059g = new j("ABGR8888", 7, 2130747392);
        public static final j E2 = new j("YUV420Flexible", 8, 2135033992);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f74058e = new j("YUV422Flexible", 9, 2135042184);

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final j f74054X = new j("YUV444Flexible", 10, 2135181448);

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final j f74052T = new j("RGBFlexible", 11, 2134292616);

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final j f74049N = new j("RGBAFlexible", 12, 2134288520);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final j f74065v = new j("RGB565", 13, 6);
        public static final j Xw = new j("Monochrome", 14, 1);
        public static final j jB = new j("RGB332", 15, 2);

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final j f74053U = new j("RGB444", 16, 3);
        public static final j P5 = new j("ARGB4444", 17, 4);
        public static final j M7 = new j("ARGB1555", 18, 5);
        public static final j p5 = new j("BGR565", 19, 7);
        public static final j eF = new j("RGB666", 20, 8);

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final j f74042E = new j("ARGB1665", 21, 9);

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final j f74048M = new j("ARGB1666", 22, 10);

        /* JADX INFO: renamed from: FX, reason: collision with root package name */
        public static final j f74043FX = new j("RGB888", 23, 11);

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final j f74039B = new j("ARGB1887", 24, 13);

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final j f74047J = new j("ARGB1888", 25, 14);

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final j f74041D = new j("BGRA8888", 26, 15);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f74057a = new j("ARGB8888", 27, 16);

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final j f74046I = new j("YUV411Planar", 28, 17);

        /* JADX INFO: renamed from: GR, reason: collision with root package name */
        public static final j f74045GR = new j("YUV411PackedPlanar", 29, 18);
        public static final j Nxk = new j("YUV420Planar", 30, 19);

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final j f74055Y = new j("YUV420PackedPlanar", 31, 20);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final j f74060k = new j("YUV420SemiPlanar", 32, 21);
        public static final j dR0 = new j("YUV422Planar", 33, 22);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final j f74066z = new j("YUV422PackedPlanar", 34, 23);
        public static final j piY = new j("YUV422SemiPlanar", 35, 24);
        public static final j ijL = new j("YCbYCr", 36, 25);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final j f74061m = new j("YCrYCb", 37, 26);
        public static final j eTf = new j("CbYCrY", 38, 27);
        public static final j xg = new j("CrYCbY", 39, 28);
        public static final j pJg = new j("YUV444Interleaved", 40, 29);
        public static final j ofS = new j("L2", 41, 33);

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final j f74040C = new j("L4", 42, 34);
        public static final j Mx = new j("L24", 43, 37);

        /* JADX INFO: renamed from: G7, reason: collision with root package name */
        public static final j f74044G7 = new j("L32", 44, 38);
        public static final j fcU = new j("YUV420PackedSemiPlanar", 45, 39);
        public static final j eWT = new j("YUV422PackedSemiPlanar", 46, 40);
        public static final j ul = new j("BGR666", 47, 41);
        public static final j n1 = new j("ARGB6666", 48, 42);
        public static final j Jk = new j("ABGR6666", 49, 43);
        public static final j Rl = new j("QCOM_YUV420SemiPlanar", 50, 2141391872);

        static {
            j[] jVarArrN = n();
            qm = jVarArrN;
            mYa = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f74064t, f74050O, J2, f74063r, f74062o, f74056Z, f74051S, f74059g, E2, f74058e, f74054X, f74052T, f74049N, f74065v, Xw, jB, f74053U, P5, M7, p5, eF, f74042E, f74048M, f74043FX, f74039B, f74047J, f74041D, f74057a, f74046I, f74045GR, Nxk, f74055Y, f74060k, dR0, f74066z, piY, ijL, f74061m, eTf, xg, pJg, ofS, f74040C, Mx, f74044G7, fcU, eWT, ul, n1, Jk, Rl};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) qm.clone();
        }

        public final int rl() {
            return this.f74067n;
        }

        private j(String str, int i2, int i3) {
            this.f74067n = i3;
        }
    }

    public static /* synthetic */ u rl(u uVar, boolean z2, String str, String str2, Integer num, int i2, int i3, j jVar, int i5, long j2, int i7, List list, int i8, int i9, int i10, int i11, long j3, long j4, long j5, long j6, String str3, int i12, Object obj) {
        String str4;
        long j7;
        boolean z3 = (i12 & 1) != 0 ? uVar.f74035n : z2;
        String str5 = (i12 & 2) != 0 ? uVar.rl : str;
        String str6 = (i12 & 4) != 0 ? uVar.f74038t : str2;
        Integer num2 = (i12 & 8) != 0 ? uVar.nr : num;
        int i13 = (i12 & 16) != 0 ? uVar.f74033O : i2;
        int i14 = (i12 & 32) != 0 ? uVar.J2 : i3;
        j jVar2 = (i12 & 64) != 0 ? uVar.Uo : jVar;
        int i15 = (i12 & 128) != 0 ? uVar.KN : i5;
        long j9 = (i12 & 256) != 0 ? uVar.xMQ : j2;
        int i16 = (i12 & 512) != 0 ? uVar.mUb : i7;
        List list2 = (i12 & 1024) != 0 ? uVar.gh : list;
        int i17 = (i12 & 2048) != 0 ? uVar.qie : i8;
        int i18 = (i12 & 4096) != 0 ? uVar.az : i9;
        boolean z4 = z3;
        int i19 = (i12 & 8192) != 0 ? uVar.ty : i10;
        int i20 = (i12 & 16384) != 0 ? uVar.HI : i11;
        long j10 = (i12 & 32768) != 0 ? uVar.ck : j3;
        long j11 = (i12 & 65536) != 0 ? uVar.Ik : j4;
        long j12 = (i12 & 131072) != 0 ? uVar.f74037r : j5;
        long j13 = (i12 & 262144) != 0 ? uVar.f74036o : j6;
        if ((i12 & 524288) != 0) {
            j7 = j13;
            str4 = uVar.f74034Z;
        } else {
            str4 = str3;
            j7 = j13;
        }
        return uVar.n(z4, str5, str6, num2, i13, i14, jVar2, i15, j9, i16, list2, i17, i18, i19, i20, j10, j11, j12, j7, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f74035n == uVar.f74035n && Intrinsics.areEqual(this.rl, uVar.rl) && Intrinsics.areEqual(this.f74038t, uVar.f74038t) && Intrinsics.areEqual(this.nr, uVar.nr) && this.f74033O == uVar.f74033O && this.J2 == uVar.J2 && this.Uo == uVar.Uo && this.KN == uVar.KN && this.xMQ == uVar.xMQ && this.mUb == uVar.mUb && Intrinsics.areEqual(this.gh, uVar.gh) && this.qie == uVar.qie && this.az == uVar.az && this.ty == uVar.ty && this.HI == uVar.HI && this.ck == uVar.ck && this.Ik == uVar.Ik && this.f74037r == uVar.f74037r && this.f74036o == uVar.f74036o && Intrinsics.areEqual(this.f74034Z, uVar.f74034Z);
    }

    public u(boolean z2, String decoderName, String mimeType, Integer num, int i2, int i3, j jVar, int i5, long j2, int i7, List syncFrames, int i8, int i9, int i10, int i11, long j3, long j4, long j5, long j6, String str) {
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(syncFrames, "syncFrames");
        this.f74035n = z2;
        this.rl = decoderName;
        this.f74038t = mimeType;
        this.nr = num;
        this.f74033O = i2;
        this.J2 = i3;
        this.Uo = jVar;
        this.KN = i5;
        this.xMQ = j2;
        this.mUb = i7;
        this.gh = syncFrames;
        this.qie = i8;
        this.az = i9;
        this.ty = i10;
        this.HI = i11;
        this.ck = j3;
        this.Ik = j4;
        this.f74037r = j5;
        this.f74036o = j6;
        this.f74034Z = str;
    }

    public final int J2() {
        return this.J2;
    }

    public final String KN() {
        return this.f74038t;
    }

    public final int O() {
        return this.mUb;
    }

    public final int Uo() {
        return this.ty;
    }

    public final int gh() {
        return this.f74033O;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f74035n) * 31) + this.rl.hashCode()) * 31) + this.f74038t.hashCode()) * 31;
        Integer num = this.nr;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f74033O)) * 31) + Integer.hashCode(this.J2)) * 31;
        j jVar = this.Uo;
        int iHashCode3 = (((((((((((((((((((((((((iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31) + Integer.hashCode(this.KN)) * 31) + Long.hashCode(this.xMQ)) * 31) + Integer.hashCode(this.mUb)) * 31) + this.gh.hashCode()) * 31) + Integer.hashCode(this.qie)) * 31) + Integer.hashCode(this.az)) * 31) + Integer.hashCode(this.ty)) * 31) + Integer.hashCode(this.HI)) * 31) + Long.hashCode(this.ck)) * 31) + Long.hashCode(this.Ik)) * 31) + Long.hashCode(this.f74037r)) * 31) + Long.hashCode(this.f74036o)) * 31;
        String str = this.f74034Z;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final boolean mUb() {
        return this.f74035n;
    }

    public final u n(boolean z2, String decoderName, String mimeType, Integer num, int i2, int i3, j jVar, int i5, long j2, int i7, List syncFrames, int i8, int i9, int i10, int i11, long j3, long j4, long j5, long j6, String str) {
        Intrinsics.checkNotNullParameter(decoderName, "decoderName");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(syncFrames, "syncFrames");
        return new u(z2, decoderName, mimeType, num, i2, i3, jVar, i5, j2, i7, syncFrames, i8, i9, i10, i11, j3, j4, j5, j6, str);
    }

    public final long nr() {
        return this.xMQ;
    }

    public final String t() {
        return this.f74034Z;
    }

    public String toString() {
        boolean z2 = this.f74035n;
        String str = this.rl;
        String str2 = this.f74038t;
        Integer num = this.nr;
        int i2 = this.f74033O;
        int i3 = this.J2;
        j jVar = this.Uo;
        long j2 = this.xMQ;
        String str3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        int i5 = this.mUb;
        String str4 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i5) / 100.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        List list = this.gh;
        int i7 = this.qie;
        long j3 = this.ck;
        String str5 = String.format("%.4f", Arrays.copyOf(new Object[]{Double.valueOf(j3 / 1000000.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        long j4 = this.Ik;
        String str6 = String.format("%.4f", Arrays.copyOf(new Object[]{Double.valueOf(j4 / 1000000.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
        long j5 = this.f74037r;
        String str7 = String.format("%.4f", Arrays.copyOf(new Object[]{Double.valueOf(j5 / 1000000.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
        return StringsKt.trimIndent("\n        supported: " + z2 + "\n        decoderName: " + str + "\n        mimeType: " + str2 + "\n        maxInputBufferSize: " + num + "\n        width: " + i2 + "\n        height: " + i3 + "\n        colorFormat: " + jVar + "\n        duration: " + j2 + "us (" + str3 + "s)\n        frameRate: " + i5 + "/100s (" + str4 + " FPS)\n        syncFrames: " + list + "\n        syncFrameCount: " + i7 + "\n        minSyncFrameInterval: " + j3 + "us (" + str5 + "s)\n        maxSyncFrameInterval: " + j4 + "us (" + str6 + "s)\n        avgSyncFrameInterval: " + j5 + "us (" + str7 + "s)\n        ");
    }

    public final int xMQ() {
        return this.HI;
    }
}
