package zIC;

import CZF.I28;
import Dk.InterfaceC1335n;
import FZ.n;
import Fyf.w6;
import YV.Wre;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import bH.CN3;
import cKn.Wre;
import cS.Zv.SzFNXybiSxdx;
import com.alightcreative.account.o;
import com.alightcreative.monorepo.settings.AlightSettingsEntity;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.bendingspoons.injet.module.AnalyticsModule;
import com.bendingspoons.oracle.models.OracleResponse;
import com.bendingspoons.oracle.models.Products;
import com.bendingspoons.oracle.models.Subscription;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.InterfaceC2202n;
import kP.EnumC2205I28;
import kP.InterfaceC2210n;
import kgE.K;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import nKt.n;
import okhttp3.OkHttpClient;
import qu.Dsr;
import qu.I28;
import rB.Ml;
import sP.n;
import zIC.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f76428n = new j(null);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j {

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class C implements Dsr.n {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final boolean f76429O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Void f76430n;
            private final String rl = "https://alightmotionandroid.oracle.bendingspoonsapps.com/";

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final String f76431t = "com.alightcreative.motion.android";
            private final Dsr.Ml nr = Dsr.Ml.f72488t;

            @Override // qu.Dsr.n
            public boolean xMQ() {
                return false;
            }

            public Void gh() {
                return this.f76430n;
            }

            @Override // qu.Dsr.n
            public boolean n() {
                return this.f76429O;
            }

            @Override // qu.Dsr.n
            public Dsr.Ml nr() {
                return this.nr;
            }

            @Override // qu.Dsr.n
            public String rl() {
                return this.f76431t;
            }

            @Override // qu.Dsr.n
            public String t() {
                return this.rl;
            }

            C() {
            }

            @Override // qu.Dsr.n
            public Object J2(Continuation continuation) {
                return Dsr.n.j.n(this, continuation);
            }

            @Override // qu.Dsr.n
            public Dsr.n.InterfaceC1121n KN() {
                return Dsr.n.j.t(this);
            }

            @Override // qu.Dsr.n
            public /* bridge */ /* synthetic */ String O() {
                return (String) gh();
            }

            @Override // qu.Dsr.n
            public boolean Uo() {
                return Dsr.n.j.nr(this);
            }

            @Override // qu.Dsr.n
            public Object mUb(Continuation continuation) {
                return Dsr.n.j.rl(this, continuation);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Dsr implements Wre.n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Function1 f76432n = new C1291j(null);
            private final Function1 rl = new n(null);

            /* JADX INFO: renamed from: zIC.qz$j$Dsr$j, reason: collision with other inner class name */
            static final class C1291j extends SuspendLambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76433n;

                C1291j(Continuation continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new C1291j(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f76433n == 0) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(false);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation continuation) {
                    return ((C1291j) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            static final class n extends SuspendLambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76434n;

                n(Continuation continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new n(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f76434n == 0) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation continuation) {
                    return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // YV.Wre.n
            public Function1 rl() {
                return this.rl;
            }

            @Override // YV.Wre.n
            public Function1 t() {
                return this.f76432n;
            }

            Dsr() {
            }

            @Override // YV.Wre.n
            public boolean n() {
                return Wre.n.j.n(this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class I28 implements n.InterfaceC0093n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f76435n = "com.alightcreative.motion.android";

            @Override // FZ.n.InterfaceC0093n
            public String rl() {
                return this.f76435n;
            }

            I28() {
            }

            @Override // FZ.n.InterfaceC0093n
            public Function1 t() {
                return n.InterfaceC0093n.j.n(this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Pl implements CN3.n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CN3.n.C0572n f76436n = new CN3.n.C0572n(false, null, 2, null);

            @Override // bH.CN3.n
            public CN3.n.C0572n rl() {
                return this.f76436n;
            }

            Pl() {
            }

            @Override // bH.CN3.n
            public CN3.n.w6 n() {
                return CN3.n.j.n(this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Wre implements InterfaceC2210n.InterfaceC1022n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f76438n;
            private final C1292j rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final List f76439t;
            private final Function1 nr = new w6(null);

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private final Function1 f76437O = new n(null);

            /* JADX INFO: renamed from: zIC.qz$j$Wre$j, reason: collision with other inner class name */
            public static final class C1292j implements n.InterfaceC1169n {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final n.j f76440n = new n.j("injet/dist.zip");
                final /* synthetic */ nYs.Ml rl;

                C1292j(nYs.Ml ml) {
                    this.rl = ml;
                }

                @Override // sP.n.InterfaceC1169n
                public n.j n() {
                    return this.f76440n;
                }

                @Override // sP.n.InterfaceC1169n
                public Object rl(Continuation continuation) {
                    String strIk;
                    nYs.j jVarInvoke = this.rl.invoke();
                    return (jVarInvoke == null || (strIk = jVarInvoke.Ik()) == null) ? "https://builds.mosaic-matrix.bendingspoons.com/AlightMotionAndroid/versioning.json" : strIk;
                }
            }

            static final class n extends SuspendLambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76441n;

                n(Continuation continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new n(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f76441n == 0) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(false);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation continuation) {
                    return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            static final class w6 extends SuspendLambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76442n;

                w6(Continuation continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new w6(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f76442n == 0) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation continuation) {
                    return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit xMQ(CZF.I28 i28, AnalyticsModule.UserEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                jgV.Wre.n(i28, it.getName(), pq.I28.t(it.getInfo()));
                return Unit.INSTANCE;
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            public Function1 J2() {
                return this.nr;
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
            public C1292j O() {
                return this.rl;
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            public boolean n() {
                return this.f76438n;
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            public Function1 rl() {
                return this.f76437O;
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            public List t() {
                return this.f76439t;
            }

            Wre(qu.I28 i28, rB.Ml ml, Application application, Eu.Ml ml2, Eu.w6 w6Var, nYs.Ml ml3, final CZF.I28 i282) {
                this.rl = new C1292j(ml3);
                this.f76439t = CollectionsKt.listOf((Object[]) new j8.j[]{new wa.Wre(i28), new wa.j(new Function1() { // from class: zIC.Pl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qz.j.Wre.xMQ(i282, (AnalyticsModule.UserEvent) obj);
                    }
                }, ml), new wa.C(application, "turquoise"), new wa.fuX(), wa.aC.rl.n(application), hL.j.f67955n, ml2, w6Var});
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            public Function0 Uo() {
                return InterfaceC2210n.InterfaceC1022n.j.n(this);
            }

            @Override // kP.InterfaceC2210n.InterfaceC1022n
            public EnumC2205I28 nr() {
                return InterfaceC2210n.InterfaceC1022n.j.rl(this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Xo implements Ml.n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f76443n = "com.alightcreative.motion.android";
            private final boolean rl;

            /* JADX INFO: renamed from: zIC.qz$j$Xo$j, reason: collision with other inner class name */
            static final class C1293j extends SuspendLambda implements Function1 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f76444n;

                C1293j(Continuation continuation) {
                    super(1, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Continuation continuation) {
                    return new C1293j(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f76444n == 0) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation continuation) {
                    return ((C1293j) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // rB.Ml.n
            public boolean n() {
                return this.rl;
            }

            @Override // rB.Ml.n
            public Function1 rl() {
                return new C1293j(null);
            }

            @Override // rB.Ml.n
            public String t() {
                return this.f76443n;
            }

            Xo() {
            }

            @Override // rB.Ml.n
            public long O() {
                return Ml.n.j.n(this);
            }

            @Override // rB.Ml.n
            public GjB.n nr() {
                return Ml.n.j.rl(this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class aC implements Function0 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Moshi f76445n;

            public aC(Moshi moshi) {
                this.f76445n = moshi;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final JsonAdapter invoke() {
                return _MoshiKotlinExtensionsKt.adapter(this.f76445n, Reflection.typeOf(AlightSettingsEntity.class));
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class eO implements Wre.n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f76446n = true;
            private final boolean rl = true;

            @Override // cKn.Wre.n
            public boolean n() {
                return this.rl;
            }

            @Override // cKn.Wre.n
            public boolean rl() {
                return this.f76446n;
            }

            eO() {
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class n extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76447n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ qu.I28 f76448t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(qu.I28 i28, Continuation continuation) {
                super(1, continuation);
                this.f76448t = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new n(this.f76448t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Products products;
                List<Subscription> subscriptions;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f76447n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wreRl = this.f76448t.rl();
                    this.f76447n = 1;
                    obj = TFv.fuX.ViF(wreRl, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                OracleResponse oracleResponse = (OracleResponse) obj;
                if (oracleResponse != null && (products = oracleResponse.getProducts()) != null && (subscriptions = products.getSubscriptions()) != null) {
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subscriptions, 10));
                    Iterator<T> it = subscriptions.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Subscription) it.next()).getId());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (StringsKt.contains$default((CharSequence) obj2, (CharSequence) "alightcreative.motion", false, 2, (Object) null)) {
                            arrayList2.add(obj2);
                        }
                    }
                    return arrayList2;
                }
                return CollectionsKt.listOf((Object[]) new String[]{"alightcreative.motion.1w_1w_t4", "alightcreative.motion.1w_t4", "alightcreative.motion.1y_t50_1w", "alightcreative.motion.1y_t50"});
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class o implements I28.n {
            private final boolean nr;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f76449n = "com.alightcreative.motion.android";
            private final String rl = z2r.j.f76345n.n();

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final I28.w6 f76450t = I28.w6.f985O;

            @Override // CZF.I28.n
            public String O() {
                return this.rl;
            }

            @Override // CZF.I28.n
            public boolean n() {
                return this.nr;
            }

            @Override // CZF.I28.n
            public I28.w6 nr() {
                return this.f76450t;
            }

            @Override // CZF.I28.n
            public String t() {
                return this.f76449n;
            }

            o() {
            }

            @Override // CZF.I28.n
            public Object J2(Continuation continuation) {
                return I28.n.j.nr(this, continuation);
            }

            @Override // CZF.I28.n
            public juU.Ml KN() {
                return I28.n.j.t(this);
            }

            @Override // CZF.I28.n
            public PMG.Ml Uo() {
                return I28.n.j.rl(this);
            }

            @Override // CZF.I28.n
            public PMG.w6 rl() {
                return I28.n.j.n(this);
            }
        }

        /* JADX INFO: renamed from: zIC.qz$j$qz, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class C1295qz implements n.InterfaceC1063n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f76451n = "55de3fe4-8547-4dbf-95e6-b4bc48f1d21a";
            final /* synthetic */ Context rl;

            @Override // nKt.n.InterfaceC1063n
            public boolean J2() {
                return false;
            }

            C1295qz(Context context) {
                this.rl = context;
            }

            @Override // nKt.n.InterfaceC1063n
            public String t() {
                return this.f76451n;
            }

            @Override // nKt.n.InterfaceC1063n
            public Object KN(Continuation continuation) {
                String strF;
                List listEmptyList;
                List listP0N;
                FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
                String strT = rWZ.j.t(XoT.fuX.r(this.rl));
                String strT2 = rWZ.j.t(XoT.fuX.o(this.rl));
                pq.Ml ml = new pq.Ml();
                if (firebaseUserXMQ == null || (strF = firebaseUserXMQ.f()) == null) {
                    strF = "";
                }
                ml.O("firebase_id", strF);
                if (firebaseUserXMQ != null && (listP0N = firebaseUserXMQ.p0N()) != null) {
                    listEmptyList = PJ9.DAz.a(listP0N);
                } else {
                    listEmptyList = null;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                ml.J2("firebase_auth_providers", rWZ.j.mUb(listEmptyList));
                ml.O("external_storage_authorization_read", strT);
                ml.O("external_storage_authorization_write", strT2);
                o.j jVar = com.alightcreative.account.o.gh;
                Set setNr = jVar.n().nr();
                K.j jVar2 = K.f70071O;
                ml.KN("is_premium_user", setNr.containsAll(jVar2.n()));
                ml.KN("is_premium_ultra_user", jVar.n().nr().containsAll(jVar2.rl()));
                return ml;
            }

            @Override // nKt.n.InterfaceC1063n
            public long O() {
                return n.InterfaceC1063n.j.O(this);
            }

            @Override // nKt.n.InterfaceC1063n
            public long Uo() {
                return n.InterfaceC1063n.j.Uo(this);
            }

            @Override // nKt.n.InterfaceC1063n
            public String getSdkVersion() {
                return n.InterfaceC1063n.j.J2(this);
            }

            @Override // nKt.n.InterfaceC1063n
            public Object n(Continuation continuation) {
                return n.InterfaceC1063n.j.n(this, continuation);
            }

            @Override // nKt.n.InterfaceC1063n
            public int nr() {
                return n.InterfaceC1063n.j.rl(this);
            }

            @Override // nKt.n.InterfaceC1063n
            public String rl() {
                return n.InterfaceC1063n.j.t(this);
            }

            @Override // nKt.n.InterfaceC1063n
            public long xMQ() {
                return n.InterfaceC1063n.j.nr(this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class w6 extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76452n;

            w6(Continuation continuation) {
                super(1, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new w6(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f76452n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxInt(com.alightcreative.app.motion.persist.j.INSTANCE.getPaywallNumber());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class CN3 implements w6.n {
            @Override // Fyf.w6.n
            public Object n(Continuation continuation) {
                return null;
            }

            CN3() {
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Ml implements InterfaceC1335n.InterfaceC0067n {
            Ml() {
            }

            @Override // Dk.InterfaceC1335n.InterfaceC0067n
            public boolean n() {
                return InterfaceC1335n.InterfaceC0067n.j.n(this);
            }

            @Override // Dk.InterfaceC1335n.InterfaceC0067n
            public Map rl() {
                return MapsKt.emptyMap();
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class fuX implements InterfaceC2202n.InterfaceC1003n {
            @Override // k.InterfaceC2202n.InterfaceC1003n
            public boolean isEnabled() {
                return true;
            }

            @Override // k.InterfaceC2202n.InterfaceC1003n
            public boolean rl() {
                return StringsKt.contains$default((CharSequence) "production", (CharSequence) "maestro", false, 2, (Object) null);
            }

            fuX() {
            }

            @Override // k.InterfaceC2202n.InterfaceC1003n
            public InterfaceC2202n.Ml n() {
                return InterfaceC2202n.InterfaceC1003n.j.n(this);
            }
        }

        /* JADX INFO: renamed from: zIC.qz$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class C1294j implements InterfaceC2202n.InterfaceC1003n {
            @Override // k.InterfaceC2202n.InterfaceC1003n
            public boolean isEnabled() {
                return true;
            }

            @Override // k.InterfaceC2202n.InterfaceC1003n
            public boolean rl() {
                return StringsKt.contains$default((CharSequence) "production", (CharSequence) "maestro", false, 2, (Object) null);
            }

            C1294j() {
            }

            @Override // k.InterfaceC2202n.InterfaceC1003n
            public InterfaceC2202n.Ml n() {
                return InterfaceC2202n.InterfaceC1003n.j.n(this);
            }
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E(CZF.I28 i28, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E2(CZF.I28 i28, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit P5(CZF.I28 i28, nKt.n nVar, Context context, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            pq.Ml ml = new pq.Ml();
            ml.O("action_kind", actionKind);
            ml.Uo("action_info", info);
            Unit unit = Unit.INSTANCE;
            jgV.n.n(i28, "AdsRevenue", ml);
            nVar.n(actionKind, info);
            qz.f76428n.M(context, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit S(CZF.I28 i28, nKt.n nVar, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            nVar.n(actionKind, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit U(CZF.I28 i28, nKt.n nVar, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            nVar.n(actionKind, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ViF(CZF.I28 i28, nKt.n nVar, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            nVar.n(actionKind, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit WPU(CZF.I28 i28, nKt.n nVar, Context context, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            pq.Ml ml = new pq.Ml();
            ml.O("action_kind", actionKind);
            ml.Uo("action_info", info);
            Unit unit = Unit.INSTANCE;
            jgV.n.n(i28, "AdsRevenue", ml);
            nVar.n(actionKind, info);
            qz.f76428n.M(context, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Xw(CZF.I28 i28, nKt.n nVar, Context context, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            pq.Ml ml = new pq.Ml();
            ml.O("action_kind", actionKind);
            ml.Uo("action_info", info);
            Unit unit = Unit.INSTANCE;
            jgV.n.n(i28, "AdsRevenue", ml);
            nVar.n(actionKind, info);
            qz.f76428n.M(context, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bzg(CZF.I28 i28, nKt.n nVar, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            nVar.n(actionKind, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(CZF.I28 i28, String productId, String purchaseToken, long j2, pq.Ml additionalInfo) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            i28.n(jgV.I28.n(PicoEvent.INSTANCE, productId, purchaseToken, j2, additionalInfo));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nY(CZF.I28 i28, nKt.n nVar, Context context, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            pq.Ml ml = new pq.Ml();
            ml.O("action_kind", actionKind);
            ml.Uo("action_info", info);
            Unit unit = Unit.INSTANCE;
            jgV.n.n(i28, "AdsRevenue", ml);
            nVar.n(actionKind, info);
            qz.f76428n.M(context, info);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit te(CZF.I28 i28, String actionKind, pq.Ml info) {
            Intrinsics.checkNotNullParameter(actionKind, "actionKind");
            Intrinsics.checkNotNullParameter(info, "info");
            jgV.Wre.n(i28, actionKind, info);
            return Unit.INSTANCE;
        }

        public final Eu.Ml HI(Application application, YV.Wre monopoly, qu.I28 oracleResponseStore, rB.Ml spiderSense, kgE.fuX iapManager) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(monopoly, "monopoly");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(iapManager, "iapManager");
            return new Eu.Ml(wa.Ml.KN.n(application, monopoly, new n(oracleResponseStore, null), new w6(null), spiderSense), iapManager);
        }

        public final FZ.n Ik(Context context, bH.CN3 secretMenu, InterfaceC1335n concierge, rB.Ml spiderSense, qu.I28 oracleResponseStore) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            return FZ.n.f2724n.nr(new I28(), context, concierge, oracleResponseStore, spiderSense, secretMenu);
        }

        public final bH.CN3 M7(Context context, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, SzFNXybiSxdx.mKZHDvpxLWqY);
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return bH.CN3.f43222n.t(new Pl(), context, spiderSense);
        }

        public final qu.I28 N(Context context, bH.CN3 secretMenu, rB.Ml spiderSense, qu.Dsr oracleService) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(oracleService, "oracleService");
            return I28.j.nr(qu.I28.f72489n, context, oracleService, spiderSense, secretMenu, null, 16, null);
        }

        public final U5u.j T(qu.I28 oracleResponseStore, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return Fcn.w6.t(U5u.j.f10608n, new et.I28(LazyKt.lazy(new aC(zQ.j.n()))), oracleResponseStore, spiderSense);
        }

        public final OkHttpClient X() {
            return new OkHttpClient();
        }

        public final ScC.n XQ(final Context context, InterfaceC2202n adOrable, final CZF.I28 pico, final nKt.n picoX, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adOrable, "adOrable");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(picoX, "picoX");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return aui.fuX.KN(ScC.n.f9798n, context, adOrable, new Function2() { // from class: zIC.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.S(pico, picoX, (String) obj, (pq.Ml) obj2);
                }
            }, new Function2() { // from class: zIC.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.WPU(pico, picoX, context, (String) obj, (pq.Ml) obj2);
                }
            }, spiderSense);
        }

        public final Fyf.w6 Z(Context context, InterfaceC1335n concierge) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            return Fyf.w6.f3379n.t(new CN3(), context, concierge);
        }

        public final ScC.n aYN(final Context context, InterfaceC2202n adOrable, final CZF.I28 pico, final nKt.n picoX, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adOrable, "adOrable");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(picoX, "picoX");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return oP.fuX.KN(ScC.n.f9798n, context, adOrable, new Function2() { // from class: zIC.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.ViF(pico, picoX, (String) obj, (pq.Ml) obj2);
                }
            }, new Function2() { // from class: zIC.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.nY(pico, picoX, context, (String) obj, (pq.Ml) obj2);
                }
            }, spiderSense);
        }

        public final InterfaceC2202n az(Context context, K0.n legal, bH.CN3 secretMenu, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(legal, "legal");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return aui.fuX.mUb(InterfaceC2202n.f69649n, new C1294j(), context, legal, secretMenu, spiderSense);
        }

        public final InterfaceC1335n ck(Context context, bH.CN3 secretMenu, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return InterfaceC1335n.f1920n.t(new Ml(), context, secretMenu, spiderSense);
        }

        public final cKn.Wre eF(Context context, InterfaceC1335n concierge, rB.Ml spiderSense, final CZF.I28 pico, K0.n legal, bH.CN3 secretMenu) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(legal, "legal");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            return cKn.Wre.f43632n.Uo(new eO(), context, concierge, new Function2() { // from class: zIC.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.E(pico, (String) obj, (pq.Ml) obj2);
                }
            }, spiderSense, legal, secretMenu);
        }

        public final YV.Wre fD(Context context, qu.I28 oracleResponseStore, qu.Dsr oracleService, cKn.Wre theirs, final CZF.I28 pico, bH.CN3 secretMenu, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(oracleService, "oracleService");
            Intrinsics.checkNotNullParameter(theirs, "theirs");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return YV.Wre.f12124n.nr(context, oracleResponseStore, oracleService, theirs, pico, new Function2() { // from class: zIC.Dsr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.E2(pico, (String) obj, (pq.Ml) obj2);
                }
            }, new Function4() { // from class: zIC.aC
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return qz.j.e(pico, (String) obj, (String) obj2, ((Long) obj3).longValue(), (pq.Ml) obj4);
                }
            }, secretMenu, spiderSense, new Dsr());
        }

        public final K0.n g(Context context, bH.CN3 secretMenu, rB.Ml spiderSense, qu.Dsr oracleService, qu.I28 oracleResponseStore, final CZF.I28 pico, nKt.n picoX) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(oracleService, "oracleService");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(picoX, "picoX");
            return K0.n.f4828n.t(context, oracleResponseStore, oracleService, spiderSense, secretMenu, new Function2() { // from class: zIC.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.te(pico, (String) obj, (pq.Ml) obj2);
                }
            }, (Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE & 64) != 0 ? null : null, picoX, (Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE & 256) != 0 ? false : false);
        }

        public final InterfaceC2202n iF(Context context, K0.n legal, bH.CN3 secretMenu, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(legal, "legal");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return oP.fuX.mUb(InterfaceC2202n.f69649n, "CP6wULIVzxoRdrEz130IlL7mRDBDktcW4qq0FhFvMkwPOoHmOdaAO3dQpT7kAA4MV8aUK7RLkNmWAzowzoVAtQ", new fuX(), context, legal, secretMenu, spiderSense);
        }

        public final ScC.w6 jB(final Context context, InterfaceC2202n adOrable, final CZF.I28 pico, final nKt.n picoX, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adOrable, "adOrable");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(picoX, "picoX");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return oP.fuX.xMQ(ScC.w6.rl, context, adOrable, new Function2() { // from class: zIC.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.U(pico, picoX, (String) obj, (pq.Ml) obj2);
                }
            }, new Function2() { // from class: zIC.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.P5(pico, picoX, context, (String) obj, (pq.Ml) obj2);
                }
            }, spiderSense);
        }

        public final qu.Dsr nHg(Context context, OkHttpClient okHttpClient, rB.Ml spiderSense, InterfaceC1335n concierge, Fyf.w6 installManager) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(installManager, "installManager");
            return qu.Dsr.f72485n.nr(new C(), context, installManager, concierge, spiderSense, okHttpClient);
        }

        public final InterfaceC2210n o(Application application, bH.CN3 secretMenu, rB.Ml spiderSense, OkHttpClient okHttpClient, qu.I28 oracleResponseStore, CZF.I28 pico, nYs.Ml getAlightSettingsUseCase, Eu.w6 adsModule, Eu.Ml alightMonetizationModule) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
            Intrinsics.checkNotNullParameter(adsModule, "adsModule");
            Intrinsics.checkNotNullParameter(alightMonetizationModule, "alightMonetizationModule");
            return InterfaceC2210n.f69859n.t(1028425, new Wre(oracleResponseStore, spiderSense, application, alightMonetizationModule, adsModule, getAlightSettingsUseCase, pico), application, secretMenu, spiderSense, okHttpClient);
        }

        public final rB.Ml p5(Context context, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return rB.Ml.f72876n.O(new Xo(), context, okHttpClient);
        }

        public final Dm5.n r(Context context, qu.I28 oracleResponseStore) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            return Dm5.n.f1926n.nr(context, oracleResponseStore);
        }

        public final ScC.w6 rV9(final Context context, InterfaceC2202n adOrable, final CZF.I28 pico, final nKt.n picoX, rB.Ml spiderSense) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adOrable, "adOrable");
            Intrinsics.checkNotNullParameter(pico, "pico");
            Intrinsics.checkNotNullParameter(picoX, "picoX");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            return aui.fuX.xMQ(ScC.w6.rl, context, adOrable, new Function2() { // from class: zIC.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.bzg(pico, picoX, (String) obj, (pq.Ml) obj2);
                }
            }, new Function2() { // from class: zIC.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.j.Xw(pico, picoX, context, (String) obj, (pq.Ml) obj2);
                }
            }, spiderSense);
        }

        public final CZF.I28 s7N(Context context, OkHttpClient okHttpClient, rB.Ml spiderSense, InterfaceC1335n concierge, Fyf.w6 installManager, qu.I28 oracleResponseStore) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(installManager, "installManager");
            Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
            return CZF.I28.f963n.nr(context, new o(), concierge, spiderSense, null, jgV.Ml.rl(oracleResponseStore), jgV.Ml.n(oracleResponseStore), installManager, okHttpClient);
        }

        public final Eu.w6 ty(Application application, NuI.CN3 getRewardedAdLauncherUseCase, NuI.I28 getInterstitialAdLauncherUseCase, NuI.w6 getAdUnitIdUseCase) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(getRewardedAdLauncherUseCase, "getRewardedAdLauncherUseCase");
            Intrinsics.checkNotNullParameter(getInterstitialAdLauncherUseCase, "getInterstitialAdLauncherUseCase");
            Intrinsics.checkNotNullParameter(getAdUnitIdUseCase, "getAdUnitIdUseCase");
            return new Eu.w6(application, getRewardedAdLauncherUseCase, getInterstitialAdLauncherUseCase, getAdUnitIdUseCase);
        }

        public final Q.w6 v(InterfaceC2210n injet, Q.Xo rewardedAdUnlockUseCase, WK.n getUriFromResource) {
            Intrinsics.checkNotNullParameter(injet, "injet");
            Intrinsics.checkNotNullParameter(rewardedAdUnlockUseCase, "rewardedAdUnlockUseCase");
            Intrinsics.checkNotNullParameter(getUriFromResource, "getUriFromResource");
            return new Q.w6(injet, rewardedAdUnlockUseCase, getUriFromResource);
        }

        public final nKt.n wTp(Context context, InterfaceC1335n concierge) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            return nKt.n.f71040n.t(context, new C1295qz(context), concierge);
        }

        private final void M(Context context, pq.Ml ml) {
            Map map;
            String string;
            String string2;
            String string3;
            String string4;
            double dDoubleValue;
            String string5;
            Object obj;
            try {
                Object obj2 = ml.n().get("ad_revenue");
                Object obj3 = null;
                if (obj2 instanceof Map) {
                    map = (Map) obj2;
                } else {
                    map = null;
                }
                Bundle bundle = new Bundle();
                Object obj4 = ml.n().get("ad_mediator");
                if (obj4 != null) {
                    string = obj4.toString();
                } else {
                    string = null;
                }
                String str = "";
                if (string == null) {
                    string = "";
                }
                bundle.putString("ad_platform", string);
                Object obj5 = ml.n().get("ad_network");
                if (obj5 != null) {
                    string2 = obj5.toString();
                } else {
                    string2 = null;
                }
                if (string2 == null) {
                    string2 = "";
                }
                bundle.putString("ad_source", string2);
                Object obj6 = ml.n().get("ad_type");
                if (obj6 != null) {
                    string3 = obj6.toString();
                } else {
                    string3 = null;
                }
                if (string3 == null) {
                    string3 = "";
                }
                bundle.putString("ad_format", string3);
                Object obj7 = ml.n().get(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
                if (obj7 != null) {
                    string4 = obj7.toString();
                } else {
                    string4 = null;
                }
                if (string4 != null) {
                    str = string4;
                }
                bundle.putString("ad_unit_name", str);
                if (map != null) {
                    obj3 = map.get("value");
                }
                if ((obj3 instanceof Double) || (obj3 instanceof Number)) {
                    dDoubleValue = ((Number) obj3).doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                bundle.putDouble("value", dDoubleValue);
                if (map == null || (obj = map.get(AppLovinEventParameters.REVENUE_CURRENCY)) == null || (string5 = obj.toString()) == null) {
                    string5 = "USD";
                }
                bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, string5);
                FirebaseAnalytics.getInstance(context).rl("ad_impression", bundle);
            } catch (Exception e2) {
                Log.e("MonorepoHiltModule", "Failed to log ad_impression to Firebase", e2);
            }
        }
    }
}
