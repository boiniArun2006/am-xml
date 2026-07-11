package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "rl", "(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAccessibilityServiceStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt$ObserveState$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,183:1\n64#2,5:184\n*S KotlinDebug\n*F\n+ 1 AccessibilityServiceStateProvider.android.kt\nandroidx/compose/material3/internal/AccessibilityServiceStateProvider_androidKt$ObserveState$3$1\n*L\n79#1:184,5\n*E\n"})
final class AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Function0 f28981O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ LifecycleOwner f28982n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function1 f28983t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(LifecycleOwner lifecycleOwner, Function1 function1, Function0 function0) {
        super(1);
        this.f28982n = lifecycleOwner;
        this.f28983t = function1;
        this.f28981O = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        final Function1 function1 = this.f28983t;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.material3.internal.j
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AccessibilityServiceStateProvider_androidKt$ObserveState$3$1.t(function1, lifecycleOwner, event);
            }
        };
        this.f28982n.getLifecycle().n(lifecycleEventObserver);
        final Function0 function0 = this.f28981O;
        final LifecycleOwner lifecycleOwner = this.f28982n;
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void n() {
                function0.invoke();
                lifecycleOwner.getLifecycle().nr(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Function1 function1, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        function1.invoke(event);
    }
}
