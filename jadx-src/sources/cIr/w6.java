package cIr;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 extends Dh.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43607n;
    private final FirebaseException rl;

    public static w6 nr(FirebaseException firebaseException) {
        return new w6("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (FirebaseException) Preconditions.checkNotNull(firebaseException));
    }

    @Override // Dh.Ml
    public Exception n() {
        return this.rl;
    }

    @Override // Dh.Ml
    public String rl() {
        return this.f43607n;
    }

    private w6(String str, FirebaseException firebaseException) {
        Preconditions.checkNotEmpty(str);
        this.f43607n = str;
        this.rl = firebaseException;
    }

    public static w6 t(Dh.w6 w6Var) {
        Preconditions.checkNotNull(w6Var);
        return new w6(w6Var.rl(), null);
    }
}
