package pu;

import GJW.vd;
import android.util.Log;
import androidx.content.core.DataStore;
import androidx.content.preferences.core.MutablePreferences;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesKeys;
import androidx.content.preferences.core.PreferencesKt;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataStore f72049n;
    private fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final n f72048t = new n(null);
    private static final Preferences.Key nr = PreferencesKeys.n("firebase_sessions_enabled");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Preferences.Key f72047O = PreferencesKeys.t("firebase_sessions_sampling_rate");
    private static final Preferences.Key J2 = PreferencesKeys.O("firebase_sessions_restart_timeout");
    private static final Preferences.Key Uo = PreferencesKeys.O("firebase_sessions_cache_duration");
    private static final Preferences.Key KN = PreferencesKeys.J2("firebase_sessions_cache_updated_time");

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ Preferences.Key J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f72050O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72051n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ C f72052r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72053t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Object obj, Preferences.Key key, C c2, Continuation continuation) {
            super(2, continuation);
            this.f72050O = obj;
            this.J2 = key;
            this.f72052r = c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f72050O, this.J2, this.f72052r, continuation);
            ml.f72053t = obj;
            return ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f72051n == 0) {
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f72053t;
                Object obj2 = this.f72050O;
                if (obj2 != null) {
                    mutablePreferences.mUb(this.J2, obj2);
                } else {
                    mutablePreferences.xMQ(this.J2);
                }
                this.f72052r.qie(mutablePreferences);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((Ml) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72055n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72056t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C c2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72056t;
            if (i2 != 0) {
                if (i2 == 1) {
                    c2 = (C) this.f72055n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C c4 = C.this;
                TFv.Wre data = c4.f72049n.getData();
                this.f72055n = c4;
                this.f72056t = 1;
                Object objViF = TFv.fuX.ViF(data, this);
                if (objViF == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c2 = c4;
                obj = objViF;
            }
            c2.qie(((Preferences) obj).nr());
            return Unit.INSTANCE;
        }
    }

    private static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f72057O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f72058n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72058n = obj;
            this.f72057O |= Integer.MIN_VALUE;
            return C.this.KN(null, null, this);
        }
    }

    public C(DataStore dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f72049n = dataStore;
        GJW.aC.rl(null, new j(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(Preferences.Key key, Object obj, Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f72057O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f72057O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj2 = w6Var.f72058n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f72057O;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj2);
                DataStore dataStore = this.f72049n;
                Ml ml = new Ml(obj, key, this, null);
                w6Var.f72057O = 1;
                if (PreferencesKt.n(dataStore, ml, w6Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
        } catch (IOException e2) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void qie(Preferences preferences) {
        this.rl = new fuX((Boolean) preferences.rl(nr), (Double) preferences.rl(f72047O), (Integer) preferences.rl(J2), (Integer) preferences.rl(Uo), (Long) preferences.rl(KN));
    }

    public final Double J2() {
        fuX fux = this.rl;
        if (fux == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            fux = null;
        }
        return fux.O();
    }

    public final Integer O() {
        fuX fux = this.rl;
        if (fux == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            fux = null;
        }
        return fux.nr();
    }

    public final Boolean Uo() {
        fuX fux = this.rl;
        if (fux == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            fux = null;
        }
        return fux.t();
    }

    public final Object az(Integer num, Continuation continuation) {
        Object objKN = KN(J2, num, continuation);
        return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : Unit.INSTANCE;
    }

    public final Object gh(Long l2, Continuation continuation) {
        Object objKN = KN(KN, l2, continuation);
        return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : Unit.INSTANCE;
    }

    public final Object mUb(Integer num, Continuation continuation) {
        Object objKN = KN(Uo, num, continuation);
        return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : Unit.INSTANCE;
    }

    public final boolean nr() {
        fuX fux = this.rl;
        fuX fux2 = null;
        if (fux == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            fux = null;
        }
        Long lRl = fux.rl();
        fuX fux3 = this.rl;
        if (fux3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            fux2 = fux3;
        }
        Integer numN = fux2.n();
        return lRl == null || numN == null || (System.currentTimeMillis() - lRl.longValue()) / ((long) 1000) >= ((long) numN.intValue());
    }

    public final Object ty(Boolean bool, Continuation continuation) {
        Object objKN = KN(nr, bool, continuation);
        return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : Unit.INSTANCE;
    }

    public final Object xMQ(Double d2, Continuation continuation) {
        Object objKN = KN(f72047O, d2, continuation);
        return objKN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objKN : Unit.INSTANCE;
    }
}
