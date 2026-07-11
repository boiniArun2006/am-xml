package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@WorkerThread
final class zzlm implements Runnable {
    final /* synthetic */ zzln zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzlk zzd;
    private final String zze;
    private final Map zzf;

    private final void zzb(final int i2, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzll
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i2, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzlm] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r6;
        OutputStream outputStream3;
        ?? r62;
        OutputStream outputStream4;
        int responseCode;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        zzln zzlnVar = this.zza;
        zzlnVar.zzaX();
        int i2 = 0;
        try {
            URL url = this.zzb;
            int i3 = com.google.android.gms.internal.measurement.zzcj.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzib zzibVar = zzlnVar.zzu;
            zzibVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzibVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r52 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.zzf;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzibVar.zzaU();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            zzgr zzgrVarZzk = this.zza.zzu.zzaV().zzk();
                            int length = byteArray.length;
                            zzgrVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream5 = httpURLConnection.getOutputStream();
                            try {
                                outputStream5.write(byteArray);
                                outputStream5.close();
                                r52 = outputStream5;
                            } catch (IOException e2) {
                                e = e2;
                                r62 = 0;
                                outputStream4 = outputStream5;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e3) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgt.zzl(this.zze), e3);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i2, e, null, r62);
                            } catch (Throwable th) {
                                th = th;
                                r6 = 0;
                                outputStream3 = outputStream5;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e4) {
                                        this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgt.zzl(this.zze), e4);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i2, null, null, r6);
                                throw th;
                            }
                        } catch (IOException e5) {
                            this.zza.zzu.zzaV().zzb().zzb("Failed to gzip post request content", e5);
                            throw e5;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        inputStream = httpURLConnection.getInputStream();
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i5 = inputStream.read(bArr2);
                            if (i5 <= 0) {
                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzb(responseCode, null, byteArray2, headerFields);
                                return;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i5);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    i2 = responseCode;
                    e = e7;
                    outputStream2 = null;
                    r62 = outputStream2;
                    outputStream4 = outputStream2;
                    if (outputStream4 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzb(i2, e, null, r62);
                } catch (Throwable th5) {
                    i2 = responseCode;
                    th = th5;
                    outputStream = null;
                    r6 = outputStream;
                    outputStream3 = outputStream;
                    if (outputStream3 != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    zzb(i2, null, null, r6);
                    throw th;
                }
            } catch (IOException e8) {
                i2 = responseCode;
                e = e8;
                r62 = r52;
                outputStream4 = null;
                if (outputStream4 != null) {
                }
                if (httpURLConnection != null) {
                }
                zzb(i2, e, null, r62);
            } catch (Throwable th6) {
                i2 = responseCode;
                th = th6;
                r6 = r52;
                outputStream3 = null;
                if (outputStream3 != null) {
                }
                if (httpURLConnection != null) {
                }
                zzb(i2, null, null, r6);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    final /* synthetic */ void zza(int i2, Exception exc, byte[] bArr, Map map) {
        this.zzd.zza(this.zze, i2, exc, bArr, map);
    }

    public zzlm(zzln zzlnVar, String str, URL url, byte[] bArr, Map map, zzlk zzlkVar) {
        Objects.requireNonNull(zzlnVar);
        this.zza = zzlnVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzlkVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzlkVar;
        this.zze = str;
        this.zzf = map;
    }
}
