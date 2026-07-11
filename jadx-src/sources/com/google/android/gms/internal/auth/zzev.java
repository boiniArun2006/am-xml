package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzev<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdq<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzha zzc = zzha.zza();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static zzev zzd(zzev zzevVar, byte[] bArr) throws zzfb {
        byte bByteValue;
        zzev zzevVarZzo = zzo(zzevVar, bArr, 0, bArr.length, zzel.zza);
        if (zzevVarZzo != null && (bByteValue = ((Byte) zzevVarZzo.zzn(1, null, null)).byteValue()) != 1) {
            if (bByteValue != 0) {
                boolean zZzi = zzgf.zza().zzb(zzevVarZzo.getClass()).zzi(zzevVarZzo);
                zzevVarZzo.zzn(2, true != zZzi ? null : zzevVarZzo, null);
            }
            zzfb zzfbVarZza = new zzgy(zzevVarZzo).zza();
            zzfbVarZza.zze(zzevVarZzo);
            throw zzfbVarZza;
        }
        return zzevVarZzo;
    }

    final zzev zzc() {
        return (zzev) zzn(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzfy
    public final /* synthetic */ zzfx zze() {
        return (zzev) zzn(6, null, null);
    }

    final void zzj() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void zzl(int i2) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean zzm() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object zzn(int i2, Object obj, Object obj2);

    static zzev zzb(Class cls) {
        Map map = zzb;
        zzev zzevVar = (zzev) map.get(cls);
        if (zzevVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzevVar = (zzev) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzevVar != null) {
            return zzevVar;
        }
        zzev zzevVar2 = (zzev) ((zzev) zzhj.zze(cls)).zzn(6, null, null);
        if (zzevVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzevVar2);
        return zzevVar2;
    }

    protected static Object zzh(zzfx zzfxVar, String str, Object[] objArr) {
        return new zzgh(zzfxVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgf.zza().zzb(getClass()).zzh(this, (zzev) obj);
    }

    protected static zzez zzf() {
        return zzgg.zze();
    }

    static Object zzg(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static void zzk(Class cls, zzev zzevVar) {
        zzevVar.zzj();
        zzb.put(cls, zzevVar);
    }

    private static zzev zzo(zzev zzevVar, byte[] bArr, int i2, int i3, zzel zzelVar) throws zzfb {
        zzev zzevVarZzc = zzevVar.zzc();
        try {
            zzgi zzgiVarZzb = zzgf.zza().zzb(zzevVarZzc.getClass());
            zzgiVarZzb.zzg(zzevVarZzc, bArr, 0, i3, new zzdt(zzelVar));
            zzgiVarZzb.zze(zzevVarZzc);
            return zzevVarZzc;
        } catch (zzfb e2) {
            e2.zze(zzevVarZzc);
            throw e2;
        } catch (zzgy e3) {
            zzfb zzfbVarZza = e3.zza();
            zzfbVarZza.zze(zzevVarZzc);
            throw zzfbVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzfb) {
                throw ((zzfb) e4.getCause());
            }
            zzfb zzfbVar = new zzfb(e4);
            zzfbVar.zze(zzevVarZzc);
            throw zzfbVar;
        } catch (IndexOutOfBoundsException unused) {
            zzfb zzfbVarZzf = zzfb.zzf();
            zzfbVarZzf.zze(zzevVarZzc);
            throw zzfbVarZzf;
        }
    }

    public final int hashCode() {
        if (!zzm()) {
            int i2 = this.zza;
            if (i2 == 0) {
                int iZza = zza();
                this.zza = iZza;
                return iZza;
            }
            return i2;
        }
        return zza();
    }

    public final String toString() {
        return zzfz.zza(this, super.toString());
    }

    final int zza() {
        return zzgf.zza().zzb(getClass()).zza(this);
    }

    protected final void zzi() {
        zzgf.zza().zzb(getClass()).zze(this);
        zzj();
    }
}
