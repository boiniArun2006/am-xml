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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@WorkerThread
final class zzgx implements Runnable {
    final /* synthetic */ zzgy zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzgv zzd;
    private final String zze;
    private final Map zzf;

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fe: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:255), block:B:51:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0101: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:258), block:B:52:0x0100 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        int i2;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int i3;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        zzgy zzgyVar = this.zza;
        zzgyVar.zzaX();
        OutputStream outputStream = null;
        try {
            URL url = this.zzb;
            int i5 = com.google.android.gms.internal.measurement.zzcj.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzib zzibVar = zzgyVar.zzu;
            zzibVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzibVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.zzc;
                if (bArr != null) {
                    byte[] bArrZzv = zzgyVar.zzg.zzp().zzv(bArr);
                    zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
                    int length = bArrZzv.length;
                    zzgrVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzv);
                        outputStream2.close();
                    } catch (IOException e2) {
                        iOException = e2;
                        i3 = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, i3, iOException, null, map2, null));
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = 0;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, i2, null, null, map, null));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i7 = inputStream.read(bArr2);
                                    if (i7 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i7);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        map2 = null;
                        i3 = responseCode;
                        iOException = e;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgt.zzl(this.zze), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, i3, iOException, null, map2, null));
                    } catch (Throwable th5) {
                        th = th5;
                        map = null;
                        i2 = responseCode;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e5) {
                                this.zza.zzu.zzaV().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgt.zzl(this.zze), e5);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, i2, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    i3 = responseCode;
                    map2 = map4;
                    iOException = e;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, i3, iOException, null, map2, null));
                } catch (Throwable th6) {
                    th = th6;
                    i2 = responseCode;
                    map = map3;
                    if (outputStream != null) {
                    }
                    if (httpURLConnection != null) {
                    }
                    this.zza.zzu.zzaW().zzj(new zzgw(this.zze, this.zzd, i2, null, null, map, null));
                    throw th;
                }
            } catch (IOException e7) {
                iOException = e7;
                i3 = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                i2 = 0;
                map = null;
            }
        } catch (IOException e8) {
            iOException = e8;
            i3 = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            i2 = 0;
            httpURLConnection = null;
            map = null;
        }
    }

    public zzgx(zzgy zzgyVar, String str, URL url, byte[] bArr, Map map, zzgv zzgvVar) {
        Objects.requireNonNull(zzgyVar);
        this.zza = zzgyVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgvVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzgvVar;
        this.zze = str;
        this.zzf = map;
    }
}
