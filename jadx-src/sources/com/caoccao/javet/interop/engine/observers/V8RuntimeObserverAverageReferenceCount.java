package com.caoccao.javet.interop.engine.observers;

import com.caoccao.javet.interop.V8Runtime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8RuntimeObserverAverageReferenceCount implements IV8RuntimeObserver<Integer> {
    protected final List<Integer> referenceCountList;

    public V8RuntimeObserverAverageReferenceCount() {
        this(256);
    }

    public V8RuntimeObserverAverageReferenceCount(int i2) {
        this.referenceCountList = new ArrayList(i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public Integer getResult() {
        int size = 0;
        if (!this.referenceCountList.isEmpty()) {
            Iterator<Integer> it = this.referenceCountList.iterator();
            while (it.hasNext()) {
                size += it.next().intValue();
            }
            size /= this.referenceCountList.size();
        }
        return Integer.valueOf(size);
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void observe(V8Runtime v8Runtime) {
        this.referenceCountList.add(Integer.valueOf(v8Runtime.getReferenceCount()));
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void reset() {
        this.referenceCountList.clear();
    }
}
