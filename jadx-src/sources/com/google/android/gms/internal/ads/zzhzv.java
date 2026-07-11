package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzhzv<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidb {
    @Override // 
    public abstract BuilderType zzbf();

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zziaq zziaqVar, zzibb zzibbVar) throws IOException;

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzicg {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i2, int i3) throws zzicg {
        try {
            zziaq zziaqVarZzG = zziaq.zzG(bArr, i2, i3, false);
            zzbe(zziaqVarZzG);
            zziaqVarZzG.zzb(0);
            return this;
        } catch (zzicg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("byte array"), e3);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zzibbVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i2, int i3, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zziaqVarZzG = zziaq.zzG(bArr, i2, i3, false);
            zzbd(zziaqVarZzG, zzibbVar);
            zziaqVarZzG.zzb(0);
            return this;
        } catch (zzicg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("byte array"), e3);
        }
    }

    protected abstract BuilderType zzaQ(MessageType messagetype);

    protected static zziee zzaR(zzidc zzidcVar) {
        return new zziee(zzidcVar);
    }

    @Deprecated
    protected static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    protected static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzice.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzicn)) {
            if (iterable instanceof zzidl) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzicn) iterable).zza();
        zzicn zzicnVar = (zzicn) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzicnVar.size() - size;
                StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                sb.append("Element at index ");
                sb.append(size2);
                sb.append(" is null.");
                String string = sb.toString();
                int size3 = zzicnVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(string);
                    }
                    zzicnVar.remove(size3);
                }
            } else if (obj instanceof zzian) {
                zzicnVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzian.zzs(bArr2, 0, bArr2.length);
                zzicnVar.zzb();
            } else {
                zzicnVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzidn) {
                ((zzidn) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            A72.aC aCVar = (Object) list2.get(i2);
            if (aCVar == null) {
                zzc(list, size2);
            }
            list.add(aCVar);
        }
    }

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zziaq zziaqVar) throws IOException {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        return (BuilderType) zzbd(zziaqVar, zzibb.zza);
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzbe(zziaqVarZzF);
        zziaqVarZzF.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zzibb zzibbVar) throws IOException {
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzbd(zziaqVarZzF, zzibbVar);
        zziaqVarZzF.zzb(0);
        return this;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i2 = zzibb.zzb;
        int i3 = zziaa.zza;
        return zzaN(inputStream, zzibb.zza);
    }

    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        sb.append("Reading ");
        sb.append(name);
        sb.append(" from a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    private static void zzc(List<?> list, int i2) {
        int size = list.size() - i2;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i2) {
                list.remove(size2);
            } else {
                throw new NullPointerException(string);
            }
        }
    }

    public BuilderType zzaF(zzian zzianVar) throws zzicg {
        try {
            zziaq zziaqVarZzm = zzianVar.zzm();
            zzbe(zziaqVarZzm);
            zziaqVarZzm.zzb(0);
            return this;
        } catch (zzicg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("ByteString"), e3);
        }
    }

    public BuilderType zzaG(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        try {
            zziaq zziaqVarZzm = zzianVar.zzm();
            zzbd(zziaqVarZzm, zzibbVar);
            zziaqVarZzm.zzb(0);
            return this;
        } catch (zzicg e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(zza("ByteString"), e3);
        }
    }

    public boolean zzaN(InputStream inputStream, zzibb zzibbVar) throws IOException {
        int i2 = inputStream.read();
        if (i2 == -1) {
            return false;
        }
        zzaM(new zzhzu(inputStream, zziaq.zzM(i2, inputStream)), zzibbVar);
        return true;
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzidc zzidcVar) {
        if (zzbw().getClass().isInstance(zzidcVar)) {
            return (BuilderType) zzaQ((zzhzw) zzidcVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public /* bridge */ /* synthetic */ zzidb zzaV(InputStream inputStream, zzibb zzibbVar) throws IOException {
        zzaM(inputStream, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        zzaG(zzianVar, zzibbVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzidb zzbc(zzian zzianVar) throws zzicg {
        zzaF(zzianVar);
        return this;
    }
}
