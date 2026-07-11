package androidx.compose.material3.carousel;

import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aK\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/unit/Density;", "density", "", "carouselMainAxisSize", "preferredItemSize", "itemSpacing", "", "itemCount", "minSmallItemSize", "maxSmallItemSize", "Landroidx/compose/material3/carousel/KeylineList;", "t", "(Landroidx/compose/ui/unit/Density;FFFIFF)Landroidx/compose/material3/carousel/KeylineList;", "leftAnchorSize", "rightAnchorSize", "Landroidx/compose/material3/carousel/Arrangement;", "arrangement", "rl", "(FFFFLandroidx/compose/material3/carousel/Arrangement;)Landroidx/compose/material3/carousel/KeylineList;", "itemSize", "nr", "(Landroidx/compose/ui/unit/Density;FFF)Landroidx/compose/material3/carousel/KeylineList;", "minimumMediumSize", "largeItemSize", "remainingSpace", c.f62177j, "(FFF)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeylines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keylines.kt\nandroidx/compose/material3/carousel/KeylinesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
public final class KeylinesKt {
    public static final KeylineList nr(Density density, float f3, float f4, float f5) {
        if (f3 == 0.0f || f4 == 0.0f) {
            return KeylineListKt.n();
        }
        float fMin = Math.min(f4 + f5, f3);
        int iMax = Math.max(1, (int) Math.floor(f3 / fMin));
        float f6 = f3 - (iMax * fMin);
        int i2 = f6 <= 0.0f ? 0 : 1;
        float fL = density.l(CarouselDefaults.f28872n.n());
        float fN = n(fL, fMin, f6);
        return rl(f3, f5, Math.max(Math.min(fL, f4), fN * 0.5f), fL, new Arrangement(0, 0.0f, 0, fN, i2, fMin, iMax));
    }

    private static final float n(float f3, float f4, float f5) {
        float fMax = Math.max(1.5f * f5, f3);
        float f6 = f4 * 0.85f;
        return fMax > f6 ? Math.max(f6, f5 * 1.2f) : fMax;
    }

    public static final KeylineList rl(float f3, float f4, final float f5, final float f6, final Arrangement arrangement) {
        return KeylineListKt.t(f3, f4, CarouselAlignment.INSTANCE.t(), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.KeylinesKt$createLeftAlignedKeylineList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                n(keylineListScope);
                return Unit.INSTANCE;
            }

            public final void n(KeylineListScope keylineListScope) {
                keylineListScope.rl(f5, true);
                int largeCount = arrangement.getLargeCount();
                Arrangement arrangement2 = arrangement;
                for (int i2 = 0; i2 < largeCount; i2++) {
                    KeylineListScope.n(keylineListScope, arrangement2.getLargeSize(), false, 2, null);
                }
                int mediumCount = arrangement.getMediumCount();
                Arrangement arrangement3 = arrangement;
                for (int i3 = 0; i3 < mediumCount; i3++) {
                    KeylineListScope.n(keylineListScope, arrangement3.getMediumSize(), false, 2, null);
                }
                int smallCount = arrangement.getSmallCount();
                Arrangement arrangement4 = arrangement;
                for (int i5 = 0; i5 < smallCount; i5++) {
                    KeylineListScope.n(keylineListScope, arrangement4.getSmallSize(), false, 2, null);
                }
                keylineListScope.rl(f6, true);
            }
        });
    }

    public static final KeylineList t(Density density, float f3, float f4, float f5, int i2, float f6, float f7) {
        float f8;
        if (f3 == 0.0f || f4 == 0.0f) {
            return KeylineListKt.n();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float fMin = Math.min(f4, f3);
        float fCoerceIn = RangesKt.coerceIn(fMin / 3.0f, f6, f7);
        float f9 = (fMin + fCoerceIn) / 2.0f;
        if (f3 < 2 * f6) {
            iArr = new int[]{0};
        }
        int[] iArr3 = iArr;
        int iCeil = (int) Math.ceil(f3 / fMin);
        int iMax = (iCeil - Math.max(1, (int) Math.floor(((f3 - (ArraysKt.maxOrThrow(iArr2) * f9)) - (ArraysKt.maxOrThrow(iArr3) * f7)) / fMin))) + 1;
        int[] iArr4 = new int[iMax];
        for (int i3 = 0; i3 < iMax; i3++) {
            iArr4[i3] = iCeil - i3;
        }
        float fL = density.l(CarouselDefaults.f28872n.n());
        Arrangement arrangementRl = Arrangement.INSTANCE.rl(f3, f5, fCoerceIn, f6, f7, iArr3, f9, iArr2, fMin, iArr4);
        if (arrangementRl == null || arrangementRl.mUb() <= i2) {
            f8 = f3;
        } else {
            int smallCount = arrangementRl.getSmallCount();
            int mediumCount = arrangementRl.getMediumCount();
            for (int iMUb = arrangementRl.mUb() - i2; iMUb > 0; iMUb--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f8 = f3;
            arrangementRl = Arrangement.INSTANCE.rl(f8, f5, fCoerceIn, f6, f7, new int[]{smallCount}, f9, new int[]{mediumCount}, fMin, iArr4);
        }
        return arrangementRl == null ? KeylineListKt.n() : rl(f8, f5, fL, fL, arrangementRl);
    }
}
