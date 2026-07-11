package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzidt extends zzian {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzian zzd;
    private final zzian zze;
    private final int zzf;
    private final int zzg;

    /* synthetic */ zzidt(zzian zzianVar, zzian zzianVar2, byte[] bArr) {
        this(zzianVar, zzianVar2);
    }

    final /* synthetic */ zzian zzE() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        throw null;
    }

    final /* synthetic */ zzian zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzp() {
        return this.zzg;
    }

    private zzidt(zzian zzianVar, zzian zzianVar2) {
        this.zzd = zzianVar;
        this.zze = zzianVar2;
        int iZzc = zzianVar.zzc();
        this.zzf = iZzc;
        this.zzc = iZzc + zzianVar2.zzc();
        this.zzg = Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1;
    }

    static int zzn(int i2) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzian, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzidq(this);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i2) {
        zzian.zzB(i2, this.zzc);
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final byte zzb(int i2) {
        int i3 = this.zzf;
        return i2 < i3 ? this.zzd.zzb(i2) : this.zze.zzb(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i2, int i3) {
        int i5 = this.zzc;
        int iZzC = zzian.zzC(i2, i3, i5);
        if (iZzC == 0) {
            return zzian.zza;
        }
        if (iZzC == i5) {
            return this;
        }
        int i7 = this.zzf;
        if (i3 <= i7) {
            return this.zzd.zzd(i2, i3);
        }
        int i8 = i3 - i7;
        if (i2 >= i7) {
            return this.zze.zzd(i2 - i7, i8);
        }
        zzian zzianVar = this.zzd;
        return new zzidt(zzianVar.zzd(i2, zzianVar.zzc()), this.zze.zzd(0, i8));
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final void zze(byte[] bArr, int i2, int i3, int i5) {
        int i7 = i2 + i5;
        int i8 = this.zzf;
        if (i7 <= i8) {
            this.zzd.zze(bArr, i2, i3, i5);
        } else {
            if (i2 >= i8) {
                this.zze.zze(bArr, i2 - i8, i3, i5);
                return;
            }
            int i9 = i8 - i2;
            this.zzd.zze(bArr, i2, i3, i9);
            this.zze.zze(bArr, 0, i3 + i9, i5 - i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    final void zzg(zziae zziaeVar) throws IOException {
        this.zzd.zzg(zziaeVar);
        this.zze.zzg(zziaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final String zzh(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            if (!zzidsVar.next().zzi()) {
                return zzier.zza(zzy());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        byte[] bArr = null;
        zzids zzidsVar = new zzids(this, bArr);
        zziak zziakVarZza = zzidsVar.next();
        zzids zzidsVar2 = new zzids(zzianVar, bArr);
        zziak zziakVarZza2 = zzidsVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (true) {
            int iZzc = zziakVarZza.zzc() - i2;
            int iZzc2 = zziakVarZza2.zzc() - i3;
            int iMin = Math.min(iZzc, iZzc2);
            if (!(i2 == 0 ? zziakVarZza.zzk(zziakVarZza2, i3, iMin) : zziakVarZza2.zzk(zziakVarZza, i2, iMin))) {
                return false;
            }
            i5 += iMin;
            int i7 = this.zzc;
            if (i5 >= i7) {
                if (i5 == i7) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzc) {
                i2 = 0;
                zziakVarZza = zzidsVar.next();
            } else {
                i2 += iMin;
                zziakVarZza = zziakVarZza;
            }
            if (iMin == iZzc2) {
                zziakVarZza2 = zzidsVar2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final int zzl(int i2, int i3, int i5) {
        int i7 = i3 + i5;
        int i8 = this.zzf;
        if (i7 <= i8) {
            return this.zzd.zzl(i2, i3, i5);
        }
        if (i3 >= i8) {
            return this.zze.zzl(i2, i3 - i8, i5);
        }
        int i9 = i8 - i3;
        return this.zze.zzl(this.zzd.zzl(i2, i3, i9), 0, i5 - i9);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        ArrayList arrayList = new ArrayList();
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            arrayList.add(zzidsVar.next().zzf());
        }
        int i2 = zziaq.zze;
        return zziaq.zzF(new zzich(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    /* JADX INFO: renamed from: zzr */
    public final zziai iterator() {
        return new zzidq(this);
    }

    private static zzian zzF(zzian zzianVar, zzian zzianVar2) {
        int iZzc = zzianVar.zzc();
        int iZzc2 = zzianVar2.zzc();
        byte[] bArr = new byte[iZzc + iZzc2];
        zzianVar.zzx(bArr, 0, 0, iZzc);
        zzianVar2.zzx(bArr, 0, iZzc, iZzc2);
        return zzian.zzu(bArr);
    }

    static zzian zzk(zzian zzianVar, zzian zzianVar2) {
        if (zzianVar2.zzc() == 0) {
            return zzianVar;
        }
        if (zzianVar.zzc() == 0) {
            return zzianVar2;
        }
        int iZzc = zzianVar.zzc() + zzianVar2.zzc();
        if (iZzc < 128) {
            return zzF(zzianVar, zzianVar2);
        }
        if (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            zzian zzianVar3 = zzidtVar.zze;
            if (zzianVar3.zzc() + zzianVar2.zzc() < 128) {
                return new zzidt(zzidtVar.zzd, zzF(zzianVar3, zzianVar2));
            }
            zzian zzianVar4 = zzidtVar.zzd;
            if (zzianVar4.zzp() > zzianVar3.zzp() && zzidtVar.zzg > zzianVar2.zzp()) {
                return new zzidt(zzianVar4, new zzidt(zzianVar3, zzianVar2));
            }
        }
        if (iZzc >= zzn(Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1)) {
            return new zzidt(zzianVar, zzianVar2);
        }
        return zzidr.zza(zzianVar, zzianVar2, new ArrayDeque());
    }
}
