package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaua implements zzaty {
    private int zza = (((((~1539942439) & 2070175971) | 1100945533) + ((1539942439 & (-1166483302)) | (-2145608135))) - 96382817) ^ (1143565421 % 981914693);
    private final byte[] zzb = new byte[(((((~991039875) & 475472926) | 1225689584) + ((991039875 & 357672014) | 1805818736)) - (-1256743880)) ^ (1671581032 % 1337434154)];
    private final zzauc zzc;

    public zzaua(zzauc zzaucVar) {
        this.zzc = zzaucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final byte zza(zzauk zzaukVar, int i2) {
        int i3 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i5 = 1761855727 % 1384724137;
        int i7 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i8 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i9 = 1694830070 % 1383960411;
        int i10 = i2 >>> i7;
        if (i10 != this.zza) {
            this.zzc.zza(i10, this.zzb);
            this.zza = i10;
        }
        int i11 = i8 ^ i9;
        return (byte) (((zzaukVar.zzb(i2) ^ this.zzb[i2 % (i3 ^ i5)]) << i11) >> i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final zzauk zzb(zzauk zzaukVar, int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > zzaukVar.zza.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i3 - i2];
        int i5 = 0;
        while (i2 < i3) {
            bArr[i5] = zza(zzaukVar, i2);
            i2++;
            i5++;
        }
        return zzauk.zze(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final /* bridge */ /* synthetic */ zzaty zzc() {
        return new zzaua(this.zzc);
    }
}
