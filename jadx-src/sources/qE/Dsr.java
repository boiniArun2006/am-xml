package qE;

import ajd.j;
import android.os.Build;
import android.os.Trace;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import com.bendingspoons.oracle.models.OracleResponse;
import com.safedk.android.analytics.events.base.StatsEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr implements qE.fuX {
    private final Preferences.Key J2;
    private final TFv.Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Preferences.Key f72138O;
    private final Preferences.Key Uo;
    private final rB.Ml nr;
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataStore f72139t;
    private final TFv.Wre xMQ;
    private static final j mUb = new j(null);
    public static final int gh = 8;

    static final class C extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f72140O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f72141n;

        C(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72141n = obj;
            this.f72140O |= Integer.MIN_VALUE;
            return Dsr.this.rl(this);
        }
    }

    public static final class CN3 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f72143n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f72144t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f72145n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Dsr f72146t;

            /* JADX INFO: renamed from: qE.Dsr$CN3$j$j, reason: collision with other inner class name */
            public static final class C1109j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f72148n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f72149t;

                public C1109j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f72148n = obj;
                    this.f72149t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, Dsr dsr) {
                this.f72145n = cn3;
                this.f72146t = dsr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1109j c1109j;
                if (continuation instanceof C1109j) {
                    c1109j = (C1109j) continuation;
                    int i2 = c1109j.f72149t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1109j.f72149t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1109j = new C1109j(continuation);
                    }
                }
                Object obj2 = c1109j.f72148n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1109j.f72149t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f72145n;
                    Object objRl = ((Preferences) obj).rl(this.f72146t.Uo);
                    c1109j.f72149t = 1;
                    if (cn3.rl(objRl, c1109j) == coroutine_suspended) {
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

        public CN3(TFv.Wre wre, Dsr dsr) {
            this.f72143n = wre;
            this.f72144t = dsr;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f72143n.n(new j(cn3, this.f72144t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: qE.Dsr$Dsr, reason: collision with other inner class name */
    static final class C1110Dsr extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f72150O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72151n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72152r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f72153t;

        C1110Dsr(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72150O = obj;
            this.f72152r |= Integer.MIN_VALUE;
            return Dsr.this.t(null, null, this);
        }
    }

    static final class I28 extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72155n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f72156t;

        I28(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            I28 i28 = Dsr.this.new I28(continuation);
            i28.f72156t = cn3;
            return i28.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72155n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f72156t;
                rB.I28.rl(Dsr.this.nr, CollectionsKt.listOf("read_state"), j.EnumC0481j.J2, "Could not read settings hash", null, null, 24, null);
                this.f72155n = 1;
                if (cn3.rl(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f72157O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72158n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f72159t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(String str, int i2, Continuation continuation) {
            super(2, continuation);
            this.f72159t = str;
            this.f72157O = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f72159t, this.f72157O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72158n == 0) {
                ResultKt.throwOnFailure(obj);
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection(this.f72159t, this.f72157O);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OracleResponse oracleResponse, Continuation continuation) {
            return ((Ml) create(oracleResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class Wre implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f72160n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f72161t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f72162n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Dsr f72163t;

            /* JADX INFO: renamed from: qE.Dsr$Wre$j$j, reason: collision with other inner class name */
            public static final class C1111j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f72165n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f72166t;

                public C1111j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f72165n = obj;
                    this.f72166t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, Dsr dsr) {
                this.f72162n = cn3;
                this.f72163t = dsr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1111j c1111j;
                if (continuation instanceof C1111j) {
                    c1111j = (C1111j) continuation;
                    int i2 = c1111j.f72166t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1111j.f72166t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1111j = new C1111j(continuation);
                    }
                }
                Object obj2 = c1111j.f72165n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1111j.f72166t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f72162n;
                    String str = (String) ((Preferences) obj).rl(this.f72163t.J2);
                    String string = str != null ? str.toString() : null;
                    c1111j.f72166t = 1;
                    if (cn3.rl(string, c1111j) == coroutine_suspended) {
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

        public Wre(TFv.Wre wre, Dsr dsr) {
            this.f72160n = wre;
            this.f72161t = dsr;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f72160n.n(new j(cn3, this.f72161t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class aC extends SuspendLambda implements Function1 {
        final /* synthetic */ Integer J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ OracleResponse f72167O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72168n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f72170n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ OracleResponse f72171t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(OracleResponse oracleResponse, Continuation continuation) {
                super(2, continuation);
                this.f72171t = oracleResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f72171t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f72170n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.f72171t;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(OracleResponse oracleResponse, Continuation continuation) {
                return ((j) create(oracleResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ OracleResponse J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Dsr f72172O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f72173n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Integer f72174r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f72175t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(Dsr dsr, OracleResponse oracleResponse, Integer num, Continuation continuation) {
                super(2, continuation);
                this.f72172O = dsr;
                this.J2 = oracleResponse;
                this.f72174r = num;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f72172O, this.J2, this.f72174r, continuation);
                nVar.f72175t = obj;
                return nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f72173n == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutablePreferences mutablePreferences = (MutablePreferences) this.f72175t;
                    mutablePreferences.mUb(this.f72172O.f72138O, Boxing.boxLong(System.currentTimeMillis()));
                    String settingsHash = this.J2.getSettingsHash();
                    Dsr dsr = this.f72172O;
                    if (settingsHash != null) {
                        mutablePreferences.mUb(dsr.J2, settingsHash);
                    } else {
                        mutablePreferences.xMQ(dsr.J2);
                    }
                    Integer num = this.f72174r;
                    if (num != null) {
                        mutablePreferences.mUb(this.f72172O.Uo, Boxing.boxInt(num.intValue()));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                return ((n) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aC(OracleResponse oracleResponse, Integer num, Continuation continuation) {
            super(1, continuation);
            this.f72167O = oracleResponse;
            this.J2 = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Dsr.this.new aC(this.f72167O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72168n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStore = Dsr.this.rl;
                j jVar = new j(this.f72167O, null);
                this.f72168n = 1;
                if (dataStore.n(jVar, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            DataStore dataStore2 = Dsr.this.f72139t;
            n nVar = new n(Dsr.this, this.f72167O, this.J2, null);
            this.f72168n = 2;
            Object objN = PreferencesKt.n(dataStore2, nVar, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((aC) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class fuX implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f72176n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f72177t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f72178n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Dsr f72179t;

            /* JADX INFO: renamed from: qE.Dsr$fuX$j$j, reason: collision with other inner class name */
            public static final class C1112j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f72181n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f72182t;

                public C1112j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f72181n = obj;
                    this.f72182t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, Dsr dsr) {
                this.f72178n = cn3;
                this.f72179t = dsr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1112j c1112j;
                if (continuation instanceof C1112j) {
                    c1112j = (C1112j) continuation;
                    int i2 = c1112j.f72182t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1112j.f72182t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1112j = new C1112j(continuation);
                    }
                }
                Object obj2 = c1112j.f72181n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1112j.f72182t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f72178n;
                    Object objRl = ((Preferences) obj).rl(this.f72179t.f72138O);
                    c1112j.f72182t = 1;
                    if (cn3.rl(objRl, c1112j) == coroutine_suspended) {
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

        public fuX(TFv.Wre wre, Dsr dsr) {
            this.f72176n = wre;
            this.f72177t = dsr;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f72176n.n(new j(cn3, this.f72177t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72184n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f72185t;

        n(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            n nVar = Dsr.this.new n(continuation);
            nVar.f72185t = cn3;
            return nVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72184n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f72185t;
                rB.I28.rl(Dsr.this.nr, CollectionsKt.listOf("read_state"), j.EnumC0481j.J2, "Could not read Oracle Response", null, null, 24, null);
                this.f72184n = 1;
                if (cn3.rl(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f72186O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72187n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f72188t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, int i2, Continuation continuation) {
            super(2, continuation);
            this.f72188t = str;
            this.f72186O = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f72188t, this.f72186O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72187n == 0) {
                ResultKt.throwOnFailure(obj);
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.beginAsyncSection(this.f72188t, this.f72186O);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((w6) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Dsr(DataStore dataStore, DataStore preferencesDataStore, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(preferencesDataStore, "preferencesDataStore");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.rl = dataStore;
        this.f72139t = preferencesDataStore;
        this.nr = d3.j.J2(spiderSense, "oracle", "persistence");
        this.f72138O = PreferencesKeys.J2(StatsEvent.f62824A);
        this.J2 = PreferencesKeys.Uo("settings_hash");
        this.Uo = PreferencesKeys.O("force_refresh_id");
        this.KN = TFv.fuX.Uo(new Wre(preferencesDataStore.getData(), this), new I28(null));
        this.xMQ = new CN3(preferencesDataStore.getData(), this);
    }

    @Override // qE.fuX
    public TFv.Wre O() {
        return new fuX(this.f72139t.getData(), this);
    }

    @Override // qE.fuX
    public TFv.Wre getResponse() {
        int iNextInt = Random.INSTANCE.nextInt();
        return TFv.fuX.s7N(TFv.fuX.v(TFv.fuX.Uo(this.rl.getData(), new n(null)), new w6("[custom] OracleResponseDataStoreImpl.response:collect", iNextInt, null)), new Ml("[custom] OracleResponseDataStoreImpl.response:collect", iNextInt, null));
    }

    @Override // qE.fuX
    public TFv.Wre n() {
        return this.KN;
    }

    @Override // qE.fuX
    public TFv.Wre nr() {
        return this.xMQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qE.fuX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        C c2;
        if (continuation instanceof C) {
            c2 = (C) continuation;
            int i2 = c2.f72140O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2.f72140O = i2 - Integer.MIN_VALUE;
            } else {
                c2 = new C(continuation);
            }
        }
        Object objG = c2.f72141n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c2.f72140O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            TFv.Wre wreO = O();
            c2.f72140O = 1;
            objG = TFv.fuX.g(wreO, c2);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objG);
        }
        Long l2 = (Long) objG;
        if (l2 == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1650boximpl(DurationKt.toDuration(System.currentTimeMillis() - jLongValue, DurationUnit.MILLISECONDS));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:25:0x0085, B:27:0x008b, B:30:0x00ac, B:28:0x00a8, B:34:0x00b4, B:35:0x00b9), top: B:43:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:25:0x0085, B:27:0x008b, B:30:0x00ac, B:28:0x00a8, B:34:0x00b4, B:35:0x00b9), top: B:43:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qE.fuX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(OracleResponse oracleResponse, Integer num, Continuation continuation) throws Throwable {
        C1110Dsr c1110Dsr;
        Throwable th;
        boolean z2;
        Dsr dsr;
        x0X.n nVar;
        if (continuation instanceof C1110Dsr) {
            c1110Dsr = (C1110Dsr) continuation;
            int i2 = c1110Dsr.f72152r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1110Dsr.f72152r = i2 - Integer.MIN_VALUE;
            } else {
                c1110Dsr = new C1110Dsr(continuation);
            }
        }
        Object objUo = c1110Dsr.f72150O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1110Dsr.f72152r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Pair pairN = oZ.j.n();
            String str = (String) pairN.component1();
            String str2 = (String) pairN.component2();
            boolean zKN = androidx.tracing.Trace.KN();
            if (zKN) {
                androidx.tracing.Trace.t("[custom] " + str + "." + str2);
            }
            try {
                aC aCVar = new aC(oracleResponse, num, null);
                c1110Dsr.f72151n = this;
                c1110Dsr.f72153t = zKN;
                c1110Dsr.f72152r = 1;
                objUo = x0X.w6.Uo(aCVar, c1110Dsr);
                if (objUo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dsr = this;
                z2 = zKN;
                nVar = (x0X.n) objUo;
                if (!(nVar instanceof n.C1266n)) {
                }
                Unit unit = Unit.INSTANCE;
                if (z2) {
                }
                return unit;
            } catch (Throwable th2) {
                th = th2;
                z2 = zKN;
                if (z2) {
                    throw th;
                }
                androidx.tracing.Trace.J2();
                throw th;
            }
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z2 = c1110Dsr.f72153t;
        dsr = (Dsr) c1110Dsr.f72151n;
        try {
            ResultKt.throwOnFailure(objUo);
            nVar = (x0X.n) objUo;
            if (!(nVar instanceof n.C1266n)) {
                rB.I28.rl(dsr.nr, CollectionsKt.listOf("write_state"), j.EnumC0481j.J2, "Could not persist Oracle Response.", null, null, 24, null);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit2 = Unit.INSTANCE;
            if (z2) {
                androidx.tracing.Trace.J2();
            }
            return unit2;
        } catch (Throwable th3) {
            th = th3;
            if (z2) {
            }
        }
    }
}
