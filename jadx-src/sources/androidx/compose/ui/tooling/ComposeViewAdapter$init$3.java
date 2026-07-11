package androidx.compose.ui.tooling;

import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", c.f62177j, "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
public final class ComposeViewAdapter$init$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final /* synthetic */ String f33972O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final /* synthetic */ long f33973Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f33974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f33975o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Class f33976r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ComposeViewAdapter f33977t;

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
            ComposerKt.p5(-2046245106, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:466)");
        }
        EffectsKt.KN(this.f33974n, composer, 0);
        final ComposeViewAdapter composeViewAdapter = this.f33977t;
        final String str = this.f33972O;
        final String str2 = this.J2;
        final Class cls = this.f33976r;
        final int i3 = this.f33975o;
        final long j2 = this.f33973Z;
        composeViewAdapter.n(ComposableLambdaKt.nr(320194433, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3.1
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
                final Composer composer3;
                if (!composer2.HI((i5 & 3) != 2, i5 & 1)) {
                    composer2.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(320194433, i5, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:469)");
                }
                boolean zP5 = composer2.p5(str) | composer2.p5(str2) | composer2.E2(composer2) | composer2.E2(cls) | composer2.t(i3) | composer2.E2(composeViewAdapter);
                final String str3 = str;
                final String str4 = str2;
                final Class cls2 = cls;
                final int i7 = i3;
                final ComposeViewAdapter composeViewAdapter2 = composeViewAdapter;
                Object objIF = composer2.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    composer3 = composer2;
                    objIF = new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1$1
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
                            Throwable cause;
                            try {
                                ComposableInvoker composableInvoker = ComposableInvoker.f33936n;
                                String str5 = str3;
                                String str6 = str4;
                                Composer composer4 = composer3;
                                Object[] objArrJ2 = PreviewUtils_androidKt.J2(cls2, i7);
                                composableInvoker.Uo(str5, str6, composer4, Arrays.copyOf(objArrJ2, objArrJ2.length));
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                                    th2 = cause;
                                }
                                composeViewAdapter2.delayedException.n(th2);
                                throw th;
                            }
                        }
                    };
                    composer3.o(objIF);
                } else {
                    composer3 = composer2;
                }
                Function0 function0 = (Function0) objIF;
                if (j2 >= 0) {
                    composer3.eF(-967474306);
                    ComposeViewAdapter composeViewAdapter3 = composeViewAdapter;
                    boolean zE2 = composer3.E2(composeViewAdapter3);
                    final ComposeViewAdapter composeViewAdapter4 = composeViewAdapter;
                    Object objIF2 = composer3.iF();
                    if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$1$1
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
                                View childAt = composeViewAdapter4.getChildAt(0);
                                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                                KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
                                ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
                                if (viewRootForTest != null) {
                                    viewRootForTest.E2();
                                }
                                Snapshot.INSTANCE.ty();
                            }
                        };
                        composer3.o(objIF2);
                    }
                    composeViewAdapter3.setClock$ui_tooling_release(new PreviewAnimationClock((Function0) objIF2));
                    composer3.Xw();
                } else {
                    composer3.eF(-966247109);
                    composer3.Xw();
                }
                function0.invoke();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }, composer, 54), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }
}
