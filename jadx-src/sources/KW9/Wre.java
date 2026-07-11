package KW9;

import KW9.Wre;
import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreFile;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.PreferenceDataStoreFactory;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre {
    private static Wre nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f5390n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f5389t = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Preferences.Key f5388O = PreferencesKeys.n("is_testing_mode_visible");
    private static final Preferences.Key J2 = PreferencesKeys.n("should_force_hardcoded_web_app");
    private static final Preferences.Key Uo = PreferencesKeys.n("is_showing_hardcoded_web_app");
    private static final Preferences.Key KN = PreferencesKeys.Uo("current_trigger");
    private static final Preferences.Key xMQ = PreferencesKeys.Uo("current_web_app_version");
    private static final Preferences.Key mUb = PreferencesKeys.n("should_force_free_trial_eligibility");

    static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f5391O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5392n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5393t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f5391O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C c2 = new C(this.f5391O, continuation);
            c2.f5393t = obj;
            return c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5392n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f5393t).mUb(Wre.J2, Boxing.boxBoolean(this.f5391O));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((C) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5394O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5395n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5396t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(String str, Continuation continuation) {
            super(2, continuation);
            this.f5394O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            CN3 cn3 = new CN3(this.f5394O, continuation);
            cn3.f5396t = obj;
            return cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5395n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f5396t).mUb(Wre.KN, this.f5394O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((CN3) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f5397O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5398n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5399t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f5397O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = new Dsr(this.f5397O, continuation);
            dsr.f5399t = obj;
            return dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5398n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f5399t).mUb(Wre.Uo, Boxing.boxBoolean(this.f5397O));
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
        int f5400O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5401n;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5401n = obj;
            this.f5400O |= Integer.MIN_VALUE;
            return Wre.this.qie(this);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5403O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5404n;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5404n = obj;
            this.f5403O |= Integer.MIN_VALUE;
            return Wre.this.gh(this);
        }
    }

    /* JADX INFO: renamed from: KW9.Wre$Wre, reason: collision with other inner class name */
    static final class C0179Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5406O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5407n;

        C0179Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5407n = obj;
            this.f5406O |= Integer.MIN_VALUE;
            return Wre.this.az(this);
        }
    }

    static final class aC extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f5409O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5410n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5411t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aC(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f5409O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            aC aCVar = new aC(this.f5409O, continuation);
            aCVar.f5411t = obj;
            return aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5410n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f5411t).mUb(Wre.mUb, Boxing.boxBoolean(this.f5409O));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((aC) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5412O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5413n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5414t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(String str, Continuation continuation) {
            super(2, continuation);
            this.f5412O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            fuX fux = new fuX(this.f5412O, continuation);
            fux.f5414t = obj;
            return fux;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5413n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f5414t).mUb(Wre.xMQ, this.f5412O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((fuX) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File O(Context context) {
            return PreferenceDataStoreFile.n(context, "injet-testing-mode");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Preferences nr(CorruptionException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PreferencesFactory.n();
        }

        public final Wre t(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Wre wre = new Wre(PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(new Function1() { // from class: KW9.Ml
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wre.j.nr((CorruptionException) obj);
                }
            }), null, null, new Function0() { // from class: KW9.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.j.O(context);
                }
            }, 6, null));
            Uo(wre);
            return wre;
        }

        public final Wre J2() {
            return Wre.nr;
        }

        public final void Uo(Wre wre) {
            Wre.nr = wre;
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5415O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5416n;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5416n = obj;
            this.f5415O |= Integer.MIN_VALUE;
            return Wre.this.xMQ(this);
        }
    }

    static final class o extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f5418O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5419n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5420t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f5418O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            o oVar = new o(this.f5418O, continuation);
            oVar.f5420t = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5419n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f5420t).mUb(Wre.f5388O, Boxing.boxBoolean(this.f5418O));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((o) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class qz extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5421O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5422n;

        qz(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5422n = obj;
            this.f5421O |= Integer.MIN_VALUE;
            return Wre.this.Z(this);
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f5424O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5425n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5425n = obj;
            this.f5424O |= Integer.MIN_VALUE;
            return Wre.this.mUb(this);
        }
    }

    public Wre(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f5390n = dataStore;
    }

    public final Object HI(String str, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f5390n, new fuX(str, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final Object Ik(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f5390n, new aC(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(Continuation continuation) {
        qz qzVar;
        if (continuation instanceof qz) {
            qzVar = (qz) continuation;
            int i2 = qzVar.f5421O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qzVar.f5421O = i2 - Integer.MIN_VALUE;
            } else {
                qzVar = new qz(continuation);
            }
        }
        Object objViF = qzVar.f5422n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qzVar.f5421O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f5390n.getData();
            qzVar.f5421O = 1;
            objViF = TFv.fuX.ViF(data, qzVar);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) objViF).rl(J2), Boxing.boxBoolean(true)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object az(Continuation continuation) {
        C0179Wre c0179Wre;
        if (continuation instanceof C0179Wre) {
            c0179Wre = (C0179Wre) continuation;
            int i2 = c0179Wre.f5406O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0179Wre.f5406O = i2 - Integer.MIN_VALUE;
            } else {
                c0179Wre = new C0179Wre(continuation);
            }
        }
        Object objViF = c0179Wre.f5407n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0179Wre.f5406O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f5390n.getData();
            c0179Wre.f5406O = 1;
            objViF = TFv.fuX.ViF(data, c0179Wre);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) objViF).rl(f5388O), Boxing.boxBoolean(true)));
    }

    public final Object ck(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f5390n, new Dsr(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(Continuation continuation) {
        Ml ml;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f5403O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f5403O = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objViF = ml.f5404n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f5403O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f5390n.getData();
            ml.f5403O = 1;
            objViF = TFv.fuX.ViF(data, ml);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        Boolean bool = (Boolean) ((Preferences) objViF).rl(mUb);
        return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f5424O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f5424O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objViF = w6Var.f5425n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f5424O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f5390n.getData();
            w6Var.f5424O = 1;
            objViF = TFv.fuX.ViF(data, w6Var);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        String str = (String) ((Preferences) objViF).rl(xMQ);
        return str == null ? "" : str;
    }

    public final Object o(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f5390n, new o(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qie(Continuation continuation) {
        I28 i28;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f5400O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f5400O = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objViF = i28.f5401n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f5400O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f5390n.getData();
            i28.f5400O = 1;
            objViF = TFv.fuX.ViF(data, i28);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) objViF).rl(Uo), Boxing.boxBoolean(true)));
    }

    public final Object r(boolean z2, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f5390n, new C(z2, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final Object ty(String str, Continuation continuation) {
        Object objN = PreferencesKt.n(this.f5390n, new CN3(str, null), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Continuation continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f5415O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f5415O = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objViF = nVar.f5416n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f5415O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.f5390n.getData();
            nVar.f5415O = 1;
            objViF = TFv.fuX.ViF(data, nVar);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
        }
        String str = (String) ((Preferences) objViF).rl(KN);
        return str == null ? "" : str;
    }
}
