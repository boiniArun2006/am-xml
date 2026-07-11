package androidx.view.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.NavBackStackEntry;
import androidx.view.ViewModel;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.LocalLifecycleOwnerKt;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\t\u001a\u00020\u0004*\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rl", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt\n*L\n1#1,87:1\n55#2,11:88\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/NavBackStackEntryProviderKt\n*L\n58#1:88,11\n*E\n"})
public final class NavBackStackEntryProviderKt {
    public static final void n(final NavBackStackEntry navBackStackEntry, final SaveableStateHolder saveableStateHolder, final Function2 function2, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(-1579360880);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(navBackStackEntry)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(saveableStateHolder)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1579360880, i3, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            CompositionLocalKt.t(new ProvidedValue[]{LocalViewModelStoreOwner.f39076n.nr(navBackStackEntry), LocalLifecycleOwnerKt.t().nr(navBackStackEntry), AndroidCompositionLocals_androidKt.mUb().nr(navBackStackEntry)}, ComposableLambdaKt.nr(-52928304, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    if ((i9 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-52928304, i9, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
                    }
                    NavBackStackEntryProviderKt.rl(saveableStateHolder, function2, composer2, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$LocalOwnersProvider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    NavBackStackEntryProviderKt.n(navBackStackEntry, saveableStateHolder, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final SaveableStateHolder saveableStateHolder, final Function2 function2, Composer composer, final int i2) {
        int i3;
        CreationExtras defaultViewModelCreationExtras;
        int i5;
        int i7;
        Composer composerKN = composer.KN(1211832233);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(saveableStateHolder)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1211832233, i3, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            composerKN.te(1729797275);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, 6);
            if (viewModelStoreOwnerT != null) {
                if (viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.f39070t;
                }
                ViewModel viewModelT = ViewModelKt.t(Reflection.getOrCreateKotlinClass(BackStackEntryIdViewModel.class), viewModelStoreOwnerT, null, null, defaultViewModelCreationExtras, composerKN, 0, 0);
                composerKN.M7();
                BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) viewModelT;
                backStackEntryIdViewModel.nr(new WeakReference(saveableStateHolder));
                saveableStateHolder.nr(backStackEntryIdViewModel.getId(), function2, composerKN, ((i3 << 6) & 896) | (i3 & 112));
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavBackStackEntryProviderKt$SaveableStateProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    NavBackStackEntryProviderKt.rl(saveableStateHolder, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
