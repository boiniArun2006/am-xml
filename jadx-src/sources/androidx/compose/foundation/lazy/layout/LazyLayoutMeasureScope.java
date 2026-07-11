package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u000b*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0002H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n*\u00020\u0010H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\n*\u00020\u000bH\u0017ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u0016*\u00020\u0017H\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u0082\u0001\u0001\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "Landroidx/compose/ui/layout/Placeable;", "Jk", "(IJ)Ljava/util/List;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/unit/Dp;", "Z", "(J)F", "rV9", "(I)F", "", "bzg", "(F)F", "ViF", "(F)J", "ck", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "M", "(J)J", "Ik", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScopeImpl;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,147:1\n50#2,5:148\n123#3:153\n123#3:154\n363#3:155\n33#4:156\n148#4:160\n53#5,3:157\n60#5:162\n70#5:165\n57#6:161\n61#6:164\n22#7:163\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:148,5\n74#1:153\n76#1:154\n86#1:155\n87#1:156\n94#1:160\n87#1:157,3\n95#1:162\n95#1:165\n95#1:161\n95#1:164\n95#1:163\n*E\n"})
public interface LazyLayoutMeasureScope extends MeasureScope {
    List Jk(int index, long constraints);

    @Override // androidx.compose.ui.unit.Density
    default float rV9(int i2) {
        return Dp.KN(i2 / getDensity());
    }

    @Override // androidx.compose.ui.unit.Density
    default long ViF(float f3) {
        return TextUnitKt.Uo(f3 / (getFontScale() * getDensity()));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    default float Z(long j2) {
        if (!TextUnitType.Uo(TextUnit.Uo(j2), TextUnitType.INSTANCE.rl())) {
            InlineClassHelperKt.t("Only Sp can convert to Px");
        }
        return Dp.KN(TextUnit.KN(j2) * getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    default float bzg(float f3) {
        return Dp.KN(f3 / getDensity());
    }

    @Override // androidx.compose.ui.unit.FontScaling
    default long ck(float f3) {
        return TextUnitKt.Uo(f3 / getFontScale());
    }

    @Override // androidx.compose.ui.unit.Density
    default long Ik(long j2) {
        if (j2 != 9205357640488583168L) {
            return DpKt.rl(bzg(Float.intBitsToFloat((int) (j2 >> 32))), bzg(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        }
        return DpSize.INSTANCE.n();
    }

    @Override // androidx.compose.ui.unit.Density
    default long M(long j2) {
        if (j2 != 9205357640488583168L) {
            float fL = l(DpSize.mUb(j2));
            return Size.nr((((long) Float.floatToRawIntBits(l(DpSize.xMQ(j2)))) & 4294967295L) | (Float.floatToRawIntBits(fL) << 32));
        }
        return Size.INSTANCE.n();
    }
}
