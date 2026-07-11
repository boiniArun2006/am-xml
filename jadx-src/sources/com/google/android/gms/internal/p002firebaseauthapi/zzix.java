package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzix {
    private static final Logger zza = Logger.getLogger(zzix.class.getName());
    private static final AtomicBoolean zzb = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class zza {
        public static final zza zza;
        public static final zza zzb;
        private static final /* synthetic */ zza[] zzc;

        public abstract boolean zza();

        static {
            zzjb zzjbVar = null;
            zziz zzizVar = new zziz("ALGORITHM_NOT_FIPS");
            zza = zzizVar;
            zziy zziyVar = new zziy("ALGORITHM_REQUIRES_BORINGCRYPTO");
            zzb = zziyVar;
            zzc = new zza[]{zzizVar, zziyVar};
        }

        private zza(String str, int i2) {
        }

        public static zza[] values() {
            return (zza[]) zzc.clone();
        }
    }

    private zzix() {
    }

    static Boolean zza() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean zzb() {
        return zzb.get();
    }
}
