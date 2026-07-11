package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzciw extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private zzhf zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    zzciw(String str, zzhz zzhzVar, int i2, int i3, long j2, long j3) {
        super(true);
        zzdg.zza(str);
        this.zzd = str;
        this.zze = new zzht();
        this.zzb = i2;
        this.zzc = i3;
        this.zzh = new ArrayDeque();
        this.zzq = j2;
        this.zzr = j3;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzhq(e2, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect((HttpURLConnection) queue.remove());
            } catch (Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws zzhq {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzl;
            long j3 = this.zzm;
            if (j2 - j3 == 0) {
                return -1;
            }
            long j4 = this.zzn + j3;
            long j5 = i3;
            long j6 = j4 + j5 + this.zzr;
            long j7 = this.zzp;
            long j9 = j7 + 1;
            if (j6 > j9) {
                long j10 = this.zzo;
                if (j7 < j10) {
                    long jMin = Math.min(j10, Math.max(((this.zzq + j9) - r4) - 1, (j9 + j5) - 1));
                    zzk(j9, jMin, 2);
                    this.zzp = jMin;
                    j7 = jMin;
                }
            }
            int i5 = this.zzi.read(bArr, i2, (int) Math.min(j5, ((j7 + 1) - this.zzn) - this.zzm));
            if (i5 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i5;
            zzh(i5);
            return i5;
        } catch (IOException e2) {
            throw new zzhq(e2, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        this.zzf = zzhfVar;
        this.zzm = 0L;
        long j2 = zzhfVar.zze;
        long j3 = zzhfVar.zzf;
        long jMin = j3 == -1 ? this.zzq : Math.min(this.zzq, j3);
        this.zzn = j2;
        HttpURLConnection httpURLConnectionZzk = zzk(j2, (jMin + j2) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j4 = Long.parseLong(matcher.group(2));
                    long j5 = Long.parseLong(matcher.group(3));
                    long j6 = zzhfVar.zzf;
                    if (j6 != -1) {
                        this.zzl = j6;
                        this.zzo = Math.max(j4, (this.zzn + j6) - 1);
                    } else {
                        this.zzl = j5 - this.zzn;
                        this.zzo = j5 - 1;
                    }
                    this.zzp = j4;
                    this.zzj = true;
                    zzg(zzhfVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append("]");
                    String string = sb.toString();
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
                }
            }
        }
        throw new zzciu(headerField, zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    final HttpURLConnection zzk(long j2, long j3, int i2) throws zzhq {
        int i3;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e2) {
                    iOException = e2;
                    i3 = i2;
                    String strValueOf = String.valueOf(string);
                    throw new zzhq("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i3);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 7 + String.valueOf(j3).length());
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            sb.append(j3);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                this.zzk = iHttpUrlConnectionGetResponseCode;
                if (iHttpUrlConnectionGetResponseCode < 200 || iHttpUrlConnectionGetResponseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzciv(this.zzk, headerFields, this.zzf, i2);
                }
                try {
                    InputStream inputStreamUrlConnectionGetInputStream = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                    if (this.zzi != null) {
                        inputStreamUrlConnectionGetInputStream = new SequenceInputStream(this.zzi, inputStreamUrlConnectionGetInputStream);
                    }
                    this.zzi = inputStreamUrlConnectionGetInputStream;
                    return httpURLConnection;
                } catch (IOException e3) {
                    zzl();
                    throw new zzhq(e3, this.zzf, 2000, i2);
                }
            } catch (IOException e4) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzhq("Unable to connect to ".concat(strValueOf2), e4, this.zzf, 2000, i2);
            }
        } catch (IOException e5) {
            i3 = i2;
            iOException = e5;
        }
    }
}
