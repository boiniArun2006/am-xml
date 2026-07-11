package androidx.compose.material;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/foundation/IndicationNodeFactory;", "O", "(ZFJ)Landroidx/compose/foundation/IndicationNodeFactory;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/RippleConfiguration;", c.f62177j, "Landroidx/compose/runtime/ProvidableCompositionLocal;", "nr", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalRippleConfiguration", "Landroidx/compose/material/RippleNodeFactory;", "rl", "Landroidx/compose/material/RippleNodeFactory;", "DefaultBoundedRipple", "t", "DefaultUnboundedRipple", "Landroidx/compose/material/ripple/RippleAlpha;", "Landroidx/compose/material/ripple/RippleAlpha;", "LightThemeHighContrastRippleAlpha", "LightThemeLowContrastRippleAlpha", "J2", "DarkThemeRippleAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RippleKt {
    private static final RippleAlpha J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final RippleAlpha f22600O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ProvidableCompositionLocal f22601n = CompositionLocalKt.O(null, new Function0<RippleConfiguration>() { // from class: androidx.compose.material.RippleKt$LocalRippleConfiguration$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final RippleConfiguration invoke() {
            return new RippleConfiguration(0L, null, 3, null);
        }
    }, 1, null);
    private static final RippleAlpha nr;
    private static final RippleNodeFactory rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final RippleNodeFactory f22602t;

    static {
        Dp.Companion companion = Dp.INSTANCE;
        float fT = companion.t();
        Color.Companion companion2 = Color.INSTANCE;
        rl = new RippleNodeFactory(true, fT, companion2.Uo(), (DefaultConstructorMarker) null);
        f22602t = new RippleNodeFactory(false, companion.t(), companion2.Uo(), (DefaultConstructorMarker) null);
        nr = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        f22600O = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        J2 = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static /* synthetic */ IndicationNodeFactory J2(boolean z2, float f3, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.INSTANCE.t();
        }
        if ((i2 & 4) != 0) {
            j2 = Color.INSTANCE.Uo();
        }
        return O(z2, f3, j2);
    }

    public static final IndicationNodeFactory O(boolean z2, float f3, long j2) {
        return (Dp.mUb(f3, Dp.INSTANCE.t()) && Color.HI(j2, Color.INSTANCE.Uo())) ? z2 ? rl : f22602t : new RippleNodeFactory(z2, f3, j2, (DefaultConstructorMarker) null);
    }

    public static final ProvidableCompositionLocal nr() {
        return f22601n;
    }
}
