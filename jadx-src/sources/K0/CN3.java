package K0;

import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 implements K0.Wre {
    public static final j KN = new j(null);
    public static final int xMQ = 8;
    private final TFv.Wre J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TFv.Wre f4734O;
    private final TFv.Wre Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f4735n;
    private final Preferences.Key nr;
    private final Preferences.Key rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Preferences.Key f4736t;

    /* JADX INFO: renamed from: K0.CN3$CN3, reason: collision with other inner class name */
    static final class C0165CN3 extends SuspendLambda implements Function1 {
        final /* synthetic */ Preferences.Key J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f4737O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4738n;

        /* JADX INFO: renamed from: K0.CN3$CN3$j */
        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ Preferences.Key J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f4740O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4741n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f4742t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Object obj, Preferences.Key key, Continuation continuation) {
                super(2, continuation);
                this.f4740O = obj;
                this.J2 = key;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f4740O, this.J2, continuation);
                jVar.f4742t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4741n == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutablePreferences mutablePreferences = (MutablePreferences) this.f4742t;
                    Object obj2 = this.f4740O;
                    if (obj2 != null) {
                        mutablePreferences.mUb(this.J2, obj2);
                    } else {
                        mutablePreferences.xMQ(this.J2);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                return ((j) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0165CN3(Object obj, Preferences.Key key, Continuation continuation) {
            super(1, continuation);
            this.f4737O = obj;
            this.J2 = key;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new C0165CN3(this.f4737O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4738n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = CN3.this.f4735n;
                j jVar = new j(this.f4737O, this.J2, null);
                this.f4738n = 1;
                if (PreferencesKt.n(dataStore, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0165CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class I28 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4743n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CN3 f4744t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4745n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CN3 f4746t;

            /* JADX INFO: renamed from: K0.CN3$I28$j$j, reason: collision with other inner class name */
            public static final class C0166j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4748n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4749t;

                public C0166j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4748n = obj;
                    this.f4749t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, CN3 cn32) {
                this.f4745n = cn3;
                this.f4746t = cn32;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0166j c0166j;
                if (continuation instanceof C0166j) {
                    c0166j = (C0166j) continuation;
                    int i2 = c0166j.f4749t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0166j.f4749t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0166j = new C0166j(continuation);
                    }
                }
                Object obj2 = c0166j.f4748n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0166j.f4749t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4745n;
                    Boolean bool = (Boolean) ((Preferences) obj).rl(this.f4746t.f4736t);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                    c0166j.f4749t = 1;
                    if (cn3.rl(boolBoxBoolean, c0166j) == coroutine_suspended) {
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

        public I28(TFv.Wre wre, CN3 cn3) {
            this.f4743n = wre;
            this.f4744t = cn3;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4743n.n(new j(cn3, this.f4744t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class Ml implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4750n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CN3 f4751t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4752n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CN3 f4753t;

            /* JADX INFO: renamed from: K0.CN3$Ml$j$j, reason: collision with other inner class name */
            public static final class C0167j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4755n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4756t;

                public C0167j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4755n = obj;
                    this.f4756t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, CN3 cn32) {
                this.f4752n = cn3;
                this.f4753t = cn32;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0167j c0167j;
                if (continuation instanceof C0167j) {
                    c0167j = (C0167j) continuation;
                    int i2 = c0167j.f4756t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0167j.f4756t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0167j = new C0167j(continuation);
                    }
                }
                Object obj2 = c0167j.f4755n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0167j.f4756t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4752n;
                    Boolean bool = (Boolean) ((Preferences) obj).rl(this.f4753t.rl);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                    c0167j.f4756t = 1;
                    if (cn3.rl(boolBoxBoolean, c0167j) == coroutine_suspended) {
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

        public Ml(TFv.Wre wre, CN3 cn3) {
            this.f4750n = wre;
            this.f4751t = cn3;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4750n.n(new j(cn3, this.f4751t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class Wre implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4757n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CN3 f4758t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4759n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CN3 f4760t;

            /* JADX INFO: renamed from: K0.CN3$Wre$j$j, reason: collision with other inner class name */
            public static final class C0168j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4762n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4763t;

                public C0168j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4762n = obj;
                    this.f4763t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, CN3 cn32) {
                this.f4759n = cn3;
                this.f4760t = cn32;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0168j c0168j;
                if (continuation instanceof C0168j) {
                    c0168j = (C0168j) continuation;
                    int i2 = c0168j.f4763t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0168j.f4763t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0168j = new C0168j(continuation);
                    }
                }
                Object obj2 = c0168j.f4762n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0168j.f4763t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4759n;
                    Object objRl = ((Preferences) obj).rl(this.f4760t.nr);
                    c0168j.f4763t = 1;
                    if (cn3.rl(objRl, c0168j) == coroutine_suspended) {
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

        public Wre(TFv.Wre wre, CN3 cn3) {
            this.f4757n = wre;
            this.f4758t = cn3;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4757n.n(new j(cn3, this.f4758t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4764O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4765n;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4765n = obj;
            this.f4764O |= Integer.MIN_VALUE;
            return CN3.this.n(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4767n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4769n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f4770t;

            j(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(continuation);
                jVar.f4770t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f4769n == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.f4770t).J2();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                return ((j) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return CN3.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4767n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = CN3.this.f4735n;
                j jVar = new j(null);
                this.f4767n = 1;
                if (PreferencesKt.n(dataStore, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public CN3(DataStore datastore) {
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        this.f4735n = datastore;
        this.rl = PreferencesKeys.n("force-tos-update-key");
        this.f4736t = PreferencesKeys.n("force-pn-update-key");
        this.nr = PreferencesKeys.Uo("custom-tos-update-message-key");
        this.f4734O = new Ml(datastore.getData(), this);
        this.J2 = new I28(datastore.getData(), this);
        this.Uo = new Wre(datastore.getData(), this);
    }

    private final Object qie(Preferences.Key key, Object obj, Continuation continuation) {
        return x0X.w6.Uo(new C0165CN3(obj, key, null), continuation);
    }

    @Override // K0.Wre
    public Object J2(boolean z2, Continuation continuation) {
        return qie(this.f4736t, Boxing.boxBoolean(z2), continuation);
    }

    @Override // K0.Wre
    public Object O(String str, Continuation continuation) {
        return qie(this.nr, str, continuation);
    }

    @Override // K0.Wre
    public TFv.Wre Uo() {
        return this.Uo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // K0.Wre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f4764O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f4764O = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objUo = nVar.f4765n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f4764O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            w6 w6Var = new w6(null);
            nVar.f4764O = 1;
            objUo = x0X.w6.Uo(w6Var, nVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar2 = (x0X.n) objUo;
        if (nVar2 instanceof n.C1266n) {
            return new n.C1266n(Unit.INSTANCE);
        }
        if (nVar2 instanceof n.w6) {
            return nVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // K0.Wre
    public Object nr(boolean z2, Continuation continuation) {
        return qie(this.rl, Boxing.boxBoolean(z2), continuation);
    }

    @Override // K0.Wre
    public TFv.Wre rl() {
        return this.f4734O;
    }

    @Override // K0.Wre
    public TFv.Wre t() {
        return this.J2;
    }
}
