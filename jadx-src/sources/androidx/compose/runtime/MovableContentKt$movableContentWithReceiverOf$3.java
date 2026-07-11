package androidx.compose.runtime;

import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0002H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "P1", "P2", "p1", "p2", "", c.f62177j, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class MovableContentKt$movableContentWithReceiverOf$3 extends Lambda implements Function5<Object, Object, Object, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MovableContent f30219n;

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        n(obj, obj2, obj3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Object obj, Object obj2, Object obj3, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composer.p5(obj) : composer.E2(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composer.p5(obj2) : composer.E2(obj2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= (i2 & 512) == 0 ? composer.p5(obj3) : composer.E2(obj3) ? 256 : 128;
        }
        if (!composer.HI((i3 & 1171) != 1170, i3 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(583402949, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:208)");
        }
        composer.WPU(this.f30219n, new Triple(obj, obj2, obj3));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
