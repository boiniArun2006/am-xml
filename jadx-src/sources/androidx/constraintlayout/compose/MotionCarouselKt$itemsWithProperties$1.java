package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.compose.MotionLayoutScope;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u0003H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "index", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "properties", "", c.f62177j, "(ILandroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
public final class MotionCarouselKt$itemsWithProperties$1 extends Lambda implements Function4<Integer, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function4 f34654n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ List f34655t;

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties> state, Composer composer, Integer num2) {
        n(num.intValue(), state, composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void n(int i2, androidx.compose.runtime.State state, Composer composer, int i3) {
        int i5;
        if ((i3 & 6) == 0) {
            i5 = (composer.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composer.p5(state) ? 32 : 16;
        }
        if ((i5 & 147) == 146 && composer.xMQ()) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1304172608, i5, -1, "androidx.constraintlayout.compose.itemsWithProperties.<anonymous> (MotionCarousel.kt:302)");
        }
        this.f34654n.invoke(this.f34655t.get(i2), state, composer, Integer.valueOf(i5 & 112));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
