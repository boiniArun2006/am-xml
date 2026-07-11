package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", "", "", "weight", "<init>", "(I)V", InneractiveMediationNameConsts.OTHER, "gh", "(Landroidx/compose/ui/text/font/FontWeight;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "I", "qie", "t", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nFontWeight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontWeight.kt\nandroidx/compose/ui/text/font/FontWeight\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,120:1\n114#2,8:121\n*S KotlinDebug\n*F\n+ 1 FontWeight.kt\nandroidx/compose/ui/text/font/FontWeight\n*L\n78#1:121,8\n*E\n"})
public final class FontWeight implements Comparable<FontWeight> {
    private static final FontWeight E2;
    private static final FontWeight J2;
    private static final FontWeight M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final FontWeight f33707N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final FontWeight f33708O;
    private static final FontWeight P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final FontWeight f33709S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final FontWeight f33710T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final FontWeight f33711U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final FontWeight f33712X;
    private static final FontWeight Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final FontWeight f33713Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final FontWeight f33714e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FontWeight f33715g;
    private static final FontWeight jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final FontWeight f33716o;
    private static final List p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final FontWeight f33717r;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final FontWeight f33719v;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int weight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/font/FontWeight$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontWeight;", "W400", "Landroidx/compose/ui/text/font/FontWeight;", "Uo", "()Landroidx/compose/ui/text/font/FontWeight;", "getW400$annotations", "W500", "KN", "getW500$annotations", "W600", "xMQ", "getW600$annotations", "Light", "t", "getLight$annotations", "Normal", "O", "getNormal$annotations", "Medium", "nr", "getMedium$annotations", "SemiBold", "J2", "getSemiBold$annotations", "Bold", c.f62177j, "getBold$annotations", "ExtraBold", "rl", "getExtraBold$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FontWeight J2() {
            return FontWeight.jB;
        }

        public final FontWeight KN() {
            return FontWeight.f33713Z;
        }

        public final FontWeight O() {
            return FontWeight.f33719v;
        }

        public final FontWeight Uo() {
            return FontWeight.f33716o;
        }

        public final FontWeight n() {
            return FontWeight.f33711U;
        }

        public final FontWeight nr() {
            return FontWeight.Xw;
        }

        public final FontWeight rl() {
            return FontWeight.P5;
        }

        public final FontWeight t() {
            return FontWeight.f33707N;
        }

        public final FontWeight xMQ() {
            return FontWeight.f33709S;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f33708O = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        J2 = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(d.f62986a);
        f33717r = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE);
        f33716o = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f33713Z = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
        f33709S = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f33715g = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        E2 = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f33714e = fontWeight9;
        f33712X = fontWeight;
        f33710T = fontWeight2;
        f33707N = fontWeight3;
        f33719v = fontWeight4;
        Xw = fontWeight5;
        jB = fontWeight6;
        f33711U = fontWeight7;
        P5 = fontWeight8;
        M7 = fontWeight9;
        p5 = CollectionsKt.listOf((Object[]) new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public int compareTo(FontWeight other) {
        return Intrinsics.compare(this.weight, other.weight);
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    public final int qie() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    public FontWeight(int i2) {
        this.weight = i2;
        boolean z2 = false;
        if (1 <= i2 && i2 < 1001) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.n("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }
}
