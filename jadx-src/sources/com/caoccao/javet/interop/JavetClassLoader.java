package com.caoccao.javet.interop;

import com.caoccao.javet.enums.JSRuntimeType;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.loader.IJavetLibLoadingListener;
import com.caoccao.javet.interop.loader.JavetLibLoader;
import com.caoccao.javet.utils.JavetOSUtils;
import com.caoccao.javet.utils.JavetReflectionUtils;
import com.caoccao.javet.utils.SimpleMap;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class JavetClassLoader extends ClassLoader {
    private static final String METHOD_LOAD = "load";
    private static final String METHOD_SET_LIB_LOADING_LISTENER = "setLibLoadingListener";
    private final JSRuntimeType jsRuntimeType;
    private static final String JAVET_LIB_LOADER_CLASS_NAME = JavetLibLoader.class.getName();
    private static final String NODE_NATIVE_CLASS_NAME = NodeNative.class.getName();
    private static final String V8_NATIVE_CLASS_NAME = V8Native.class.getName();

    IV8Native getNative() throws JavetException {
        if (JavetOSUtils.IS_ANDROID) {
            return this.jsRuntimeType.isNode() ? new NodeNative() : new V8Native();
        }
        try {
            Constructor<?> declaredConstructor = loadClass(this.jsRuntimeType.isNode() ? NODE_NATIVE_CLASS_NAME : V8_NATIVE_CLASS_NAME).getDeclaredConstructor(new Class[0]);
            JavetReflectionUtils.safeSetAccessible(declaredConstructor);
            return (IV8Native) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace(System.err);
            throw new JavetException(JavetError.LibraryNotLoaded, SimpleMap.of(JavetError.PARAMETER_REASON, e2.getMessage()), e2);
        }
    }

    void load() throws JavetException {
        if (JavetOSUtils.IS_ANDROID) {
            new JavetLibLoader(this.jsRuntimeType).load();
            return;
        }
        try {
            Class<?> clsLoadClass = loadClass(JAVET_LIB_LOADER_CLASS_NAME);
            Object objNewInstance = clsLoadClass.getConstructor(JSRuntimeType.class).newInstance(this.jsRuntimeType);
            clsLoadClass.getMethod(METHOD_SET_LIB_LOADING_LISTENER, IJavetLibLoadingListener.class).invoke(null, JavetLibLoader.getLibLoadingListener());
            clsLoadClass.getMethod(METHOD_LOAD, new Class[0]).invoke(objNewInstance, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace(System.err);
            throw new JavetException(JavetError.LibraryNotLoaded, SimpleMap.of(JavetError.PARAMETER_REASON, e2.getMessage()), e2);
        }
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        if (!JAVET_LIB_LOADER_CLASS_NAME.equals(str) && !NODE_NATIVE_CLASS_NAME.equals(str) && !V8_NATIVE_CLASS_NAME.equals(str)) {
            return super.loadClass(str);
        }
        try {
            InputStream resourceAsStream = JavetClassLoader.class.getResourceAsStream("/" + str.replace(".", "/") + ".class");
            try {
                int iAvailable = resourceAsStream.available();
                byte[] bArr = new byte[iAvailable];
                DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
                try {
                    dataInputStream.readFully(bArr);
                    Class<?> clsDefineClass = defineClass(str, bArr, 0, iAvailable);
                    resolveClass(clsDefineClass);
                    dataInputStream.close();
                    resourceAsStream.close();
                    return clsDefineClass;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            th.printStackTrace(System.err);
            throw new ClassNotFoundException(str, th);
        }
    }

    JavetClassLoader(ClassLoader classLoader, JSRuntimeType jSRuntimeType) {
        super(classLoader);
        Objects.requireNonNull(jSRuntimeType);
        this.jsRuntimeType = jSRuntimeType;
    }
}
