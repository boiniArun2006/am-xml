package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzibl;
import com.google.android.gms.internal.ads.zzibr;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzibr<MessageType extends zzibr<MessageType, BuilderType>, BuilderType extends zzibl<MessageType, BuilderType>> extends zzhzw<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzibr<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zzieg zzt = zzieg.zza();

    protected static <T extends zzibr<T, ?>> T zzbU(T t3, byte[] bArr) throws zzicg {
        int length = bArr.length;
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        T t4 = (T) zzh(t3, bArr, 0, length, zzibb.zza);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr<T, ?>> T zzbV(T t3, byte[] bArr, zzibb zzibbVar) throws zzicg {
        T t4 = (T) zzh(t3, bArr, 0, bArr.length, zzibbVar);
        zzi(t4);
        return t4;
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzidc zzidcVar, zzibw zzibwVar, int i2, zzies zziesVar, Class cls) {
        return new zzibp<>(containingtype, type, zzidcVar, new zzibo(zzibwVar, i2, zziesVar, false, false), cls);
    }

    public static <ContainingType extends zzidc, Type> zzibp<ContainingType, Type> zzbz(ContainingType containingtype, zzidc zzidcVar, zzibw zzibwVar, int i2, zzies zziesVar, boolean z2, Class cls) {
        return new zzibp<>(containingtype, zzidn.zzd(), zzidcVar, new zzibo(zzibwVar, i2, zziesVar, true, z2), cls);
    }

    private void zzc() {
        if (this.zzt == zzieg.zza()) {
            this.zzt = zzieg.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    int zzaZ() {
        return this.zzq;
    }

    void zzba(int i2) {
        this.zzq = i2;
    }

    void zzbb() {
        this.zzq = 0;
    }

    boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    public final boolean zzbi() {
        return zzg(this, true);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public int zzbr() {
        return zzaT(null);
    }

    protected abstract Object zzdc(zzibq zzibqVar, Object obj, Object obj2);

    protected static <T extends zzibr<T, ?>> T zzbP(T t3, zziaq zziaqVar) throws zzicg {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        return (T) zzbO(t3, zziaqVar, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbQ(T t3, ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
        zziaq zziaqVarZzG;
        int i2 = zziaq.zze;
        if (byteBuffer.hasArray()) {
            zziaqVarZzG = zziaq.zzG(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zziaqVarZzG = zziaq.zzG(bArr, 0, iRemaining, true);
        }
        T t4 = (T) zzbZ(t3, zziaqVarZzG, zzibbVar);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr<T, ?>> T zzbR(T t3, ByteBuffer byteBuffer) throws zzicg {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        return (T) zzbQ(t3, byteBuffer, zzibb.zza);
    }

    protected static <T extends zzibr<T, ?>> T zzbS(T t3, zzian zzianVar) throws zzicg {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        T t4 = (T) zzbT(t3, zzianVar, zzibb.zza);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr<T, ?>> T zzbW(T t3, InputStream inputStream) throws zzicg {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        T t4 = (T) zzbO(t3, zziaqVarZzF, zzibb.zza);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr<T, ?>> T zzbX(T t3, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t4 = (T) zzbO(t3, zziaq.zzF(inputStream, 4096), zzibbVar);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr<T, ?>> T zzbY(T t3, zziaq zziaqVar) throws zzicg {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        return (T) zzbZ(t3, zziaqVar, zzibb.zza);
    }

    static <T extends zzibr> T zzbt(Class<T> cls) {
        zzibr<?, ?> zzibrVar = zzd.get(cls);
        if (zzibrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzibrVar = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzibrVar != null) {
            return zzibrVar;
        }
        zzibr<?, ?> zzibrVarZzbw = ((zzibr) zziem.zzc(cls)).zzbw();
        if (zzibrVarZzbw == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, zzibrVarZzbw);
        return zzibrVarZzbw;
    }

    protected static Object zzbv(zzidc zzidcVar, String str, Object[] objArr) {
        return new zzido(zzidcVar, str, objArr);
    }

    protected static <T extends zzibr<T, ?>> T zzca(T t3, InputStream inputStream) throws zzicg {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        T t4 = (T) zzk(t3, inputStream, zzibb.zza);
        zzi(t4);
        return t4;
    }

    private int zzd(zzidu<?> zziduVar) {
        if (zziduVar != null) {
            return zziduVar.zze(this);
        }
        return zzidm.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzibn<MessageType, BuilderType>, BuilderType, T> zzibp<MessageType, T> zze(zziaz<MessageType, T> zziazVar) {
        return (zzibp) zziazVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzibr<T, ?>> boolean zzg(T t3, boolean z2) {
        byte bByteValue = ((Byte) t3.zzdc(zzibq.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzidm.zza().zzb(t3.getClass()).zzl(t3);
        if (z2) {
            t3.zzdc(zzibq.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t3, null);
        }
        return zZzl;
    }

    private static <T extends zzibr<T, ?>> T zzh(T t3, byte[] bArr, int i2, int i3, zzibb zzibbVar) throws zzicg {
        if (i3 == 0) {
            return t3;
        }
        T t4 = (T) t3.zzbg();
        try {
            zzidu zziduVarZzb = zzidm.zza().zzb(t4.getClass());
            zziduVarZzb.zzj(t4, bArr, i2, i2 + i3, new zziab(zzibbVar));
            zziduVarZzb.zzk(t4);
            return t4;
        } catch (zzicg e2) {
            if (e2.zzb()) {
                throw new zzicg(e2);
            }
            throw e2;
        } catch (zziee e3) {
            throw e3.zza();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzicg) {
                throw ((zzicg) e4.getCause());
            }
            throw new zzicg(e4);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzibr<T, ?>> T zzi(T t3) throws zzicg {
        if (t3 == null || t3.zzbi()) {
            return t3;
        }
        throw t3.zzaU().zza();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzidm.zza().zzb(getClass()).zzb(this, (zzibr) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    void zzaR(int i2) {
        if (i2 >= 0) {
            this.zzc = i2 | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public final zzidk<MessageType> zzbd() {
        return (zzidk) zzdc(zzibq.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidd
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdc(zzibq.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    MessageType zzbg() {
        return (MessageType) zzdc(zzibq.NEW_MUTABLE_INSTANCE, null, null);
    }

    protected boolean zzbj(int i2, zziaq zziaqVar) throws IOException {
        if ((i2 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i2, zziaqVar);
    }

    protected final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdc(zzibq.NEW_BUILDER, null, null);
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdc(zzibq.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    Object zzbs() throws Exception {
        return zzdc(zzibq.BUILD_MESSAGE_INFO, null, null);
    }

    protected final void zzbx(zzieg zziegVar) {
        this.zzt = zzieg.zzc(this.zzt, zziegVar);
    }

    static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 43 + String.valueOf(str).length() + 2);
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    static Object zzbB(Method method, Object obj, Object... objArr) {
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

    protected static zzibz zzbC() {
        return zzibs.zzd();
    }

    protected static zzibz zzbD(zzibz zzibzVar) {
        int size = zzibzVar.size();
        return zzibzVar.zzh(size + size);
    }

    protected static zzicc zzbE() {
        return zzicq.zzg();
    }

    protected static zzicc zzbF(zzicc zziccVar) {
        int size = zziccVar.size();
        return zziccVar.zzh(size + size);
    }

    protected static zziby zzbG() {
        return zzibi.zzd();
    }

    protected static zziby zzbH(zziby zzibyVar) {
        int size = zzibyVar.size();
        return zzibyVar.zzh(size + size);
    }

    protected static zzibu zzbI() {
        return zziay.zzd();
    }

    protected static zzibu zzbJ(zzibu zzibuVar) {
        int size = zzibuVar.size();
        return zzibuVar.zzh(size + size);
    }

    protected static zzibt zzbK() {
        return zziad.zzd();
    }

    protected static zzibt zzbL(zzibt zzibtVar) {
        int size = zzibtVar.size();
        return zzibtVar.zzh(size + size);
    }

    protected static <E> zzicd<E> zzbM() {
        return zzidn.zzd();
    }

    protected static <E> zzicd<E> zzbN(zzicd<E> zzicdVar) {
        int size = zzicdVar.size();
        return zzicdVar.zzh(size + size);
    }

    static <T extends zzibr<T, ?>> T zzbO(T t3, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t4 = (T) t3.zzbg();
        try {
            zzidu zziduVarZzb = zzidm.zza().zzb(t4.getClass());
            zziduVarZzb.zzg(t4, zziar.zza(zziaqVar), zzibbVar);
            zziduVarZzb.zzk(t4);
            return t4;
        } catch (zzicg e2) {
            if (e2.zzb()) {
                throw new zzicg(e2);
            }
            throw e2;
        } catch (zziee e3) {
            throw e3.zza();
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzicg) {
                throw ((zzicg) e4.getCause());
            }
            throw new zzicg(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzicg) {
                throw ((zzicg) e5.getCause());
            }
            throw e5;
        }
    }

    protected static <T extends zzibr<T, ?>> T zzbT(T t3, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        T t4 = (T) zzj(t3, zzianVar, zzibbVar);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr<T, ?>> T zzbZ(T t3, zziaq zziaqVar, zzibb zzibbVar) throws zzicg {
        T t4 = (T) zzbO(t3, zziaqVar, zzibbVar);
        zzi(t4);
        return t4;
    }

    protected static <T extends zzibr> void zzbu(Class<T> cls, T t3) {
        t3.zzaY();
        zzd.put(cls, t3);
    }

    protected static <T extends zzibr<T, ?>> T zzcb(T t3, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        T t4 = (T) zzk(t3, inputStream, zzibbVar);
        zzi(t4);
        return t4;
    }

    private static <T extends zzibr<T, ?>> T zzj(T t3, zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zziaq zziaqVarZzm = zzianVar.zzm();
        T t4 = (T) zzbO(t3, zziaqVarZzm, zzibbVar);
        zziaqVarZzm.zzb(0);
        return t4;
    }

    private static <T extends zzibr<T, ?>> T zzk(T t3, InputStream inputStream, zzibb zzibbVar) throws zzicg {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            zziaq zziaqVarZzF = zziaq.zzF(new zzhzu(inputStream, zziaq.zzM(i2, inputStream)), 4096);
            T t4 = (T) zzbO(t3, zziaqVarZzF, zzibbVar);
            zziaqVarZzF.zzb(0);
            return t4;
        } catch (zzicg e2) {
            if (e2.zzb()) {
                throw new zzicg(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new zzicg(e3);
        }
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzide.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    int zzaT(zzidu zziduVar) {
        if (zzaX()) {
            int iZzd = zzd(zziduVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iZzd).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iZzd);
            throw new IllegalStateException(sb.toString());
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zziduVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    int zzbh() {
        return zzidm.zza().zzb(getClass()).zzc(this);
    }

    protected void zzbk(int i2, int i3) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i2 != 0) {
            zziegVar.zzk(i2 << 3, Long.valueOf(i3));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected void zzbl(int i2, zzian zzianVar) {
        zzc();
        zzieg zziegVar = this.zzt;
        zziegVar.zze();
        if (i2 != 0) {
            zziegVar.zzk((i2 << 3) | 2, zzianVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected void zzbm() {
        zzidm.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    protected final <MessageType2 extends zzibr<MessageType2, BuilderType2>, BuilderType2 extends zzibl<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzcX(zziaw zziawVar) throws IOException {
        zzidm.zza().zzb(getClass()).zzf(this, zziax.zza(zziawVar));
    }
}
