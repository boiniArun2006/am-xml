package androidx.compose.material3.carousel;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR+\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\r\u0010\u0017\"\u0004\b\u0011\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "<init>", "()V", "", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableFloatState;", "getSizeState", "()F", "J2", "(F)V", "sizeState", "rl", "getMinSizeState", "O", "minSizeState", "t", "getMaxSizeState", "nr", "maxSizeState", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;)V", "maskRectState", "maskRect", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarouselState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselItemInfoImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,163:1\n76#2:164\n109#2,2:165\n76#2:167\n109#2,2:168\n76#2:170\n109#2,2:171\n81#3:173\n107#3,2:174\n*S KotlinDebug\n*F\n+ 1 CarouselState.kt\nandroidx/compose/material3/carousel/CarouselItemInfoImpl\n*L\n146#1:164\n146#1:165,2\n147#1:167\n147#1:168,2\n148#1:170\n148#1:171,2\n149#1:173\n149#1:174,2\n*E\n"})
public final class CarouselItemInfoImpl implements CarouselItemInfo {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState sizeState = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableFloatState minSizeState = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState maxSizeState = PrimitiveSnapshotStateKt.n(0.0f);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState maskRectState = SnapshotStateKt__SnapshotStateKt.O(Rect.INSTANCE.n(), null, 2, null);

    public final void J2(float f3) {
        this.sizeState.Z(f3);
    }

    public final void O(float f3) {
        this.minSizeState.Z(f3);
    }

    public final void nr(float f3) {
        this.maxSizeState.Z(f3);
    }

    public final Rect rl() {
        return (Rect) this.maskRectState.getValue();
    }

    public final void t(Rect rect) {
        this.maskRectState.setValue(rect);
    }

    @Override // androidx.compose.material3.carousel.CarouselItemInfo
    public Rect n() {
        return rl();
    }
}
