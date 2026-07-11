package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\t*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\t*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/widget/EdgeEffect;", "rl", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "O", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "", "nr", "(Landroid/widget/EdgeEffect;I)V", "edgeEffectLength", "Landroidx/compose/ui/unit/Density;", "density", c.f62177j, "(Landroid/widget/EdgeEffect;FFLandroidx/compose/ui/unit/Density;)F", "delta", "J2", "(Landroid/widget/EdgeEffect;F)V", "t", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EdgeEffectCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EdgeEffectCompat f16103n = new EdgeEffectCompat();

    public final void J2(EdgeEffect edgeEffect, float f3) {
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).n(f3);
        } else {
            edgeEffect.onRelease();
        }
    }

    public final float O(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.f15870n.t(edgeEffect, f3, f4);
        }
        edgeEffect.onPull(f3, f4);
        return f3;
    }

    public final void nr(EdgeEffect edgeEffect, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i2);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i2);
        }
    }

    public final EdgeEffect rl(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.f15870n.n(context, null) : new GlowEdgeEffectCompat(context);
    }

    public final float t(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.f15870n.rl(edgeEffect);
        }
        return 0.0f;
    }

    private EdgeEffectCompat() {
    }

    public final float n(EdgeEffect edgeEffect, float f3, float f4, Density density) {
        if (EdgeEffectCompat_androidKt.rl(density, f3) <= t(edgeEffect) * f4) {
            nr(edgeEffect, MathKt.roundToInt(f3));
            return f3;
        }
        return 0.0f;
    }
}
