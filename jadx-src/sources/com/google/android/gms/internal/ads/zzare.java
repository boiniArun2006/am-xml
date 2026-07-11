package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzare {
    private static void zzd(Map map, FileChannel fileChannel, long j2, long j3, long j4, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaqz zzaqzVar = new zzaqz(fileChannel, 0L, j2);
        zzaqz zzaqzVar2 = new zzaqz(fileChannel, j3, j4 - j3);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzarf.zzc(byteBufferDuplicate, j2);
        zzaqx zzaqxVar = new zzaqx(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        try {
            byte[][] bArrZze = zze(iArr, new zzaqy[]{zzaqzVar, zzaqzVar2, zzaqxVar});
            for (int i3 = 0; i3 < size; i3++) {
                int i5 = iArr[i3];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i5)), bArrZze[i3])) {
                    throw new SecurityException(zzg(i5).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    private static String zzg(int i2) {
        if (i2 == 1) {
            return "SHA-256";
        }
        if (i2 == 2) {
            return "SHA-512";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int zzh(int i2) {
        if (i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
            return 64;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 33);
        sb.append("Unknown content digest algorthm: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static X509Certificate[][] zza(String str) throws zzarb, SecurityException, IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair pairZza = zzarf.zza(randomAccessFile2);
            try {
                if (pairZza == null) {
                    long length = randomAccessFile2.length();
                    StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 82);
                    sb.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                    sb.append(length);
                    sb.append(" bytes");
                    throw new zzarb(sb.toString());
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZza.first;
                long jLongValue = ((Long) pairZza.second).longValue();
                long j2 = (-20) + jLongValue;
                if (j2 >= 0) {
                    randomAccessFile2.seek(j2);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzarb("ZIP64 APK not supported");
                    }
                }
                long jZzb = zzarf.zzb(byteBuffer);
                if (jZzb >= jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jZzb).length() + 82 + String.valueOf(jLongValue).length());
                    sb2.append("ZIP Central Directory offset out of range: ");
                    sb2.append(jZzb);
                    sb2.append(". ZIP End of Central Directory offset: ");
                    sb2.append(jLongValue);
                    throw new zzarb(sb2.toString());
                }
                if (zzarf.zzd(byteBuffer) + jZzb != jLongValue) {
                    throw new zzarb("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZzb < 32) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(jZzb).length() + 67);
                    sb3.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb3.append(jZzb);
                    throw new zzarb(sb3.toString());
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jZzb - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzarb("No APK Signing Block before ZIP Central Directory");
                }
                long j3 = byteBufferAllocate.getLong(0);
                if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(j3).length() + 37);
                    sb4.append("APK Signing Block size out of range: ");
                    sb4.append(j3);
                    throw new zzarb(sb4.toString());
                }
                int i2 = (int) (8 + j3);
                long j4 = jZzb - ((long) i2);
                if (j4 < 0) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j4).length() + 39);
                    sb5.append("APK Signing Block offset out of range: ");
                    sb5.append(j4);
                    throw new zzarb(sb5.toString());
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j4);
                long j5 = jZzb;
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                long j6 = byteBufferAllocate2.getLong(0);
                if (j6 != j3) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j6).length() + 63 + String.valueOf(j3).length());
                    sb6.append("APK Signing Block sizes in header and footer do not match: ");
                    sb6.append(j6);
                    sb6.append(" vs ");
                    sb6.append(j3);
                    throw new zzarb(sb6.toString());
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                randomAccessFile = randomAccessFile2;
                if (iCapacity < 8) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(iCapacity).length() + 17);
                    sb7.append("end < start: ");
                    sb7.append(iCapacity);
                    sb7.append(" < ");
                    sb7.append(8);
                    throw new IllegalArgumentException(sb7.toString());
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    StringBuilder sb8 = new StringBuilder(String.valueOf(iCapacity).length() + 19 + String.valueOf(iCapacity2).length());
                    sb8.append("end > capacity: ");
                    sb8.append(iCapacity);
                    sb8.append(" > ");
                    sb8.append(iCapacity2);
                    throw new IllegalArgumentException(sb8.toString());
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i3 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        int i5 = i3 + 1;
                        if (byteBufferSlice.remaining() < 8) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i5).length() + 59);
                            sb9.append("Insufficient data to read size of APK Signing Block entry #");
                            sb9.append(i5);
                            throw new zzarb(sb9.toString());
                        }
                        long j7 = byteBufferSlice.getLong();
                        if (j7 < 4 || j7 > 2147483647L) {
                            StringBuilder sb10 = new StringBuilder(String.valueOf(i5).length() + 45 + String.valueOf(j7).length());
                            sb10.append("APK Signing Block entry #");
                            sb10.append(i5);
                            sb10.append(" size out of range: ");
                            sb10.append(j7);
                            throw new zzarb(sb10.toString());
                        }
                        int i7 = (int) j7;
                        int iPosition2 = byteBufferSlice.position() + i7;
                        if (i7 > byteBufferSlice.remaining()) {
                            int iRemaining = byteBufferSlice.remaining();
                            StringBuilder sb11 = new StringBuilder(String.valueOf(i5).length() + 45 + String.valueOf(i7).length() + 13 + String.valueOf(iRemaining).length());
                            sb11.append("APK Signing Block entry #");
                            sb11.append(i5);
                            sb11.append(" size out of range: ");
                            sb11.append(i7);
                            sb11.append(", available: ");
                            sb11.append(iRemaining);
                            throw new zzarb(sb11.toString());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrZzb = zzb(randomAccessFile.getChannel(), new zzara(zzi(byteBufferSlice, i7 - 4), jLongValue2, j5, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrZzb;
                        }
                        long j9 = jLongValue2;
                        long j10 = j5;
                        byteBufferSlice.position(iPosition2);
                        i3 = i5;
                        j5 = j10;
                        jLongValue2 = j9;
                    }
                    throw new zzarb("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static X509Certificate[][] zzb(FileChannel fileChannel, zzara zzaraVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzj = zzj(zzaraVar.zza());
                int i2 = 0;
                while (byteBufferZzj.hasRemaining()) {
                    i2++;
                    try {
                        arrayList.add(zzc(zzj(byteBufferZzj), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 37);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i2);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e2);
                    }
                }
                if (i2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzd(map, fileChannel, zzaraVar.zzb(), zzaraVar.zzc(), zzaraVar.zzd(), zzaraVar.zze());
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    private static byte[][] zze(int[] iArr, zzaqy[] zzaqyVarArr) throws DigestException {
        long j2;
        int i2;
        int length;
        char c2;
        int i3;
        String str;
        int i5 = 0;
        long jZza = 0;
        while (true) {
            j2 = 1048576;
            i2 = 3;
            if (i5 >= 3) {
                break;
            }
            jZza += (zzaqyVarArr[i5].zza() + 1048575) / 1048576;
            i5++;
        }
        if (jZza >= 2097151) {
            StringBuilder sb = new StringBuilder(String.valueOf(jZza).length() + 17);
            sb.append("Too many chunks: ");
            sb.append(jZza);
            throw new DigestException(sb.toString());
        }
        byte[][] bArr = new byte[iArr.length][];
        int i7 = 0;
        while (true) {
            length = iArr.length;
            c2 = 5;
            i3 = 1;
            if (i7 >= length) {
                break;
            }
            int i8 = (int) jZza;
            byte[] bArr2 = new byte[(zzh(iArr[i7]) * i8) + 5];
            bArr2[0] = 90;
            zzl(i8, bArr2, 1);
            bArr[i7] = bArr2;
            i7++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i9 = 0;
        while (true) {
            str = " digest not supported";
            if (i9 >= iArr.length) {
                break;
            }
            String strZzg = zzg(iArr[i9]);
            try {
                messageDigestArr[i9] = MessageDigest.getInstance(strZzg);
                i9++;
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(strZzg.concat(" digest not supported"), e2);
            }
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < i2) {
            zzaqy zzaqyVar = zzaqyVarArr[i10];
            int i13 = i10;
            long jZza2 = zzaqyVar.zza();
            long j3 = 0;
            while (jZza2 > 0) {
                int i14 = i11;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j2);
                zzl(iMin, bArr3, i3);
                for (int i15 = 0; i15 < length; i15++) {
                    messageDigestArr[i15].update(bArr3);
                }
                try {
                    zzaqyVar.zzb(messageDigestArr, j3, iMin);
                    int i16 = 0;
                    while (i16 < iArr.length) {
                        int i17 = iArr[i16];
                        byte[] bArr4 = bArr[i16];
                        int iZzh = zzh(i17);
                        char c4 = c2;
                        MessageDigest messageDigest = messageDigestArr[i16];
                        int iDigest = messageDigest.digest(bArr4, (i14 * iZzh) + 5, iZzh);
                        if (iDigest != iZzh) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 35 + String.valueOf(iDigest).length());
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(iDigest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i16++;
                        c2 = c4;
                    }
                    long j4 = iMin;
                    j3 += j4;
                    jZza2 -= j4;
                    i11 = i14 + 1;
                    str = str2;
                    j2 = 1048576;
                    i3 = 1;
                } catch (IOException e3) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 37 + String.valueOf(i12).length());
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i14);
                    sb3.append(" of section #");
                    sb3.append(i12);
                    throw new DigestException(sb3.toString(), e3);
                }
            }
            i12++;
            i10 = i13 + 1;
            j2 = 1048576;
            i2 = 3;
            i3 = 1;
        }
        String str3 = str;
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i18 = 0; i18 < iArr.length; i18++) {
            int i19 = iArr[i18];
            byte[] bArr6 = bArr[i18];
            String strZzg2 = zzg(i19);
            try {
                bArr5[i18] = MessageDigest.getInstance(strZzg2).digest(bArr6);
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(strZzg2.concat(str3), e4);
            }
        }
        return bArr5;
    }

    private static int zzf(int i2) {
        if (i2 == 513) {
            return 1;
        }
        if (i2 == 514) {
            return 2;
        }
        if (i2 == 769) {
            return 1;
        }
        switch (i2) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
        }
    }

    private static void zzl(int i2, byte[] bArr, int i3) {
        bArr[1] = (byte) (i2 & 255);
        bArr[2] = (byte) ((i2 >>> 8) & 255);
        bArr[3] = (byte) ((i2 >>> 16) & 255);
        bArr[4] = (byte) (i2 >> 24);
    }

    private static X509Certificate[] zzc(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzj = zzj(byteBuffer);
        ByteBuffer byteBufferZzj2 = zzj(byteBuffer);
        byte[] bArrZzk = zzk(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzk2 = null;
        byte[] bArrZzk3 = null;
        int i2 = -1;
        int i3 = 0;
        while (byteBufferZzj2.hasRemaining()) {
            i3++;
            try {
                ByteBuffer byteBufferZzj3 = zzj(byteBufferZzj2);
                if (byteBufferZzj3.remaining() >= 8) {
                    int i5 = byteBufferZzj3.getInt();
                    arrayList.add(Integer.valueOf(i5));
                    if (i5 != 513 && i5 != 514 && i5 != 769) {
                        switch (i5) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i2 != -1) {
                        int iZzf = zzf(i5);
                        int iZzf2 = zzf(i2);
                        if (iZzf != 1 && iZzf2 == 1) {
                        }
                    }
                    bArrZzk3 = zzk(byteBufferZzj3);
                    i2 = i5;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException e2) {
                e = e2;
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 34);
                sb.append("Failed to parse signature record #");
                sb.append(i3);
                throw new SecurityException(sb.toString(), e);
            } catch (BufferUnderflowException e3) {
                e = e3;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 34);
                sb2.append("Failed to parse signature record #");
                sb2.append(i3);
                throw new SecurityException(sb2.toString(), e);
            }
        }
        if (i2 == -1) {
            if (i3 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 != 513 && i2 != 514) {
            if (i2 != 769) {
                switch (i2) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = "RSA";
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                }
            } else {
                str = "DSA";
            }
        } else {
            str = "EC";
        }
        if (i2 != 513) {
            if (i2 != 514) {
                if (i2 != 769) {
                    switch (i2) {
                        case 257:
                            pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                            break;
                        case 258:
                            pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                            break;
                        case 259:
                            pairCreate = Pair.create("SHA256withRSA", null);
                            break;
                        case 260:
                            pairCreate = Pair.create("SHA512withRSA", null);
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i2))));
                    }
                } else {
                    pairCreate = Pair.create("SHA256withDSA", null);
                }
            } else {
                pairCreate = Pair.create("SHA512withECDSA", null);
            }
        } else {
            pairCreate = Pair.create(FijIa.FWDvthPkWFde, null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzk));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzj);
            if (signature.verify(bArrZzk3)) {
                byteBufferZzj.clear();
                ByteBuffer byteBufferZzj4 = zzj(byteBufferZzj);
                ArrayList arrayList2 = new ArrayList();
                int i7 = 0;
                while (byteBufferZzj4.hasRemaining()) {
                    i7++;
                    try {
                        ByteBuffer byteBufferZzj5 = zzj(byteBufferZzj4);
                        if (byteBufferZzj5.remaining() >= 8) {
                            int i8 = byteBufferZzj5.getInt();
                            arrayList2.add(Integer.valueOf(i8));
                            if (i8 == i2) {
                                bArrZzk2 = zzk(byteBufferZzj5);
                            }
                        } else {
                            throw new IOException("Record too short");
                        }
                    } catch (IOException e4) {
                        e = e4;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 31);
                        sb3.append("Failed to parse digest record #");
                        sb3.append(i7);
                        throw new IOException(sb3.toString(), e);
                    } catch (BufferUnderflowException e5) {
                        e = e5;
                        StringBuilder sb32 = new StringBuilder(String.valueOf(i7).length() + 31);
                        sb32.append("Failed to parse digest record #");
                        sb32.append(i7);
                        throw new IOException(sb32.toString(), e);
                    }
                }
                if (arrayList.equals(arrayList2)) {
                    int iZzf3 = zzf(i2);
                    byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzf3), bArrZzk2);
                    if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzk2)) {
                        throw new SecurityException(zzg(iZzf3).concat(" contents digest does not match the digest specified by a preceding signer"));
                    }
                    ByteBuffer byteBufferZzj6 = zzj(byteBufferZzj);
                    ArrayList arrayList3 = new ArrayList();
                    int i9 = 0;
                    while (byteBufferZzj6.hasRemaining()) {
                        i9++;
                        byte[] bArrZzk4 = zzk(byteBufferZzj6);
                        try {
                            arrayList3.add(new zzarc((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzk4)), bArrZzk4));
                        } catch (CertificateException e6) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i9).length() + 30);
                            sb4.append("Failed to decode certificate #");
                            sb4.append(i9);
                            throw new SecurityException(sb4.toString(), e6);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (Arrays.equals(bArrZzk, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                            return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                        }
                        throw new SecurityException("Public key mismatch between certificate and signature record");
                    }
                    throw new SecurityException("No certificates listed");
                }
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5.append("Failed to verify ");
            sb5.append(str2);
            sb5.append(" signature");
            throw new SecurityException(sb5.toString(), e);
        } catch (InvalidKeyException e8) {
            e = e8;
            StringBuilder sb52 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb52.append("Failed to verify ");
            sb52.append(str2);
            sb52.append(" signature");
            throw new SecurityException(sb52.toString(), e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            StringBuilder sb522 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb522.append("Failed to verify ");
            sb522.append(str2);
            sb522.append(" signature");
            throw new SecurityException(sb522.toString(), e);
        } catch (SignatureException e10) {
            e = e10;
            StringBuilder sb5222 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb5222.append("Failed to verify ");
            sb5222.append(str2);
            sb5222.append(" signature");
            throw new SecurityException(sb5222.toString(), e);
        } catch (InvalidKeySpecException e11) {
            e = e11;
            StringBuilder sb52222 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb52222.append("Failed to verify ");
            sb52222.append(str2);
            sb52222.append(" signature");
            throw new SecurityException(sb52222.toString(), e);
        }
    }

    private static ByteBuffer zzi(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 >= iPosition && i3 <= iLimit) {
            byteBuffer.limit(i3);
            try {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.order(byteBuffer.order());
                byteBuffer.position(i3);
                return byteBufferSlice;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzj(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i2 = byteBuffer.getInt();
            if (i2 >= 0) {
                if (i2 <= byteBuffer.remaining()) {
                    return zzi(byteBuffer, i2);
                }
                int iRemaining = byteBuffer.remaining();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 79 + String.valueOf(iRemaining).length());
                sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb.append(i2);
                sb.append(", remaining: ");
                sb.append(iRemaining);
                throw new IOException(sb.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        int iRemaining2 = byteBuffer.remaining();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iRemaining2).length() + 82);
        sb2.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        sb2.append(iRemaining2);
        throw new IOException(sb2.toString());
    }

    private static byte[] zzk(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 >= 0) {
            if (i2 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                return bArr;
            }
            int iRemaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 68 + String.valueOf(iRemaining).length());
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i2);
            sb.append(", available: ");
            sb.append(iRemaining);
            throw new IOException(sb.toString());
        }
        throw new IOException("Negative length");
    }
}
