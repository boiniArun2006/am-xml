package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0098\u0001\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0012\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0015\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\u0015\u0010\u000bJK\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", JavetError.PARAMETER_COUNT, "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "Lkotlin/Function2;", "itemContent", "qie", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "J2", "xMQ", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LazyListScope {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void O(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.n(obj, obj2, function3);
    }

    static /* synthetic */ void az(LazyListScope lazyListScope, Object obj, Object obj2, Function4 function4, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.xMQ(obj, obj2, function4);
    }

    static /* synthetic */ void nr(LazyListScope lazyListScope, int i2, Function1 function1, Function1 function12, Function4 function4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i3 & 2) != 0) {
            function1 = null;
        }
        if ((i3 & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                public final Void n(int i5) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return n(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.qie(i2, function1, function12, function4);
    }

    static /* synthetic */ void t(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.J2(obj, obj2, function3);
    }

    /* synthetic */ default void J2(Object key, Object contentType, final Function3 content) {
        xMQ(key, contentType, ComposableLambdaKt.rl(-447767093, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScope$stickyHeader$1
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                n(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                if ((i3 & 6) == 0) {
                    i3 |= composer.p5(lazyItemScope) ? 4 : 2;
                }
                if (!composer.HI((i3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130, i3 & 1)) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-447767093, i3, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                }
                content.invoke(lazyItemScope, composer, Integer.valueOf(i3 & 14));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }));
    }

    default void n(Object key, Object contentType, Function3 content) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void qie(int count, Function1 key, Function1 contentType, Function4 itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void xMQ(Object key, Object contentType, final Function4 content) {
        n(key, contentType, ComposableLambdaKt.rl(628101784, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListScope$stickyHeader$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                n(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void n(LazyItemScope lazyItemScope, Composer composer, int i2) {
                if ((i2 & 6) == 0) {
                    i2 |= composer.p5(lazyItemScope) ? 4 : 2;
                }
                if (!composer.HI((i2 & 19) != 18, i2 & 1)) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(628101784, i2, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
                }
                content.invoke(lazyItemScope, 0, composer, Integer.valueOf((i2 & 14) | 48));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }));
    }
}
