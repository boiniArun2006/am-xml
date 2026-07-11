package com.caoccao.javet.interop.options;

import com.caoccao.javet.utils.StringUtils;
import java.text.MessageFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class V8Flags {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String FLAG_ALLOW_NATIVES_SYNTAX = "--allow-natives-syntax";
    public static final String FLAG_EXPOSE_GC = "--expose-gc";
    public static final String FLAG_EXPOSE_INSPECTOR_SCRIPTS = "--expose-inspector-scripts";
    public static final String FLAG_INITIAL_HEAP_SIZE = "--initial-heap-size";
    public static final String FLAG_JS_FLOAT_16_ARRAY = "--js-float16array";
    public static final String FLAG_MAX_HEAP_SIZE = "--max-heap-size";
    public static final String FLAG_MAX_OLD_SPACE_SIZE = "--max-old-space-size";
    public static final String FLAG_USE_STRICT = "--use-strict";
    private static final String SPACE = " ";
    private boolean allowNativesSyntax = false;
    private String customFlags = null;
    private boolean exposeGC = false;
    private boolean exposeInspectorScripts = false;
    private String icuDataFile = null;
    private int initialHeapSize = 0;
    private boolean jsFloat16Array = false;
    private int maxHeapSize = 0;
    private int maxOldSpaceSize = 0;
    private boolean sealed = false;
    private boolean useStrict = true;

    public String getCustomFlags() {
        return this.customFlags;
    }

    public String getIcuDataFile() {
        return this.icuDataFile;
    }

    public int getInitialHeapSize() {
        return this.initialHeapSize;
    }

    public int getMaxHeapSize() {
        return this.maxHeapSize;
    }

    public int getMaxOldSpaceSize() {
        return this.maxOldSpaceSize;
    }

    public boolean isAllowNativesSyntax() {
        return this.allowNativesSyntax;
    }

    public boolean isExposeGC() {
        return this.exposeGC;
    }

    public boolean isExposeInspectorScripts() {
        return this.exposeInspectorScripts;
    }

    public boolean isJsFloat16Array() {
        return this.jsFloat16Array;
    }

    public boolean isSealed() {
        return this.sealed;
    }

    public boolean isUseStrict() {
        return this.useStrict;
    }

    public V8Flags seal() {
        if (!this.sealed) {
            this.sealed = true;
        }
        return this;
    }

    public V8Flags setAllowNativesSyntax(boolean z2) {
        if (!this.sealed) {
            this.allowNativesSyntax = z2;
        }
        return this;
    }

    public V8Flags setCustomFlags(String str) {
        if (!this.sealed) {
            this.customFlags = str == null ? null : str.trim();
        }
        return this;
    }

    public V8Flags setExposeGC(boolean z2) {
        if (!this.sealed) {
            this.exposeGC = z2;
        }
        return this;
    }

    public V8Flags setExposeInspectorScripts(boolean z2) {
        if (!this.sealed) {
            this.exposeInspectorScripts = z2;
        }
        return this;
    }

    public V8Flags setIcuDataFile(String str) {
        if (!this.sealed) {
            this.icuDataFile = str;
        }
        return this;
    }

    public V8Flags setInitialHeapSize(int i2) {
        if (!this.sealed) {
            this.initialHeapSize = i2;
        }
        return this;
    }

    public V8Flags setJsFloat16Array(boolean z2) {
        if (!this.sealed) {
            this.jsFloat16Array = z2;
        }
        return this;
    }

    public V8Flags setMaxHeapSize(int i2) {
        if (!this.sealed) {
            this.maxHeapSize = i2;
        }
        return this;
    }

    public V8Flags setMaxOldSpaceSize(int i2) {
        if (!this.sealed) {
            this.maxOldSpaceSize = i2;
        }
        return this;
    }

    public V8Flags setUseStrict(boolean z2) {
        if (!this.sealed) {
            this.useStrict = z2;
        }
        return this;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.allowNativesSyntax) {
            arrayList.add(FLAG_ALLOW_NATIVES_SYNTAX);
        }
        if (this.exposeGC) {
            arrayList.add(FLAG_EXPOSE_GC);
        }
        if (this.exposeInspectorScripts) {
            arrayList.add(FLAG_EXPOSE_INSPECTOR_SCRIPTS);
        }
        int i2 = this.initialHeapSize;
        if (i2 > 0) {
            arrayList.add(fromInteger(FLAG_INITIAL_HEAP_SIZE, i2));
        }
        if (this.jsFloat16Array) {
            arrayList.add("--js-float16array");
        }
        int i3 = this.maxHeapSize;
        if (i3 > 0) {
            arrayList.add(fromInteger(FLAG_MAX_HEAP_SIZE, i3));
        }
        int i5 = this.maxOldSpaceSize;
        if (i5 > 0) {
            arrayList.add(fromInteger(FLAG_MAX_OLD_SPACE_SIZE, i5));
        }
        if (this.useStrict) {
            arrayList.add(FLAG_USE_STRICT);
        }
        arrayList.sort(new fuX());
        if (StringUtils.isNotEmpty(this.customFlags)) {
            arrayList.add(this.customFlags);
        }
        return StringUtils.join(SPACE, arrayList);
    }

    V8Flags() {
    }

    private String fromInteger(String str, int i2) {
        return MessageFormat.format("{0}={1}", str, Integer.toString(i2));
    }
}
