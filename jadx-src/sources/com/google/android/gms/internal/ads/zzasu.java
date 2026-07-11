package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzasu implements zzari {
    private final zzast zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasu(zzast zzastVar, int i2) {
        this.zzc = zzastVar;
    }

    static void zzj(OutputStream outputStream, long j2) throws IOException {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized zzarh zza(String str) {
        zzasr zzasrVar = (zzasr) this.zza.get(str);
        if (zzasrVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzasr.zza(zzassVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzask.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] bArrZzg = zzg(zzassVar, zzassVar.zza());
                zzarh zzarhVar = new zzarh();
                zzarhVar.zza = bArrZzg;
                zzarhVar.zzb = zzasrVar.zzc;
                zzarhVar.zzc = zzasrVar.zzd;
                zzarhVar.zzd = zzasrVar.zze;
                zzarhVar.zze = zzasrVar.zzf;
                zzarhVar.zzf = zzasrVar.zzg;
                List<zzarq> list = zzasrVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzarq zzarqVar : list) {
                    treeMap.put(zzarqVar.zza(), zzarqVar.zzb());
                }
                zzarhVar.zzg = treeMap;
                zzarhVar.zzh = Collections.unmodifiableList(list);
                return zzarhVar;
            } finally {
                zzassVar.close();
            }
        } catch (IOException e2) {
            zzask.zzb("%s: %s", fileZzf.getAbsolutePath(), e2.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzc() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzasr zzasrVarZza = zzasr.zza(zzassVar);
                            zzasrVarZza.zza = length;
                            zzn(zzasrVarZza.zzb, zzasrVarZza);
                            zzassVar.close();
                        } catch (Throwable th) {
                            zzassVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzask.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzd(String str, boolean z2) {
        zzarh zzarhVarZza = zza(str);
        if (zzarhVarZza != null) {
            zzarhVarZza.zzf = 0L;
            zzarhVarZza.zze = 0L;
            zzb(str, zzarhVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzasu(File file, int i2) {
        this.zzc = new zzasq(this, file);
    }

    @VisibleForTesting
    static byte[] zzg(zzass zzassVar, long j2) throws IOException {
        long jZza = zzassVar.zza();
        if (j2 >= 0 && j2 <= jZza) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzassVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 33 + String.valueOf(jZza).length());
        sb.append("streamToBytes length=");
        sb.append(j2);
        sb.append(", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    static void zzh(OutputStream outputStream, int i2) throws IOException {
        outputStream.write(i2 & 255);
        outputStream.write((i2 >> 8) & 255);
        outputStream.write((i2 >> 16) & 255);
        outputStream.write((i2 >> 24) & 255);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(com.google.android.exoplayer2.C.UTF8_NAME);
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    private final void zzn(String str, zzasr zzasrVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzasrVar.zza - ((zzasr) map.get(str)).zza;
        } else {
            this.zzb += zzasrVar.zza;
        }
        map.put(str, zzasrVar);
    }

    private final void zzo(String str) {
        zzasr zzasrVar = (zzasr) this.zza.remove(str);
        if (zzasrVar != null) {
            this.zzb -= zzasrVar.zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzb(String str, zzarh zzarhVar) {
        float f3;
        try {
            long j2 = this.zzb;
            int length = zzarhVar.zza.length;
            long j3 = j2 + ((long) length);
            int i2 = this.zzd;
            float f4 = 0.9f;
            if (j3 <= i2 || length <= i2 * 0.9f) {
                File fileZzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobFilesBridge.fileOutputStreamCtor(fileZzf));
                    zzasr zzasrVar = new zzasr(str, zzarhVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzasrVar.zzb);
                        String str2 = zzasrVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzasrVar.zzd);
                        zzj(bufferedOutputStream, zzasrVar.zze);
                        zzj(bufferedOutputStream, zzasrVar.zzf);
                        zzj(bufferedOutputStream, zzasrVar.zzg);
                        List<zzarq> list = zzasrVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzarq zzarqVar : list) {
                                zzl(bufferedOutputStream, zzarqVar.zza());
                                zzl(bufferedOutputStream, zzarqVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzarhVar.zza);
                        bufferedOutputStream.close();
                        zzasrVar.zza = fileZzf.length();
                        zzn(str, zzasrVar);
                        long j4 = this.zzb;
                        int i3 = this.zzd;
                        if (j4 >= i3) {
                            boolean z2 = zzask.zzb;
                            if (z2) {
                                zzask.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j5 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i5 = 0;
                            while (it.hasNext()) {
                                zzasr zzasrVar2 = (zzasr) ((Map.Entry) it.next()).getValue();
                                String str3 = zzasrVar2.zzb;
                                if (zzf(str3).delete()) {
                                    f3 = f4;
                                    this.zzb -= zzasrVar2.zza;
                                } else {
                                    f3 = f4;
                                    zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i5++;
                                if (this.zzb < i3 * f3) {
                                    break;
                                } else {
                                    f4 = f3;
                                }
                            }
                            if (z2) {
                                zzask.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i5), Long.valueOf(this.zzb - j5), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e2) {
                        zzask.zzb("%s", e2.toString());
                        bufferedOutputStream.close();
                        zzask.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzf.delete()) {
                        zzask.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzask.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static long zzk(InputStream inputStream) throws IOException {
        return (((long) zzp(inputStream)) & 255) | ((((long) zzp(inputStream)) & 255) << 8) | ((((long) zzp(inputStream)) & 255) << 16) | ((((long) zzp(inputStream)) & 255) << 24) | ((((long) zzp(inputStream)) & 255) << 32) | ((((long) zzp(inputStream)) & 255) << 40) | ((((long) zzp(inputStream)) & 255) << 48) | ((((long) zzp(inputStream)) & 255) << 56);
    }

    static String zzm(zzass zzassVar) throws IOException {
        return new String(zzg(zzassVar, zzk(zzassVar)), com.google.android.exoplayer2.C.UTF8_NAME);
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 != -1) {
            return i2;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }
}
