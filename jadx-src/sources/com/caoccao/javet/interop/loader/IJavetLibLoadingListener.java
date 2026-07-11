package com.caoccao.javet.interop.loader;

import com.caoccao.javet.enums.JSRuntimeType;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface IJavetLibLoadingListener {
    default File getLibPath(JSRuntimeType jSRuntimeType) {
        return null;
    }

    default boolean isDeploy(JSRuntimeType jSRuntimeType) {
        return true;
    }

    default boolean isLibInSystemPath(JSRuntimeType jSRuntimeType) {
        return false;
    }

    default boolean isSuppressingError(JSRuntimeType jSRuntimeType) {
        return false;
    }
}
