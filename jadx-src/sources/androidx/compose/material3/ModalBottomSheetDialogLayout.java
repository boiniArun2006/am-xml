package androidx.compose.material3;

import GJW.C;
import GJW.vd;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.I28;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.ModalBottomSheetDialogLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002=>BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010\u0015J\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.RA\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u00192\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010<\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00078\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u0010(¨\u0006?"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "", "shouldDismissOnBackPress", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "LGJW/vd;", "scope", "<init>", "(Landroid/content/Context;Landroid/view/Window;ZLkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Animatable;LGJW/vd;)V", "qie", "()V", "az", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "ty", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "rl", "(Landroidx/compose/runtime/Composer;I)V", "onAttachedToWindow", "onDetachedFromWindow", "E2", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "e", "Z", "getShouldDismissOnBackPress", "()Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/jvm/functions/Function0;", "N", "Landroidx/compose/animation/core/Animatable;", "v", "LGJW/vd;", "<set-?>", "Xw", "Landroidx/compose/runtime/MutableState;", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", "jB", "Ljava/lang/Object;", "backCallback", "U", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "Api33Impl", "Api34Impl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,640:1\n81#2:641\n107#2,2:642\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheetDialogLayout\n*L\n336#1:641\n336#1:642,2\n*E\n"})
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Animatable predictiveBackProgress;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Function0 onDismissRequest;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final MutableState content;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldDismissOnBackPress;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Object backCallback;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final vd scope;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api33Impl;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "rl", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "nr", "(Landroid/view/View;Ljava/lang/Object;)V", "O", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Api33Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api33Impl f26240n = new Api33Impl();

        @JvmStatic
        @DoNotInline
        public static final void O(View view, Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
        }

        @JvmStatic
        @DoNotInline
        public static final void nr(View view, Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) backCallback);
        }

        @JvmStatic
        @DoNotInline
        public static final OnBackInvokedCallback rl(final Function0<Unit> onDismissRequest) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.Ml
                public final void onBackInvoked() {
                    ModalBottomSheetDialogLayout.Api33Impl.t(onDismissRequest);
                }
            };
        }

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(Function0 function0) {
            function0.invoke();
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogLayout$Api34Impl;", "", "<init>", "()V", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackProgress", "LGJW/vd;", "scope", "Landroid/window/OnBackAnimationCallback;", c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Animatable;LGJW/vd;)Landroid/window/OnBackAnimationCallback;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api34Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api34Impl f26241n = new Api34Impl();

        @JvmStatic
        @DoNotInline
        public static final OnBackAnimationCallback n(final Function0<Unit> onDismissRequest, final Animatable<Float, AnimationVector1D> predictiveBackProgress, final vd scope) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                public void onBackCancelled() {
                    C.nr(scope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(predictiveBackProgress, null), 3, null);
                }

                public void onBackInvoked() {
                    onDismissRequest.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    C.nr(scope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(predictiveBackProgress, backEvent, null), 3, null);
                }

                public void onBackStarted(BackEvent backEvent) {
                    C.nr(scope, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1(predictiveBackProgress, backEvent, null), 3, null);
                }
            };
        }

        private Api34Impl() {
        }
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z2, Function0 function0, Animatable animatable, vd vdVar) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z2;
        this.onDismissRequest = function0;
        this.predictiveBackProgress = animatable;
        this.scope = vdVar;
        this.content = SnapshotStateKt__SnapshotStateKt.O(ComposableSingletons$ModalBottomSheet_androidKt.f25091n.rl(), null, 2, null);
    }

    private final void az() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.O(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final Function2 getContent() {
        return (Function2) this.content.getValue();
    }

    private final void qie() {
        int i2;
        if (!this.shouldDismissOnBackPress || (i2 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = i2 >= 34 ? I28.n(Api34Impl.n(this.onDismissRequest, this.predictiveBackProgress, this.scope)) : Api33Impl.rl(this.onDismissRequest);
        }
        Api33Impl.nr(this, this.backCallback);
    }

    private final void setContent(Function2 function2) {
        this.content.setValue(function2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        qie();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        az();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void rl(Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(576708319);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(this)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(576708319, i3, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:352)");
            }
            getContent().invoke(composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    this.f26252n.rl(composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public final void ty(CompositionContext parent, Function2 content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        O();
    }
}
