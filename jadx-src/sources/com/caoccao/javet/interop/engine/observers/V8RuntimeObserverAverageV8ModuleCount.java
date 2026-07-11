package com.caoccao.javet.interop.engine.observers;

import com.caoccao.javet.interop.V8Runtime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8RuntimeObserverAverageV8ModuleCount implements IV8RuntimeObserver<Integer> {
    protected final List<Integer> v8ModuleCountList;

    public V8RuntimeObserverAverageV8ModuleCount() {
        this(256);
    }

    public V8RuntimeObserverAverageV8ModuleCount(int i2) {
        this.v8ModuleCountList = new ArrayList(i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public Integer getResult() {
        int size = 0;
        if (!this.v8ModuleCountList.isEmpty()) {
            Iterator<Integer> it = this.v8ModuleCountList.iterator();
            while (it.hasNext()) {
                size += it.next().intValue();
            }
            size /= this.v8ModuleCountList.size();
        }
        return Integer.valueOf(size);
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void observe(V8Runtime v8Runtime) {
        this.v8ModuleCountList.add(Integer.valueOf(v8Runtime.getV8ModuleCount()));
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void reset() {
        this.v8ModuleCountList.clear();
    }
}
