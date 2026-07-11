package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R+\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u00100\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(ILjava/lang/String;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "nr", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", c.f62177j, "(Landroidx/compose/ui/unit/Density;)I", "rl", "t", "Landroidx/core/view/WindowInsetsCompat;", "windowInsetsCompat", "typeMask", "", "mUb", "(Landroidx/core/view/WindowInsetsCompat;I)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "J2", "Ljava/lang/String;", "Landroidx/core/graphics/Insets;", "<set-?>", "Landroidx/compose/runtime/MutableState;", "O", "()Landroidx/core/graphics/Insets;", "KN", "(Landroidx/core/graphics/Insets;)V", "insets", "Uo", "()Z", "xMQ", "(Z)V", "isVisible", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,729:1\n85#2:730\n113#2,2:731\n85#2:733\n113#2,2:734\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n56#1:730\n56#1:731,2\n62#1:733\n62#1:734,2\n*E\n"})
public final class AndroidWindowInsets implements WindowInsets {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState insets = SnapshotStateKt__SnapshotStateKt.O(Insets.f36409O, null, 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState isVisible = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndroidWindowInsets) && this.type == ((AndroidWindowInsets) other).type;
    }

    private final void xMQ(boolean z2) {
        this.isVisible.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void KN(Insets insets) {
        this.insets.setValue(insets);
    }

    public final Insets O() {
        return (Insets) this.insets.getValue();
    }

    public final boolean Uo() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public int hashCode() {
        return this.type;
    }

    public final void mUb(WindowInsetsCompat windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            KN(windowInsetsCompat.J2(this.type));
            xMQ(windowInsetsCompat.o(this.type));
        }
    }

    public String toString() {
        return this.name + '(' + O().f36410n + ", " + O().rl + ", " + O().f36411t + ", " + O().nr + ')';
    }

    public AndroidWindowInsets(int i2, String str) {
        this.type = i2;
        this.name = str;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int n(Density density) {
        return O().rl;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int nr(Density density, LayoutDirection layoutDirection) {
        return O().f36410n;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int rl(Density density, LayoutDirection layoutDirection) {
        return O().f36411t;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int t(Density density) {
        return O().nr;
    }
}
