package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzggk extends zzghb {
    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzawgVar) {
            zzawgVar.zza("E");
            zzawgVar.zzB(0L);
            zzawgVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zza((String) objArr[0]);
            zzawgVar.zzB(((Long) objArr[1]).longValue());
            zzawgVar.zzV((String) objArr[2]);
        }
    }

    zzggk(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", zzawgVar, zzgfxVar, zzgoeVar.zza(114));
    }
}
