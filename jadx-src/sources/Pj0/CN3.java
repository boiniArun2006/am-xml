package Pj0;

import Hh.C;
import Pj0.j;
import com.facebook.common.references.SharedReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class CN3 extends j {
    private CN3(SharedReference sharedReference, j.w6 w6Var, Throwable th) {
        super(sharedReference, w6Var, th);
    }

    CN3(Object obj, fuX fux, j.w6 w6Var, Throwable th) {
        super(obj, fux, w6Var, th, false);
    }

    @Override // Pj0.j
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public j clone() {
        C.xMQ(isValid());
        return new CN3(this.f7751t, this.f7749O, this.J2);
    }
}
