package Dx;

import PMG.n;
import ajd.j;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent;
import com.bendingspoons.pico.domain.uploader.internal.network.PicoNetworkInterface;
import com.bendingspoons.pico.domain.uploader.internal.network.entities.PicoNetworkPacket;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rB.I28;
import rB.Ml;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 implements PMG.n {
    private double J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f2060O;
    private final Ml nr;
    private final PicoNetworkInterface rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final v8.j f2061t;
    public static final j Uo = new j(null);
    private static final List KN = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE), 422});

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2063n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2064t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2064t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.n(null, this);
        }
    }

    public w6(PicoNetworkInterface picoNetworkInterface, Function0 currentDateProvider, Ml spiderSense, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(picoNetworkInterface, "picoNetworkInterface");
        Intrinsics.checkNotNullParameter(currentDateProvider, "currentDateProvider");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.rl = picoNetworkInterface;
        this.f2061t = localLogger;
        this.nr = d3.j.nr(spiderSense, "uploader");
        this.J2 = ((Date) currentDateProvider.invoke()).getTime() / 1000.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence O(PicoNetworkEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "\t" + it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nr(List list) {
        return "Events uploaded to the backend:\n" + CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, new Function1() { // from class: Dx.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w6.O((PicoNetworkEvent) obj);
            }
        }, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // PMG.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(final List list, Continuation continuation) {
        n nVar;
        w6 w6Var;
        Object obj;
        String message;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objN = nVar.f2064t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            v8.n.O(this.f2061t, new Function0() { // from class: Dx.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.nr(list);
                }
            });
            PicoNetworkPacket picoNetworkPacket = new PicoNetworkPacket(this.f2060O, this.J2, list);
            PicoNetworkInterface picoNetworkInterface = this.rl;
            nVar.f2063n = this;
            nVar.J2 = 1;
            objN = picoNetworkInterface.n(picoNetworkPacket, nVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            w6Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w6Var = (w6) nVar.f2063n;
            ResultKt.throwOnFailure(objN);
        }
        Object w6Var2 = (x0X.n) objN;
        if (!(w6Var2 instanceof n.C1266n)) {
            if (!(w6Var2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            PicoNetworkInterface.SuccessResponse successResponse = (PicoNetworkInterface.SuccessResponse) ((n.w6) w6Var2).n();
            w6Var.f2060O = successResponse.getDelta();
            w6Var.J2 = successResponse.getLastEventTimestamp();
            w6Var2 = new n.w6(Unit.INSTANCE);
        }
        if (!(w6Var2 instanceof n.C1266n)) {
            if (w6Var2 instanceof n.w6) {
                return w6Var2;
            }
            throw new NoWhenBranchMatchedException();
        }
        NetworkError networkError = (NetworkError) ((n.C1266n) w6Var2).n();
        if (networkError instanceof NetworkError.j) {
            NetworkError.j jVar = (NetworkError.j) networkError;
            if (KN.contains(Boxing.boxInt(jVar.rl()))) {
                int iRl = jVar.rl();
                PicoNetworkInterface.ErrorResponse errorResponse = (PicoNetworkInterface.ErrorResponse) jVar.n();
                Pair pair = null;
                Integer numBoxInt = errorResponse != null ? Boxing.boxInt(errorResponse.getErrorCode()) : null;
                if (iRl == 400 && numBoxInt != null && numBoxInt.intValue() == 603) {
                    pair = new Pair(CollectionsKt.listOf((Object[]) new String[]{MRAIDPresenter.ERROR, "invalidSesameSignature"}), "Pico events rejected because of an invalid sesame signature");
                } else if (iRl == 422 && numBoxInt != null && numBoxInt.intValue() == 100) {
                    pair = new Pair(CollectionsKt.listOf((Object[]) new String[]{MRAIDPresenter.ERROR, "missingRequiredData"}), "Pico events rejected because they were missing required data");
                } else if (iRl == 422 && numBoxInt != null && numBoxInt.intValue() == 101) {
                    pair = new Pair(CollectionsKt.listOf((Object[]) new String[]{MRAIDPresenter.ERROR, "invalidDataFormat"}), "Pico events rejected because they data were not formatted properly");
                }
                if (pair != null) {
                    List list2 = (List) pair.component1();
                    String str = (String) pair.component2();
                    Ml ml = w6Var.nr;
                    j.EnumC0481j enumC0481j = j.EnumC0481j.J2;
                    pq.Ml ml2 = new pq.Ml();
                    ml2.O("errorDescription", com.bendingspoons.networking.j.n(networkError));
                    PicoNetworkInterface.ErrorResponse errorResponse2 = (PicoNetworkInterface.ErrorResponse) jVar.n();
                    if (errorResponse2 != null && (message = errorResponse2.getMessage()) != null) {
                        ml2.O("message", message);
                    }
                    Unit unit = Unit.INSTANCE;
                    I28.rl(ml, list2, enumC0481j, str, null, ml2, 8, null);
                }
                obj = n.AbstractC0271n.j.f7698n;
            } else {
                obj = n.AbstractC0271n.C0272n.f7699n;
            }
        }
        return new n.C1266n(obj);
    }
}
