package com.caoccao.javet.interop.engine.observers;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.monitoring.V8HeapStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8RuntimeObserverAverageV8HeapStatistics implements IV8RuntimeObserver<V8HeapStatistics> {
    protected static final int DEFAULT_CAPACITY = 256;
    protected static final int DEFAULT_TIMEOUT_MILLIS = 5000;
    protected final int timeoutMillis;
    protected final List<CompletableFuture<V8HeapStatistics>> v8HeapStatisticsFutureList;

    public V8RuntimeObserverAverageV8HeapStatistics() {
        this(256, 5000);
    }

    public V8RuntimeObserverAverageV8HeapStatistics(int i2, int i3) {
        this.timeoutMillis = i3;
        this.v8HeapStatisticsFutureList = new ArrayList(i2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public V8HeapStatistics getResult() {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        V8HeapStatistics now;
        long doesZapGarbage = 0;
        if (this.v8HeapStatisticsFutureList.isEmpty()) {
            j2 = 0;
            j3 = 0;
            j4 = 0;
            j5 = 0;
            j6 = 0;
            j7 = 0;
            j9 = 0;
            j10 = 0;
            j11 = 0;
            j12 = 0;
            j13 = 0;
            j14 = 0;
            j15 = 0;
            j16 = 0;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis() + ((long) this.timeoutMillis);
            Iterator<CompletableFuture<V8HeapStatistics>> it = this.v8HeapStatisticsFutureList.iterator();
            long heapSizeLimit = 0;
            long mallocedMemory = 0;
            long numberOfDetachedContexts = 0;
            long numberOfNativeContexts = 0;
            long peakMallocedMemory = 0;
            long totalAvailableSize = 0;
            long totalGlobalHandlesSize = 0;
            long totalHeapSize = 0;
            long totalHeapSizeExecutable = 0;
            long totalPhysicalSize = 0;
            long usedGlobalHandlesSize = 0;
            long usedHeapSize = 0;
            int i2 = 0;
            long externalMemory = 0;
            while (it.hasNext()) {
                Iterator<CompletableFuture<V8HeapStatistics>> it2 = it;
                CompletableFuture<V8HeapStatistics> next = it.next();
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 < jCurrentTimeMillis) {
                        j18 = doesZapGarbage;
                        long j19 = jCurrentTimeMillis - jCurrentTimeMillis2;
                        j17 = jCurrentTimeMillis;
                        try {
                            now = next.get(j19, TimeUnit.MILLISECONDS);
                        } catch (Throwable unused) {
                        }
                    } else {
                        j18 = doesZapGarbage;
                        j17 = jCurrentTimeMillis;
                        now = next.getNow(null);
                    }
                    if (now != null) {
                        doesZapGarbage = j18 + now.getDoesZapGarbage();
                        try {
                            externalMemory += now.getExternalMemory();
                            heapSizeLimit += now.getHeapSizeLimit();
                            mallocedMemory += now.getMallocedMemory();
                            numberOfDetachedContexts += now.getNumberOfDetachedContexts();
                            numberOfNativeContexts += now.getNumberOfNativeContexts();
                            peakMallocedMemory += now.getPeakMallocedMemory();
                            totalAvailableSize += now.getTotalAvailableSize();
                            totalGlobalHandlesSize += now.getTotalGlobalHandlesSize();
                            totalHeapSize += now.getTotalHeapSize();
                            totalHeapSizeExecutable += now.getTotalHeapSizeExecutable();
                            totalPhysicalSize += now.getTotalPhysicalSize();
                            usedGlobalHandlesSize += now.getUsedGlobalHandlesSize();
                            usedHeapSize += now.getUsedHeapSize();
                            i2++;
                        } catch (Throwable unused2) {
                        }
                    } else {
                        doesZapGarbage = j18;
                    }
                } catch (Throwable unused3) {
                    j17 = jCurrentTimeMillis;
                }
                it = it2;
                jCurrentTimeMillis = j17;
            }
            long j20 = doesZapGarbage;
            if (i2 > 0) {
                long j21 = i2;
                long j22 = externalMemory / j21;
                long j23 = heapSizeLimit / j21;
                long j24 = mallocedMemory / j21;
                long j25 = numberOfDetachedContexts / j21;
                long j26 = numberOfNativeContexts / j21;
                long j27 = peakMallocedMemory / j21;
                long j28 = totalAvailableSize / j21;
                long j29 = totalGlobalHandlesSize / j21;
                long j30 = totalHeapSize / j21;
                long j31 = totalHeapSizeExecutable / j21;
                j16 = usedHeapSize / j21;
                j2 = j20 / j21;
                j3 = j22;
                j4 = j23;
                j5 = j24;
                j6 = j25;
                j7 = j26;
                j9 = j27;
                j10 = j28;
                j11 = j29;
                j12 = j30;
                j13 = j31;
                j14 = totalPhysicalSize / j21;
                j15 = usedGlobalHandlesSize / j21;
            } else {
                j4 = heapSizeLimit;
                j7 = numberOfNativeContexts;
                j9 = peakMallocedMemory;
                j10 = totalAvailableSize;
                j11 = totalGlobalHandlesSize;
                j12 = totalHeapSize;
                j13 = totalHeapSizeExecutable;
                j14 = totalPhysicalSize;
                j15 = usedGlobalHandlesSize;
                j16 = usedHeapSize;
                j2 = j20;
                j3 = externalMemory;
                j5 = mallocedMemory;
                j6 = numberOfDetachedContexts;
            }
        }
        return new V8HeapStatistics(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void observe(V8Runtime v8Runtime) {
        this.v8HeapStatisticsFutureList.add(v8Runtime.getV8HeapStatistics());
    }

    @Override // com.caoccao.javet.interop.engine.observers.IV8RuntimeObserver
    public void reset() {
        this.v8HeapStatisticsFutureList.clear();
    }
}
