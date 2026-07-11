package JAr;

import Ds.j;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.ErrorResponse;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Ds.j rl(NetworkError networkError) {
        if (networkError instanceof NetworkError.j) {
            NetworkError.j jVar = (NetworkError.j) networkError;
            int iRl = jVar.rl();
            ErrorResponse errorResponse = (ErrorResponse) jVar.n();
            Integer errorCode = errorResponse != null ? errorResponse.getErrorCode() : null;
            ErrorResponse errorResponse2 = (ErrorResponse) jVar.n();
            return new j.Ml(iRl, errorCode, errorResponse2 != null ? errorResponse2.getMessage() : null);
        }
        if (networkError instanceof NetworkError.n) {
            return j.C0071j.f1939n;
        }
        if (networkError instanceof NetworkError.w6) {
            return j.n.f1940n;
        }
        if (networkError instanceof NetworkError.Ml) {
            return j.C0071j.f1939n;
        }
        if (networkError instanceof NetworkError.I28) {
            return j.I28.f1936n;
        }
        throw new NoWhenBranchMatchedException();
    }
}
