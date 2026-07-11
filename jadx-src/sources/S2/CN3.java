package S2;

import S2.CN3;
import S2.w6;
import TFv.fuX;
import ajd.j;
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
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 {
    public static final j J2 = new j(null);
    public static final int Uo = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Preferences.Key f8899O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final S2.n f8900n;
    private final Function0 nr;
    private final DataStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function2 f8901t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File O(Context context) {
            return PreferenceDataStoreFile.n(context, "installReferrerPreferences");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Preferences nr(CorruptionException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return PreferencesFactory.n();
        }

        public final CN3 t(final Context context, Function2 trackEvent, Function0 spiderSenseProvider) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
            Intrinsics.checkNotNullParameter(spiderSenseProvider, "spiderSenseProvider");
            return new CN3(new S2.n(context), PreferenceDataStoreFactory.t(PreferenceDataStoreFactory.f37697n, new ReplaceFileCorruptionHandler(new Function1() { // from class: S2.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CN3.j.nr((CorruptionException) obj);
                }
            }), null, null, new Function0() { // from class: S2.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CN3.j.O(context);
                }
            }, 6, null), trackEvent, spiderSenseProvider);
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f8902O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8903n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f8904o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f8906t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f8904o |= Integer.MIN_VALUE;
            return CN3.this.KN(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8908n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f8909t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = CN3.this.new w6(continuation);
            w6Var.f8909t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8908n == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.f8909t).mUb(CN3.this.f8899O, Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
            return ((w6) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String J2(int i2) {
        if (i2 == -1) {
            return "Service Disconnected";
        }
        if (i2 == 0) {
            return "OK";
        }
        if (i2 == 1) {
            return "Service Unavailable";
        }
        if (i2 == 2) {
            return "Feature Not Supported";
        }
        if (i2 == 3) {
            return "Developer Error";
        }
        if (i2 == 4) {
            return "Permission Error";
        }
        return "Unknown(" + i2 + ")";
    }

    public CN3(S2.n dataSource, DataStore dataStore, Function2 trackEvent, Function0 spiderSenseProvider) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(spiderSenseProvider, "spiderSenseProvider");
        this.f8900n = dataSource;
        this.rl = dataStore;
        this.f8901t = trackEvent;
        this.nr = spiderSenseProvider;
        this.f8899O = PreferencesKeys.n("data-unattainable");
    }

    private final rB.Ml Uo() {
        return (rB.Ml) this.nr.invoke();
    }

    private final ajd.j n(Throwable th) {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"install-referrer", "retrieval-failed"}), j.EnumC0481j.f13101O, "Error occurred while retrieving install referrer data: " + th, null, null, 24, null);
    }

    private final ajd.j nr() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"install-referrer", "missing-details"}), j.EnumC0481j.f13101O, "Install Referrer setup is finished, but ReferrerDetails are null.", null, null, 24, null);
    }

    private final ajd.j rl() {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"install-referrer", "disconnected"}), j.EnumC0481j.f13101O, "Install Referrer connection lost.", null, null, 24, null);
    }

    private final ajd.j t(int i2) {
        return new ajd.j(CollectionsKt.listOf((Object[]) new String[]{"install-referrer", MRAIDPresenter.ERROR}), j.EnumC0481j.f13101O, "Install Referrer setup finished with error: " + J2(i2) + ".", J2(i2), null, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(Continuation continuation) {
        n nVar;
        CN3 cn3;
        x0X.n nVar2;
        boolean z2;
        CN3 cn32;
        S2.w6 w6Var;
        x0X.n nVar3;
        ajd.j jVarN;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f8904o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f8904o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objViF = nVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f8904o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            TFv.Wre data = this.rl.getData();
            nVar.f8903n = this;
            nVar.f8904o = 1;
            objViF = fuX.ViF(data, nVar);
            if (objViF != coroutine_suspended) {
                cn3 = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w6Var = (S2.w6) nVar.f8902O;
                nVar3 = (x0X.n) nVar.f8906t;
                cn32 = (CN3) nVar.f8903n;
                ResultKt.throwOnFailure(objViF);
                rB.Ml mlUo = cn32.Uo();
                if (!Intrinsics.areEqual(w6Var, w6.j.f8923n)) {
                    jVarN = cn32.nr();
                } else if (Intrinsics.areEqual(w6Var, w6.C0302w6.f8925n)) {
                    jVarN = cn32.rl();
                } else if (w6Var instanceof w6.Ml) {
                    jVarN = cn32.t(((w6.Ml) w6Var).n());
                } else {
                    if (!(w6Var instanceof w6.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVarN = cn32.n(((w6.n) w6Var).n());
                }
                mlUo.t(jVarN);
                nVar2 = nVar3;
                return x0X.w6.nr(nVar2);
            }
            cn3 = (CN3) nVar.f8903n;
            ResultKt.throwOnFailure(objViF);
            nVar2 = (x0X.n) objViF;
            z2 = nVar2 instanceof n.C1266n;
            if (!z2) {
                if (!(nVar2 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                cn3.f8901t.invoke("install_referrer_data", ((S2.j) ((n.w6) nVar2).n()).n());
            }
            if (z2) {
                if (!(nVar2 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                return x0X.w6.nr(nVar2);
            }
            S2.w6 w6Var2 = (S2.w6) ((n.C1266n) nVar2).n();
            DataStore dataStore = cn3.rl;
            w6 w6Var3 = cn3.new w6(null);
            nVar.f8903n = cn3;
            nVar.f8906t = nVar2;
            nVar.f8902O = w6Var2;
            nVar.f8904o = 3;
            if (PreferencesKt.n(dataStore, w6Var3, nVar) != coroutine_suspended) {
                cn32 = cn3;
                w6Var = w6Var2;
                nVar3 = nVar2;
                rB.Ml mlUo2 = cn32.Uo();
                if (!Intrinsics.areEqual(w6Var, w6.j.f8923n)) {
                }
                mlUo2.t(jVarN);
                nVar2 = nVar3;
                return x0X.w6.nr(nVar2);
            }
            return coroutine_suspended;
        }
        cn3 = (CN3) nVar.f8903n;
        ResultKt.throwOnFailure(objViF);
        if (Intrinsics.areEqual(((Preferences) objViF).rl(cn3.f8899O), Boxing.boxBoolean(true))) {
            return null;
        }
        S2.n nVar4 = cn3.f8900n;
        nVar.f8903n = cn3;
        nVar.f8904o = 2;
        objViF = nVar4.n(nVar);
        if (objViF != coroutine_suspended) {
            nVar2 = (x0X.n) objViF;
            z2 = nVar2 instanceof n.C1266n;
            if (!z2) {
            }
            if (z2) {
            }
        }
        return coroutine_suspended;
    }
}
