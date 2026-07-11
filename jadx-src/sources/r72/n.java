package r72;

import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import com.bendingspoons.spidersense.domain.network.entities.NetworkPacket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r72.n;
import sJa.I28;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements B8O.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private I28.w6 f72864n;
    private final sJa.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f72863t = new j(null);
    public static final int nr = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: renamed from: r72.n$n, reason: collision with other inner class name */
    public static abstract class AbstractC1150n {

        /* JADX INFO: renamed from: r72.n$n$j */
        public static abstract class j extends AbstractC1150n {

            /* JADX INFO: renamed from: r72.n$n$j$j, reason: collision with other inner class name */
            public static final class C1151j extends j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final C1151j f72865n = new C1151j();

                private C1151j() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1151j);
                }

                public String toString() {
                    return "Network";
                }

                public int hashCode() {
                    return -1031062555;
                }
            }

            /* JADX INFO: renamed from: r72.n$n$j$n, reason: collision with other inner class name */
            public static final class C1152n extends j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public static final C1152n f72866n = new C1152n();

                private C1152n() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1152n);
                }

                public String toString() {
                    return "Repository";
                }

                public int hashCode() {
                    return -644314573;
                }
            }

            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: r72.n$n$n, reason: collision with other inner class name */
        public static final class C1153n extends AbstractC1150n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C1153n f72867n = new C1153n();

            private C1153n() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1153n);
            }

            public String toString() {
                return "Success";
            }

            public int hashCode() {
                return 1948516736;
            }
        }

        public /* synthetic */ AbstractC1150n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1150n() {
        }
    }

    static final class w6 implements I28.j {
        final /* synthetic */ Function0 J2;
        final /* synthetic */ boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f72868O;
        final /* synthetic */ lA5.j Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AE.j f72869n;
        final /* synthetic */ raJ.j nr;
        final /* synthetic */ int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ v8.j f72870t;
        final /* synthetic */ n xMQ;

        static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f72871O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f72872n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f72873r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f72874t;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f72871O = obj;
                this.f72873r |= Integer.MIN_VALUE;
                return w6.this.n(this);
            }
        }

        w6(AE.j jVar, int i2, v8.j jVar2, raJ.j jVar3, String str, Function0 function0, lA5.j jVar4, boolean z2, n nVar) {
            this.f72869n = jVar;
            this.rl = i2;
            this.f72870t = jVar2;
            this.nr = jVar3;
            this.f72868O = str;
            this.J2 = function0;
            this.Uo = jVar4;
            this.KN = z2;
            this.xMQ = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String KN(List list) {
            return CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, new Function1() { // from class: r72.CN3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n.w6.xMQ((CompleteDebugEvent) obj);
                }
            }, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence xMQ(CompleteDebugEvent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return "\t" + it;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // sJa.I28.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object n(Continuation continuation) {
            j jVar;
            w6 w6Var;
            final List list;
            List list2;
            w6 w6Var2;
            Object objT;
            final List list3;
            w6 w6Var3;
            boolean z2;
            boolean z3;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f72873r;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f72873r = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object objO = jVar.f72871O;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f72873r;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objO);
                AE.j jVar2 = this.f72869n;
                long j2 = this.rl;
                jVar.f72872n = this;
                jVar.f72873r = 1;
                objO = jVar2.O(j2, jVar);
                if (objO != coroutine_suspended) {
                    w6Var = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) jVar.f72874t;
                    w6Var3 = (w6) jVar.f72872n;
                    ResultKt.throwOnFailure(objO);
                    x0X.n nVar = (x0X.n) objO;
                    z3 = nVar instanceof n.C1266n;
                    if (!z3) {
                        ifA.Ml.n((ifA.w6) ((n.C1266n) nVar).n());
                    } else if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n nVar2 = w6Var3.xMQ;
                    if (!z3) {
                        I28.w6.C1165w6 c1165w6 = new I28.w6.C1165w6(AbstractC1150n.j.C1152n.f72866n);
                        nVar2.f72864n = c1165w6;
                        return c1165w6;
                    }
                    if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((n.w6) nVar).n();
                    v8.n.nr(w6Var3.f72870t, new Function0() { // from class: r72.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.w6.Uo(list3);
                        }
                    });
                    v8.n.O(w6Var3.f72870t, new Function0() { // from class: r72.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.w6.KN(list3);
                        }
                    });
                    I28.w6.C1165w6 c1165w62 = new I28.w6.C1165w6(AbstractC1150n.C1153n.f72867n);
                    w6Var3.xMQ.f72864n = c1165w62;
                    return c1165w62;
                }
                list2 = (List) jVar.f72874t;
                w6Var2 = (w6) jVar.f72872n;
                ResultKt.throwOnFailure(objO);
                x0X.n nVar3 = (x0X.n) objO;
                n nVar4 = w6Var2.xMQ;
                z2 = nVar3 instanceof n.C1266n;
                if (!z2) {
                    NetworkError networkError = (NetworkError) ((n.C1266n) nVar3).n();
                    if (!Intrinsics.areEqual(nVar4.f72864n, new I28.w6.C1165w6(AbstractC1150n.j.C1151j.f72865n))) {
                        ifA.Ml.n(aw.j.n(networkError, "PeriodicEventUploader"));
                    }
                } else if (!(nVar3 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                n nVar5 = w6Var2.xMQ;
                if (!z2) {
                    I28.w6.C1165w6 c1165w63 = new I28.w6.C1165w6(AbstractC1150n.j.C1151j.f72865n);
                    nVar5.f72864n = c1165w63;
                    return c1165w63;
                }
                if (!(nVar3 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((n.w6) nVar3).n();
                list = list2;
                w6Var = w6Var2;
                AE.j jVar3 = w6Var.f72869n;
                jVar.f72872n = w6Var;
                jVar.f72874t = list;
                jVar.f72873r = 3;
                objT = jVar3.t(list, jVar);
                if (objT != coroutine_suspended) {
                    list3 = list;
                    objO = objT;
                    w6Var3 = w6Var;
                    x0X.n nVar6 = (x0X.n) objO;
                    z3 = nVar6 instanceof n.C1266n;
                    if (!z3) {
                    }
                    n nVar22 = w6Var3.xMQ;
                    if (!z3) {
                    }
                }
                return coroutine_suspended;
            }
            w6Var = (w6) jVar.f72872n;
            ResultKt.throwOnFailure(objO);
            x0X.n nVar7 = (x0X.n) objO;
            boolean z4 = nVar7 instanceof n.C1266n;
            if (z4) {
                ifA.Ml.n((ifA.w6) ((n.C1266n) nVar7).n());
            } else if (!(nVar7 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            n nVar8 = w6Var.xMQ;
            if (z4) {
                I28.w6.C1165w6 c1165w64 = new I28.w6.C1165w6(AbstractC1150n.j.C1152n.f72866n);
                nVar8.f72864n = c1165w64;
                return c1165w64;
            }
            if (!(nVar7 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            list = (List) ((n.w6) nVar7).n();
            v8.n.O(w6Var.f72870t, new Function0() { // from class: r72.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.w6.mUb(list);
                }
            });
            final List listN = w6Var.nr.n(list);
            v8.n.O(w6Var.f72870t, new Function0() { // from class: r72.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.w6.gh(listN);
                }
            });
            if (listN.isEmpty()) {
                AE.j jVar32 = w6Var.f72869n;
                jVar.f72872n = w6Var;
                jVar.f72874t = list;
                jVar.f72873r = 3;
                objT = jVar32.t(list, jVar);
                if (objT != coroutine_suspended) {
                }
            } else {
                String str = w6Var.f72868O;
                double dDoubleValue = ((Number) w6Var.J2.invoke()).doubleValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    arrayList.add(GjB.j.n((CompleteDebugEvent) it.next()));
                }
                NetworkPacket networkPacket = new NetworkPacket(str, dDoubleValue, arrayList);
                lA5.j jVar4 = w6Var.Uo;
                boolean z5 = w6Var.KN;
                jVar.f72872n = w6Var;
                jVar.f72874t = list;
                jVar.f72873r = 2;
                Object objN = jVar4.n(networkPacket, z5, jVar);
                if (objN != coroutine_suspended) {
                    w6 w6Var4 = w6Var;
                    list2 = list;
                    objO = objN;
                    w6Var2 = w6Var4;
                    x0X.n nVar32 = (x0X.n) objO;
                    n nVar42 = w6Var2.xMQ;
                    z2 = nVar32 instanceof n.C1266n;
                    if (!z2) {
                    }
                    n nVar52 = w6Var2.xMQ;
                    if (!z2) {
                    }
                }
            }
            return coroutine_suspended;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(List list) {
            return "Sent " + list.size() + " events successfully.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh(List list) {
            return "Sampled " + list.size() + " events from local storage.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb(List list) {
            return "Read " + list.size() + " events from local storage.";
        }
    }

    public n(AE.j eventRetriever, int i2, Function0 timestampProvider, lA5.j networkInterface, q3M.n uploadDelayProvider, sJa.Wre periodicDaemonFactory, raJ.j sampler, String userId, boolean z2, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(eventRetriever, "eventRetriever");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(networkInterface, "networkInterface");
        Intrinsics.checkNotNullParameter(uploadDelayProvider, "uploadDelayProvider");
        Intrinsics.checkNotNullParameter(periodicDaemonFactory, "periodicDaemonFactory");
        Intrinsics.checkNotNullParameter(sampler, "sampler");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.rl = periodicDaemonFactory.n(uploadDelayProvider, new w6(eventRetriever, i2, localLogger, sampler, userId, timestampProvider, networkInterface, z2, this));
    }

    @Override // B8O.j
    public Object n(Continuation continuation) {
        Object objN = this.rl.n(continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // B8O.j
    public void start() {
        this.rl.start();
    }
}
