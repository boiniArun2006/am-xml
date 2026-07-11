package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzcic extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzht zzg;
    private zzhf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    zzcic(String str, zzhz zzhzVar, int i2, int i3, int i5) {
        super(true);
        this.zzc = new zzcib(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzht();
        this.zzd = i2;
        this.zze = i3;
        this.zzq = i5;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzhq(e2, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            } catch (Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e2);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws zzhq {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j2 = this.zzo;
                    long j3 = this.zzm;
                    if (j2 == j3) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i5 = this.zzj.read(bArr2, 0, (int) Math.min(j3 - j2, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i5 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i5;
                    zzh(i5);
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.zzn;
            if (j4 != -1) {
                long j5 = j4 - this.zzp;
                if (j5 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j5);
            }
            int i7 = this.zzj.read(bArr, i2, i3);
            if (i7 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i7;
            zzh(i7);
            return i7;
        } catch (IOException e2) {
            throw new zzhq(e2, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x028d, B:98:0x029a, B:100:0x02ab, B:103:0x02b4, B:104:0x02c1, B:106:0x02cb, B:107:0x02d2, B:108:0x02d3, B:109:0x02f0), top: B:116:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029a A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x028d, B:98:0x029a, B:100:0x02ab, B:103:0x02b4, B:104:0x02c1, B:106:0x02cb, B:107:0x02d2, B:108:0x02d3, B:109:0x02f0), top: B:116:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhf zzhfVar) throws zzhq {
        long j2;
        long j3;
        int iHttpUrlConnectionGetResponseCode;
        String headerField;
        long j4;
        long jMax;
        String headerField2;
        this.zzh = zzhfVar;
        long j5 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j6 = zzhfVar.zze;
            long j7 = zzhfVar.zzf;
            boolean zZza = zzhfVar.zza(1);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                long j9 = j5;
                if (i2 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i3);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Iterator it = this.zzg.zza().entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j6 != j9) {
                    j2 = j6;
                } else if (j7 != -1) {
                    j2 = j9;
                } else {
                    j3 = j6;
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zZza) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (iHttpUrlConnectionGetResponseCode == 300 && iHttpUrlConnectionGetResponseCode != 301 && iHttpUrlConnectionGetResponseCode != 302 && iHttpUrlConnectionGetResponseCode != 303 && iHttpUrlConnectionGetResponseCode != 307 && iHttpUrlConnectionGetResponseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int iHttpUrlConnectionGetResponseCode2 = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                            this.zzl = iHttpUrlConnectionGetResponseCode2;
                            if (iHttpUrlConnectionGetResponseCode2 < 200 || iHttpUrlConnectionGetResponseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzhs zzhsVar = new zzhs(this.zzl, null, null, headerFields, zzhfVar, zzfj.zzb);
                                if (this.zzl != 416) {
                                    throw zzhsVar;
                                }
                                zzhsVar.initCause(new zzhc(2008));
                                throw zzhsVar;
                            }
                            if (iHttpUrlConnectionGetResponseCode2 == 200) {
                                j4 = zzhfVar.zze;
                                if (j4 == j9) {
                                    j4 = j9;
                                }
                            }
                            this.zzm = j4;
                            if (zzhfVar.zza(1)) {
                                this.zzn = zzhfVar.zzf;
                            } else {
                                long j10 = zzhfVar.zzf;
                                if (j10 != -1) {
                                    this.zzn = j10;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField3)) {
                                        jMax = -1;
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                        }
                                        this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                                            sb2.append("Unexpected Content-Length [");
                                            sb2.append(headerField3);
                                            sb2.append("]");
                                            String string = sb2.toString();
                                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
                                            jMax = -1;
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zza.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long j11 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (jMax < j9) {
                                                        jMax = j11;
                                                    } else if (jMax != j11) {
                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                        sb3.append("Inconsistent headers [");
                                                        sb3.append(headerField3);
                                                        sb3.append("] [");
                                                        sb3.append(headerField2);
                                                        sb3.append("]");
                                                        String string2 = sb3.toString();
                                                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                                                        jMax = Math.max(jMax, j11);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                                    sb4.append("Unexpected Content-Range [");
                                                    sb4.append(headerField2);
                                                    sb4.append("]");
                                                    String string3 = sb4.toString();
                                                    int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzf(string3);
                                                }
                                            }
                                        }
                                        this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                    }
                                }
                            }
                            try {
                                this.zzj = AdMobNetworkBridge.urlConnectionGetInputStream(this.zzi);
                                this.zzk = true;
                                zzg(zzhfVar);
                                return this.zzn;
                            } catch (IOException e2) {
                                zzn();
                                throw new zzhq(e2, zzhfVar, 2000, 1);
                            }
                        } catch (IOException e3) {
                            zzn();
                            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e3, zzhfVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !g.f62375e.equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i2 = i3;
                    j5 = j9;
                    j6 = j3;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(j2).length() + 7);
                sb5.append("bytes=");
                long j12 = j2;
                sb5.append(j12);
                sb5.append("-");
                String string4 = sb5.toString();
                if (j7 != -1) {
                    long j13 = (j12 + j7) - 1;
                    j3 = j6;
                    StringBuilder sb6 = new StringBuilder(string4.length() + String.valueOf(j13).length());
                    sb6.append(string4);
                    sb6.append(j13);
                    string4 = sb6.toString();
                } else {
                    j3 = j6;
                }
                httpURLConnection.setRequestProperty("Range", string4);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zZza) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                if (iHttpUrlConnectionGetResponseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                if (headerField != null) {
                }
            }
        } catch (IOException e4) {
            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e4, zzhfVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    @Nullable
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i2) {
        this.zzq = i2;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }
}
