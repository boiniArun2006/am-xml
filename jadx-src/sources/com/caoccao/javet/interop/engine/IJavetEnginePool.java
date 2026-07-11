package com.caoccao.javet.interop.engine;

import com.caoccao.javet.enums.V8AllocationSpace;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetClosable;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver;
import com.caoccao.javet.interop.engine.observers.V8RuntimeObserverAverageCallbackContextCount;
import com.caoccao.javet.interop.engine.observers.V8RuntimeObserverAverageReferenceCount;
import com.caoccao.javet.interop.engine.observers.V8RuntimeObserverAverageV8HeapSpaceStatistics;
import com.caoccao.javet.interop.engine.observers.V8RuntimeObserverAverageV8HeapStatistics;
import com.caoccao.javet.interop.engine.observers.V8RuntimeObserverAverageV8ModuleCount;
import com.caoccao.javet.interop.monitoring.V8HeapSpaceStatistics;
import com.caoccao.javet.interop.monitoring.V8HeapStatistics;
import com.caoccao.javet.interop.monitoring.V8SharedMemoryStatistics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface IJavetEnginePool<R extends V8Runtime> extends IJavetClosable {
    int getActiveEngineCount();

    JavetEngineConfig getConfig();

    IJavetEngine<R> getEngine() throws JavetException;

    int getIdleEngineCount();

    int getReleasedEngineCount();

    V8SharedMemoryStatistics getV8SharedMemoryStatistics();

    boolean isActive();

    boolean isQuitting();

    int observe(IV8RuntimeObserver<?>... iV8RuntimeObserverArr);

    void releaseEngine(IJavetEngine<R> iJavetEngine);

    void wakeUpDaemon();

    default int getAverageCallbackContextCount() {
        V8RuntimeObserverAverageCallbackContextCount v8RuntimeObserverAverageCallbackContextCount = new V8RuntimeObserverAverageCallbackContextCount(getConfig().getPoolMaxSize());
        observe(v8RuntimeObserverAverageCallbackContextCount);
        return v8RuntimeObserverAverageCallbackContextCount.getResult().intValue();
    }

    default int getAverageReferenceCount() {
        V8RuntimeObserverAverageReferenceCount v8RuntimeObserverAverageReferenceCount = new V8RuntimeObserverAverageReferenceCount(getConfig().getPoolMaxSize());
        observe(v8RuntimeObserverAverageReferenceCount);
        return v8RuntimeObserverAverageReferenceCount.getResult().intValue();
    }

    default V8HeapSpaceStatistics getAverageV8HeapSpaceStatistics(V8AllocationSpace v8AllocationSpace) {
        V8RuntimeObserverAverageV8HeapSpaceStatistics v8RuntimeObserverAverageV8HeapSpaceStatistics = new V8RuntimeObserverAverageV8HeapSpaceStatistics(v8AllocationSpace, getConfig().getPoolMaxSize(), getConfig().getObserverTimeoutMillis());
        observe(v8RuntimeObserverAverageV8HeapSpaceStatistics);
        return v8RuntimeObserverAverageV8HeapSpaceStatistics.getResult();
    }

    default V8HeapStatistics getAverageV8HeapStatistics() {
        V8RuntimeObserverAverageV8HeapStatistics v8RuntimeObserverAverageV8HeapStatistics = new V8RuntimeObserverAverageV8HeapStatistics(getConfig().getPoolMaxSize(), getConfig().getObserverTimeoutMillis());
        observe(v8RuntimeObserverAverageV8HeapStatistics);
        return v8RuntimeObserverAverageV8HeapStatistics.getResult();
    }

    default int getAverageV8ModuleCount() {
        V8RuntimeObserverAverageV8ModuleCount v8RuntimeObserverAverageV8ModuleCount = new V8RuntimeObserverAverageV8ModuleCount(getConfig().getPoolMaxSize());
        observe(v8RuntimeObserverAverageV8ModuleCount);
        return v8RuntimeObserverAverageV8ModuleCount.getResult().intValue();
    }
}
