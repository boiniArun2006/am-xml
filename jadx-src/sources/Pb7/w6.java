package Pb7;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.V8ValueArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 extends j implements C {
    private final V8ValueArray rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f7711t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(V8ValueArray v8Array) {
        super(null);
        Intrinsics.checkNotNullParameter(v8Array, "v8Array");
        this.rl = v8Array;
        this.f7711t = new ArrayList();
    }

    @Override // Pb7.j
    public Pl n(int i2) throws JavetException {
        V8Value v8Value = this.rl.get(i2);
        Intrinsics.checkNotNullExpressionValue(v8Value, "get(...)");
        Pl plNr = MK.j.nr(v8Value);
        if (plNr instanceof C) {
            this.f7711t.add(plNr);
        }
        return plNr;
    }

    @Override // Pb7.C
    public void release() throws JavetException {
        Iterator it = this.f7711t.iterator();
        while (it.hasNext()) {
            ((C) it.next()).release();
        }
        if (this.rl.isClosed()) {
            return;
        }
        this.rl.close();
    }

    @Override // Pb7.j
    public int rl() {
        return this.rl.getLength();
    }

    public final V8ValueArray t() {
        return this.rl;
    }
}
