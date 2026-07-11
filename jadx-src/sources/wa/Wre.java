package wa;

import com.bendingspoons.oracle.models.OracleResponse;
import com.squareup.moshi.JsonReader;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre extends j8.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final qu.I28 f75052n;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75053O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75054n;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75054n = obj;
            this.f75053O |= Integer.MIN_VALUE;
            return Wre.this.t(this);
        }
    }

    public Wre(qu.I28 oracleResponseStore) {
        Intrinsics.checkNotNullParameter(oracleResponseStore, "oracleResponseStore");
        this.f75052n = oracleResponseStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // j8.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f75053O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f75053O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f75054n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f75053O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            qu.I28 i28 = this.f75052n;
            jVar.f75053O = 1;
            objRl = qu.Wre.rl(i28, jVar);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRl);
        }
        String rawBody = ((OracleResponse) objRl).getRawBody();
        String str = null;
        if (rawBody != null) {
            JsonReader jsonReaderOf = JsonReader.of(new Buffer().writeUtf8(rawBody));
            try {
                Intrinsics.checkNotNull(jsonReaderOf);
                String strNr = xFr.aC.nr(jsonReaderOf, "settings");
                CloseableKt.closeFinally(jsonReaderOf, null);
                str = strNr;
            } finally {
            }
        }
        return str == null ? new n.C1266n(new IllegalStateException("No settings found in Oracle response")) : new n.w6(str);
    }
}
