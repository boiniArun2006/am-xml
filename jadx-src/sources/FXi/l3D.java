package FXi;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l3D {
    private static final PaddingValues E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final R7M.j f2675N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final R7M.j f2676T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final TextStyle f2677X;
    private static final PaddingValues bzg;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TextStyle f2678e;
    private static final TextStyle fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final TextStyle f2679g;
    private static final TextStyle iF;
    private static final RoundedCornerShape nHg;
    public static final n nY = new n(null);
    private static final long rV9;
    private static final long s7N;
    private static final TextStyle te;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f2680v;
    private static final long wTp;
    private final R7M.j HI;
    private final long Ik;
    private final TextStyle J2;
    private final TextStyle KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f2681O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final PaddingValues f2682S;
    private final PaddingValues Uo;
    private final boolean ViF;
    private final j WPU;
    private final boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final long f2683Z;
    private final boolean aYN;
    private final R7M.j az;
    private final Shape ck;
    private final TextStyle gh;
    private final TextStyle mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f2684n;
    private final TextStyle nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f2685o;
    private final TextStyle qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f2686r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f2687t;
    private final R7M.j ty;
    private final TextStyle xMQ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ j[] f2688O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f2689n = new j("CORNER_X", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f2690t = new j("REFUSE_BUTTON", 1);

        static {
            j[] jVarArrN = n();
            f2688O = jVarArrN;
            J2 = EnumEntriesKt.enumEntries(jVarArrN);
        }

        private static final /* synthetic */ j[] n() {
            return new j[]{f2689n, f2690t};
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f2688O.clone();
        }

        private j(String str, int i2) {
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public /* synthetic */ l3D(Integer num, int i2, String str, TextStyle textStyle, String str2, TextStyle textStyle2, PaddingValues paddingValues, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, R7M.j jVar, R7M.j jVar2, R7M.j jVar3, Shape shape, long j2, long j3, long j4, long j5, boolean z2, PaddingValues paddingValues2, j jVar4, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i2, str, textStyle, str2, textStyle2, paddingValues, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, jVar, jVar2, jVar3, shape, j2, j3, j4, j5, z2, paddingValues2, jVar4, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        l3D l3d = (l3D) obj;
        return Intrinsics.areEqual(this.f2684n, l3d.f2684n) && this.rl == l3d.rl && Intrinsics.areEqual(this.f2687t, l3d.f2687t) && Intrinsics.areEqual(this.nr, l3d.nr) && Intrinsics.areEqual(this.f2681O, l3d.f2681O) && Intrinsics.areEqual(this.J2, l3d.J2) && Intrinsics.areEqual(this.Uo, l3d.Uo) && Intrinsics.areEqual(this.KN, l3d.KN) && Intrinsics.areEqual(this.xMQ, l3d.xMQ) && Intrinsics.areEqual(this.mUb, l3d.mUb) && Intrinsics.areEqual(this.gh, l3d.gh) && Intrinsics.areEqual(this.qie, l3d.qie) && Intrinsics.areEqual(this.az, l3d.az) && Intrinsics.areEqual(this.ty, l3d.ty) && Intrinsics.areEqual(this.HI, l3d.HI) && Intrinsics.areEqual(this.ck, l3d.ck) && Color.HI(this.Ik, l3d.Ik) && Color.HI(this.f2686r, l3d.f2686r) && Color.HI(this.f2685o, l3d.f2685o) && Color.HI(this.f2683Z, l3d.f2683Z) && this.XQ == l3d.XQ && Intrinsics.areEqual(this.f2682S, l3d.f2682S) && this.WPU == l3d.WPU && this.aYN == l3d.aYN && this.ViF == l3d.ViF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long jKN = TextUnitKt.KN(40);
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeightJ2 = companion.J2();
        long jKN2 = TextUnitKt.KN(48);
        TextAlign.Companion companion2 = TextAlign.INSTANCE;
        f2679g = new TextStyle(Yd.j.Uo(), jKN, fontWeightJ2, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion2.J2(), 0, jKN2, null, null, null, 0, 0, null, 16613368, null);
        te = new TextStyle(Yd.j.nr(), TextUnitKt.KN(16), companion.O(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion2.J2(), 0, TextUnitKt.KN(20), null, null, null, 0, 0, null, 16613368, null);
        iF = new TextStyle(Color.az(Yd.j.O(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.KN(14), null, null, null, null, null, TextUnitKt.J2(0.2d), null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(22), null, null, null, 0, 0, null, 16646012, null);
        fD = new TextStyle(Yd.j.xMQ(), 0L, companion.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
        float f3 = 20;
        E2 = PaddingKt.rl(Dp.KN(f3), Dp.KN(0));
        f2678e = new TextStyle(0L, TextUnitKt.KN(17), companion.nr(), null, null, null, null, TextUnitKt.J2(0.25d), null, null, null, 0L, null, null, null, companion2.n(), 0, TextUnitKt.KN(21), null, null, null, 0, 0, null, 16613241, null);
        f2677X = new TextStyle(0L, TextUnitKt.KN(17), companion.nr(), null, null, null, null, TextUnitKt.J2(0.25d), null, null, null, 0L, null, null, null, companion2.n(), 0, TextUnitKt.KN(21), null, null, null, 0, 0, null, 16613241, null);
        Brush brushXMQ = Brush.Companion.xMQ(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(Yd.j.rl()), Color.xMQ(Yd.j.n())}), 0.0f, 0.0f, 0, 14, null);
        float f4 = 9;
        RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(f4));
        Color.Companion companion3 = Color.INSTANCE;
        f2676T = new R7M.j(brushXMQ, companion3.KN(), (BorderStroke) null, roundedCornerShapeT, (PaddingValues) null, null, 52, (DefaultConstructorMarker) null);
        f2675N = new R7M.j(companion3.J2(), Yd.j.nr(), (BorderStroke) (0 == true ? 1 : 0), (Shape) RoundedCornerShapeKt.t(Dp.KN(f4)), null, (PaddingValues) (0 == true ? 1 : 0), 52, (DefaultConstructorMarker) null);
        float f5 = 15;
        nHg = RoundedCornerShapeKt.O(0.0f, 0.0f, Dp.KN(f5), Dp.KN(f5), 3, null);
        s7N = companion3.KN();
        wTp = Yd.j.xMQ();
        f2680v = Color.az(companion3.n(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        rV9 = companion3.KN();
        bzg = PaddingKt.O(0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
    }

    private l3D(Integer num, int i2, String str, TextStyle titleTextStyle, String str2, TextStyle overlineTextStyle, PaddingValues overlineTextPaddingValues, TextStyle bodyTextStyle, TextStyle linkTextStyle, TextStyle acceptAllButtonTextStyle, TextStyle refuseButtonTextStyle, TextStyle customizeButtonTextStyle, R7M.j acceptAllButtonStyle, R7M.j refuseButtonStyle, R7M.j customizeButtonStyle, Shape headerImageShape, long j2, long j3, long j4, long j5, boolean z2, PaddingValues headerImagePadding, j closeButtonStyle, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(overlineTextStyle, "overlineTextStyle");
        Intrinsics.checkNotNullParameter(overlineTextPaddingValues, "overlineTextPaddingValues");
        Intrinsics.checkNotNullParameter(bodyTextStyle, "bodyTextStyle");
        Intrinsics.checkNotNullParameter(linkTextStyle, "linkTextStyle");
        Intrinsics.checkNotNullParameter(acceptAllButtonTextStyle, "acceptAllButtonTextStyle");
        Intrinsics.checkNotNullParameter(refuseButtonTextStyle, "refuseButtonTextStyle");
        Intrinsics.checkNotNullParameter(customizeButtonTextStyle, "customizeButtonTextStyle");
        Intrinsics.checkNotNullParameter(acceptAllButtonStyle, "acceptAllButtonStyle");
        Intrinsics.checkNotNullParameter(refuseButtonStyle, "refuseButtonStyle");
        Intrinsics.checkNotNullParameter(customizeButtonStyle, "customizeButtonStyle");
        Intrinsics.checkNotNullParameter(headerImageShape, "headerImageShape");
        Intrinsics.checkNotNullParameter(headerImagePadding, "headerImagePadding");
        Intrinsics.checkNotNullParameter(closeButtonStyle, "closeButtonStyle");
        this.f2684n = num;
        this.rl = i2;
        this.f2687t = str;
        this.nr = titleTextStyle;
        this.f2681O = str2;
        this.J2 = overlineTextStyle;
        this.Uo = overlineTextPaddingValues;
        this.KN = bodyTextStyle;
        this.xMQ = linkTextStyle;
        this.mUb = acceptAllButtonTextStyle;
        this.gh = refuseButtonTextStyle;
        this.qie = customizeButtonTextStyle;
        this.az = acceptAllButtonStyle;
        this.ty = refuseButtonStyle;
        this.HI = customizeButtonStyle;
        this.ck = headerImageShape;
        this.Ik = j2;
        this.f2686r = j3;
        this.f2685o = j4;
        this.f2683Z = j5;
        this.XQ = z2;
        this.f2682S = headerImagePadding;
        this.WPU = closeButtonStyle;
        this.aYN = z3;
        this.ViF = z4;
    }

    public final String HI() {
        return this.f2681O;
    }

    public final TextStyle Ik() {
        return this.J2;
    }

    public final long J2() {
        return this.f2686r;
    }

    public final TextStyle KN() {
        return this.qie;
    }

    public final j O() {
        return this.WPU;
    }

    public final int S() {
        return this.rl;
    }

    public final R7M.j Uo() {
        return this.HI;
    }

    public final boolean ViF() {
        return this.XQ;
    }

    public final boolean WPU() {
        return this.ViF;
    }

    public final TextStyle XQ() {
        return this.nr;
    }

    public final String Z() {
        return this.f2687t;
    }

    public final boolean aYN() {
        return this.aYN;
    }

    public final long az() {
        return this.f2685o;
    }

    public final PaddingValues ck() {
        return this.Uo;
    }

    public final Shape gh() {
        return this.ck;
    }

    public int hashCode() {
        Integer num = this.f2684n;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.rl)) * 31;
        String str = this.f2687t;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.nr.hashCode()) * 31;
        String str2 = this.f2681O;
        return ((((((((((((((((((((((((((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode()) * 31) + this.mUb.hashCode()) * 31) + this.gh.hashCode()) * 31) + this.qie.hashCode()) * 31) + this.az.hashCode()) * 31) + this.ty.hashCode()) * 31) + this.HI.hashCode()) * 31) + this.ck.hashCode()) * 31) + Color.XQ(this.Ik)) * 31) + Color.XQ(this.f2686r)) * 31) + Color.XQ(this.f2685o)) * 31) + Color.XQ(this.f2683Z)) * 31) + Boolean.hashCode(this.XQ)) * 31) + this.f2682S.hashCode()) * 31) + this.WPU.hashCode()) * 31) + Boolean.hashCode(this.aYN)) * 31) + Boolean.hashCode(this.ViF);
    }

    public final PaddingValues mUb() {
        return this.f2682S;
    }

    public final R7M.j n() {
        return this.az;
    }

    public final TextStyle nr() {
        return this.KN;
    }

    public final TextStyle o() {
        return this.gh;
    }

    public final TextStyle qie() {
        return this.xMQ;
    }

    public final R7M.j r() {
        return this.ty;
    }

    public final TextStyle rl() {
        return this.mUb;
    }

    public final long t() {
        return this.Ik;
    }

    public String toString() {
        return "PrivacyBannerStyle(headerImageId=" + this.f2684n + ", topSpacerHeight=" + this.rl + ", titleText=" + this.f2687t + ", titleTextStyle=" + this.nr + ", overlineText=" + this.f2681O + ", overlineTextStyle=" + this.J2 + ", overlineTextPaddingValues=" + this.Uo + ", bodyTextStyle=" + this.KN + ", linkTextStyle=" + this.xMQ + ", acceptAllButtonTextStyle=" + this.mUb + ", refuseButtonTextStyle=" + this.gh + ", customizeButtonTextStyle=" + this.qie + ", acceptAllButtonStyle=" + this.az + ", refuseButtonStyle=" + this.ty + ", customizeButtonStyle=" + this.HI + ", headerImageShape=" + this.ck + ", backgroundColor=" + Color.S(this.Ik) + ", closeIconTint=" + Color.S(this.f2686r) + ", loadingIndicatorColor=" + Color.S(this.f2685o) + ", loadingOverlayColor=" + Color.S(this.f2683Z) + ", isCustomizeButtonOnTop=" + this.XQ + ", headerImagePadding=" + this.f2682S + ", closeButtonStyle=" + this.WPU + ", isCopyWithoutAdvertisingShown=" + this.aYN + ", usePersonalizedContentDescription=" + this.ViF + ")";
    }

    public final long ty() {
        return this.f2683Z;
    }

    public final Integer xMQ() {
        return this.f2684n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l3D(Integer num, int i2, String str, TextStyle textStyle, String str2, TextStyle textStyle2, PaddingValues paddingValues, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, R7M.j jVar, R7M.j jVar2, R7M.j jVar3, Shape shape, long j2, long j3, long j4, long j5, boolean z2, PaddingValues paddingValues2, j jVar4, boolean z3, boolean z4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2 = (i3 & 1) != 0 ? null : num;
        int i5 = (i3 & 2) != 0 ? 0 : i2;
        String str3 = (i3 & 4) != 0 ? null : str;
        TextStyle textStyle8 = (i3 & 8) != 0 ? f2679g : textStyle;
        String str4 = (i3 & 16) == 0 ? str2 : null;
        TextStyle textStyle9 = (i3 & 32) != 0 ? te : textStyle2;
        PaddingValues paddingValues3 = (i3 & 64) != 0 ? E2 : paddingValues;
        TextStyle textStyle10 = (i3 & 128) != 0 ? iF : textStyle3;
        TextStyle textStyle11 = (i3 & 256) != 0 ? fD : textStyle4;
        TextStyle textStyle12 = (i3 & 512) != 0 ? f2678e : textStyle5;
        TextStyle textStyle13 = (i3 & 1024) != 0 ? f2678e : textStyle6;
        TextStyle textStyle14 = (i3 & 2048) != 0 ? f2677X : textStyle7;
        R7M.j jVar5 = (i3 & 4096) != 0 ? f2676T : jVar;
        R7M.j jVar6 = (i3 & 8192) != 0 ? f2676T : jVar2;
        R7M.j jVar7 = (i3 & 16384) != 0 ? f2675N : jVar3;
        this(num2, i5, str3, textStyle8, str4, textStyle9, paddingValues3, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, jVar5, jVar6, jVar7, (i3 & 32768) != 0 ? nHg : shape, (i3 & 65536) != 0 ? s7N : j2, (i3 & 131072) != 0 ? rV9 : j3, (i3 & 262144) != 0 ? wTp : j4, (i3 & 524288) != 0 ? f2680v : j5, (i3 & 1048576) != 0 ? false : z2, (i3 & 2097152) != 0 ? bzg : paddingValues2, (i3 & 4194304) != 0 ? j.f2689n : jVar4, (i3 & 8388608) != 0 ? false : z3, (i3 & 16777216) != 0 ? false : z4, null);
    }
}
