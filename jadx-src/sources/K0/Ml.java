package K0;

import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.core.DataStore;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.preferences.PreferenceDataStoreDelegateKt;
import androidx.content.preferences.core.Preferences;
import androidx.content.preferences.core.PreferencesFactory;
import com.bendingspoons.oracle.models.OracleResponse;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import tb.AbstractC2374j;
import xFr.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f4784n = {Reflection.property1(new PropertyReference1Impl(Ml.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final ReadOnlyProperty rl = PreferenceDataStoreDelegateKt.rl("legal", new ReplaceFileCorruptionHandler(new Function1() { // from class: K0.w6
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Ml.O((CorruptionException) obj);
        }
    }), null, null, 12, null);

    static final class CN3 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4785n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4786t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(TFv.Wre wre, Continuation continuation) {
            super(1, continuation);
            this.f4786t = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new CN3(this.f4786t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4785n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TFv.Wre wre = this.f4786t;
            this.f4785n = 1;
            Object objViF = TFv.fuX.ViF(wre, this);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objViF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4787n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4788t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(TFv.Wre wre, Continuation continuation) {
            super(1, continuation);
            this.f4788t = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f4788t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4787n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TFv.Wre wre = this.f4788t;
            this.f4787n = 1;
            Object objViF = TFv.fuX.ViF(wre, this);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objViF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: K0.Ml$Ml, reason: collision with other inner class name */
    public static final class C0169Ml implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4789n;

        /* JADX INFO: renamed from: K0.Ml$Ml$j */
        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4790n;

            /* JADX INFO: renamed from: K0.Ml$Ml$j$j, reason: collision with other inner class name */
            public static final class C0170j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4792n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4793t;

                public C0170j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4792n = obj;
                    this.f4793t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f4790n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0170j c0170j;
                if (continuation instanceof C0170j) {
                    c0170j = (C0170j) continuation;
                    int i2 = c0170j.f4793t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0170j.f4793t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0170j = new C0170j(continuation);
                    }
                }
                Object obj2 = c0170j.f4792n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0170j.f4793t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4790n;
                    OracleResponse oracleResponse = (OracleResponse) obj;
                    Ds.n nVar = new Ds.n(oracleResponse.getLegalNotifications().getToNotifyTermsOfService(), oracleResponse.getLegalNotifications().getToNotifyPrivacyPolicy());
                    c0170j.f4793t = 1;
                    if (cn3.rl(nVar, c0170j) == coroutine_suspended) {
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

        public C0169Ml(TFv.Wre wre) {
            this.f4789n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4789n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4794n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4795t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(TFv.Wre wre, Continuation continuation) {
            super(1, continuation);
            this.f4795t = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Wre(this.f4795t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4794n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TFv.Wre wre = this.f4795t;
            this.f4794n = 1;
            Object objViF = TFv.fuX.ViF(wre, this);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objViF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4796n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4797t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(TFv.Wre wre, Continuation continuation) {
            super(1, continuation);
            this.f4797t = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new fuX(this.f4797t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4796n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TFv.Wre wre = this.f4797t;
            this.f4796n = 1;
            Object objViF = TFv.fuX.ViF(wre, this);
            if (objViF == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objViF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((fuX) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4798n;

        /* JADX INFO: renamed from: K0.Ml$j$j, reason: collision with other inner class name */
        public static final class C0171j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4799n;

            /* JADX INFO: renamed from: K0.Ml$j$j$j, reason: collision with other inner class name */
            public static final class C0172j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4801n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4802t;

                public C0172j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4801n = obj;
                    this.f4802t |= Integer.MIN_VALUE;
                    return C0171j.this.rl(null, this);
                }
            }

            public C0171j(TFv.CN3 cn3) {
                this.f4799n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0172j c0172j;
                if (continuation instanceof C0172j) {
                    c0172j = (C0172j) continuation;
                    int i2 = c0172j.f4802t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0172j.f4802t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0172j = new C0172j(continuation);
                    }
                }
                Object obj2 = c0172j.f4801n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0172j.f4802t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4799n;
                    OracleResponse oracleResponse = (OracleResponse) obj;
                    String tosVersion = oracleResponse.getSettings().getTosVersion();
                    String tosUrl = oracleResponse.getSettings().getTosUrl();
                    LocalDateTime localDateTimeUo = Ml.Uo(oracleResponse.getSettings().getTosEffectiveDate());
                    String tosUpdateMessage = oracleResponse.getSettings().getTosUpdateMessage();
                    Ds.Ml ml = new Ds.Ml(tosVersion, tosUrl, localDateTimeUo, tosUpdateMessage != null ? Ml.KN(tosUpdateMessage) : null);
                    c0172j.f4802t = 1;
                    if (cn3.rl(ml, c0172j) == coroutine_suspended) {
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

        public j(TFv.Wre wre) {
            this.f4798n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4798n.n(new C0171j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class n implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4803n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4804n;

            /* JADX INFO: renamed from: K0.Ml$n$j$j, reason: collision with other inner class name */
            public static final class C0173j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4806n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4807t;

                public C0173j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4806n = obj;
                    this.f4807t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f4804n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0173j c0173j;
                if (continuation instanceof C0173j) {
                    c0173j = (C0173j) continuation;
                    int i2 = c0173j.f4807t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0173j.f4807t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0173j = new C0173j(continuation);
                    }
                }
                Object obj2 = c0173j.f4806n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0173j.f4807t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4804n;
                    OracleResponse oracleResponse = (OracleResponse) obj;
                    Ds.w6 w6Var = new Ds.w6(oracleResponse.getSettings().getPrivacyVersion(), oracleResponse.getSettings().getPrivacyUrl());
                    c0173j.f4807t = 1;
                    if (cn3.rl(w6Var, c0173j) == coroutine_suspended) {
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
            this.f4803n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4803n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class w6 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f4808n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f4809n;

            /* JADX INFO: renamed from: K0.Ml$w6$j$j, reason: collision with other inner class name */
            public static final class C0174j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f4811n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f4812t;

                public C0174j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f4811n = obj;
                    this.f4812t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f4809n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0174j c0174j;
                if (continuation instanceof C0174j) {
                    c0174j = (C0174j) continuation;
                    int i2 = c0174j.f4812t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0174j.f4812t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0174j = new C0174j(continuation);
                    }
                }
                Object obj2 = c0174j.f4811n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0174j.f4812t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f4809n;
                    OracleResponse oracleResponse = (OracleResponse) obj;
                    Ds.I28 i28 = new Ds.I28(oracleResponse.getMe().getTermsOfService().getLastAcceptedVersion(), oracleResponse.getMe().getPrivacyNotice().getLastAcknowledgedVersion());
                    c0174j.f4812t = 1;
                    if (cn3.rl(i28, c0174j) == coroutine_suspended) {
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
            this.f4808n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f4808n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "<tos>", "{tos}", false, 4, (Object) null), "</tos>", "{/tos}", false, 4, (Object) null), "%@", "%1$s", false, 4, (Object) null);
    }

    private static final DataStore J2(Context context) {
        return (DataStore) rl.getValue(context, f4784n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences O(CorruptionException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PreferencesFactory.n();
    }

    public static final LocalDateTime Uo(String effectiveDate) {
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        try {
            return LocalDateTime.parse(effectiveDate, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        } catch (DateTimeParseException unused) {
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now(...)");
            return QJ.rl(localDateTimeNow, null, 1, null);
        }
    }

    public static final K0.n nr(Context context, qu.I28 oracleResponseStore, qu.Dsr oracleService, rB.Ml spiderSense, bH.CN3 cn3, Function2 trackEvent, K0.fuX fux, nKt.n nVar, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        return t(context, new j(qu.Wre.t(oracleResponseStore)), new n(qu.Wre.t(oracleResponseStore)), new w6(qu.Wre.t(oracleResponseStore)), new C0169Ml(qu.Wre.t(oracleResponseStore)), new JAr.n(oracleService), spiderSense, cn3, trackEvent, fux, nVar, z2);
    }

    public static final K0.n t(Context context, TFv.Wre termsOfServiceFlow, TFv.Wre privacyNoticeFlow, TFv.Wre userInfoFlow, TFv.Wre legalNotificationsFlow, JAr.j legalAcceptanceManager, rB.Ml spiderSense, bH.CN3 cn3, Function2 trackEvent, K0.fuX fux, nKt.n nVar, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(termsOfServiceFlow, "termsOfServiceFlow");
        Intrinsics.checkNotNullParameter(privacyNoticeFlow, "privacyNoticeFlow");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        Intrinsics.checkNotNullParameter(legalNotificationsFlow, "legalNotificationsFlow");
        Intrinsics.checkNotNullParameter(legalAcceptanceManager, "legalAcceptanceManager");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        K0.CN3 cn32 = new K0.CN3(J2(context));
        K0.I28 i28 = new K0.I28(spiderSense, cn32, new I28(termsOfServiceFlow, null), new Wre(privacyNoticeFlow, null), new CN3(userInfoFlow, null), new fuX(legalNotificationsFlow, null), legalAcceptanceManager, Pr.w6.f7853n.n(context, spiderSense), z2);
        if (cn3 != null) {
            AbstractC2374j.n(cn3, context, i28, trackEvent, fux, nVar, cn32);
        }
        return i28;
    }
}
