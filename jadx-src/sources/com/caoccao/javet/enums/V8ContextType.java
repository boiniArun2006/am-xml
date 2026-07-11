package com.caoccao.javet.enums;

import com.caoccao.javet.enums.V8ContextType;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum V8ContextType {
    Await(0, "Await"),
    Block(1, "Block"),
    Catch(2, "Catch"),
    DebugEvaluate(3, "DebugEvaluate"),
    Declaration(4, "Declaration"),
    Eval(5, "Eval"),
    Function(6, "Function"),
    Module(7, "Module"),
    Script(8, "Script"),
    With(9, "With");

    private static final int LENGTH;
    private static final V8ContextType[] TYPES;
    private final int id;
    private final String name;

    static {
        int length = values().length;
        LENGTH = length;
        TYPES = new V8ContextType[length];
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.aC
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                V8ContextType.n((V8ContextType) obj);
            }
        });
    }

    public static /* synthetic */ void n(V8ContextType v8ContextType) {
        TYPES[v8ContextType.getId()] = v8ContextType;
    }

    public static V8ContextType parse(int i2) {
        return (i2 < 0 || i2 >= LENGTH) ? Await : TYPES[i2];
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    V8ContextType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }
}
