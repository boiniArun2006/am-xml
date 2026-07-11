package r;

import GJW.vd;
import GJW.yg;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.LifecycleOwner;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR6\u0010'\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065²\u0006\u000e\u00104\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"Lr/UGc;", "Landroidx/fragment/app/Fragment;", "Lyc/DAz;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "g", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "", "onBackPressed", "()Z", "", "Lr/n;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/util/List;", "nHg", "()Ljava/util/List;", "v", "(Ljava/util/List;)V", "inputFieldInfoList", "Lkotlin/Function1;", "", "t", "Lkotlin/jvm/functions/Function1;", "wTp", "()Lkotlin/jvm/functions/Function1;", "bzg", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "O", "s7N", "rV9", "onDismiss", "Landroidx/compose/ui/geometry/Rect;", "J2", "Landroidx/compose/ui/geometry/Rect;", "getPreviewRect", "()Landroidx/compose/ui/geometry/Rect;", "Xw", "(Landroidx/compose/ui/geometry/Rect;)V", "previewRect", "keypadVisible", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNumericKeypadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumericKeypadFragment.kt\ncom/alightcreative/app/motion/numerickeypad/NumericKeypadFragment\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,134:1\n557#2:135\n554#2,6:136\n1247#3,3:142\n1250#3,3:146\n1247#3,6:149\n1247#3,6:191\n1247#3,6:245\n1247#3,6:251\n1247#3,6:261\n555#4:145\n70#5:155\n68#5,8:156\n77#5:260\n79#6,6:164\n86#6,3:179\n89#6,2:188\n79#6,6:207\n86#6,3:222\n89#6,2:231\n93#6:243\n93#6:259\n347#7,9:170\n356#7:190\n347#7,9:213\n356#7:233\n357#7,2:241\n357#7,2:257\n4206#8,6:182\n4206#8,6:225\n87#9:197\n84#9,9:198\n94#9:244\n61#10:234\n61#10:237\n123#11:235\n123#11:238\n75#12:236\n75#12:239\n75#12:240\n85#13:267\n113#13,2:268\n*S KotlinDebug\n*F\n+ 1 NumericKeypadFragment.kt\ncom/alightcreative/app/motion/numerickeypad/NumericKeypadFragment\n*L\n62#1:135\n62#1:136,6\n62#1:142,3\n62#1:146,3\n64#1:149,6\n74#1:191,6\n98#1:245,6\n104#1:251,6\n125#1:261,6\n62#1:145\n67#1:155\n67#1:156,8\n67#1:260\n67#1:164,6\n67#1:179,3\n67#1:188,2\n72#1:207,6\n72#1:222,3\n72#1:231,2\n72#1:243\n67#1:259\n67#1:170,9\n67#1:190\n72#1:213,9\n72#1:233\n72#1:241,2\n67#1:257,2\n67#1:182,6\n72#1:225,6\n72#1:197\n72#1:198,9\n72#1:244\n84#1:234\n87#1:237\n86#1:235\n87#1:238\n86#1:236\n88#1:239\n90#1:240\n64#1:267\n64#1:268,2\n*E\n"})
public final class UGc extends Fragment implements yc.DAz {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function1 onDismiss;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Function1 onValueChange;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List inputFieldInfoList = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Rect previewRect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComposeView f72660t;

