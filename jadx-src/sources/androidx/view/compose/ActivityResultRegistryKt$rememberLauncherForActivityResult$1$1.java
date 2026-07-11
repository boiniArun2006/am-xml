package androidx.view.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "rl", "(Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,157:1\n64#2,5:158\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n*L\n105#1:158,5\n*E\n"})
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ActivityResultContract J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ String f13264O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ActivityResultLauncherHolder f13265n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ State f13266r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ActivityResultRegistry f13267t;

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        ActivityResultLauncherHolder activityResultLauncherHolder = this.f13265n;
        ActivityResultRegistry activityResultRegistry = this.f13267t;
        String str = this.f13264O;
        ActivityResultContract activityResultContract = this.J2;
        final State state = this.f13266r;
        activityResultLauncherHolder.rl(activityResultRegistry.qie(str, activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.compose.j
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1.t(state, obj);
            }
        }));
        final ActivityResultLauncherHolder activityResultLauncherHolder2 = this.f13265n;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void n() {
                activityResultLauncherHolder2.t();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(State state, Object obj) {
        ((Function1) state.getValue()).invoke(obj);
    }
}
