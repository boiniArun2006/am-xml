package com.caoccao.javet.enums;

import com.caoccao.javet.interfaces.IJavaFunction;
import com.caoccao.javet.interfaces.IJavaSupplier;
import com.caoccao.javet.interop.options.NodeRuntimeOptions;
import com.caoccao.javet.interop.options.RuntimeOptions;
import com.caoccao.javet.interop.options.V8RuntimeOptions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum JSRuntimeType {
    Node("node", false, "12.4.254.21-node.24", new IJavaSupplier() { // from class: Flz.n
        @Override // com.caoccao.javet.interfaces.IJavaSupplier
        public final Object get() {
            return new NodeRuntimeOptions();
        }
    }, new IJavaFunction() { // from class: Flz.w6
        @Override // com.caoccao.javet.interfaces.IJavaFunction
        public final Object apply(Object obj) {
            return Boolean.valueOf(((RuntimeOptions) obj) instanceof NodeRuntimeOptions);
        }
    }),
    NodeI18n("node", true, "12.4.254.21-node.24", new IJavaSupplier() { // from class: Flz.n
        @Override // com.caoccao.javet.interfaces.IJavaSupplier
        public final Object get() {
            return new NodeRuntimeOptions();
        }
    }, new IJavaFunction() { // from class: Flz.Ml
        @Override // com.caoccao.javet.interfaces.IJavaFunction
        public final Object apply(Object obj) {
            return Boolean.valueOf(((RuntimeOptions) obj) instanceof NodeRuntimeOptions);
        }
    }),
    V8("v8", false, "13.7.152.9", new IJavaSupplier() { // from class: Flz.I28
        @Override // com.caoccao.javet.interfaces.IJavaSupplier
        public final Object get() {
            return new V8RuntimeOptions();
        }
    }, new IJavaFunction() { // from class: Flz.Wre
        @Override // com.caoccao.javet.interfaces.IJavaFunction
        public final Object apply(Object obj) {
            return Boolean.valueOf(((RuntimeOptions) obj) instanceof V8RuntimeOptions);
        }
    }),
    V8I18n("v8", true, "13.7.152.9", new IJavaSupplier() { // from class: Flz.I28
        @Override // com.caoccao.javet.interfaces.IJavaSupplier
        public final Object get() {
            return new V8RuntimeOptions();
        }
    }, new IJavaFunction() { // from class: Flz.CN3
        @Override // com.caoccao.javet.interfaces.IJavaFunction
        public final Object apply(Object obj) {
            return Boolean.valueOf(((RuntimeOptions) obj) instanceof V8RuntimeOptions);
        }
    });

    private final boolean i18nEnabled;
    private final String name;
    private final IJavaSupplier<? extends RuntimeOptions<?>> runtimeOptionsConstructor;
    private final IJavaFunction<RuntimeOptions<?>, Boolean> runtimeOptionsValidator;
    private final String version;

    public String getName() {
        return this.name;
    }

    public <Options extends RuntimeOptions<?>> Options getRuntimeOptions() {
        return (Options) this.runtimeOptionsConstructor.get();
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isI18nEnabled() {
        return this.i18nEnabled;
    }

    public boolean isNode() {
        return this == Node || this == NodeI18n;
    }

    public boolean isRuntimeOptionsValid(RuntimeOptions<?> runtimeOptions) {
        return this.runtimeOptionsValidator.apply(runtimeOptions).booleanValue();
    }

    public boolean isV8() {
        return this == V8 || this == V8I18n;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name + " v" + this.version;
    }

    JSRuntimeType(String str, boolean z2, String str2, IJavaSupplier iJavaSupplier, IJavaFunction iJavaFunction) {
        Objects.requireNonNull(iJavaSupplier);
        this.runtimeOptionsConstructor = iJavaSupplier;
        Objects.requireNonNull(iJavaFunction);
        this.runtimeOptionsValidator = iJavaFunction;
        this.name = str;
        this.i18nEnabled = z2;
        this.version = str2;
    }
}
