package UX1;

import GJW.vd;
import LRV.fuX;
import LRV.j;
import TFv.Z;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import com.bendingspoons.secretmenu.ui.items.exit.ExitActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f10773O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10774n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ fuX f10775t;

        /* JADX INFO: renamed from: UX1.Wre$j$j, reason: collision with other inner class name */
        static final class C0379j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Context f10776n;

            C0379j(Context context) {
                this.f10776n = context;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(fuX.n nVar, Continuation continuation) {
                if (!Intrinsics.areEqual(nVar, fuX.n.j.f6113n)) {
                    throw new NoWhenBranchMatchedException();
                }
                Toast.makeText(this.f10776n, "Endpoint updated! Re-open the app.", 0).show();
                ExitActivity.INSTANCE.n(this.f10776n);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(fuX fux, Context context, Continuation continuation) {
            super(2, continuation);
            this.f10775t = fux;
            this.f10773O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f10775t, this.f10773O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10774n;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Z zMUb = this.f10775t.mUb();
                C0379j c0379j = new C0379j(this.f10773O);
                this.f10774n = 1;
                if (zMUb.n(c0379j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Map map, Function0 function0, boolean z2, Function2 function2, int i2, int i3, Composer composer, int i5) {
        t(map, function0, z2, function2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(fuX fux, LRV.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fux.az(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6 A[LOOP:0: B:60:0x00d0->B:62:0x00d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Map endpoints, final Function0 datastoreProvider, boolean z2, Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        final boolean z3;
        int i7;
        Function2 function22;
        ViewModelStoreOwner viewModelStoreOwnerT;
        Function2 function23;
        fuX fux;
        Continuation continuation;
        final Function2 function24;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(datastoreProvider, "datastoreProvider");
        Composer composerKN = composer.KN(593064538);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(endpoints) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(datastoreProvider) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    function22 = function2;
                    i5 |= composerKN.E2(function22) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function24 = function22;
                } else {
                    if (i8 != 0) {
                        z3 = true;
                    }
                    Function2 function2N = i7 == 0 ? CN3.f10765n.n() : function22;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(593064538, i5, -1, "com.bendingspoons.secretmenu.backendoverride.BackendOverrideScreen (BackendOverrideScreen.kt:35)");
                    }
                    Context context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                    fuX.w6 w6Var = fuX.KN;
                    UX1.j jVar = (UX1.j) datastoreProvider.invoke();
                    ArrayList arrayList = new ArrayList(endpoints.size());
                    for (Map.Entry entry : endpoints.entrySet()) {
                        arrayList.add(new j.n((String) entry.getKey(), (String) entry.getValue()));
                    }
                    ViewModelProvider.Factory factoryRl = w6Var.rl(jVar, arrayList, 0, z3);
                    composerKN.te(1729797275);
                    viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, 6);
                    if (viewModelStoreOwnerT != null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    int i9 = i5;
                    ViewModel viewModelT = ViewModelKt.t(Reflection.getOrCreateKotlinClass(fuX.class), viewModelStoreOwnerT, null, factoryRl, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composerKN, 0, 0);
                    composerKN.M7();
                    final fuX fux2 = (fuX) viewModelT;
                    fuX.Ml ml = (fuX.Ml) SnapshotStateKt.rl(fux2.qie(), null, composerKN, 0, 1).getValue();
                    if (ml instanceof fuX.Ml.j) {
                        composerKN.eF(-735725672);
                        fuX.Ml.j jVar2 = (fuX.Ml.j) ml;
                        List listN = jVar2.n();
                        int iRl = jVar2.rl();
                        int iT = jVar2.t();
                        composerKN.eF(253369744);
                        boolean zE2 = composerKN.E2(fux2);
                        Object objIF = composerKN.iF();
                        if (zE2 || objIF == Composer.INSTANCE.n()) {
                            objIF = new Function1() { // from class: UX1.Ml
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Wre.nr(fux2, (LRV.j) obj);
                                }
                            };
                            composerKN.o(objIF);
                        }
                        composerKN.Xw();
                        Function2 function25 = function2N;
                        fux = fux2;
                        continuation = null;
                        LRV.CN3.rl(listN, iRl, iT, (Function1) objIF, function25, composerKN, (i9 << 3) & 57344, 0);
                        function23 = function25;
                        composerKN.Xw();
                    } else {
                        function23 = function2N;
                        fux = fux2;
                        if (!Intrinsics.areEqual(ml, fuX.Ml.n.f6109n)) {
                            composerKN.eF(253358290);
                            composerKN.Xw();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerKN.eF(-735305963);
                        Alignment alignmentO = Alignment.INSTANCE.O();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                        int iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
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
                        Updater.O(composerN, measurePolicyUo, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        continuation = null;
                        ProgressIndicatorKt.nr(PaddingKt.xMQ(companion, Dp.KN(16)), 0L, 0.0f, 0L, 0, composerKN, 6, 30);
                        composerKN = composerKN;
                        composerKN.XQ();
                        composerKN.Xw();
                    }
                    Z zMUb = fux.mUb();
                    composerKN.eF(253382143);
                    boolean zE22 = composerKN.E2(fux) | composerKN.E2(context);
                    Object objIF2 = composerKN.iF();
                    if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new j(fux, context, continuation);
                        composerKN.o(objIF2);
                    }
                    composerKN.Xw();
                    EffectsKt.O(zMUb, (Function2) objIF2, composerKN, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function24 = function23;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: UX1.I28
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wre.O(endpoints, datastoreProvider, z3, function24, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            function22 = function2;
            if ((i5 & 1171) == 1170) {
                if (i8 != 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Context context2 = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                fuX.w6 w6Var2 = fuX.KN;
                UX1.j jVar3 = (UX1.j) datastoreProvider.invoke();
                ArrayList arrayList2 = new ArrayList(endpoints.size());
                while (r13.hasNext()) {
                }
                ViewModelProvider.Factory factoryRl2 = w6Var2.rl(jVar3, arrayList2, 0, z3);
                composerKN.te(1729797275);
                viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composerKN, 6);
                if (viewModelStoreOwnerT != null) {
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        z3 = z2;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        function22 = function2;
        if ((i5 & 1171) == 1170) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
