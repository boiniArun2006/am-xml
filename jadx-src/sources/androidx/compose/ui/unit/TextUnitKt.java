package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001e\u0010\u001c\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\"\u001e\u0010\u001c\u001a\u00020\u0004*\u00020\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010 \u001a\u0004\b\u001e\u0010\u001f\"\u001e\u0010#\u001a\u00020\u0004*\u00020\u001d8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001f\"\u001e\u0010\u001c\u001a\u00020\u0004*\u00020$8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010'\u001a\u0004\b%\u0010&\"\u001e\u0010#\u001a\u00020\u0004*\u00020$8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010'\u001a\u0004\b(\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", c.f62177j, "(FJ)J", "", "unitType", "v", "mUb", "(JF)J", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "", "rl", "(J)V", "b", "t", "(JJ)V", TtmlNode.START, "stop", "fraction", "xMQ", "(JJF)J", "Uo", "(F)J", "getSp$annotations", "(F)V", "sp", "", "J2", "(D)J", "(D)V", "nr", "getEm$annotations", "em", "", "KN", "(I)J", "(I)V", "O", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,366:1\n247#1:367\n242#1,6:368\n247#1:374\n247#1:380\n247#1:391\n37#2,5:375\n37#2,5:381\n37#2,5:386\n37#2,5:392\n37#2,5:397\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n242#1:367\n253#1:368,6\n327#1:374\n332#1:380\n340#1:391\n327#1:375,5\n332#1:381,5\n335#1:386,5\n340#1:392,5\n343#1:397,5\n*E\n"})
public final class TextUnitKt {
    public static final long mUb(long j2, float f3) {
        return TextUnit.t(j2 | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public static final long n(float f3, long j2) {
        return mUb(j2, f3);
    }

    public static final void rl(long j2) {
        boolean z2;
        if (TextUnit.J2(j2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            InlineClassHelperKt.n("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void t(long j2, long j3) {
        boolean z2;
        if (TextUnit.J2(j2) == 0 || TextUnit.J2(j3) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.n("Cannot perform operation for Unspecified type.");
        }
        if (!TextUnitType.Uo(TextUnit.Uo(j2), TextUnit.Uo(j3))) {
            InlineClassHelperKt.n("Cannot perform operation for " + ((Object) TextUnitType.xMQ(TextUnit.Uo(j2))) + " and " + ((Object) TextUnitType.xMQ(TextUnit.Uo(j3))));
        }
    }

    public static final long xMQ(long j2, long j3, float f3) {
        t(j2, j3);
        return mUb(TextUnit.J2(j2), MathHelpersKt.rl(TextUnit.KN(j2), TextUnit.KN(j3), f3));
    }

    public static final long J2(double d2) {
        return mUb(4294967296L, (float) d2);
    }

    public static final long KN(int i2) {
        return mUb(4294967296L, i2);
    }

    public static final long O(int i2) {
        return mUb(8589934592L, i2);
    }

    public static final long Uo(float f3) {
        return mUb(4294967296L, f3);
    }

    public static final long nr(double d2) {
        return mUb(8589934592L, (float) d2);
    }
}
