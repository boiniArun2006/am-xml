package com.caoccao.javet.interop.monitoring;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V8SharedMemoryStatistics {
    private final long readOnlySpacePhysicalSize;
    private final long readOnlySpaceSize;
    private final long readOnlySpaceUsedSize;

    public String toString() {
        return toString(false);
    }

    public long getReadOnlySpacePhysicalSize() {
        return this.readOnlySpacePhysicalSize;
    }

    public long getReadOnlySpaceSize() {
        return this.readOnlySpaceSize;
    }

    public long getReadOnlySpaceUsedSize() {
        return this.readOnlySpaceUsedSize;
    }

    public V8SharedMemoryStatistics minus(V8SharedMemoryStatistics v8SharedMemoryStatistics) {
        return new V8SharedMemoryStatistics(this.readOnlySpacePhysicalSize - v8SharedMemoryStatistics.readOnlySpacePhysicalSize, this.readOnlySpaceSize - v8SharedMemoryStatistics.readOnlySpaceSize, this.readOnlySpaceUsedSize - v8SharedMemoryStatistics.readOnlySpaceUsedSize);
    }

    public String toString(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("name = ");
        sb.append(V8SharedMemoryStatistics.class.getSimpleName());
        if (!z2 || this.readOnlySpacePhysicalSize != 0) {
            sb.append(", ");
            sb.append("readOnlySpacePhysicalSize = ");
            sb.append(this.readOnlySpacePhysicalSize);
        }
        if (!z2 || this.readOnlySpaceSize != 0) {
            sb.append(", ");
            sb.append("readOnlySpaceSize = ");
            sb.append(this.readOnlySpaceSize);
        }
        if (!z2 || this.readOnlySpaceUsedSize != 0) {
            sb.append(", ");
            sb.append("readOnlySpaceUsedSize = ");
            sb.append(this.readOnlySpaceUsedSize);
        }
        return sb.toString();
    }

    public V8SharedMemoryStatistics(long j2, long j3, long j4) {
        this.readOnlySpacePhysicalSize = j2;
        this.readOnlySpaceSize = j3;
        this.readOnlySpaceUsedSize = j4;
    }
}
