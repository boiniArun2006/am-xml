package com.caoccao.javet.interop.engine.observers;

import com.caoccao.javet.interop.V8Runtime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8RuntimeObserverAverageCallbackContextCount implements IV8RuntimeObserver<Integer> {
    protected final List<Integer> callbackContextCountList;

    public V8RuntimeObserverAverageCallbackContextCount() {
        this(256);
    }

    public V8RuntimeObserverAverageCallbackContextCount(int i2) {
        this.callbackContextCountList = new ArrayList(i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public Integer getResult() {
        int size = 0;
        if (!this.callbackContextCountList.isEmpty()) {
            Iterator<Integer> it = this.callbackContextCountList.iterator();
            while (it.hasNext()) {
                size += it.next().intValue();
            }
            size /= this.callbackContextCountList.size();
        }
        return Integer.valueOf(size);
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void observe(V8Runtime v8Runtime) {
        this.callbackContextCountList.add(Integer.valueOf(v8Runtime.getCallbackContextCount()));
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void reset() {
        this.callbackContextCountList.clear();
    }
}
