package d3z;

import GJW.RzR;
import GJW.vd;
import TFv.Ln;
import TFv.Lu;
import TFv.SPz;
import TFv.rv6;
import WJ.phkN.HFAkacKHsU;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.InitializerViewModelFactoryBuilder;
import d3z.C1952c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import x0X.n;

/* JADX INFO: renamed from: d3z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C1952c extends ViewModel {
    public static final j KN = new j(null);
    public static final int xMQ = 8;
    private final TFv.Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TFv.Wre f63407O;
    private final rv6 Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final YV.Wre f63408n;
    private final TFv.Wre nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TFv.Wre f63409t;

    /* JADX INFO: renamed from: d3z.c$CN3 */
    static final class CN3 extends SuspendLambda implements Function4 {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f63410O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63411n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f63412t;

        CN3(Continuation continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, List list2, Map map, Continuation continuation) {
            CN3 cn3 = new CN3(continuation);
            cn3.f63412t = list;
            cn3.f63410O = list2;
            cn3.J2 = map;
            return cn3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f63411n == 0) {
                ResultKt.throwOnFailure(obj);
                return new UGc((List) this.f63412t, (List) this.f63410O, (Map) this.J2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: d3z.c$I28 */
    static final class I28 extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63413O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ fE.w6 f63414S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ C1952c f63415Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f63416g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63417n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ d3z.Wre f63418o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f63419r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63420t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(d3z.Wre wre, C1952c c1952c, fE.w6 w6Var, Context context, Continuation continuation) {
            super(2, continuation);
            this.f63418o = wre;
            this.f63415Z = c1952c;
            this.f63414S = w6Var;
            this.f63416g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f63418o, this.f63415Z, this.f63414S, this.f63416g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String strRl;
            String str;
            x0X.n nVar;
            Context context;
            fE.j jVar;
            String str2;
            Context context2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63419r;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                context2 = (Context) this.f63413O;
                                str2 = (String) this.f63417n;
                                ResultKt.throwOnFailure(obj);
                                ((Map) obj).put(str2, d3z.n.f63444O);
                                Toast.makeText(context2, "Purchase revoked!", 0).show();
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (fE.j) this.J2;
                        context = (Context) this.f63413O;
                        nVar = (x0X.n) this.f63420t;
                        str = (String) this.f63417n;
                        ResultKt.throwOnFailure(obj);
                        ((Map) obj).put(str, d3z.n.f63445n);
                        Toast.makeText(context, "Failed to revoke purchase", 0).show();
                        Log.e("ProductsViewModel", "Failed to revoke purchase: " + jVar.rl());
                        str2 = str;
                        C1952c c1952c = this.f63415Z;
                        Context context3 = this.f63416g;
                        if (!(nVar instanceof n.C1266n)) {
                            if (nVar instanceof n.w6) {
                                TFv.Wre wre = c1952c.f63407O;
                                this.f63417n = str2;
                                this.f63420t = nVar;
                                this.f63413O = context3;
                                this.J2 = null;
                                this.f63419r = 4;
                                obj = TFv.fuX.ViF(wre, this);
                                if (obj != coroutine_suspended) {
                                    context2 = context3;
                                    ((Map) obj).put(str2, d3z.n.f63444O);
                                    Toast.makeText(context2, "Purchase revoked!", 0).show();
                                }
                                return coroutine_suspended;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    strRl = (String) this.f63417n;
                    ResultKt.throwOnFailure(obj);
                    str = strRl;
                    nVar = (x0X.n) obj;
                    C1952c c1952c2 = this.f63415Z;
                    Context context4 = this.f63416g;
                    if (!(nVar instanceof n.C1266n)) {
                        fE.j jVar2 = (fE.j) ((n.C1266n) nVar).n();
                        TFv.Wre wre2 = c1952c2.f63407O;
                        this.f63417n = str;
                        this.f63420t = nVar;
                        this.f63413O = context4;
                        this.J2 = jVar2;
                        this.f63419r = 3;
                        obj = TFv.fuX.ViF(wre2, this);
                        if (obj != coroutine_suspended) {
                            context = context4;
                            jVar = jVar2;
                            ((Map) obj).put(str, d3z.n.f63445n);
                            Toast.makeText(context, "Failed to revoke purchase", 0).show();
                            Log.e("ProductsViewModel", "Failed to revoke purchase: " + jVar.rl());
                            str2 = str;
                            C1952c c1952c3 = this.f63415Z;
                            Context context32 = this.f63416g;
                            if (!(nVar instanceof n.C1266n)) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = str;
                    C1952c c1952c32 = this.f63415Z;
                    Context context322 = this.f63416g;
                    if (!(nVar instanceof n.C1266n)) {
                    }
                    return Unit.INSTANCE;
                }
                strRl = (String) this.f63417n;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                strRl = this.f63418o.rl();
                TFv.Wre wre3 = this.f63415Z.f63407O;
                this.f63417n = strRl;
                this.f63419r = 1;
                obj = TFv.fuX.ViF(wre3, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            ((Map) obj).put(strRl, d3z.n.f63447t);
            fE.w6 w6Var = this.f63414S;
            this.f63417n = strRl;
            this.f63419r = 2;
            obj = w6Var.mUb(strRl, this);
            if (obj != coroutine_suspended) {
                str = strRl;
                nVar = (x0X.n) obj;
                C1952c c1952c22 = this.f63415Z;
                Context context42 = this.f63416g;
                if (!(nVar instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: d3z.c$Ml */
    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f63421O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63422n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f63423t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.f63423t = context;
            this.f63421O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f63423t, this.f63421O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f63422n == 0) {
                ResultKt.throwOnFailure(obj);
                YgZ.Ml.rl(YgZ.Ml.f12213n, this.f63423t, this.f63421O, null, 4, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: d3z.c$Wre */
    public static final class Wre implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f63424n;

        /* JADX INFO: renamed from: d3z.c$Wre$j */
        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f63425n;

            /* JADX INFO: renamed from: d3z.c$Wre$j$j, reason: collision with other inner class name */
            public static final class C0834j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f63427n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f63428t;

                public C0834j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f63427n = obj;
                    this.f63428t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f63425n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0834j c0834j;
                if (continuation instanceof C0834j) {
                    c0834j = (C0834j) continuation;
                    int i2 = c0834j.f63428t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0834j.f63428t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0834j = new C0834j(continuation);
                    }
                }
                Object obj2 = c0834j.f63427n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0834j.f63428t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f63425n;
                    d3z.j jVarRl = s4.rl((UGc) obj);
                    c0834j.f63428t = 1;
                    if (cn3.rl(jVarRl, c0834j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Wre(TFv.Wre wre) {
            this.f63424n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f63424n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d3z.c$j */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C1952c t(YV.Wre wre, String str, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return new C1952c(wre, str);
        }

        public final ViewModelProvider.Factory rl(final YV.Wre monopoly, final String packageName) {
            Intrinsics.checkNotNullParameter(monopoly, "monopoly");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.n(Reflection.getOrCreateKotlinClass(C1952c.class), new Function1() { // from class: d3z.l3D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C1952c.j.t(monopoly, packageName, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.rl();
        }
    }

    /* JADX INFO: renamed from: d3z.c$n */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63430n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f63431t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = C1952c.this.new n(continuation);
            nVar.f63431t = obj;
            return nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (TFv.fuX.S(r1, r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TFv.CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63430n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn3 = (TFv.CN3) this.f63431t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f63431t;
                this.f63431t = cn3;
                this.f63430n = 1;
                if (cn3.rl(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            TFv.Wre wreRl = C1952c.this.f63408n.rl();
            this.f63431t = null;
            this.f63430n = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: d3z.c$w6 */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63433n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f63434t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = C1952c.this.new w6(continuation);
            w6Var.f63434t = obj;
            return w6Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (TFv.fuX.S(r1, r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TFv.CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63433n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException(HFAkacKHsU.QNHeaby);
                }
                cn3 = (TFv.CN3) this.f63434t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f63434t;
                this.f63434t = cn3;
                this.f63433n = 1;
                if (cn3.rl(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            TFv.Wre wreUo = C1952c.this.f63408n.Uo();
            this.f63434t = null;
            this.f63433n = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((w6) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public C1952c(YV.Wre monopoly, String packageName) {
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f63408n = monopoly;
        this.rl = packageName;
        TFv.Wre wreIF = TFv.fuX.iF(new w6(null));
        this.f63409t = wreIF;
        TFv.Wre wreIF2 = TFv.fuX.iF(new n(null));
        this.nr = wreIF2;
        SPz sPzN = Lu.n(new LinkedHashMap());
        this.f63407O = sPzN;
        TFv.Wre wreAz = TFv.fuX.az(wreIF, wreIF2, sPzN, new CN3(null));
        this.J2 = wreAz;
        this.Uo = TFv.fuX.Xw(new Wre(wreAz), ViewModelKt.n(this), Ln.f10289n.nr(), new d3z.j(null, null));
    }

    public final void J2(Context context, d3z.Wre purchase) {
        fE.w6 w6VarX;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        YV.Wre wre = this.f63408n;
        fE.aC aCVar = wre instanceof fE.aC ? (fE.aC) wre : null;
        if (aCVar == null || (w6VarX = aCVar.X()) == null) {
            return;
        }
        GJW.C.nr(ViewModelKt.n(this), null, null, new I28(purchase, this, w6VarX, context, null), 3, null);
    }

    public final void O(Context context, Q purchase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        GJW.C.nr(RzR.f3449n, null, null, new Ml(context, "https://play.google.com/store/account/subscriptions?sku=" + purchase.n() + "&package=" + this.rl, null), 3, null);
    }

    public final rv6 nr() {
        return this.Uo;
    }
}
