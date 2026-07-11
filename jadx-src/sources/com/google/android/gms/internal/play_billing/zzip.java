package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzip<T> implements zzix<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzjq.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzim zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzjj zzl;
    private final zzgx zzm;

    private zzip(int[] iArr, Object[] objArr, int i2, int i3, zzim zzimVar, boolean z2, int[] iArr2, int i5, int i7, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        boolean z3 = false;
        if (zzgxVar != null && (zzimVar instanceof zzhh)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzi = iArr2;
        this.zzj = i5;
        this.zzk = i7;
        this.zzl = zzjjVar;
        this.zzm = zzgxVar;
        this.zzg = zzimVar;
    }

    private static int zzr(int i2) {
        return (i2 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int i2;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i3;
        int i5 = 0;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzs = zzs(i7);
            int[] iArr = this.zzc;
            int i8 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i9 = iArr[i7];
            long j2 = i8;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i2 = i5 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzjq.zza(obj, j2));
                    byte[] bArr = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 1:
                    i2 = i5 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzjq.zzb(obj, j2));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i2 = i5 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr2 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 3:
                    i2 = i5 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr3 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 4:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j2);
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i2 = i5 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr4 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 6:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j2);
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhp.zza(zzjq.zzw(obj, j2));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iFloatToIntBits = ((String) zzjq.zzf(obj, j2)).hashCode();
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    i3 = i5 * 53;
                    Object objZzf = zzjq.zzf(obj, j2);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i5 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j2).hashCode();
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j2);
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j2);
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j2);
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i2 = i5 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr5 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 15:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzc(obj, j2);
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i2 = i5 * 53;
                    jDoubleToLongBits = zzjq.zzd(obj, j2);
                    byte[] bArr6 = zzhp.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 17:
                    i3 = i5 * 53;
                    Object objZzf2 = zzjq.zzf(obj, j2);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i5 = i3 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j2).hashCode();
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzjq.zzf(obj, j2).hashCode();
                    i5 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j2));
                        byte[] bArr7 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j2));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        jDoubleToLongBits = zzt(obj, j2);
                        byte[] bArr8 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        jDoubleToLongBits = zzt(obj, j2);
                        byte[] bArr9 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzo(obj, j2);
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        jDoubleToLongBits = zzt(obj, j2);
                        byte[] bArr10 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzo(obj, j2);
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhp.zza(zzN(obj, j2));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((String) zzjq.zzf(obj, j2)).hashCode();
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j2).hashCode();
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j2).hashCode();
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzo(obj, j2);
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzo(obj, j2);
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzo(obj, j2);
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        jDoubleToLongBits = zzt(obj, j2);
                        byte[] bArr11 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzo(obj, j2);
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        jDoubleToLongBits = zzt(obj, j2);
                        byte[] bArr12 = zzhp.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i9, i7)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzjq.zzf(obj, j2).hashCode();
                        i5 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i5 * 53) + ((zzhk) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzhh) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x03eb, code lost:
    
        r10 = r8;
        r8 = r1;
        r1 = r10;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03ef, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x046f, code lost:
    
        r4 = r41;
        r3 = r8;
        r6 = r10;
        r8 = r11;
        r9 = r14;
        r14 = r15;
        r15 = r21;
        r13 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04a5, code lost:
    
        r36 = r2;
        r2 = r1;
        r1 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04d3, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x052e, code lost:
    
        r22 = r2;
        r3 = r5;
        r2 = r10;
        r10 = r11;
        r9 = r14;
        r23 = r15;
        r8 = r18;
        r13 = r24;
        r12 = r25;
        r14 = r42;
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0ce6, code lost:
    
        r2 = r10;
        r3 = r13;
        r9 = r14;
        r10 = r18;
        r13 = r30;
        r12 = r31;
        r14 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0fe2, code lost:
    
        if (r13 == r3) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0fe4, code lost:
    
        r22.putInt(r11, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0fea, code lost:
    
        r1 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0fee, code lost:
    
        if (r1 >= r0.zzk) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0ff0, code lost:
    
        r2 = r0.zzi;
        r3 = r0.zzc;
        r2 = r2[r1];
        r3 = r3[r2];
        r3 = com.google.android.gms.internal.play_billing.zzjq.zzf(r11, r0.zzs(r2) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x1006, code lost:
    
        if (r3 != null) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x100f, code lost:
    
        if (r0.zzu(r2) != null) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x1012, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x1015, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzig) r3;
        r1 = (com.google.android.gms.internal.play_billing.zzif) r0.zzw(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x101d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x1020, code lost:
    
        if (r14 != 0) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1022, code lost:
    
        if (r7 != r4) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x102a, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x102b, code lost:
    
        if (r7 > r4) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x102d, code lost:
    
        if (r8 != r14) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x102f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x1035, code lost:
    
        throw new com.google.android.gms.internal.play_billing.zzhr("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ee, code lost:
    
        r18 = r5;
        r5 = r6;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f2, code lost:
    
        r15 = 0;
        r29 = 1048575;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0c6e A[PHI: r0 r2 r7 r8 r10 r11 r13 r18 r22 r30
      0x0c6e: PHI (r0v36 com.google.android.gms.internal.play_billing.zzip<T>) = 
      (r0v3 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v3 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v3 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v3 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v11 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v34 com.google.android.gms.internal.play_billing.zzip<T>)
      (r0v3 com.google.android.gms.internal.play_billing.zzip<T>)
     binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r2v116 byte[]) = (r2v74 byte[]), (r2v78 byte[]), (r2v83 byte[]), (r2v86 byte[]), (r2v104 byte[]), (r2v109 byte[]), (r2v117 byte[]) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r7v99 int) = (r7v59 int), (r7v60 int), (r7v62 int), (r7v64 int), (r7v86 int), (r7v93 int), (r7v100 int) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r8v98 int) = (r8v67 int), (r8v68 int), (r8v70 int), (r8v72 int), (r8v90 int), (r8v94 int), (r8v99 int) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r10v73 com.google.android.gms.internal.play_billing.zzfz) = 
      (r10v39 com.google.android.gms.internal.play_billing.zzfz)
      (r10v40 com.google.android.gms.internal.play_billing.zzfz)
      (r10v42 com.google.android.gms.internal.play_billing.zzfz)
      (r10v44 com.google.android.gms.internal.play_billing.zzfz)
      (r10v56 com.google.android.gms.internal.play_billing.zzfz)
      (r10v67 com.google.android.gms.internal.play_billing.zzfz)
      (r10v74 com.google.android.gms.internal.play_billing.zzfz)
     binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r11v64 int) = (r11v37 int), (r11v38 int), (r11v40 int), (r11v42 int), (r11v57 int), (r11v61 int), (r11v65 int) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r13v66 int) = (r13v35 int), (r13v36 int), (r13v38 int), (r13v41 int), (r13v56 int), (r13v63 int), (r13v67 int) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r18v66 int) = (r18v27 int), (r18v28 int), (r18v30 int), (r18v32 int), (r18v50 int), (r18v62 int), (r18v67 int) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r22v49 sun.misc.Unsafe) = 
      (r22v21 sun.misc.Unsafe)
      (r22v22 sun.misc.Unsafe)
      (r22v24 sun.misc.Unsafe)
      (r22v26 sun.misc.Unsafe)
      (r22v37 sun.misc.Unsafe)
      (r22v41 sun.misc.Unsafe)
      (r22v50 sun.misc.Unsafe)
     binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0c6e: PHI (r30v33 int) = (r30v6 int), (r30v7 int), (r30v9 int), (r30v11 int), (r30v22 int), (r30v29 int), (r30v34 int) binds: [B:482:0x0c42, B:462:0x0bc5, B:442:0x0b51, B:427:0x0aea, B:299:0x085b, B:224:0x06b8, B:203:0x0640] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0f59  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0fb5  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0c8d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0f73 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i2, int i3, int i5, zzfz zzfzVar) throws IOException {
        int i7;
        Unsafe unsafe;
        Object obj2;
        int i8;
        int i9;
        int iZzq;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzfz zzfzVar2;
        int iZzg;
        int i15;
        int i16;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr2;
        zzfz zzfzVar3;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj4;
        zzfz zzfzVar4;
        Unsafe unsafe3;
        byte[] bArr3;
        int iZzh;
        int i21;
        int i22;
        int i23;
        byte[] bArr4;
        int i24;
        int i25;
        zzfz zzfzVar5;
        zzfz zzfzVar6;
        int iZzh2;
        int i26;
        int i27;
        zzfz zzfzVar7;
        int i28;
        byte[] bArr5;
        int i29;
        int i30;
        int i31;
        int i32;
        byte[] bArr6;
        int i33;
        zzfz zzfzVar8;
        int i34;
        int i35;
        int iZzk;
        int iZzh3;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int iZzh4;
        int i42;
        zzfz zzfzVar9;
        int i43;
        int i44;
        int i45;
        zzfz zzfzVar10;
        int i46;
        int i47;
        zzho zzhoVar;
        int i48;
        int iZzf;
        int i49;
        int i50;
        zzfz zzfzVar11;
        int i51;
        int iZzh5;
        byte[] bArr7;
        int i52;
        int i53;
        int iZzh6;
        int iZzk2;
        int iZzh7;
        int i54;
        zzfz zzfzVar12;
        char c2;
        int i55;
        int iZzh8;
        int i56;
        zzip<T> zzipVar = this;
        Object obj5 = obj;
        byte[] bArr8 = bArr;
        int i57 = i3;
        zzfz zzfzVar13 = zzfzVar;
        zzA(obj5);
        Unsafe unsafe4 = zzb;
        int i58 = 0;
        int i59 = -1;
        int iZzk3 = i2;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = -1;
        int i64 = 1048575;
        while (true) {
            int i65 = 1;
            while (true) {
                int i66 = 2;
                while (iZzk3 < i57) {
                    int iZzi = iZzk3 + 1;
                    int i67 = bArr8[iZzk3];
                    if (i67 < 0) {
                        iZzi = zzga.zzi(i67, bArr8, iZzi, zzfzVar13);
                        i67 = zzfzVar13.zza;
                    }
                    i62 = i67;
                    int i68 = (i62 == true ? 1 : 0) >>> 3;
                    if (i68 > i63) {
                        iZzq = (i68 < zzipVar.zze || i68 > zzipVar.zzf) ? i59 : zzipVar.zzq(i68, i60 / 3);
                        if (iZzq == i59) {
                            int i69 = (i62 == true ? 1 : 0) & 7;
                            i13 = i59;
                            int[] iArr = zzipVar.zzc;
                            int i70 = iArr[iZzq + 1];
                            int iZzr = zzr(i70);
                            long j2 = i70 & 1048575;
                            if (iZzr <= 17) {
                                int i71 = iArr[iZzq + 2];
                                int i72 = i65 << (i71 >>> 20);
                                int i73 = i71 & 1048575;
                                int i74 = iZzi;
                                if (i73 != i64) {
                                    if (i64 != 1048575) {
                                        unsafe4.putInt(obj5, i64, i61);
                                    }
                                    i61 = i73 == 1048575 ? 0 : unsafe4.getInt(obj5, i73);
                                    i64 = i73;
                                }
                                switch (iZzr) {
                                    case 0:
                                        Object obj6 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj6;
                                        i14 = 1048575;
                                        i16 = i68;
                                        zzfzVar3 = zzfzVar;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        bArr2 = bArr;
                                        i17 = i61;
                                        i18 = i64;
                                        if (i69 == i65) {
                                            iZzk3 = i19 + 8;
                                            i61 = i17 | i72;
                                            zzjq.zzo(obj3, j2, Double.longBitsToDouble(zzga.zzn(bArr2, i19)));
                                        }
                                        break;
                                    case 1:
                                        Object obj7 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj7;
                                        i14 = 1048575;
                                        i16 = i68;
                                        zzfzVar3 = zzfzVar;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        bArr2 = bArr;
                                        i17 = i61;
                                        i18 = i64;
                                        if (i69 == 5) {
                                            iZzk3 = i19 + 4;
                                            i61 = i17 | i72;
                                            zzjq.zzp(obj3, j2, Float.intBitsToFloat(zzga.zzb(bArr2, i19)));
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                        i14 = 1048575;
                                        i16 = i68;
                                        zzfzVar3 = zzfzVar;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        bArr2 = bArr;
                                        i17 = i61;
                                        i18 = i64;
                                        if (i69 == 0) {
                                            i61 = i17 | i72;
                                            iZzk3 = zzga.zzk(bArr2, i19, zzfzVar3);
                                            unsafe4.putLong(obj5, j2, zzfzVar3.zzb);
                                            Object obj8 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj8;
                                        }
                                        break;
                                    case 4:
                                    case 11:
                                        i14 = 1048575;
                                        i16 = i68;
                                        zzfzVar3 = zzfzVar;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        bArr2 = bArr;
                                        i17 = i61;
                                        i18 = i64;
                                        if (i69 == 0) {
                                            i61 = i17 | i72;
                                            iZzk3 = zzga.zzh(bArr2, i19, zzfzVar3);
                                            unsafe4.putInt(obj5, j2, zzfzVar3.zza);
                                        }
                                        break;
                                    case 5:
                                    case 14:
                                        i14 = 1048575;
                                        i16 = i68;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        Object obj9 = obj5;
                                        i17 = i61;
                                        i18 = i64;
                                        unsafe3 = unsafe4;
                                        if (i69 != i65) {
                                            zzfzVar3 = zzfzVar;
                                            bArr2 = bArr;
                                            obj3 = obj9;
                                        } else {
                                            iZzk3 = i19 + 8;
                                            i61 = i17 | i72;
                                            zzfzVar3 = zzfzVar;
                                            obj5 = obj9;
                                            bArr2 = bArr;
                                            unsafe4 = unsafe3;
                                            unsafe4.putLong(obj5, j2, zzga.zzn(bArr, i19));
                                        }
                                        break;
                                    case 6:
                                    case 13:
                                        i14 = 1048575;
                                        i16 = i68;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        obj4 = obj5;
                                        i17 = i61;
                                        i18 = i64;
                                        zzfzVar4 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        bArr3 = bArr;
                                        if (i69 == 5) {
                                            iZzk3 = i19 + 4;
                                            i61 = i17 | i72;
                                            unsafe3.putInt(obj4, j2, zzga.zzb(bArr3, i19));
                                            i57 = i3;
                                            bArr8 = bArr3;
                                            zzfzVar13 = zzfzVar4;
                                            obj5 = obj4;
                                            i63 = i16;
                                            unsafe4 = unsafe3;
                                            i60 = i15;
                                            i58 = i20;
                                            i59 = i13;
                                            i64 = i18;
                                        }
                                        break;
                                    case 7:
                                        i14 = 1048575;
                                        i16 = i68;
                                        i15 = iZzq;
                                        i19 = i74;
                                        i20 = 0;
                                        obj4 = obj5;
                                        i17 = i61;
                                        i18 = i64;
                                        zzfzVar4 = zzfzVar;
                                        unsafe3 = unsafe4;
                                        bArr3 = bArr;
                                        if (i69 == 0) {
                                            i61 = i17 | i72;
                                            iZzk3 = zzga.zzk(bArr3, i19, zzfzVar4);
                                            zzjq.zzm(obj4, j2, zzfzVar4.zzb != 0 ? i65 : 0);
                                            i57 = i3;
                                            bArr8 = bArr3;
                                            zzfzVar13 = zzfzVar4;
                                            obj5 = obj4;
                                            i63 = i16;
                                            unsafe4 = unsafe3;
                                            i60 = i15;
                                            i58 = i20;
                                            i59 = i13;
                                            i64 = i18;
                                        }
                                        break;
                                    case 8:
                                        i14 = 1048575;
                                        i16 = i68;
                                        i15 = iZzq;
                                        i19 = i74;
                                        obj4 = obj5;
                                        zzfzVar4 = zzfzVar;
                                        i17 = i61;
                                        i18 = i64;
                                        unsafe3 = unsafe4;
                                        bArr3 = bArr;
                                        if (i69 != i66) {
                                            i20 = 0;
                                        } else {
                                            if ((i70 & 536870912) != 0) {
                                                int i75 = i17 | i72;
                                                iZzh = zzga.zzh(bArr3, i19, zzfzVar4);
                                                int i76 = zzfzVar4.zza;
                                                if (i76 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i76 == 0) {
                                                    zzfzVar4.zzc = "";
                                                    i22 = i75;
                                                    i20 = 0;
                                                } else {
                                                    int i77 = zzjt.zza;
                                                    int length = bArr3.length;
                                                    if ((iZzh | i76 | ((length - iZzh) - i76)) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzh), Integer.valueOf(i76)));
                                                    }
                                                    int i78 = iZzh + i76;
                                                    char[] cArr = new char[i76];
                                                    int i79 = 0;
                                                    while (true) {
                                                        i21 = iZzh;
                                                        if (iZzh < i78) {
                                                            byte b2 = bArr3[i21];
                                                            if (zzjr.zzd(b2)) {
                                                                cArr[i79] = (char) b2;
                                                                iZzh = i21 + 1;
                                                                i79++;
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        int i80 = i21;
                                                        while (i80 < i78) {
                                                            int i81 = i80;
                                                            i80 = i81 + 1;
                                                            int i82 = i75;
                                                            byte b4 = bArr3[i81];
                                                            if (zzjr.zzd(b4)) {
                                                                int i83 = i79 + 1;
                                                                cArr[i79] = (char) b4;
                                                                while (true) {
                                                                    i79 = i83;
                                                                    if (i80 < i78) {
                                                                        byte b5 = bArr3[i80];
                                                                        if (zzjr.zzd(b5)) {
                                                                            i80++;
                                                                            i83 = i79 + 1;
                                                                            cArr[i79] = (char) b5;
                                                                        }
                                                                    }
                                                                }
                                                                i75 = i82;
                                                            } else if (b4 >= -32) {
                                                                if (b4 >= -16) {
                                                                    i23 = i78;
                                                                    if (i80 >= i23 - 2) {
                                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    char[] cArr2 = cArr;
                                                                    int i84 = i79;
                                                                    zzjr.zza(b4, bArr3[i80], bArr3[i81 + 2], bArr3[i81 + 3], cArr2, i84);
                                                                    i79 = i84 + 2;
                                                                    i75 = i82;
                                                                    cArr = cArr2;
                                                                    i80 = i81 + 4;
                                                                } else {
                                                                    if (i80 >= i78 - 1) {
                                                                        throw new zzhr("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    i23 = i78;
                                                                    zzjr.zzb(b4, bArr3[i80], bArr3[i81 + 2], cArr, i79);
                                                                    i75 = i82;
                                                                    i79++;
                                                                    i80 = i81 + 3;
                                                                }
                                                                i78 = i23;
                                                            } else {
                                                                if (i80 >= i78) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                i21 = i81 + 2;
                                                                zzjr.zzc(b4, bArr3[i80], cArr, i79);
                                                                i75 = i82;
                                                                i79++;
                                                            }
                                                        }
                                                        i22 = i75;
                                                        i20 = 0;
                                                        zzfzVar4.zzc = new String(cArr, 0, i79);
                                                        iZzh = i78;
                                                    }
                                                }
                                                i61 = i22;
                                            } else {
                                                i20 = 0;
                                                iZzh = zzga.zzh(bArr3, i19, zzfzVar4);
                                                int i85 = zzfzVar4.zza;
                                                if (i85 < 0) {
                                                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i86 = i17 | i72;
                                                if (i85 == 0) {
                                                    zzfzVar4.zzc = "";
                                                } else {
                                                    zzfzVar4.zzc = new String(bArr3, iZzh, i85, zzhp.zza);
                                                    iZzh += i85;
                                                }
                                                i61 = i86;
                                            }
                                            iZzk3 = iZzh;
                                            unsafe3.putObject(obj4, j2, zzfzVar4.zzc);
                                            i57 = i3;
                                            bArr8 = bArr3;
                                            zzfzVar13 = zzfzVar4;
                                            obj5 = obj4;
                                            i63 = i16;
                                            unsafe4 = unsafe3;
                                            i60 = i15;
                                            i58 = i20;
                                            i59 = i13;
                                            i64 = i18;
                                        }
                                        break;
                                    case 9:
                                        Object obj10 = obj5;
                                        Unsafe unsafe5 = unsafe4;
                                        obj3 = obj10;
                                        bArr4 = bArr;
                                        i15 = iZzq;
                                        i17 = i61;
                                        i18 = i64;
                                        int i87 = i66;
                                        i16 = i68;
                                        if (i69 != i87) {
                                            i62 = i62 == true ? 1 : 0;
                                            i19 = i74;
                                            zzfzVar3 = zzfzVar;
                                            unsafe2 = unsafe5;
                                        } else {
                                            int i88 = i17 | i72;
                                            Object objZzx = zzipVar.zzx(obj3, i15);
                                            zzix zzixVarZzv = zzipVar.zzv(i15);
                                            i62 = i62 == true ? 1 : 0;
                                            zzfzVar13 = zzfzVar;
                                            iZzk3 = zzga.zzm(objZzx, zzixVarZzv, bArr4, i74, i3, zzfzVar13);
                                            zzipVar.zzF(obj3, i15, objZzx);
                                            i57 = i3;
                                            bArr8 = bArr4;
                                            obj5 = obj3;
                                            i63 = i16;
                                            i66 = i87;
                                            unsafe4 = unsafe5;
                                            i59 = i13;
                                            i64 = i18;
                                            i61 = i88;
                                            i60 = i15;
                                            i58 = 0;
                                        }
                                        break;
                                    case 10:
                                        Object obj11 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj11;
                                        bArr4 = bArr;
                                        i15 = iZzq;
                                        i24 = i62 == true ? 1 : 0;
                                        i16 = i68;
                                        i25 = i74;
                                        zzfzVar5 = zzfzVar;
                                        i17 = i61;
                                        i18 = i64;
                                        int i89 = i66;
                                        if (i69 == i89) {
                                            int i90 = i17 | i72;
                                            int iZza = zzga.zza(bArr4, i25, zzfzVar5);
                                            unsafe2.putObject(obj3, j2, zzfzVar5.zzc);
                                            obj5 = obj3;
                                            unsafe4 = unsafe2;
                                            i57 = i3;
                                            i62 = i24 == true ? 1 : 0;
                                            bArr8 = bArr4;
                                            i66 = i89;
                                            i59 = i13;
                                            i64 = i18;
                                            iZzk3 = iZza;
                                            zzfzVar13 = zzfzVar5;
                                            i61 = i90;
                                            i63 = i16;
                                            i60 = i15;
                                            i58 = 0;
                                        }
                                        break;
                                    case 12:
                                        Object obj12 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj12;
                                        bArr4 = bArr;
                                        i15 = iZzq;
                                        i24 = i62 == true ? 1 : 0;
                                        i16 = i68;
                                        i25 = i74;
                                        zzfzVar5 = zzfzVar;
                                        if (i69 != 0) {
                                            i17 = i61;
                                            i18 = i64;
                                        } else {
                                            int iZzh9 = zzga.zzh(bArr4, i25, zzfzVar5);
                                            int i91 = zzfzVar5.zza;
                                            zzhm zzhmVarZzu = zzipVar.zzu(i15);
                                            if ((i70 & Integer.MIN_VALUE) == 0 || zzhmVarZzu == null || zzhmVarZzu.zza(i91)) {
                                                int i92 = i64;
                                                i61 |= i72;
                                                unsafe2.putInt(obj3, j2, i91);
                                                obj5 = obj3;
                                                unsafe4 = unsafe2;
                                                i57 = i3;
                                                bArr8 = bArr4;
                                                zzfzVar13 = zzfzVar5;
                                                i63 = i16;
                                                i60 = i15;
                                                iZzk3 = iZzh9;
                                                i59 = i13;
                                                i64 = i92;
                                            } else {
                                                zzd(obj3).zzj(i24 == true ? 1 : 0, Long.valueOf(i91));
                                                obj5 = obj3;
                                                unsafe4 = unsafe2;
                                                i57 = i3;
                                                bArr8 = bArr4;
                                                zzfzVar13 = zzfzVar5;
                                                i63 = i16;
                                                i60 = i15;
                                                iZzk3 = iZzh9;
                                                i59 = i13;
                                                i64 = i64;
                                                i61 = i61;
                                            }
                                            i58 = 0;
                                            i62 = i24 == true ? 1 : 0;
                                        }
                                        break;
                                    case 15:
                                        Object obj13 = obj5;
                                        unsafe2 = unsafe4;
                                        obj3 = obj13;
                                        bArr4 = bArr;
                                        i15 = iZzq;
                                        i16 = i68;
                                        zzfzVar6 = zzfzVar;
                                        if (i69 != 0) {
                                            i14 = 1048575;
                                            i62 = i62 == true ? 1 : 0;
                                            zzfzVar3 = zzfzVar6;
                                            i17 = i61;
                                            i18 = i64;
                                            i20 = 0;
                                            i19 = i74;
                                        } else {
                                            i61 |= i72;
                                            iZzh2 = zzga.zzh(bArr4, i74, zzfzVar6);
                                            unsafe2.putInt(obj3, j2, zzgn.zzb(zzfzVar6.zza));
                                            obj5 = obj3;
                                            unsafe4 = unsafe2;
                                            i57 = i3;
                                            i62 = i62 == true ? 1 : 0;
                                            bArr8 = bArr4;
                                            zzfzVar13 = zzfzVar6;
                                            iZzk3 = iZzh2;
                                            i63 = i16;
                                            i60 = i15;
                                            i59 = i13;
                                            i58 = 0;
                                        }
                                        break;
                                    case 16:
                                        bArr4 = bArr;
                                        i15 = iZzq;
                                        i16 = i68;
                                        zzfzVar6 = zzfzVar;
                                        if (i69 != 0) {
                                            Object obj14 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj14;
                                            i19 = i74;
                                            zzfzVar3 = zzfzVar6;
                                            i17 = i61;
                                            i18 = i64;
                                            i14 = 1048575;
                                            i20 = 0;
                                        } else {
                                            i61 |= i72;
                                            iZzh2 = zzga.zzk(bArr4, i74, zzfzVar6);
                                            unsafe4.putLong(obj5, j2, zzgn.zzc(zzfzVar6.zzb));
                                            obj5 = obj5;
                                            unsafe4 = unsafe4;
                                            i57 = i3;
                                            bArr8 = bArr4;
                                            zzfzVar13 = zzfzVar6;
                                            iZzk3 = iZzh2;
                                            i63 = i16;
                                            i60 = i15;
                                            i59 = i13;
                                            i58 = 0;
                                        }
                                        break;
                                    default:
                                        if (i69 != 3) {
                                            i15 = iZzq;
                                            i16 = i68;
                                            Object obj15 = obj5;
                                            unsafe2 = unsafe4;
                                            obj3 = obj15;
                                            bArr2 = bArr;
                                            zzfzVar3 = zzfzVar;
                                            i17 = i61;
                                            i18 = i64;
                                            i14 = 1048575;
                                            i19 = i74;
                                            i20 = 0;
                                        } else {
                                            i61 |= i72;
                                            Object objZzx2 = zzipVar.zzx(obj5, iZzq);
                                            int i93 = iZzq;
                                            int iZzl = zzga.zzl(objZzx2, zzipVar.zzv(iZzq), bArr, i74, i3, (i68 << 3) | 4, zzfzVar);
                                            zzipVar.zzF(obj5, i93, objZzx2);
                                            bArr8 = bArr;
                                            zzfzVar13 = zzfzVar;
                                            i63 = i68;
                                            i60 = i93;
                                            i59 = i13;
                                            i58 = 0;
                                            iZzk3 = iZzl;
                                            i57 = i3;
                                        }
                                        break;
                                }
                            } else {
                                Object obj16 = obj5;
                                Unsafe unsafe6 = unsafe4;
                                int i94 = iZzi;
                                i12 = 0;
                                i14 = 1048575;
                                int i95 = iZzq;
                                if (iZzr != 27) {
                                    Unsafe unsafe7 = unsafe6;
                                    if (iZzr <= 49) {
                                        long j3 = i70;
                                        Unsafe unsafe8 = zzb;
                                        zzho zzhoVarZzd = (zzho) unsafe8.getObject(obj16, j2);
                                        if (zzhoVarZzd.zzc()) {
                                            i30 = i61;
                                        } else {
                                            int size = zzhoVarZzd.size();
                                            i30 = i61;
                                            zzhoVarZzd = zzhoVarZzd.zzd(size + size);
                                            unsafe8.putObject(obj16, j2, zzhoVarZzd);
                                        }
                                        zzho zzhoVar2 = zzhoVarZzd;
                                        switch (iZzr) {
                                            case 18:
                                            case 35:
                                                i31 = i64;
                                                i32 = i94;
                                                bArr6 = bArr;
                                                i33 = i3;
                                                unsafe = unsafe7;
                                                i8 = i62 == true ? 1 : 0;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i35 = i95;
                                                if (i69 == 2) {
                                                    int i96 = zzga.zza;
                                                    zzgt zzgtVar = (zzgt) zzhoVar2;
                                                    iZzh3 = zzga.zzh(bArr6, i32, zzfzVar8);
                                                    int i97 = zzfzVar8.zza;
                                                    int i98 = iZzh3 + i97;
                                                    if (i98 > bArr6.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzgtVar.zzg(zzgtVar.size() + (i97 / 8));
                                                    while (iZzh3 < i98) {
                                                        zzgtVar.zzf(Double.longBitsToDouble(zzga.zzn(bArr6, iZzh3)));
                                                        iZzh3 += 8;
                                                    }
                                                    if (iZzh3 != i98) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    iZzk = iZzh3;
                                                    if (iZzk != i32) {
                                                        i7 = i5;
                                                        i11 = iZzk;
                                                        zzfzVar2 = zzfzVar8;
                                                        i60 = i35;
                                                        i10 = i34;
                                                        i64 = i31;
                                                        i61 = i30;
                                                        obj2 = obj;
                                                    } else {
                                                        int i99 = i34;
                                                        i62 = i8 == true ? 1 : 0;
                                                        i63 = i99;
                                                        bArr8 = bArr6;
                                                        i57 = i33;
                                                        zzfzVar13 = zzfzVar8;
                                                        i60 = i35;
                                                        i59 = i13;
                                                        i58 = 0;
                                                        i64 = i31;
                                                        i61 = i30;
                                                        i65 = 1;
                                                        i66 = 2;
                                                        obj5 = obj;
                                                        iZzk3 = iZzk;
                                                        unsafe4 = unsafe;
                                                    }
                                                    break;
                                                } else {
                                                    if (i69 == 1) {
                                                        iZzk = i32 + 8;
                                                        int i100 = zzga.zza;
                                                        zzgt zzgtVar2 = (zzgt) zzhoVar2;
                                                        zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr6, i32)));
                                                        while (iZzk < i33) {
                                                            int iZzh10 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                            if (i8 == zzfzVar8.zza) {
                                                                zzgtVar2.zzf(Double.longBitsToDouble(zzga.zzn(bArr6, iZzh10)));
                                                                iZzk = iZzh10 + 8;
                                                            }
                                                        }
                                                    } else {
                                                        iZzk = i32;
                                                    }
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 19:
                                            case 36:
                                                i31 = i64;
                                                i32 = i94;
                                                bArr6 = bArr;
                                                i33 = i3;
                                                unsafe = unsafe7;
                                                i8 = i62 == true ? 1 : 0;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i35 = i95;
                                                if (i69 == 2) {
                                                    int i101 = zzga.zza;
                                                    zzhd zzhdVar = (zzhd) zzhoVar2;
                                                    iZzh3 = zzga.zzh(bArr6, i32, zzfzVar8);
                                                    int i102 = zzfzVar8.zza;
                                                    int i103 = iZzh3 + i102;
                                                    if (i103 > bArr6.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhdVar.zzg(zzhdVar.size() + (i102 / 4));
                                                    while (iZzh3 < i103) {
                                                        zzhdVar.zzf(Float.intBitsToFloat(zzga.zzb(bArr6, iZzh3)));
                                                        iZzh3 += 4;
                                                    }
                                                    if (iZzh3 != i103) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    iZzk = iZzh3;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    if (i69 == 5) {
                                                        iZzk = i32 + 4;
                                                        int i104 = zzga.zza;
                                                        zzhd zzhdVar2 = (zzhd) zzhoVar2;
                                                        zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr6, i32)));
                                                        while (iZzk < i33) {
                                                            int iZzh11 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                            if (i8 == zzfzVar8.zza) {
                                                                zzhdVar2.zzf(Float.intBitsToFloat(zzga.zzb(bArr6, iZzh11)));
                                                                iZzk = iZzh11 + 4;
                                                            }
                                                        }
                                                    }
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case 38:
                                                i31 = i64;
                                                i32 = i94;
                                                bArr6 = bArr;
                                                i33 = i3;
                                                unsafe = unsafe7;
                                                i8 = i62 == true ? 1 : 0;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i35 = i95;
                                                if (i69 == 2) {
                                                    int i105 = zzga.zza;
                                                    zzib zzibVar = (zzib) zzhoVar2;
                                                    iZzh3 = zzga.zzh(bArr6, i32, zzfzVar8);
                                                    int i106 = zzfzVar8.zza + iZzh3;
                                                    while (iZzh3 < i106) {
                                                        iZzh3 = zzga.zzk(bArr6, iZzh3, zzfzVar8);
                                                        zzibVar.zzf(zzfzVar8.zzb);
                                                    }
                                                    if (iZzh3 != i106) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    iZzk = iZzh3;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        int i107 = zzga.zza;
                                                        zzib zzibVar2 = (zzib) zzhoVar2;
                                                        iZzk = zzga.zzk(bArr6, i32, zzfzVar8);
                                                        zzibVar2.zzf(zzfzVar8.zzb);
                                                        while (iZzk < i33) {
                                                            int iZzh12 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                            if (i8 == zzfzVar8.zza) {
                                                                iZzk = zzga.zzk(bArr6, iZzh12, zzfzVar8);
                                                                zzibVar2.zzf(zzfzVar8.zzb);
                                                            }
                                                        }
                                                    }
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                bArr6 = bArr;
                                                i36 = i3;
                                                unsafe = unsafe7;
                                                i37 = i62 == true ? 1 : 0;
                                                i38 = i94;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i31 = i64;
                                                i35 = i95;
                                                if (i69 == 2) {
                                                    iZzk = zzga.zzf(bArr6, i38, zzhoVar2, zzfzVar8);
                                                    i32 = i38;
                                                    i33 = i36;
                                                    i8 = i37;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        int iZzj = zzga.zzj(i37 == true ? 1 : 0, bArr6, i38, i36, zzhoVar2, zzfzVar8);
                                                        i8 = i37 == true ? 1 : 0;
                                                        i32 = i38;
                                                        i33 = i36;
                                                        iZzk = iZzj;
                                                        if (iZzk != i32) {
                                                        }
                                                    }
                                                    i32 = i38;
                                                    i33 = i36;
                                                    i8 = i37;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case 46:
                                                bArr6 = bArr;
                                                i36 = i3;
                                                unsafe = unsafe7;
                                                i37 = i62 == true ? 1 : 0;
                                                i38 = i94;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i31 = i64;
                                                if (i69 == 2) {
                                                    int i108 = zzga.zza;
                                                    zzib zzibVar3 = (zzib) zzhoVar2;
                                                    int iZzh13 = zzga.zzh(bArr6, i38, zzfzVar8);
                                                    int i109 = zzfzVar8.zza;
                                                    int i110 = iZzh13 + i109;
                                                    if (i110 > bArr6.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzibVar3.zzg(zzibVar3.size() + (i109 / 8));
                                                    while (iZzh13 < i110) {
                                                        zzibVar3.zzf(zzga.zzn(bArr6, iZzh13));
                                                        iZzh13 += 8;
                                                        i95 = i95;
                                                    }
                                                    i35 = i95;
                                                    if (iZzh13 != i110) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i32 = i38;
                                                    i33 = i36;
                                                    i8 = i37 == true ? 1 : 0;
                                                    iZzk = iZzh13;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    i35 = i95;
                                                    if (i69 == 1) {
                                                        iZzk = i38 + 8;
                                                        int i111 = zzga.zza;
                                                        zzib zzibVar4 = (zzib) zzhoVar2;
                                                        zzibVar4.zzf(zzga.zzn(bArr6, i38));
                                                        while (iZzk < i36) {
                                                            int iZzh14 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                            if (i37 == zzfzVar8.zza) {
                                                                zzibVar4.zzf(zzga.zzn(bArr6, iZzh14));
                                                                iZzk = iZzh14 + 8;
                                                            } else {
                                                                i32 = i38;
                                                                i33 = i36;
                                                                i8 = i37;
                                                                if (iZzk != i32) {
                                                                }
                                                            }
                                                        }
                                                        i32 = i38;
                                                        i33 = i36;
                                                        i8 = i37;
                                                        if (iZzk != i32) {
                                                        }
                                                    }
                                                    i32 = i38;
                                                    i33 = i36;
                                                    i8 = i37;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr6 = bArr;
                                                i39 = i3;
                                                unsafe = unsafe7;
                                                i40 = i62 == true ? 1 : 0;
                                                i41 = i94;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i31 = i64;
                                                if (i69 == 2) {
                                                    int i112 = zzga.zza;
                                                    zzhl zzhlVar = (zzhl) zzhoVar2;
                                                    iZzh4 = zzga.zzh(bArr6, i41, zzfzVar8);
                                                    int i113 = zzfzVar8.zza;
                                                    int i114 = iZzh4 + i113;
                                                    if (i114 > bArr6.length) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzhlVar.zzh(zzhlVar.size() + (i113 / 4));
                                                    while (iZzh4 < i114) {
                                                        zzhlVar.zzg(zzga.zzb(bArr6, iZzh4));
                                                        iZzh4 += 4;
                                                    }
                                                    if (iZzh4 != i114) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40;
                                                    iZzk = iZzh4;
                                                    i35 = i95;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    if (i69 == 5) {
                                                        int i115 = i41 + 4;
                                                        int i116 = zzga.zza;
                                                        zzhl zzhlVar2 = (zzhl) zzhoVar2;
                                                        zzhlVar2.zzg(zzga.zzb(bArr6, i41));
                                                        while (i115 < i39) {
                                                            int iZzh15 = zzga.zzh(bArr6, i115, zzfzVar8);
                                                            if (i40 == zzfzVar8.zza) {
                                                                zzhlVar2.zzg(zzga.zzb(bArr6, iZzh15));
                                                                i115 = iZzh15 + 4;
                                                            } else {
                                                                i32 = i41;
                                                                i33 = i39;
                                                                i8 = i40 == true ? 1 : 0;
                                                                iZzk = i115;
                                                                i35 = i95;
                                                                if (iZzk != i32) {
                                                                }
                                                            }
                                                        }
                                                        i32 = i41;
                                                        i33 = i39;
                                                        i8 = i40 == true ? 1 : 0;
                                                        iZzk = i115;
                                                        i35 = i95;
                                                        if (iZzk != i32) {
                                                        }
                                                    }
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40;
                                                    i35 = i95;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr6 = bArr;
                                                i39 = i3;
                                                unsafe = unsafe7;
                                                i40 = i62 == true ? 1 : 0;
                                                i41 = i94;
                                                zzfzVar8 = zzfzVar;
                                                i34 = i68;
                                                i31 = i64;
                                                if (i69 == 2) {
                                                    int i117 = zzga.zza;
                                                    zzgb zzgbVar = (zzgb) zzhoVar2;
                                                    iZzh4 = zzga.zzh(bArr6, i41, zzfzVar8);
                                                    int i118 = zzfzVar8.zza + iZzh4;
                                                    while (iZzh4 < i118) {
                                                        iZzh4 = zzga.zzk(bArr6, iZzh4, zzfzVar8);
                                                        zzgbVar.zze(zzfzVar8.zzb != 0);
                                                    }
                                                    if (iZzh4 != i118) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40;
                                                    iZzk = iZzh4;
                                                    i35 = i95;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        int i119 = zzga.zza;
                                                        zzgb zzgbVar2 = (zzgb) zzhoVar2;
                                                        iZzk = zzga.zzk(bArr6, i41, zzfzVar8);
                                                        zzgbVar2.zze(zzfzVar8.zzb != 0);
                                                        while (iZzk < i39) {
                                                            int iZzh16 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                            if (i40 == zzfzVar8.zza) {
                                                                iZzk = zzga.zzk(bArr6, iZzh16, zzfzVar8);
                                                                zzgbVar2.zze(zzfzVar8.zzb != 0);
                                                            } else {
                                                                i32 = i41;
                                                                i33 = i39;
                                                                i8 = i40;
                                                                i35 = i95;
                                                                if (iZzk != i32) {
                                                                }
                                                            }
                                                        }
                                                        i32 = i41;
                                                        i33 = i39;
                                                        i8 = i40;
                                                        i35 = i95;
                                                        if (iZzk != i32) {
                                                        }
                                                    }
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40;
                                                    i35 = i95;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 26:
                                                bArr6 = bArr;
                                                i39 = i3;
                                                unsafe = unsafe7;
                                                i40 = i62 == true ? 1 : 0;
                                                i41 = i94;
                                                zzfzVar8 = zzfzVar;
                                                i31 = i64;
                                                if (i69 != 2) {
                                                    i34 = i68;
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40;
                                                    i35 = i95;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                } else if ((j3 & 536870912) == 0) {
                                                    iZzk = zzga.zzh(bArr6, i41, zzfzVar8);
                                                    int i120 = zzfzVar8.zza;
                                                    if (i120 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i120 == 0) {
                                                        zzhoVar2.add("");
                                                    } else {
                                                        zzhoVar2.add(new String(bArr6, iZzk, i120, zzhp.zza));
                                                        iZzk += i120;
                                                    }
                                                    while (iZzk < i39) {
                                                        int iZzh17 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                        if (i40 == zzfzVar8.zza) {
                                                            iZzk = zzga.zzh(bArr6, iZzh17, zzfzVar8);
                                                            int i121 = zzfzVar8.zza;
                                                            if (i121 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i121 == 0) {
                                                                zzhoVar2.add("");
                                                            } else {
                                                                zzhoVar2.add(new String(bArr6, iZzk, i121, zzhp.zza));
                                                                iZzk += i121;
                                                            }
                                                        } else {
                                                            i32 = i41;
                                                            i33 = i39;
                                                            i8 = i40 == true ? 1 : 0;
                                                            i34 = i68;
                                                            i35 = i95;
                                                            if (iZzk != i32) {
                                                            }
                                                        }
                                                    }
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40 == true ? 1 : 0;
                                                    i34 = i68;
                                                    i35 = i95;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    iZzk = zzga.zzh(bArr6, i41, zzfzVar8);
                                                    int i122 = zzfzVar8.zza;
                                                    if (i122 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i122 == 0) {
                                                        zzhoVar2.add("");
                                                        i34 = i68;
                                                    } else {
                                                        int i123 = iZzk + i122;
                                                        if (!zzjt.zzd(bArr6, iZzk, i123)) {
                                                            throw new zzhr("Protocol message had invalid UTF-8.");
                                                        }
                                                        i34 = i68;
                                                        zzhoVar2.add(new String(bArr6, iZzk, i122, zzhp.zza));
                                                        iZzk = i123;
                                                    }
                                                    while (iZzk < i39) {
                                                        int iZzh18 = zzga.zzh(bArr6, iZzk, zzfzVar8);
                                                        if (i40 == zzfzVar8.zza) {
                                                            iZzk = zzga.zzh(bArr6, iZzh18, zzfzVar8);
                                                            int i124 = zzfzVar8.zza;
                                                            if (i124 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i124 == 0) {
                                                                zzhoVar2.add("");
                                                            } else {
                                                                int i125 = iZzk + i124;
                                                                if (!zzjt.zzd(bArr6, iZzk, i125)) {
                                                                    throw new zzhr("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzhoVar2.add(new String(bArr6, iZzk, i124, zzhp.zza));
                                                                iZzk = i125;
                                                            }
                                                        } else {
                                                            i32 = i41;
                                                            i33 = i39;
                                                            i8 = i40;
                                                            i35 = i95;
                                                            if (iZzk != i32) {
                                                            }
                                                        }
                                                    }
                                                    i32 = i41;
                                                    i33 = i39;
                                                    i8 = i40;
                                                    i35 = i95;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 27:
                                                bArr6 = bArr;
                                                i42 = i3;
                                                zzfzVar9 = zzfzVar;
                                                unsafe = unsafe7;
                                                i43 = i62 == true ? 1 : 0;
                                                i44 = i94;
                                                i31 = i64;
                                                if (i69 == 2) {
                                                    zzipVar = this;
                                                    iZzk = zzga.zze(zzipVar.zzv(i95), i43 == true ? 1 : 0, bArr6, i44, i42, zzhoVar2, zzfzVar9);
                                                    bArr6 = bArr6;
                                                    i45 = i42;
                                                    i32 = i44;
                                                    i8 = i43 == true ? 1 : 0;
                                                    zzfzVar8 = zzfzVar9;
                                                    i34 = i68;
                                                    i35 = i95;
                                                    i33 = i45;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    zzipVar = this;
                                                    i34 = i68;
                                                    i35 = i95;
                                                    i32 = i44;
                                                    i33 = i42;
                                                    i8 = i43;
                                                    zzfzVar8 = zzfzVar9;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 28:
                                                bArr6 = bArr;
                                                i42 = i3;
                                                zzfzVar9 = zzfzVar;
                                                unsafe = unsafe7;
                                                i43 = i62 == true ? 1 : 0;
                                                i44 = i94;
                                                i31 = i64;
                                                if (i69 == 2) {
                                                    int iZzh19 = zzga.zzh(bArr6, i44, zzfzVar9);
                                                    int i126 = zzfzVar9.zza;
                                                    if (i126 < 0) {
                                                        throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i126 > bArr6.length - iZzh19) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i126 == 0) {
                                                        zzhoVar2.add(zzgk.zzb);
                                                    } else {
                                                        zzhoVar2.add(zzgk.zzj(bArr6, iZzh19, i126));
                                                        iZzh19 += i126;
                                                    }
                                                    while (iZzh19 < i42) {
                                                        int iZzh20 = zzga.zzh(bArr6, iZzh19, zzfzVar9);
                                                        if (i43 == zzfzVar9.zza) {
                                                            iZzh19 = zzga.zzh(bArr6, iZzh20, zzfzVar9);
                                                            int i127 = zzfzVar9.zza;
                                                            if (i127 < 0) {
                                                                throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i127 > bArr6.length - iZzh19) {
                                                                throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i127 == 0) {
                                                                zzhoVar2.add(zzgk.zzb);
                                                            } else {
                                                                zzhoVar2.add(zzgk.zzj(bArr6, iZzh19, i127));
                                                                iZzh19 += i127;
                                                            }
                                                        } else {
                                                            i34 = i68;
                                                            i35 = i95;
                                                            iZzk = iZzh19;
                                                            i32 = i44;
                                                            i33 = i42;
                                                            i8 = i43 == true ? 1 : 0;
                                                            zzfzVar8 = zzfzVar9;
                                                            zzipVar = this;
                                                            if (iZzk != i32) {
                                                            }
                                                        }
                                                    }
                                                    i34 = i68;
                                                    i35 = i95;
                                                    iZzk = iZzh19;
                                                    i32 = i44;
                                                    i33 = i42;
                                                    i8 = i43 == true ? 1 : 0;
                                                    zzfzVar8 = zzfzVar9;
                                                    zzipVar = this;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    i34 = i68;
                                                    i35 = i95;
                                                    zzipVar = this;
                                                    i32 = i44;
                                                    i33 = i42;
                                                    i8 = i43;
                                                    zzfzVar8 = zzfzVar9;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 30:
                                            case 44:
                                                bArr6 = bArr;
                                                i45 = i3;
                                                zzfzVar10 = zzfzVar;
                                                unsafe = unsafe7;
                                                i46 = i94;
                                                if (i69 == 2) {
                                                    iZzf = zzga.zzf(bArr6, i46, zzhoVar2, zzfzVar10);
                                                    i48 = i62 == true ? 1 : 0;
                                                    zzhoVar = zzhoVar2;
                                                    i47 = i46;
                                                } else if (i69 == 0) {
                                                    i47 = i46;
                                                    int iZzj2 = zzga.zzj(i62 == true ? 1 : 0, bArr6, i47, i45, zzhoVar2, zzfzVar10);
                                                    zzhoVar = zzhoVar2;
                                                    i48 = i62 == true ? 1 : 0;
                                                    iZzf = iZzj2;
                                                } else {
                                                    i31 = i64;
                                                    zzipVar = this;
                                                    zzfzVar8 = zzfzVar10;
                                                    i8 = i62 == true ? 1 : 0;
                                                    i34 = i68;
                                                    i35 = i95;
                                                    i32 = i46;
                                                    i33 = i45;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                zzhm zzhmVarZzu2 = zzipVar.zzu(i95);
                                                zzjj zzjjVar = zzipVar.zzl;
                                                int i128 = zziz.zza;
                                                if (zzhmVarZzu2 == null) {
                                                    i49 = iZzf;
                                                    i31 = i64;
                                                    i50 = i95;
                                                } else if (zzhoVar != null) {
                                                    int size2 = zzhoVar.size();
                                                    i49 = iZzf;
                                                    i31 = i64;
                                                    Object objZzn = null;
                                                    int i129 = 0;
                                                    int i130 = 0;
                                                    while (i130 < size2) {
                                                        Integer num = (Integer) zzhoVar.get(i130);
                                                        int i131 = i95;
                                                        int iIntValue = num.intValue();
                                                        if (zzhmVarZzu2.zza(iIntValue)) {
                                                            if (i130 != i129) {
                                                                zzhoVar.set(i129, num);
                                                            }
                                                            i129++;
                                                        } else {
                                                            objZzn = zziz.zzn(obj16, i68, iIntValue, objZzn, zzjjVar);
                                                        }
                                                        i130++;
                                                        i95 = i131;
                                                    }
                                                    i50 = i95;
                                                    if (i129 != size2) {
                                                        zzhoVar.subList(i129, size2).clear();
                                                    }
                                                } else {
                                                    i49 = iZzf;
                                                    i31 = i64;
                                                    i50 = i95;
                                                    Iterator it = zzhoVar.iterator();
                                                    Object objZzn2 = null;
                                                    while (it.hasNext()) {
                                                        int iIntValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzhmVarZzu2.zza(iIntValue2)) {
                                                            objZzn2 = zziz.zzn(obj16, i68, iIntValue2, objZzn2, zzjjVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                int i132 = i50;
                                                i34 = i68;
                                                i35 = i132;
                                                zzipVar = this;
                                                iZzk = i49;
                                                i32 = i47;
                                                i33 = i45;
                                                i8 = i48;
                                                zzfzVar8 = zzfzVar10;
                                                if (iZzk != i32) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                bArr6 = bArr;
                                                i45 = i3;
                                                zzfzVar11 = zzfzVar;
                                                unsafe = unsafe7;
                                                i51 = i62 == true ? 1 : 0;
                                                i46 = i94;
                                                if (i69 == 2) {
                                                    int i133 = zzga.zza;
                                                    zzhl zzhlVar3 = (zzhl) zzhoVar2;
                                                    iZzh5 = zzga.zzh(bArr6, i46, zzfzVar11);
                                                    int i134 = zzfzVar11.zza + iZzh5;
                                                    while (iZzh5 < i134) {
                                                        iZzh5 = zzga.zzh(bArr6, iZzh5, zzfzVar11);
                                                        zzhlVar3.zzg(zzgn.zzb(zzfzVar11.zza));
                                                    }
                                                    if (iZzh5 != i134) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    iZzk = iZzh5;
                                                    zzfzVar8 = zzfzVar11;
                                                    i8 = i51;
                                                    i34 = i68;
                                                    i31 = i64;
                                                    i35 = i95;
                                                    i32 = i46;
                                                    i33 = i45;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    if (i69 == 0) {
                                                        int i135 = zzga.zza;
                                                        zzhl zzhlVar4 = (zzhl) zzhoVar2;
                                                        iZzk = zzga.zzh(bArr6, i46, zzfzVar11);
                                                        zzhlVar4.zzg(zzgn.zzb(zzfzVar11.zza));
                                                        while (iZzk < i45) {
                                                            int iZzh21 = zzga.zzh(bArr6, iZzk, zzfzVar11);
                                                            if (i51 == zzfzVar11.zza) {
                                                                iZzk = zzga.zzh(bArr6, iZzh21, zzfzVar11);
                                                                zzhlVar4.zzg(zzgn.zzb(zzfzVar11.zza));
                                                            } else {
                                                                zzfzVar8 = zzfzVar11;
                                                                i8 = i51;
                                                                i34 = i68;
                                                                i31 = i64;
                                                                i35 = i95;
                                                                i32 = i46;
                                                                i33 = i45;
                                                                if (iZzk != i32) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar8 = zzfzVar11;
                                                        i8 = i51;
                                                        i34 = i68;
                                                        i31 = i64;
                                                        i35 = i95;
                                                        i32 = i46;
                                                        i33 = i45;
                                                        if (iZzk != i32) {
                                                        }
                                                    }
                                                    zzfzVar8 = zzfzVar11;
                                                    i8 = i51;
                                                    i34 = i68;
                                                    i31 = i64;
                                                    i35 = i95;
                                                    i32 = i46;
                                                    i33 = i45;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                bArr6 = bArr;
                                                i45 = i3;
                                                zzfzVar11 = zzfzVar;
                                                i51 = i62 == true ? 1 : 0;
                                                i46 = i94;
                                                if (i69 == 2) {
                                                    int i136 = zzga.zza;
                                                    zzib zzibVar5 = (zzib) zzhoVar2;
                                                    iZzh5 = zzga.zzh(bArr6, i46, zzfzVar11);
                                                    int i137 = zzfzVar11.zza + iZzh5;
                                                    while (iZzh5 < i137) {
                                                        iZzh5 = zzga.zzk(bArr6, iZzh5, zzfzVar11);
                                                        zzibVar5.zzf(zzgn.zzc(zzfzVar11.zzb));
                                                        unsafe7 = unsafe7;
                                                    }
                                                    unsafe = unsafe7;
                                                    if (iZzh5 != i137) {
                                                        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    iZzk = iZzh5;
                                                    zzfzVar8 = zzfzVar11;
                                                    i8 = i51;
                                                    i34 = i68;
                                                    i31 = i64;
                                                    i35 = i95;
                                                    i32 = i46;
                                                    i33 = i45;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    unsafe = unsafe7;
                                                    if (i69 == 0) {
                                                        int i138 = zzga.zza;
                                                        zzib zzibVar6 = (zzib) zzhoVar2;
                                                        iZzk = zzga.zzk(bArr6, i46, zzfzVar11);
                                                        zzibVar6.zzf(zzgn.zzc(zzfzVar11.zzb));
                                                        while (iZzk < i45) {
                                                            int iZzh22 = zzga.zzh(bArr6, iZzk, zzfzVar11);
                                                            if (i51 == zzfzVar11.zza) {
                                                                iZzk = zzga.zzk(bArr6, iZzh22, zzfzVar11);
                                                                zzibVar6.zzf(zzgn.zzc(zzfzVar11.zzb));
                                                            } else {
                                                                zzfzVar8 = zzfzVar11;
                                                                i8 = i51;
                                                                i34 = i68;
                                                                i31 = i64;
                                                                i35 = i95;
                                                                i32 = i46;
                                                                i33 = i45;
                                                                if (iZzk != i32) {
                                                                }
                                                            }
                                                        }
                                                        zzfzVar8 = zzfzVar11;
                                                        i8 = i51;
                                                        i34 = i68;
                                                        i31 = i64;
                                                        i35 = i95;
                                                        i32 = i46;
                                                        i33 = i45;
                                                        if (iZzk != i32) {
                                                        }
                                                    }
                                                    zzfzVar8 = zzfzVar11;
                                                    i8 = i51;
                                                    i34 = i68;
                                                    i31 = i64;
                                                    i35 = i95;
                                                    i32 = i46;
                                                    i33 = i45;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i69 == 3) {
                                                    int i139 = ((i62 == true ? 1 : 0) & (-8)) | 4;
                                                    zzix zzixVarZzv2 = zzipVar.zzv(i95);
                                                    bArr6 = bArr;
                                                    zzfzVar10 = zzfzVar;
                                                    int iZzc = zzga.zzc(zzixVarZzv2, bArr6, i94, i3, i139, zzfzVar10);
                                                    zzhoVar2.add(zzfzVar10.zzc);
                                                    while (iZzc < i3) {
                                                        int iZzh23 = zzga.zzh(bArr6, iZzc, zzfzVar10);
                                                        zzix zzixVar = zzixVarZzv2;
                                                        if (i62 == zzfzVar10.zza) {
                                                            zzixVarZzv2 = zzixVar;
                                                            iZzc = zzga.zzc(zzixVarZzv2, bArr6, iZzh23, i3, i139, zzfzVar10);
                                                            zzhoVar2.add(zzfzVar10.zzc);
                                                        } else {
                                                            i8 = i62 == true ? 1 : 0;
                                                            iZzk = iZzc;
                                                            unsafe = unsafe7;
                                                            i34 = i68;
                                                            i31 = i64;
                                                            i35 = i95;
                                                            i32 = i94;
                                                            i33 = i3;
                                                            zzfzVar8 = zzfzVar10;
                                                            if (iZzk != i32) {
                                                            }
                                                        }
                                                    }
                                                    i8 = i62 == true ? 1 : 0;
                                                    iZzk = iZzc;
                                                    unsafe = unsafe7;
                                                    i34 = i68;
                                                    i31 = i64;
                                                    i35 = i95;
                                                    i32 = i94;
                                                    i33 = i3;
                                                    zzfzVar8 = zzfzVar10;
                                                    if (iZzk != i32) {
                                                    }
                                                } else {
                                                    i31 = i64;
                                                    i32 = i94;
                                                    bArr6 = bArr;
                                                    i33 = i3;
                                                    unsafe = unsafe7;
                                                    i8 = i62 == true ? 1 : 0;
                                                    zzfzVar8 = zzfzVar;
                                                    i34 = i68;
                                                    i35 = i95;
                                                    iZzk = i32;
                                                    if (iZzk != i32) {
                                                    }
                                                }
                                                break;
                                        }
                                    } else {
                                        i26 = i64;
                                        i27 = i94;
                                        bArr5 = bArr;
                                        i28 = i61;
                                        i8 = i62 == true ? 1 : 0;
                                        unsafe = unsafe7;
                                        i29 = i68;
                                        zzfzVar7 = zzfzVar;
                                        if (iZzr != 50) {
                                            obj2 = obj;
                                            Unsafe unsafe9 = zzb;
                                            long j4 = iArr[i95 + 2] & 1048575;
                                            switch (iZzr) {
                                                case 51:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 1) {
                                                        iZzh6 = i53 + 8;
                                                        unsafe9.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zzga.zzn(bArr7, i53))));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzh6;
                                                        if (iZzk3 == i53) {
                                                            i7 = i5;
                                                            i11 = iZzk3;
                                                            i60 = i52;
                                                            i64 = i26;
                                                            i61 = i28;
                                                        } else {
                                                            i57 = i3;
                                                            zzfzVar13 = zzfzVar2;
                                                            bArr8 = bArr7;
                                                            obj5 = obj2;
                                                            i60 = i52;
                                                            i59 = i13;
                                                            unsafe4 = unsafe;
                                                            i58 = 0;
                                                            i64 = i26;
                                                            i61 = i28;
                                                            i65 = 1;
                                                            i66 = 2;
                                                            i62 = i8 == true ? 1 : 0;
                                                            i63 = i10;
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 52:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 5) {
                                                        iZzh6 = i53 + 4;
                                                        unsafe9.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zzga.zzb(bArr7, i53))));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzh6;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 53:
                                                case 54:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 0) {
                                                        iZzk2 = zzga.zzk(bArr7, i53, zzfzVar2);
                                                        unsafe9.putObject(obj2, j2, Long.valueOf(zzfzVar2.zzb));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzk2;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 55:
                                                case 62:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 0) {
                                                        iZzh6 = zzga.zzh(bArr7, i53, zzfzVar2);
                                                        unsafe9.putObject(obj2, j2, Integer.valueOf(zzfzVar2.zza));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzh6;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 56:
                                                case 65:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 1) {
                                                        iZzh6 = i53 + 8;
                                                        unsafe9.putObject(obj2, j2, Long.valueOf(zzga.zzn(bArr7, i53)));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzh6;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 57:
                                                case 64:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 5) {
                                                        iZzh6 = i53 + 4;
                                                        unsafe9.putObject(obj2, j2, Integer.valueOf(zzga.zzb(bArr7, i53)));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzh6;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 58:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 0) {
                                                        iZzk2 = zzga.zzk(bArr7, i53, zzfzVar2);
                                                        unsafe9.putObject(obj2, j2, Boolean.valueOf(zzfzVar2.zzb != 0));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzk2;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 59:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    if (i69 == 2) {
                                                        iZzh7 = zzga.zzh(bArr7, i53, zzfzVar2);
                                                        int i140 = zzfzVar2.zza;
                                                        if (i140 == 0) {
                                                            unsafe9.putObject(obj2, j2, "");
                                                        } else {
                                                            int i141 = iZzh7 + i140;
                                                            if ((i70 & 536870912) != 0 && !zzjt.zzd(bArr7, iZzh7, i141)) {
                                                                throw new zzhr("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe9.putObject(obj2, j2, new String(bArr7, iZzh7, i140, zzhp.zza));
                                                            iZzh7 = i141;
                                                        }
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        iZzk3 = iZzh7;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 60:
                                                    bArr7 = bArr5;
                                                    i10 = i29;
                                                    i54 = i27;
                                                    if (i69 == 2) {
                                                        Object objZzy = zzipVar.zzy(obj2, i10, i95);
                                                        int iZzm = zzga.zzm(objZzy, zzipVar.zzv(i95), bArr7, i54, i3, zzfzVar7);
                                                        bArr7 = bArr7;
                                                        zzipVar.zzG(obj2, i10, i95, objZzy);
                                                        iZzk3 = iZzm;
                                                        i52 = i95;
                                                        zzfzVar2 = zzfzVar;
                                                        i53 = i54;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    } else {
                                                        zzfzVar2 = zzfzVar;
                                                        i52 = i95;
                                                        i53 = i54;
                                                        iZzk3 = i53;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    bArr7 = bArr5;
                                                    zzfzVar12 = zzfzVar7;
                                                    i10 = i29;
                                                    i54 = i27;
                                                    c2 = 3;
                                                    if (i69 == 2) {
                                                        iZzh7 = zzga.zza(bArr7, i54, zzfzVar12);
                                                        unsafe9.putObject(obj2, j2, zzfzVar12.zzc);
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        zzfzVar2 = zzfzVar12;
                                                        i52 = i95;
                                                        i53 = i54;
                                                        iZzk3 = iZzh7;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    zzfzVar2 = zzfzVar12;
                                                    i52 = i95;
                                                    i53 = i54;
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 63:
                                                    bArr7 = bArr5;
                                                    zzfzVar12 = zzfzVar7;
                                                    i10 = i29;
                                                    i54 = i27;
                                                    c2 = 3;
                                                    i55 = i8 == true ? 1 : 0;
                                                    if (i69 == 0) {
                                                        iZzh8 = zzga.zzh(bArr7, i54, zzfzVar12);
                                                        int i142 = zzfzVar12.zza;
                                                        zzhm zzhmVarZzu3 = zzipVar.zzu(i95);
                                                        if (zzhmVarZzu3 == null || zzhmVarZzu3.zza(i142)) {
                                                            i56 = i55 == true ? 1 : 0;
                                                            unsafe9.putObject(obj2, j2, Integer.valueOf(i142));
                                                            unsafe9.putInt(obj2, j4, i10);
                                                        } else {
                                                            zzjk zzjkVarZzd = zzd(obj2);
                                                            Long lValueOf = Long.valueOf(i142);
                                                            i56 = i55 == true ? 1 : 0;
                                                            zzjkVarZzd.zzj(i56 == true ? 1 : 0, lValueOf);
                                                        }
                                                        i8 = i56;
                                                        i52 = i95;
                                                        i53 = i54;
                                                        iZzk3 = iZzh8;
                                                        zzfzVar2 = zzfzVar12;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    zzfzVar2 = zzfzVar12;
                                                    i8 = i55;
                                                    i52 = i95;
                                                    i53 = i54;
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 66:
                                                    bArr7 = bArr5;
                                                    zzfzVar12 = zzfzVar7;
                                                    i10 = i29;
                                                    i54 = i27;
                                                    c2 = 3;
                                                    i55 = i8 == true ? 1 : 0;
                                                    if (i69 == 0) {
                                                        iZzh8 = zzga.zzh(bArr7, i54, zzfzVar12);
                                                        unsafe9.putObject(obj2, j2, Integer.valueOf(zzgn.zzb(zzfzVar12.zza)));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        i8 = i55;
                                                        i52 = i95;
                                                        i53 = i54;
                                                        iZzk3 = iZzh8;
                                                        zzfzVar2 = zzfzVar12;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    zzfzVar2 = zzfzVar12;
                                                    i8 = i55;
                                                    i52 = i95;
                                                    i53 = i54;
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 67:
                                                    bArr7 = bArr5;
                                                    zzfzVar12 = zzfzVar7;
                                                    i10 = i29;
                                                    i54 = i27;
                                                    c2 = 3;
                                                    if (i69 == 0) {
                                                        iZzh8 = zzga.zzk(bArr7, i54, zzfzVar12);
                                                        i55 = i8 == true ? 1 : 0;
                                                        unsafe9.putObject(obj2, j2, Long.valueOf(zzgn.zzc(zzfzVar12.zzb)));
                                                        unsafe9.putInt(obj2, j4, i10);
                                                        i8 = i55;
                                                        i52 = i95;
                                                        i53 = i54;
                                                        iZzk3 = iZzh8;
                                                        zzfzVar2 = zzfzVar12;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    zzfzVar2 = zzfzVar12;
                                                    i52 = i95;
                                                    i53 = i54;
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                                case 68:
                                                    c2 = 3;
                                                    if (i69 == 3) {
                                                        int i143 = ((i8 == true ? 1 : 0) & (-8)) | 4;
                                                        Object objZzy2 = zzipVar.zzy(obj2, i29, i95);
                                                        iZzh8 = zzga.zzl(objZzy2, zzipVar.zzv(i95), bArr, i27, i3, i143, zzfzVar7);
                                                        bArr7 = bArr;
                                                        zzfzVar12 = zzfzVar7;
                                                        i54 = i27;
                                                        zzipVar.zzG(obj2, i29, i95, objZzy2);
                                                        i10 = i29;
                                                        i52 = i95;
                                                        i53 = i54;
                                                        iZzk3 = iZzh8;
                                                        zzfzVar2 = zzfzVar12;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    } else {
                                                        bArr7 = bArr5;
                                                        zzfzVar2 = zzfzVar7;
                                                        i10 = i29;
                                                        i52 = i95;
                                                        i53 = i27;
                                                        iZzk3 = i53;
                                                        if (iZzk3 == i53) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    bArr7 = bArr5;
                                                    zzfzVar2 = zzfzVar7;
                                                    i10 = i29;
                                                    i52 = i95;
                                                    i53 = i27;
                                                    iZzk3 = i53;
                                                    if (iZzk3 == i53) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i69 == 2) {
                                                Unsafe unsafe10 = zzb;
                                                Object objZzw = zzipVar.zzw(i95);
                                                Object object = unsafe10.getObject(obj, j2);
                                                if (!((zzig) object).zze()) {
                                                    zzig zzigVarZzb = zzig.zza().zzb();
                                                    zzih.zza(zzigVarZzb, object);
                                                    unsafe10.putObject(obj, j2, zzigVarZzb);
                                                }
                                                throw null;
                                            }
                                            i95 = i95;
                                            obj2 = obj;
                                        }
                                    }
                                } else if (i69 == 2) {
                                    zzho zzhoVarZzd2 = (zzho) unsafe6.getObject(obj16, j2);
                                    if (!zzhoVarZzd2.zzc()) {
                                        int size3 = zzhoVarZzd2.size();
                                        zzhoVarZzd2 = zzhoVarZzd2.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe6.putObject(obj16, j2, zzhoVarZzd2);
                                    }
                                    bArr8 = bArr;
                                    i57 = i3;
                                    zzfzVar13 = zzfzVar;
                                    iZzk3 = zzga.zze(zzipVar.zzv(i95), i62 == true ? 1 : 0, bArr8, i94, i3, zzhoVarZzd2, zzfzVar);
                                    obj5 = obj;
                                    unsafe4 = unsafe6;
                                    i63 = i68;
                                    i60 = i95;
                                    i59 = i13;
                                } else {
                                    i26 = i64;
                                    i27 = i94;
                                    zzfzVar7 = zzfzVar;
                                    unsafe = unsafe6;
                                    i28 = i61;
                                    i8 = i62 == true ? 1 : 0;
                                    bArr5 = bArr;
                                    i29 = i68;
                                    obj2 = obj16;
                                }
                            }
                        } else {
                            unsafe = unsafe4;
                            i10 = i68;
                            i11 = iZzi;
                            i60 = i58;
                            i12 = i60;
                            i13 = i59;
                            i8 = i62 == true ? 1 : 0;
                            i14 = 1048575;
                            i7 = i5;
                            obj2 = obj5;
                            zzfzVar2 = zzfzVar13;
                        }
                    } else {
                        if (i68 >= zzipVar.zze && i68 <= zzipVar.zzf) {
                            iZzq = zzipVar.zzq(i68, i58);
                        }
                        if (iZzq == i59) {
                        }
                    }
                }
                i7 = i5;
                unsafe = unsafe4;
                obj2 = obj5;
                i8 = i62;
                i9 = 1048575;
            }
            if (i8 == i7 && i7 != 0) {
                i57 = i3;
                iZzk3 = i11;
                i9 = i14;
            } else if (zzipVar.zzh) {
                zzgw zzgwVar = zzfzVar2.zzd;
                int i144 = zzgw.zzb;
                int i145 = zziu.zza;
                if (zzgwVar != zzgw.zza) {
                    zzim zzimVar = zzipVar.zzg;
                    int i146 = zzga.zza;
                    if (zzgwVar.zzb(zzimVar, i10) != null) {
                        throw null;
                    }
                    i57 = i3;
                    Object[] objArr = i8 == true ? 1 : 0;
                    iZzg = zzga.zzg(objArr == true ? 1 : 0, bArr, i11, i57, zzd(obj2), zzfzVar2);
                    i62 = objArr == true ? 1 : 0;
                } else {
                    i62 = i8 == true ? 1 : 0;
                    i57 = i3;
                    iZzg = zzga.zzg(i62 == true ? 1 : 0, bArr, i11, i57, zzd(obj2), zzfzVar);
                }
                iZzk3 = iZzg;
                bArr8 = bArr;
                zzfzVar13 = zzfzVar;
                i63 = i10;
                obj5 = obj2;
                i59 = i13;
                unsafe4 = unsafe;
                i58 = i12;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i2, int i3, zzfz zzfzVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zzfzVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzs = zzs(i2);
            long j2 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i2) || Double.doubleToLongBits(zzjq.zza(obj, j2)) != Double.doubleToLongBits(zzjq.zza(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i2) || Float.floatToIntBits(zzjq.zzb(obj, j2)) != Float.floatToIntBits(zzjq.zzb(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i2) || zzjq.zzd(obj, j2) != zzjq.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i2) || zzjq.zzd(obj, j2) != zzjq.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i2) || zzjq.zzc(obj, j2) != zzjq.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i2) || zzjq.zzd(obj, j2) != zzjq.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i2) || zzjq.zzc(obj, j2) != zzjq.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i2) || zzjq.zzw(obj, j2) != zzjq.zzw(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i2) || !zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i2) || !zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i2) || !zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i2) || zzjq.zzc(obj, j2) != zzjq.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i2) || zzjq.zzc(obj, j2) != zzjq.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i2) || zzjq.zzc(obj, j2) != zzjq.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i2) || zzjq.zzd(obj, j2) != zzjq.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i2) || zzjq.zzc(obj, j2) != zzjq.zzc(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i2) || zzjq.zzd(obj, j2) != zzjq.zzd(obj2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i2) || !zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzE = zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2));
                    break;
                case 50:
                    zZzE = zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i2) & 1048575;
                    if (zzjq.zzc(obj, jZzp) != zzjq.zzc(obj2, jZzp) || !zziz.zzE(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i2;
        int i3;
        int i5 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i9 = iArr[i5];
            int i10 = iArr2[i9];
            int iZzs = zzs(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i8) {
                if (i12 != 1048575) {
                    i7 = zzb.getInt(obj, i12);
                }
                i3 = i7;
                i2 = i12;
            } else {
                i2 = i8;
                i3 = i7;
            }
            Object obj2 = obj;
            if ((268435456 & iZzs) != 0 && !zzJ(obj2, i9, i2, i3, i13)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj2, i9, i2, i3, i13) && !zzK(obj2, iZzs, zzv(i9))) {
                    return false;
                }
            } else if (iZzr == 27) {
                List list = (List) zzjq.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzix zzixVarZzv = zzv(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!zzixVarZzv.zzk(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj2, i10, i9) && !zzK(obj2, iZzs, zzv(i9))) {
                    return false;
                }
            } else if (iZzr != 49) {
                if (iZzr == 50 && !((zzig) zzjq.zzf(obj2, iZzs & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i5++;
            obj = obj2;
            i8 = i2;
            i7 = i3;
        }
        return !this.zzh || ((zzhh) obj).zzb.zzh();
    }

    private final void zzC(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzM(obj2, i3, i2)) {
            int iZzs = zzs(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = iZzs;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzix zzixVarZzv = zzv(i2);
            if (!zzM(obj, i3, i2)) {
                if (zzL(object)) {
                    Object objZze = zzixVarZzv.zze();
                    zzixVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzE(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object objZze2 = zzixVarZzv.zze();
                zzixVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzixVarZzv.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzD(obj, i2);
    }

    private final void zzG(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzs(i3) & 1048575, obj2);
        zzE(obj, i2, i3);
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhk) {
            return ((zzhk) obj).zzA();
        }
        return true;
    }

    private static final void zzO(int i2, Object obj, zzjw zzjwVar) throws IOException {
        if (obj instanceof String) {
            zzjwVar.zzG(i2, (String) obj);
        } else {
            zzjwVar.zzd(i2, (zzgk) obj);
        }
    }

    static zzjk zzd(Object obj) {
        zzhk zzhkVar = (zzhk) obj;
        zzjk zzjkVar = zzhkVar.zzc;
        if (zzjkVar != zzjk.zzc()) {
            return zzjkVar;
        }
        zzjk zzjkVarZzf = zzjk.zzf();
        zzhkVar.zzc = zzjkVarZzf;
        return zzjkVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzip zzl(Class cls, zzij zzijVar, zzir zzirVar, zzhz zzhzVar, zzjj zzjjVar, zzgx zzgxVar, zzih zzihVar) {
        int i2;
        int iCharAt;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        char cCharAt;
        int i12;
        char cCharAt2;
        int i13;
        char cCharAt3;
        int i14;
        char cCharAt4;
        int i15;
        char cCharAt5;
        int i16;
        char cCharAt6;
        int i17;
        char cCharAt7;
        int i18;
        char cCharAt8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String str;
        int iObjectFieldOffset;
        char c2;
        int iObjectFieldOffset2;
        int i24;
        int i25;
        int i26;
        Field fieldZzz;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZzz2;
        Object obj2;
        Field fieldZzz3;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        if (!(zzijVar instanceof zziw)) {
            throw null;
        }
        zziw zziwVar = (zziw) zzijVar;
        String strZzd = zziwVar.zzd();
        int length = strZzd.length();
        char c4 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i2 = i36 + 1;
                if (strZzd.charAt(i36) < 55296) {
                    break;
                }
                i36 = i2;
            }
        } else {
            i2 = 1;
        }
        int i37 = i2 + 1;
        int iCharAt2 = strZzd.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i38 = iCharAt2 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt13 = strZzd.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt2 = i38 | (cCharAt13 << i39);
            i37 = i35;
        }
        if (iCharAt2 == 0) {
            i5 = 0;
            i9 = 0;
            iCharAt = 0;
            i3 = 0;
            i7 = 0;
            i8 = 0;
            iArr = zza;
            i10 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt3 = strZzd.charAt(i37);
            if (iCharAt3 >= 55296) {
                int i41 = iCharAt3 & 8191;
                int i42 = 13;
                while (true) {
                    i18 = i40 + 1;
                    cCharAt8 = strZzd.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i18;
                }
                iCharAt3 = i41 | (cCharAt8 << i42);
                i40 = i18;
            }
            int i43 = i40 + 1;
            int iCharAt4 = strZzd.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i17 = i43 + 1;
                    cCharAt7 = strZzd.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i17;
                }
                iCharAt4 = i44 | (cCharAt7 << i45);
                i43 = i17;
            }
            int i46 = i43 + 1;
            int iCharAt5 = strZzd.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i16 = i46 + 1;
                    cCharAt6 = strZzd.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i16;
                }
                iCharAt5 = i47 | (cCharAt6 << i48);
                i46 = i16;
            }
            int i49 = i46 + 1;
            int iCharAt6 = strZzd.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i15 = i49 + 1;
                    cCharAt5 = strZzd.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i15;
                }
                iCharAt6 = i50 | (cCharAt5 << i51);
                i49 = i15;
            }
            int i52 = i49 + 1;
            iCharAt = strZzd.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i14 = i52 + 1;
                    cCharAt4 = strZzd.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i14;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i14;
            }
            int i55 = i52 + 1;
            int iCharAt7 = strZzd.charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i13 = i55 + 1;
                    cCharAt3 = strZzd.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i13;
                }
                iCharAt7 = i56 | (cCharAt3 << i57);
                i55 = i13;
            }
            int i58 = i55 + 1;
            int iCharAt8 = strZzd.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i12 = i58 + 1;
                    cCharAt2 = strZzd.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i12;
                }
                iCharAt8 = i59 | (cCharAt2 << i60);
                i58 = i12;
            }
            int i61 = i58 + 1;
            int iCharAt9 = strZzd.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i11 = i61 + 1;
                    cCharAt = strZzd.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i11;
                }
                iCharAt9 = i62 | (cCharAt << i63);
                i61 = i11;
            }
            int i64 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i65 = iCharAt7;
            i3 = iCharAt5;
            i5 = i65;
            i7 = iCharAt6;
            i8 = iCharAt9;
            i9 = i64;
            iArr = iArr2;
            i10 = iCharAt3;
            i37 = i61;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zziwVar.zze();
        Class<?> cls2 = zziwVar.zza().getClass();
        int i66 = i8 + i5;
        int i67 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i67];
        int i68 = i8;
        int i69 = i66;
        int i70 = 0;
        int i71 = 0;
        while (i37 < length) {
            int i72 = i37 + 1;
            int iCharAt10 = strZzd.charAt(i37);
            if (iCharAt10 >= c4) {
                int i73 = iCharAt10 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i34 = i74 + 1;
                    cCharAt12 = strZzd.charAt(i74);
                    if (cCharAt12 < c4) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i34;
                }
                iCharAt10 = i73 | (cCharAt12 << i75);
                i19 = i34;
            } else {
                i19 = i72;
            }
            int i76 = i19 + 1;
            int iCharAt11 = strZzd.charAt(i19);
            if (iCharAt11 >= c4) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i33 = i78 + 1;
                    cCharAt11 = strZzd.charAt(i78);
                    if (cCharAt11 < c4) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i33;
                }
                iCharAt11 = i77 | (cCharAt11 << i79);
                i20 = i33;
            } else {
                i20 = i76;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int i80 = iCharAt11 & 255;
            zziw zziwVar2 = zziwVar;
            int i81 = iCharAt11 & 2048;
            if (i80 >= 51) {
                int i82 = i20 + 1;
                int iCharAt12 = strZzd.charAt(i20);
                char c5 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i32 = i84 + 1;
                        cCharAt10 = strZzd.charAt(i84);
                        if (cCharAt10 < c5) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i84 = i32;
                        c5 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i85);
                    i29 = i32;
                } else {
                    i29 = i82;
                }
                int i86 = i29;
                int i87 = i80 - 51;
                i21 = length;
                if (i87 == 9 || i87 == 17) {
                    i30 = i9 + 1;
                    int i88 = i71 / 3;
                    objArr[i88 + i88 + 1] = objArrZze[i9];
                } else {
                    if (i87 != 12) {
                        i31 = i81;
                    } else if (zziwVar2.zzc() == 1 || i81 != 0) {
                        i30 = i9 + 1;
                        int i89 = i71 / 3;
                        objArr[i89 + i89 + 1] = objArrZze[i9];
                    } else {
                        i31 = 0;
                    }
                    int i90 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i90];
                    int i91 = i31;
                    if (obj instanceof Field) {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i90] = fieldZzz2;
                    } else {
                        fieldZzz2 = (Field) obj;
                    }
                    int i92 = i10;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                    int i93 = i90 + 1;
                    obj2 = objArrZze[i93];
                    i22 = i92;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i93] = fieldZzz3;
                    } else {
                        fieldZzz3 = (Field) obj2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                    str = strZzd;
                    i25 = i91;
                    i20 = i86;
                    i24 = 0;
                    c2 = 55296;
                }
                i9 = i30;
                i31 = i81;
                int i902 = iCharAt12 + iCharAt12;
                obj = objArrZze[i902];
                int i912 = i31;
                if (obj instanceof Field) {
                }
                int i922 = i10;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz2);
                int i932 = i902 + 1;
                obj2 = objArrZze[i932];
                i22 = i922;
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                str = strZzd;
                i25 = i912;
                i20 = i86;
                i24 = 0;
                c2 = 55296;
            } else {
                i21 = length;
                i22 = i10;
                int i94 = i9 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i9]);
                if (i80 == 9 || i80 == 17) {
                    i23 = i94;
                    int i95 = i71 / 3;
                    objArr[i95 + i95 + 1] = fieldZzz4.getType();
                } else {
                    if (i80 == 27) {
                        i27 = i94;
                        i28 = 1;
                        i9 += 2;
                    } else if (i80 == 49) {
                        i9 += 2;
                        i27 = i94;
                        i28 = 1;
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        if (zziwVar2.zzc() == 1 || i81 != 0) {
                            i9 += 2;
                            int i96 = i71 / 3;
                            objArr[i96 + i96 + 1] = objArrZze[i94];
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0 || i80 > 17) {
                                c2 = 55296;
                                iObjectFieldOffset2 = 1048575;
                                i24 = 0;
                            } else {
                                int i97 = i20 + 1;
                                int iCharAt13 = str.charAt(i20);
                                if (iCharAt13 >= 55296) {
                                    int i98 = iCharAt13 & 8191;
                                    int i99 = 13;
                                    while (true) {
                                        i26 = i97 + 1;
                                        cCharAt9 = str.charAt(i97);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i98 |= (cCharAt9 & 8191) << i99;
                                        i99 += 13;
                                        i97 = i26;
                                    }
                                    iCharAt13 = i98 | (cCharAt9 << i99);
                                } else {
                                    i26 = i97;
                                }
                                int i100 = i22 + i22 + (iCharAt13 / 32);
                                Object obj3 = objArrZze[i100];
                                if (obj3 instanceof Field) {
                                    fieldZzz = (Field) obj3;
                                } else {
                                    fieldZzz = zzz(cls2, (String) obj3);
                                    objArrZze[i100] = fieldZzz;
                                }
                                int i101 = iCharAt13;
                                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz);
                                i24 = i101 % 32;
                                i20 = i26;
                                c2 = 55296;
                                iObjectFieldOffset2 = iObjectFieldOffset3;
                            }
                            if (i80 >= 18 && i80 <= 49) {
                                iArr[i69] = iObjectFieldOffset;
                                i69++;
                            }
                            i25 = i81;
                        } else {
                            str = strZzd;
                            i9 = i94;
                            i81 = 0;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0) {
                                c2 = 55296;
                                iObjectFieldOffset2 = 1048575;
                                i24 = 0;
                                if (i80 >= 18) {
                                    iArr[i69] = iObjectFieldOffset;
                                    i69++;
                                }
                                i25 = i81;
                            }
                        }
                    } else if (i80 == 50) {
                        int i102 = i9 + 2;
                        int i103 = i68 + 1;
                        iArr[i68] = i71;
                        int i104 = i71 / 3;
                        int i105 = i104 + i104;
                        objArr[i105] = objArrZze[i94];
                        if (i81 != 0) {
                            objArr[i105 + 1] = objArrZze[i102];
                            i9 += 3;
                            str = strZzd;
                            i68 = i103;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        } else {
                            i9 = i102;
                            i68 = i103;
                            i81 = 0;
                            str = strZzd;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                            if ((iCharAt11 & 4096) != 0) {
                            }
                        }
                    } else {
                        i23 = i94;
                    }
                    int i106 = i71 / 3;
                    objArr[i106 + i106 + i28] = objArrZze[i27];
                    str = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                    if ((iCharAt11 & 4096) != 0) {
                    }
                }
                str = strZzd;
                i9 = i23;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                if ((iCharAt11 & 4096) != 0) {
                }
            }
            int i107 = i71 + 1;
            iArr3[i71] = iCharAt10;
            int i108 = i71 + 2;
            iArr3[i107] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i25 != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | iObjectFieldOffset;
            i71 += 3;
            iArr3[i108] = (i24 << 20) | iObjectFieldOffset2;
            i37 = i20;
            strZzd = str;
            c4 = c2;
            zziwVar = zziwVar2;
            length = i21;
            i10 = i22;
        }
        return new zzip(iArr3, objArr, i3, i7, zziwVar.zza(), false, iArr, i8, i66, zzirVar, zzhzVar, zzjjVar, zzgxVar, zzihVar);
    }

    private final int zzp(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzq(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i5 = (length + i3) >>> 1;
            int i7 = i5 * 3;
            int i8 = this.zzc[i7];
            if (i2 == i8) {
                return i7;
            }
            if (i2 < i8) {
                length = i5 - 1;
            } else {
                i3 = i5 + 1;
            }
        }
        return -1;
    }

    private final int zzs(int i2) {
        return this.zzc[i2 + 1];
    }

    private final zzhm zzu(int i2) {
        int i3 = i2 / 3;
        return (zzhm) this.zzd[i3 + i3 + 1];
    }

    private final zzix zzv(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i5 = i3 + i3;
        zzix zzixVar = (zzix) objArr[i5];
        if (zzixVar != null) {
            return zzixVar;
        }
        zzix zzixVarZzb = zziu.zza().zzb((Class) objArr[i5 + 1]);
        this.zzd[i5] = zzixVarZzb;
        return zzixVarZzb;
    }

    private final Object zzw(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x04bb A[PHI: r17
      0x04bb: PHI (r17v34 int) = (r17v27 int), (r17v35 int) binds: [B:214:0x0595, B:180:0x04b9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i2;
        int i3;
        int iZzz;
        int iZzz2;
        int iZzA;
        int iZzz3;
        int iZzz4;
        int iZzz5;
        int iZzd;
        int iZzz6;
        int iZzh;
        int size;
        int iZzl;
        int iZzz7;
        int iZzg;
        int iZzz8;
        int iZzz9;
        int iZze;
        int iZzz10;
        int iZzz11;
        int iZzw;
        int iZzz12;
        int iZzz13;
        int iZzz14;
        int iZzA2;
        int iZzz15;
        int iZzz16;
        int iZzd2;
        int iZzz17;
        zzip<T> zzipVar = this;
        Object obj2 = obj;
        int i5 = 1;
        Unsafe unsafe = zzb;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int iZzz18 = 0;
        int i10 = 1048575;
        while (i8 < zzipVar.zzc.length) {
            int iZzs = zzipVar.zzs(i8);
            int iZzr = zzr(iZzs);
            int[] iArr = zzipVar.zzc;
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & i7;
            if (iZzr <= 17) {
                if (i13 != i10) {
                    i9 = i13 == i7 ? 0 : unsafe.getInt(obj2, i13);
                    i10 = i13;
                }
                i2 = i5 << (i12 >>> 20);
            } else {
                i2 = 0;
            }
            int i14 = iZzs & i7;
            if (iZzr >= zzhc.zzJ.zza()) {
                zzhc.zzW.zza();
            }
            int i15 = iZzz18;
            long j2 = i14;
            switch (iZzr) {
                case 0:
                    i3 = i5;
                    iZzz18 = zzipVar.zzJ(obj2, i8, i10, i9, i2) ? i15 + zzgr.zzz(i11 << 3) + 8 : i15;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 1:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzz = zzgr.zzz(i11 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 2:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        long j3 = unsafe.getLong(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzA(j3);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 3:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        long j4 = unsafe.getLong(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzA(j4);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 4:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        long j5 = unsafe.getInt(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzA(j5);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 5:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzz3 = zzgr.zzz(i11 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 6:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzz = zzgr.zzz(i11 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 7:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzz4 = zzgr.zzz(i11 << 3) + 1;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 8:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        int i16 = i11 << 3;
                        Object object = unsafe.getObject(obj2, j2);
                        if (object instanceof zzgk) {
                            iZzz5 = zzgr.zzz(i16);
                            iZzd = ((zzgk) object).zzd();
                            iZzz6 = zzgr.zzz(iZzd);
                            iZzz4 = iZzz5 + iZzz6 + iZzd;
                            iZzz18 = i15 + iZzz4;
                            zzipVar = this;
                            i8 += 3;
                            obj2 = obj;
                            i5 = i3;
                            i7 = 1048575;
                        } else {
                            iZzz2 = zzgr.zzz(i16);
                            iZzA = zzgr.zzy((String) object);
                            iZzz4 = iZzz2 + iZzA;
                            iZzz18 = i15 + iZzz4;
                            zzipVar = this;
                            i8 += 3;
                            obj2 = obj;
                            i5 = i3;
                            i7 = 1048575;
                        }
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 9:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzh = zziz.zzh(i11, unsafe.getObject(obj2, j2), zzipVar.zzv(i8));
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 10:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(obj2, j2);
                        iZzz5 = zzgr.zzz(i11 << 3);
                        iZzd = zzgkVar.zzd();
                        iZzz6 = zzgr.zzz(iZzd);
                        iZzz4 = iZzz5 + iZzz6 + iZzd;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 11:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        int i17 = unsafe.getInt(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzz(i17);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 12:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        long j6 = unsafe.getInt(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzA(j6);
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 13:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzz = zzgr.zzz(i11 << 3);
                        iZzz4 = iZzz + 4;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 14:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzz3 = zzgr.zzz(i11 << 3);
                        iZzz4 = iZzz3 + 8;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 15:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        int i18 = unsafe.getInt(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzz((i18 >> 31) ^ (i18 + i18));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 16:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        long j7 = unsafe.getLong(obj2, j2);
                        iZzz2 = zzgr.zzz(i11 << 3);
                        iZzA = zzgr.zzA((j7 >> 63) ^ (j7 + j7));
                        iZzz4 = iZzz2 + iZzA;
                        iZzz18 = i15 + iZzz4;
                        zzipVar = this;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    zzipVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 17:
                    i3 = i5;
                    if (zzipVar.zzJ(obj2, i8, i10, i9, i2)) {
                        iZzh = zzgr.zzw(i11, (zzim) unsafe.getObject(obj2, j2), zzipVar.zzv(i8));
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 18:
                    i3 = i5;
                    iZzh = zziz.zzd(i11, (List) unsafe.getObject(obj2, j2), false);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 19:
                    i3 = i5;
                    iZzh = zziz.zzb(i11, (List) unsafe.getObject(obj2, j2), false);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 20:
                    i3 = i5;
                    List list = (List) unsafe.getObject(obj2, j2);
                    int i19 = zziz.zza;
                    iZzg = list.size() == 0 ? 0 : zziz.zzg(list) + (list.size() * zzgr.zzz(i11 << 3));
                    iZzz18 = i15 + iZzg;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 21:
                    i3 = i5;
                    List list2 = (List) unsafe.getObject(obj2, j2);
                    int i20 = zziz.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzl = zziz.zzl(list2);
                        iZzz7 = zzgr.zzz(i11 << 3);
                        iZzh = iZzl + (size * iZzz7);
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 22:
                    i3 = i5;
                    List list3 = (List) unsafe.getObject(obj2, j2);
                    int i21 = zziz.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzl = zziz.zzf(list3);
                        iZzz7 = zzgr.zzz(i11 << 3);
                        iZzh = iZzl + (size * iZzz7);
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 23:
                    i3 = i5;
                    iZzh = zziz.zzd(i11, (List) unsafe.getObject(obj2, j2), false);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 24:
                    i3 = i5;
                    iZzh = zziz.zzb(i11, (List) unsafe.getObject(obj2, j2), false);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 25:
                    i3 = i5;
                    List list4 = (List) unsafe.getObject(obj2, j2);
                    int i22 = zziz.zza;
                    int size2 = list4.size();
                    iZzh = size2 == 0 ? 0 : size2 * (zzgr.zzz(i11 << 3) + 1);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 26:
                    i3 = i5;
                    List list5 = (List) unsafe.getObject(obj2, j2);
                    int i23 = zziz.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        iZzg = zzgr.zzz(i11 << 3) * size3;
                        if (list5 instanceof zzhy) {
                            zzhy zzhyVar = (zzhy) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object objZzc = zzhyVar.zzc();
                                if (objZzc instanceof zzgk) {
                                    int iZzd3 = ((zzgk) objZzc).zzd();
                                    iZzg += zzgr.zzz(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzgr.zzy((String) objZzc);
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size3; i25++) {
                                Object obj3 = list5.get(i25);
                                if (obj3 instanceof zzgk) {
                                    int iZzd4 = ((zzgk) obj3).zzd();
                                    iZzg += zzgr.zzz(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzgr.zzy((String) obj3);
                                }
                            }
                        }
                    }
                    iZzz18 = i15 + iZzg;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 27:
                    i3 = i5;
                    List list6 = (List) unsafe.getObject(obj2, j2);
                    zzix zzixVarZzv = zzipVar.zzv(i8);
                    int i26 = zziz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz8 = 0;
                    } else {
                        iZzz8 = zzgr.zzz(i11 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            Object obj4 = list6.get(i27);
                            if (obj4 instanceof zzhx) {
                                int iZza = ((zzhx) obj4).zza();
                                iZzz8 += zzgr.zzz(iZza) + iZza;
                            } else {
                                iZzz8 += zzgr.zzx((zzim) obj4, zzixVarZzv);
                            }
                        }
                    }
                    iZzz18 = iZzz8 + i15;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 28:
                    i3 = i5;
                    List list7 = (List) unsafe.getObject(obj2, j2);
                    int i28 = zziz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz9 = 0;
                    } else {
                        iZzz9 = size5 * zzgr.zzz(i11 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int iZzd5 = ((zzgk) list7.get(i29)).zzd();
                            iZzz9 += zzgr.zzz(iZzd5) + iZzd5;
                        }
                    }
                    iZzz18 = i15 + iZzz9;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 29:
                    i3 = i5;
                    List list8 = (List) unsafe.getObject(obj2, j2);
                    int i30 = zziz.zza;
                    size = list8.size();
                    if (size != 0) {
                        iZzl = zziz.zzk(list8);
                        iZzz7 = zzgr.zzz(i11 << 3);
                        iZzh = iZzl + (size * iZzz7);
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 30:
                    i3 = i5;
                    List list9 = (List) unsafe.getObject(obj2, j2);
                    int i31 = zziz.zza;
                    size = list9.size();
                    if (size != 0) {
                        iZzl = zziz.zza(list9);
                        iZzz7 = zzgr.zzz(i11 << 3);
                        iZzh = iZzl + (size * iZzz7);
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 31:
                    i3 = i5;
                    iZzh = zziz.zzb(i11, (List) unsafe.getObject(obj2, j2), false);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 32:
                    i3 = i5;
                    iZzh = zziz.zzd(i11, (List) unsafe.getObject(obj2, j2), false);
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 33:
                    i3 = i5;
                    List list10 = (List) unsafe.getObject(obj2, j2);
                    int i32 = zziz.zza;
                    size = list10.size();
                    if (size != 0) {
                        iZzl = zziz.zzi(list10);
                        iZzz7 = zzgr.zzz(i11 << 3);
                        iZzh = iZzl + (size * iZzz7);
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 34:
                    i3 = i5;
                    List list11 = (List) unsafe.getObject(obj2, j2);
                    int i33 = zziz.zza;
                    size = list11.size();
                    if (size != 0) {
                        iZzl = zziz.zzj(list11);
                        iZzz7 = zzgr.zzz(i11 << 3);
                        iZzh = iZzl + (size * iZzz7);
                        iZzz18 = i15 + iZzh;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    iZzz18 = i15 + iZzh;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 35:
                    i3 = i5;
                    iZze = zziz.zze((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 36:
                    i3 = i5;
                    iZze = zziz.zzc((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 37:
                    i3 = i5;
                    iZze = zziz.zzg((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 38:
                    i3 = i5;
                    iZze = zziz.zzl((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 39:
                    i3 = i5;
                    iZze = zziz.zzf((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 40:
                    i3 = i5;
                    iZze = zziz.zze((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 41:
                    i3 = i5;
                    iZze = zziz.zzc((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 42:
                    i3 = i5;
                    List list12 = (List) unsafe.getObject(obj2, j2);
                    int i34 = zziz.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 43:
                    i3 = i5;
                    iZze = zziz.zzk((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 44:
                    i3 = i5;
                    iZze = zziz.zza((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 45:
                    i3 = i5;
                    iZze = zziz.zzc((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 46:
                    i3 = i5;
                    iZze = zziz.zze((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 47:
                    i3 = i5;
                    iZze = zziz.zzi((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 48:
                    i3 = i5;
                    iZze = zziz.zzj((List) unsafe.getObject(obj2, j2));
                    if (iZze > 0) {
                        iZzz10 = zzgr.zzz(i11 << 3);
                        iZzz11 = zzgr.zzz(iZze);
                        iZzz9 = iZzz10 + iZzz11 + iZze;
                        iZzz18 = i15 + iZzz9;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j2);
                    zzix zzixVarZzv2 = zzipVar.zzv(i8);
                    int i35 = zziz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzw = 0;
                    } else {
                        int i36 = 0;
                        iZzw = 0;
                        while (i36 < size6) {
                            iZzw += zzgr.zzw(i11, (zzim) list13.get(i36), zzixVarZzv2);
                            i36++;
                            i5 = i5;
                        }
                    }
                    i3 = i5;
                    iZzz18 = i15 + iZzw;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 50:
                    zzig zzigVar = (zzig) unsafe.getObject(obj2, j2);
                    if (zzigVar.isEmpty()) {
                        i3 = i5;
                    } else {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        i3 = i5;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
                case 51:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz12 = zzgr.zzz(i11 << 3);
                        iZzz15 = iZzz12 + 8;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 52:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz13 = zzgr.zzz(i11 << 3);
                        iZzz15 = iZzz13 + 4;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 53:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        long jZzt = zzt(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzA(jZzt);
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 54:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        long jZzt2 = zzt(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzA(jZzt2);
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 55:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        long jZzo = zzo(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzA(jZzo);
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 56:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz12 = zzgr.zzz(i11 << 3);
                        iZzz15 = iZzz12 + 8;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 57:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz13 = zzgr.zzz(i11 << 3);
                        iZzz15 = iZzz13 + 4;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 58:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz15 = zzgr.zzz(i11 << 3) + i5;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 59:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        int i37 = i11 << 3;
                        Object object2 = unsafe.getObject(obj2, j2);
                        if (object2 instanceof zzgk) {
                            iZzz16 = zzgr.zzz(i37);
                            iZzd2 = ((zzgk) object2).zzd();
                            iZzz17 = zzgr.zzz(iZzd2);
                            iZzz15 = iZzz16 + iZzz17 + iZzd2;
                            iZzz18 = i15 + iZzz15;
                            i3 = i5;
                            i8 += 3;
                            obj2 = obj;
                            i5 = i3;
                            i7 = 1048575;
                        } else {
                            iZzz14 = zzgr.zzz(i37);
                            iZzA2 = zzgr.zzy((String) object2);
                            iZzz15 = iZzz14 + iZzA2;
                            iZzz18 = i15 + iZzz15;
                            i3 = i5;
                            i8 += 3;
                            obj2 = obj;
                            i5 = i3;
                            i7 = 1048575;
                        }
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 60:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz15 = zziz.zzh(i11, unsafe.getObject(obj2, j2), zzipVar.zzv(i8));
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 61:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(obj2, j2);
                        iZzz16 = zzgr.zzz(i11 << 3);
                        iZzd2 = zzgkVar2.zzd();
                        iZzz17 = zzgr.zzz(iZzd2);
                        iZzz15 = iZzz16 + iZzz17 + iZzd2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 62:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        int iZzo = zzo(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzz(iZzo);
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 63:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        long jZzo2 = zzo(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzA(jZzo2);
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 64:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz13 = zzgr.zzz(i11 << 3);
                        iZzz15 = iZzz13 + 4;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 65:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz12 = zzgr.zzz(i11 << 3);
                        iZzz15 = iZzz12 + 8;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 66:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        int iZzo2 = zzo(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzz((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 67:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        long jZzt3 = zzt(obj2, j2);
                        iZzz14 = zzgr.zzz(i11 << 3);
                        iZzA2 = zzgr.zzA((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZzz15 = iZzz14 + iZzA2;
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                case 68:
                    if (zzipVar.zzM(obj2, i11, i8)) {
                        iZzz15 = zzgr.zzw(i11, (zzim) unsafe.getObject(obj2, j2), zzipVar.zzv(i8));
                        iZzz18 = i15 + iZzz15;
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    } else {
                        i3 = i5;
                        i8 += 3;
                        obj2 = obj;
                        i5 = i3;
                        i7 = 1048575;
                    }
                    break;
                default:
                    i3 = i5;
                    i8 += 3;
                    obj2 = obj;
                    i5 = i3;
                    i7 = 1048575;
                    break;
            }
        }
        int iZza2 = iZzz18 + ((zzhk) obj).zzc.zza();
        if (!zzipVar.zzh) {
            return iZza2;
        }
        zzhb zzhbVar = ((zzhh) obj).zzb;
        int iZzc = zzhbVar.zza.zzc();
        int iZzb = 0;
        for (int i38 = 0; i38 < iZzc; i38++) {
            Map.Entry entryZzg = zzhbVar.zza.zzg(i38);
            iZzb += zzhb.zzb((zzha) ((zzjb) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzhbVar.zza.zzd()) {
            iZzb += zzhb.zzb((zzha) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        return ((zzhk) this.zzg).zzp();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
        Map.Entry entry;
        int i2;
        int i3;
        zzip<T> zzipVar = this;
        if (zzipVar.zzh) {
            zzhb zzhbVar = ((zzhh) obj).zzb;
            entry = !zzhbVar.zza.isEmpty() ? (Map.Entry) zzhbVar.zze().next() : null;
        }
        int[] iArr = zzipVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < iArr.length) {
            int iZzs = zzipVar.zzs(i8);
            int[] iArr2 = zzipVar.zzc;
            int iZzr = zzr(iZzs);
            int i10 = iArr2[i8];
            if (iZzr <= 17) {
                int i11 = iArr2[i8 + 2];
                int i12 = i11 & i5;
                if (i12 != i7) {
                    i9 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                int i13 = 1 << (i11 >>> 20);
                i2 = iZzs;
                i3 = i13;
            } else {
                i2 = iZzs;
                i3 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j2 = i2 & i5;
            switch (iZzr) {
                case 0:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzf(i10, zzjq.zza(obj, j2));
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 1:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzo(i10, zzjq.zzb(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 2:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzt(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 3:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzK(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 4:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzr(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 5:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzm(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 6:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzk(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 7:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzb(i10, zzjq.zzw(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 8:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzO(i10, unsafe.getObject(obj, j2), zzjwVar);
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 9:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzv(i10, unsafe.getObject(obj, j2), zzipVar.zzv(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 10:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzd(i10, (zzgk) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 11:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzI(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 12:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzi(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 13:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzx(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 14:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzz(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 15:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzB(i10, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 16:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzD(i10, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 17:
                    if (zzipVar.zzJ(obj, i8, i7, i9, i3)) {
                        zzjwVar.zzq(i10, unsafe.getObject(obj, j2), zzipVar.zzv(i8));
                    } else {
                        continue;
                    }
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 18:
                    zziz.zzr(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 19:
                    zziz.zzv(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 20:
                    zziz.zzx(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 21:
                    zziz.zzD(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 22:
                    zziz.zzw(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 23:
                    zziz.zzu(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 24:
                    zziz.zzt(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 25:
                    zziz.zzq(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 26:
                    int i14 = zzipVar.zzc[i8];
                    List list = (List) unsafe.getObject(obj, j2);
                    int i15 = zziz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzjwVar.zzH(i14, list);
                    }
                    break;
                case 27:
                    int i16 = zzipVar.zzc[i8];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    zzix zzixVarZzv = zzipVar.zzv(i8);
                    int i17 = zziz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            ((zzgs) zzjwVar).zzv(i16, list2.get(i18), zzixVarZzv);
                        }
                    }
                    break;
                case 28:
                    int i19 = zzipVar.zzc[i8];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    int i20 = zziz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzjwVar.zze(i19, list3);
                    }
                    break;
                case 29:
                    zziz.zzC(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 30:
                    zziz.zzs(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 31:
                    zziz.zzy(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 32:
                    zziz.zzz(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 33:
                    zziz.zzA(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 34:
                    zziz.zzB(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, false);
                    continue;
                    i8 += 3;
                    i5 = 1048575;
                    zzipVar = this;
                    break;
                case 35:
                    zziz.zzr(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 36:
                    zziz.zzv(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 37:
                    zziz.zzx(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 38:
                    zziz.zzD(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 39:
                    zziz.zzw(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 40:
                    zziz.zzu(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 41:
                    zziz.zzt(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 42:
                    zziz.zzq(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 43:
                    zziz.zzC(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 44:
                    zziz.zzs(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 45:
                    zziz.zzy(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 46:
                    zziz.zzz(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 47:
                    zziz.zzA(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 48:
                    zziz.zzB(zzipVar.zzc[i8], (List) unsafe.getObject(obj, j2), zzjwVar, true);
                    break;
                case 49:
                    int i21 = zzipVar.zzc[i8];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    zzix zzixVarZzv2 = zzipVar.zzv(i8);
                    int i22 = zziz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            ((zzgs) zzjwVar).zzq(i21, list4.get(i23), zzixVarZzv2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzf(i10, zzm(obj, j2));
                    }
                    break;
                case 52:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzo(i10, zzn(obj, j2));
                    }
                    break;
                case 53:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzt(i10, zzt(obj, j2));
                    }
                    break;
                case 54:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzK(i10, zzt(obj, j2));
                    }
                    break;
                case 55:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzr(i10, zzo(obj, j2));
                    }
                    break;
                case 56:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzm(i10, zzt(obj, j2));
                    }
                    break;
                case 57:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzk(i10, zzo(obj, j2));
                    }
                    break;
                case 58:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzb(i10, zzN(obj, j2));
                    }
                    break;
                case 59:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzO(i10, unsafe.getObject(obj, j2), zzjwVar);
                    }
                    break;
                case 60:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzv(i10, unsafe.getObject(obj, j2), zzipVar.zzv(i8));
                    }
                    break;
                case 61:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzd(i10, (zzgk) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzI(i10, zzo(obj, j2));
                    }
                    break;
                case 63:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzi(i10, zzo(obj, j2));
                    }
                    break;
                case 64:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzx(i10, zzo(obj, j2));
                    }
                    break;
                case 65:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzz(i10, zzt(obj, j2));
                    }
                    break;
                case 66:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzB(i10, zzo(obj, j2));
                    }
                    break;
                case 67:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzD(i10, zzt(obj, j2));
                    }
                    break;
                case 68:
                    if (zzipVar.zzM(obj, i10, i8)) {
                        zzjwVar.zzq(i10, unsafe.getObject(obj, j2), zzipVar.zzv(i8));
                    }
                    break;
            }
            i8 += 3;
            i5 = 1048575;
            zzipVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzhk) obj).zzc.zzl(zzjwVar);
    }

    private static void zzA(Object obj) {
        if (zzL(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i2) {
        if (!zzI(obj2, i2)) {
            return;
        }
        int iZzs = zzs(i2) & 1048575;
        Unsafe unsafe = zzb;
        long j2 = iZzs;
        Object object = unsafe.getObject(obj2, j2);
        if (object != null) {
            zzix zzixVarZzv = zzv(i2);
            if (!zzI(obj, i2)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, j2, object);
                } else {
                    Object objZze = zzixVarZzv.zze();
                    zzixVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j2, objZze);
                }
                zzD(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object objZze2 = zzixVarZzv.zze();
                zzixVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j2, objZze2);
                object2 = objZze2;
            }
            zzixVarZzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
    }

    private final void zzD(Object obj, int i2) {
        int iZzp = zzp(i2);
        long j2 = 1048575 & iZzp;
        if (j2 == 1048575) {
            return;
        }
        zzjq.zzq(obj, j2, (1 << (iZzp >>> 20)) | zzjq.zzc(obj, j2));
    }

    private final void zzE(Object obj, int i2, int i3) {
        zzjq.zzq(obj, zzp(i3) & 1048575, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i2) {
        if (zzI(obj, i2) == zzI(obj2, i2)) {
            return true;
        }
        return false;
    }

    private final boolean zzI(Object obj, int i2) {
        int iZzp = zzp(i2);
        long j2 = iZzp & 1048575;
        if (j2 == 1048575) {
            int iZzs = zzs(i2);
            long j3 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzjq.zza(obj, j3)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzjq.zzb(obj, j3)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzjq.zzd(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzjq.zzd(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzjq.zzc(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzjq.zzd(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzjq.zzc(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzjq.zzw(obj, j3);
                case 8:
                    Object objZzf = zzjq.zzf(obj, j3);
                    if (objZzf instanceof String) {
                        if (((String) objZzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objZzf instanceof zzgk) {
                        if (zzgk.zzb.equals(objZzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzjq.zzf(obj, j3) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgk.zzb.equals(zzjq.zzf(obj, j3))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzjq.zzc(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzjq.zzc(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzjq.zzc(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzjq.zzd(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzjq.zzc(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzjq.zzd(obj, j3) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzjq.zzf(obj, j3) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzjq.zzc(obj, j2) & (1 << (iZzp >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzJ(Object obj, int i2, int i3, int i5, int i7) {
        if (i3 == 1048575) {
            return zzI(obj, i2);
        }
        if ((i5 & i7) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzK(Object obj, int i2, zzix zzixVar) {
        return zzixVar.zzk(zzjq.zzf(obj, i2 & 1048575));
    }

    private final boolean zzM(Object obj, int i2, int i3) {
        if (zzjq.zzc(obj, zzp(i3) & 1048575) == i2) {
            return true;
        }
        return false;
    }

    private static boolean zzN(Object obj, long j2) {
        return ((Boolean) zzjq.zzf(obj, j2)).booleanValue();
    }

    private static double zzm(Object obj, long j2) {
        return ((Double) zzjq.zzf(obj, j2)).doubleValue();
    }

    private static float zzn(Object obj, long j2) {
        return ((Float) zzjq.zzf(obj, j2)).floatValue();
    }

    private static int zzo(Object obj, long j2) {
        return ((Integer) zzjq.zzf(obj, j2)).intValue();
    }

    private static long zzt(Object obj, long j2) {
        return ((Long) zzjq.zzf(obj, j2)).longValue();
    }

    private final Object zzx(Object obj, int i2) {
        zzix zzixVarZzv = zzv(i2);
        int iZzs = zzs(i2) & 1048575;
        if (!zzI(obj, i2)) {
            return zzixVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzixVarZzv.zze();
        if (object != null) {
            zzixVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i2, int i3) {
        zzix zzixVarZzv = zzv(i3);
        if (!zzM(obj, i2, i3)) {
            return zzixVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i3) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzixVarZzv.zze();
        if (object != null) {
            zzixVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.play_billing.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzhk) {
                zzhk zzhkVar = (zzhk) obj;
                zzhkVar.zzy(Integer.MAX_VALUE);
                zzhkVar.zza = 0;
                zzhkVar.zzw();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int iZzs = zzs(i2);
                int i3 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j2 = i3;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzho) zzjq.zzf(obj, j2)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzig) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i2], i2)) {
                        zzv(i2).zzf(zzb.getObject(obj, j2));
                    }
                } else if (zzI(obj, i2)) {
                    zzv(i2).zzf(zzb.getObject(obj, j2));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzs = zzs(i2);
            int i3 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i5 = iArr[i2];
            long j2 = i3;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i2)) {
                        zzjq.zzo(obj, j2, zzjq.zza(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i2)) {
                        zzjq.zzp(obj, j2, zzjq.zzb(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i2)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i2)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i2)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i2)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i2)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i2)) {
                        zzjq.zzm(obj, j2, zzjq.zzw(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i2)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i2);
                    break;
                case 10:
                    if (zzI(obj2, i2)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i2)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i2)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i2)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i2)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i2)) {
                        zzjq.zzq(obj, j2, zzjq.zzc(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i2)) {
                        zzjq.zzr(obj, j2, zzjq.zzd(obj2, j2));
                        zzD(obj, i2);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzho zzhoVarZzd = (zzho) zzjq.zzf(obj, j2);
                    zzho zzhoVar = (zzho) zzjq.zzf(obj2, j2);
                    int size = zzhoVarZzd.size();
                    int size2 = zzhoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhoVarZzd.zzc()) {
                            zzhoVarZzd = zzhoVarZzd.zzd(size2 + size);
                        }
                        zzhoVarZzd.addAll(zzhoVar);
                    }
                    if (size > 0) {
                        zzhoVar = zzhoVarZzd;
                    }
                    zzjq.zzs(obj, j2, zzhoVar);
                    break;
                case 50:
                    int i7 = zziz.zza;
                    zzjq.zzs(obj, j2, zzih.zza(zzjq.zzf(obj, j2), zzjq.zzf(obj2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i5, i2)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzE(obj, i5, i2);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i5, i2)) {
                        zzjq.zzs(obj, j2, zzjq.zzf(obj2, j2));
                        zzE(obj, i5, i2);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i2);
                    break;
            }
        }
        zziz.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zziz.zzo(this.zzm, obj, obj2);
        }
    }
}
