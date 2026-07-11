package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zzme;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzme<MessageType extends zzme<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzkr<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzoi zzc = zzoi.zza();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzme zzmeVar, boolean z2) {
        byte bByteValue = ((Byte) zzmeVar.zzl(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzk = zznt.zza().zzb(zzmeVar.getClass()).zzk(zzmeVar);
        if (z2) {
            zzmeVar.zzl(2, true != zZzk ? null : zzmeVar, null);
        }
        return zZzk;
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final /* synthetic */ zznk zzcC() {
        return (zzma) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzcD() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final /* synthetic */ zznl zzcE() {
        return (zzme) zzl(6, null, null);
    }

    final boolean zzcf() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void zzcg() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final zzme zzch() {
        return (zzme) zzl(4, null, null);
    }

    protected final zzma zzck() {
        return (zzma) zzl(5, null, null);
    }

    public final zzma zzcl() {
        zzma zzmaVar = (zzma) zzl(5, null, null);
        zzmaVar.zzbd(this);
        return zzmaVar;
    }

    final void zzcm(int i2) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    protected abstract Object zzl(int i2, Object obj, Object obj2);

    static zzme zzco(Class cls) {
        Map map = zzd;
        zzme zzmeVar = (zzme) map.get(cls);
        if (zzmeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmeVar = (zzme) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzmeVar != null) {
            return zzmeVar;
        }
        zzme zzmeVar2 = (zzme) ((zzme) zzoo.zzc(cls)).zzl(6, null, null);
        if (zzmeVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzmeVar2);
        return zzmeVar2;
    }

    protected static Object zzcq(zznl zznlVar, String str, Object[] objArr) {
        return new zznv(zznlVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zznt.zza().zzb(getClass()).zzb(this, (zzme) obj);
    }

    private final int zzc(zznw zznwVar) {
        return zznt.zza().zzb(getClass()).zze(this);
    }

    protected static void zzcp(Class cls, zzme zzmeVar) {
        zzmeVar.zzcg();
        zzd.put(cls, zzmeVar);
    }

    static Object zzcr(Method method, Object obj, Object... objArr) {
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

    protected static zzml zzcs() {
        return zzmf.zzd();
    }

    protected static zzmm zzct() {
        return zzmz.zze();
    }

    protected static zzmm zzcu(zzmm zzmmVar) {
        int size = zzmmVar.size();
        return zzmmVar.zzg(size + size);
    }

    protected static zzmn zzcv() {
        return zznu.zzd();
    }

    protected static zzmn zzcw(zzmn zzmnVar) {
        int size = zzmnVar.size();
        return zzmnVar.zzg(size + size);
    }

    public final int hashCode() {
        if (!zzcf()) {
            int i2 = this.zza;
            if (i2 == 0) {
                int iZzci = zzci();
                this.zza = iZzci;
                return iZzci;
            }
            return i2;
        }
        return zzci();
    }

    public final String toString() {
        return zznn.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final void zzcB(zzll zzllVar) throws IOException {
        zznt.zza().zzb(getClass()).zzf(this, zzlm.zza(zzllVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    final int zzcd(zznw zznwVar) {
        if (zzcf()) {
            int iZze = zznwVar.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iZze).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iZze);
            throw new IllegalStateException(sb.toString());
        }
        int i2 = this.zzb & Integer.MAX_VALUE;
        if (i2 == Integer.MAX_VALUE) {
            int iZze2 = zznwVar.zze(this);
            if (iZze2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
                return iZze2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZze2).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZze2);
            throw new IllegalStateException(sb2.toString());
        }
        return i2;
    }

    final int zzci() {
        return zznt.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzcj() {
        zznt.zza().zzb(getClass()).zzj(this);
        zzcg();
    }

    @Override // com.google.android.gms.internal.measurement.zznl
    public final int zzcn() {
        if (zzcf()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iZzc);
            throw new IllegalStateException(sb.toString());
        }
        int i2 = this.zzb & Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iZzc2);
        throw new IllegalStateException(sb2.toString());
    }
}
