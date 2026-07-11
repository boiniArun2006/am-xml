package androidx.compose.material3.carousel;

import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemScopeImpl;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "itemInfo", "<init>", "(Landroidx/compose/material3/carousel/CarouselItemInfo;)V", c.f62177j, "Landroidx/compose/material3/carousel/CarouselItemInfo;", "()Landroidx/compose/material3/carousel/CarouselItemInfo;", "carouselItemInfo", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarouselItemScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n77#2:100\n1223#3,6:101\n*S KotlinDebug\n*F\n+ 1 CarouselItemScope.kt\nandroidx/compose/material3/carousel/CarouselItemScopeImpl\n*L\n89#1:100\n90#1:101,6\n*E\n"})
public final class CarouselItemScopeImpl implements CarouselItemScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CarouselItemInfo itemInfo;

    /* JADX INFO: renamed from: n, reason: from getter */
    public CarouselItemInfo getItemInfo() {
        return this.itemInfo;
    }

    public CarouselItemScopeImpl(CarouselItemInfo carouselItemInfo) {
        this.itemInfo = carouselItemInfo;
    }
}