        Ml(ComposeView composeView) {
            this.f72660t = composeView;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(766888523, i2, -1, "com.alightcreative.app.motion.numerickeypad.NumericKeypadFragment.onCreateView.<anonymous>.<anonymous> (NumericKeypadFragment.kt:54)");
            }
            UGc uGc = UGc.this;
            Context context = this.f72660t.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uGc.g(context, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f72661O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72662n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f72661O = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return UGc.this.new j(this.f72661O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72662n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                UGc.X(this.f72661O, !UGc.e(r4));
                this.f72662n = 1;
                if (yg.rl(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Function1 onDismiss = UGc.this.getOnDismiss();
            if (onDismiss != null) {
                onDismiss.invoke(Boxing.boxBoolean(false));
            }
            UGc.this.getParentFragmentManager().Zmq();
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MutableState f72664O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ vd f72666t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f72667O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f72668n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ UGc f72669t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(UGc uGc, boolean z2, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f72669t = uGc;
                this.f72667O = z2;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f72669t, this.f72667O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f72668n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    UGc.X(this.J2, false);
                    this.f72668n = 1;
                    if (yg.rl(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Function1 onDismiss = this.f72669t.getOnDismiss();
                if (onDismiss != null) {
                    onDismiss.invoke(Boxing.boxBoolean(this.f72667O));
                }
                this.f72669t.getParentFragmentManager().Zmq();
                return Unit.INSTANCE;
            }
        }

        n(vd vdVar, MutableState mutableState) {
            this.f72666t = vdVar;
            this.f72664O = mutableState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(vd vdVar, UGc uGc, MutableState mutableState, boolean z2) {
            GJW.C.nr(vdVar, null, null, new j(uGc, z2, mutableState, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(UGc uGc, List it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Function1 onValueChange = uGc.getOnValueChange();
            if (onValueChange != null) {
                onValueChange.invoke(it);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void t(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(1366035022, i2, -1, "com.alightcreative.app.motion.numerickeypad.NumericKeypadFragment.MainContent.<anonymous>.<anonymous> (NumericKeypadFragment.kt:108)");
            }
            List inputFieldInfoList = UGc.this.getInputFieldInfoList();
            composer.eF(733607311);
            boolean zE2 = composer.E2(UGc.this);
            final UGc uGc = UGc.this;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: r.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UGc.n.nr(uGc, (List) obj);
                    }
                };
                composer.o(objIF);
            }
            Function1 function1 = (Function1) objIF;
            composer.Xw();
            composer.eF(733610954);
            boolean zE22 = composer.E2(this.f72666t) | composer.E2(UGc.this);
            final vd vdVar = this.f72666t;
            final UGc uGc2 = UGc.this;
            final MutableState mutableState = this.f72664O;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: r.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UGc.n.O(vdVar, uGc2, mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            qf.rl(inputFieldInfoList, function1, (Function1) objIF2, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72670n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f72671t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.f72671t = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f72671t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72670n == 0) {
                ResultKt.throwOnFailure(obj);
                UGc.X(this.f72671t, true);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int fD(int i2) {
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int te(int i2) {
        return i2;
    }

    public final void g(final Context context, Composer composer, final int i2) {
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(context, "context");
        Composer composerKN = composer.KN(-247760532);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(context) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-247760532, i3, -1, "com.alightcreative.app.motion.numerickeypad.NumericKeypadFragment.MainContent (NumericKeypadFragment.kt:60)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            final vd vdVar = (vd) objIF;
            composerKN.eF(-1503960738);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState = (MutableState) objIF2;
            composerKN.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.rl(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            composerKN.eF(-1782035699);
            boolean zE2 = composerKN.E2(vdVar) | composerKN.E2(this);
            Object objIF3 = composerKN.iF();
            if (zE2 || objIF3 == companion.n()) {
                objIF3 = new Function0() { // from class: r.QJ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UGc.iF(vdVar, this, mutableState);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            Modifier modifierJ22 = SizeKt.J2(ClickableKt.J2(companion2, false, null, null, (Function0) objIF3, 7, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion3.gh(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ22);
            Function0 function0N2 = companion4.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyN, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Rect rect = this.previewRect;
            if (rect.xMQ() - rect.getTop() == 0.0f) {
                composerKN.eF(1266129572);
                BoxKt.n(BackgroundKt.nr(SizeKt.J2(companion2, 0.0f, 1, null), ((aF1.j) composerKN.ty(aF1.w6.t())).t(), null, 2, null), composerKN, 0);
                composerKN.Xw();
                i5 = 0;
            } else {
                composerKN.eF(1265614414);
                float f3 = context.getResources().getDisplayMetrics().density;
                BoxKt.n(BackgroundKt.nr(SizeKt.KN(SizeKt.xMQ(companion2, Dp.KN(this.previewRect.getTop() / f3)), 0.0f, 1, null), ((aF1.j) composerKN.ty(aF1.w6.t())).t(), null, 2, null), composerKN, 0);
                Rect rect2 = this.previewRect;
                Modifier modifierNr = BackgroundKt.nr(SizeKt.KN(SizeKt.xMQ(companion2, Dp.KN((rect2.xMQ() - rect2.getTop()) / f3)), 0.0f, 1, null), Color.INSTANCE.J2(), null, 2, null);
                i5 = 0;
                BoxKt.n(modifierNr, composerKN, 0);
                BoxKt.n(BackgroundKt.nr(SizeKt.KN(SizeKt.nr(companion2, 0.0f, 1, null), 0.0f, 1, null), ((aF1.j) composerKN.ty(aF1.w6.t())).t(), null, 2, null), composerKN, 0);
                composerKN.Xw();
            }
            composerKN.XQ();
            boolean zE = e(mutableState);
            Modifier modifierN = boxScopeInstance.n(companion2, companion3.rl());
            TweenSpec tweenSpecTy = AnimationSpecKt.ty(180, i5, null, 6, null);
            composerKN.eF(-1781988998);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = new Function1() { // from class: r.l3D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(UGc.fD(((Integer) obj).intValue()));
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            EnterTransition enterTransitionIF = EnterExitTransitionKt.iF(tweenSpecTy, (Function1) objIF4);
            TweenSpec tweenSpecTy2 = AnimationSpecKt.ty(180, 0, null, 6, null);
            composerKN.eF(-1781982086);
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
                objIF5 = new Function1() { // from class: r.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(UGc.te(((Integer) obj).intValue()));
                    }
                };
                composerKN.o(objIF5);
            }
            composerKN.Xw();
            AnimatedVisibilityKt.mUb(zE, modifierN, enterTransitionIF, EnterExitTransitionKt.T(tweenSpecTy2, (Function1) objIF5), null, ComposableLambdaKt.nr(1366035022, true, new n(vdVar, mutableState), composerKN, 54), composerKN, 200064, 16);
            composerKN.XQ();
            Unit unit = Unit.INSTANCE;
            composerKN.eF(-1503876364);
            Object objIF6 = composerKN.iF();
            if (objIF6 == companion.n()) {
                objIF6 = new w6(mutableState, null);
                composerKN.o(objIF6);
            }
            composerKN.Xw();
            EffectsKt.O(unit, (Function2) objIF6, composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: r.s4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UGc.E2(this.f72718n, context, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // yc.DAz
    public boolean onBackPressed() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(UGc uGc, Context context, int i2, Composer composer, int i3) {
        uGc.g(context, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(vd vdVar, UGc uGc, MutableState mutableState) {
        GJW.C.nr(vdVar, null, null, uGc.new j(mutableState, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void Xw(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.previewRect = rect;
    }

    public final void bzg(Function1 function1) {
        this.onValueChange = function1;
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final List getInputFieldInfoList() {
        return this.inputFieldInfoList;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.DisposeOnLifecycleDestroyed(viewLifecycleOwner));
        composeView.setContent(ComposableLambdaKt.rl(766888523, true, new Ml(composeView)));
        return composeView;
    }

    public final void rV9(Function1 function1) {
        this.onDismiss = function1;
    }

    /* JADX INFO: renamed from: s7N, reason: from getter */
    public final Function1 getOnDismiss() {
        return this.onDismiss;
    }

    public final void v(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.inputFieldInfoList = list;
    }

    /* JADX INFO: renamed from: wTp, reason: from getter */
    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
