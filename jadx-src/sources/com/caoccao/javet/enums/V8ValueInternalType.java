package com.caoccao.javet.enums;

import com.caoccao.javet.enums.V8ValueInternalType;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInPromise;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public enum V8ValueInternalType {
    Undefined(0, "Undefined"),
    Null(1, "Null"),
    NullOrUndefined(2, "NullOrUndefined"),
    True(3, "True"),
    False(4, "False"),
    Name(5, "Name"),
    String(6, "String"),
    Symbol(7, V8ValueBuiltInSymbol.NAME),
    Function(8, "Function"),
    Array(9, "Array"),
    Object(10, V8ValueBuiltInObject.NAME),
    BigInt(11, "BigInt"),
    Boolean(12, "Boolean"),
    Number(13, "Number"),
    External(14, "External"),
    Int32(15, "Int32"),
    Date(16, "Date"),
    ArgumentsObject(17, "ArgumentsObject"),
    BigIntObject(18, "BigIntObject"),
    BooleanObject(19, "BooleanObject"),
    NumberObject(20, "NumberObject"),
    StringObject(21, "StringObject"),
    SymbolObject(22, "SymbolObject"),
    NativeError(23, "NativeError"),
    RegExp(24, "RegExp"),
    AsyncFunction(25, "AsyncFunction"),
    GeneratorFunction(26, "GeneratorFunction"),
    GeneratorObject(27, "GeneratorObject"),
    Promise(28, V8ValueBuiltInPromise.NAME),
    Map(29, "Map"),
    Set(30, "Set"),
    MapIterator(31, "MapIterator"),
    SetIterator(32, "SetIterator"),
    WeakMap(33, "WeakMap"),
    WeakSet(34, "WeakSet"),
    ArrayBuffer(35, "ArrayBuffer"),
    ArrayBufferView(36, "ArrayBufferView"),
    TypedArray(37, "TypedArray"),
    Uint8Array(38, "Uint8Array"),
    Uint8ClampedArray(39, "Uint8ClampedArray"),
    Int8Array(40, "Int8Array"),
    Uint16Array(41, "Uint16Array"),
    Int16Array(42, "Int16Array"),
    Uint32Array(43, "Uint32Array"),
    Int32Array(44, "Int32Array"),
    Float16Array(45, "Float16Array"),
    Float32Array(46, "Float32Array"),
    Float64Array(47, "Float64Array"),
    BigInt64Array(48, "BigInt64Array"),
    BigUint64Array(49, "BigUint64Array"),
    DataView(50, "DataView"),
    SharedArrayBuffer(51, "SharedArrayBuffer"),
    Proxy(52, "Proxy"),
    WasmModuleObject(53, "WasmModuleObject"),
    ModuleNamespaceObject(54, "ModuleNamespaceObject");

    private static final int LENGTH;
    private static final V8ValueInternalType[] TYPES;
    private final int id;
    private final String name;

    static {
        int length = values().length;
        LENGTH = length;
        TYPES = new V8ValueInternalType[length];
        Stream.of((Object[]) values()).forEach(new Consumer() { // from class: Flz.qz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                V8ValueInternalType.n((V8ValueInternalType) obj);
            }
        });
    }

    public static /* synthetic */ void n(V8ValueInternalType v8ValueInternalType) {
        TYPES[v8ValueInternalType.getId()] = v8ValueInternalType;
    }

    public static V8ValueInternalType parse(int i2) {
        return (i2 < 0 || i2 >= LENGTH) ? Undefined : TYPES[i2];
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    V8ValueInternalType(int i2, String str) {
        this.id = i2;
        this.name = str;
    }
}
