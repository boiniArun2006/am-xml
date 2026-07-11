package Pb7;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.primitive.V8ValueString;
import com.caoccao.javet.values.reference.IV8ValueArray;
import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 extends I28 implements C {
    private final V8ValueObject rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f7702t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CN3(V8ValueObject v8Object) {
        super(null);
        Intrinsics.checkNotNullParameter(v8Object, "v8Object");
        this.rl = v8Object;
        this.f7702t = new ArrayList();
    }

    @Override // Pb7.I28
    public Pl n(String key) throws JavetException {
        Intrinsics.checkNotNullParameter(key, "key");
        V8Value v8Value = this.rl.get(key);
        Intrinsics.checkNotNullExpressionValue(v8Value, "get(...)");
        Pl plNr = MK.j.nr(v8Value);
        if (plNr instanceof C) {
            this.f7702t.add(plNr);
        }
        return plNr;
    }

    @Override // Pb7.C
    public void release() throws JavetException {
        Iterator it = this.f7702t.iterator();
        while (it.hasNext()) {
            ((C) it.next()).release();
        }
        if (this.rl.isClosed()) {
            return;
        }
        this.rl.close();
    }

    public final V8ValueObject t() {
        return this.rl;
    }

    @Override // Pb7.I28
    public Set rl() throws JavetException {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        IV8ValueArray ownPropertyNames = this.rl.getOwnPropertyNames();
        try {
            int length = ownPropertyNames.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                String value = ((V8ValueString) ownPropertyNames.get(i2)).getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                setCreateSetBuilder.add(value);
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(ownPropertyNames, null);
            return SetsKt.build(setCreateSetBuilder);
        } finally {
        }
    }
}
