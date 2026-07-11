package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b(\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b*\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b,\u0010!R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b-\u0010!R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b.\u0010!¨\u0006/"}, d2 = {"Landroidx/compose/material3/Typography;", "", "Landroidx/compose/ui/text/TextStyle;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "<init>", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/ui/text/TextStyle;", "nr", "()Landroidx/compose/ui/text/TextStyle;", "rl", "O", "t", "J2", "Uo", "KN", "xMQ", "az", "ty", "HI", "mUb", "gh", "qie", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Typography {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata and from toString */
    private final TextStyle labelSmall;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final TextStyle headlineSmall;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final TextStyle titleMedium;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineMedium;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final TextStyle titleLarge;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata and from toString */
    private final TextStyle labelLarge;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata and from toString */
    private final TextStyle bodyMedium;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata and from toString */
    private final TextStyle bodyLarge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle displayLarge;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final TextStyle headlineLarge;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata and from toString */
    private final TextStyle bodySmall;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final TextStyle displayMedium;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final TextStyle displaySmall;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata and from toString */
    private final TextStyle labelMedium;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final TextStyle titleSmall;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return Intrinsics.areEqual(this.displayLarge, typography.displayLarge) && Intrinsics.areEqual(this.displayMedium, typography.displayMedium) && Intrinsics.areEqual(this.displaySmall, typography.displaySmall) && Intrinsics.areEqual(this.headlineLarge, typography.headlineLarge) && Intrinsics.areEqual(this.headlineMedium, typography.headlineMedium) && Intrinsics.areEqual(this.headlineSmall, typography.headlineSmall) && Intrinsics.areEqual(this.titleLarge, typography.titleLarge) && Intrinsics.areEqual(this.titleMedium, typography.titleMedium) && Intrinsics.areEqual(this.titleSmall, typography.titleSmall) && Intrinsics.areEqual(this.bodyLarge, typography.bodyLarge) && Intrinsics.areEqual(this.bodyMedium, typography.bodyMedium) && Intrinsics.areEqual(this.bodySmall, typography.bodySmall) && Intrinsics.areEqual(this.labelLarge, typography.labelLarge) && Intrinsics.areEqual(this.labelMedium, typography.labelMedium) && Intrinsics.areEqual(this.labelSmall, typography.labelSmall);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ')';
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TypographyTokens.f30031n.nr() : textStyle, (i2 & 2) != 0 ? TypographyTokens.f30031n.O() : textStyle2, (i2 & 4) != 0 ? TypographyTokens.f30031n.J2() : textStyle3, (i2 & 8) != 0 ? TypographyTokens.f30031n.Uo() : textStyle4, (i2 & 16) != 0 ? TypographyTokens.f30031n.KN() : textStyle5, (i2 & 32) != 0 ? TypographyTokens.f30031n.xMQ() : textStyle6, (i2 & 64) != 0 ? TypographyTokens.f30031n.az() : textStyle7, (i2 & 128) != 0 ? TypographyTokens.f30031n.ty() : textStyle8, (i2 & 256) != 0 ? TypographyTokens.f30031n.HI() : textStyle9, (i2 & 512) != 0 ? TypographyTokens.f30031n.n() : textStyle10, (i2 & 1024) != 0 ? TypographyTokens.f30031n.rl() : textStyle11, (i2 & 2048) != 0 ? TypographyTokens.f30031n.t() : textStyle12, (i2 & 4096) != 0 ? TypographyTokens.f30031n.mUb() : textStyle13, (i2 & 8192) != 0 ? TypographyTokens.f30031n.gh() : textStyle14, (i2 & 16384) != 0 ? TypographyTokens.f30031n.qie() : textStyle15);
    }
}
