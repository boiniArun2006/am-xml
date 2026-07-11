package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DelegatableNode;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "", c.f62177j, "(IIII)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager$currentRectInfo$1\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,547:1\n787#2:548\n787#2:549\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager$currentRectInfo$1\n*L\n147#1:548\n148#1:549\n*E\n"})
final class RectManager$currentRectInfo$1 extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ RectManager f33317O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f33318n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ DelegatableNode f33319t;

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        n(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [T, androidx.compose.ui.spatial.RelativeLayoutBounds] */
    public final void n(int i2, int i3, int i5, int i7) {
        this.f33318n.element = ThrottledCallbacksKt.n(this.f33319t, (((long) i2) << 32) | (((long) i3) & 4294967295L), (((long) i5) << 32) | (((long) i7) & 4294967295L), this.f33317O.throttledCallbacks.getWindowOffset(), this.f33317O.throttledCallbacks.getScreenOffset(), this.f33317O.throttledCallbacks.getViewToWindowMatrix());
    }
}
