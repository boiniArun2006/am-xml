package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¬\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001b\b\u0002\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001¢\u0006\u0002\b\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\f*\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "O", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "", "sdkVersion", "t", "(I)Z", InneractiveMediationNameConsts.OTHER, c.f62177j, "(FF)Z", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "rl", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "MagnifierPositionInRoot", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Magnifier_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SemanticsPropertyKey f16192n = new SemanticsPropertyKey("MagnifierPositionInRoot", null, 2, null);

    public static final Modifier O(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f3, boolean z2, long j2, float f4, float f5, boolean z3, PlatformMagnifierFactory platformMagnifierFactory) {
        if (nr(0, 1, null)) {
            return modifier.Zmq(new MagnifierElement(function1, function12, function13, f3, z2, j2, f4, f5, z3, platformMagnifierFactory == null ? PlatformMagnifierFactory.INSTANCE.n() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    public static final boolean t(int i2) {
        return i2 >= 28;
    }

    public static /* synthetic */ Modifier J2(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, float f3, boolean z2, long j2, float f4, float f5, boolean z3, PlatformMagnifierFactory platformMagnifierFactory, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function12 = null;
        }
        if ((i2 & 4) != 0) {
            function13 = null;
        }
        if ((i2 & 8) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            j2 = DpSize.INSTANCE.n();
        }
        if ((i2 & 64) != 0) {
            f4 = Dp.INSTANCE.t();
        }
        if ((i2 & 128) != 0) {
            f5 = Dp.INSTANCE.t();
        }
        if ((i2 & 256) != 0) {
            z3 = true;
        }
        if ((i2 & 512) != 0) {
            platformMagnifierFactory = null;
        }
        return O(modifier, function1, function12, function13, f3, z2, j2, f4, f5, z3, platformMagnifierFactory);
    }

    public static /* synthetic */ boolean nr(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Build.VERSION.SDK_INT;
        }
        return t(i2);
    }

    public static final SemanticsPropertyKey rl() {
        return f16192n;
    }

    public static final boolean n(float f3, float f4) {
        if ((Float.isNaN(f3) && Float.isNaN(f4)) || f3 == f4) {
            return true;
        }
        return false;
    }
}
