package com.caoccao.javet.interop.options;

import com.caoccao.javet.utils.ArrayUtils;
import com.caoccao.javet.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class NodeFlags {
    public static final String ALLOW_FS_READ = "--allow-fs-read";
    public static final String ALLOW_FS_WRITE = "--allow-fs-write";
    private static final String EQUAL = "=";
    public static final String EXPERIMENTAL_PERMISSION = "--experimental-permission";
    public static final String EXPERIMENTAL_SQLITE = "--experimental-sqlite";
    public static final String ICU_DATA_DIR = "--icu-data-dir";
    public static final String JS_FLOAT_16_ARRAY = "--js-float16array";
    public static final String NO_EXPERIMENTAL_REQUIRE_MODULE = "--no-experimental-require-module";
    public static final String NO_WARNINGS = "--no-warnings";
    private static final String SPACE = " ";
    private String icuDataDir;
    private String[] allowFsRead = null;
    private String[] allowFsWrite = null;
    private String[] customFlags = null;
    private boolean experimentalPermission = false;
    private boolean noExperimentalRequireModule = false;
    private boolean experimentalSqlite = false;
    private boolean jsFloat16Array = false;
    private boolean noWarnings = false;
    private boolean sealed = false;

    public static /* synthetic */ String[] O(int i2) {
        return new String[i2];
    }

    public static /* synthetic */ String n(String str) {
        return "--allow-fs-read=" + str.trim();
    }

    public static /* synthetic */ String nr(String str) {
        return "--allow-fs-write=" + str.trim();
    }

    public static /* synthetic */ String[] rl(int i2) {
        return new String[i2];
    }

    public static /* synthetic */ String[] t(int i2) {
        return new String[i2];
    }

    public String[] getAllowFsRead() {
        return this.allowFsRead;
    }

    public String[] getAllowFsWrite() {
        return this.allowFsWrite;
    }

    public String[] getCustomFlags() {
        return this.customFlags;
    }

    public String getIcuDataDir() {
        return this.icuDataDir;
    }

    public boolean isExperimentalPermission() {
        return this.experimentalPermission;
    }

    public boolean isExperimentalSqlite() {
        return this.experimentalSqlite;
    }

    public boolean isJsFloat16Array() {
        return this.jsFloat16Array;
    }

    public boolean isNoExperimentalRequireModule() {
        return this.noExperimentalRequireModule;
    }

    public boolean isNoWarnings() {
        return this.noWarnings;
    }

    public boolean isSealed() {
        return this.sealed;
    }

    public NodeFlags seal() {
        if (!this.sealed) {
            this.sealed = true;
        }
        return this;
    }

    public NodeFlags setAllowFsRead(String[] strArr) {
        if (!this.sealed) {
            if (ArrayUtils.isEmpty(strArr)) {
                this.allowFsRead = null;
                return this;
            }
            this.allowFsRead = (String[]) Stream.of((Object[]) strArr).filter(new j()).toArray(new IntFunction() { // from class: com.caoccao.javet.interop.options.n
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return NodeFlags.rl(i2);
                }
            });
            this.experimentalPermission = true;
        }
        return this;
    }

    public NodeFlags setAllowFsWrite(String[] strArr) {
        if (!this.sealed) {
            if (ArrayUtils.isEmpty(strArr)) {
                this.allowFsWrite = null;
                return this;
            }
            this.allowFsWrite = (String[]) Stream.of((Object[]) strArr).filter(new j()).toArray(new IntFunction() { // from class: com.caoccao.javet.interop.options.Ml
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return NodeFlags.O(i2);
                }
            });
            this.experimentalPermission = true;
        }
        return this;
    }

    public NodeFlags setCustomFlags(String[] strArr) {
        if (!this.sealed) {
            if (ArrayUtils.isEmpty(strArr)) {
                this.customFlags = null;
                return this;
            }
            this.customFlags = (String[]) Stream.of((Object[]) strArr).filter(new j()).toArray(new IntFunction() { // from class: com.caoccao.javet.interop.options.w6
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return NodeFlags.t(i2);
                }
            });
        }
        return this;
    }

    public NodeFlags setExperimentalPermission(boolean z2) {
        if (!this.sealed) {
            this.experimentalPermission = z2;
        }
        return this;
    }

    public NodeFlags setExperimentalSqlite(boolean z2) {
        if (!this.sealed) {
            this.experimentalSqlite = z2;
        }
        return this;
    }

    public NodeFlags setIcuDataDir(String str) {
        if (!this.sealed) {
            this.icuDataDir = str;
        }
        return this;
    }

    public NodeFlags setJsFloat16Array(boolean z2) {
        if (!this.sealed) {
            this.jsFloat16Array = z2;
        }
        return this;
    }

    public NodeFlags setNoExperimentalRequireModule(boolean z2) {
        if (!this.sealed) {
            this.noExperimentalRequireModule = z2;
        }
        return this;
    }

    public NodeFlags setNoWarnings(boolean z2) {
        if (!this.sealed) {
            this.noWarnings = z2;
        }
        return this;
    }

    public String[] toArray() {
        final ArrayList arrayList = new ArrayList();
        if (ArrayUtils.isNotEmpty(this.allowFsRead)) {
            Stream.of((Object[]) this.allowFsRead).filter(new j()).map(new Function() { // from class: com.caoccao.javet.interop.options.I28
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return NodeFlags.n((String) obj);
                }
            }).forEach(new Consumer() { // from class: com.caoccao.javet.interop.options.Wre
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    arrayList.add((String) obj);
                }
            });
        }
        if (ArrayUtils.isNotEmpty(this.allowFsWrite)) {
            Stream.of((Object[]) this.allowFsWrite).filter(new j()).map(new Function() { // from class: com.caoccao.javet.interop.options.CN3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return NodeFlags.nr((String) obj);
                }
            }).forEach(new Consumer() { // from class: com.caoccao.javet.interop.options.Wre
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    arrayList.add((String) obj);
                }
            });
        }
        if (this.experimentalPermission) {
            arrayList.add(EXPERIMENTAL_PERMISSION);
        }
        if (this.noExperimentalRequireModule) {
            arrayList.add(NO_EXPERIMENTAL_REQUIRE_MODULE);
        }
        if (this.experimentalSqlite) {
            arrayList.add(EXPERIMENTAL_SQLITE);
        }
        if (StringUtils.isNotBlank(this.icuDataDir)) {
            arrayList.add("--icu-data-dir=" + this.icuDataDir.trim());
        }
        if (this.jsFloat16Array) {
            arrayList.add("--js-float16array");
        }
        if (this.noWarnings) {
            arrayList.add(NO_WARNINGS);
        }
        arrayList.sort(new fuX());
        if (ArrayUtils.isNotEmpty(this.customFlags)) {
            Collections.addAll(arrayList, this.customFlags);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String toString() {
        return StringUtils.join(SPACE, toArray());
    }

    NodeFlags() {
    }
}
