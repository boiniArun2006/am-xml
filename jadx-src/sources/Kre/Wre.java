package Kre;

import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings;
import com.safedk.android.analytics.events.base.StatsEvent;
import kotlin.Lazy;
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
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre implements I28 {
    private final Preferences.Key nr;
    private final Lazy rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f5871t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final j f5870O = new j(null);
    public static final int J2 = 8;

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ SpiderSenseServerSettings f5872O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5873n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5875n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SpiderSenseServerSettings f5876t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(SpiderSenseServerSettings spiderSenseServerSettings, Continuation continuation) {
                super(2, continuation);
                this.f5876t = spiderSenseServerSettings;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f5876t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5875n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.f5876t;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SpiderSenseServerSettings spiderSenseServerSettings, Continuation continuation) {
                return ((j) create(spiderSenseServerSettings, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Wre f5877O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5878n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f5879t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(Wre wre, Continuation continuation) {
                super(2, continuation);
                this.f5877O = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f5877O, continuation);
                nVar.f5879t = obj;
                return nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f5878n == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.f5879t).mUb(this.f5877O.nr, Boxing.boxLong(System.currentTimeMillis()));
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
        Ml(SpiderSenseServerSettings spiderSenseServerSettings, Continuation continuation) {
            super(1, continuation);
            this.f5872O = spiderSenseServerSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Wre.this.new Ml(this.f5872O, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (androidx.content.preferences.core.PreferencesKt.n(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5873n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                DataStore dataStoreUo = Wre.this.Uo();
                j jVar = new j(this.f5872O, null);
                this.f5873n = 1;
                if (dataStoreUo.n(jVar, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            DataStore dataStoreKN = Wre.this.KN();
            n nVar = new n(Wre.this, null);
            this.f5873n = 2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5880n;

        n(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Wre.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5880n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException(inFlMLxL.sqyQecAeud);
            }
            ResultKt.throwOnFailure(obj);
            TFv.Wre data = Wre.this.Uo().getData();
            this.f5880n = 1;
            Object objG = TFv.fuX.g(data, this);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objG;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5883n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5884t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5884t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Wre.this.t(this);
        }
    }

    public Wre(Lazy lazyDataStore, Lazy lazyPreferencesDataStore) {
        Intrinsics.checkNotNullParameter(lazyDataStore, "lazyDataStore");
        Intrinsics.checkNotNullParameter(lazyPreferencesDataStore, "lazyPreferencesDataStore");
        this.rl = lazyDataStore;
        this.f5871t = lazyPreferencesDataStore;
        this.nr = PreferencesKeys.J2(StatsEvent.f62824A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStore KN() {
        return (DataStore) this.f5871t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStore Uo() {
        return (DataStore) this.rl.getValue();
    }

    @Override // Kre.I28
    public Object n(Continuation continuation) {
        return x0X.w6.Uo(new n(null), continuation);
    }

    @Override // Kre.I28
    public Object rl(SpiderSenseServerSettings spiderSenseServerSettings, Continuation continuation) {
        return x0X.w6.Uo(new Ml(spiderSenseServerSettings, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Kre.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        w6 w6Var;
        Wre wre;
        Long l2;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objG = w6Var.f5884t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objG);
            TFv.Wre data = KN().getData();
            w6Var.f5883n = this;
            w6Var.J2 = 1;
            objG = TFv.fuX.g(data, w6Var);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
            wre = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre = (Wre) w6Var.f5883n;
            ResultKt.throwOnFailure(objG);
        }
        Preferences preferences = (Preferences) objG;
        if (preferences == null || (l2 = (Long) preferences.rl(wre.nr)) == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m1650boximpl(DurationKt.toDuration(System.currentTimeMillis() - jLongValue, DurationUnit.MILLISECONDS));
    }
}
