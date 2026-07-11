package com.caoccao.javet.enums;

import com.caoccao.javet.enums.V8ValueErrorType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum V8ValueErrorType {
    Error(0, "Error"),
    RangeError(1, "RangeError"),
    ReferenceError(2, "ReferenceError"),
    SyntaxError(3, "SyntaxError"),
    TypeError(4, "TypeError"),
    WasmCompileError(5, "CompileError"),
    WasmLinkError(6, "LinkError"),
    WasmRuntimeError(7, "RuntimeError"),
    UnknownError(8, "UnknownError");

    private static final int LENGTH;
    private static final Map<String, V8ValueErrorType> NAME_MAP;
    private static final V8ValueErrorType[] TYPES;
    private final int id;
    private final String name;

    public static V8ValueErrorType parse(int i2) {
        return (i2 < 0 || i2 >= LENGTH) ? UnknownError : TYPES[i2];
    }

    static {
        int length = values().length;
        LENGTH = length;
        NAME_MAP = new HashMap();
        TYPES = new V8ValueErrorType[length];
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                V8ValueErrorType.n((V8ValueErrorType) obj);
            }
        });
    }

    public static /* synthetic */ void n(V8ValueErrorType v8ValueErrorType) {
        TYPES[v8ValueErrorType.getId()] = v8ValueErrorType;
        NAME_MAP.put(v8ValueErrorType.getName(), v8ValueErrorType);
    }

    public static V8ValueErrorType parse(String str) {
        return NAME_MAP.getOrDefault(str, UnknownError);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    V8ValueErrorType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }
}
