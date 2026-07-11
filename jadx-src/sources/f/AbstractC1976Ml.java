package f;

import ScC.n;
import ScC.w6;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.view.ComponentActivity;
import com.vungle.ads.internal.Constants;
import dI8.I28;
import f.AbstractC1975I28;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x0X.n;

/* JADX INFO: renamed from: f.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1976Ml {

    /* JADX INFO: renamed from: f.Ml$n */
    static final class n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63974O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f63975Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63976n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f63977o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f63978r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63979t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63977o = obj;
            this.f63975Z |= Integer.MIN_VALUE;
            return AbstractC1976Ml.rl(null, null, null, null, null, null, this);
        }

        n(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: f.Ml$j */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1978Wre.values().length];
            try {
                iArr[EnumC1978Wre.f64003n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1978Wre.f64004t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final C1985n O(JSONObject jSONObject) {
        EnumC1978Wre enumC1978Wre;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String strO = bIo.Wre.O(jSONObject, "adType");
        if (Intrinsics.areEqual(strO, "reward")) {
            enumC1978Wre = EnumC1978Wre.f64003n;
        } else {
            if (!Intrinsics.areEqual(strO, Constants.PLACEMENT_TYPE_INTERSTITIAL)) {
                return null;
            }
            enumC1978Wre = EnumC1978Wre.f64004t;
        }
        return new C1985n(enumC1978Wre);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r21v0, types: [NuI.CN3] */
    /* JADX WARN: Type inference failed for: r22v0, types: [NuI.I28] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.activity.ComponentActivity] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24, types: [androidx.activity.ComponentActivity] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(ComponentActivity componentActivity, sqD.w6 w6Var, C1985n c1985n, NuI.w6 w6Var2, NuI.CN3 cn3, NuI.I28 i28, Continuation continuation) {
        n nVar;
        View viewInflate;
        Object objN;
        Object objN2;
        Object objN3;
        sqD.w6 w6Var3;
        ScC.w6 w6Var4;
        View view;
        Activity activity;
        View view2;
        sqD.w6 w6Var5;
        ?? r2;
        boolean z2;
        Object objN4;
        sqD.w6 w6Var6;
        ScC.n nVar2;
        View view3;
        Activity activity2;
        View view4;
        sqD.w6 w6Var7;
        ?? r22;
        boolean z3;
        Activity activity3 = componentActivity;
        sqD.w6 w6Var8 = w6Var;
        NuI.w6 w6Var9 = w6Var2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f63975Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f63975Z = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objRl = nVar.f63977o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (nVar.f63975Z) {
            case 0:
                ResultKt.throwOnFailure(objRl);
                viewInflate = LayoutInflater.from(activity3).inflate(2131558471, (ViewGroup) null);
                activity3.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
                int i3 = j.$EnumSwitchMapping$0[c1985n.rl().ordinal()];
                if (i3 == 1) {
                    nVar.f63976n = activity3;
                    nVar.f63979t = w6Var8;
                    nVar.f63974O = w6Var9;
                    nVar.J2 = viewInflate;
                    nVar.f63975Z = 1;
                    objN = cn3.n(nVar);
                    if (objN != coroutine_suspended) {
                        ScC.w6 w6Var10 = (ScC.w6) objN;
                        k.I28 i282 = k.I28.f69641Z;
                        nVar.f63976n = activity3;
                        nVar.f63979t = w6Var8;
                        nVar.f63974O = viewInflate;
                        nVar.J2 = w6Var10;
                        nVar.f63978r = activity3;
                        nVar.f63975Z = 2;
                        objN3 = w6Var9.n(i282, nVar);
                        if (objN3 != coroutine_suspended) {
                            w6Var3 = w6Var8;
                            w6Var4 = w6Var10;
                            View view5 = viewInflate;
                            objRl = objN3;
                            view = view5;
                            activity = activity3;
                            w6.n nVar3 = new w6.n(w6Var3.rl().getValue(), null, null, 6, null);
                            nVar.f63976n = activity;
                            nVar.f63979t = w6Var3;
                            nVar.f63974O = view;
                            nVar.J2 = null;
                            nVar.f63978r = null;
                            nVar.f63975Z = 3;
                            ScC.w6 w6Var11 = w6Var4;
                            objRl = w6Var11.rl(activity3, (String) objRl, false, nVar3, nVar);
                            if (objRl != coroutine_suspended) {
                                view2 = view;
                                w6Var5 = w6Var3;
                                r2 = activity;
                                x0X.n nVar4 = (x0X.n) objRl;
                                ViewParent parent = view2.getParent();
                                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                                ((ViewGroup) parent).removeView(view2);
                                z2 = nVar4 instanceof n.C1266n;
                                if (!z2) {
                                    if (!(nVar4 instanceof n.w6)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dI8.I28 i283 = (dI8.I28) ((n.w6) nVar4).n();
                                    if (i283 instanceof I28.n) {
                                        w6Var5.t(AbstractC1975I28.n.f63973n);
                                    } else if (!(i283 instanceof I28.j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                if (!z2) {
                                    t(r2, w6Var5);
                                } else if (!(nVar4 instanceof n.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.f63976n = activity3;
                    nVar.f63979t = w6Var8;
                    nVar.f63974O = w6Var9;
                    nVar.J2 = viewInflate;
                    nVar.f63975Z = 4;
                    objN2 = i28.n(nVar);
                    if (objN2 != coroutine_suspended) {
                        ScC.n nVar5 = (ScC.n) objN2;
                        k.I28 i284 = k.I28.f69644r;
                        nVar.f63976n = activity3;
                        nVar.f63979t = w6Var8;
                        nVar.f63974O = viewInflate;
                        nVar.J2 = nVar5;
                        nVar.f63978r = activity3;
                        nVar.f63975Z = 5;
                        objN4 = w6Var9.n(i284, nVar);
                        if (objN4 != coroutine_suspended) {
                            w6Var6 = w6Var8;
                            nVar2 = nVar5;
                            View view6 = viewInflate;
                            objRl = objN4;
                            view3 = view6;
                            activity2 = activity3;
                            n.C0320n c0320n = new n.C0320n(w6Var6.rl().getValue(), null, 2, null);
                            nVar.f63976n = activity2;
                            nVar.f63979t = w6Var6;
                            nVar.f63974O = view3;
                            nVar.J2 = null;
                            nVar.f63978r = null;
                            nVar.f63975Z = 6;
                            objRl = nVar2.n(activity3, (String) objRl, c0320n, nVar);
                            if (objRl != coroutine_suspended) {
                                view4 = view3;
                                w6Var7 = w6Var6;
                                r22 = activity2;
                                x0X.n nVar6 = (x0X.n) objRl;
                                ViewParent parent2 = view4.getParent();
                                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ((ViewGroup) parent2).removeView(view4);
                                z3 = nVar6 instanceof n.C1266n;
                                if (!z3) {
                                    if (!(nVar6 instanceof n.w6)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    w6Var7.t(AbstractC1975I28.n.f63973n);
                                }
                                if (!z3) {
                                    t(r22, w6Var7);
                                } else if (!(nVar6 instanceof n.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                View view7 = (View) nVar.J2;
                NuI.w6 w6Var12 = (NuI.w6) nVar.f63974O;
                sqD.w6 w6Var13 = (sqD.w6) nVar.f63979t;
                ComponentActivity componentActivity2 = (ComponentActivity) nVar.f63976n;
                ResultKt.throwOnFailure(objRl);
                viewInflate = view7;
                activity3 = componentActivity2;
                objN = objRl;
                w6Var9 = w6Var12;
                w6Var8 = w6Var13;
                ScC.w6 w6Var102 = (ScC.w6) objN;
                k.I28 i2822 = k.I28.f69641Z;
                nVar.f63976n = activity3;
                nVar.f63979t = w6Var8;
                nVar.f63974O = viewInflate;
                nVar.J2 = w6Var102;
                nVar.f63978r = activity3;
                nVar.f63975Z = 2;
                objN3 = w6Var9.n(i2822, nVar);
                if (objN3 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                activity3 = (Activity) nVar.f63978r;
                w6Var4 = (ScC.w6) nVar.J2;
                view = (View) nVar.f63974O;
                w6Var3 = (sqD.w6) nVar.f63979t;
                activity = (ComponentActivity) nVar.f63976n;
                ResultKt.throwOnFailure(objRl);
                w6.n nVar32 = new w6.n(w6Var3.rl().getValue(), null, null, 6, null);
                nVar.f63976n = activity;
                nVar.f63979t = w6Var3;
                nVar.f63974O = view;
                nVar.J2 = null;
                nVar.f63978r = null;
                nVar.f63975Z = 3;
                ScC.w6 w6Var112 = w6Var4;
                objRl = w6Var112.rl(activity3, (String) objRl, false, nVar32, nVar);
                if (objRl != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                view2 = (View) nVar.f63974O;
                w6Var5 = (sqD.w6) nVar.f63979t;
                ComponentActivity componentActivity3 = (ComponentActivity) nVar.f63976n;
                ResultKt.throwOnFailure(objRl);
                r2 = componentActivity3;
                x0X.n nVar42 = (x0X.n) objRl;
                ViewParent parent3 = view2.getParent();
                Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent3).removeView(view2);
                z2 = nVar42 instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
                return Unit.INSTANCE;
            case 4:
                View view8 = (View) nVar.J2;
                NuI.w6 w6Var14 = (NuI.w6) nVar.f63974O;
                sqD.w6 w6Var15 = (sqD.w6) nVar.f63979t;
                ComponentActivity componentActivity4 = (ComponentActivity) nVar.f63976n;
                ResultKt.throwOnFailure(objRl);
                viewInflate = view8;
                activity3 = componentActivity4;
                objN2 = objRl;
                w6Var9 = w6Var14;
                w6Var8 = w6Var15;
                ScC.n nVar52 = (ScC.n) objN2;
                k.I28 i2842 = k.I28.f69644r;
                nVar.f63976n = activity3;
                nVar.f63979t = w6Var8;
                nVar.f63974O = viewInflate;
                nVar.J2 = nVar52;
                nVar.f63978r = activity3;
                nVar.f63975Z = 5;
                objN4 = w6Var9.n(i2842, nVar);
                if (objN4 != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                activity3 = (Activity) nVar.f63978r;
                nVar2 = (ScC.n) nVar.J2;
                view3 = (View) nVar.f63974O;
                w6Var6 = (sqD.w6) nVar.f63979t;
                activity2 = (ComponentActivity) nVar.f63976n;
                ResultKt.throwOnFailure(objRl);
                n.C0320n c0320n2 = new n.C0320n(w6Var6.rl().getValue(), null, 2, null);
                nVar.f63976n = activity2;
                nVar.f63979t = w6Var6;
                nVar.f63974O = view3;
                nVar.J2 = null;
                nVar.f63978r = null;
                nVar.f63975Z = 6;
                objRl = nVar2.n(activity3, (String) objRl, c0320n2, nVar);
                if (objRl != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                view4 = (View) nVar.f63974O;
                w6Var7 = (sqD.w6) nVar.f63979t;
                ComponentActivity componentActivity5 = (ComponentActivity) nVar.f63976n;
                ResultKt.throwOnFailure(objRl);
                r22 = componentActivity5;
                x0X.n nVar62 = (x0X.n) objRl;
                ViewParent parent22 = view4.getParent();
                Intrinsics.checkNotNull(parent22, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent22).removeView(view4);
                z3 = nVar62 instanceof n.C1266n;
                if (!z3) {
                }
                if (!z3) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final void t(ComponentActivity componentActivity, final sqD.w6 w6Var) {
        new nv.n(componentActivity).o(2132017221).Uo(2132017220).setPositiveButton(2132017378, null).ty(new DialogInterface.OnDismissListener() { // from class: f.w6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC1976Ml.nr(w6Var, dialogInterface);
            }
        }).XQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(sqD.w6 w6Var, DialogInterface dialogInterface) {
        if (!(w6Var.rl() instanceof xAo.afx) && !(w6Var.rl() instanceof xAo.Q)) {
            w6Var.t(AbstractC1975I28.j.f63972n);
        } else {
            w6Var.t(AbstractC1975I28.n.f63973n);
        }
    }
}
