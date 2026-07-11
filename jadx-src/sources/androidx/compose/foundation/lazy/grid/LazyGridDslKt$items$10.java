package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "it", "", c.f62177j, "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
public final class LazyGridDslKt$items$10 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function4 f18202n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Object[] f18203t;

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        n(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void n(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
        int i5;
        if ((i3 & 6) == 0) {
            i5 = (composer.p5(lazyGridItemScope) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composer.t(i2) ? 32 : 16;
        }
        if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(407562193, i5, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:616)");
        }
        this.f18202n.invoke(lazyGridItemScope, this.f18203t[i2], composer, Integer.valueOf(i5 & 14));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
