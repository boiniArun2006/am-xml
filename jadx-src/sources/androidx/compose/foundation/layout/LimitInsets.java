package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/LimitInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "sides", "<init>", "(Landroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "nr", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", c.f62177j, "(Landroidx/compose/ui/unit/Density;)I", "rl", "t", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/layout/WindowInsets;", "getInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "I", "getSides-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LimitInsets implements WindowInsets {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final WindowInsets insets;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowInsets, i2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) other;
        return Intrinsics.areEqual(this.insets, limitInsets.insets) && WindowInsetsSides.HI(this.sides, limitInsets.sides);
    }

    private LimitInsets(WindowInsets windowInsets, int i2) {
        this.insets = windowInsets;
        this.sides = i2;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.Ik(this.sides);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int n(Density density) {
        if (WindowInsetsSides.ck(this.sides, WindowInsetsSides.INSTANCE.gh())) {
            return this.insets.n(density);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int nr(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.ck(this.sides, layoutDirection == LayoutDirection.f34160n ? WindowInsetsSides.INSTANCE.n() : WindowInsetsSides.INSTANCE.rl())) {
            return this.insets.nr(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int rl(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.ck(this.sides, layoutDirection == LayoutDirection.f34160n ? WindowInsetsSides.INSTANCE.t() : WindowInsetsSides.INSTANCE.nr())) {
            return this.insets.rl(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int t(Density density) {
        if (WindowInsetsSides.ck(this.sides, WindowInsetsSides.INSTANCE.O())) {
            return this.insets.t(density);
        }
        return 0;
    }

    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.o(this.sides)) + ')';
    }
}
