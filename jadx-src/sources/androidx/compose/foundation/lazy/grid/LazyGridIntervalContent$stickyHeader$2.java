package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", c.f62177j, "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
final class LazyGridIntervalContent$stickyHeader$2 extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function4 f18252n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f18253t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
        n(lazyGridItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void n(LazyGridItemScope lazyGridItemScope, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.p5(lazyGridItemScope) ? 4 : 2;
        }
        if (!composer.HI((i2 & 19) != 18, i2 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(2045010142, i2, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.stickyHeader.<anonymous> (LazyGridIntervalContent.kt:88)");
        }
        this.f18252n.invoke(lazyGridItemScope, Integer.valueOf(this.f18253t), composer, Integer.valueOf(i2 & 14));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
