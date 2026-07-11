package com.google.android.gms.internal.common;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzj {
    @Nullable
    public static Object zza(Class cls, String str, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    @Nullable
    private static Object zzc(Class cls, String str, @Nullable Object obj, boolean z2, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < zziVarArr.length; i2++) {
            zzi zziVar = zziVarArr[i2];
            zziVar.getClass();
            clsArr[i2] = zziVar.zzc();
            objArr[i2] = zziVarArr[i2].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    @Nullable
    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }
}
