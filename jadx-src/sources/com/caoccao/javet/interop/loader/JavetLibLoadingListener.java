package com.caoccao.javet.interop.loader;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.utils.JavetOSUtils;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class JavetLibLoadingListener implements IJavetLibLoadingListener {
    public static final String JAVET_LIB_LOADING_TYPE_CUSTOM = "custom";
    public static final String JAVET_LIB_LOADING_TYPE_DEFAULT = "default";
    public static final String JAVET_LIB_LOADING_TYPE_SYSTEM = "system";
    public static final String PROPERTY_KEY_JAVET_LIB_LOADING_PATH = "javet.lib.loading.path";
    public static final String PROPERTY_KEY_JAVET_LIB_LOADING_SUPPRESS_ERROR = "javet.lib.loading.suppress.error";
    public static final String PROPERTY_KEY_JAVET_LIB_LOADING_TYPE = "javet.lib.loading.type";
    private static final String TEMP_ROOT_NAME = "javet";
    private final String javetLibLoadingPath = System.getProperty(PROPERTY_KEY_JAVET_LIB_LOADING_PATH);
    private final String javetLibLoadingSuppressError = System.getProperty(PROPERTY_KEY_JAVET_LIB_LOADING_SUPPRESS_ERROR, null);
    private final String javetLibLoadingType = System.getProperty(PROPERTY_KEY_JAVET_LIB_LOADING_TYPE, pTYaLzzmJSGAPQ.dfYKbfXZfmXA);

    @Override // com.caoccao.javet.interop.loader.IJavetLibLoadingListener
    public File getLibPath(JSRuntimeType jSRuntimeType) {
        return this.javetLibLoadingPath == null ? new File(JavetOSUtils.TEMP_DIRECTORY, "javet") : new File(this.javetLibLoadingPath);
    }

    @Override // com.caoccao.javet.interop.loader.IJavetLibLoadingListener
    public boolean isDeploy(JSRuntimeType jSRuntimeType) {
        return (JavetOSUtils.IS_ANDROID || JAVET_LIB_LOADING_TYPE_SYSTEM.equals(this.javetLibLoadingType) || JAVET_LIB_LOADING_TYPE_CUSTOM.equals(this.javetLibLoadingType)) ? false : true;
    }

    @Override // com.caoccao.javet.interop.loader.IJavetLibLoadingListener
    public boolean isLibInSystemPath(JSRuntimeType jSRuntimeType) {
        return JavetOSUtils.IS_ANDROID || JAVET_LIB_LOADING_TYPE_SYSTEM.equals(this.javetLibLoadingType);
    }

    @Override // com.caoccao.javet.interop.loader.IJavetLibLoadingListener
    public boolean isSuppressingError(JSRuntimeType jSRuntimeType) {
        return JavetOSUtils.IS_ANDROID || this.javetLibLoadingSuppressError != null;
    }
}
