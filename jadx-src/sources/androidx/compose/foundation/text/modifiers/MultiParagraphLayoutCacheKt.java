package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", InneractiveMediationNameConsts.OTHER, "rl", "(JJ)J", c.f62177j, "J", "DefaultFontSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,491:1\n247#2:492\n142#3,2:493\n142#3,2:495\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCacheKt\n*L\n479#1:492\n482#1:493,2\n484#1:495,2\n*E\n"})
public final class MultiParagraphLayoutCacheKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f20609n = TextUnitKt.KN(14);

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rl(long j2, long j3) {
        if (TextUnit.mUb(j3)) {
            if (!TextUnit.mUb(j2)) {
                if (TextUnit.J2(j2) == 0) {
                    long j4 = f20609n;
                    float fKN = TextUnit.KN(j3);
                    TextUnitKt.rl(j4);
                    return TextUnitKt.mUb(TextUnit.J2(j4), TextUnit.KN(j4) * fKN);
                }
                float fKN2 = TextUnit.KN(j3);
                TextUnitKt.rl(j2);
                return TextUnitKt.mUb(TextUnit.J2(j2), TextUnit.KN(j2) * fKN2);
            }
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.gh(j3)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.gh(j3)) + '.');
    }
}
