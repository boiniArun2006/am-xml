package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 {
    private final boolean HI;
    private final boolean J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f70256O;
    private final String Uo;
    private final boolean az;
    private j ck;
    private final boolean gh;
    private final String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f70257n;
    private final boolean nr;
    private final boolean qie;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f70258t;
    private final boolean ty;
    private final boolean xMQ;

    public CN3(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String prettyPrintIndent, boolean z9, boolean z10, String classDiscriminator, boolean z11, boolean z12, g9s g9sVar, boolean z13, boolean z14, boolean z15, j classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f70257n = z2;
        this.rl = z3;
        this.f70258t = z4;
        this.nr = z5;
        this.f70256O = z6;
        this.J2 = z7;
        this.Uo = prettyPrintIndent;
        this.KN = z9;
        this.xMQ = z10;
        this.mUb = classDiscriminator;
        this.gh = z11;
        this.qie = z12;
        this.az = z13;
        this.ty = z14;
        this.HI = z15;
        this.ck = classDiscriminatorMode;
    }

    public final g9s qie() {
        return null;
    }

    public final boolean HI() {
        return this.qie;
    }

    public final boolean Ik() {
        return this.f70258t;
    }

    public final j J2() {
        return this.ck;
    }

    public final boolean KN() {
        return this.az;
    }

    public final String O() {
        return this.mUb;
    }

    public final boolean Uo() {
        return this.KN;
    }

    public final boolean az() {
        return this.f70256O;
    }

    public final boolean ck() {
        return this.xMQ;
    }

    public final boolean gh() {
        return this.rl;
    }

    public final boolean mUb() {
        return this.J2;
    }

    public final boolean n() {
        return this.HI;
    }

    public final boolean nr() {
        return this.ty;
    }

    public final boolean rl() {
        return this.gh;
    }

    public final boolean t() {
        return this.nr;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f70257n + ", ignoreUnknownKeys=" + this.rl + ", isLenient=" + this.f70258t + ", allowStructuredMapKeys=" + this.nr + ", prettyPrint=" + this.f70256O + ", explicitNulls=" + this.J2 + ", prettyPrintIndent='" + this.Uo + "', coerceInputValues=" + this.KN + ", useArrayPolymorphism=" + this.xMQ + ", classDiscriminator='" + this.mUb + "', allowSpecialFloatingPointValues=" + this.gh + ", useAlternativeNames=" + this.qie + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.az + ", allowTrailingComma=" + this.ty + ", allowComments=" + this.HI + ", classDiscriminatorMode=" + this.ck + ')';
    }

    public final String ty() {
        return this.Uo;
    }

    public final boolean xMQ() {
        return this.f70257n;
    }

    public /* synthetic */ CN3(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, boolean z9, boolean z10, String str2, boolean z11, boolean z12, g9s g9sVar, boolean z13, boolean z14, boolean z15, j jVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) != 0 ? false : z5, (i2 & 16) != 0 ? false : z6, (i2 & 32) != 0 ? true : z7, (i2 & 64) != 0 ? "    " : str, (i2 & 128) != 0 ? false : z9, (i2 & 256) != 0 ? false : z10, (i2 & 512) != 0 ? "type" : str2, (i2 & 1024) != 0 ? false : z11, (i2 & 2048) == 0 ? z12 : true, (i2 & 4096) != 0 ? null : g9sVar, (i2 & 8192) != 0 ? false : z13, (i2 & 16384) != 0 ? false : z14, (i2 & 32768) != 0 ? false : z15, (i2 & 65536) != 0 ? j.f70271O : jVar);
    }
}
