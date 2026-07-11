package androidx.view.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import androidx.view.NavBackStackEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "rl", "(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n64#2,5:138\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1$1\n*L\n112#1:138,5\n*E\n"})
final class DialogHostKt$PopulateVisibleList$1$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ List f40220O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ NavBackStackEntry f40221n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f40222t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogHostKt$PopulateVisibleList$1$1$1(NavBackStackEntry navBackStackEntry, boolean z2, List list) {
        super(1);
        this.f40221n = navBackStackEntry;
        this.f40222t = z2;
        this.f40220O = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(boolean z2, List list, NavBackStackEntry navBackStackEntry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (z2 && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final boolean z2 = this.f40222t;
        final List list = this.f40220O;
        final NavBackStackEntry navBackStackEntry = this.f40221n;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.j
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                DialogHostKt$PopulateVisibleList$1$1$1.t(z2, list, navBackStackEntry, lifecycleOwner, event);
            }
        };
        this.f40221n.getLifecycleRegistry().n(lifecycleEventObserver);
        final NavBackStackEntry navBackStackEntry2 = this.f40221n;
        return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void n() {
                navBackStackEntry2.getLifecycleRegistry().nr(lifecycleEventObserver);
            }
        };
    }
}
