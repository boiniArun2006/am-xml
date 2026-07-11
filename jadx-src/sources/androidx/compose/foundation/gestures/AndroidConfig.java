package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Landroid/view/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroid/view/ViewConfiguration;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEvent;", a.f62811a, "Landroidx/compose/ui/unit/IntSize;", "bounds", "Landroidx/compose/ui/geometry/Offset;", "t", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", c.f62177j, "Landroid/view/ViewConfiguration;", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,67:1\n113#2:68\n113#2:69\n269#3,3:70\n34#3,6:73\n272#3:79\n1#4:80\n65#5:81\n69#5:84\n60#6:82\n70#6:85\n53#6,3:87\n22#7:83\n30#8:86\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n41#1:68\n48#1:69\n52#1:70,3\n52#1:73,6\n52#1:79\n53#1:81\n53#1:84\n53#1:82\n53#1:85\n53#1:87,3\n53#1:83\n53#1:86\n*E\n"})
final class AndroidConfig implements ScrollConfig {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ViewConfiguration viewConfiguration;

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public long t(Density density, PointerEvent pointerEvent, long j2) {
        int i2 = Build.VERSION.SDK_INT;
        float f3 = -(i2 > 26 ? ViewConfigurationApi26Impl.f17287n.rl(this.viewConfiguration) : density.l(Dp.KN(64)));
        float f4 = -(i2 > 26 ? ViewConfigurationApi26Impl.f17287n.n(this.viewConfiguration) : density.l(Dp.KN(64)));
        List changes = pointerEvent.getChanges();
        Offset offsetNr = Offset.nr(Offset.INSTANCE.t());
        int size = changes.size();
        for (int i3 = 0; i3 < size; i3++) {
            offsetNr = Offset.nr(Offset.Ik(offsetNr.getPackedValue(), ((PointerInputChange) changes.get(i3)).getScrollDelta()));
        }
        long packedValue = offsetNr.getPackedValue();
        return Offset.O((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (packedValue >> 32)) * f4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (packedValue & 4294967295L)) * f3)) & 4294967295L));
    }

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }
}
