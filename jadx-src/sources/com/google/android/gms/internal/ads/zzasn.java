package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class zzasn implements zzarr {
    protected final zzasp zza;
    private final zzasm zzb;

    public zzasn(zzasm zzasmVar) {
        zzasp zzaspVar = new zzasp(4096);
        this.zzb = zzasmVar;
        this.zza = zzaspVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    @Override // com.google.android.gms.internal.ads.zzarr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaru zza(zzary zzaryVar) throws Throwable {
        byte[] bArr;
        zzash zzartVar;
        String str;
        int iZzo;
        Map map;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            zzasw zzaswVar = null;
            try {
                zzarh zzarhVarZzk = zzaryVar.zzk();
                if (zzarhVarZzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = zzarhVarZzk.zzb;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j2 = zzarhVarZzk.zzd;
                    if (j2 > 0) {
                        map2.put("If-Modified-Since", zzasv.zzc(j2));
                    }
                    map = map2;
                }
                zzasw zzaswVarZza = this.zzb.zza(zzaryVar, map);
                try {
                    int iZza = zzaswVarZza.zza();
                    List listZzb = zzaswVarZza.zzb();
                    if (iZza == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzarh zzarhVarZzk2 = zzaryVar.zzk();
                        if (zzarhVarZzk2 == null) {
                            return new zzaru(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, (byte[]) null, true, jElapsedRealtime2, listZzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzb.isEmpty()) {
                            Iterator it = listZzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzarq) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzb);
                        List list = zzarhVarZzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzarq zzarqVar : zzarhVarZzk2.zzh) {
                                    if (!treeSet.contains(zzarqVar.zza())) {
                                        arrayList.add(zzarqVar);
                                    }
                                }
                            }
                        } else if (!zzarhVarZzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzarhVarZzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzaru(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, zzarhVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzd = zzaswVarZza.zzd();
                    if (inputStreamZzd != null) {
                        int iZzc = zzaswVarZza.zzc();
                        zzasp zzaspVar = this.zza;
                        zzata zzataVar = new zzata(zzaspVar, iZzc);
                        try {
                            bArrZza = zzaspVar.zza(1024);
                            while (true) {
                                try {
                                    int i2 = inputStreamZzd.read(bArrZza);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    zzataVar.write(bArrZza, 0, i2);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzd.close();
                                        break;
                                    } catch (IOException unused) {
                                        zzask.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaspVar.zzb(bArrZza);
                                    zzataVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzataVar.toByteArray();
                            try {
                                inputStreamZzd.close();
                            } catch (IOException unused2) {
                                zzask.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaspVar.zzb(bArrZza);
                            zzataVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZza = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzask.zzb || jElapsedRealtime3 > 3000) {
                            zzask.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzaryVar, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : V8ValueNull.NULL, Integer.valueOf(iZza), Integer.valueOf(zzaryVar.zzy().zzb()));
                        }
                        if (iZza < 200 || iZza > 299) {
                            throw new IOException();
                        }
                        return new zzaru(iZza, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                    } catch (IOException e2) {
                        e = e2;
                        zzaswVar = zzaswVarZza;
                        bArr = bArr2;
                        if (!(e instanceof SocketTimeoutException)) {
                            zzartVar = new zzasg();
                            str = "socket";
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaryVar.zzh())), e);
                            }
                            if (zzaswVar == null) {
                                throw new zzarv(e);
                            }
                            int iZza2 = zzaswVar.zza();
                            zzask.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza2), zzaryVar.zzh());
                            if (bArr != null) {
                                zzaru zzaruVar = new zzaru(iZza2, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaswVar.zzb());
                                if (iZza2 != 401 && iZza2 != 403) {
                                    if (iZza2 < 400 || iZza2 > 499) {
                                        throw new zzasf(zzaruVar);
                                    }
                                    throw new zzarl(zzaruVar);
                                }
                                zzartVar = new zzarg(zzaruVar);
                                str = "auth";
                            } else {
                                zzartVar = new zzart();
                                str = a.f62814d;
                            }
                        }
                        zzarm zzarmVarZzy = zzaryVar.zzy();
                        iZzo = zzaryVar.zzo();
                        try {
                            zzarmVarZzy.zzc(zzartVar);
                            zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                        } catch (zzash e3) {
                            zzaryVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iZzo)));
                            throw e3;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    bArr = null;
                    zzaswVar = zzaswVarZza;
                    if (!(e instanceof SocketTimeoutException)) {
                    }
                    zzarm zzarmVarZzy2 = zzaryVar.zzy();
                    iZzo = zzaryVar.zzo();
                    zzarmVarZzy2.zzc(zzartVar);
                    zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                }
            } catch (IOException e5) {
                e = e5;
                bArr = null;
            }
            zzaryVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
        }
    }
}
