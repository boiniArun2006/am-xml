package xAo;

import ScC.w6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.BundleKt;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleCoroutineScope;
import androidx.view.LifecycleOwnerKt;
import com.safedk.android.utils.Logger;
import dI8.I28;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qf {
    private ComponentActivity J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final NuI.CN3 f75292O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nYs.Ml f75293n;
    private final NuI.w6 nr;
    private final Q.Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f75294t;
    public static final j Uo = new j(null);
    public static final int KN = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75295O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75296n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ qf f75297o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f75298r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f75299t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List list, String str, qf qfVar, Continuation continuation) {
            super(2, continuation);
            this.J2 = list;
            this.f75298r = str;
            this.f75297o = qfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.J2, this.f75298r, this.f75297o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qf qfVar;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75295O;
            if (i2 != 0) {
                if (i2 == 1) {
                    it = (Iterator) this.f75299t;
                    qfVar = (qf) this.f75296n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List list = this.J2;
                qfVar = this.f75297o;
                it = list.iterator();
            }
            while (it.hasNext()) {
                xhQ.CN3 cn3 = (xhQ.CN3) it.next();
                Q.Xo xo = qfVar.rl;
                JK.w6 w6VarT = cn3.t();
                this.f75296n = qfVar;
                this.f75299t = it;
                this.f75295O = 1;
                if (xo.O(w6VarT, 604800000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            com.alightcreative.app.motion.persist.j.INSTANCE.getAdsWatchedForProject().put(this.f75298r, Boxing.boxInt(0));
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f75300O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f75301S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f75302Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75304n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f75305o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f75306r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f75307t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75301S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return qf.this.qie(null, null, this);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public qf(nYs.Ml getAlightSettingsUseCase, Q.Xo unlockUseCase, I28 crisperManager, NuI.w6 getAdUnitIdUseCase, NuI.CN3 getRewardedAdLauncherUseCase) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(unlockUseCase, "unlockUseCase");
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(getAdUnitIdUseCase, "getAdUnitIdUseCase");
        Intrinsics.checkNotNullParameter(getRewardedAdLauncherUseCase, "getRewardedAdLauncherUseCase");
        this.f75293n = getAlightSettingsUseCase;
        this.rl = unlockUseCase;
        this.f75294t = crisperManager;
        this.nr = getAdUnitIdUseCase;
        this.f75292O = getRewardedAdLauncherUseCase;
    }

    private final void J2(String str, List list) {
        LifecycleCoroutineScope lifecycleCoroutineScopeN;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        int iIntValue = ((Number) MapsKt.getValue(jVar.getAdsWatchedForProject(), str)).intValue() + 1;
        jVar.getAdsWatchedForProject().put(str, Integer.valueOf(iIntValue));
        int size = list.size();
        nYs.j jVarInvoke = this.f75293n.invoke();
        int iMin = Integer.min(size, jVarInvoke != null ? jVarInvoke.fD() : 0);
        if (iIntValue < iMin) {
            KN(true, iIntValue, iMin);
            return;
        }
        t();
        ComponentActivity componentActivity = this.J2;
        if (componentActivity != null && (lifecycleCoroutineScopeN = LifecycleOwnerKt.n(componentActivity)) != null) {
            GJW.C.nr(lifecycleCoroutineScopeN, null, null, new n(list, str, this, null), 3, null);
        }
        mUb(str);
    }

    private final Unit KN(boolean z2, int i2, int i3) {
        ComponentActivity componentActivity = this.J2;
        if (componentActivity == null) {
            return null;
        }
        Intent intent = new Intent("com.alightcreative.app.motion.action.OPEN_TRIAL_DIALOG", null, componentActivity, componentActivity.getClass());
        intent.putExtras(BundleKt.n(TuplesKt.to("adsEnabled", Boolean.valueOf(z2)), TuplesKt.to("numAdsWatched", Integer.valueOf(i2)), TuplesKt.to("numAdsToWatch", Integer.valueOf(i3))));
        intent.addFlags(536870912);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(componentActivity, intent);
        return Unit.INSTANCE;
    }

    private final void O(String str, int i2) {
        if (i2 > 0) {
            xMQ(this, false, 0, 0, 6, null);
        } else {
            mUb(str);
        }
    }

    private final Unit Uo() {
        ComponentActivity componentActivity = this.J2;
        if (componentActivity == null) {
            return null;
        }
        Intent intent = new Intent("com.alightcreative.app.motion.action.OPEN_EXPORT_PAGE", null, componentActivity, componentActivity.getClass());
        intent.addFlags(536870912);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(componentActivity, intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(qf qfVar, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qfVar.Uo();
        return Unit.INSTANCE;
    }

    private final void mUb(String str) {
        if (this.rl.Uo(str)) {
            Uo();
        } else {
            this.f75294t.r(SPz.f75267n, new Function1() { // from class: xAo.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qf.gh(this.f75312n, (ComponentActivity) obj);
                }
            });
        }
    }

    private final Unit t() {
        ComponentActivity componentActivity = this.J2;
        if (componentActivity == null) {
            return null;
        }
        Intent intent = new Intent("com.alightcreative.app.motion.action.CLOSE_TRIAL_DIALOG", null, componentActivity, componentActivity.getClass());
        intent.addFlags(536870912);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(componentActivity, intent);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit xMQ(qf qfVar, boolean z2, int i2, int i3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        return qfVar.KN(z2, i2, i3);
    }

    public final void nr(ComponentActivity activity, List projectIds, List trialItems) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        Intrinsics.checkNotNullParameter(trialItems, "trialItems");
        this.J2 = activity;
        if (projectIds.size() > 1) {
            Uo();
            return;
        }
        String str = (String) CollectionsKt.firstOrNull(projectIds);
        if (str == null) {
            return;
        }
        int size = trialItems.size();
        nYs.j jVarInvoke = this.f75293n.invoke();
        if (jVarInvoke == null) {
            O(str, size);
            return;
        }
        if (!jVarInvoke.E2()) {
            O(str, size);
            return;
        }
        if (size == 0) {
            mUb(str);
            return;
        }
        int iIntValue = ((Number) MapsKt.getValue(com.alightcreative.app.motion.persist.j.INSTANCE.getAdsWatchedForProject(), str)).intValue();
        int iMin = Integer.min(size, jVarInvoke.fD());
        if (iIntValue < iMin) {
            KN(true, iIntValue, iMin);
        } else {
            mUb(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qie(List list, List list2, Continuation continuation) {
        w6 w6Var;
        View viewInflate;
        Activity activity;
        String str;
        List list3;
        qf qfVar;
        ScC.w6 w6Var2;
        Activity activity2;
        List list4;
        qf qfVar2;
        String str2;
        View view;
        View view2;
        String str3;
        Activity activity3;
        List list5;
        qf qfVar3;
        boolean z2;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.E2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        w6 w6Var3 = w6Var;
        Object objRl = w6Var3.f75301S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var3.E2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            ComponentActivity componentActivity = this.J2;
            if (componentActivity == null) {
                return Unit.INSTANCE;
            }
            if (list.size() != 1) {
                return Unit.INSTANCE;
            }
            String str4 = (String) list.get(0);
            viewInflate = LayoutInflater.from(componentActivity).inflate(2131558471, (ViewGroup) null);
            componentActivity.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            NuI.CN3 cn3 = this.f75292O;
            w6Var3.f75304n = this;
            w6Var3.f75307t = list2;
            w6Var3.f75300O = componentActivity;
            w6Var3.J2 = str4;
            w6Var3.f75306r = viewInflate;
            w6Var3.E2 = 1;
            Object objN = cn3.n(w6Var3);
            if (objN != coroutine_suspended) {
                activity = componentActivity;
                objRl = objN;
                str = str4;
                list3 = list2;
                qfVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                view2 = (View) w6Var3.f75306r;
                str3 = (String) w6Var3.J2;
                activity3 = (ComponentActivity) w6Var3.f75300O;
                list5 = (List) w6Var3.f75307t;
                qfVar3 = (qf) w6Var3.f75304n;
                ResultKt.throwOnFailure(objRl);
                x0X.n nVar = (x0X.n) objRl;
                ViewParent parent = view2.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view2);
                z2 = nVar instanceof n.C1266n;
                if (!z2) {
                    if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dI8.I28 i28 = (dI8.I28) ((n.w6) nVar).n();
                    if (i28 instanceof I28.n) {
                        qfVar3.J2(str3, list5);
                    } else if (!(i28 instanceof I28.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (!z2) {
                    new nv.n(activity3).o(2132017221).Uo(2132017220).setPositiveButton(2132017378, null).XQ();
                } else if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            activity = (Activity) w6Var3.f75302Z;
            w6Var2 = (ScC.w6) w6Var3.f75305o;
            View view3 = (View) w6Var3.f75306r;
            String str5 = (String) w6Var3.J2;
            ComponentActivity componentActivity2 = (ComponentActivity) w6Var3.f75300O;
            List list6 = (List) w6Var3.f75307t;
            qf qfVar4 = (qf) w6Var3.f75304n;
            ResultKt.throwOnFailure(objRl);
            list4 = list6;
            qfVar2 = qfVar4;
            str2 = str5;
            activity2 = componentActivity2;
            view = view3;
            w6.n nVar2 = new w6.n("did_tap_export_pro_feature_watch_ad", "export_pro_feature", null, 4, null);
            w6Var3.f75304n = qfVar2;
            w6Var3.f75307t = list4;
            w6Var3.f75300O = activity2;
            w6Var3.J2 = str2;
            w6Var3.f75306r = view;
            w6Var3.f75305o = null;
            w6Var3.f75302Z = null;
            w6Var3.E2 = 3;
            Activity activity4 = activity;
            objRl = w6Var2.rl(activity4, (String) objRl, true, nVar2, w6Var3);
            if (objRl != coroutine_suspended) {
                view2 = view;
                str3 = str2;
                activity3 = activity2;
                list5 = list4;
                qfVar3 = qfVar2;
                x0X.n nVar3 = (x0X.n) objRl;
                ViewParent parent2 = view2.getParent();
                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent2).removeView(view2);
                z2 = nVar3 instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        View view4 = (View) w6Var3.f75306r;
        str = (String) w6Var3.J2;
        ComponentActivity componentActivity3 = (ComponentActivity) w6Var3.f75300O;
        list3 = (List) w6Var3.f75307t;
        qfVar = (qf) w6Var3.f75304n;
        ResultKt.throwOnFailure(objRl);
        viewInflate = view4;
        activity = componentActivity3;
        ScC.w6 w6Var4 = (ScC.w6) objRl;
        NuI.w6 w6Var5 = qfVar.nr;
        k.I28 i282 = k.I28.f69641Z;
        w6Var3.f75304n = qfVar;
        w6Var3.f75307t = list3;
        w6Var3.f75300O = activity;
        w6Var3.J2 = str;
        w6Var3.f75306r = viewInflate;
        w6Var3.f75305o = w6Var4;
        w6Var3.f75302Z = activity;
        w6Var3.E2 = 2;
        Object objN2 = w6Var5.n(i282, w6Var3);
        if (objN2 != coroutine_suspended) {
            w6Var2 = w6Var4;
            objRl = objN2;
            activity2 = activity;
            list4 = list3;
            qfVar2 = qfVar;
            str2 = str;
            view = viewInflate;
            w6.n nVar22 = new w6.n("did_tap_export_pro_feature_watch_ad", "export_pro_feature", null, 4, null);
            w6Var3.f75304n = qfVar2;
            w6Var3.f75307t = list4;
            w6Var3.f75300O = activity2;
            w6Var3.J2 = str2;
            w6Var3.f75306r = view;
            w6Var3.f75305o = null;
            w6Var3.f75302Z = null;
            w6Var3.E2 = 3;
            Activity activity42 = activity;
            objRl = w6Var2.rl(activity42, (String) objRl, true, nVar22, w6Var3);
            if (objRl != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
