package com.caoccao.javet.enums;

import com.caoccao.javet.enums.V8ValueReferenceType;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInPromise;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum V8ValueReferenceType {
    Invalid(0, "Invalid"),
    Object(1, V8ValueBuiltInObject.NAME),
    Error(2, "Error"),
    RegExp(3, "RegExp"),
    Promise(4, V8ValueBuiltInPromise.NAME),
    Proxy(5, "Proxy"),
    Symbol(6, V8ValueBuiltInSymbol.NAME),
    SymbolObject(7, "SymbolObject"),
    Arguments(8, "Arguments"),
    Map(9, "Map"),
    Set(10, "Set"),
    Array(11, "Array"),
    Function(12, "Function"),
    Iterator(13, "Iterator"),
    WeakMap(14, "WeakMap"),
    WeakSet(15, "WeakSet"),
    Script(20, "Script"),
    Module(21, "Module"),
    Context(22, "Context"),
    BigIntObject(23, "BigIntObject"),
    BooleanObject(24, "BooleanObject"),
    IntegerObject(25, "IntegerObject"),
    DoubleObject(26, "DoubleObject"),
    StringObject(27, "StringObject"),
    DataView(30, "DataView"),
    ArrayBuffer(31, "ArrayBuffer"),
    SharedArrayBuffer(32, "SharedArrayBuffer"),
    Int8Array(33, "Int8Array"),
    Uint8Array(34, "Uint8Array"),
    Uint8ClampedArray(35, "Uint8ClampedArray"),
    Int16Array(36, "Int16Array"),
    Uint16Array(37, "Uint16Array"),
    Int32Array(38, "Int32Array"),
    Uint32Array(39, "Uint32Array"),
    Float16Array(40, "Float16Array"),
    Float32Array(41, "Float32Array"),
    Float64Array(42, "Float64Array"),
    BigInt64Array(43, "BigInt64Array"),
    BigUint64Array(44, "BigUint64Array");

    private static final int LENGTH = 45;
    private static final V8ValueReferenceType[] TYPES = new V8ValueReferenceType[45];
    private final int id;
    private final String name;

    static {
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.Pl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                V8ValueReferenceType.n((V8ValueReferenceType) obj);
            }
        });
    }

    public static /* synthetic */ void n(V8ValueReferenceType v8ValueReferenceType) {
        TYPES[v8ValueReferenceType.getId()] = v8ValueReferenceType;
    }

    public static V8ValueReferenceType parse(int i2) {
        return (i2 < 0 || i2 >= 45) ? Invalid : TYPES[i2];
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    V8ValueReferenceType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }
}
