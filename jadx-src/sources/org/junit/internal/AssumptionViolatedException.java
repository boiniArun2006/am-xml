package org.junit.internal;

import PA.I28;
import PA.Ml;
import PA.Wre;
import PA.w6;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class AssumptionViolatedException extends RuntimeException implements I28 {
    private final Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f71574O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71575n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f71576t;

    @Override // PA.I28
    public void n(w6 w6Var) {
        String str = this.f71575n;
        if (str != null) {
            w6Var.n(str);
        }
        if (this.f71576t) {
            if (this.f71575n != null) {
                w6Var.n(": ");
            }
            w6Var.n("got: ");
            w6Var.rl(this.f71574O);
            if (this.J2 != null) {
                w6Var.n(", expected: ");
                w6Var.t(this.J2);
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("fAssumption", this.f71575n);
        putFieldPutFields.put("fValueMatcher", this.f71576t);
        putFieldPutFields.put("fMatcher", j.rl(this.J2));
        putFieldPutFields.put("fValue", n.n(this.f71574O));
        objectOutputStream.writeFields();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return Wre.gh(this);
    }
}
