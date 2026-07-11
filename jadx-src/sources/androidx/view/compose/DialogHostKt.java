package androidx.view.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.Lifecycle;
import androidx.view.NavBackStackEntry;
import androidx.view.NavDestination;
import androidx.view.compose.DialogNavigator;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "dialogNavigator", "", c.f62177j, "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V", "", "Landroidx/navigation/NavBackStackEntry;", "", "backStack", "nr", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "J2", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,137:1\n1225#2,6:138\n1225#2,6:145\n1225#2,6:152\n1225#2,6:160\n1225#2,3:168\n1228#2,3:174\n1855#3:144\n1856#3:151\n1855#3:159\n1856#3:166\n766#3:171\n857#3,2:172\n77#4:158\n77#4:167\n81#5:177\n81#5:178\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n48#1:138,6\n53#1:145,6\n74#1:152,6\n92#1:160,6\n123#1:168,3\n123#1:174,3\n50#1:144\n50#1:151\n91#1:159\n91#1:166\n126#1:171\n126#1:172,2\n90#1:158\n122#1:167\n43#1:177\n47#1:178\n*E\n"})
public final class DialogHostKt {
    public static final void n(final DialogNavigator dialogNavigator, Composer composer, final int i2) {
        Composer composerKN = composer.KN(294589392);
        int i3 = (i2 & 6) == 0 ? (composerKN.p5(dialogNavigator) ? 4 : 2) | i2 : i2;
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(294589392, i3, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            final SaveableStateHolder saveableStateHolderN = SaveableStateHolderKt.n(composerKN, 0);
            Continuation continuation = null;
            boolean z2 = true;
            State stateRl = SnapshotStateKt.rl(dialogNavigator.ty(), null, composerKN, 0, 1);
            SnapshotStateList<NavBackStackEntry> snapshotStateListJ2 = J2(rl(stateRl), composerKN, 0);
            nr(snapshotStateListJ2, rl(stateRl), composerKN, 0);
            State stateRl2 = SnapshotStateKt.rl(dialogNavigator.HI(), null, composerKN, 0, 1);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt.J2();
                composerKN.o(objIF);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objIF;
            composerKN.eF(1361037007);
            for (final NavBackStackEntry navBackStackEntry : snapshotStateListJ2) {
                NavDestination destination = navBackStackEntry.getDestination();
                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                final DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                boolean zE2 = ((i3 & 14) == 4 ? z2 : false) | composerKN.E2(navBackStackEntry);
                Object objIF2 = composerKN.iF();
                if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0<Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            dialogNavigator.az(navBackStackEntry);
                        }
                    };
                    composerKN.o(objIF2);
                }
                AndroidDialog_androidKt.n((Function0) objIF2, destination2.getDialogProperties(), ComposableLambdaKt.nr(1129586364, z2, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.xMQ()) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1129586364, i5, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
                        }
                        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                        boolean zE22 = composer2.E2(navBackStackEntry2) | composer2.p5(dialogNavigator);
                        final SnapshotStateList snapshotStateList2 = snapshotStateList;
                        final NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
                        final DialogNavigator dialogNavigator2 = dialogNavigator;
                        Object objIF3 = composer2.iF();
                        if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    snapshotStateList2.add(navBackStackEntry3);
                                    final DialogNavigator dialogNavigator3 = dialogNavigator2;
                                    final NavBackStackEntry navBackStackEntry4 = navBackStackEntry3;
                                    final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void n() {
                                            dialogNavigator3.ck(navBackStackEntry4);
                                            snapshotStateList3.remove(navBackStackEntry4);
                                        }
                                    };
                                }
                            };
                            composer2.o(objIF3);
                        }
                        EffectsKt.rl(navBackStackEntry2, (Function1) objIF3, composer2, 0);
                        final NavBackStackEntry navBackStackEntry4 = navBackStackEntry;
                        SaveableStateHolder saveableStateHolder = saveableStateHolderN;
                        final DialogNavigator.Destination destination3 = destination2;
                        NavBackStackEntryProviderKt.n(navBackStackEntry4, saveableStateHolder, ComposableLambdaKt.nr(-497631156, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-497631156, i7, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                                }
                                destination3.getCom.applovin.sdk.AppLovinEventTypes.USER_VIEWED_CONTENT java.lang.String().invoke(navBackStackEntry4, composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer2, RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                stateRl2 = stateRl2;
                continuation = continuation;
                z2 = z2;
            }
            Continuation continuation2 = continuation;
            boolean z3 = z2;
            State state = stateRl2;
            composerKN.Xw();
            Set setT = t(state);
            boolean zP5 = composerKN.p5(state) | ((i3 & 14) == 4 ? z3 : false);
            Object objIF3 = composerKN.iF();
            if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new DialogHostKt$DialogHost$2$1(state, dialogNavigator, snapshotStateList, continuation2);
                composerKN.o(objIF3);
            }
            EffectsKt.nr(setT, snapshotStateList, (Function2) objIF3, composerKN, 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    DialogHostKt.n(dialogNavigator, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SnapshotStateList J2(Collection collection, Composer composer, int i2) {
        boolean zRl;
        Object obj;
        if (ComposerKt.v()) {
            ComposerKt.p5(467378629, i2, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)");
        }
        boolean zBooleanValue = ((Boolean) composer.ty(InspectionModeKt.n())).booleanValue();
        boolean zP5 = composer.p5(collection);
        Object objIF = composer.iF();
        if (!zP5) {
            obj = objIF;
            if (objIF == Composer.INSTANCE.n()) {
                SnapshotStateList snapshotStateListJ2 = SnapshotStateKt.J2();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collection) {
                    NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                    if (zBooleanValue) {
                        zRl = true;
                    } else {
                        zRl = navBackStackEntry.getLifecycleRegistry().getState().rl(Lifecycle.State.J2);
                    }
                    if (zRl) {
                        arrayList.add(obj2);
                    }
                }
                snapshotStateListJ2.addAll(arrayList);
                composer.o(snapshotStateListJ2);
                obj = snapshotStateListJ2;
            }
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return snapshotStateList;
    }

    public static final void nr(final List list, final Collection collection, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        Composer composerKN = composer.KN(1537894851);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(list)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(collection)) {
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
                ComposerKt.p5(1537894851, i3, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            boolean zBooleanValue = ((Boolean) composerKN.ty(InspectionModeKt.n())).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                Lifecycle lifecycleRegistry = navBackStackEntry.getLifecycleRegistry();
                boolean zN = composerKN.n(zBooleanValue) | composerKN.E2(list) | composerKN.E2(navBackStackEntry);
                Object objIF = composerKN.iF();
                if (zN || objIF == Composer.INSTANCE.n()) {
                    objIF = new DialogHostKt$PopulateVisibleList$1$1$1(navBackStackEntry, zBooleanValue, list);
                    composerKN.o(objIF);
                }
                EffectsKt.rl(lifecycleRegistry, (Function1) objIF, composerKN, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$2
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
                    DialogHostKt.nr(list, collection, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    private static final List rl(State state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set t(State state) {
        return (Set) state.getValue();
    }
}
