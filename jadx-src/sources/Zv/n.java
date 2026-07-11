package Zv;

import Dk.InterfaceC1335n;
import GJW.C;
import GJW.vd;
import SpD.fuX;
import TFv.CN3;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements Zv.j {
    private static volatile boolean gh;
    public static final j mUb = new j(null);
    private final DataStore J2;
    private final long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f12608O;
    private final String Uo;
    private final PI.j nr;
    private final Function2 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1335n f12609t;
    private final Boolean xMQ;

    static final class I28 extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f12610O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f12611S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f12612Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f12614n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f12615o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f12616r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f12617t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12611S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return n.this.KN(null, null, this);
        }
    }

    public static final class Ml implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f12618n;

        public static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f12619n;

            /* JADX INFO: renamed from: Zv.n$Ml$j$j, reason: collision with other inner class name */
            public static final class C0458j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f12621n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f12622t;

                public C0458j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f12621n = obj;
                    this.f12622t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(CN3 cn3) {
                this.f12619n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0458j c0458j;
                if (continuation instanceof C0458j) {
                    c0458j = (C0458j) continuation;
                    int i2 = c0458j.f12622t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0458j.f12622t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0458j = new C0458j(continuation);
                    }
                }
                Object obj2 = c0458j.f12621n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0458j.f12622t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f12619n;
                    Object objRl = ((Preferences) obj).rl(Zv.w6.rl);
                    c0458j.f12622t = 1;
                    if (cn3.rl(objRl, c0458j) == coroutine_suspended) {
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

        public Ml(TFv.Wre wre) {
            this.f12618n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f12618n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12624n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f12625t;

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = n.this.new Wre(continuation);
            wre.f12625t = obj;
            return wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12624n == 0) {
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f12625t;
                mutablePreferences.mUb(Zv.w6.f12637n, n.this.Uo);
                mutablePreferences.mUb(Zv.w6.rl, String.valueOf(n.this.KN));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((Wre) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: Zv.n$n, reason: collision with other inner class name */
    static final class C0459n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12626n;

        /* JADX INFO: renamed from: Zv.n$n$j */
        static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ n f12628n;

            /* JADX INFO: renamed from: Zv.n$n$j$j, reason: collision with other inner class name */
            static final class C0460j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                int f12629O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f12630n;

                C0460j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f12630n = obj;
                    this.f12629O |= Integer.MIN_VALUE;
                    return j.this.n(false, this);
                }
            }

            j(n nVar) {
                this.f12628n = nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
            
                if (r6.KN(r7, r2, r0) == r1) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
            
                if (r6.KN(r7, r2, r0) == r1) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object n(boolean z2, Continuation continuation) {
                C0460j c0460j;
                if (continuation instanceof C0460j) {
                    c0460j = (C0460j) continuation;
                    int i2 = c0460j.f12629O;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0460j.f12629O = i2 - Integer.MIN_VALUE;
                    } else {
                        c0460j = new C0460j(continuation);
                    }
                }
                Object obj = c0460j.f12630n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0460j.f12629O;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (z2) {
                        if (n.gh) {
                            n nVar = this.f12628n;
                            fuX fux = fuX.f9951O;
                            DataStore dataStore = nVar.J2;
                            c0460j.f12629O = 2;
                        } else {
                            n nVar2 = this.f12628n;
                            fuX fux2 = fuX.f9954t;
                            DataStore dataStore2 = nVar2.J2;
                            c0460j.f12629O = 1;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    n.gh = true;
                }
                return Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0459n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C0459n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new C0459n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f12626n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreIk = TFv.fuX.Ik(n.this.nr.T());
                j jVar = new j(n.this);
                this.f12626n = 1;
                if (wreIk.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w6 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f12632n;

        public static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f12633n;

            /* JADX INFO: renamed from: Zv.n$w6$j$j, reason: collision with other inner class name */
            public static final class C0461j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f12635n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f12636t;

                public C0461j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f12635n = obj;
                    this.f12636t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(CN3 cn3) {
                this.f12633n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0461j c0461j;
                if (continuation instanceof C0461j) {
                    c0461j = (C0461j) continuation;
                    int i2 = c0461j.f12636t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0461j.f12636t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0461j = new C0461j(continuation);
                    }
                }
                Object obj2 = c0461j.f12635n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0461j.f12636t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f12633n;
                    Object objRl = ((Preferences) obj).rl(Zv.w6.f12637n);
                    c0461j.f12636t = 1;
                    if (cn3.rl(objRl, c0461j) == coroutine_suspended) {
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

        public w6(TFv.Wre wre) {
            this.f12632n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f12632n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public n(Function2 track, InterfaceC1335n concierge, PI.j lifecycleObserver, vd scope, DataStore dataStore, String appVersion, long j2, Boolean bool) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.rl = track;
        this.f12609t = concierge;
        this.nr = lifecycleObserver;
        this.f12608O = scope;
        this.J2 = dataStore;
        this.Uo = appVersion;
        this.KN = j2;
        this.xMQ = bool;
        if (bool != null) {
            gh = bool.booleanValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x020c, code lost:
    
        if (androidx.content.preferences.core.PreferencesKt.n(r13, r1, r2) != r3) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[PHI: r1 r4 r5 r7 r8 r10 r13
      0x0061: PHI (r1v40 java.lang.Object) = (r1v39 java.lang.Object), (r1v1 java.lang.Object) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r4v10 java.lang.String) = (r4v9 java.lang.String), (r4v21 java.lang.String) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v9 java.lang.String) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r7v10 java.lang.String) = (r7v9 java.lang.String), (r7v15 java.lang.String) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r8v3 SpD.fuX) = (r8v2 SpD.fuX), (r8v8 SpD.fuX) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r10v6 Zv.n) = (r10v5 Zv.n), (r10v16 Zv.n) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r13v9 androidx.datastore.core.DataStore) = (r13v8 androidx.datastore.core.DataStore), (r13v15 androidx.datastore.core.DataStore) binds: [B:49:0x01dc, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(fuX fux, DataStore dataStore, Continuation continuation) {
        I28 i28;
        fuX fux2;
        Ref.ObjectRef objectRef;
        TFv.Wre wre;
        Ref.ObjectRef objectRef2;
        TFv.Wre wre2;
        DataStore dataStore2;
        n nVar;
        Ref.ObjectRef objectRef3;
        DataStore dataStore3;
        fuX fux3;
        n nVar2;
        x0X.n nVar3;
        String str;
        Object objG;
        String str2;
        TFv.Wre wre3;
        fuX fux4;
        n nVar4;
        String str3;
        String str4;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.E2 = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objO = i28.f12611S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.E2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            w6 w6Var = new w6(dataStore.getData());
            Ml ml = new Ml(dataStore.getData());
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
            InterfaceC1335n interfaceC1335n = this.f12609t;
            Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.f51217O;
            i28.f12614n = this;
            fux2 = fux;
            i28.f12617t = fux2;
            i28.f12610O = dataStore;
            i28.J2 = w6Var;
            i28.f12616r = ml;
            i28.f12615o = objectRef4;
            i28.f12612Z = objectRef5;
            i28.E2 = 1;
            Object objO2 = interfaceC1335n.O(jVar, i28);
            if (objO2 != coroutine_suspended) {
                objectRef = objectRef4;
                objO = objO2;
                wre = w6Var;
                objectRef2 = objectRef5;
                wre2 = ml;
                dataStore2 = dataStore;
                nVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            objectRef2 = (Ref.ObjectRef) i28.f12612Z;
            objectRef = (Ref.ObjectRef) i28.f12615o;
            TFv.Wre wre4 = (TFv.Wre) i28.f12616r;
            TFv.Wre wre5 = (TFv.Wre) i28.J2;
            dataStore2 = (DataStore) i28.f12610O;
            fux2 = (fuX) i28.f12617t;
            n nVar5 = (n) i28.f12614n;
            ResultKt.throwOnFailure(objO);
            nVar = nVar5;
            wre2 = wre4;
            wre = wre5;
        } else {
            if (i3 == 2) {
                objectRef2 = (Ref.ObjectRef) i28.f12612Z;
                objectRef3 = (Ref.ObjectRef) i28.f12615o;
                TFv.Wre wre6 = (TFv.Wre) i28.f12616r;
                wre = (TFv.Wre) i28.J2;
                dataStore3 = (DataStore) i28.f12610O;
                fux3 = (fuX) i28.f12617t;
                nVar2 = (n) i28.f12614n;
                ResultKt.throwOnFailure(objO);
                wre2 = wre6;
                nVar3 = (x0X.n) objO;
                if (!(nVar3 instanceof n.C1266n)) {
                } else {
                    if (!(nVar3 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Id.Predefined.Internal internal = (Id.Predefined.Internal) ((n.w6) nVar3).n();
                    Intrinsics.checkNotNull(internal, "null cannot be cast to non-null type com.bendingspoons.concierge.domain.entities.Id.Predefined.Internal.NonBackupPersistentId");
                    ?? lowerCase = ((Id.Predefined.Internal.NonBackupPersistentId) internal).getCreationType().toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    objectRef2.element = lowerCase;
                }
                String str5 = (String) objectRef3.element;
                str = (String) objectRef2.element;
                i28.f12614n = nVar2;
                i28.f12617t = dataStore3;
                i28.f12610O = wre2;
                i28.J2 = fux3;
                i28.f12616r = str5;
                i28.f12615o = str;
                i28.f12612Z = null;
                i28.E2 = 3;
                objG = TFv.fuX.g(wre, i28);
                if (objG != coroutine_suspended) {
                    str2 = str5;
                    objO = objG;
                    wre3 = wre2;
                    fux4 = fux3;
                    nVar4 = nVar2;
                    str3 = str;
                    str4 = (String) objO;
                    i28.f12614n = nVar4;
                    i28.f12617t = dataStore3;
                    i28.f12610O = fux4;
                    i28.J2 = str2;
                    i28.f12616r = str3;
                    i28.f12615o = str4;
                    i28.E2 = 4;
                    objO = TFv.fuX.g(wre3, i28);
                    if (objO != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 3) {
                str = (String) i28.f12615o;
                String str6 = (String) i28.f12616r;
                fux4 = (fuX) i28.J2;
                wre3 = (TFv.Wre) i28.f12610O;
                DataStore dataStore4 = (DataStore) i28.f12617t;
                n nVar6 = (n) i28.f12614n;
                ResultKt.throwOnFailure(objO);
                str2 = str6;
                dataStore3 = dataStore4;
                nVar4 = nVar6;
                str3 = str;
                str4 = (String) objO;
                i28.f12614n = nVar4;
                i28.f12617t = dataStore3;
                i28.f12610O = fux4;
                i28.J2 = str2;
                i28.f12616r = str3;
                i28.f12615o = str4;
                i28.E2 = 4;
                objO = TFv.fuX.g(wre3, i28);
                if (objO != coroutine_suspended) {
                    String str7 = str2;
                    n nVar7 = nVar4;
                    String str8 = str3;
                    nVar7.rl.invoke("ping_android", SpD.CN3.n(new SpD.Wre(fux4, str7, str8, str4, (String) objO, nVar7.Uo)));
                    Wre wre7 = nVar7.new Wre(null);
                    i28.f12614n = null;
                    i28.f12617t = null;
                    i28.f12610O = null;
                    i28.J2 = null;
                    i28.f12616r = null;
                    i28.f12615o = null;
                    i28.E2 = 5;
                }
                return coroutine_suspended;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objO);
                return Unit.INSTANCE;
            }
            str4 = (String) i28.f12615o;
            str3 = (String) i28.f12616r;
            str2 = (String) i28.J2;
            fux4 = (fuX) i28.f12610O;
            DataStore dataStore5 = (DataStore) i28.f12617t;
            nVar4 = (n) i28.f12614n;
            ResultKt.throwOnFailure(objO);
            dataStore3 = dataStore5;
            String str72 = str2;
            n nVar72 = nVar4;
            String str82 = str3;
            nVar72.rl.invoke("ping_android", SpD.CN3.n(new SpD.Wre(fux4, str72, str82, str4, (String) objO, nVar72.Uo)));
            Wre wre72 = nVar72.new Wre(null);
            i28.f12614n = null;
            i28.f12617t = null;
            i28.f12610O = null;
            i28.J2 = null;
            i28.f12616r = null;
            i28.f12615o = null;
            i28.E2 = 5;
        }
        x0X.n nVar8 = (x0X.n) objO;
        if (nVar8 instanceof n.C1266n) {
        } else {
            if (!(nVar8 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Id.Predefined.Internal internal2 = (Id.Predefined.Internal) ((n.w6) nVar8).n();
            Intrinsics.checkNotNull(internal2, "null cannot be cast to non-null type com.bendingspoons.concierge.domain.entities.Id.Predefined.Internal.BackupPersistentId");
            ?? lowerCase2 = ((Id.Predefined.Internal.BackupPersistentId) internal2).getCreationType().toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            objectRef.element = lowerCase2;
        }
        InterfaceC1335n interfaceC1335n2 = nVar.f12609t;
        Id.Predefined.Internal.j jVar2 = Id.Predefined.Internal.j.J2;
        i28.f12614n = nVar;
        i28.f12617t = fux2;
        i28.f12610O = dataStore2;
        i28.J2 = wre;
        i28.f12616r = wre2;
        i28.f12615o = objectRef;
        i28.f12612Z = objectRef2;
        i28.E2 = 2;
        objO = interfaceC1335n2.O(jVar2, i28);
        if (objO != coroutine_suspended) {
            objectRef3 = objectRef;
            dataStore3 = dataStore2;
            fux3 = fux2;
            nVar2 = nVar;
            nVar3 = (x0X.n) objO;
            if (!(nVar3 instanceof n.C1266n)) {
            }
            String str52 = (String) objectRef3.element;
            str = (String) objectRef2.element;
            i28.f12614n = nVar2;
            i28.f12617t = dataStore3;
            i28.f12610O = wre2;
            i28.J2 = fux3;
            i28.f12616r = str52;
            i28.f12615o = str;
            i28.f12612Z = null;
            i28.E2 = 3;
            objG = TFv.fuX.g(wre, i28);
            if (objG != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // Zv.j
    public void n() {
        C.nr(this.f12608O, null, null, new C0459n(null), 3, null);
    }
}
