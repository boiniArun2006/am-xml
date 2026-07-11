package fE;

import OS.C1423z;
import OS.InterfaceC1422c;
import OS.UGc;
import OS.s4;
import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.CN3;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.Wre;
import com.android.billingclient.api.w6;
import fE.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements fE.w6 {
    public static final j J2 = new j(null);
    public static final int Uo = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final yB.j f66598O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f66599n;
    public com.android.billingclient.api.j nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC1422c f66600t;

    public static final class C implements OS.Dsr {
        final /* synthetic */ Continuation rl;

        C(Continuation continuation) {
            this.rl = continuation;
        }

        @Override // OS.Dsr
        public void n(com.android.billingclient.api.Ml billingResult) {
            Intrinsics.checkNotNullParameter(billingResult, "billingResult");
            if (!fE.CN3.rl(billingResult)) {
                xFr.n.rl(this.rl, fE.CN3.nr(billingResult));
            } else {
                I28.this.XQ(true);
                xFr.n.t(this.rl, Unit.INSTANCE);
            }
        }

        @Override // OS.Dsr
        public void rl() {
            I28.this.XQ(false);
            xFr.n.rl(this.rl, new fE.j(j.EnumC0924j.f66804O, "Disconnected from billing service during setup."));
        }
    }

    static final class CN3 extends SuspendLambda implements Function1 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28 f66602O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66603n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f66604t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(List list, I28 i28, String str, Continuation continuation) {
            super(1, continuation);
            this.f66604t = list;
            this.f66602O = i28;
            this.J2 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new CN3(this.f66604t, this.f66602O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66603n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List list = this.f66604t;
                String str = this.J2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(CN3.n.n().rl((String) it.next()).t(str).n());
                }
                com.android.billingclient.api.CN3 cn3N = com.android.billingclient.api.CN3.n().rl(arrayList).n();
                Intrinsics.checkNotNullExpressionValue(cn3N, "build(...)");
                com.android.billingclient.api.j jVarIk = this.f66602O.Ik();
                this.f66603n = 1;
                obj = OS.fuX.KN(jVarIk, cn3N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            OS.Xo xo = (OS.Xo) obj;
            com.android.billingclient.api.Ml mlN = xo.n();
            List listRl = xo.rl();
            x0X.n nVarO = fE.CN3.O(mlN);
            List list2 = this.f66604t;
            if (nVarO instanceof n.C1266n) {
                return nVarO;
            }
            if (nVarO instanceof n.w6) {
                x0X.n nVarT = n.j.t(x0X.n.f75185n, listRl, null, 2, null);
                if (!(nVarT instanceof n.C1266n)) {
                    if (nVarT instanceof n.w6) {
                        List list3 = (List) ((n.w6) nVarT).n();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            String str2 = (String) obj2;
                            if (list3 == null || !list3.isEmpty()) {
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    if (Intrinsics.areEqual(((com.android.billingclient.api.Wre) it2.next()).nr(), str2)) {
                                        break;
                                    }
                                }
                            }
                            arrayList2.add(obj2);
                        }
                        nVarT = new n.w6(TuplesKt.to(list3, arrayList2));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (nVarT instanceof n.C1266n) {
                    return new n.C1266n(new fE.j(j.EnumC0924j.f66808Z, "No products found with this product ID."));
                }
                if (nVarT instanceof n.w6) {
                    return nVarT;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Dsr extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28 f66605O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66606n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f66607t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(String str, I28 i28, Continuation continuation) {
            super(1, continuation);
            this.f66607t = str;
            this.f66605O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Dsr(this.f66607t, this.f66605O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66606n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                UGc uGcN = UGc.n().rl(this.f66607t).n();
                Intrinsics.checkNotNullExpressionValue(uGcN, "build(...)");
                com.android.billingclient.api.j jVarIk = this.f66605O.Ik();
                this.f66606n = 1;
                obj = OS.fuX.mUb(jVarIk, uGcN, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            OS.l3D l3d = (OS.l3D) obj;
            com.android.billingclient.api.Ml mlN = l3d.n();
            List listRl = l3d.rl();
            x0X.n nVarO = fE.CN3.O(mlN);
            if (nVarO instanceof n.C1266n) {
                return nVarO;
            }
            if (nVarO instanceof n.w6) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl, 10));
                Iterator it = listRl.iterator();
                while (it.hasNext()) {
                    arrayList.add(fE.fuX.O((Purchase) it.next()));
                }
                return new n.w6(arrayList);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Dsr) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: fE.I28$I28, reason: collision with other inner class name */
    static final class C0919I28 extends SuspendLambda implements Function1 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66608O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66609n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Activity f66610r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0919I28(String str, String str2, Activity activity, Continuation continuation) {
            super(1, continuation);
            this.f66608O = str;
            this.J2 = str2;
            this.f66610r = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new C0919I28(this.f66608O, this.J2, this.f66610r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66609n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                I28 i28 = I28.this;
                String str = this.f66608O;
                this.f66609n = 1;
                obj = i28.r(str, "subs", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            String str2 = this.J2;
            I28 i282 = I28.this;
            Activity activity = this.f66610r;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (nVar instanceof n.w6) {
                com.android.billingclient.api.Wre wre = (com.android.billingclient.api.Wre) ((n.w6) nVar).n();
                w6.n.j jVarT = w6.n.n().t(wre);
                if (str2 == null) {
                    x0X.n nVarHI = i282.HI(wre);
                    if (nVarHI instanceof n.C1266n) {
                        j.EnumC0924j enumC0924j = j.EnumC0924j.f66810g;
                        String message = ((Throwable) ((n.C1266n) nVarHI).n()).getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new n.C1266n(new fE.j(enumC0924j, message));
                    }
                    if (nVarHI instanceof n.w6) {
                        str2 = (String) ((n.w6) nVarHI).n();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                com.android.billingclient.api.w6 w6VarN = com.android.billingclient.api.w6.n().rl(CollectionsKt.listOf(jVarT.rl(str2).n())).n();
                Intrinsics.checkNotNullExpressionValue(w6VarN, "build(...)");
                com.android.billingclient.api.Ml mlT = i282.Ik().t(activity, w6VarN);
                Intrinsics.checkNotNullExpressionValue(mlT, "launchBillingFlow(...)");
                return fE.CN3.O(mlT);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0919I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {
        final /* synthetic */ Activity J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66612O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66613n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, Activity activity, Continuation continuation) {
            super(1, continuation);
            this.f66612O = str;
            this.J2 = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new Ml(this.f66612O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66613n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                I28 i28 = I28.this;
                String str = this.f66612O;
                this.f66613n = 1;
                obj = i28.r(str, "inapp", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            I28 i282 = I28.this;
            Activity activity = this.J2;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (nVar instanceof n.w6) {
                com.android.billingclient.api.w6 w6VarN = com.android.billingclient.api.w6.n().rl(CollectionsKt.listOf(w6.n.n().t((com.android.billingclient.api.Wre) ((n.w6) nVar).n()).n())).n();
                Intrinsics.checkNotNullExpressionValue(w6VarN, "build(...)");
                com.android.billingclient.api.Ml mlT = i282.Ik().t(activity, w6VarN);
                Intrinsics.checkNotNullExpressionValue(mlT, "launchBillingFlow(...)");
                return fE.CN3.O(mlT);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Wre extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66616n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66617t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66617t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.r(null, null, this);
        }
    }

    static final class aC extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f66618O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66619n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f66620o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66622t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f66620o |= Integer.MIN_VALUE;
            return I28.this.t(this);
        }
    }

    static final class fuX extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ I28 f66623O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66624n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f66625t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(String str, I28 i28, Continuation continuation) {
            super(1, continuation);
            this.f66625t = str;
            this.f66623O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new fuX(this.f66625t, this.f66623O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66624n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                s4 s4VarN = s4.n().rl(this.f66625t).n();
                Intrinsics.checkNotNullExpressionValue(s4VarN, "build(...)");
                com.android.billingclient.api.j jVarIk = this.f66623O.Ik();
                this.f66624n = 1;
                obj = OS.fuX.xMQ(jVarIk, s4VarN, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C1423z c1423z = (C1423z) obj;
            com.android.billingclient.api.Ml mlN = c1423z.n();
            List listRl = c1423z.rl();
            x0X.n nVarO = fE.CN3.O(mlN);
            if (nVarO instanceof n.C1266n) {
                return nVarO;
            }
            if (nVarO instanceof n.w6) {
                if (listRl != null) {
                    return new n.w6(listRl);
                }
                return new n.C1266n(new fE.j(j.EnumC0924j.f66807X, "The billing client reported a successful query, but the result was null."));
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((fuX) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66626O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66627n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation continuation) {
            super(1, continuation);
            this.f66626O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new n(this.f66626O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66627n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                com.android.billingclient.api.j jVarIk = I28.this.Ik();
                OS.j jVarN = OS.j.rl().rl(this.f66626O).n();
                Intrinsics.checkNotNullExpressionValue(jVarN, "build(...)");
                this.f66627n = 1;
                obj = OS.fuX.J2(jVarIk, jVarN, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return fE.CN3.O((com.android.billingclient.api.Ml) obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class o extends SuspendLambda implements Function1 {
        final /* synthetic */ String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66629O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Activity f66630Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66631n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f66632o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f66633r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, String str3, int i2, Activity activity, Continuation continuation) {
            super(1, continuation);
            this.f66629O = str;
            this.J2 = str2;
            this.f66633r = str3;
            this.f66632o = i2;
            this.f66630Z = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new o(this.f66629O, this.J2, this.f66633r, this.f66632o, this.f66630Z, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66631n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                I28 i28 = I28.this;
                String str = this.f66629O;
                this.f66631n = 1;
                obj = i28.r(str, "subs", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            String str2 = this.J2;
            I28 i282 = I28.this;
            String str3 = this.f66633r;
            int i3 = this.f66632o;
            Activity activity = this.f66630Z;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (nVar instanceof n.w6) {
                com.android.billingclient.api.Wre wre = (com.android.billingclient.api.Wre) ((n.w6) nVar).n();
                w6.n.j jVarT = w6.n.n().t(wre);
                if (str2 == null) {
                    x0X.n nVarHI = i282.HI(wre);
                    if (nVarHI instanceof n.C1266n) {
                        j.EnumC0924j enumC0924j = j.EnumC0924j.f66810g;
                        String message = ((Throwable) ((n.C1266n) nVarHI).n()).getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new n.C1266n(new fE.j(enumC0924j, message));
                    }
                    if (nVarHI instanceof n.w6) {
                        str2 = (String) ((n.w6) nVarHI).n();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                List listListOf = CollectionsKt.listOf(jVarT.rl(str2).n());
                w6.C0689w6 c0689w6N = w6.C0689w6.n().rl(str3).nr(i3).n();
                Intrinsics.checkNotNullExpressionValue(c0689w6N, "build(...)");
                com.android.billingclient.api.w6 w6VarN = com.android.billingclient.api.w6.n().rl(listListOf).t(c0689w6N).n();
                Intrinsics.checkNotNullExpressionValue(w6VarN, "build(...)");
                com.android.billingclient.api.Ml mlT = i282.Ik().t(activity, w6VarN);
                Intrinsics.checkNotNullExpressionValue(mlT, "launchBillingFlow(...)");
                return fE.CN3.O(mlT);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class qz extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66636n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66637t;

        qz(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66637t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.S(null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f66638O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f66639n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, Continuation continuation) {
            super(1, continuation);
            this.f66638O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new w6(this.f66638O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f66639n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                com.android.billingclient.api.j jVarIk = I28.this.Ik();
                OS.aC aCVarN = OS.aC.rl().rl(this.f66638O).n();
                Intrinsics.checkNotNullExpressionValue(aCVarN, "build(...)");
                this.f66639n = 1;
                obj = OS.fuX.Uo(jVarIk, aCVarN, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return fE.CN3.O(((OS.o) obj).n());
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public I28(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66599n = context;
        this.f66598O = yB.CN3.rl(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0X.n HI(final com.android.billingclient.api.Wre wre) {
        return x0X.w6.n(new Function0() { // from class: fE.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.ck(wre);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(Function1 function1, Continuation continuation) throws Throwable {
        qz qzVar;
        if (continuation instanceof qz) {
            qzVar = (qz) continuation;
            int i2 = qzVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qzVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                qzVar = new qz(continuation);
            }
        }
        Object objT = qzVar.f66637t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qzVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            if (isConnected()) {
                qzVar.J2 = 1;
                Object objInvoke = function1.invoke(qzVar);
                if (objInvoke != coroutine_suspended) {
                    return objInvoke;
                }
            } else {
                qzVar.f66636n = function1;
                qzVar.J2 = 2;
                objT = t(qzVar);
                if (objT != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(objT);
            return objT;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objT);
            return (x0X.n) objT;
        }
        function1 = (Function1) qzVar.f66636n;
        ResultKt.throwOnFailure(objT);
        x0X.n nVar = (x0X.n) objT;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        qzVar.f66636n = null;
        qzVar.J2 = 3;
        objT = function1.invoke(qzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(String str, String str2, Continuation continuation) {
        Wre wre;
        Object next;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.J2 = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objO = wre.f66617t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            List listListOf = CollectionsKt.listOf(str);
            wre.f66616n = str;
            wre.J2 = 1;
            objO = O(listListOf, str2, wre);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) wre.f66616n;
            ResultKt.throwOnFailure(objO);
        }
        x0X.n nVar = (x0X.n) objO;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = (List) ((Pair) ((n.w6) nVar).n()).component1();
        n.j jVar = x0X.n.f75185n;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((com.android.billingclient.api.Wre) next).nr(), str)) {
                break;
            }
        }
        x0X.n nVarT = n.j.t(jVar, next, null, 2, null);
        if (nVarT instanceof n.C1266n) {
            return new n.C1266n(new fE.j(j.EnumC0924j.f66808Z, "No products found with this product ID."));
        }
        if (nVarT instanceof n.w6) {
            return nVarT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final com.android.billingclient.api.j Ik() {
        com.android.billingclient.api.j jVar = this.nr;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("billingClient");
        return null;
    }

    @Override // fE.w6
    public Object J2(String str, Continuation continuation) {
        return S(new fuX(str, this, null), continuation);
    }

    @Override // fE.w6
    public void KN(InterfaceC1422c purchasesUpdatedListener, com.android.billingclient.api.j jVar) {
        Intrinsics.checkNotNullParameter(purchasesUpdatedListener, "purchasesUpdatedListener");
        Z(purchasesUpdatedListener);
        com.android.billingclient.api.I28 i28N = com.android.billingclient.api.I28.t().rl().n();
        Intrinsics.checkNotNullExpressionValue(i28N, "build(...)");
        if (jVar == null) {
            jVar = com.android.billingclient.api.j.nr(this.f66599n).rl(i28N).t(purchasesUpdatedListener).n();
            Intrinsics.checkNotNullExpressionValue(jVar, "build(...)");
        }
        o(jVar);
    }

    @Override // fE.w6
    public Object O(List list, String str, Continuation continuation) {
        return S(new CN3(list, this, str, null), continuation);
    }

    @Override // fE.w6
    public Object Uo(String str, Continuation continuation) {
        return S(new Dsr(str, this, null), continuation);
    }

    public final void XQ(boolean z2) {
        this.rl = z2;
    }

    public final void Z(InterfaceC1422c interfaceC1422c) {
        Intrinsics.checkNotNullParameter(interfaceC1422c, "<set-?>");
        this.f66600t = interfaceC1422c;
    }

    @Override // fE.w6
    public boolean isConnected() {
        return this.rl;
    }

    @Override // fE.w6
    public Object mUb(String str, Continuation continuation) {
        return S(new w6(str, null), continuation);
    }

    @Override // fE.w6
    public Object n(String str, Continuation continuation) {
        return S(new n(str, null), continuation);
    }

    @Override // fE.w6
    public Object nr(Activity activity, String str, String str2, String str3, int i2, Continuation continuation) {
        return S(new o(str, str2, str3, i2, activity, null), continuation);
    }

    public final void o(com.android.billingclient.api.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.nr = jVar;
    }

    @Override // fE.w6
    public Object rl(Activity activity, String str, String str2, Continuation continuation) {
        return S(new C0919I28(str, str2, activity, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // fE.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) throws Throwable {
        aC aCVar;
        yB.j jVar;
        I28 i28;
        yB.j jVar2;
        Throwable th;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f66620o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f66620o = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object obj = aCVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.f66620o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar = this.f66598O;
                aCVar.f66619n = this;
                aCVar.f66622t = jVar;
                aCVar.f66620o = 1;
                if (jVar.Z(null, aCVar) != coroutine_suspended) {
                    i28 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) aCVar.f66622t;
                try {
                    ResultKt.throwOnFailure(obj);
                    x0X.n nVar = (x0X.n) obj;
                    jVar2.T(null);
                    return nVar;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            yB.j jVar3 = (yB.j) aCVar.f66622t;
            i28 = (I28) aCVar.f66619n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            aCVar.f66619n = i28;
            aCVar.f66622t = jVar;
            aCVar.f66618O = aCVar;
            aCVar.f66620o = 2;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(aCVar));
            if (i28.rl) {
                xFr.n.t(safeContinuation, Unit.INSTANCE);
            } else {
                i28.Ik().KN(i28.new C(safeContinuation));
            }
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(aCVar);
            }
            if (orThrow != coroutine_suspended) {
                jVar2 = jVar;
                obj = orThrow;
                x0X.n nVar2 = (x0X.n) obj;
                jVar2.T(null);
                return nVar2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar2 = jVar;
            th = th3;
            jVar2.T(null);
            throw th;
        }
    }

    @Override // fE.w6
    public Object xMQ(Activity activity, String str, Continuation continuation) {
        return S(new Ml(str, activity, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(com.android.billingclient.api.Wre wre) {
        Object next;
        String strNr;
        List<Wre.I28> listJ2 = wre.J2();
        if (listJ2 != null) {
            for (Wre.I28 i28 : listJ2) {
                if (i28.rl() == null) {
                    Iterator it = listJ2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            Wre.I28 i282 = (Wre.I28) next;
                            if (i282.rl() != null && Intrinsics.areEqual(i282.n(), i28.n())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Wre.I28 i283 = (Wre.I28) next;
                    if (i283 != null && (strNr = i283.nr()) != null) {
                        return strNr;
                    }
                    String strNr2 = i28.nr();
                    Intrinsics.checkNotNullExpressionValue(strNr2, "getOfferToken(...)");
                    return strNr2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new IllegalStateException("This product has no offers.");
    }
}
