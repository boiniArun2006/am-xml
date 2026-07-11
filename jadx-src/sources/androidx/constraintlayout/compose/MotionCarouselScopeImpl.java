package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\rR\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aRD\u0010$\u001a$\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#Rc\u0010+\u001aC\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\rR\u00020\u000e0\f¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010%¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/constraintlayout/compose/MotionCarouselScopeImpl;", "Landroidx/constraintlayout/compose/MotionCarouselScope;", "Landroidx/constraintlayout/compose/MotionItemsProvider;", "<init>", "()V", "", "index", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "t", "(I)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "properties", "rl", "(ILandroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function2;", JavetError.PARAMETER_COUNT, "()I", "", c.f62177j, "()Z", "I", "getItemsCount", "setItemsCount", "(I)V", "itemsCount", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/jvm/functions/Function3;", "nr", "()Lkotlin/jvm/functions/Function3;", "setItemsProvider", "(Lkotlin/jvm/functions/Function3;)V", "itemsProvider", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function4;", "O", "()Lkotlin/jvm/functions/Function4;", "setItemsProviderWithProperties", "(Lkotlin/jvm/functions/Function4;)V", "itemsProviderWithProperties", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MotionCarouselScopeImpl implements MotionCarouselScope, MotionItemsProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int itemsCount;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Function3 itemsProvider;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function4 itemsProviderWithProperties;

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Function4 getItemsProviderWithProperties() {
        return this.itemsProviderWithProperties;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    /* JADX INFO: renamed from: count, reason: from getter */
    public int getItemsCount() {
        return this.itemsCount;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public boolean n() {
        return this.itemsProviderWithProperties != null;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Function3 getItemsProvider() {
        return this.itemsProvider;
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public Function2 rl(final int index, final androidx.compose.runtime.State properties) {
        return ComposableLambdaKt.rl(1612828220, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$getContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                n(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1612828220, i2, -1, "androidx.constraintlayout.compose.MotionCarouselScopeImpl.getContent.<anonymous> (MotionCarousel.kt:361)");
                }
                Function4 itemsProviderWithProperties = this.f34662n.getItemsProviderWithProperties();
                if (itemsProviderWithProperties != null) {
                    itemsProviderWithProperties.invoke(Integer.valueOf(index), properties, composer, 0);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        });
    }

    @Override // androidx.constraintlayout.compose.MotionItemsProvider
    public Function2 t(final int index) {
        return ComposableLambdaKt.rl(752436001, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionCarouselScopeImpl$getContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                n(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(752436001, i2, -1, "androidx.constraintlayout.compose.MotionCarouselScopeImpl.getContent.<anonymous> (MotionCarousel.kt:354)");
                }
                Function3 itemsProvider = this.f34659n.getItemsProvider();
                if (itemsProvider != null) {
                    itemsProvider.invoke(Integer.valueOf(index), composer, 0);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        });
    }
}
