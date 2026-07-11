package com.caoccao.javet.interop.options;

import com.caoccao.javet.utils.ArrayUtils;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class NodeRuntimeOptions extends RuntimeOptions<NodeRuntimeOptions> {
    public static final NodeFlags NODE_FLAGS = new NodeFlags();
    public static final V8Flags V8_FLAGS = new V8Flags();
    private String[] consoleArguments = null;

    public static /* synthetic */ String[] n(int i2) {
        return new String[i2];
    }

    public String[] getConsoleArguments() {
        return this.consoleArguments;
    }

    public NodeRuntimeOptions setConsoleArguments(String[] strArr) {
        if (ArrayUtils.isEmpty(strArr)) {
            this.consoleArguments = null;
            return this;
        }
        this.consoleArguments = (String[]) Stream.of((Object[]) strArr).filter(new j()).toArray(new IntFunction() { // from class: com.caoccao.javet.interop.options.Dsr
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return NodeRuntimeOptions.n(i2);
            }
        });
        return this;
    }
}
