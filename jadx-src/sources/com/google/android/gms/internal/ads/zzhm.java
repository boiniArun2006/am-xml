package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzhm extends zzgt implements zzhu {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final zzht zze;
    private final zzht zzf;

    @Nullable
    private zzhf zzg;

    @Nullable
    private HttpURLConnection zzh;

    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzhm(String str, int i2, int i3, boolean z2, boolean z3, zzht zzhtVar, zzgrd zzgrdVar, boolean z4, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zza = z2;
        this.zze = zzhtVar;
        this.zzf = new zzht();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zzhf zzhfVar = this.zzg;
                    String str = zzfj.zza;
                    throw new zzhq(e2, zzhfVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final URL zzl(URL url, @Nullable String str, zzhf zzhfVar) throws zzhq {
        if (str == null) {
            throw new zzhq("Null location redirect", zzhfVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !g.f62375e.equals(protocol)) {
                throw new zzhq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhfVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzhq(sb.toString(), zzhfVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new zzhq(e2, zzhfVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e2) {
                zzee.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
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
            if (j2 != -1) {
                long j3 = j2 - this.zzm;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.zzi;
            String str = zzfj.zza;
            int i5 = inputStream.read(bArr, i2, i3);
            if (i5 == -1) {
                return -1;
            }
            this.zzm += (long) i5;
            zzh(i5);
            return i5;
        } catch (IOException e2) {
            zzhf zzhfVar = this.zzg;
            String str2 = zzfj.zza;
            throw zzhq.zza(e2, zzhfVar, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhf zzhfVar) throws zzhq {
        zzhm zzhmVar;
        URL url;
        long j2;
        long j3;
        boolean zZza;
        int i2;
        long j4;
        int i3;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j5;
        zzhm zzhmVar2 = this;
        zzhmVar2.zzg = zzhfVar;
        long j6 = 0;
        zzhmVar2.zzm = 0L;
        zzhmVar2.zzl = 0L;
        zzf(zzhfVar);
        try {
            url = new URL(zzhfVar.zza.toString());
            j2 = zzhfVar.zze;
            j3 = zzhfVar.zzf;
            zZza = zzhfVar.zza(1);
            i2 = 0;
            try {
            } catch (IOException e2) {
                e = e2;
                zzhmVar = this;
            }
        } catch (IOException e3) {
            e = e3;
            zzhmVar = zzhmVar2;
        }
        if (zzhmVar2.zza) {
            int i5 = 0;
            while (true) {
                int i7 = i2 + 1;
                if (i2 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i7);
                    throw new zzhq(new NoRouteToHostException(sb.toString()), zzhfVar, 2001, 1);
                }
                j4 = j6;
                i3 = i5;
                zzhmVar2 = this;
                HttpURLConnection httpURLConnectionZzk2 = zzhmVar2.zzk(url, 1, null, j2, j3, zZza, false, zzhfVar.zzd);
                URL url2 = url;
                long j7 = j3;
                zzhmVar = zzhmVar2;
                try {
                    int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZzk2);
                    String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                    if (iHttpUrlConnectionGetResponseCode != 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                        httpURLConnectionZzk = httpURLConnectionZzk2;
                        break;
                    }
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnectionZzk2);
                    URL urlZzl = zzhmVar.zzl(url2, headerField, zzhfVar);
                    j3 = j7;
                    url = urlZzl;
                    i5 = i3;
                    i2 = i7;
                    j6 = j4;
                } catch (IOException e4) {
                    e = e4;
                }
                zzhmVar.zzm();
                throw zzhq.zza(e, zzhfVar, 1);
            }
        }
        httpURLConnectionZzk = zzhmVar2.zzk(url, 1, null, j2, j3, zZza, true, zzhfVar.zzd);
        zzhmVar = this;
        j4 = 0;
        i3 = 0;
        zzhmVar.zzh = httpURLConnectionZzk;
        zzhmVar.zzk = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnectionZzk);
        String responseMessage = httpURLConnectionZzk.getResponseMessage();
        int i8 = zzhmVar.zzk;
        if (i8 < 200 || i8 > 299) {
            Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
            if (zzhmVar.zzk == 416) {
                if (zzhfVar.zze == zzhv.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                    zzhmVar.zzj = true;
                    zzg(zzhfVar);
                    long j9 = zzhfVar.zzf;
                    return j9 != -1 ? j9 : j4;
                }
            }
            InputStream errorStream = httpURLConnectionZzk.getErrorStream();
            try {
                bArrZza = errorStream != null ? zzgxf.zza(errorStream) : zzfj.zzb;
            } catch (IOException unused) {
                bArrZza = zzfj.zzb;
            }
            zzhmVar.zzm();
            throw new zzhs(zzhmVar.zzk, responseMessage, zzhmVar.zzk == 416 ? new zzhc(2008) : null, headerFields, zzhfVar, bArrZza);
        }
        httpURLConnectionZzk.getContentType();
        if (zzhmVar.zzk == 200) {
            j5 = zzhfVar.zze;
            if (j5 == j4) {
                j5 = j4;
            }
        }
        boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
        if (zEqualsIgnoreCase) {
            zzhmVar.zzl = zzhfVar.zzf;
        } else {
            long j10 = zzhfVar.zzf;
            if (j10 != -1) {
                zzhmVar.zzl = j10;
            } else {
                long jZzb = zzhv.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                zzhmVar.zzl = jZzb != -1 ? jZzb - j5 : -1L;
            }
        }
        try {
            zzhmVar.zzi = AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnectionZzk);
            if (zEqualsIgnoreCase) {
                zzhmVar.zzi = new GZIPInputStream(zzhmVar.zzi);
            }
            zzhmVar.zzj = true;
            zzg(zzhfVar);
            if (j5 != j4) {
                try {
                    byte[] bArr = new byte[4096];
                    while (j5 > j4) {
                        int iMin = (int) Math.min(j5, 4096L);
                        InputStream inputStream = zzhmVar.zzi;
                        String str = zzfj.zza;
                        int i9 = inputStream.read(bArr, i3, iMin);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new zzhq(new InterruptedIOException(), zzhfVar, 2000, 1);
                        }
                        if (i9 == -1) {
                            throw new zzhq(zzhfVar, 2008, 1);
                        }
                        j5 -= (long) i9;
                        zzhmVar.zzh(i9);
                    }
                } catch (IOException e5) {
                    zzhmVar.zzm();
                    if (e5 instanceof zzhq) {
                        throw ((zzhq) e5);
                    }
                    throw new zzhq(e5, zzhfVar, 2000, 1);
                }
            }
            return zzhmVar.zzl;
        } catch (IOException e6) {
            zzhmVar.zzm();
            throw new zzhq(e6, zzhfVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhf zzhfVar = this.zzg;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgui.zza() : new zzhl(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i2, @Nullable byte[] bArr, long j2, long j3, boolean z2, boolean z3, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j2 == 0) {
            if (j3 == -1) {
                string = null;
            } else {
                j2 = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("bytes=");
                sb.append(j2);
                sb.append("-");
                if (j3 != -1) {
                }
                string = sb.toString();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j2);
            sb2.append("-");
            if (j3 != -1) {
                sb2.append((j2 + j3) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        if (true != z2) {
            str = "identity";
        } else {
            str = "gzip";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(false);
        int i3 = zzhf.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }
}
