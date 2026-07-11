package X9;

import X9.j;
import androidx.content.core.DataStore;
import ifA.w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rB.Wre;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements AE.I28 {
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f11765t;
    private static final C0425j nr = new C0425j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f11764O = 8;

    static final class I28 extends SuspendLambda implements Function1 {
        final /* synthetic */ j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f11766O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11767n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f11768t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(String str, j jVar, Continuation continuation) {
            super(1, continuation);
            this.f11766O = str;
            this.J2 = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f11766O, this.J2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(String str, Wre.n nVar) {
            nVar.xMQ(str);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11768t;
            if (i2 != 0) {
                if (i2 == 1) {
                    String str = (String) this.f11767n;
                    ResultKt.throwOnFailure(obj);
                    return str;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final String str2 = this.f11766O;
            DataStore dataStore = this.J2.rl;
            Function1 function1 = new Function1() { // from class: X9.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return j.I28.xMQ(str2, (Wre.n) obj2);
                }
            };
            this.f11767n = str2;
            this.f11768t = 1;
            if (nKx.j.nr(dataStore, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return str2;
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11769n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11769n == 0) {
                ResultKt.throwOnFailure(obj);
                return j.this.f11765t.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: X9.j$j, reason: collision with other inner class name */
    private static final class C0425j {
        public /* synthetic */ C0425j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0425j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ifA.w6 J2(Throwable th) {
            return new ifA.w6("UserInfoStorageManager", w6.n.f68149n, w6.j.f68145n, "The proto datastore raised an exception when trying to store user id.", th, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ifA.w6 O(Throwable th) {
            return new ifA.w6("UserInfoStorageManager", w6.n.f68149n, w6.j.f68145n, "The proto datastore raised an exception when trying to access user id.", th, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ifA.w6 nr(Throwable th) {
            return new ifA.w6("UserInfoStorageManager", w6.n.f68148O, w6.j.f68145n, "The id generator raised an exception when generating an id.", th, null, 32, null);
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11772n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11773t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11773t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.n(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11774n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11774n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = j.this.rl;
                Wre wreMUb = Wre.mUb();
                this.f11774n = 1;
                obj = nKx.j.rl(dataStore, wreMUb, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Wre wre = (Wre) obj;
            if (wre.qie()) {
                return wre.gh();
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public j(DataStore userInfoDatastore, Function0 userIdGenerator) {
        Intrinsics.checkNotNullParameter(userInfoDatastore, "userInfoDatastore");
        Intrinsics.checkNotNullParameter(userIdGenerator, "userIdGenerator");
        this.rl = userInfoDatastore;
        this.f11765t = userIdGenerator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r9 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        if (r9 == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // AE.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        j jVar;
        x0X.n c1266n;
        x0X.n w6Var;
        boolean z2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objUo = nVar.f11773t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            w6 w6Var2 = new w6(null);
            nVar.f11772n = this;
            nVar.J2 = 1;
            objUo = x0X.w6.Uo(w6Var2, nVar);
            if (objUo != coroutine_suspended) {
                jVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            jVar = (j) nVar.f11772n;
            ResultKt.throwOnFailure(objUo);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUo);
                c1266n = (x0X.n) objUo;
                if (c1266n instanceof n.C1266n) {
                    c1266n = new n.C1266n(nr.J2((Throwable) ((n.C1266n) c1266n).n()));
                } else if (!(c1266n instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c1266n instanceof n.C1266n) {
                    ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
                    return c1266n;
                }
                if (c1266n instanceof n.w6) {
                    return c1266n;
                }
                throw new NoWhenBranchMatchedException();
            }
            jVar = (j) nVar.f11772n;
            ResultKt.throwOnFailure(objUo);
            c1266n = (x0X.n) objUo;
            if (c1266n instanceof n.C1266n) {
                w6Var = new n.C1266n(nr.nr((Throwable) ((n.C1266n) c1266n).n()));
                c1266n = w6Var;
                z2 = c1266n instanceof n.C1266n;
                if (!z2) {
                    ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
                } else if (!(c1266n instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!z2) {
                    if (!(c1266n instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    I28 i28 = new I28((String) ((n.w6) c1266n).n(), jVar, null);
                    nVar.f11772n = null;
                    nVar.J2 = 3;
                    objUo = x0X.w6.Uo(i28, nVar);
                }
                if (c1266n instanceof n.C1266n) {
                }
            } else {
                if (!(c1266n instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = c1266n instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
                if (c1266n instanceof n.C1266n) {
                }
            }
        }
        c1266n = (x0X.n) objUo;
        if (c1266n instanceof n.C1266n) {
            c1266n = new n.C1266n(nr.O((Throwable) ((n.C1266n) c1266n).n()));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z3 = c1266n instanceof n.C1266n;
        if (z3) {
            ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z3) {
            z2 = c1266n instanceof n.C1266n;
            if (!z2) {
            }
            if (!z2) {
            }
            if (c1266n instanceof n.C1266n) {
            }
        } else {
            if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = (String) ((n.w6) c1266n).n();
            if (str != null) {
                w6Var = new n.w6(str);
                c1266n = w6Var;
                z2 = c1266n instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
                if (c1266n instanceof n.C1266n) {
                }
            } else {
                Ml ml = jVar.new Ml(null);
                nVar.f11772n = jVar;
                nVar.J2 = 2;
                objUo = x0X.w6.Uo(ml, nVar);
            }
        }
        return coroutine_suspended;
    }
}
