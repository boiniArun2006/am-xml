package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfjj {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzga zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;

    @Nullable
    private zzbkh zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzco zzl;

    @Nullable
    private zzbqs zzn;

    @Nullable
    private zzerp zzr;
    private Bundle zzt;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzcs zzw;
    private int zzm = 1;
    private final zzfix zzo = new zzfix();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final boolean zzB() {
        return this.zzp;
    }

    public final boolean zzC() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzD() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzE() {
        return this.zzb;
    }

    final /* synthetic */ String zzF() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzga zzG() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzH() {
        return this.zze;
    }

    final /* synthetic */ ArrayList zzI() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzJ() {
        return this.zzg;
    }

    final /* synthetic */ zzbkh zzK() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzL() {
        return this.zzi;
    }

    final /* synthetic */ AdManagerAdViewOptions zzM() {
        return this.zzj;
    }

    final /* synthetic */ PublisherAdViewOptions zzN() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzco zzO() {
        return this.zzl;
    }

    final /* synthetic */ int zzP() {
        return this.zzm;
    }

    final /* synthetic */ zzbqs zzQ() {
        return this.zzn;
    }

    final /* synthetic */ zzfix zzR() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzS() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzT() {
        return this.zzq;
    }

    final /* synthetic */ zzerp zzU() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzV() {
        return this.zzs;
    }

    final /* synthetic */ Bundle zzW() {
        return this.zzt;
    }

    final /* synthetic */ AtomicLong zzX() {
        return this.zzu;
    }

    final /* synthetic */ boolean zzY() {
        return this.zzv;
    }

    public final zzfjj zzZ(@Nullable com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzw = zzcsVar;
        return this;
    }

    public final zzfjj zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcs zzaa() {
        return this.zzw;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzfjj zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzfjj zzd(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final zzfjj zze(boolean z2) {
        this.zzq = z2;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzfjj zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfjj zzi(@Nullable com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        this.zzd = zzgaVar;
        return this;
    }

    public final zzfix zzj() {
        return this.zzo;
    }

    public final zzfjj zzk(boolean z2) {
        this.zze = z2;
        return this;
    }

    public final zzfjj zzl(int i2) {
        this.zzm = i2;
        return this;
    }

    public final zzfjj zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfjj zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfjj zzo(@Nullable zzbkh zzbkhVar) {
        this.zzh = zzbkhVar;
        return this;
    }

    public final zzfjj zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzfjj zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzfjj zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfjj zzt(@Nullable zzerp zzerpVar) {
        this.zzr = zzerpVar;
        return this;
    }

    public final zzfjj zzu(boolean z2) {
        this.zzs = true;
        return this;
    }

    public final zzfjj zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfjj zzy(boolean z2) {
        this.zzv = true;
        return this;
    }

    public final zzfjk zzA() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfjk(this, null);
    }

    public final zzfjj zzq(@Nullable zzbqs zzbqsVar) {
        this.zzn = zzbqsVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzga(false, true, false);
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfjj zzx(long j2) {
        this.zzu.set(j2);
        return this;
    }

    public final zzfjj zzz(zzfjk zzfjkVar) {
        this.zzo.zza(zzfjkVar.zzp.zza);
        this.zza = zzfjkVar.zzd;
        this.zzb = zzfjkVar.zzf;
        this.zzw = zzfjkVar.zzw;
        this.zzc = zzfjkVar.zzg;
        this.zzd = zzfjkVar.zza;
        this.zzf = zzfjkVar.zzh;
        this.zzg = zzfjkVar.zzi;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzfjkVar.zzk;
        zzs(zzfjkVar.zzm);
        zzr(zzfjkVar.zzn);
        this.zzp = zzfjkVar.zzq;
        this.zzq = zzfjkVar.zzr;
        this.zzr = zzfjkVar.zzc;
        this.zzs = zzfjkVar.zzs;
        this.zzt = zzfjkVar.zzt;
        this.zzu.set(zzfjkVar.zzu.get());
        this.zzv = zzfjkVar.zzv;
        return this;
    }
}
