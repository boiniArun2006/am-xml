package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "", c.f62177j, "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class MovableContentKt$movableContentWithReceiverOf$1 extends Lambda implements Function3<Object, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MovableContent f30217n;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        n(obj, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Object obj, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= (i2 & 8) == 0 ? composer.p5(obj) : composer.E2(obj) ? 4 : 2;
        }
        if (!composer.HI((i2 & 19) != 18, i2 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(506997506, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:160)");
        }
        composer.WPU(this.f30217n, obj);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
