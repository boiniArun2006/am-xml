package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgmx implements zzgmu {
    private final zzgoe zza;
    private final long zzb;

    zzgmx(zzgao zzgaoVar, zzgoe zzgoeVar, long j2) {
        this.zza = zzgoeVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zza(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzgduVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z2 = zzgduVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z2) {
            this.zza.zzb(20203);
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgmu
    public final boolean zzb(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzgduVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }

    private static boolean zzc(zzgdu zzgduVar) {
        int iZza = zzgduVar.zzb().zza().zza();
        int iZzb = zzgduVar.zzb().zza().zzb();
        byte[] versionArray = zzatu.zza();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }
}
