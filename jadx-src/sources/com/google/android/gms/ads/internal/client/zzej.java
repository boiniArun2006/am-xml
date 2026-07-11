package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzej {
    private String zzg;
    private String zzi;
    private String zzj;
    private boolean zzl;
    private String zzm;
    private long zzo;
    private final HashSet zza = new HashSet();
    private final Bundle zzb = new Bundle();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final Bundle zze = new Bundle();
    private final HashSet zzf = new HashSet();
    private final List zzh = new ArrayList();
    private int zzk = -1;
    private int zzn = 60000;

    final /* synthetic */ String zzA() {
        return this.zzj;
    }

    final /* synthetic */ int zzB() {
        return this.zzk;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzl;
    }

    final /* synthetic */ String zzD() {
        return this.zzm;
    }

    final /* synthetic */ int zzE() {
        return this.zzn;
    }

    final /* synthetic */ long zzF() {
        return this.zzo;
    }

    public final void zzg(String str) {
        this.zzg = str;
    }

    public final void zzi(String str) {
        this.zzi = str;
    }

    public final void zzj(String str) {
        this.zzj = str;
    }

    @Deprecated
    public final void zzk(boolean z2) {
        this.zzk = z2 ? 1 : 0;
    }

    @Deprecated
    public final void zzn(boolean z2) {
        this.zzl = z2;
    }

    public final void zzo(String str) {
        this.zzm = str;
    }

    public final void zzp(int i2) {
        this.zzn = i2;
    }

    public final void zzq(long j2) {
        this.zzo = j2;
    }

    final /* synthetic */ HashSet zzr() {
        return this.zza;
    }

    final /* synthetic */ Bundle zzs() {
        return this.zzb;
    }

    final /* synthetic */ HashMap zzt() {
        return this.zzc;
    }

    final /* synthetic */ HashSet zzu() {
        return this.zzd;
    }

    final /* synthetic */ Bundle zzv() {
        return this.zze;
    }

    final /* synthetic */ HashSet zzw() {
        return this.zzf;
    }

    final /* synthetic */ String zzx() {
        return this.zzg;
    }

    final /* synthetic */ List zzy() {
        return this.zzh;
    }

    final /* synthetic */ String zzz() {
        return this.zzi;
    }

    public final void zza(String str) {
        this.zza.add(str);
    }

    public final void zzb(Bundle bundle) {
        this.zzb.putAll(bundle);
    }

    public final void zzc(Class cls, @Nullable Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    public final void zzd(Class cls, Bundle bundle) {
        Bundle bundle2 = this.zzb;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zze(String str) {
        this.zzd.add(str);
    }

    public final void zzf(String str) {
        this.zzd.remove(AdRequest.DEVICE_ID_EMULATOR);
    }

    public final void zzh(List list) {
        List list2 = this.zzh;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    public final void zzl(String str, String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzm(String str) {
        this.zzf.add(str);
    }
}
