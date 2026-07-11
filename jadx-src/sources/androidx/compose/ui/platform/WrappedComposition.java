package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionServices;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.events.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R!\u0010'\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "KN", "(Lkotlin/jvm/functions/Function2;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", a.f62811a, "Z", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "fD", "()Landroidx/compose/ui/platform/AndroidComposeView;", "t", "Landroidx/compose/runtime/Composition;", "iF", "()Landroidx/compose/runtime/Composition;", "", "O", "disposed", "Landroidx/lifecycle/Lifecycle;", "J2", "Landroidx/lifecycle/Lifecycle;", "addedToLifecycle", "r", "Lkotlin/jvm/functions/Function2;", "lastContent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class WrappedComposition implements Composition, LifecycleEventObserver, CompositionServices {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Lifecycle addedToLifecycle;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView owner;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Function2 lastContent = ComposableSingletons$Wrapper_androidKt.f32895n.n();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Composition original;

    @Override // androidx.compose.runtime.Composition
    public void KN(final Function2 content) {
        this.owner.setOnViewTreeOwnersAvailable(new Function1<AndroidComposeView.ViewTreeOwners, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                n(viewTreeOwners);
                return Unit.INSTANCE;
            }

            public final void n(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                if (this.f33149n.disposed) {
                    return;
                }
                Lifecycle lifecycleRegistry = viewTreeOwners.getLifecycleOwner().getLifecycleRegistry();
                this.f33149n.lastContent = content;
                if (this.f33149n.addedToLifecycle == null) {
                    this.f33149n.addedToLifecycle = lifecycleRegistry;
                    lifecycleRegistry.n(this.f33149n);
                } else if (lifecycleRegistry.getState().rl(Lifecycle.State.f38880O)) {
                    Composition original = this.f33149n.getOriginal();
                    final WrappedComposition wrappedComposition = this.f33149n;
                    final Function2 function2 = content;
                    original.KN(ComposableLambdaKt.rl(-2000640158, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
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
                            if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                                composer.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-2000640158, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                            }
                            AndroidComposeView owner = wrappedComposition.getOwner();
                            int i3 = R.id.s7N;
                            Object tag = owner.getTag(i3);
                            Set set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = wrappedComposition.getOwner().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(i3) : null;
                                set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.fD());
                                composer.ViF();
                            }
                            AndroidComposeView owner2 = wrappedComposition.getOwner();
                            boolean zE2 = composer.E2(wrappedComposition);
                            WrappedComposition wrappedComposition2 = wrappedComposition;
                            Object objIF = composer.iF();
                            if (zE2 || objIF == Composer.INSTANCE.n()) {
                                objIF = new WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                composer.o(objIF);
                            }
                            EffectsKt.O(owner2, (Function2) objIF, composer, 0);
                            AndroidComposeView owner3 = wrappedComposition.getOwner();
                            boolean zE22 = composer.E2(wrappedComposition);
                            WrappedComposition wrappedComposition3 = wrappedComposition;
                            Object objIF2 = composer.iF();
                            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                                objIF2 = new WrappedComposition$setContent$1$1$2$1(wrappedComposition3, null);
                                composer.o(objIF2);
                            }
                            EffectsKt.O(owner3, (Function2) objIF2, composer, 0);
                            ProvidedValue providedValueNr = InspectionTablesKt.n().nr(set);
                            final WrappedComposition wrappedComposition4 = wrappedComposition;
                            final Function2 function22 = function2;
                            CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(-1193460702, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
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
                                    if (!composer2.HI((i5 & 3) != 2, i5 & 1)) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1193460702, i5, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                                    }
                                    AndroidCompositionLocals_androidKt.n(wrappedComposition4.getOwner(), function22, composer2, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer, 54), composer, ProvidedValue.xMQ | 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }));
                }
            }
        });
    }

    @Override // androidx.view.LifecycleEventObserver
    public void Z(LifecycleOwner source, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            n();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            KN(this.lastContent);
        }
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final Composition getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.runtime.Composition
    public void n() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(R.id.wTp, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.nr(this);
            }
        }
        this.original.n();
    }

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        this.owner = androidComposeView;
        this.original = composition;
    }
}
