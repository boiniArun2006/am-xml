package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "index", "", c.f62177j, "(ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
public final class MotionCarouselKt$items$1 extends Lambda implements Function3<Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Function3 f34652n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ List f34653t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Composer composer, Integer num2) {
        n(num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void n(int i2, Composer composer, int i3) {
        if ((i3 & 6) == 0) {
            i3 |= composer.t(i2) ? 4 : 2;
        }
        if ((i3 & 19) == 18 && composer.xMQ()) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(85623574, i3, -1, "androidx.constraintlayout.compose.items.<anonymous> (MotionCarousel.kt:278)");
        }
        this.f34652n.invoke(this.f34653t.get(i2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
