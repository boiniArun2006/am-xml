package com.caoccao.javet.values.reference.builtin;

import android.graphics.Trmy.yioUaKMByL;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetSupplier;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueFunction;
import com.caoccao.javet.values.reference.V8ValueSymbol;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class V8ValueBuiltInSymbol extends V8ValueFunction {
    protected static final String FUNCTION_FOR = "for";
    protected static final String FUNCTION_KEY_FOR = "keyFor";
    public static final String NAME = "Symbol";
    public static final String PROPERTY_ASYNC_ITERATOR = "asyncIterator";
    public static final String PROPERTY_HAS_INSTANCE = "hasInstance";
    public static final String PROPERTY_IS_CONCAT_SPREADABLE = "isConcatSpreadable";
    public static final String PROPERTY_ITERATOR = "iterator";
    public static final String PROPERTY_MATCH = "match";
    public static final String PROPERTY_MATCH_ALL = "matchAll";
    public static final String PROPERTY_REPLACE = "replace";
    public static final String PROPERTY_SEARCH = "search";
    public static final String PROPERTY_SPECIES = "species";
    public static final String PROPERTY_SPLIT = "split";
    public static final String PROPERTY_TO_PRIMITIVE = "toPrimitive";
    public static final String PROPERTY_TO_STRING_TAG = "toStringTag";
    public static final String PROPERTY_UNSCOPABLES = "unscopables";
    public static final String SYMBOL_PROPERTY_ASYNC_ITERATOR = "Symbol.asyncIterator";
    public static final String SYMBOL_PROPERTY_HAS_INSTANCE = "Symbol.hasInstance";
    public static final String SYMBOL_PROPERTY_IS_CONCAT_SPREADABLE = "Symbol.isConcatSpreadable";
    public static final String SYMBOL_PROPERTY_ITERATOR = "Symbol.iterator";
    public static final String SYMBOL_PROPERTY_MATCH = "Symbol.match";
    public static final String SYMBOL_PROPERTY_MATCH_ALL = "Symbol.matchAll";
    public static final String SYMBOL_PROPERTY_REPLACE = "Symbol.replace";
    public static final String SYMBOL_PROPERTY_SEARCH = "Symbol.search";
    public static final String SYMBOL_PROPERTY_SPECIES = "Symbol.species";
    public static final String SYMBOL_PROPERTY_SPLIT = "Symbol.split";
    public static final String SYMBOL_PROPERTY_TO_PRIMITIVE = "Symbol.toPrimitive";
    public static final String SYMBOL_PROPERTY_TO_STRING_TAG = "Symbol.toStringTag";
    public static final String SYMBOL_PROPERTY_UNSCOPABLES = "Symbol.unscopables";
    protected Map<String, IJavetSupplier<V8ValueSymbol, Throwable>> builtInSymbolMap;

    @Override // com.caoccao.javet.interop.IV8Cloneable
    public V8ValueBuiltInSymbol toClone() throws JavetException {
        return this;
    }

    public V8ValueSymbol _for(String str) throws JavetException {
        return (V8ValueSymbol) invoke(FUNCTION_FOR, str);
    }

    public V8ValueSymbol getAsyncIterator() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_ASYNC_ITERATOR);
    }

    public V8ValueSymbol getBuiltInSymbol(String str) throws JavetException {
        IJavetSupplier<V8ValueSymbol, Throwable> iJavetSupplier = this.builtInSymbolMap.get(str);
        if (iJavetSupplier == null) {
            return null;
        }
        try {
            return iJavetSupplier.get();
        } catch (JavetException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public V8ValueSymbol getHasInstance() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_HAS_INSTANCE);
    }

    public V8ValueSymbol getIsConcatSpreadable() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_IS_CONCAT_SPREADABLE);
    }

    public V8ValueSymbol getIterator() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_ITERATOR);
    }

    public V8ValueSymbol getMatch() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_MATCH);
    }

    public V8ValueSymbol getMatchAll() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_MATCH_ALL);
    }

    public V8ValueSymbol getReplace() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_REPLACE);
    }

    public V8ValueSymbol getSearch() throws JavetException {
        return (V8ValueSymbol) get("search");
    }

    public V8ValueSymbol getSpecies() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_SPECIES);
    }

    public V8ValueSymbol getSplit() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_SPLIT);
    }

    public V8ValueSymbol getToPrimitive() throws JavetException {
        return (V8ValueSymbol) get(yioUaKMByL.CsFbotLSLzBJP);
    }

    public V8ValueSymbol getToStringTag() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_TO_STRING_TAG);
    }

    public V8ValueSymbol getUnscopables() throws JavetException {
        return (V8ValueSymbol) get(PROPERTY_UNSCOPABLES);
    }

    public String keyFor(V8ValueSymbol v8ValueSymbol) throws JavetException {
        return invokeString(FUNCTION_KEY_FOR, v8ValueSymbol);
    }

    public V8ValueBuiltInSymbol(V8Runtime v8Runtime, long j2) throws JavetException {
        super(v8Runtime, j2);
        HashMap map = new HashMap();
        this.builtInSymbolMap = map;
        map.put(PROPERTY_ASYNC_ITERATOR, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.j
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52071n.getAsyncIterator();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_HAS_INSTANCE, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.fuX
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52070n.getHasInstance();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_IS_CONCAT_SPREADABLE, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.Dsr
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52065n.getIsConcatSpreadable();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_ITERATOR, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.aC
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52069n.getIterator();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_MATCH, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.C
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52063n.getMatch();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_MATCH_ALL, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.o
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52073n.getMatchAll();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_REPLACE, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.qz
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52074n.getReplace();
            }
        });
        this.builtInSymbolMap.put("search", new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.n
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52072n.getSearch();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_SPECIES, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.w6
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52075n.getSpecies();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_SPLIT, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.Ml
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52067n.getSplit();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_TO_PRIMITIVE, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.I28
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52066n.getToPrimitive();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_TO_STRING_TAG, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.Wre
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52068n.getToStringTag();
            }
        });
        this.builtInSymbolMap.put(PROPERTY_UNSCOPABLES, new IJavetSupplier() { // from class: com.caoccao.javet.values.reference.builtin.CN3
            @Override // com.caoccao.javet.interfaces.IJavetSupplier
            public final Object get() {
                return this.f52064n.getUnscopables();
            }
        });
    }
}
