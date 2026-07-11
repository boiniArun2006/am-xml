package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", c.f62177j, "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class MovableContentKt$movableContentOf$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ MovableContent f30208n;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        n(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(Composer composer, int i2) {
        if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-642339857, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
        }
        composer.WPU(this.f30208n, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
