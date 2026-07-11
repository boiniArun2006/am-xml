package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a0\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\r\u0010\u0010\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/foundation/IndicationNodeFactory;", "rl", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/foundation/Indication;", "nr", "(ZFJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", c.f62177j, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUseFallbackRippleImplementation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalUseFallbackRippleImplementation$annotations", "()V", "LocalUseFallbackRippleImplementation", "Landroidx/compose/material3/RippleConfiguration;", "getLocalRippleConfiguration$annotations", "LocalRippleConfiguration", "Landroidx/compose/material3/RippleNodeFactory;", "t", "Landroidx/compose/material3/RippleNodeFactory;", "DefaultBoundedRipple", "DefaultUnboundedRipple", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,370:1\n77#2:371\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material3/RippleKt\n*L\n232#1:371\n*E\n"})
public final class RippleKt {
    private static final RippleNodeFactory nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final RippleNodeFactory f27172t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f27171n = CompositionLocalKt.Uo(new Function0<Boolean>() { // from class: androidx.compose.material3.RippleKt$LocalUseFallbackRippleImplementation$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });
    private static final ProvidableCompositionLocal rl = CompositionLocalKt.O(null, new Function0<RippleConfiguration>() { // from class: androidx.compose.material3.RippleKt$LocalRippleConfiguration$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);

    static {
        Dp.Companion companion = Dp.INSTANCE;
        float fT = companion.t();
        Color.Companion companion2 = Color.INSTANCE;
        f27172t = new RippleNodeFactory(true, fT, companion2.Uo(), (DefaultConstructorMarker) null);
        nr = new RippleNodeFactory(false, companion.t(), companion2.Uo(), (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal n() {
        return rl;
    }

    public static final Indication nr(boolean z2, float f3, long j2, Composer composer, int i2, int i3) {
        Composer composer2;
        Indication indicationRl;
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i3 & 2) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        float f4 = f3;
        if ((i3 & 4) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        long j3 = j2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1315814667, i2, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        composer.eF(-1280632857);
        if (((Boolean) composer.ty(f27171n)).booleanValue()) {
            composer2 = composer;
            indicationRl = androidx.compose.material.ripple.RippleKt.J2(z3, f4, j3, composer2, i2 & 1022, 0);
        } else {
            composer2 = composer;
            indicationRl = rl(z3, f4, j3);
        }
        composer2.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return indicationRl;
    }

    public static final IndicationNodeFactory rl(boolean z2, float f3, long j2) {
        return (Dp.mUb(f3, Dp.INSTANCE.t()) && Color.HI(j2, Color.INSTANCE.Uo())) ? z2 ? f27172t : nr : new RippleNodeFactory(z2, f3, j2, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ IndicationNodeFactory t(boolean z2, float f3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        return rl(z2, f3, j2);
    }
}
