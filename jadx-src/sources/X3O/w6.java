package X3O;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 extends I28 {
    @Override // X3O.I28
    protected String O() {
        return "GET";
    }

    @Override // X3O.I28
    protected Map qie() {
        return Collections.singletonMap("alt", "media");
    }

    public w6(O6.fuX fux, com.google.firebase.Wre wre, long j2) {
        super(fux, wre);
        if (j2 != 0) {
            super.X("Range", "bytes=" + j2 + "-");
        }
    }
}
