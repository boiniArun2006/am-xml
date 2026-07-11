package CZF;

import CZF.I28;
import Dk.InterfaceC1335n;
import GJW.C;
import GJW.RzR;
import GJW.vd;
import PMG.Ml;
import android.content.Context;
import com.bendingspoons.install.InstallEventData;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import fb.AbstractC2109j;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import juU.w6;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f963n = j.rl;

    public static final class j extends AbstractC2109j {
        static final /* synthetic */ j rl = new j();

        public static final class CN3 implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre[] f964n;

            /* JADX INFO: renamed from: CZF.I28$j$CN3$j, reason: collision with other inner class name */
            public static final class C0028j implements Function0 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre[] f965n;

                public C0028j(TFv.Wre[] wreArr) {
                    this.f965n = wreArr;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object[] invoke() {
                    return new Map[this.f965n.length];
                }
            }

            public static final class n extends SuspendLambda implements Function3 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                /* synthetic */ Object f966O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f967n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private /* synthetic */ Object f968t;

                public n(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TFv.CN3 cn3, Object[] objArr, Continuation continuation) {
                    n nVar = new n(continuation);
                    nVar.f968t = cn3;
                    nVar.f966O = objArr;
                    return nVar.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f967n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        TFv.CN3 cn3 = (TFv.CN3) this.f968t;
                        Map[] mapArr = (Map[]) ((Object[]) this.f966O);
                        if (mapArr.length != 0) {
                            Map mapPlus = mapArr[0];
                            int lastIndex = ArraysKt.getLastIndex(mapArr);
                            if (1 <= lastIndex) {
                                int i3 = 1;
                                while (true) {
                                    mapPlus = MapsKt.plus(mapPlus, mapArr[i3]);
                                    if (i3 == lastIndex) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            this.f967n = 1;
                            if (cn3.rl(mapPlus, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new UnsupportedOperationException("Empty array can't be reduced.");
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            public CN3(TFv.Wre[] wreArr) {
                this.f964n = wreArr;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                TFv.Wre[] wreArr = this.f964n;
                Object objN = teV.Dsr.n(cn3, wreArr, new C0028j(wreArr), new n(null), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: CZF.I28$j$I28, reason: collision with other inner class name */
        static final class C0029I28 extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f969n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f970t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0029I28(TFv.Wre wre, Continuation continuation) {
                super(1, continuation);
                this.f970t = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0029I28(this.f970t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f969n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wre = this.f970t;
                    if (wre != null) {
                        this.f969n = 1;
                        obj = TFv.fuX.g(wre, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return MapsKt.emptyMap();
                }
                Map map = (Map) obj;
                if (map != null) {
                    return map;
                }
                return MapsKt.emptyMap();
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C0029I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class Ml extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f971n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CZF.CN3 f972t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Ml(CZF.CN3 cn3, Continuation continuation) {
                super(1, continuation);
                this.f972t = cn3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new Ml(this.f972t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f971n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f972t.n(jgV.j.n(PicoEvent.INSTANCE));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        static final class Wre extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f973n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f974t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Wre(TFv.Wre wre, Continuation continuation) {
                super(1, continuation);
                this.f974t = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new Wre(this.f974t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f973n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wre = this.f974t;
                    if (wre != null) {
                        this.f973n = 1;
                        obj = TFv.fuX.g(wre, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return new PicoAdditionalInfo.Monetization(false, null);
                }
                PicoAdditionalInfo.Monetization monetization = (PicoAdditionalInfo.Monetization) obj;
                if (monetization != null) {
                    return monetization;
                }
                return new PicoAdditionalInfo.Monetization(false, null);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final class fuX implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f975n;

            /* JADX INFO: renamed from: CZF.I28$j$fuX$j, reason: collision with other inner class name */
            public static final class C0030j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f976n;

                /* JADX INFO: renamed from: CZF.I28$j$fuX$j$j, reason: collision with other inner class name */
                public static final class C0031j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f978n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f979t;

                    public C0031j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f978n = obj;
                        this.f979t |= Integer.MIN_VALUE;
                        return C0030j.this.rl(null, this);
                    }
                }

                public C0030j(TFv.CN3 cn3) {
                    this.f976n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0031j c0031j;
                    if (continuation instanceof C0031j) {
                        c0031j = (C0031j) continuation;
                        int i2 = c0031j.f979t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0031j.f979t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0031j = new C0031j(continuation);
                        }
                    }
                    Object obj2 = c0031j.f978n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0031j.f979t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f976n;
                        Map map = (Map) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                        Iterator it = map.entrySet().iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.j.n(((Map.Entry) it.next()).getKey());
                            throw null;
                        }
                        c0031j.f979t = 1;
                        if (cn3.rl(linkedHashMap, c0031j) == coroutine_suspended) {
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

            public fuX(TFv.Wre wre) {
                this.f975n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f975n.n(new C0030j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: CZF.I28$j$j, reason: collision with other inner class name */
        /* synthetic */ class C0032j implements w6.n, FunctionAdapter {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CZF.CN3 f980n;

            C0032j(CZF.CN3 cn3) {
                this.f980n = cn3;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof w6.n) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function getFunctionDelegate() {
                return new FunctionReferenceImpl(1, this.f980n, CZF.CN3.class, "trackEvent", "trackEvent(Lcom/bendingspoons/pico/domain/entities/PicoEvent;)V", 0);
            }

            @Override // juU.w6.n
            public final void n(PicoEvent p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.f980n.n(p0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        static final class n implements AR.w6 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ n f981n;

            n(n nVar) {
                this.f981n = nVar;
            }

            @Override // AR.w6
            public final Object n(Continuation continuation) {
                return this.f981n.J2(continuation);
            }
        }

        static final class w6 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ CZF.CN3 f982O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f983n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Fyf.w6 f984t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(Fyf.w6 w6Var, CZF.CN3 cn3, Continuation continuation) {
                super(2, continuation);
                this.f984t = w6Var;
                this.f982O = cn3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new w6(this.f984t, this.f982O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f983n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Fyf.w6 w6Var = this.f984t;
                    this.f983n = 1;
                    obj = w6Var.n(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                InstallEventData installEventData = (InstallEventData) x0X.w6.nr((x0X.n) obj);
                if (installEventData != null) {
                    this.f982O.n(jgV.w6.n(PicoEvent.INSTANCE, installEventData));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Date J2() {
            return new Date();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final I28 O(rB.Ml ml, n nVar, Context context, InterfaceC1335n interfaceC1335n, Lk.j jVar, Fyf.w6 w6Var, OkHttpClient okHttpClient, TFv.Wre wre, TFv.Wre wre2) {
            TFv.Wre wreN;
            rB.Ml mlNr = d3.j.nr(ml, "pico");
            v8.Ml ml2 = new v8.Ml(nVar.n(), "Pico");
            com.bendingspoons.pico.domain.entities.additionalInfo.pico.j jVarN = com.bendingspoons.pico.domain.entities.additionalInfo.pico.w6.n(com.bendingspoons.pico.domain.entities.additionalInfo.pico.j.f51476n, context, nVar, interfaceC1335n, mlNr, new C0029I28(wre, null), new Wre(wre2, null), jVar, w6Var);
            juU.w6 w6VarRl = juU.w6.f69635n.rl(context);
            CZF.CN3 cn3 = new CZF.CN3(La.Ml.f6131n.n(context, La.w6.n(rl, nVar, interfaceC1335n), mlNr, okHttpClient, ml2), w6VarRl, new Function0() { // from class: CZF.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.J2();
                }
            }, jVarN, vd5.j.f74693n.n(context), mlNr, sJa.Ml.f73203n.n(), ml2);
            w6VarRl.rl(new C0032j(cn3));
            w6VarRl.n(nVar.KN());
            cn3.r(nVar.nr());
            cn3.J2(new n(nVar));
            C.nr(RzR.f3449n, null, null, new w6(w6Var, cn3, null), 3, null);
            List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new TFv.Wre[]{wre, (jVar == null || (wreN = jVar.n()) == null) ? null : new fuX(wreN)});
            if (!listListOfNotNull.isEmpty()) {
                new T1.n(context, new CN3((TFv.Wre[]) CollectionsKt.toList(listListOfNotNull).toArray(new TFv.Wre[0])), new Ml(cn3, null)).nr();
            }
            return cn3;
        }

        public final I28 nr(final Context context, final n config, final InterfaceC1335n concierge, final rB.Ml spiderSense, final Lk.j jVar, final TFv.Wre wre, final TFv.Wre wre2, final Fyf.w6 installManager, final OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
            Intrinsics.checkNotNullParameter(installManager, "installManager");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            return (I28) n(new Function0(config, context, concierge, jVar, installManager, okHttpClient, wre, wre2) { // from class: CZF.w6
                public final /* synthetic */ InterfaceC1335n J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                public final /* synthetic */ Context f994O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                public final /* synthetic */ TFv.Wre f995S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                public final /* synthetic */ TFv.Wre f996Z;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ OkHttpClient f998o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Fyf.w6 f999r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ I28.n f1000t;

                {
                    this.f999r = installManager;
                    this.f998o = okHttpClient;
                    this.f996Z = wre;
                    this.f995S = wre2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.j.O(this.f997n, this.f1000t, this.f994O, this.J2, null, this.f999r, this.f998o, this.f996Z, this.f995S);
                }
            });
        }

        private j() {
        }
    }

    public interface n {

        public static final class j {
            public static PMG.w6 n(n nVar) {
                return null;
            }

            public static Object nr(n nVar, Continuation continuation) {
                return new pq.Ml();
            }

            public static PMG.Ml rl(n nVar) {
                return new Ml.j(0L, 0L, 0L, 0.0d, 15, null);
            }

            public static juU.Ml t(n nVar) {
                return new juU.j(PI.j.qie.n());
            }
        }

        Object J2(Continuation continuation);

        juU.Ml KN();

        String O();

        PMG.Ml Uo();

        boolean n();

        w6 nr();

        PMG.w6 rl();

        String t();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class w6 {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f986Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f987n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ w6[] f988o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final w6 f989r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final w6 f990t;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f985O = new w6("UPLOAD", 0);
        public static final w6 J2 = new w6("DROP", 1);

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            public final w6 n() {
                return w6.f990t;
            }
        }

        static {
            w6 w6Var = new w6("STASH", 2);
            f989r = w6Var;
            w6[] w6VarArrN = n();
            f988o = w6VarArrN;
            f986Z = EnumEntriesKt.enumEntries(w6VarArrN);
            f987n = new j(null);
            f990t = w6Var;
        }

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f985O, J2, f989r};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f988o.clone();
        }

        private w6(String str, int i2) {
        }
    }

    void J2(AR.w6 w6Var);

    Object KN(Continuation continuation);

    void O(boolean z2);

    void Uo(List list);

    void n(PicoEvent picoEvent);

    void nr(List list);

    Object rl(Continuation continuation);

    boolean t();
}
