package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class zzaep {
    private zzaep() {
    }

    public static Object zza(String str, Type type) throws zzaci {
        if (type == String.class) {
            try {
                zzagl zzaglVar = (zzagl) new zzagl().zza(str);
                if (zzaglVar.zzb()) {
                    return zzaglVar.zza();
                }
                throw new zzaci("No error message: " + str);
            } catch (Exception e2) {
                throw new zzaci("Json conversion failed! " + e2.getMessage(), e2);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzaer) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
            } catch (Exception e3) {
                throw new zzaci("Json conversion failed! " + e3.getMessage(), e3);
            }
        } catch (Exception e4) {
            throw new zzaci("Instantiation of JsonResponse failed! " + String.valueOf(type), e4);
        }
    }
}
