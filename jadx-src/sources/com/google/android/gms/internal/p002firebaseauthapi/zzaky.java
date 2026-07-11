package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzaky.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class zzaky<MessageType extends zzaky<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzajf<MessageType, BuilderType> {
    private static Map<Class<?>, zzaky<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzann zzb = zzann.zzc();

    public static abstract class zza<MessageType extends zzaky<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaje<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzf();
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamf
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public MessageType zzf() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
        public final /* synthetic */ zzamc zzg() {
            return this.zzb;
        }

        protected final void zzh() {
            if (this.zza.zzu()) {
                return;
            }
            zzi();
        }

        protected void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
        public final boolean zzj() {
            return zzaky.zza((zzaky) this.zza, false);
        }

        protected zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzu()) {
                this.zza = (MessageType) messagetype.zzo();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        /* JADX INFO: renamed from: zzb */
        public final /* synthetic */ zzaje clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamf
        /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzj()) {
                return messagetype;
            }
            throw new zzanl(messagetype);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzamr.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzaky<MessageType, BuilderType> implements zzame {
        protected zzakr<zze> zzc = zzakr.zzb();

        final zzakr<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzakr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class zzd<ContainingType extends zzamc, Type> extends zzakl<ContainingType, Type> {
    }

    static final class zze implements zzakt<zze> {
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzamf zza(zzamf zzamfVar, zzamc zzamcVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzanw zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzaod zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakt
        public final zzaml zza(zzaml zzamlVar, zzaml zzamlVar2) {
            throw new NoSuchMethodError();
        }
    }

    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    static /* synthetic */ boolean zza(zzaky zzakyVar, boolean z2) {
        return zzb(zzakyVar, false);
    }

    private final int zzb(zzamv<?> zzamvVar) {
        return zzamvVar == null ? zzamr.zza().zza(this).zza(this) : zzamvVar.zza(this);
    }

    protected abstract Object zza(int i2, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
    public final boolean zzj() {
        return zzb(this, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zzl() {
        return zza((zzamv) null);
    }

    protected static class zzc<T extends zzaky<T, ?>> extends zzajg<T> {
        public zzc(T t3) {
        }
    }

    private final int zza() {
        return zzamr.zza().zza(this).zzb(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzamr.zza().zza(this).zzb(this, (zzaky) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzame
    public final /* synthetic */ zzamc zzg() {
        return (zzaky) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    final int zzi() {
        return this.zzd & Integer.MAX_VALUE;
    }

    protected final <MessageType2 extends zzaky<MessageType2, BuilderType2>, BuilderType2 extends zza<MessageType2, BuilderType2>> BuilderType2 zzm() {
        return (BuilderType2) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final /* synthetic */ zzamf zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final /* synthetic */ zzamf zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    final void zzt() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    private static <T extends zzaky<T, ?>> T zzb(T t3, zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        zzakb zzakbVarZzc = zzajpVar.zzc();
        T t4 = (T) zza(t3, zzakbVarZzc, zzakkVar);
        zzakbVarZzc.zzb(0);
        return t4;
    }

    protected static <E> zzalc<E> zzp() {
        return zzamq.zzd();
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzamh.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    final int zza(zzamv zzamvVar) {
        if (zzu()) {
            int iZzb = zzb((zzamv<?>) zzamvVar);
            if (iZzb >= 0) {
                return iZzb;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzb);
        }
        if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        }
        int iZzb2 = zzb((zzamv<?>) zzamvVar);
        zzb(iZzb2);
        return iZzb2;
    }

    protected final void zzs() {
        zzamr.zza().zza(this).zzd(this);
        zzt();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajf
    final void zzb(int i2) {
        if (i2 >= 0) {
            this.zzd = (i2 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    private static final <T extends zzaky<T, ?>> boolean zzb(T t3, boolean z2) {
        byte bByteValue = ((Byte) t3.zza(zzf.zza, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZze = zzamr.zza().zza(t3).zze(t3);
        if (z2) {
            t3.zza(zzf.zzb, zZze ? t3 : null, null);
        }
        return zZze;
    }

    private static <T extends zzaky<T, ?>> T zza(T t3) throws zzalf {
        if (t3 == null || zzb(t3, true)) {
            return t3;
        }
        zzalf zzalfVarZza = new zzanl(t3).zza();
        zzalfVarZza.getClass();
        throw zzalfVarZza;
    }

    static <T extends zzaky<?, ?>> T zza(Class<T> cls) {
        T t3 = (T) zzc.get(cls);
        if (t3 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t3 = (T) zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t3 != null) {
            return t3;
        }
        T t4 = (T) ((zzaky) zzanp.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
        if (t4 != null) {
            zzc.put((Class<?>) cls, t4);
            return t4;
        }
        throw new IllegalStateException();
    }

    protected static <T extends zzaky<T, ?>> T zza(T t3, zzajp zzajpVar, zzakk zzakkVar) throws zzalf {
        return (T) zza(zzb(t3, zzajpVar, zzakkVar));
    }

    protected static <T extends zzaky<T, ?>> T zza(T t3, InputStream inputStream, zzakk zzakkVar) throws zzalf {
        zzakb zzakdVar;
        if (inputStream == null) {
            byte[] bArr = zzalb.zzb;
            zzakdVar = zzakb.zza(bArr, 0, bArr.length, false);
        } else {
            zzakdVar = new zzakd(inputStream);
        }
        return (T) zza(zza(t3, zzakdVar, zzakkVar));
    }

    protected static <T extends zzaky<T, ?>> T zza(T t3, byte[] bArr, zzakk zzakkVar) throws zzalf {
        return (T) zza(zza(t3, bArr, 0, bArr.length, zzakkVar));
    }

    private static <T extends zzaky<T, ?>> T zza(T t3, zzakb zzakbVar, zzakk zzakkVar) throws zzalf {
        T t4 = (T) t3.zzo();
        try {
            zzamv zzamvVarZza = zzamr.zza().zza(t4);
            zzamvVarZza.zza(t4, zzakf.zza(zzakbVar), zzakkVar);
            zzamvVarZza.zzd(t4);
            return t4;
        } catch (zzalf e2) {
            if (e2.zzl()) {
                throw new zzalf(e2);
            }
            throw e2;
        } catch (zzanl e3) {
            zzalf zzalfVarZza = e3.zza();
            zzalfVarZza.getClass();
            throw zzalfVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzalf) {
                throw ((zzalf) e4.getCause());
            }
            throw new zzalf(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzalf) {
                throw ((zzalf) e5.getCause());
            }
            throw e5;
        }
    }

    private static <T extends zzaky<T, ?>> T zza(T t3, byte[] bArr, int i2, int i3, zzakk zzakkVar) throws zzalf {
        if (i3 == 0) {
            return t3;
        }
        T t4 = (T) t3.zzo();
        try {
            zzamv zzamvVarZza = zzamr.zza().zza(t4);
            zzamvVarZza.zza(t4, bArr, 0, i3, new zzajk(zzakkVar));
            zzamvVarZza.zzd(t4);
            return t4;
        } catch (zzalf e2) {
            if (e2.zzl()) {
                throw new zzalf(e2);
            }
            throw e2;
        } catch (zzanl e3) {
            zzalf zzalfVarZza = e3.zza();
            zzalfVarZza.getClass();
            throw zzalfVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzalf) {
                throw ((zzalf) e4.getCause());
            }
            throw new zzalf(e4);
        } catch (IndexOutOfBoundsException unused) {
            zzalf zzalfVarZzj = zzalf.zzj();
            zzalfVarZzj.getClass();
            throw zzalfVarZzj;
        }
    }

    protected static <E> zzalc<E> zza(zzalc<E> zzalcVar) {
        return zzalcVar.zza(zzalcVar.size() << 1);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
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

    protected static Object zza(zzamc zzamcVar, String str, Object[] objArr) {
        return new zzamt(zzamcVar, str, objArr);
    }

    protected static <T extends zzaky<?, ?>> void zza(Class<T> cls, T t3) {
        t3.zzt();
        zzc.put(cls, t3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(zzakg zzakgVar) throws IOException {
        zzamr.zza().zza(this).zza(this, zzakj.zza(zzakgVar));
    }
}
