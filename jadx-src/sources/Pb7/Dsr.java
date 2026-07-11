package Pb7;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.reference.V8ValueFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr implements Pl, C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V8ValueFunction f7703n;
    private final List rl;

    public Dsr(V8ValueFunction value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7703n = value;
        this.rl = new ArrayList();
    }

    public final V8ValueFunction n() {
        return this.f7703n;
    }

    @Override // Pb7.C
    public void release() throws JavetException {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((C) it.next()).release();
        }
        if (this.f7703n.isClosed()) {
            return;
        }
        this.f7703n.close();
    }

    public String toString() {
        return "CrisperFunction()";
    }
}
