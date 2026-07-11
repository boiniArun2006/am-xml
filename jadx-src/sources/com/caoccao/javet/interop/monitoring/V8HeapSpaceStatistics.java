package com.caoccao.javet.interop.monitoring;

import com.caoccao.javet.enums.V8AllocationSpace;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class V8HeapSpaceStatistics {
    private final long physicalSpaceSize;
    private final long spaceAvailableSize;
    private final String spaceName;
    private final long spaceSize;
    private final long spaceUsedSize;
    private V8AllocationSpace v8AllocationSpace;

    public String toString() {
        return toString(false);
    }

    public V8AllocationSpace getAllocationSpace() {
        return this.v8AllocationSpace;
    }

    public long getPhysicalSpaceSize() {
        return this.physicalSpaceSize;
    }

    public long getSpaceAvailableSize() {
        return this.spaceAvailableSize;
    }

    public String getSpaceName() {
        return this.spaceName;
    }

    public long getSpaceSize() {
        return this.spaceSize;
    }

    public long getSpaceUsedSize() {
        return this.spaceUsedSize;
    }

    public V8HeapSpaceStatistics minus(V8HeapSpaceStatistics v8HeapSpaceStatistics) {
        return new V8HeapSpaceStatistics(this.spaceName, this.physicalSpaceSize - v8HeapSpaceStatistics.physicalSpaceSize, this.spaceAvailableSize - v8HeapSpaceStatistics.spaceAvailableSize, this.spaceSize - v8HeapSpaceStatistics.spaceSize, this.spaceUsedSize - v8HeapSpaceStatistics.spaceUsedSize);
    }

    public String toString(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("name = ");
        sb.append(V8HeapSpaceStatistics.class.getSimpleName());
        sb.append(", ");
        sb.append("spaceName = ");
        sb.append(this.spaceName);
        if (!z2 || this.physicalSpaceSize != 0) {
            sb.append(", ");
            sb.append("physicalSpaceSize = ");
            sb.append(this.physicalSpaceSize);
        }
        if (!z2 || this.spaceAvailableSize != 0) {
            sb.append(", ");
            sb.append("spaceAvailableSize = ");
            sb.append(this.spaceAvailableSize);
        }
        if (!z2 || this.spaceSize != 0) {
            sb.append(", ");
            sb.append("spaceSize = ");
            sb.append(this.spaceSize);
        }
        if (!z2 || this.spaceUsedSize != 0) {
            sb.append(", ");
            sb.append("spaceUsedSize = ");
            sb.append(this.spaceUsedSize);
        }
        return sb.toString();
    }

    public V8HeapSpaceStatistics(String str, long j2, long j3, long j4, long j5) {
        this.spaceName = str;
        this.physicalSpaceSize = j2;
        this.spaceAvailableSize = j3;
        this.spaceSize = j4;
        this.spaceUsedSize = j5;
    }

    public V8HeapSpaceStatistics setAllocationSpace(V8AllocationSpace v8AllocationSpace) {
        Objects.requireNonNull(v8AllocationSpace);
        this.v8AllocationSpace = v8AllocationSpace;
        return this;
    }
}
