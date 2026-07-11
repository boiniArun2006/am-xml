package com.caoccao.javet.enums;

import com.caoccao.javet.enums.V8ScopeType;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum V8ScopeType {
    Global(0, "Global"),
    Local(1, "Local"),
    With(2, "With"),
    Closure(3, "Closure"),
    Catch(4, "Catch"),
    Block(5, "Block"),
    Script(6, "Script"),
    Eval(7, "Eval"),
    Module(8, "Module");

    private static final int LENGTH;
    private static final V8ScopeType[] TYPES;
    private final int id;
    private final String name;

    static {
        int length = values().length;
        LENGTH = length;
        TYPES = new V8ScopeType[length];
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.C
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                V8ScopeType.n((V8ScopeType) obj);
            }
        });
    }

    public static /* synthetic */ void n(V8ScopeType v8ScopeType) {
        TYPES[v8ScopeType.getId()] = v8ScopeType;
    }

    public static V8ScopeType parse(int i2) {
        return (i2 < 0 || i2 >= LENGTH) ? Global : TYPES[i2];
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    V8ScopeType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }
}
