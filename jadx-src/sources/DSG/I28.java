package DSG;

import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import bH.CN3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements DSG.Ml {
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3.n.C0572n f1418t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f1417O = 8;
    private static final Preferences.Key J2 = PreferencesKeys.n("is_pinned");
    private static final Preferences.Key Uo = PreferencesKeys.nr("last_position_x");
    private static final Preferences.Key KN = PreferencesKeys.nr("last_position_y");

    /* JADX INFO: renamed from: DSG.I28$I28, reason: collision with other inner class name */
    static final class C0051I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ DSG.j f1419O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1420n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1421t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0051I28(DSG.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f1419O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0051I28 c0051i28 = new C0051I28(this.f1419O, continuation);
            c0051i28.f1421t = obj;
            return c0051i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1420n == 0) {
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f1421t;
                mutablePreferences.mUb(I28.Uo, Boxing.boxFloat(this.f1419O.rl()));
                mutablePreferences.mUb(I28.KN, Boxing.boxFloat(this.f1419O.t()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((C0051I28) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class Ml implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f1422n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ I28 f1423t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f1424n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f1425t;

            /* JADX INFO: renamed from: DSG.I28$Ml$j$j, reason: collision with other inner class name */
            public static final class C0052j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f1427n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f1428t;

                public C0052j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f1427n = obj;
                    this.f1428t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, I28 i28) {
                this.f1424n = cn3;
                this.f1425t = i28;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0052j c0052j;
                if (continuation instanceof C0052j) {
                    c0052j = (C0052j) continuation;
                    int i2 = c0052j.f1428t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0052j.f1428t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0052j = new C0052j(continuation);
                    }
                }
                Object obj2 = c0052j.f1427n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0052j.f1428t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f1424n;
                    Boolean bool = (Boolean) ((Preferences) obj).rl(I28.J2);
                    Boolean boolBoxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : this.f1425t.f1418t.rl());
                    c0052j.f1428t = 1;
                    if (cn3.rl(boolBoxBoolean, c0052j) == coroutine_suspended) {
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

        public Ml(TFv.Wre wre, I28 i28) {
            this.f1422n = wre;
            this.f1423t = i28;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f1422n.n(new j(cn3, this.f1423t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f1429O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1430n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1431t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f1429O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f1429O, continuation);
            wre.f1431t = obj;
            return wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f1430n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f1431t).mUb(I28.J2, Boxing.boxBoolean(this.f1429O));
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

    public static final class n implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f1432n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f1433n;

            /* JADX INFO: renamed from: DSG.I28$n$j$j, reason: collision with other inner class name */
            public static final class C0053j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f1435n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f1436t;

                public C0053j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f1435n = obj;
                    this.f1436t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f1433n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0053j c0053j;
                if (continuation instanceof C0053j) {
                    c0053j = (C0053j) continuation;
                    int i2 = c0053j.f1436t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0053j.f1436t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0053j = new C0053j(continuation);
                    }
                }
                Object obj2 = c0053j.f1435n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0053j.f1436t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f1433n;
                    Preferences preferences = (Preferences) obj;
                    Float f3 = (Float) preferences.rl(I28.Uo);
                    DSG.j jVar = null;
                    if (f3 != null) {
                        float fFloatValue = f3.floatValue();
                        Float f4 = (Float) preferences.rl(I28.KN);
                        if (f4 != null) {
                            jVar = new DSG.j(fFloatValue, f4.floatValue());
                        }
                    }
                    c0053j.f1436t = 1;
                    if (cn3.rl(jVar, c0053j) == coroutine_suspended) {
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

        public n(TFv.Wre wre) {
            this.f1432n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f1432n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f1438n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1439t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1439t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.nr(this);
        }
    }

    public I28(DataStore dataStore, CN3.n.C0572n config) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(config, "config");
        this.rl = dataStore;
        this.f1418t = config;
    }

    @Override // DSG.Ml
    public TFv.Wre n() {
        return new Ml(this.rl.getData(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // DSG.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Continuation continuation) {
        w6 w6Var;
        I28 i28;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objG = w6Var.f1439t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            n nVar = new n(this.rl.getData());
            w6Var.f1438n = this;
            w6Var.J2 = 1;
            objG = TFv.fuX.g(nVar, w6Var);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            i28 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i28 = (I28) w6Var.f1438n;
            ResultKt.throwOnFailure(objG);
        }
        DSG.j jVar = (DSG.j) objG;
        return jVar == null ? i28.f1418t.n() : jVar;
    }

    @Override // DSG.Ml
    public Object rl(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(this.rl, new Wre(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // DSG.Ml
    public Object t(DSG.j jVar, Continuation continuation) {
        Object objN = PreferencesKt.n(this.rl, new C0051I28(jVar, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }
}
