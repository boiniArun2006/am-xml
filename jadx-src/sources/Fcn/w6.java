package Fcn;

import TFv.CN3;
import TFv.Wre;
import U5u.j;
import com.bendingspoons.oracle.models.OracleResponse;
import com.squareup.moshi.JsonReader;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import qu.I28;
import rB.Ml;
import x0X.n;
import xFr.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f2777n;

        /* JADX INFO: renamed from: Fcn.w6$j$j, reason: collision with other inner class name */
        public static final class C0097j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3 f2778n;

            /* JADX INFO: renamed from: Fcn.w6$j$j$j, reason: collision with other inner class name */
            public static final class C0098j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f2780n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f2781t;

                public C0098j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f2780n = obj;
                    this.f2781t |= Integer.MIN_VALUE;
                    return C0097j.this.rl(null, this);
                }
            }

            public C0097j(CN3 cn3) {
                this.f2778n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0098j c0098j;
                if (continuation instanceof C0098j) {
                    c0098j = (C0098j) continuation;
                    int i2 = c0098j.f2781t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0098j.f2781t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0098j = new C0098j(continuation);
                    }
                }
                Object obj2 = c0098j.f2780n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0098j.f2781t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    CN3 cn3 = this.f2778n;
                    OracleResponse oracleResponse = (OracleResponse) obj;
                    String rawBody = oracleResponse != null ? oracleResponse.getRawBody() : null;
                    c0098j.f2781t = 1;
                    if (cn3.rl(rawBody, c0098j) == coroutine_suspended) {
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

        public j(Wre wre) {
            this.f2777n = wre;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = this.f2777n.n(new C0097j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O() {
        return "Response has no settings property.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0X.n nr(et.n nVar, String oracleResponse) {
        Intrinsics.checkNotNullParameter(oracleResponse, "oracleResponse");
        JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(oracleResponse));
        try {
            Intrinsics.checkNotNull(jsonReaderOf);
            String strNr = aC.nr(jsonReaderOf, "settings");
            CloseableKt.closeFinally(jsonReaderOf, null);
            x0X.n nVarRl = x0X.n.f75185n.rl(strNr, new Function0() { // from class: Fcn.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.O();
                }
            });
            if (!(nVarRl instanceof n.C1266n)) {
                if (!(nVarRl instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVarRl = nVar.n((String) ((n.w6) nVarRl).n());
            }
            if (nVarRl instanceof n.C1266n) {
                return new n.C1266n(new Error((Throwable) ((n.C1266n) nVarRl).n()));
            }
            if (nVarRl instanceof n.w6) {
                return nVarRl;
            }
            throw new NoWhenBranchMatchedException();
        } finally {
        }
    }

    public static final U5u.j t(j.C0378j c0378j, final et.n jsonSerializer, I28 oracleResponseStore, Ml spiderSense) {
        Intrinsics.checkNotNullParameter(c0378j, "<this>");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        return c0378j.n(new j(oracleResponseStore.rl()), new HF.j() { // from class: Fcn.j
            @Override // HF.j
            public final x0X.n n(String str) {
                return w6.nr(jsonSerializer, str);
            }
        }, spiderSense);
    }
}
