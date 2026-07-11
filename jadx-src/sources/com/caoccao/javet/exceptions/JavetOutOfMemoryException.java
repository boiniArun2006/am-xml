package com.caoccao.javet.exceptions;

import com.caoccao.javet.interop.monitoring.V8HeapStatistics;
import com.caoccao.javet.utils.SimpleMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetOutOfMemoryException extends JavetException {
    protected V8HeapStatistics v8HeapStatistics;

    /* JADX WARN: Illegal instructions before constructor call */
    public JavetOutOfMemoryException(String str, V8HeapStatistics v8HeapStatistics) {
        JavetError javetError = JavetError.RuntimeOutOfMemory;
        Objects.requireNonNull(v8HeapStatistics);
        super(javetError, (Map<String, Object>) SimpleMap.of("message", str, JavetError.PARAMETER_HEAP_STATISTICS, v8HeapStatistics.toString()));
        this.v8HeapStatistics = v8HeapStatistics;
    }

    public V8HeapStatistics getV8HeapStatistics() {
        return this.v8HeapStatistics;
    }
}
