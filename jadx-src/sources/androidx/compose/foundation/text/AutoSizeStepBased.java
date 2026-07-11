package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "rl", "(Landroidx/compose/ui/text/TextLayoutResult;)Z", "t", "nr", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/unit/TextUnit;", c.f62177j, "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "minFontSize", "maxFontSize", "stepSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextAutoSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,256:1\n182#2,2:257\n182#2,2:259\n*S KotlinDebug\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n*L\n139#1:257,2\n144#1:259,2\n*E\n"})
final class AutoSizeStepBased implements TextAutoSize {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long minFontSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long maxFontSize;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long stepSize;

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || !(other instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) other;
        return TextUnit.O(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.O(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.O(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.xMQ(this.minFontSize) * 31) + TextUnit.xMQ(this.maxFontSize)) * 31) + TextUnit.xMQ(this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public long n(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j2, AnnotatedString annotatedString) {
        float fTFV = textAutoSizeLayoutScope.tFV(this.stepSize);
        float fTFV2 = textAutoSizeLayoutScope.tFV(this.minFontSize);
        float fTFV3 = textAutoSizeLayoutScope.tFV(this.maxFontSize);
        float f3 = 2;
        float f4 = (fTFV2 + fTFV3) / f3;
        float f5 = fTFV2;
        float f6 = fTFV3;
        while (f6 - f5 >= fTFV) {
            if (rl(textAutoSizeLayoutScope.Po6(j2, annotatedString, textAutoSizeLayoutScope.ViF(f4)))) {
                f6 = f4;
            } else {
                f5 = f4;
            }
            f4 = (f5 + f6) / f3;
        }
        float fFloor = fTFV2 + (((float) Math.floor((f5 - fTFV2) / fTFV)) * fTFV);
        float f7 = fTFV + fFloor;
        if (f7 <= fTFV3 && !rl(textAutoSizeLayoutScope.Po6(j2, annotatedString, textAutoSizeLayoutScope.ViF(f7)))) {
            fFloor = f7;
        }
        return textAutoSizeLayoutScope.ViF(fFloor);
    }

    private final boolean nr(TextLayoutResult textLayoutResult) {
        boolean zKN;
        int iTy = textLayoutResult.ty();
        if (iTy == 0) {
            return false;
        }
        if (iTy != 1) {
            int overflow = textLayoutResult.getLayoutInput().getOverflow();
            TextOverflow.Companion companion = TextOverflow.INSTANCE;
            if (TextOverflow.KN(overflow, companion.nr())) {
                zKN = true;
            } else {
                zKN = TextOverflow.KN(overflow, companion.t());
            }
            if (zKN) {
                return t(textLayoutResult);
            }
            if (!TextOverflow.KN(overflow, companion.rl())) {
                return false;
            }
            return textLayoutResult.fD(textLayoutResult.ty() - 1);
        }
        return textLayoutResult.fD(0);
    }

    private final boolean rl(TextLayoutResult textLayoutResult) {
        boolean zKN;
        boolean zKN2;
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        boolean zKN3 = true;
        if (TextOverflow.KN(overflow, companion.n())) {
            zKN = true;
        } else {
            zKN = TextOverflow.KN(overflow, companion.O());
        }
        if (zKN) {
            return t(textLayoutResult);
        }
        if (TextOverflow.KN(overflow, companion.nr())) {
            zKN2 = true;
        } else {
            zKN2 = TextOverflow.KN(overflow, companion.t());
        }
        if (!zKN2) {
            zKN3 = TextOverflow.KN(overflow, companion.rl());
        }
        if (zKN3) {
            return nr(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.mUb(textLayoutResult.getLayoutInput().getOverflow())) + " is not supported.");
    }

    private final boolean t(TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.Uo() && !textLayoutResult.J2()) {
            return false;
        }
        return true;
    }
}
