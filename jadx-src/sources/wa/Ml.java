package wa;

import GJW.Lu;
import GJW.OU;
import GJW.ci;
import GJW.r;
import GJW.vd;
import KW9.n;
import YV.Wre;
import YV.Xo;
import YV.eO;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import com.bendingspoons.injet.module.MonetizationModule;
import com.bendingspoons.monopoly.product.SubscriptionProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml extends MonetizationModule {
    private final rB.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f75013O;
    private final r Uo;
    private final PI.w6 nr;
    private final YV.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataStore f75014t;
    public static final j KN = new j(null);
    public static final int xMQ = 8;
    private static final Preferences.Key mUb = PreferencesKeys.O("paywall_hits");
    private static final Preferences.Key gh = PreferencesKeys.n("has_migrated_paywall_hits");
    private static final ReadOnlyProperty qie = PreferenceDataStoreDelegateKt.rl("injet_monetization", new ReplaceFileCorruptionHandler(new Function1() { // from class: wa.w6
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Ml.Ik((CorruptionException) obj);
        }
    }), null, null, 12, null);

    static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75016n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75017t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new C(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r rVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75017t;
            if (i2 != 0) {
                if (i2 == 1) {
                    rVar = (r) this.f75016n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                r rVar2 = Ml.this.Uo;
                YV.Wre wre = Ml.this.rl;
                this.f75016n = rVar2;
                this.f75017t = 1;
                Object objAz = wre.az(this);
                if (objAz == coroutine_suspended) {
                    return coroutine_suspended;
                }
                rVar = rVar2;
                obj = objAz;
            }
            rVar.eF(Boxing.boxBoolean(!((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    static final class CN3 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f75018O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75019n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75020r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f75021t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75018O = obj;
            this.f75020r |= Integer.MIN_VALUE;
            return Ml.this.Uo(this);
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75022n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f75023t;

        Dsr(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = new Dsr(continuation);
            dsr.f75023t = obj;
            return dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75022n == 0) {
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f75023t;
                Integer num = (Integer) mutablePreferences.rl(Ml.mUb);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                mutablePreferences.mUb(Ml.mUb, Boxing.boxInt(iIntValue + 1));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((Dsr) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75024O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75025n;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75025n = obj;
            this.f75024O |= Integer.MIN_VALUE;
            return Ml.this.O(this);
        }
    }

    /* JADX INFO: renamed from: wa.Ml$Ml, reason: collision with other inner class name */
    static final class C1260Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75028n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f75029t;

        C1260Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75029t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.nr(this);
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75030O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75031n;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75031n = obj;
            this.f75030O |= Integer.MIN_VALUE;
            return Ml.this.J2(this);
        }
    }

    static final class aC extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75033O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75034n;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75034n = obj;
            this.f75033O |= Integer.MIN_VALUE;
            return Ml.this.xMQ(null, this);
        }
    }

    static final class fuX extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75036O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75037n;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75037n = obj;
            this.f75036O |= Integer.MIN_VALUE;
            return Ml.this.KN(this);
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ KProperty[] f75039n = {Reflection.property2(new PropertyReference2Impl(j.class, "datastore", "getDatastore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        /* JADX INFO: renamed from: wa.Ml$j$j, reason: collision with other inner class name */
        static final class C1261j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f75040O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f75041n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ DataStore f75042t;

            /* JADX INFO: renamed from: wa.Ml$j$j$j, reason: collision with other inner class name */
            static final class C1262j extends SuspendLambda implements Function2 {
                /* synthetic */ Object J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                int f75043O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f75044n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Function1 f75045r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f75046t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1262j(Function1 function1, Continuation continuation) {
                    super(2, continuation);
                    this.f75045r = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C1262j c1262j = new C1262j(this.f75045r, continuation);
                    c1262j.J2 = obj;
                    return c1262j;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    MutablePreferences mutablePreferences;
                    Preferences.Key key;
                    MutablePreferences mutablePreferences2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f75043O;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            key = (Preferences.Key) this.f75046t;
                            mutablePreferences = (MutablePreferences) this.f75044n;
                            mutablePreferences2 = (MutablePreferences) this.J2;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        mutablePreferences = (MutablePreferences) this.J2;
                        Preferences.Key key2 = Ml.mUb;
                        Function1 function1 = this.f75045r;
                        this.J2 = mutablePreferences;
                        this.f75044n = mutablePreferences;
                        this.f75046t = key2;
                        this.f75043O = 1;
                        Object objInvoke = function1.invoke(this);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        key = key2;
                        obj = objInvoke;
                        mutablePreferences2 = mutablePreferences;
                    }
                    mutablePreferences.mUb(key, obj);
                    mutablePreferences2.mUb(Ml.gh, Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
                    return ((C1262j) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1261j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1261j(DataStore dataStore, Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f75042t = dataStore;
                this.f75040O = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1261j(this.f75042t, this.f75040O, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
            
                if (androidx.content.preferences.core.PreferencesKt.n(r6, r1, r5) == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean zBooleanValue;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f75041n;
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
                    TFv.Wre data = this.f75042t.getData();
                    this.f75041n = 1;
                    obj = TFv.fuX.ViF(data, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                Boolean bool = (Boolean) ((Preferences) obj).rl(Ml.gh);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    DataStore dataStore = this.f75042t;
                    C1262j c1262j = new C1262j(this.f75040O, null);
                    this.f75041n = 2;
                }
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final MonetizationModule n(Application context, YV.Wre monopoly, Function1 getProductIds, Function1 paywallHits, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(monopoly, "monopoly");
            Intrinsics.checkNotNullParameter(getProductIds, "getProductIds");
            Intrinsics.checkNotNullParameter(paywallHits, "paywallHits");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            DataStore dataStoreRl = rl(context);
            PI.Ml ml = new PI.Ml(context);
            GJW.C.nr(Lu.n(OU.rl()), null, null, new C1261j(dataStoreRl, paywallHits, null), 3, null);
            return new Ml(monopoly, dataStoreRl, ml, getProductIds, spiderSense);
        }

        private final DataStore rl(Context context) {
            return (DataStore) Ml.qie.getValue(context, f75039n[0]);
        }
    }

    static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75047O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75048n;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75048n = obj;
            this.f75047O |= Integer.MIN_VALUE;
            return Ml.this.mUb(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75050n;

        w6(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Ml.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75050n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreO = Ml.this.rl.O();
                this.f75050n = 1;
                obj = TFv.fuX.g(wreO, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List list = (List) obj;
            if (list != null) {
                return (String) CollectionsKt.first(list);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[YV.fuX.values().length];
            try {
                iArr[YV.fuX.f12140n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[YV.fuX.f12142t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[YV.fuX.f12139O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Xo.values().length];
            try {
                iArr2[Xo.f12136n.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Xo.f12138t.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Xo.f12135O.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Ml(YV.Wre monopoly, DataStore dataStore, PI.w6 currentActivityProvider, Function1 getProductIds, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        Intrinsics.checkNotNullParameter(getProductIds, "getProductIds");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        this.rl = monopoly;
        this.f75014t = dataStore;
        this.nr = currentActivityProvider;
        this.f75013O = getProductIds;
        this.J2 = spiderSense;
        this.Uo = ci.t(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences Ik(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J2(Continuation continuation) {
        Wre wre;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f75030O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f75030O = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objViF = wre.f75031n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f75030O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f75014t.getData();
            wre.f75030O = 1;
            objViF = TFv.fuX.ViF(data, wre);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        Integer num = (Integer) ((Preferences) objViF).rl(mUb);
        return new n.w6(Boxing.boxInt(num != null ? num.intValue() : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KN(Continuation continuation) {
        fuX fux;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.f75036O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.f75036O = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object obj = fux.f75037n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.f75036O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            DataStore dataStore = this.f75014t;
            Dsr dsr = new Dsr(null);
            fux.f75036O = 1;
            if (PreferencesKt.n(dataStore, dsr, fux) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new n.w6(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(Continuation continuation) {
        I28 i28;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f75024O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f75024O = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objT = i28.f75025n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f75024O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            YV.Wre wre = this.rl;
            i28.f75024O = 1;
            objT = wre.t(i28);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objT);
        }
        return new n.w6(objT);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[LOOP:1: B:38:0x00d5->B:40:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Uo(Continuation continuation) {
        CN3 cn3;
        Ml ml;
        List list;
        Ml ml2;
        x0X.n w6Var;
        Pair pair;
        Iterator it;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.f75020r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.f75020r = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objInvoke = cn3.f75018O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.f75020r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function1 function1 = this.f75013O;
            cn3.f75019n = this;
            cn3.f75020r = 1;
            objInvoke = function1.invoke(cn3);
            if (objInvoke != coroutine_suspended) {
                ml = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) cn3.f75021t;
            ml2 = (Ml) cn3.f75019n;
            ResultKt.throwOnFailure(objInvoke);
            w6Var = (x0X.n) objInvoke;
            if (!(w6Var instanceof n.C1266n)) {
                if (!(w6Var instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair pair2 = (Pair) ((n.w6) w6Var).n();
                List list2 = (List) pair2.component1();
                List list3 = (List) pair2.component2();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(wa.I28.t((SubscriptionProduct) it2.next()));
                }
                w6Var = new n.w6(TuplesKt.to(arrayList, list3));
            }
            pair = (Pair) x0X.w6.nr(w6Var);
            if (pair == null) {
                pair = TuplesKt.to(CollectionsKt.emptyList(), list);
            }
            List list4 = (List) pair.component1();
            it = ((List) pair.component2()).iterator();
            while (it.hasNext()) {
                KW9.w6.rl(ml2.J2, new n.w6.CN3((String) it.next()));
            }
            return new n.w6(list4);
        }
        ml = (Ml) cn3.f75019n;
        ResultKt.throwOnFailure(objInvoke);
        List list5 = (List) objInvoke;
        YV.Wre wre = ml.rl;
        cn3.f75019n = ml;
        cn3.f75021t = list5;
        cn3.f75020r = 2;
        Object objQie = wre.qie(list5, cn3);
        if (objQie != coroutine_suspended) {
            list = list5;
            objInvoke = objQie;
            ml2 = ml;
            w6Var = (x0X.n) objInvoke;
            if (!(w6Var instanceof n.C1266n)) {
            }
            pair = (Pair) x0X.w6.nr(w6Var);
            if (pair == null) {
            }
            List list42 = (List) pair.component1();
            it = ((List) pair.component2()).iterator();
            while (it.hasNext()) {
            }
            return new n.w6(list42);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mUb(Continuation continuation) {
        o oVar;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.f75047O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f75047O = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object objRl = oVar.f75048n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.f75047O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            YV.Wre wre = this.rl;
            oVar.f75047O = 1;
            objRl = Wre.w6.rl(wre, false, oVar, 1, null);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRl);
        }
        int i5 = n.$EnumSwitchMapping$1[((Xo) objRl).ordinal()];
        if (i5 == 1) {
            return new n.C1266n(new IllegalStateException("Connection error"));
        }
        if (i5 == 2) {
            return new n.w6(Unit.INSTANCE);
        }
        if (i5 == 3) {
            return new n.w6(Unit.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule, j8.j
    public void n(com.bendingspoons.injet.webbridge.I28 scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        super.n(scope);
        GJW.C.nr(Lu.n(OU.rl()), null, null, new C(null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Continuation continuation) {
        C1260Ml c1260Ml;
        Ml ml;
        if (continuation instanceof C1260Ml) {
            c1260Ml = (C1260Ml) continuation;
            int i2 = c1260Ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1260Ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c1260Ml = new C1260Ml(continuation);
            }
        }
        Object objGh = c1260Ml.f75029t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1260Ml.J2;
        boolean z2 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objGh);
            KW9.Wre wreJ2 = KW9.Wre.rl.J2();
            if (wreJ2 != null) {
                c1260Ml.f75028n = this;
                c1260Ml.J2 = 1;
                objGh = wreJ2.gh(c1260Ml);
                if (objGh != coroutine_suspended) {
                    ml = this;
                }
                return coroutine_suspended;
            }
            ml = this;
            if (!z2) {
                return new n.w6(Boxing.boxBoolean(true));
            }
            r rVar = ml.Uo;
            c1260Ml.f75028n = null;
            c1260Ml.J2 = 2;
            objGh = rVar.await(c1260Ml);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGh);
                return new n.w6(objGh);
            }
            ml = (Ml) c1260Ml.f75028n;
            ResultKt.throwOnFailure(objGh);
        }
        if (((Boolean) objGh).booleanValue()) {
            z2 = true;
        }
        if (!z2) {
        }
    }

    @Override // com.bendingspoons.injet.module.MonetizationModule
    public Object t(Continuation continuation) {
        return x0X.w6.Uo(new w6(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.bendingspoons.injet.module.MonetizationModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object xMQ(String str, Continuation continuation) {
        aC aCVar;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f75033O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f75033O = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        aC aCVar2 = aCVar;
        Object objN = aCVar2.f75034n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar2.f75033O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Activity activityN = this.nr.n();
            if (activityN == null) {
                return new n.C1266n(new IllegalStateException("No current activity"));
            }
            YV.Wre wre = this.rl;
            aCVar2.f75033O = 1;
            objN = eO.j.n(wre, activityN, str, null, null, null, null, aCVar2, 56, null);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        x0X.n nVar = (x0X.n) objN;
        if (nVar instanceof n.C1266n) {
            return new n.C1266n(new Error("Could not purchase: " + ((YV.CN3) ((n.C1266n) nVar).n()).rl()));
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = n.$EnumSwitchMapping$0[((YV.fuX) ((n.w6) nVar).n()).ordinal()];
        if (i5 == 1) {
            return new n.w6(Unit.INSTANCE);
        }
        if (i5 == 2) {
            return new n.C1266n(new IllegalStateException("UserCanceledError"));
        }
        if (i5 == 3) {
            return new n.w6(Unit.INSTANCE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
