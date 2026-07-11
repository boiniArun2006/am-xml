package com.google.android.gms.internal.ads;

import androidx.media3.database.Kr.FlTC;
import com.google.android.gms.common.util.Clock;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzchu extends zzchr {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        this.zzh = true;
    }

    private final File zza(File file) {
        return new File(zzfxl.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d1, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d9, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03db, code lost:
    
        r0 = r10.format(r4);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r34).length());
        r5.append(r18);
        r5.append(r0);
        r5.append(" bytes from ");
        r5.append(r34);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x040d, code lost:
    
        r14.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0418, code lost:
    
        if (r7.isFile() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x041a, code lost:
    
        r7.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0426, code lost:
    
        r7.createNewFile();
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b4  */
    @Override // com.google.android.gms.internal.ads.zzchr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(final String str) {
        int i2;
        String strConcat;
        File file;
        String str2;
        String str3;
        String string;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnectionZzh;
        int contentLength;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        FileChannel channel;
        ByteBuffer byteBufferAllocate;
        Clock clockZzk;
        long jCurrentTimeMillis;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar;
        long jLongValue;
        int i3;
        String string2;
        int i5;
        ByteBuffer byteBuffer;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar2;
        ReadableByteChannel readableByteChannel;
        int iHttpUrlConnectionGetResponseCode;
        boolean zDelete;
        String str4 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                i2 = 0;
            } else {
                File[] fileArrListFiles = file2.listFiles();
                int length = fileArrListFiles.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = length;
                    int i10 = i7;
                    if (!fileArrListFiles[i7].getName().endsWith(".done")) {
                        i8++;
                    }
                    i7 = i10 + 1;
                    length = i9;
                }
                i2 = i8;
            }
            String str5 = str4;
            if (i2 <= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzu)).intValue()) {
                File file3 = new File(zzfxl.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
                File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length2 = (int) file3.length();
                    String strValueOf = String.valueOf(str);
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(strValueOf));
                    zzo(str, file3.getAbsolutePath(), length2);
                    return true;
                }
                String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf3 = String.valueOf(str);
                Set set = zze;
                strConcat = strValueOf2.concat(strValueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                            sb.append("Stream cache already in progress at ");
                            sb.append(str);
                            String string3 = sb.toString();
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string3);
                            zzq(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        try {
                            zzfyj zzfyjVarZza = zzfxx.zza();
                            str2 = MRAIDPresenter.ERROR;
                            try {
                                try {
                                    httpURLConnectionZzh = zzfyjVarZza.zzh(new zzfxz() { // from class: com.google.android.gms.internal.ads.zzcht
                                        @Override // com.google.android.gms.internal.ads.zzfxz
                                        public final /* synthetic */ URLConnection zza() throws IOException {
                                            int i13 = zzchu.zzd;
                                            com.google.android.gms.ads.internal.zzt.zzq();
                                            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaj)).intValue();
                                            URL url = new URL(str);
                                            int i14 = 0;
                                            while (true) {
                                                i14++;
                                                if (i14 > 20) {
                                                    throw new IOException("Too many redirects (20)");
                                                }
                                                int i15 = zzfxs.zzb;
                                                URLConnection uRLConnectionOpenConnection = url.openConnection();
                                                uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                                uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                                    throw new IOException("Invalid protocol.");
                                                }
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                                zzlVar.zza(httpURLConnection, null);
                                                httpURLConnection.setInstanceFollowRedirects(false);
                                                int iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                                                zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode2);
                                                if (iHttpUrlConnectionGetResponseCode2 / 100 != 3) {
                                                    return httpURLConnection;
                                                }
                                                String headerField = httpURLConnection.getHeaderField("Location");
                                                if (headerField == null) {
                                                    throw new IOException(FlTC.VuUNtnEw);
                                                }
                                                URL url2 = new URL(url, headerField);
                                                String protocol = url2.getProtocol();
                                                if (protocol == null) {
                                                    throw new IOException("Protocol is null");
                                                }
                                                if (!protocol.equals(g.f62375e) && !protocol.equals("https")) {
                                                    throw new IOException("Unsupported scheme: ".concat(protocol));
                                                }
                                                String strConcat2 = "Redirecting to ".concat(headerField);
                                                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzd(strConcat2);
                                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                                url = url2;
                                            }
                                        }
                                    }, 265, -1);
                                    if (httpURLConnectionZzh != null && (iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZzh)) >= 400) {
                                        str3 = "badUrl";
                                        try {
                                            String string4 = Integer.toString(iHttpUrlConnectionGetResponseCode);
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(string4).length() + 27);
                                            sb2.append("HTTP request failed. Code: ");
                                            sb2.append(string4);
                                            string = sb2.toString();
                                        } catch (IOException | RuntimeException e2) {
                                            e = e2;
                                            file = file3;
                                            string = null;
                                            fileOutputStream = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException | NullPointerException unused) {
                                            }
                                            if (this.zzh) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzq(str, file.getAbsolutePath(), str3, string);
                                            zze.remove(strConcat);
                                            return false;
                                        }
                                        try {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(iHttpUrlConnectionGetResponseCode).length() + 21 + String.valueOf(str).length());
                                            sb3.append("HTTP status code ");
                                            sb3.append(iHttpUrlConnectionGetResponseCode);
                                            sb3.append(" at ");
                                            sb3.append(str);
                                            throw new IOException(sb3.toString());
                                        } catch (IOException | RuntimeException e3) {
                                            e = e3;
                                            file = file3;
                                            fileOutputStream = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzq(str, file.getAbsolutePath(), str3, string);
                                            zze.remove(strConcat);
                                            return false;
                                        }
                                    }
                                    contentLength = httpURLConnectionZzh.getContentLength();
                                } catch (IOException | RuntimeException e4) {
                                    e = e4;
                                    file = file3;
                                }
                            } catch (IOException | RuntimeException e5) {
                                e = e5;
                                file = file3;
                            }
                        } catch (IOException | RuntimeException e6) {
                            e = e6;
                            file = file3;
                            str2 = MRAIDPresenter.ERROR;
                        }
                        if (contentLength < 0) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 55);
                            sb4.append("Stream cache aborted, missing content-length header at ");
                            sb4.append(str);
                            String string5 = sb4.toString();
                            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string5);
                            zzq(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(strConcat);
                            return false;
                        }
                        DecimalFormat decimalFormat = zzf;
                        String str6 = decimalFormat.format(contentLength);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzv)).intValue();
                        str3 = "File too big for full file cache. Size: ";
                        if (contentLength > iIntValue) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + 33 + String.valueOf(str).length());
                            sb5.append("Content length ");
                            sb5.append(str6);
                            sb5.append(" exceeds limit at ");
                            sb5.append(str);
                            String string6 = sb5.toString();
                            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string6);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 40);
                            sb6.append("File too big for full file cache. Size: ");
                            sb6.append(str6);
                            zzq(str, file3.getAbsolutePath(), "sizeExceeded", sb6.toString());
                            set.remove(strConcat);
                            return false;
                        }
                        StringBuilder sb7 = new StringBuilder(String.valueOf(str6).length() + 20 + String.valueOf(str).length());
                        sb7.append("Caching ");
                        sb7.append(str6);
                        sb7.append(" bytes from ");
                        sb7.append(str);
                        String string7 = sb7.toString();
                        int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(string7);
                        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionZzh));
                        file = file3;
                        try {
                            fileOutputStreamFileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file);
                            try {
                                try {
                                    channel = fileOutputStreamFileOutputStreamCtor.getChannel();
                                    byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
                                    jCurrentTimeMillis = clockZzk.currentTimeMillis();
                                    zzbuVar = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue());
                                    jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue();
                                    i3 = 0;
                                } catch (IOException e7) {
                                    e = e7;
                                }
                            } catch (RuntimeException e8) {
                                e = e8;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            str3 = str2;
                            string = null;
                            fileOutputStream = null;
                        } catch (RuntimeException e10) {
                            e = e10;
                            str3 = str2;
                            string = null;
                            fileOutputStream = null;
                        }
                        while (true) {
                            int i16 = readableByteChannelNewChannel.read(byteBufferAllocate);
                            if (i16 < 0) {
                                break;
                            }
                            i3 += i16;
                            if (i3 > iIntValue) {
                                try {
                                    String string8 = Integer.toString(i3);
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(string8).length() + 40);
                                    sb8.append("File too big for full file cache. Size: ");
                                    sb8.append(string8);
                                    string2 = sb8.toString();
                                } catch (IOException | RuntimeException e11) {
                                    e = e11;
                                    str3 = "sizeExceeded";
                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                    string = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str3, string);
                                    zze.remove(strConcat);
                                    return false;
                                }
                                try {
                                    throw new IOException("stream cache file size limit exceeded");
                                } catch (IOException | RuntimeException e12) {
                                    e = e12;
                                    str3 = "sizeExceeded";
                                    string = string2;
                                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str3, string);
                                    zze.remove(strConcat);
                                    return false;
                                }
                            }
                            byteBufferAllocate.flip();
                            while (channel.write(byteBufferAllocate) > 0) {
                            }
                            byteBufferAllocate.clear();
                            try {
                                if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                    str3 = "downloadTimeout";
                                    String string9 = Long.toString(jLongValue);
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(string9).length() + 29);
                                    sb9.append("Timeout exceeded. Limit: ");
                                    sb9.append(string9);
                                    sb9.append(" sec");
                                    string2 = sb9.toString();
                                    try {
                                        throw new IOException("stream cache time limit exceeded");
                                    } catch (IOException e13) {
                                        e = e13;
                                        string = string2;
                                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzq(str, file.getAbsolutePath(), str3, string);
                                        zze.remove(strConcat);
                                        return false;
                                    } catch (RuntimeException e14) {
                                        e = e14;
                                        string = string2;
                                        fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzq(str, file.getAbsolutePath(), str3, string);
                                        zze.remove(strConcat);
                                        return false;
                                    }
                                }
                                if (this.zzh) {
                                    throw new IOException("abort requested");
                                }
                                if (zzbuVar.zza()) {
                                    zzbuVar2 = zzbuVar;
                                    byteBuffer = byteBufferAllocate;
                                    i5 = contentLength;
                                    readableByteChannel = readableByteChannelNewChannel;
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzchl(this, str, file.getAbsolutePath(), i3, i5, false));
                                } else {
                                    i5 = contentLength;
                                    byteBuffer = byteBufferAllocate;
                                    zzbuVar2 = zzbuVar;
                                    readableByteChannel = readableByteChannelNewChannel;
                                }
                                contentLength = i5;
                                zzbuVar = zzbuVar2;
                                byteBufferAllocate = byteBuffer;
                                readableByteChannelNewChannel = readableByteChannel;
                            } catch (IOException e15) {
                                e = e15;
                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                string = null;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.zzh) {
                                }
                                if (file.exists()) {
                                }
                                zzq(str, file.getAbsolutePath(), str3, string);
                                zze.remove(strConcat);
                                return false;
                            } catch (RuntimeException e16) {
                                e = e16;
                                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                                string = null;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.zzh) {
                                }
                                if (file.exists()) {
                                }
                                zzq(str, file.getAbsolutePath(), str3, string);
                                zze.remove(strConcat);
                                return false;
                            }
                            if (e instanceof RuntimeException) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                            }
                            fileOutputStream.close();
                            if (this.zzh) {
                                StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 25);
                                sb10.append("Preload failed for URL \"");
                                sb10.append(str);
                                sb10.append("\"");
                                String string10 = sb10.toString();
                                int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj(string10, e);
                            } else {
                                StringBuilder sb11 = new StringBuilder(String.valueOf(str).length() + 26);
                                sb11.append("Preload aborted for URL \"");
                                sb11.append(str);
                                sb11.append("\"");
                                String string11 = sb11.toString();
                                int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzh(string11);
                            }
                            if (file.exists() && !file.delete()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                            }
                            zzq(str, file.getAbsolutePath(), str3, string);
                            zze.remove(strConcat);
                            return false;
                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                            str3 = str2;
                            string = null;
                            if (e instanceof RuntimeException) {
                            }
                            fileOutputStream.close();
                            if (this.zzh) {
                            }
                            if (file.exists()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                            }
                            zzq(str, file.getAbsolutePath(), str3, string);
                            zze.remove(strConcat);
                            return false;
                        }
                    } finally {
                    }
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            File[] fileArrListFiles2 = file4.listFiles();
            int length3 = fileArrListFiles2.length;
            int i19 = 0;
            long j2 = Long.MAX_VALUE;
            File file5 = null;
            while (i19 < length3) {
                File file6 = fileArrListFiles2[i19];
                int i20 = length3;
                int i21 = i19;
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j2) {
                        file5 = file6;
                        j2 = jLastModified;
                    }
                }
                i19 = i21 + 1;
                length3 = i20;
            }
            if (file5 != null) {
                boolean zDelete2 = file5.delete();
                File fileZza2 = zza(file5);
                zDelete = fileZza2.isFile() ? fileZza2.delete() & zDelete2 : zDelete2;
            } else {
                zDelete = false;
            }
            if (!zDelete) {
                break;
            }
            str4 = str5;
        }
        int i22 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
        zzq(str, null, "expireFailed", null);
        return false;
        zzo(str, file.getAbsolutePath(), i3);
        zze.remove(strConcat);
        return true;
    }

    public zzchu(zzcge zzcgeVar) {
        super(zzcgeVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfxl.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }
}
