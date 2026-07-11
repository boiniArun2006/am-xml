package com.caoccao.javet.interop.engine.observers;

import com.caoccao.javet.enums.V8AllocationSpace;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.monitoring.V8HeapSpaceStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8RuntimeObserverAverageV8HeapSpaceStatistics implements IV8RuntimeObserver<V8HeapSpaceStatistics> {
    protected static final int DEFAULT_CAPACITY = 256;
    protected static final int DEFAULT_TIMEOUT_MILLIS = 5000;
    protected final int timeoutMillis;
    protected final V8AllocationSpace v8AllocationSpace;
    protected final List<CompletableFuture<V8HeapSpaceStatistics>> v8HeapSpaceStatisticsFutureList;

    public V8RuntimeObserverAverageV8HeapSpaceStatistics(V8AllocationSpace v8AllocationSpace) {
        this(v8AllocationSpace, 256, 5000);
    }

    public V8RuntimeObserverAverageV8HeapSpaceStatistics(V8AllocationSpace v8AllocationSpace, int i2, int i3) {
        Objects.requireNonNull(v8AllocationSpace);
        this.v8AllocationSpace = v8AllocationSpace;
        this.timeoutMillis = i3;
        this.v8HeapSpaceStatisticsFutureList = new ArrayList(i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public V8HeapSpaceStatistics getResult() {
        long j2;
        long j3;
        long j4;
        long j5;
        String str;
        Iterator<CompletableFuture<V8HeapSpaceStatistics>> it;
        long j6;
        V8HeapSpaceStatistics now;
        long physicalSpaceSize = 0;
        String spaceName = "";
        if (this.v8HeapSpaceStatisticsFutureList.isEmpty()) {
            j2 = 0;
            j3 = 0;
            j4 = 0;
            j5 = 0;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) this.timeoutMillis);
            Iterator<CompletableFuture<V8HeapSpaceStatistics>> it2 = this.v8HeapSpaceStatisticsFutureList.iterator();
            long spaceSize = 0;
            long spaceUsedSize = 0;
            int i2 = 0;
            long spaceAvailableSize = 0;
            while (it2.hasNext()) {
                CompletableFuture<V8HeapSpaceStatistics> next = it2.next();
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 < jCurrentTimeMillis) {
                        it = it2;
                        j6 = physicalSpaceSize;
                        try {
                            now = next.get(jCurrentTimeMillis - jCurrentTimeMillis2, TimeUnit.MILLISECONDS);
                        } catch (Throwable unused) {
                        }
                    } else {
                        it = it2;
                        j6 = physicalSpaceSize;
                        now = next.getNow(null);
                    }
                    if (now != null) {
                        if (spaceName.isEmpty()) {
                            spaceName = now.getSpaceName();
                        }
                        physicalSpaceSize = j6 + now.getPhysicalSpaceSize();
                        try {
                            spaceAvailableSize += now.getSpaceAvailableSize();
                            spaceSize += now.getSpaceSize();
                            spaceUsedSize += now.getSpaceUsedSize();
                            i2++;
                        } catch (Throwable unused2) {
                        }
                    } else {
                        physicalSpaceSize = j6;
                    }
                } catch (Throwable unused3) {
                    it = it2;
                }
                it2 = it;
            }
            long j7 = physicalSpaceSize;
            if (i2 > 0) {
                long j9 = i2;
                j5 = spaceUsedSize / j9;
                str = spaceName;
                j2 = j7 / j9;
                j3 = spaceAvailableSize / j9;
                j4 = spaceSize / j9;
                return new V8HeapSpaceStatistics(str, j2, j3, j4, j5).setAllocationSpace(this.v8AllocationSpace);
            }
            j3 = spaceAvailableSize;
            j2 = j7;
            j4 = spaceSize;
            j5 = spaceUsedSize;
        }
        str = spaceName;
        return new V8HeapSpaceStatistics(str, j2, j3, j4, j5).setAllocationSpace(this.v8AllocationSpace);
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void observe(V8Runtime v8Runtime) {
        this.v8HeapSpaceStatisticsFutureList.add(v8Runtime.getV8HeapSpaceStatistics(this.v8AllocationSpace));
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void reset() {
        this.v8HeapSpaceStatisticsFutureList.clear();
    }
}
