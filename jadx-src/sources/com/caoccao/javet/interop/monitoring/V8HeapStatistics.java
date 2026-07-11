package com.caoccao.javet.interop.monitoring;

import ScC.FuwU.XIvb;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class V8HeapStatistics {
    private final long doesZapGarbage;
    private final long externalMemory;
    private final long heapSizeLimit;
    private final long mallocedMemory;
    private final long numberOfDetachedContexts;
    private final long numberOfNativeContexts;
    private final long peakMallocedMemory;
    private final long totalAvailableSize;
    private final long totalGlobalHandlesSize;
    private final long totalHeapSize;
    private final long totalHeapSizeExecutable;
    private final long totalPhysicalSize;
    private final long usedGlobalHandlesSize;
    private final long usedHeapSize;

    public String toString() {
        return toString(false);
    }

    public long getDoesZapGarbage() {
        return this.doesZapGarbage;
    }

    public long getExternalMemory() {
        return this.externalMemory;
    }

    public long getHeapSizeLimit() {
        return this.heapSizeLimit;
    }

    public long getMallocedMemory() {
        return this.mallocedMemory;
    }

    public long getNumberOfDetachedContexts() {
        return this.numberOfDetachedContexts;
    }

    public long getNumberOfNativeContexts() {
        return this.numberOfNativeContexts;
    }

    public long getPeakMallocedMemory() {
        return this.peakMallocedMemory;
    }

    public long getTotalAvailableSize() {
        return this.totalAvailableSize;
    }

    public long getTotalGlobalHandlesSize() {
        return this.totalGlobalHandlesSize;
    }

    public long getTotalHeapSize() {
        return this.totalHeapSize;
    }

    public long getTotalHeapSizeExecutable() {
        return this.totalHeapSizeExecutable;
    }

    public long getTotalPhysicalSize() {
        return this.totalPhysicalSize;
    }

    public long getUsedGlobalHandlesSize() {
        return this.usedGlobalHandlesSize;
    }

    public long getUsedHeapSize() {
        return this.usedHeapSize;
    }

    public V8HeapStatistics minus(V8HeapStatistics v8HeapStatistics) {
        return new V8HeapStatistics(this.doesZapGarbage - v8HeapStatistics.doesZapGarbage, this.externalMemory - v8HeapStatistics.externalMemory, this.heapSizeLimit - v8HeapStatistics.heapSizeLimit, this.mallocedMemory - v8HeapStatistics.mallocedMemory, this.numberOfDetachedContexts - v8HeapStatistics.numberOfDetachedContexts, this.numberOfNativeContexts - v8HeapStatistics.numberOfNativeContexts, this.peakMallocedMemory - v8HeapStatistics.peakMallocedMemory, this.totalAvailableSize - v8HeapStatistics.totalAvailableSize, this.totalGlobalHandlesSize - v8HeapStatistics.totalGlobalHandlesSize, this.totalHeapSize - v8HeapStatistics.totalHeapSize, this.totalHeapSizeExecutable - v8HeapStatistics.totalHeapSizeExecutable, this.totalPhysicalSize - v8HeapStatistics.totalPhysicalSize, this.usedGlobalHandlesSize - v8HeapStatistics.usedGlobalHandlesSize, this.usedHeapSize - v8HeapStatistics.usedHeapSize);
    }

    public String toString(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("name = ");
        sb.append(V8HeapStatistics.class.getSimpleName());
        if (!z2 || this.doesZapGarbage != 0) {
            sb.append(", ");
            sb.append("doesZapGarbage = ");
            sb.append(this.doesZapGarbage);
        }
        if (!z2 || this.externalMemory != 0) {
            sb.append(", ");
            sb.append("externalMemory = ");
            sb.append(this.externalMemory);
        }
        if (!z2 || this.heapSizeLimit != 0) {
            sb.append(", ");
            sb.append("heapSizeLimit = ");
            sb.append(this.heapSizeLimit);
        }
        if (!z2 || this.mallocedMemory != 0) {
            sb.append(", ");
            sb.append("mallocedMemory = ");
            sb.append(this.mallocedMemory);
        }
        if (!z2 || this.numberOfDetachedContexts != 0) {
            sb.append(", ");
            sb.append("numberOfDetachedContexts = ");
            sb.append(this.numberOfDetachedContexts);
        }
        if (!z2 || this.numberOfNativeContexts != 0) {
            sb.append(", ");
            sb.append("numberOfNativeContexts = ");
            sb.append(this.numberOfNativeContexts);
        }
        if (!z2 || this.peakMallocedMemory != 0) {
            sb.append(", ");
            sb.append("peakMallocedMemory = ");
            sb.append(this.peakMallocedMemory);
        }
        if (!z2 || this.totalAvailableSize != 0) {
            sb.append(", ");
            sb.append(XIvb.CQJJ);
            sb.append(this.totalAvailableSize);
        }
        if (!z2 || this.totalGlobalHandlesSize != 0) {
            sb.append(", ");
            sb.append("totalGlobalHandlesSize = ");
            sb.append(this.totalGlobalHandlesSize);
        }
        if (!z2 || this.totalHeapSize != 0) {
            sb.append(", ");
            sb.append("totalHeapSize = ");
            sb.append(this.totalHeapSize);
        }
        if (!z2 || this.totalHeapSizeExecutable != 0) {
            sb.append(", ");
            sb.append("totalHeapSizeExecutable = ");
            sb.append(this.totalHeapSizeExecutable);
        }
        if (!z2 || this.totalPhysicalSize != 0) {
            sb.append(", ");
            sb.append("totalPhysicalSize = ");
            sb.append(this.totalPhysicalSize);
        }
        if (!z2 || this.usedGlobalHandlesSize != 0) {
            sb.append(", ");
            sb.append("usedGlobalHandlesSize = ");
            sb.append(this.usedGlobalHandlesSize);
        }
        if (!z2 || this.usedHeapSize != 0) {
            sb.append(", ");
            sb.append("usedHeapSize = ");
            sb.append(this.usedHeapSize);
        }
        return sb.toString();
    }

    public V8HeapStatistics(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.doesZapGarbage = j2;
        this.externalMemory = j3;
        this.heapSizeLimit = j4;
        this.mallocedMemory = j5;
        this.numberOfDetachedContexts = j6;
        this.numberOfNativeContexts = j7;
        this.peakMallocedMemory = j9;
        this.totalAvailableSize = j10;
        this.totalGlobalHandlesSize = j11;
        this.totalHeapSize = j12;
        this.totalHeapSizeExecutable = j13;
        this.totalPhysicalSize = j14;
        this.usedGlobalHandlesSize = j15;
        this.usedHeapSize = j16;
    }
}
