package com.google.android.gms.internal.ads;

import android.graphics.Trmy.yioUaKMByL;
import androidx.core.database.sqlite.cL.PtsLKY;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbgj {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zza extends zzibr<zza, zzb> implements zzf {
        private static final zza zzB;
        private static volatile zzidk<zza> zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private int zzl;
        private int zzm;
        private zzg zzo;
        private zzi zzp;
        private zzk zzv;
        private zzah zzw;
        private zzac zzx;
        private zzx zzy;
        private zzz zzz;
        private int zzn = 1000;
        private zzicd<zzd> zzu = zzibr.zzbM();
        private zzicd<zzat> zzA = zzibr.zzbM();

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public enum EnumC0774zza implements zzibv {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);

            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zzibw<EnumC0774zza> zzy = new zzibw<EnumC0774zza>() { // from class: com.google.android.gms.internal.ads.zzbgj.zza.zza.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public EnumC0774zza zzb(int i2) {
                    return EnumC0774zza.zzc(i2);
                }
            };
            private final int zzz;

            public static EnumC0774zza zzc(int i2) {
                switch (i2) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzibw<EnumC0774zza> zzd() {
                return zzy;
            }

            public static zzibx zze() {
                return C0775zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzz);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzz;
            }

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$zza$zza$zza, reason: collision with other inner class name */
            final class C0775zza implements zzibx {
                static final zzibx zza = new C0775zza();

                private C0775zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (EnumC0774zza.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnumC0774zza(int i2) {
                this.zzz = i2;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zzb extends zzibl<zza, zzb> implements zzf {
            /* synthetic */ zzb(byte[] bArr) {
                this();
            }

            private zzb() {
                super(zza.zzB);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzG() {
                return ((zza) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzk zzH() {
                return ((zza) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzM() {
                return ((zza) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzah zzN() {
                return ((zza) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzS() {
                return ((zza) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzac zzT() {
                return ((zza) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzY() {
                return ((zza) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzx zzZ() {
                return ((zza) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zza() {
                return ((zza) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzz zzaf() {
                return ((zza) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public List<zzat> zzak() {
                return Collections.unmodifiableList(((zza) this.zza).zzak());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public int zzal() {
                return ((zza) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzat zzam(int i2) {
                return ((zza) this.zza).zzam(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public EnumC0774zza zzb() {
                return ((zza) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zze() {
                return ((zza) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzq zzf() {
                return ((zza) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzi() {
                return ((zza) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzg zzj() {
                return ((zza) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public boolean zzo() {
                return ((zza) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzi zzp() {
                return ((zza) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public List<zzd> zzu() {
                return Collections.unmodifiableList(((zza) this.zza).zzu());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public int zzv() {
                return ((zza) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzf
            public zzd zzw(int i2) {
                return ((zza) this.zza).zzw(i2);
            }

            public zzb zzA(int i2, zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzX(i2, zzdVar);
                return this;
            }

            public zzb zzB(zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzW(zzbVar.zzbu());
                return this;
            }

            public zzb zzC(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzX(i2, zzbVar.zzbu());
                return this;
            }

            public zzb zzD(Iterable<? extends zzd> iterable) {
                zzbg();
                ((zza) this.zza).zzaa(iterable);
                return this;
            }

            public zzb zzE() {
                zzbg();
                ((zza) this.zza).zzab();
                return this;
            }

            public zzb zzF(int i2) {
                zzbg();
                ((zza) this.zza).zzac(i2);
                return this;
            }

            public zzb zzI(zzk zzkVar) {
                zzbg();
                ((zza) this.zza).zzad(zzkVar);
                return this;
            }

            public zzb zzJ(zzk.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzad(zzaVar.zzbu());
                return this;
            }

            public zzb zzK(zzk zzkVar) {
                zzbg();
                ((zza) this.zza).zzag(zzkVar);
                return this;
            }

            public zzb zzL() {
                zzbg();
                ((zza) this.zza).zzah();
                return this;
            }

            public zzb zzO(zzah zzahVar) {
                zzbg();
                ((zza) this.zza).zzai(zzahVar);
                return this;
            }

            public zzb zzP(zzah.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzai(zzaVar.zzbu());
                return this;
            }

            public zzb zzQ(zzah zzahVar) {
                zzbg();
                ((zza) this.zza).zzaj(zzahVar);
                return this;
            }

            public zzb zzR() {
                zzbg();
                ((zza) this.zza).zzan();
                return this;
            }

            public zzb zzU(zzac zzacVar) {
                zzbg();
                ((zza) this.zza).zzao(zzacVar);
                return this;
            }

            public zzb zzV(zzac.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzao(zzaVar.zzbu());
                return this;
            }

            public zzb zzW(zzac zzacVar) {
                zzbg();
                ((zza) this.zza).zzap(zzacVar);
                return this;
            }

            public zzb zzX() {
                zzbg();
                ((zza) this.zza).zzaq();
                return this;
            }

            public zzb zzaa(zzx zzxVar) {
                zzbg();
                ((zza) this.zza).zzar(zzxVar);
                return this;
            }

            public zzb zzab(zzx.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzar(zzaVar.zzbu());
                return this;
            }

            public zzb zzac(zzx zzxVar) {
                zzbg();
                ((zza) this.zza).zzas(zzxVar);
                return this;
            }

            public zzb zzad() {
                zzbg();
                ((zza) this.zza).zzat();
                return this;
            }

            public zzb zzag(zzz zzzVar) {
                zzbg();
                ((zza) this.zza).zzau(zzzVar);
                return this;
            }

            public zzb zzah(zzz.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzau(zzaVar.zzbu());
                return this;
            }

            public zzb zzai(zzz zzzVar) {
                zzbg();
                ((zza) this.zza).zzav(zzzVar);
                return this;
            }

            public zzb zzaj() {
                zzbg();
                ((zza) this.zza).zzaw();
                return this;
            }

            public zzb zzan(int i2, zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzax(i2, zzatVar);
                return this;
            }

            public zzb zzao(int i2, zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzax(i2, zzaVar.zzbu());
                return this;
            }

            public zzb zzap(zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzay(zzatVar);
                return this;
            }

            public zzb zzaq(int i2, zzat zzatVar) {
                zzbg();
                ((zza) this.zza).zzaz(i2, zzatVar);
                return this;
            }

            public zzb zzar(zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzay(zzaVar.zzbu());
                return this;
            }

            public zzb zzas(int i2, zzat.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzaz(i2, zzaVar.zzbu());
                return this;
            }

            public zzb zzat(Iterable<? extends zzat> iterable) {
                zzbg();
                ((zza) this.zza).zzaA(iterable);
                return this;
            }

            public zzb zzau() {
                zzbg();
                ((zza) this.zza).zzaB();
                return this;
            }

            public zzb zzav(int i2) {
                zzbg();
                ((zza) this.zza).zzaC(i2);
                return this;
            }

            public zzb zzc(EnumC0774zza enumC0774zza) {
                zzbg();
                ((zza) this.zza).zzF(enumC0774zza);
                return this;
            }

            public zzb zzd() {
                zzbg();
                ((zza) this.zza).zzI();
                return this;
            }

            public zzb zzg(zzq zzqVar) {
                zzbg();
                ((zza) this.zza).zzJ(zzqVar);
                return this;
            }

            public zzb zzh() {
                zzbg();
                ((zza) this.zza).zzK();
                return this;
            }

            public zzb zzk(zzg zzgVar) {
                zzbg();
                ((zza) this.zza).zzL(zzgVar);
                return this;
            }

            public zzb zzl(zzg.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzL(zzaVar.zzbu());
                return this;
            }

            public zzb zzm(zzg zzgVar) {
                zzbg();
                ((zza) this.zza).zzO(zzgVar);
                return this;
            }

            public zzb zzn() {
                zzbg();
                ((zza) this.zza).zzP();
                return this;
            }

            public zzb zzq(zzi zziVar) {
                zzbg();
                ((zza) this.zza).zzQ(zziVar);
                return this;
            }

            public zzb zzr(zzi.zza zzaVar) {
                zzbg();
                ((zza) this.zza).zzQ(zzaVar.zzbu());
                return this;
            }

            public zzb zzs(zzi zziVar) {
                zzbg();
                ((zza) this.zza).zzR(zziVar);
                return this;
            }

            public zzb zzt() {
                zzbg();
                ((zza) this.zza).zzU();
                return this;
            }

            public zzb zzx(int i2, zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzV(i2, zzdVar);
                return this;
            }

            public zzb zzy(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zza) this.zza).zzV(i2, zzbVar.zzbu());
                return this;
            }

            public zzb zzz(zzd zzdVar) {
                zzbg();
                ((zza) this.zza).zzW(zzdVar);
                return this;
            }
        }

        public static zza zzD() {
            return zzB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzl &= -2;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzl &= -3;
            this.zzn = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzo = null;
            this.zzl &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzz = null;
            this.zzl &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzp = null;
            this.zzl &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzv = null;
            this.zzl &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzan() {
            this.zzw = null;
            this.zzl &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzaq() {
            this.zzx = null;
            this.zzl &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzat() {
            this.zzy = null;
            this.zzl &= -129;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzG() {
            return (this.zzl & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzM() {
            return (this.zzl & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzS() {
            return (this.zzl & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzY() {
            return (this.zzl & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zza() {
            return (this.zzl & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzae() {
            return (this.zzl & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public List<zzat> zzak() {
            return this.zzA;
        }

        public List<? extends zze> zzc() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zze() {
            return (this.zzl & 2) != 0;
        }

        public List<? extends zzbi> zzg() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzi() {
            return (this.zzl & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public boolean zzo() {
            return (this.zzl & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public List<zzd> zzu() {
            return this.zzu;
        }

        static {
            zza zzaVar = new zza();
            zzB = zzaVar;
            zzibr.zzbu(zza.class, zzaVar);
        }

        public static zza zzA(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zza) zzibr.zzbZ(zzB, zziaqVar, zzibbVar);
        }

        public static zzb zzB() {
            return (zzb) zzB.zzbn();
        }

        public static zzb zzC(zza zzaVar) {
            return (zzb) zzB.zzbo(zzaVar);
        }

        public static zzidk<zza> zzE() {
            return zzB.zzbd();
        }

        private void zzcC() {
            zzicd<zzat> zzicdVar = this.zzA;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzA = zzibr.zzbN(zzicdVar);
        }

        private void zzcg() {
            zzicd<zzd> zzicdVar = this.zzu;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzu = zzibr.zzbN(zzicdVar);
        }

        public static zza zzk(ByteBuffer byteBuffer) throws zzicg {
            return (zza) zzibr.zzbR(zzB, byteBuffer);
        }

        public static zza zzl(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zza) zzibr.zzbQ(zzB, byteBuffer, zzibbVar);
        }

        public static zza zzm(zzian zzianVar) throws zzicg {
            return (zza) zzibr.zzbS(zzB, zzianVar);
        }

        public static zza zzn(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zza) zzibr.zzbT(zzB, zzianVar, zzibbVar);
        }

        public static zza zzq(byte[] bArr) throws zzicg {
            return (zza) zzibr.zzbU(zzB, bArr);
        }

        public static zza zzr(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zza) zzibr.zzbV(zzB, bArr, zzibbVar);
        }

        public static zza zzs(InputStream inputStream) throws IOException {
            return (zza) zzibr.zzbW(zzB, inputStream);
        }

        public static zza zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zza) zzibr.zzbX(zzB, inputStream, zzibbVar);
        }

        public static zza zzx(InputStream inputStream) throws IOException {
            return (zza) zzibr.zzca(zzB, inputStream);
        }

        public static zza zzy(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zza) zzibr.zzcb(zzB, inputStream, zzibbVar);
        }

        public static zza zzz(zziaq zziaqVar) throws IOException {
            return (zza) zzibr.zzbY(zzB, zziaqVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzk zzH() {
            zzk zzkVar = this.zzv;
            return zzkVar == null ? zzk.zzB() : zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzah zzN() {
            zzah zzahVar = this.zzw;
            return zzahVar == null ? zzah.zzE() : zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzac zzT() {
            zzac zzacVar = this.zzx;
            return zzacVar == null ? zzac.zzs() : zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzx zzZ() {
            zzx zzxVar = this.zzy;
            return zzxVar == null ? zzx.zzt() : zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzz zzaf() {
            zzz zzzVar = this.zzz;
            return zzzVar == null ? zzz.zzA() : zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public int zzal() {
            return this.zzA.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzat zzam(int i2) {
            return this.zzA.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public EnumC0774zza zzb() {
            EnumC0774zza enumC0774zzaZzc = EnumC0774zza.zzc(this.zzm);
            return enumC0774zzaZzc == null ? EnumC0774zza.AD_INITIATER_UNSPECIFIED : enumC0774zzaZzc;
        }

        public zze zzd(int i2) {
            return this.zzu.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzq zzf() {
            zzq zzqVarZzc = zzq.zzc(this.zzn);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        public zzbi zzh(int i2) {
            return this.zzA.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzg zzj() {
            zzg zzgVar = this.zzo;
            return zzgVar == null ? zzg.zzz() : zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzi zzp() {
            zzi zziVar = this.zzp;
            return zziVar == null ? zzi.zzD() : zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public int zzv() {
            return this.zzu.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzf
        public zzd zzw(int i2) {
            return this.zzu.get(i2);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzF(EnumC0774zza enumC0774zza) {
            this.zzm = enumC0774zza.zza();
            this.zzl |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzq zzqVar) {
            this.zzn = zzqVar.zza();
            this.zzl |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzL(zzg zzgVar) {
            zzgVar.getClass();
            this.zzo = zzgVar;
            this.zzl |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzO(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzo;
            if (zzgVar2 != null && zzgVar2 != zzg.zzz()) {
                zzg.zza zzaVarZzy = zzg.zzy(zzgVar2);
                zzaVarZzy.zzbo(zzgVar);
                zzgVar = zzaVarZzy.zzbt();
            }
            this.zzo = zzgVar;
            this.zzl |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzi zziVar) {
            zziVar.getClass();
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzav(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzz;
            if (zzzVar2 != null && zzzVar2 != zzz.zzA()) {
                zzz.zza zzaVarZzz = zzz.zzz(zzzVar2);
                zzaVarZzz.zzbo(zzzVar);
                zzzVar = zzaVarZzz.zzbt();
            }
            this.zzz = zzzVar;
            this.zzl |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzax(int i2, zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.set(i2, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzay(zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaz(int i2, zzat zzatVar) {
            zzatVar.getClass();
            zzcC();
            this.zzA.add(i2, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzaA(Iterable<? extends zzat> iterable) {
            zzcC();
            zzhzw.zzaW(iterable, this.zzA);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaB() {
            this.zzA = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcI, reason: merged with bridge method [inline-methods] */
        public void zzaC(int i2) {
            zzcC();
            this.zzA.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzR(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzp;
            if (zziVar2 != null && zziVar2 != zzi.zzD()) {
                zzi.zza zzaVarZzC = zzi.zzC(zziVar2);
                zzaVarZzC.zzbo(zziVar);
                zziVar = zzaVarZzC.zzbt();
            }
            this.zzp = zziVar;
            this.zzl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzV(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.set(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzW(zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzX(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzcg();
            this.zzu.add(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzaa(Iterable<? extends zzd> iterable) {
            zzcg();
            zzhzw.zzaW(iterable, this.zzu);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzu = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzac(int i2) {
            zzcg();
            this.zzu.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzad(zzk zzkVar) {
            zzkVar.getClass();
            this.zzv = zzkVar;
            this.zzl |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzag(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzv;
            if (zzkVar2 != null && zzkVar2 != zzk.zzB()) {
                zzk.zza zzaVarZzA = zzk.zzA(zzkVar2);
                zzaVarZzA.zzbo(zzkVar);
                zzkVar = zzaVarZzA.zzbt();
            }
            this.zzv = zzkVar;
            this.zzl |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzai(zzah zzahVar) {
            zzahVar.getClass();
            this.zzw = zzahVar;
            this.zzl |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzaj(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzw;
            if (zzahVar2 != null && zzahVar2 != zzah.zzE()) {
                zzah.zza zzaVarZzB = zzah.zzB(zzahVar2);
                zzaVarZzB.zzbo(zzahVar);
                zzahVar = zzaVarZzB.zzbt();
            }
            this.zzw = zzahVar;
            this.zzl |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzao(zzac zzacVar) {
            zzacVar.getClass();
            this.zzx = zzacVar;
            this.zzl |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzap(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzx;
            if (zzacVar2 != null && zzacVar2 != zzac.zzs()) {
                zzac.zza zzaVarZzr = zzac.zzr(zzacVar2);
                zzaVarZzr.zzbo(zzacVar);
                zzacVar = zzaVarZzr.zzbt();
            }
            this.zzx = zzacVar;
            this.zzl |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzar(zzx zzxVar) {
            zzxVar.getClass();
            this.zzy = zzxVar;
            this.zzl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzas(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzy;
            if (zzxVar2 != null && zzxVar2 != zzx.zzt()) {
                zzx.zza zzaVarZzs = zzx.zzs(zzxVar2);
                zzaVarZzs.zzbo(zzxVar);
                zzxVar = zzaVarZzs.zzbt();
            }
            this.zzy = zzxVar;
            this.zzl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzau(zzz zzzVar) {
            zzzVar.getClass();
            this.zzz = zzzVar;
            this.zzl |= 256;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zza> zzidkVar = zzC;
                                    if (zzidkVar == null) {
                                        synchronized (zza.class) {
                                            try {
                                                zzibmVar = zzC;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzB);
                                                    zzC = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzB;
                        }
                        return new zzb(bArr);
                    }
                    return new zza();
                }
                return zzibr.zzbv(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", EnumC0774zza.zze(), "zzn", zzq.zze(), "zzo", "zzp", "zzu", zzd.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzat.class});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface zzaa extends zzidd {
        boolean zza();

        zzv zzb();

        List<zzan> zzg();

        int zzh();

        zzan zzi(int i2);

        boolean zzs();

        zzq zzt();

        boolean zzw();

        zzap zzx();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public final class zzab extends zzibr<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzf;
        private static volatile zzidk<zzab> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzab, zza> implements zzae {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzab.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzae
            public boolean zza() {
                return ((zzab) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzae
            public zzc zzb() {
                return ((zzab) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzae
            public boolean zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzae
            public zzb zzf() {
                return ((zzab) this.zza).zzf();
            }

            public zza zzc(zzc zzcVar) {
                zzbg();
                ((zzab) this.zza).zzu(zzcVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzab) this.zza).zzv();
                return this;
            }

            public zza zzg(zzb zzbVar) {
                zzbg();
                ((zzab) this.zza).zzw(zzbVar);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzab) this.zza).zzx();
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        public enum zzb implements zzibv {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            zzb(1),
            THREE_G(2),
            LTE(4);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzibw<zzb> zzi = new zzibw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzab.zzb.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i2) {
                    return zzb.zzc(i2);
                }
            };
            private final int zzj;

            public static zzb zzc(int i2) {
                if (i2 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return zzb;
                }
                if (i2 == 2) {
                    return THREE_G;
                }
                if (i2 != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzibw<zzb> zzd() {
                return zzi;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzj;
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zzb.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i2) {
                this.zzj = i2;
            }
        }

        public enum zzc implements zzibv {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzibw<zzc> zzg = new zzibw<zzc>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzab.zzc.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzc zzb(int i2) {
                    return zzc.zzc(i2);
                }
            };
            private final int zzh;

            public static zzc zzc(int i2) {
                if (i2 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CELL;
                }
                if (i2 != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzibw<zzc> zzd() {
                return zzg;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzh;
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zzc.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzc(int i2) {
                this.zzh = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzab zzs() {
            return zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzae
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzae
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        static {
            zzab zzabVar = new zzab();
            zzf = zzabVar;
            zzibr.zzbu(zzab.class, zzabVar);
        }

        public static zzab zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzab) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzab zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzab) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzab zzg(zzian zzianVar) throws zzicg {
            return (zzab) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzab zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzab) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzab zzi(byte[] bArr) throws zzicg {
            return (zzab) zzibr.zzbU(zzf, bArr);
        }

        public static zzab zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzab) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzab zzk(InputStream inputStream) throws IOException {
            return (zzab) zzibr.zzbW(zzf, inputStream);
        }

        public static zzab zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzab) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzab zzm(InputStream inputStream) throws IOException {
            return (zzab) zzibr.zzca(zzf, inputStream);
        }

        public static zzab zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzab) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzab zzo(zziaq zziaqVar) throws IOException {
            return (zzab) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzab zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzab) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzab zzabVar) {
            return (zza) zzf.zzbo(zzabVar);
        }

        public static zzidk<zzab> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzae
        public zzc zzb() {
            zzc zzcVarZzc = zzc.zzc(this.zzd);
            return zzcVarZzc == null ? zzc.NETWORKTYPE_UNSPECIFIED : zzcVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzae
        public zzb zzf() {
            zzb zzbVarZzc = zzb.zzc(this.zze);
            return zzbVarZzc == null ? zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED : zzbVarZzc;
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(zzc zzcVar) {
            this.zzd = zzcVar.zza();
            this.zzc |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzab> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzab.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzab();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", zzc.zze(), "zze", zzb.zze()});
            }
            return (byte) 1;
        }
    }

    public final class zzac extends zzibr<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzf;
        private static volatile zzidk<zzac> zzg;
        private int zzc;
        private int zzd;
        private zzap zze;

        public final class zza extends zzibl<zzac, zza> implements zzad {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzac.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzad
            public boolean zza() {
                return ((zzac) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzad
            public zzq zzb() {
                return ((zzac) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzad
            public boolean zze() {
                return ((zzac) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzad
            public zzap zzf() {
                return ((zzac) this.zza).zzf();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzac) this.zza).zzu(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzac) this.zza).zzv();
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbg();
                ((zzac) this.zza).zzw(zzapVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbg();
                ((zzac) this.zza).zzw(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzac) this.zza).zzx(zzapVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzac) this.zza).zzy();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzac zzs() {
            return zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzad
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzad
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        static {
            zzac zzacVar = new zzac();
            zzf = zzacVar;
            zzibr.zzbu(zzac.class, zzacVar);
        }

        public static zzac zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzac) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzac zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzac) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzac zzg(zzian zzianVar) throws zzicg {
            return (zzac) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzac zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzac) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzac zzi(byte[] bArr) throws zzicg {
            return (zzac) zzibr.zzbU(zzf, bArr);
        }

        public static zzac zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzac) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzac zzk(InputStream inputStream) throws IOException {
            return (zzac) zzibr.zzbW(zzf, inputStream);
        }

        public static zzac zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzac) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzac zzm(InputStream inputStream) throws IOException {
            return (zzac) zzibr.zzca(zzf, inputStream);
        }

        public static zzac zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzac) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzac zzo(zziaq zziaqVar) throws IOException {
            return (zzac) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzac zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzac) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzac zzacVar) {
            return (zza) zzf.zzbo(zzacVar);
        }

        public static zzidk<zzac> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzad
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzd);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzad
        public zzap zzf() {
            zzap zzapVar = this.zze;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzac() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzap zzapVar) {
            zzapVar.getClass();
            this.zze = zzapVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zze;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zze = zzapVar;
            this.zzc |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzac> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzac.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzac();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            return (byte) 1;
        }
    }

    public interface zzad extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzap zzf();
    }

    public interface zzae extends zzidd {
        boolean zza();

        zzab.zzc zzb();

        boolean zze();

        zzab.zzb zzf();
    }

    public final class zzaf extends zzibr<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzv;
        private static volatile zzidk<zzaf> zzw;
        private int zzi;
        private int zzk;
        private int zzl;
        private long zzm;
        private long zzp;
        private int zzu;
        private zzicd<zza> zzj = zzibr.zzbM();
        private String zzn = "";
        private String zzo = "";

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        public final class zza extends zzibr<zza, C0776zza> implements zzb {
            private static final zza zzG;
            private static volatile zzidk<zza> zzH = null;
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzica<zzd.zza> zzx = new zzica<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzica
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd.zza zzb(int i2) {
                    zzd.zza zzaVarZzc = zzd.zza.zzc(i2);
                    if (zzaVarZzc == null) {
                        return zzd.zza.zza;
                    }
                    return zzaVarZzc;
                }
            };
            private int zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private long zzF;
            private int zzn;
            private long zzo;
            private int zzp;
            private long zzu;
            private long zzv;
            private zzibz zzw = zzibr.zzbC();
            private zzab zzy;
            private int zzz;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$zzaf$zza$zza, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
            public final class C0776zza extends zzibl<zza, C0776zza> implements zzb {
                /* synthetic */ C0776zza(byte[] bArr) {
                    this();
                }

                private C0776zza() {
                    super(zza.zzG);
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzD() {
                    return ((zza) this.zza).zzD();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzq zzE() {
                    return ((zza) this.zza).zzE();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzH() {
                    return ((zza) this.zza).zzH();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzq zzI() {
                    return ((zza) this.zza).zzI();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzL() {
                    return ((zza) this.zza).zzL();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzq zzM() {
                    return ((zza) this.zza).zzM();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzP() {
                    return ((zza) this.zza).zzP();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public int zzQ() {
                    return ((zza) this.zza).zzQ();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzq zzU() {
                    return ((zza) this.zza).zzU();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzd zzY() {
                    return ((zza) this.zza).zzY();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public long zzac() {
                    return ((zza) this.zza).zzac();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public long zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzq zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public long zzj() {
                    return ((zza) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public long zzn() {
                    return ((zza) this.zza).zzn();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public List<zzd.zza> zzq() {
                    return ((zza) this.zza).zzq();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public int zzr() {
                    return ((zza) this.zza).zzr();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzd.zza zzs(int i2) {
                    return ((zza) this.zza).zzs(i2);
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public boolean zzx() {
                    return ((zza) this.zza).zzx();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
                public zzab zzy() {
                    return ((zza) this.zza).zzy();
                }

                public C0776zza zzA(zzab.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzad(zzaVar.zzbu());
                    return this;
                }

                public C0776zza zzB(zzab zzabVar) {
                    zzbg();
                    ((zza) this.zza).zzae(zzabVar);
                    return this;
                }

                public C0776zza zzC() {
                    zzbg();
                    ((zza) this.zza).zzaf();
                    return this;
                }

                public C0776zza zzF(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzag(zzqVar);
                    return this;
                }

                public C0776zza zzG() {
                    zzbg();
                    ((zza) this.zza).zzah();
                    return this;
                }

                public C0776zza zzJ(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzai(zzqVar);
                    return this;
                }

                public C0776zza zzK() {
                    zzbg();
                    ((zza) this.zza).zzaj();
                    return this;
                }

                public C0776zza zzN(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzak(zzqVar);
                    return this;
                }

                public C0776zza zzO() {
                    zzbg();
                    ((zza) this.zza).zzal();
                    return this;
                }

                public C0776zza zzR(int i2) {
                    zzbg();
                    ((zza) this.zza).zzam(i2);
                    return this;
                }

                public C0776zza zzS() {
                    zzbg();
                    ((zza) this.zza).zzan();
                    return this;
                }

                public C0776zza zzV(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzao(zzqVar);
                    return this;
                }

                public C0776zza zzW() {
                    zzbg();
                    ((zza) this.zza).zzap();
                    return this;
                }

                public C0776zza zzZ(zzd zzdVar) {
                    zzbg();
                    ((zza) this.zza).zzaq(zzdVar);
                    return this;
                }

                public C0776zza zzaa() {
                    zzbg();
                    ((zza) this.zza).zzar();
                    return this;
                }

                public C0776zza zzad(long j2) {
                    zzbg();
                    ((zza) this.zza).zzas(j2);
                    return this;
                }

                public C0776zza zzae() {
                    zzbg();
                    ((zza) this.zza).zzat();
                    return this;
                }

                public C0776zza zzc(long j2) {
                    zzbg();
                    ((zza) this.zza).zzF(j2);
                    return this;
                }

                public C0776zza zzd() {
                    zzbg();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public C0776zza zzg(zzq zzqVar) {
                    zzbg();
                    ((zza) this.zza).zzJ(zzqVar);
                    return this;
                }

                public C0776zza zzh() {
                    zzbg();
                    ((zza) this.zza).zzK();
                    return this;
                }

                public C0776zza zzk(long j2) {
                    zzbg();
                    ((zza) this.zza).zzN(j2);
                    return this;
                }

                public C0776zza zzl() {
                    zzbg();
                    ((zza) this.zza).zzO();
                    return this;
                }

                public C0776zza zzo(long j2) {
                    zzbg();
                    ((zza) this.zza).zzR(j2);
                    return this;
                }

                public C0776zza zzp() {
                    zzbg();
                    ((zza) this.zza).zzS();
                    return this;
                }

                public C0776zza zzt(int i2, zzd.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzV(i2, zzaVar);
                    return this;
                }

                public C0776zza zzu(zzd.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzW(zzaVar);
                    return this;
                }

                public C0776zza zzv(Iterable<? extends zzd.zza> iterable) {
                    zzbg();
                    ((zza) this.zza).zzZ(iterable);
                    return this;
                }

                public C0776zza zzw() {
                    zzbg();
                    ((zza) this.zza).zzaa();
                    return this;
                }

                public C0776zza zzz(zzab zzabVar) {
                    zzbg();
                    ((zza) this.zza).zzad(zzabVar);
                    return this;
                }
            }

            public static zza zzB() {
                return zzG;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
            public void zzO() {
                this.zzn &= -5;
                this.zzu = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
            public void zzR(long j2) {
                this.zzn |= 8;
                this.zzv = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
            public void zzS() {
                this.zzn &= -9;
                this.zzv = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
            public void zzaf() {
                this.zzy = null;
                this.zzn &= -17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
            public void zzF(long j2) {
                this.zzn |= 1;
                this.zzo = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
            public void zzG() {
                this.zzn &= -2;
                this.zzo = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
            public void zzK() {
                this.zzn &= -3;
                this.zzp = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
            public void zzN(long j2) {
                this.zzn |= 4;
                this.zzu = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
            public void zzah() {
                this.zzn &= -33;
                this.zzz = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
            public void zzaj() {
                this.zzn &= -65;
                this.zzA = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
            public void zzal() {
                this.zzn &= -129;
                this.zzB = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
            public void zzam(int i2) {
                this.zzn |= 256;
                this.zzC = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
            public void zzan() {
                this.zzn &= -257;
                this.zzC = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
            public void zzap() {
                this.zzn &= -513;
                this.zzD = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
            public void zzar() {
                this.zzn &= -1025;
                this.zzE = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
            public void zzas(long j2) {
                this.zzn |= 2048;
                this.zzF = j2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
            public void zzat() {
                this.zzn &= -2049;
                this.zzF = 0L;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzD() {
                return (this.zzn & 32) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzH() {
                return (this.zzn & 64) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzL() {
                return (this.zzn & 128) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzP() {
                return (this.zzn & 256) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public int zzQ() {
                return this.zzC;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzT() {
                return (this.zzn & 512) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzX() {
                return (this.zzn & 1024) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zza() {
                return (this.zzn & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzab() {
                return (this.zzn & 2048) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public long zzac() {
                return this.zzF;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public long zzb() {
                return this.zzo;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zze() {
                return (this.zzn & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzi() {
                return (this.zzn & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public long zzj() {
                return this.zzu;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzm() {
                return (this.zzn & 8) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public long zzn() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public boolean zzx() {
                return (this.zzn & 16) != 0;
            }

            static {
                zza zzaVar = new zza();
                zzG = zzaVar;
                zzibr.zzbu(zza.class, zzaVar);
            }

            public static C0776zza zzA(zza zzaVar) {
                return (C0776zza) zzG.zzbo(zzaVar);
            }

            public static zzidk<zza> zzC() {
                return zzG.zzbd();
            }

            private void zzaD() {
                zzibz zzibzVar = this.zzw;
                if (zzibzVar.zza()) {
                    return;
                }
                this.zzw = zzibr.zzbD(zzibzVar);
            }

            public static zza zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zza) zzibr.zzbR(zzG, byteBuffer);
            }

            public static zza zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbQ(zzG, byteBuffer, zzibbVar);
            }

            public static zza zzg(zzian zzianVar) throws zzicg {
                return (zza) zzibr.zzbS(zzG, zzianVar);
            }

            public static zza zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbT(zzG, zzianVar, zzibbVar);
            }

            public static zza zzk(byte[] bArr) throws zzicg {
                return (zza) zzibr.zzbU(zzG, bArr);
            }

            public static zza zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbV(zzG, bArr, zzibbVar);
            }

            public static zza zzo(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzbW(zzG, inputStream);
            }

            public static zza zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbX(zzG, inputStream, zzibbVar);
            }

            public static zza zzt(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzca(zzG, inputStream);
            }

            public static zza zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzcb(zzG, inputStream, zzibbVar);
            }

            public static zza zzv(zziaq zziaqVar) throws IOException {
                return (zza) zzibr.zzbY(zzG, zziaqVar);
            }

            public static zza zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbZ(zzG, zziaqVar, zzibbVar);
            }

            public static C0776zza zzz() {
                return (C0776zza) zzG.zzbn();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzq zzE() {
                zzq zzqVarZzc = zzq.zzc(this.zzz);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzq zzI() {
                zzq zzqVarZzc = zzq.zzc(this.zzA);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzq zzM() {
                zzq zzqVarZzc = zzq.zzc(this.zzB);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzq zzU() {
                zzq zzqVarZzc = zzq.zzc(this.zzD);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzd zzY() {
                zzd zzdVarZzc = zzd.zzc(this.zzE);
                return zzdVarZzc == null ? zzd.UNSPECIFIED : zzdVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzq zzf() {
                zzq zzqVarZzc = zzq.zzc(this.zzp);
                return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public List<zzd.zza> zzq() {
                return new zzicb(this.zzw, zzx);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public int zzr() {
                return this.zzw.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzd.zza zzs(int i2) {
                zzd.zza zzaVarZzc = zzd.zza.zzc(this.zzw.zzf(i2));
                return zzaVarZzc == null ? zzd.zza.zza : zzaVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaf.zzb
            public zzab zzy() {
                zzab zzabVar = this.zzy;
                return zzabVar == null ? zzab.zzs() : zzabVar;
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
            public void zzV(int i2, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaD();
                this.zzw.zzg(i2, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
            public void zzW(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaD();
                this.zzw.zzi(zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
            public void zzZ(Iterable<? extends zzd.zza> iterable) {
                zzaD();
                Iterator<? extends zzd.zza> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzw.zzi(it.next().zza());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
            public void zzaa() {
                this.zzw = zzibr.zzbC();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
            public void zzad(zzab zzabVar) {
                zzabVar.getClass();
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
            public void zzae(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzy;
                if (zzabVar2 != null && zzabVar2 != zzab.zzs()) {
                    zzab.zza zzaVarZzr = zzab.zzr(zzabVar2);
                    zzaVarZzr.zzbo(zzabVar);
                    zzabVar = zzaVarZzr.zzbt();
                }
                this.zzy = zzabVar;
                this.zzn |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
            public void zzag(zzq zzqVar) {
                this.zzz = zzqVar.zza();
                this.zzn |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
            public void zzJ(zzq zzqVar) {
                this.zzp = zzqVar.zza();
                this.zzn |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
            public void zzai(zzq zzqVar) {
                this.zzA = zzqVar.zza();
                this.zzn |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
            public void zzak(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzn |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
            public void zzao(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzn |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
            public void zzaq(zzd zzdVar) {
                this.zzE = zzdVar.zza();
                this.zzn |= 1024;
            }

            @Override // com.google.android.gms.internal.ads.zzibr
            protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                zzidk zzibmVar;
                int iOrdinal = zzibqVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            byte[] bArr = null;
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    if (iOrdinal == 6) {
                                        zzidk<zza> zzidkVar = zzH;
                                        if (zzidkVar == null) {
                                            synchronized (zza.class) {
                                                try {
                                                    zzibmVar = zzH;
                                                    if (zzibmVar == null) {
                                                        zzibmVar = new zzibm(zzG);
                                                        zzH = zzibmVar;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            return zzibmVar;
                                        }
                                        return zzidkVar;
                                    }
                                    throw null;
                                }
                                return zzG;
                            }
                            return new C0776zza(bArr);
                        }
                        return new zza();
                    }
                    return zzibr.zzbv(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.zza.zze(), "zzy", "zzz", zzq.zze(), "zzA", zzq.zze(), "zzB", zzq.zze(), "zzC", "zzD", zzq.zze(), "zzE", zzd.zze(), "zzF"});
                }
                return (byte) 1;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public interface zzb extends zzidd {
            boolean zzD();

            zzq zzE();

            boolean zzH();

            zzq zzI();

            boolean zzL();

            zzq zzM();

            boolean zzP();

            int zzQ();

            boolean zzT();

            zzq zzU();

            boolean zzX();

            zzd zzY();

            boolean zza();

            boolean zzab();

            long zzac();

            long zzb();

            boolean zze();

            zzq zzf();

            boolean zzi();

            long zzj();

            boolean zzm();

            long zzn();

            List<zzd.zza> zzq();

            int zzr();

            zzd.zza zzs(int i2);

            boolean zzx();

            zzab zzy();
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zzc extends zzibl<zzaf, zzc> implements zzag {
            /* synthetic */ zzc(byte[] bArr) {
                this();
            }

            private zzc() {
                super(zzaf.zzv);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public zzian zzA() {
                return ((zzaf) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzE() {
                return ((zzaf) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public String zzF() {
                return ((zzaf) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public zzian zzG() {
                return ((zzaf) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzK() {
                return ((zzaf) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public long zzL() {
                return ((zzaf) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public int zzP() {
                return ((zzaf) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public List<zza> zza() {
                return Collections.unmodifiableList(((zzaf) this.zza).zza());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public zza zzc(int i2) {
                return ((zzaf) this.zza).zzc(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzm() {
                return ((zzaf) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public int zzn() {
                return ((zzaf) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzq() {
                return ((zzaf) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public int zzr() {
                return ((zzaf) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzu() {
                return ((zzaf) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public long zzv() {
                return ((zzaf) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public boolean zzy() {
                return ((zzaf) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzag
            public String zzz() {
                return ((zzaf) this.zza).zzz();
            }

            public zzc zzB(String str) {
                zzbg();
                ((zzaf) this.zza).zzY(str);
                return this;
            }

            public zzc zzC() {
                zzbg();
                ((zzaf) this.zza).zzZ();
                return this;
            }

            public zzc zzD(zzian zzianVar) {
                zzbg();
                ((zzaf) this.zza).zzaa(zzianVar);
                return this;
            }

            public zzc zzH(String str) {
                zzbg();
                ((zzaf) this.zza).zzab(str);
                return this;
            }

            public zzc zzI() {
                zzbg();
                ((zzaf) this.zza).zzac();
                return this;
            }

            public zzc zzJ(zzian zzianVar) {
                zzbg();
                ((zzaf) this.zza).zzad(zzianVar);
                return this;
            }

            public zzc zzM(long j2) {
                zzbg();
                ((zzaf) this.zza).zzae(j2);
                return this;
            }

            public zzc zzN() {
                zzbg();
                ((zzaf) this.zza).zzaf();
                return this;
            }

            public zzc zzQ(int i2) {
                zzbg();
                ((zzaf) this.zza).zzag(i2);
                return this;
            }

            public zzc zzR() {
                zzbg();
                ((zzaf) this.zza).zzah();
                return this;
            }

            public zzc zzd(int i2, zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzI(i2, zzaVar);
                return this;
            }

            public zzc zze(int i2, zza.C0776zza c0776zza) {
                zzbg();
                ((zzaf) this.zza).zzI(i2, c0776zza.zzbu());
                return this;
            }

            public zzc zzf(zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzJ(zzaVar);
                return this;
            }

            public zzc zzg(int i2, zza zzaVar) {
                zzbg();
                ((zzaf) this.zza).zzM(i2, zzaVar);
                return this;
            }

            public zzc zzh(zza.C0776zza c0776zza) {
                zzbg();
                ((zzaf) this.zza).zzJ(c0776zza.zzbu());
                return this;
            }

            public zzc zzi(int i2, zza.C0776zza c0776zza) {
                zzbg();
                ((zzaf) this.zza).zzM(i2, c0776zza.zzbu());
                return this;
            }

            public zzc zzj(Iterable<? extends zza> iterable) {
                zzbg();
                ((zzaf) this.zza).zzN(iterable);
                return this;
            }

            public zzc zzk() {
                zzbg();
                ((zzaf) this.zza).zzQ();
                return this;
            }

            public zzc zzl(int i2) {
                zzbg();
                ((zzaf) this.zza).zzR(i2);
                return this;
            }

            public zzc zzo(int i2) {
                zzbg();
                ((zzaf) this.zza).zzS(i2);
                return this;
            }

            public zzc zzp() {
                zzbg();
                ((zzaf) this.zza).zzT();
                return this;
            }

            public zzc zzs(int i2) {
                zzbg();
                ((zzaf) this.zza).zzU(i2);
                return this;
            }

            public zzc zzt() {
                zzbg();
                ((zzaf) this.zza).zzV();
                return this;
            }

            public zzc zzw(long j2) {
                zzbg();
                ((zzaf) this.zza).zzW(j2);
                return this;
            }

            public zzc zzx() {
                zzbg();
                ((zzaf) this.zza).zzX();
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public enum zzd implements zzibv {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zzibw<zzd> zzm = new zzibw<zzd>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzaf.zzd.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i2) {
                    return zzd.zzc(i2);
                }
            };
            private final int zzn;

            public static zzd zzc(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 == 1) {
                    return CONNECTING;
                }
                if (i2 == 2) {
                    return CONNECTED;
                }
                if (i2 == 3) {
                    return DISCONNECTING;
                }
                if (i2 == 4) {
                    return DISCONNECTED;
                }
                if (i2 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzibw<zzd> zzd() {
                return zzm;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzn;
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zzd.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i2) {
                this.zzn = i2;
            }
        }

        public static zzaf zzD() {
            return zzv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzae(long j2) {
            this.zzi |= 32;
            this.zzp = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaf() {
            this.zzi &= -33;
            this.zzp = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzag(int i2) {
            this.zzi |= 64;
            this.zzu = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzi &= -65;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzS(int i2) {
            this.zzi |= 1;
            this.zzk = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzi &= -2;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzU(int i2) {
            this.zzi |= 2;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzi &= -3;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzW(long j2) {
            this.zzi |= 4;
            this.zzm = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzi &= -5;
            this.zzm = 0L;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzE() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public String zzF() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzK() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public long zzL() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzO() {
            return (this.zzi & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public int zzP() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public List<zza> zza() {
            return this.zzj;
        }

        public List<? extends zzb> zzd() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzm() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public int zzn() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzq() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public int zzr() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzu() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public long zzv() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public boolean zzy() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public String zzz() {
            return this.zzn;
        }

        static {
            zzaf zzafVar = new zzaf();
            zzv = zzafVar;
            zzibr.zzbu(zzaf.class, zzafVar);
        }

        public static zzc zzB() {
            return (zzc) zzv.zzbn();
        }

        public static zzc zzC(zzaf zzafVar) {
            return (zzc) zzv.zzbo(zzafVar);
        }

        public static zzidk<zzaf> zzH() {
            return zzv.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzac() {
            this.zzi &= -17;
            this.zzo = zzD().zzF();
        }

        private void zzaj() {
            zzicd<zza> zzicdVar = this.zzj;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzj = zzibr.zzbN(zzicdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzZ() {
            this.zzi &= -9;
            this.zzn = zzD().zzz();
        }

        public static zzaf zzg(ByteBuffer byteBuffer) throws zzicg {
            return (zzaf) zzibr.zzbR(zzv, byteBuffer);
        }

        public static zzaf zzh(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzaf) zzibr.zzbQ(zzv, byteBuffer, zzibbVar);
        }

        public static zzaf zzi(zzian zzianVar) throws zzicg {
            return (zzaf) zzibr.zzbS(zzv, zzianVar);
        }

        public static zzaf zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzaf) zzibr.zzbT(zzv, zzianVar, zzibbVar);
        }

        public static zzaf zzk(byte[] bArr) throws zzicg {
            return (zzaf) zzibr.zzbU(zzv, bArr);
        }

        public static zzaf zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzaf) zzibr.zzbV(zzv, bArr, zzibbVar);
        }

        public static zzaf zzo(InputStream inputStream) throws IOException {
            return (zzaf) zzibr.zzbW(zzv, inputStream);
        }

        public static zzaf zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaf) zzibr.zzbX(zzv, inputStream, zzibbVar);
        }

        public static zzaf zzs(InputStream inputStream) throws IOException {
            return (zzaf) zzibr.zzca(zzv, inputStream);
        }

        public static zzaf zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaf) zzibr.zzcb(zzv, inputStream, zzibbVar);
        }

        public static zzaf zzw(zziaq zziaqVar) throws IOException {
            return (zzaf) zzibr.zzbY(zzv, zziaqVar);
        }

        public static zzaf zzx(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzaf) zzibr.zzbZ(zzv, zziaqVar, zzibbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public zzian zzA() {
            return zzian.zzv(this.zzn);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public zzian zzG() {
            return zzian.zzv(this.zzo);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzag
        public zza zzc(int i2) {
            return this.zzj.get(i2);
        }

        public zzb zze(int i2) {
            return this.zzj.get(i2);
        }

        private zzaf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzad(zzian zzianVar) {
            this.zzo = zzianVar.zzz();
            this.zzi |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzI(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.set(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzJ(zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzM(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzaj();
            this.zzj.add(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzN(Iterable<? extends zza> iterable) {
            zzaj();
            zzhzw.zzaW(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzQ() {
            this.zzj = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzR(int i2) {
            zzaj();
            this.zzj.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzY(String str) {
            str.getClass();
            this.zzi |= 8;
            this.zzn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzaa(zzian zzianVar) {
            this.zzn = zzianVar.zzz();
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzab(String str) {
            str.getClass();
            this.zzi |= 16;
            this.zzo = str;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzaf> zzidkVar = zzw;
                                    if (zzidkVar == null) {
                                        synchronized (zzaf.class) {
                                            try {
                                                zzibmVar = zzw;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzv);
                                                    zzw = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzv;
                        }
                        return new zzc(bArr);
                    }
                    return new zzaf();
                }
                return zzibr.zzbv(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", zza.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
            }
            return (byte) 1;
        }
    }

    public interface zzag extends zzidd {
        zzian zzA();

        boolean zzE();

        String zzF();

        zzian zzG();

        boolean zzK();

        long zzL();

        boolean zzO();

        int zzP();

        List<zzaf.zza> zza();

        int zzb();

        zzaf.zza zzc(int i2);

        boolean zzm();

        int zzn();

        boolean zzq();

        int zzr();

        boolean zzu();

        long zzv();

        boolean zzy();

        String zzz();
    }

    public final class zzah extends zzibr<zzah, zza> implements zzak {
        private static final zzah zzB;
        private static volatile zzidk<zzah> zzC = null;
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private zzai zzA;
        private int zzl;
        private int zzm = 1000;
        private int zzn = 1000;
        private int zzo;
        private int zzp;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
        public final class zza extends zzibl<zzah, zza> implements zzak {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzah.zzB);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzC() {
                return ((zzah) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzD() {
                return ((zzah) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzG() {
                return ((zzah) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzH() {
                return ((zzah) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzL() {
                return ((zzah) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public zzai zzP() {
                return ((zzah) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public zzq zzb() {
                return ((zzah) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public zzq zzf() {
                return ((zzah) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzj() {
                return ((zzah) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzm() {
                return ((zzah) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzn() {
                return ((zzah) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzq() {
                return ((zzah) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzr() {
                return ((zzah) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzu() {
                return ((zzah) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzv() {
                return ((zzah) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public boolean zzy() {
                return ((zzah) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzak
            public int zzz() {
                return ((zzah) this.zza).zzz();
            }

            public zza zzA(int i2) {
                zzbg();
                ((zzah) this.zza).zzY(i2);
                return this;
            }

            public zza zzB() {
                zzbg();
                ((zzah) this.zza).zzZ();
                return this;
            }

            public zza zzE(int i2) {
                zzbg();
                ((zzah) this.zza).zzaa(i2);
                return this;
            }

            public zza zzF() {
                zzbg();
                ((zzah) this.zza).zzab();
                return this;
            }

            public zza zzI(int i2) {
                zzbg();
                ((zzah) this.zza).zzac(i2);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzah) this.zza).zzad();
                return this;
            }

            public zza zzM(int i2) {
                zzbg();
                ((zzah) this.zza).zzae(i2);
                return this;
            }

            public zza zzN() {
                zzbg();
                ((zzah) this.zza).zzaf();
                return this;
            }

            public zza zzQ(zzai zzaiVar) {
                zzbg();
                ((zzah) this.zza).zzag(zzaiVar);
                return this;
            }

            public zza zzR(zzai.zza zzaVar) {
                zzbg();
                ((zzah) this.zza).zzag(zzaVar.zzbu());
                return this;
            }

            public zza zzS(zzai zzaiVar) {
                zzbg();
                ((zzah) this.zza).zzah(zzaiVar);
                return this;
            }

            public zza zzT() {
                zzbg();
                ((zzah) this.zza).zzai();
                return this;
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzah) this.zza).zzI(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzah) this.zza).zzJ();
                return this;
            }

            public zza zzg(zzq zzqVar) {
                zzbg();
                ((zzah) this.zza).zzM(zzqVar);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzah) this.zza).zzN();
                return this;
            }

            public zza zzk(int i2) {
                zzbg();
                ((zzah) this.zza).zzQ(i2);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzah) this.zza).zzR();
                return this;
            }

            public zza zzo(int i2) {
                zzbg();
                ((zzah) this.zza).zzS(i2);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzah) this.zza).zzT();
                return this;
            }

            public zza zzs(int i2) {
                zzbg();
                ((zzah) this.zza).zzU(i2);
                return this;
            }

            public zza zzt() {
                zzbg();
                ((zzah) this.zza).zzV();
                return this;
            }

            public zza zzw(int i2) {
                zzbg();
                ((zzah) this.zza).zzW(i2);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzah) this.zza).zzX();
                return this;
            }
        }

        public static zzah zzE() {
            return zzB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzac(int i2) {
            this.zzl |= 256;
            this.zzy = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzad() {
            this.zzl &= -257;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzae(int i2) {
            this.zzl |= 512;
            this.zzz = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaf() {
            this.zzl &= -513;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzai() {
            this.zzA = null;
            this.zzl &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzl &= -2;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzl &= -3;
            this.zzn = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzQ(int i2) {
            this.zzl |= 4;
            this.zzo = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzR() {
            this.zzl &= -5;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzS(int i2) {
            this.zzl |= 8;
            this.zzp = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzl &= -9;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzU(int i2) {
            this.zzl |= 16;
            this.zzu = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzl &= -17;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzW(int i2) {
            this.zzl |= 32;
            this.zzv = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzl &= -33;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzY(int i2) {
            this.zzl |= 64;
            this.zzw = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzZ() {
            this.zzl &= -65;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzaa(int i2) {
            this.zzl |= 128;
            this.zzx = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzl &= -129;
            this.zzx = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzC() {
            return (this.zzl & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzD() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzG() {
            return (this.zzl & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzH() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzK() {
            return (this.zzl & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzL() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzO() {
            return (this.zzl & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zza() {
            return (this.zzl & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zze() {
            return (this.zzl & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzi() {
            return (this.zzl & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzj() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzm() {
            return (this.zzl & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzn() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzq() {
            return (this.zzl & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzr() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzu() {
            return (this.zzl & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzv() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public boolean zzy() {
            return (this.zzl & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public int zzz() {
            return this.zzw;
        }

        static {
            zzah zzahVar = new zzah();
            zzB = zzahVar;
            zzibr.zzbu(zzah.class, zzahVar);
        }

        public static zza zzA() {
            return (zza) zzB.zzbn();
        }

        public static zza zzB(zzah zzahVar) {
            return (zza) zzB.zzbo(zzahVar);
        }

        public static zzidk<zzah> zzF() {
            return zzB.zzbd();
        }

        public static zzah zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzah) zzibr.zzbR(zzB, byteBuffer);
        }

        public static zzah zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzah) zzibr.zzbQ(zzB, byteBuffer, zzibbVar);
        }

        public static zzah zzg(zzian zzianVar) throws zzicg {
            return (zzah) zzibr.zzbS(zzB, zzianVar);
        }

        public static zzah zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzah) zzibr.zzbT(zzB, zzianVar, zzibbVar);
        }

        public static zzah zzk(byte[] bArr) throws zzicg {
            return (zzah) zzibr.zzbU(zzB, bArr);
        }

        public static zzah zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzah) zzibr.zzbV(zzB, bArr, zzibbVar);
        }

        public static zzah zzo(InputStream inputStream) throws IOException {
            return (zzah) zzibr.zzbW(zzB, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzah) zzibr.zzbX(zzB, inputStream, zzibbVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zzibr.zzca(zzB, inputStream);
        }

        public static zzah zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzah) zzibr.zzcb(zzB, inputStream, zzibbVar);
        }

        public static zzah zzw(zziaq zziaqVar) throws IOException {
            return (zzah) zzibr.zzbY(zzB, zziaqVar);
        }

        public static zzah zzx(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzah) zzibr.zzbZ(zzB, zziaqVar, zzibbVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public zzai zzP() {
            zzai zzaiVar = this.zzA;
            return zzaiVar == null ? zzai.zzs() : zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzm);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzak
        public zzq zzf() {
            zzq zzqVarZzc = zzq.zzc(this.zzn);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        private zzah() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzag(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzA = zzaiVar;
            this.zzl |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzah(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzA;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzs()) {
                zzai.zza zzaVarZzr = zzai.zzr(zzaiVar2);
                zzaVarZzr.zzbo(zzaiVar);
                zzaiVar = zzaVarZzr.zzbt();
            }
            this.zzA = zzaiVar;
            this.zzl |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzI(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzl |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzM(zzq zzqVar) {
            this.zzn = zzqVar.zza();
            this.zzl |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzah> zzidkVar = zzC;
                                    if (zzidkVar == null) {
                                        synchronized (zzah.class) {
                                            try {
                                                zzibmVar = zzC;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzB);
                                                    zzC = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzB;
                        }
                        return new zza(bArr);
                    }
                    return new zzah();
                }
                return zzibr.zzbv(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", zzq.zze(), "zzn", zzq.zze(), "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
            }
            return (byte) 1;
        }
    }

    public final class zzai extends zzibr<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzf;
        private static volatile zzidk<zzai> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public final class zza extends zzibl<zzai, zza> implements zzaj {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzai.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
            public boolean zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
            public boolean zze() {
                return ((zzai) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
            public int zzf() {
                return ((zzai) this.zza).zzf();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzai) this.zza).zzu(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzai) this.zza).zzv();
                return this;
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzai) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzai) this.zza).zzx();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzai zzs() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
        public int zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaj
        public int zzf() {
            return this.zze;
        }

        static {
            zzai zzaiVar = new zzai();
            zzf = zzaiVar;
            zzibr.zzbu(zzai.class, zzaiVar);
        }

        public static zzai zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzai) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzai zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzai) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzai zzg(zzian zzianVar) throws zzicg {
            return (zzai) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzai zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzai) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzai zzi(byte[] bArr) throws zzicg {
            return (zzai) zzibr.zzbU(zzf, bArr);
        }

        public static zzai zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzai) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzai zzk(InputStream inputStream) throws IOException {
            return (zzai) zzibr.zzbW(zzf, inputStream);
        }

        public static zzai zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzai) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzai zzm(InputStream inputStream) throws IOException {
            return (zzai) zzibr.zzca(zzf, inputStream);
        }

        public static zzai zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzai) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzai zzo(zziaq zziaqVar) throws IOException {
            return (zzai) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzai zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzai) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzai zzaiVar) {
            return (zza) zzf.zzbo(zzaiVar);
        }

        public static zzidk<zzai> zzt() {
            return zzf.zzbd();
        }

        private zzai() {
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzai> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzai.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzai();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            return (byte) 1;
        }
    }

    public interface zzaj extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public interface zzak extends zzidd {
        boolean zzC();

        int zzD();

        boolean zzG();

        int zzH();

        boolean zzK();

        int zzL();

        boolean zzO();

        zzai zzP();

        boolean zza();

        zzq zzb();

        boolean zze();

        zzq zzf();

        boolean zzi();

        int zzj();

        boolean zzm();

        int zzn();

        boolean zzq();

        int zzr();

        boolean zzu();

        int zzv();

        boolean zzy();

        int zzz();
    }

    public final class zzal extends zzibr<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzf;
        private static volatile zzidk<zzal> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzal, zza> implements zzam {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzal.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzam
            public boolean zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzam
            public boolean zze() {
                return ((zzal) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzam
            public int zzf() {
                return ((zzal) this.zza).zzf();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzal) this.zza).zzu(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzal) this.zza).zzv();
                return this;
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzal) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzal) this.zza).zzx();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzal zzs() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzam
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzam
        public int zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzam
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzam
        public int zzf() {
            return this.zze;
        }

        static {
            zzal zzalVar = new zzal();
            zzf = zzalVar;
            zzibr.zzbu(zzal.class, zzalVar);
        }

        public static zzal zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzal) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzal zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzal) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzal zzg(zzian zzianVar) throws zzicg {
            return (zzal) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzal zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzal) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzal zzi(byte[] bArr) throws zzicg {
            return (zzal) zzibr.zzbU(zzf, bArr);
        }

        public static zzal zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzal) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzal zzk(InputStream inputStream) throws IOException {
            return (zzal) zzibr.zzbW(zzf, inputStream);
        }

        public static zzal zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzal) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzal zzm(InputStream inputStream) throws IOException {
            return (zzal) zzibr.zzca(zzf, inputStream);
        }

        public static zzal zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzal) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzal zzo(zziaq zziaqVar) throws IOException {
            return (zzal) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzal zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzal) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzal zzalVar) {
            return (zza) zzf.zzbo(zzalVar);
        }

        public static zzidk<zzal> zzt() {
            return zzf.zzbd();
        }

        private zzal() {
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzal> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzal.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzal();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            return (byte) 1;
        }
    }

    public interface zzam extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public final class zzan extends zzibr<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzh;
        private static volatile zzidk<zzan> zzi;
        private int zzd;
        private String zze = "";
        private int zzf;
        private zzap zzg;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzan, zza> implements zzao {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzan.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public boolean zza() {
                return ((zzan) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public String zzb() {
                return ((zzan) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public zzian zzc() {
                return ((zzan) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public boolean zzg() {
                return ((zzan) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public zzq zzh() {
                return ((zzan) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public boolean zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzao
            public zzap zzl() {
                return ((zzan) this.zza).zzl();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzan) this.zza).zzy(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzan) this.zza).zzz();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzan) this.zza).zzA(zzianVar);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzan) this.zza).zzB(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzan) this.zza).zzC();
                return this;
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzan) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzan) this.zza).zzD(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzan) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzan) this.zza).zzF();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zzd &= -3;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzF() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzan zzw() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public String zzb() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public boolean zzg() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        static {
            zzan zzanVar = new zzan();
            zzh = zzanVar;
            zzibr.zzbu(zzan.class, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz() {
            this.zzd &= -2;
            this.zze = zzw().zzb();
        }

        public static zzan zzd(ByteBuffer byteBuffer) throws zzicg {
            return (zzan) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzan zze(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzan) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzan zzi(zzian zzianVar) throws zzicg {
            return (zzan) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzan zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzan) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzan zzm(byte[] bArr) throws zzicg {
            return (zzan) zzibr.zzbU(zzh, bArr);
        }

        public static zzan zzn(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzan) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzan zzo(InputStream inputStream) throws IOException {
            return (zzan) zzibr.zzbW(zzh, inputStream);
        }

        public static zzan zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzan) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zzibr.zzca(zzh, inputStream);
        }

        public static zzan zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzan) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzan zzs(zziaq zziaqVar) throws IOException {
            return (zzan) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzan zzt(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzan) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzu() {
            return (zza) zzh.zzbn();
        }

        public static zza zzv(zzan zzanVar) {
            return (zza) zzh.zzbo(zzanVar);
        }

        public static zzidk<zzan> zzx() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public zzian zzc() {
            return zzian.zzv(this.zze);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public zzq zzh() {
            zzq zzqVarZzc = zzq.zzc(this.zzf);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzao
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzan() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(String str) {
            str.getClass();
            this.zzd |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA(zzian zzianVar) {
            this.zze = zzianVar.zzz();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzan> zzidkVar = zzi;
                                    if (zzidkVar == null) {
                                        synchronized (zzan.class) {
                                            try {
                                                zzibmVar = zzi;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzh);
                                                    zzi = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzh;
                        }
                        return new zza(bArr);
                    }
                    return new zzan();
                }
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzq.zze(), "zzg"});
            }
            return (byte) 1;
        }
    }

    public interface zzao extends zzidd {
        boolean zza();

        String zzb();

        zzian zzc();

        boolean zzg();

        zzq zzh();

        boolean zzk();

        zzap zzl();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public final class zzap extends zzibr<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzf;
        private static volatile zzidk<zzap> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public final class zza extends zzibl<zzap, zza> implements zzaq {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzap.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
            public boolean zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
            public boolean zze() {
                return ((zzap) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
            public int zzf() {
                return ((zzap) this.zza).zzf();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzap) this.zza).zzu(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzap) this.zza).zzv();
                return this;
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzap) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzap) this.zza).zzx();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzap zzs() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
        public int zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaq
        public int zzf() {
            return this.zze;
        }

        static {
            zzap zzapVar = new zzap();
            zzf = zzapVar;
            zzibr.zzbu(zzap.class, zzapVar);
        }

        public static zzap zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzap) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzap zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzap) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzap zzg(zzian zzianVar) throws zzicg {
            return (zzap) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzap zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzap) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzap zzi(byte[] bArr) throws zzicg {
            return (zzap) zzibr.zzbU(zzf, bArr);
        }

        public static zzap zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzap) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzap zzk(InputStream inputStream) throws IOException {
            return (zzap) zzibr.zzbW(zzf, inputStream);
        }

        public static zzap zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzap) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzap zzm(InputStream inputStream) throws IOException {
            return (zzap) zzibr.zzca(zzf, inputStream);
        }

        public static zzap zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzap) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzap zzo(zziaq zziaqVar) throws IOException {
            return (zzap) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzap zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzap) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzap zzapVar) {
            return (zza) zzf.zzbo(zzapVar);
        }

        public static zzidk<zzap> zzt() {
            return zzf.zzbd();
        }

        private zzap() {
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzap> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzap.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzap();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{yioUaKMByL.UdeAkKvBndGf, "zzd", "zze"});
            }
            return (byte) 1;
        }
    }

    public interface zzaq extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();
    }

    public final class zzar extends zzibr<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzh;
        private static volatile zzidk<zzar> zzi;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        public final class zza extends zzibl<zzar, zza> implements zzas {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzar.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzas
            public boolean zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzas
            public boolean zze() {
                return ((zzar) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzas
            public int zzf() {
                return ((zzar) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzas
            public boolean zzi() {
                return ((zzar) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzas
            public int zzj() {
                return ((zzar) this.zza).zzj();
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzar) this.zza).zzw(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzar) this.zza).zzx();
                return this;
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzar) this.zza).zzy(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzar) this.zza).zzz();
                return this;
            }

            public zza zzk(int i2) {
                zzbg();
                ((zzar) this.zza).zzA(i2);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzar) this.zza).zzB();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzd |= 1;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzy(int i2) {
            this.zzd |= 2;
            this.zzf = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzz() {
            this.zzd &= -3;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzA(int i2) {
            this.zzd |= 4;
            this.zzg = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzd &= -5;
            this.zzg = 0;
        }

        public static zzar zzu() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzas
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzas
        public int zzb() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzas
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzas
        public int zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzas
        public boolean zzi() {
            return (this.zzd & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzas
        public int zzj() {
            return this.zzg;
        }

        static {
            zzar zzarVar = new zzar();
            zzh = zzarVar;
            zzibr.zzbu(zzar.class, zzarVar);
        }

        public static zzar zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzar) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzar zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzar) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzar zzg(zzian zzianVar) throws zzicg {
            return (zzar) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzar zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzar) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzar zzk(byte[] bArr) throws zzicg {
            return (zzar) zzibr.zzbU(zzh, bArr);
        }

        public static zzar zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzar) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzar zzm(InputStream inputStream) throws IOException {
            return (zzar) zzibr.zzbW(zzh, inputStream);
        }

        public static zzar zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzar) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzar zzo(InputStream inputStream) throws IOException {
            return (zzar) zzibr.zzca(zzh, inputStream);
        }

        public static zzar zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzar) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzar zzq(zziaq zziaqVar) throws IOException {
            return (zzar) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzar zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzar) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzar zzarVar) {
            return (zza) zzh.zzbo(zzarVar);
        }

        public static zzidk<zzar> zzv() {
            return zzh.zzbd();
        }

        private zzar() {
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzar> zzidkVar = zzi;
                                    if (zzidkVar == null) {
                                        synchronized (zzar.class) {
                                            try {
                                                zzibmVar = zzi;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzh);
                                                    zzi = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzh;
                        }
                        return new zza(bArr);
                    }
                    return new zzar();
                }
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    public interface zzas extends zzidd {
        boolean zza();

        int zzb();

        boolean zze();

        int zzf();

        boolean zzi();

        int zzj();
    }

    public final class zzat extends zzibr<zzat, zza> implements zzbi {
        private static final zzat zzL;
        private static volatile zzidk<zzat> zzM = null;
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private zzbc zzA;
        private zzay zzB;
        private int zzC;
        private int zzD;
        private zzap zzE;
        private int zzF;
        private int zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private long zzK;
        private int zzu;
        private zzba zzv;
        private zzbe zzw;
        private zzbg zzx;
        private zzbj zzy;
        private zzau zzz;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
        public final class zza extends zzibl<zzat, zza> implements zzbi {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzat.zzL);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzE() {
                return ((zzat) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzbc zzF() {
                return ((zzat) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzK() {
                return ((zzat) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzay zzL() {
                return ((zzat) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzQ() {
                return ((zzat) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzR() {
                return ((zzat) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzU() {
                return ((zzat) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzV() {
                return ((zzat) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzY() {
                return ((zzat) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzap zzZ() {
                return ((zzat) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zza() {
                return ((zzat) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzae() {
                return ((zzat) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzan() {
                return ((zzat) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzar() {
                return ((zzat) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public int zzav() {
                return ((zzat) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public long zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzba zzb() {
                return ((zzat) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzbe zzh() {
                return ((zzat) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzm() {
                return ((zzat) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzbg zzn() {
                return ((zzat) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzs() {
                return ((zzat) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzbj zzt() {
                return ((zzat) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public boolean zzy() {
                return ((zzat) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
            public zzau zzz() {
                return ((zzat) this.zza).zzz();
            }

            public zza zzA(zzau zzauVar) {
                zzbg();
                ((zzat) this.zza).zzT(zzauVar);
                return this;
            }

            public zza zzB(zzau.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzT(zzaVar.zzbu());
                return this;
            }

            public zza zzC(zzau zzauVar) {
                zzbg();
                ((zzat) this.zza).zzW(zzauVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzat) this.zza).zzX();
                return this;
            }

            public zza zzG(zzbc zzbcVar) {
                zzbg();
                ((zzat) this.zza).zzaa(zzbcVar);
                return this;
            }

            public zza zzH(zzbc.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzaa(zzaVar.zzbu());
                return this;
            }

            public zza zzI(zzbc zzbcVar) {
                zzbg();
                ((zzat) this.zza).zzab(zzbcVar);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzat) this.zza).zzac();
                return this;
            }

            public zza zzM(zzay zzayVar) {
                zzbg();
                ((zzat) this.zza).zzad(zzayVar);
                return this;
            }

            public zza zzN(zzay.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzad(zzaVar.zzbu());
                return this;
            }

            public zza zzO(zzay zzayVar) {
                zzbg();
                ((zzat) this.zza).zzag(zzayVar);
                return this;
            }

            public zza zzP() {
                zzbg();
                ((zzat) this.zza).zzah();
                return this;
            }

            public zza zzS(int i2) {
                zzbg();
                ((zzat) this.zza).zzak(i2);
                return this;
            }

            public zza zzT() {
                zzbg();
                ((zzat) this.zza).zzal();
                return this;
            }

            public zza zzW(int i2) {
                zzbg();
                ((zzat) this.zza).zzao(i2);
                return this;
            }

            public zza zzX() {
                zzbg();
                ((zzat) this.zza).zzap();
                return this;
            }

            public zza zzaA(long j2) {
                zzbg();
                ((zzat) this.zza).zzaJ(j2);
                return this;
            }

            public zza zzaB() {
                zzbg();
                ((zzat) this.zza).zzaK();
                return this;
            }

            public zza zzaa(zzap zzapVar) {
                zzbg();
                ((zzat) this.zza).zzas(zzapVar);
                return this;
            }

            public zza zzab(zzap.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzas(zzaVar.zzbu());
                return this;
            }

            public zza zzac(zzap zzapVar) {
                zzbg();
                ((zzat) this.zza).zzat(zzapVar);
                return this;
            }

            public zza zzad() {
                zzbg();
                ((zzat) this.zza).zzaw();
                return this;
            }

            public zza zzag(int i2) {
                zzbg();
                ((zzat) this.zza).zzax(i2);
                return this;
            }

            public zza zzah() {
                zzbg();
                ((zzat) this.zza).zzaA();
                return this;
            }

            public zza zzak(int i2) {
                zzbg();
                ((zzat) this.zza).zzaB(i2);
                return this;
            }

            public zza zzal() {
                zzbg();
                ((zzat) this.zza).zzaC();
                return this;
            }

            public zza zzao(int i2) {
                zzbg();
                ((zzat) this.zza).zzaD(i2);
                return this;
            }

            public zza zzap() {
                zzbg();
                ((zzat) this.zza).zzaE();
                return this;
            }

            public zza zzas(int i2) {
                zzbg();
                ((zzat) this.zza).zzaF(i2);
                return this;
            }

            public zza zzat() {
                zzbg();
                ((zzat) this.zza).zzaG();
                return this;
            }

            public zza zzaw(int i2) {
                zzbg();
                ((zzat) this.zza).zzaH(i2);
                return this;
            }

            public zza zzax() {
                zzbg();
                ((zzat) this.zza).zzaI();
                return this;
            }

            public zza zzc(zzba zzbaVar) {
                zzbg();
                ((zzat) this.zza).zzB(zzbaVar);
                return this;
            }

            public zza zzd(zzba.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zze(zzba zzbaVar) {
                zzbg();
                ((zzat) this.zza).zzC(zzbaVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzat) this.zza).zzD();
                return this;
            }

            public zza zzi(zzbe zzbeVar) {
                zzbg();
                ((zzat) this.zza).zzG(zzbeVar);
                return this;
            }

            public zza zzj(zzbe.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzG(zzaVar.zzbu());
                return this;
            }

            public zza zzk(zzbe zzbeVar) {
                zzbg();
                ((zzat) this.zza).zzH(zzbeVar);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzat) this.zza).zzI();
                return this;
            }

            public zza zzo(zzbg zzbgVar) {
                zzbg();
                ((zzat) this.zza).zzJ(zzbgVar);
                return this;
            }

            public zza zzp(zzbg.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzJ(zzaVar.zzbu());
                return this;
            }

            public zza zzq(zzbg zzbgVar) {
                zzbg();
                ((zzat) this.zza).zzM(zzbgVar);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzat) this.zza).zzN();
                return this;
            }

            public zza zzu(zzbj zzbjVar) {
                zzbg();
                ((zzat) this.zza).zzO(zzbjVar);
                return this;
            }

            public zza zzv(zzbj.zza zzaVar) {
                zzbg();
                ((zzat) this.zza).zzO(zzaVar.zzbu());
                return this;
            }

            public zza zzw(zzbj zzbjVar) {
                zzbg();
                ((zzat) this.zza).zzP(zzbjVar);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzat) this.zza).zzS();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzal() {
            this.zzu &= -129;
            this.zzC = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzao(int i2) {
            this.zzu |= 256;
            this.zzD = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcC, reason: merged with bridge method [inline-methods] */
        public void zzap() {
            this.zzu &= -257;
            this.zzD = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzE = null;
            this.zzu &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzax(int i2) {
            this.zzu |= 1024;
            this.zzF = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaA() {
            this.zzu &= -1025;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcI, reason: merged with bridge method [inline-methods] */
        public void zzaB(int i2) {
            this.zzu |= 2048;
            this.zzG = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcJ, reason: merged with bridge method [inline-methods] */
        public void zzaC() {
            this.zzu &= -2049;
            this.zzG = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcK, reason: merged with bridge method [inline-methods] */
        public void zzaD(int i2) {
            this.zzu |= 4096;
            this.zzH = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcL, reason: merged with bridge method [inline-methods] */
        public void zzaE() {
            this.zzu &= -4097;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcM, reason: merged with bridge method [inline-methods] */
        public void zzaF(int i2) {
            this.zzu |= 8192;
            this.zzI = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcN, reason: merged with bridge method [inline-methods] */
        public void zzaG() {
            this.zzu &= -8193;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcO, reason: merged with bridge method [inline-methods] */
        public void zzaH(int i2) {
            this.zzu |= 16384;
            this.zzJ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcP, reason: merged with bridge method [inline-methods] */
        public void zzaI() {
            this.zzu &= -16385;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcQ, reason: merged with bridge method [inline-methods] */
        public void zzaJ(long j2) {
            this.zzu |= 32768;
            this.zzK = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcR, reason: merged with bridge method [inline-methods] */
        public void zzaK() {
            this.zzu &= -32769;
            this.zzK = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzv = null;
            this.zzu &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzw = null;
            this.zzu &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzx = null;
            this.zzu &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzS() {
            this.zzy = null;
            this.zzu &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzz = null;
            this.zzu &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzac() {
            this.zzA = null;
            this.zzu &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzah() {
            this.zzB = null;
            this.zzu &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzak(int i2) {
            this.zzu |= 128;
            this.zzC = i2;
        }

        public static zzat zzx() {
            return zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzE() {
            return (this.zzu & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzK() {
            return (this.zzu & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzQ() {
            return (this.zzu & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzR() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzU() {
            return (this.zzu & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzV() {
            return this.zzD;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzY() {
            return (this.zzu & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zza() {
            return (this.zzu & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzae() {
            return (this.zzu & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzaf() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzai() {
            return (this.zzu & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzaj() {
            return this.zzG;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzam() {
            return (this.zzu & 4096) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzan() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzaq() {
            return (this.zzu & 8192) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzar() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzau() {
            return (this.zzu & 16384) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public int zzav() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzay() {
            return (this.zzu & 32768) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public long zzaz() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzg() {
            return (this.zzu & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzm() {
            return (this.zzu & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzs() {
            return (this.zzu & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public boolean zzy() {
            return (this.zzu & 16) != 0;
        }

        static {
            zzat zzatVar = new zzat();
            zzL = zzatVar;
            zzibr.zzbu(zzat.class, zzatVar);
        }

        public static zzidk<zzat> zzA() {
            return zzL.zzbd();
        }

        public static zzat zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzat) zzibr.zzbR(zzL, byteBuffer);
        }

        public static zzat zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzat) zzibr.zzbQ(zzL, byteBuffer, zzibbVar);
        }

        public static zzat zze(zzian zzianVar) throws zzicg {
            return (zzat) zzibr.zzbS(zzL, zzianVar);
        }

        public static zzat zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzat) zzibr.zzbT(zzL, zzianVar, zzibbVar);
        }

        public static zzat zzj(byte[] bArr) throws zzicg {
            return (zzat) zzibr.zzbU(zzL, bArr);
        }

        public static zzat zzk(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzat) zzibr.zzbV(zzL, bArr, zzibbVar);
        }

        public static zzat zzl(InputStream inputStream) throws IOException {
            return (zzat) zzibr.zzbW(zzL, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzat) zzibr.zzbX(zzL, inputStream, zzibbVar);
        }

        public static zzat zzp(InputStream inputStream) throws IOException {
            return (zzat) zzibr.zzca(zzL, inputStream);
        }

        public static zzat zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzat) zzibr.zzcb(zzL, inputStream, zzibbVar);
        }

        public static zzat zzr(zziaq zziaqVar) throws IOException {
            return (zzat) zzibr.zzbY(zzL, zziaqVar);
        }

        public static zzat zzu(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzat) zzibr.zzbZ(zzL, zziaqVar, zzibbVar);
        }

        public static zza zzv() {
            return (zza) zzL.zzbn();
        }

        public static zza zzw(zzat zzatVar) {
            return (zza) zzL.zzbo(zzatVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzbc zzF() {
            zzbc zzbcVar = this.zzA;
            return zzbcVar == null ? zzbc.zzu() : zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzay zzL() {
            zzay zzayVar = this.zzB;
            return zzayVar == null ? zzay.zzx() : zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzap zzZ() {
            zzap zzapVar = this.zzE;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzba zzb() {
            zzba zzbaVar = this.zzv;
            return zzbaVar == null ? zzba.zzy() : zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzbe zzh() {
            zzbe zzbeVar = this.zzw;
            return zzbeVar == null ? zzbe.zzA() : zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzbg zzn() {
            zzbg zzbgVar = this.zzx;
            return zzbgVar == null ? zzbg.zzu() : zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzbj zzt() {
            zzbj zzbjVar = this.zzy;
            return zzbjVar == null ? zzbj.zzs() : zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbi
        public zzau zzz() {
            zzau zzauVar = this.zzz;
            return zzauVar == null ? zzau.zzu() : zzauVar;
        }

        private zzat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzas(zzap zzapVar) {
            zzapVar.getClass();
            this.zzE = zzapVar;
            this.zzu |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzat(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzE;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzE = zzapVar;
            this.zzu |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzB(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzv = zzbaVar;
            this.zzu |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzC(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzv;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzy()) {
                zzba.zza zzaVarZzx = zzba.zzx(zzbaVar2);
                zzaVarZzx.zzbo(zzbaVar);
                zzbaVar = zzaVarZzx.zzbt();
            }
            this.zzv = zzbaVar;
            this.zzu |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzG(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzw = zzbeVar;
            this.zzu |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzH(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzw;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzA()) {
                zzbe.zza zzaVarZzz = zzbe.zzz(zzbeVar2);
                zzaVarZzz.zzbo(zzbeVar);
                zzbeVar = zzaVarZzz.zzbt();
            }
            this.zzw = zzbeVar;
            this.zzu |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzx = zzbgVar;
            this.zzu |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzM(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzx;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzu()) {
                zzbg.zza zzaVarZzt = zzbg.zzt(zzbgVar2);
                zzaVarZzt.zzbo(zzbgVar);
                zzbgVar = zzaVarZzt.zzbt();
            }
            this.zzx = zzbgVar;
            this.zzu |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzO(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzy = zzbjVar;
            this.zzu |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzP(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzy;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzs()) {
                zzbj.zza zzaVarZzr = zzbj.zzr(zzbjVar2);
                zzaVarZzr.zzbo(zzbjVar);
                zzbjVar = zzaVarZzr.zzbt();
            }
            this.zzy = zzbjVar;
            this.zzu |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzT(zzau zzauVar) {
            zzauVar.getClass();
            this.zzz = zzauVar;
            this.zzu |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzW(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzz;
            if (zzauVar2 != null && zzauVar2 != zzau.zzu()) {
                zzau.zza zzaVarZzt = zzau.zzt(zzauVar2);
                zzaVarZzt.zzbo(zzauVar);
                zzauVar = zzaVarZzt.zzbt();
            }
            this.zzz = zzauVar;
            this.zzu |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzaa(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzA = zzbcVar;
            this.zzu |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzab(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzA;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzu()) {
                zzbc.zza zzaVarZzt = zzbc.zzt(zzbcVar2);
                zzaVarZzt.zzbo(zzbcVar);
                zzbcVar = zzaVarZzt.zzbt();
            }
            this.zzA = zzbcVar;
            this.zzu |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzad(zzay zzayVar) {
            zzayVar.getClass();
            this.zzB = zzayVar;
            this.zzu |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzag(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzB;
            if (zzayVar2 != null && zzayVar2 != zzay.zzx()) {
                zzay.zza zzaVarZzw = zzay.zzw(zzayVar2);
                zzaVarZzw.zzbo(zzayVar);
                zzayVar = zzaVarZzw.zzbt();
            }
            this.zzB = zzayVar;
            this.zzu |= 64;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzat> zzidkVar = zzM;
                                    if (zzidkVar == null) {
                                        synchronized (zzat.class) {
                                            try {
                                                zzibmVar = zzM;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzL);
                                                    zzM = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzL;
                        }
                        return new zza(bArr);
                    }
                    return new zzat();
                }
                return zzibr.zzbv(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
            }
            return (byte) 1;
        }
    }

    public final class zzau extends zzibr<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzh;
        private static volatile zzidk<zzau> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzau, zza> implements zzav {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzau.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzav
            public boolean zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzav
            public zzq zzb() {
                return ((zzau) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzav
            public boolean zze() {
                return ((zzau) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzav
            public zzaw zzf() {
                return ((zzau) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzav
            public boolean zzk() {
                return ((zzau) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzav
            public zzap zzl() {
                return ((zzau) this.zza).zzl();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzau) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzau) this.zza).zzx();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzau) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzau) this.zza).zzy(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzau) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzau) this.zza).zzA();
                return this;
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzau) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzau) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzau) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzau) this.zza).zzD();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzau zzu() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzav
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzav
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzav
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        static {
            zzau zzauVar = new zzau();
            zzh = zzauVar;
            zzibr.zzbu(zzau.class, zzauVar);
        }

        public static zzau zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzau) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzau zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzau) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzau zzg(zzian zzianVar) throws zzicg {
            return (zzau) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzau zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzau) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzau zzi(byte[] bArr) throws zzicg {
            return (zzau) zzibr.zzbU(zzh, bArr);
        }

        public static zzau zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzau) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzau zzm(InputStream inputStream) throws IOException {
            return (zzau) zzibr.zzbW(zzh, inputStream);
        }

        public static zzau zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzau) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzau zzo(InputStream inputStream) throws IOException {
            return (zzau) zzibr.zzca(zzh, inputStream);
        }

        public static zzau zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzau) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzau zzq(zziaq zziaqVar) throws IOException {
            return (zzau) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzau zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzau) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzau zzauVar) {
            return (zza) zzh.zzbo(zzauVar);
        }

        public static zzidk<zzau> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzav
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zze);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzav
        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzav
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzau> zzidkVar = zzi;
                                    if (zzidkVar == null) {
                                        synchronized (zzau.class) {
                                            try {
                                                zzibmVar = zzi;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzh);
                                                    zzi = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzh;
                        }
                        return new zza(bArr);
                    }
                    return new zzau();
                }
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    public interface zzav extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public final class zzaw extends zzibr<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzd;
        private static volatile zzidk<zzaw> zze;
        private int zzb;
        private int zzc;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public final class zza extends zzibl<zzaw, zza> implements zzax {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzaw.zzd);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzax
            public boolean zza() {
                return ((zzaw) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzax
            public zzb zzb() {
                return ((zzaw) this.zza).zzb();
            }

            public zza zzc(zzb zzbVar) {
                zzbg();
                ((zzaw) this.zza).zzt(zzbVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzaw) this.zza).zzu();
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public enum zzb implements zzibv {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzibw<zzb> zzi = new zzibw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzaw.zzb.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i2) {
                    return zzb.zzc(i2);
                }
            };
            private final int zzj;

            public static zzb zzc(int i2) {
                if (i2 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i2 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i2 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzibw<zzb> zzd() {
                return zzi;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzj;
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zzb.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i2) {
                this.zzj = i2;
            }
        }

        public static zzaw zzr() {
            return zzd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzx, reason: merged with bridge method [inline-methods] */
        public void zzu() {
            this.zzb &= -2;
            this.zzc = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzax
        public boolean zza() {
            return (this.zzb & 1) != 0;
        }

        static {
            zzaw zzawVar = new zzaw();
            zzd = zzawVar;
            zzibr.zzbu(zzaw.class, zzawVar);
        }

        public static zzaw zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzaw) zzibr.zzbR(zzd, byteBuffer);
        }

        public static zzaw zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzaw) zzibr.zzbQ(zzd, byteBuffer, zzibbVar);
        }

        public static zzaw zze(zzian zzianVar) throws zzicg {
            return (zzaw) zzibr.zzbS(zzd, zzianVar);
        }

        public static zzaw zzg(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzaw) zzibr.zzbT(zzd, zzianVar, zzibbVar);
        }

        public static zzaw zzh(byte[] bArr) throws zzicg {
            return (zzaw) zzibr.zzbU(zzd, bArr);
        }

        public static zzaw zzi(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzaw) zzibr.zzbV(zzd, bArr, zzibbVar);
        }

        public static zzaw zzj(InputStream inputStream) throws IOException {
            return (zzaw) zzibr.zzbW(zzd, inputStream);
        }

        public static zzaw zzk(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaw) zzibr.zzbX(zzd, inputStream, zzibbVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zzibr.zzca(zzd, inputStream);
        }

        public static zzaw zzm(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzaw) zzibr.zzcb(zzd, inputStream, zzibbVar);
        }

        public static zzaw zzn(zziaq zziaqVar) throws IOException {
            return (zzaw) zzibr.zzbY(zzd, zziaqVar);
        }

        public static zzaw zzo(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzaw) zzibr.zzbZ(zzd, zziaqVar, zzibbVar);
        }

        public static zza zzp() {
            return (zza) zzd.zzbn();
        }

        public static zza zzq(zzaw zzawVar) {
            return (zza) zzd.zzbo(zzawVar);
        }

        public static zzidk<zzaw> zzs() {
            return zzd.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzax
        public zzb zzb() {
            zzb zzbVarZzc = zzb.zzc(this.zzc);
            return zzbVarZzc == null ? zzb.VIDEO_ERROR_CODE_UNSPECIFIED : zzbVarZzc;
        }

        private zzaw() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
        public void zzt(zzb zzbVar) {
            this.zzc = zzbVar.zza();
            this.zzb |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzaw> zzidkVar = zze;
                                    if (zzidkVar == null) {
                                        synchronized (zzaw.class) {
                                            try {
                                                zzibmVar = zze;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzd);
                                                    zze = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzd;
                        }
                        return new zza(bArr);
                    }
                    return new zzaw();
                }
                return zzibr.zzbv(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", zzb.zze()});
            }
            return (byte) 1;
        }
    }

    public interface zzax extends zzidd {
        boolean zza();

        zzaw.zzb zzb();
    }

    public final class zzay extends zzibr<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zzj;
        private static volatile zzidk<zzay> zzk;
        private int zze;
        private zzar zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zza extends zzibl<zzay, zza> implements zzaz {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzay.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public boolean zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public zzar zzb() {
                return ((zzay) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public boolean zzg() {
                return ((zzay) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public zzq zzh() {
                return ((zzay) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public boolean zzk() {
                return ((zzay) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public zzaw zzl() {
                return ((zzay) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public boolean zzq() {
                return ((zzay) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
            public zzap zzr() {
                return ((zzay) this.zza).zzr();
            }

            public zza zzc(zzar zzarVar) {
                zzbg();
                ((zzay) this.zza).zzz(zzarVar);
                return this;
            }

            public zza zzd(zzar.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzz(zzaVar.zzbu());
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbg();
                ((zzay) this.zza).zzA(zzarVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzay) this.zza).zzB();
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzay) this.zza).zzC(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzay) this.zza).zzD();
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbg();
                ((zzay) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzn(zzaw.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzE(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzaw zzawVar) {
                zzbg();
                ((zzay) this.zza).zzF(zzawVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzay) this.zza).zzG();
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbg();
                ((zzay) this.zza).zzH(zzapVar);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbg();
                ((zzay) this.zza).zzH(zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbg();
                ((zzay) this.zza).zzI(zzapVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzay) this.zza).zzJ();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzf = null;
            this.zze &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zze &= -3;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzh = null;
            this.zze &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzi = null;
            this.zze &= -9;
        }

        public static zzay zzx() {
            return zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public boolean zzk() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public boolean zzq() {
            return (this.zze & 8) != 0;
        }

        static {
            zzay zzayVar = new zzay();
            zzj = zzayVar;
            zzibr.zzbu(zzay.class, zzayVar);
        }

        public static zzay zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzay) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzay zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzay) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzay zze(zzian zzianVar) throws zzicg {
            return (zzay) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzay zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzay) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzay zzj(byte[] bArr) throws zzicg {
            return (zzay) zzibr.zzbU(zzj, bArr);
        }

        public static zzay zzm(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzay) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzay zzn(InputStream inputStream) throws IOException {
            return (zzay) zzibr.zzbW(zzj, inputStream);
        }

        public static zzay zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzay) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzay zzp(InputStream inputStream) throws IOException {
            return (zzay) zzibr.zzca(zzj, inputStream);
        }

        public static zzay zzs(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzay) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzay zzt(zziaq zziaqVar) throws IOException {
            return (zzay) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzay zzu(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzay) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzv() {
            return (zza) zzj.zzbn();
        }

        public static zza zzw(zzay zzayVar) {
            return (zza) zzj.zzbo(zzayVar);
        }

        public static zzidk<zzay> zzy() {
            return zzj.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public zzar zzb() {
            zzar zzarVar = this.zzf;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public zzq zzh() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public zzaw zzl() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaz
        public zzap zzr() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzz(zzar zzarVar) {
            zzarVar.getClass();
            this.zzf = zzarVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzf;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzf = zzarVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzh = zzawVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzay> zzidkVar = zzk;
                                    if (zzidkVar == null) {
                                        synchronized (zzay.class) {
                                            try {
                                                zzibmVar = zzk;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzj);
                                                    zzk = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzj;
                        }
                        return new zza(bArr);
                    }
                    return new zzay();
                }
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            return (byte) 1;
        }
    }

    public interface zzaz extends zzidd {
        boolean zza();

        zzar zzb();

        boolean zzg();

        zzq zzh();

        boolean zzk();

        zzaw zzl();

        boolean zzq();

        zzap zzr();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zzb extends zzibr<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzc;
        private static volatile zzidk<zzb> zzd;
        private zzicd<zza> zzb = zzibr.zzbM();

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zza extends zzibr<zza, C0777zza> implements InterfaceC0778zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzh;
            private static volatile zzidk<zza> zzi;
            private int zzd;
            private int zze;
            private zze zzf;
            private zzg zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$zzb$zza$zza, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
            public final class C0777zza extends zzibl<zza, C0777zza> implements InterfaceC0778zzb {
                /* synthetic */ C0777zza(byte[] bArr) {
                    this();
                }

                private C0777zza() {
                    super(zza.zzh);
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
                public boolean zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
                public zzd zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
                public boolean zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
                public zze zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
                public boolean zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
                public zzg zzl() {
                    return ((zza) this.zza).zzl();
                }

                public C0777zza zzc(zzd zzdVar) {
                    zzbg();
                    ((zza) this.zza).zzw(zzdVar);
                    return this;
                }

                public C0777zza zzd() {
                    zzbg();
                    ((zza) this.zza).zzx();
                    return this;
                }

                public C0777zza zzg(zze zzeVar) {
                    zzbg();
                    ((zza) this.zza).zzy(zzeVar);
                    return this;
                }

                public C0777zza zzh(zze.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzy(zzaVar.zzbu());
                    return this;
                }

                public C0777zza zzi(zze zzeVar) {
                    zzbg();
                    ((zza) this.zza).zzz(zzeVar);
                    return this;
                }

                public C0777zza zzj() {
                    zzbg();
                    ((zza) this.zza).zzA();
                    return this;
                }

                public C0777zza zzm(zzg zzgVar) {
                    zzbg();
                    ((zza) this.zza).zzB(zzgVar);
                    return this;
                }

                public C0777zza zzn(zzg.zza zzaVar) {
                    zzbg();
                    ((zza) this.zza).zzB(zzaVar.zzbu());
                    return this;
                }

                public C0777zza zzo(zzg zzgVar) {
                    zzbg();
                    ((zza) this.zza).zzC(zzgVar);
                    return this;
                }

                public C0777zza zzp() {
                    zzbg();
                    ((zza) this.zza).zzD();
                    return this;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzd &= -2;
                this.zze = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
            public void zzA() {
                this.zzf = null;
                this.zzd &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
            public void zzD() {
                this.zzg = null;
                this.zzd &= -5;
            }

            public static zza zzu() {
                return zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
            public boolean zza() {
                return (this.zzd & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
            public boolean zze() {
                return (this.zzd & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
            public boolean zzk() {
                return (this.zzd & 4) != 0;
            }

            static {
                zza zzaVar = new zza();
                zzh = zzaVar;
                zzibr.zzbu(zza.class, zzaVar);
            }

            public static zza zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zza) zzibr.zzbR(zzh, byteBuffer);
            }

            public static zza zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
            }

            public static zza zzg(zzian zzianVar) throws zzicg {
                return (zza) zzibr.zzbS(zzh, zzianVar);
            }

            public static zza zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbT(zzh, zzianVar, zzibbVar);
            }

            public static zza zzi(byte[] bArr) throws zzicg {
                return (zza) zzibr.zzbU(zzh, bArr);
            }

            public static zza zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zza) zzibr.zzbV(zzh, bArr, zzibbVar);
            }

            public static zza zzm(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzbW(zzh, inputStream);
            }

            public static zza zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbX(zzh, inputStream, zzibbVar);
            }

            public static zza zzo(InputStream inputStream) throws IOException {
                return (zza) zzibr.zzca(zzh, inputStream);
            }

            public static zza zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzcb(zzh, inputStream, zzibbVar);
            }

            public static zza zzq(zziaq zziaqVar) throws IOException {
                return (zza) zzibr.zzbY(zzh, zziaqVar);
            }

            public static zza zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zza) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
            }

            public static C0777zza zzs() {
                return (C0777zza) zzh.zzbn();
            }

            public static C0777zza zzt(zza zzaVar) {
                return (C0777zza) zzh.zzbo(zzaVar);
            }

            public static zzidk<zza> zzv() {
                return zzh.zzbd();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
            public zzd zzb() {
                zzd zzdVarZzc = zzd.zzc(this.zze);
                return zzdVarZzc == null ? zzd.UNSPECIFIED : zzdVarZzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
            public zze zzf() {
                zze zzeVar = this.zzf;
                return zzeVar == null ? zze.zzs() : zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.InterfaceC0778zzb
            public zzg zzl() {
                zzg zzgVar = this.zzg;
                return zzgVar == null ? zzg.zzu() : zzgVar;
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
            public void zzw(zzd zzdVar) {
                this.zze = zzdVar.zza();
                this.zzd |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public void zzy(zze zzeVar) {
                zzeVar.getClass();
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
            public void zzz(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzf;
                if (zzeVar2 != null && zzeVar2 != zze.zzs()) {
                    zze.zza zzaVarZzr = zze.zzr(zzeVar2);
                    zzaVarZzr.zzbo(zzeVar);
                    zzeVar = zzaVarZzr.zzbt();
                }
                this.zzf = zzeVar;
                this.zzd |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
            public void zzB(zzg zzgVar) {
                zzgVar.getClass();
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
            public void zzC(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzg;
                if (zzgVar2 != null && zzgVar2 != zzg.zzu()) {
                    zzg.zza zzaVarZzt = zzg.zzt(zzgVar2);
                    zzaVarZzt.zzbo(zzgVar);
                    zzgVar = zzaVarZzt.zzbt();
                }
                this.zzg = zzgVar;
                this.zzd |= 4;
            }

            @Override // com.google.android.gms.internal.ads.zzibr
            protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                zzidk zzibmVar;
                int iOrdinal = zzibqVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            byte[] bArr = null;
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    if (iOrdinal == 6) {
                                        zzidk<zza> zzidkVar = zzi;
                                        if (zzidkVar == null) {
                                            synchronized (zza.class) {
                                                try {
                                                    zzibmVar = zzi;
                                                    if (zzibmVar == null) {
                                                        zzibmVar = new zzibm(zzh);
                                                        zzi = zzibmVar;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            return zzibmVar;
                                        }
                                        return zzidkVar;
                                    }
                                    throw null;
                                }
                                return zzh;
                            }
                            return new C0777zza(bArr);
                        }
                        return new zza();
                    }
                    return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzd.zze(), "zzf", "zzg"});
                }
                return (byte) 1;
            }
        }

        /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$zzb$zzb, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public interface InterfaceC0778zzb extends zzidd {
            boolean zza();

            zzd zzb();

            boolean zze();

            zze zzf();

            boolean zzk();

            zzg zzl();
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zzc extends zzibl<zzb, zzc> implements zzc {
            /* synthetic */ zzc(byte[] bArr) {
                this();
            }

            private zzc() {
                super(zzb.zzc);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzc
            public List<zza> zza() {
                return Collections.unmodifiableList(((zzb) this.zza).zza());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzc
            public int zzb() {
                return ((zzb) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzc
            public zza zzc(int i2) {
                return ((zzb) this.zza).zzc(i2);
            }

            public zzc zzd(int i2, zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzw(i2, zzaVar);
                return this;
            }

            public zzc zze(int i2, zza.C0777zza c0777zza) {
                zzbg();
                ((zzb) this.zza).zzw(i2, c0777zza.zzbu());
                return this;
            }

            public zzc zzf(zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzx(zzaVar);
                return this;
            }

            public zzc zzg(int i2, zza zzaVar) {
                zzbg();
                ((zzb) this.zza).zzy(i2, zzaVar);
                return this;
            }

            public zzc zzh(zza.C0777zza c0777zza) {
                zzbg();
                ((zzb) this.zza).zzx(c0777zza.zzbu());
                return this;
            }

            public zzc zzi(int i2, zza.C0777zza c0777zza) {
                zzbg();
                ((zzb) this.zza).zzy(i2, c0777zza.zzbu());
                return this;
            }

            public zzc zzj(Iterable<? extends zza> iterable) {
                zzbg();
                ((zzb) this.zza).zzz(iterable);
                return this;
            }

            public zzc zzk() {
                zzbg();
                ((zzb) this.zza).zzA();
                return this;
            }

            public zzc zzl(int i2) {
                zzbg();
                ((zzb) this.zza).zzB(i2);
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public enum zzd implements zzibv {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzibw<zzd> zze = new zzibw<zzd>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzb.zzd.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i2) {
                    return zzd.zzc(i2);
                }
            };
            private final int zzf;

            public static zzd zzc(int i2) {
                if (i2 == 0) {
                    return UNSPECIFIED;
                }
                if (i2 != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzibw<zzd> zzd() {
                return zze;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzf;
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zzd.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzd(int i2) {
                this.zzf = i2;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zze extends zzibr<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzf;
            private static volatile zzidk<zze> zzg;
            private int zzc;
            private boolean zzd;
            private int zze;

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
            public final class zza extends zzibl<zze, zza> implements zzf {
                /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                private zza() {
                    super(zze.zzf);
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
                public boolean zza() {
                    return ((zze) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
                public boolean zzb() {
                    return ((zze) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
                public boolean zze() {
                    return ((zze) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
                public int zzf() {
                    return ((zze) this.zza).zzf();
                }

                public zza zzc(boolean z2) {
                    zzbg();
                    ((zze) this.zza).zzu(z2);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zze) this.zza).zzv();
                    return this;
                }

                public zza zzg(int i2) {
                    zzbg();
                    ((zze) this.zza).zzw(i2);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zze) this.zza).zzx();
                    return this;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
            public void zzv() {
                this.zzc &= -2;
                this.zzd = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
            public void zzw(int i2) {
                this.zzc |= 2;
                this.zze = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzc &= -3;
                this.zze = 0;
            }

            public static zze zzs() {
                return zzf;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
            public void zzu(boolean z2) {
                this.zzc |= 1;
                this.zzd = z2;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
            public boolean zza() {
                return (this.zzc & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
            public boolean zzb() {
                return this.zzd;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
            public boolean zze() {
                return (this.zzc & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzf
            public int zzf() {
                return this.zze;
            }

            static {
                zze zzeVar = new zze();
                zzf = zzeVar;
                zzibr.zzbu(zze.class, zzeVar);
            }

            public static zze zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zze) zzibr.zzbR(zzf, byteBuffer);
            }

            public static zze zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zze) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
            }

            public static zze zzg(zzian zzianVar) throws zzicg {
                return (zze) zzibr.zzbS(zzf, zzianVar);
            }

            public static zze zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zze) zzibr.zzbT(zzf, zzianVar, zzibbVar);
            }

            public static zze zzi(byte[] bArr) throws zzicg {
                return (zze) zzibr.zzbU(zzf, bArr);
            }

            public static zze zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zze) zzibr.zzbV(zzf, bArr, zzibbVar);
            }

            public static zze zzk(InputStream inputStream) throws IOException {
                return (zze) zzibr.zzbW(zzf, inputStream);
            }

            public static zze zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zze) zzibr.zzbX(zzf, inputStream, zzibbVar);
            }

            public static zze zzm(InputStream inputStream) throws IOException {
                return (zze) zzibr.zzca(zzf, inputStream);
            }

            public static zze zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zze) zzibr.zzcb(zzf, inputStream, zzibbVar);
            }

            public static zze zzo(zziaq zziaqVar) throws IOException {
                return (zze) zzibr.zzbY(zzf, zziaqVar);
            }

            public static zze zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zze) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
            }

            public static zza zzq() {
                return (zza) zzf.zzbn();
            }

            public static zza zzr(zze zzeVar) {
                return (zza) zzf.zzbo(zzeVar);
            }

            public static zzidk<zze> zzt() {
                return zzf.zzbd();
            }

            private zze() {
            }

            @Override // com.google.android.gms.internal.ads.zzibr
            protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                zzidk zzibmVar;
                int iOrdinal = zzibqVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            byte[] bArr = null;
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    if (iOrdinal == 6) {
                                        zzidk<zze> zzidkVar = zzg;
                                        if (zzidkVar == null) {
                                            synchronized (zze.class) {
                                                try {
                                                    zzibmVar = zzg;
                                                    if (zzibmVar == null) {
                                                        zzibmVar = new zzibm(zzf);
                                                        zzg = zzibmVar;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            return zzibmVar;
                                        }
                                        return zzidkVar;
                                    }
                                    throw null;
                                }
                                return zzf;
                            }
                            return new zza(bArr);
                        }
                        return new zze();
                    }
                    return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
                }
                return (byte) 1;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public interface zzf extends zzidd {
            boolean zza();

            boolean zzb();

            boolean zze();

            int zzf();
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zzg extends zzibr<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzh;
            private static volatile zzidk<zzg> zzi;
            private int zzd;
            private boolean zze;
            private boolean zzf;
            private int zzg;

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public final class zza extends zzibl<zzg, zza> implements zzh {
                /* synthetic */ zza(byte[] bArr) {
                    this();
                }

                private zza() {
                    super(zzg.zzh);
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
                public boolean zza() {
                    return ((zzg) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
                public boolean zzb() {
                    return ((zzg) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
                public boolean zze() {
                    return ((zzg) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
                public boolean zzf() {
                    return ((zzg) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
                public int zzj() {
                    return ((zzg) this.zza).zzj();
                }

                public zza zzc(boolean z2) {
                    zzbg();
                    ((zzg) this.zza).zzw(z2);
                    return this;
                }

                public zza zzd() {
                    zzbg();
                    ((zzg) this.zza).zzx();
                    return this;
                }

                public zza zzg(boolean z2) {
                    zzbg();
                    ((zzg) this.zza).zzy(z2);
                    return this;
                }

                public zza zzh() {
                    zzbg();
                    ((zzg) this.zza).zzz();
                    return this;
                }

                public zza zzk(int i2) {
                    zzbg();
                    ((zzg) this.zza).zzA(i2);
                    return this;
                }

                public zza zzl() {
                    zzbg();
                    ((zzg) this.zza).zzB();
                    return this;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
            public void zzw(boolean z2) {
                this.zzd |= 1;
                this.zze = z2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
            public void zzx() {
                this.zzd &= -2;
                this.zze = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
            public void zzy(boolean z2) {
                this.zzd |= 2;
                this.zzf = z2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
            public void zzz() {
                this.zzd &= -3;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
            public void zzA(int i2) {
                this.zzd |= 4;
                this.zzg = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
            public void zzB() {
                this.zzd &= -5;
                this.zzg = 0;
            }

            public static zzg zzu() {
                return zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
            public boolean zza() {
                return (this.zzd & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
            public boolean zzb() {
                return this.zze;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
            public boolean zze() {
                return (this.zzd & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
            public boolean zzi() {
                return (this.zzd & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzb.zzh
            public int zzj() {
                return this.zzg;
            }

            static {
                zzg zzgVar = new zzg();
                zzh = zzgVar;
                zzibr.zzbu(zzg.class, zzgVar);
            }

            public static zzg zzc(ByteBuffer byteBuffer) throws zzicg {
                return (zzg) zzibr.zzbR(zzh, byteBuffer);
            }

            public static zzg zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
                return (zzg) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
            }

            public static zzg zzg(zzian zzianVar) throws zzicg {
                return (zzg) zzibr.zzbS(zzh, zzianVar);
            }

            public static zzg zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
                return (zzg) zzibr.zzbT(zzh, zzianVar, zzibbVar);
            }

            public static zzg zzk(byte[] bArr) throws zzicg {
                return (zzg) zzibr.zzbU(zzh, bArr);
            }

            public static zzg zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
                return (zzg) zzibr.zzbV(zzh, bArr, zzibbVar);
            }

            public static zzg zzm(InputStream inputStream) throws IOException {
                return (zzg) zzibr.zzbW(zzh, inputStream);
            }

            public static zzg zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zzg) zzibr.zzbX(zzh, inputStream, zzibbVar);
            }

            public static zzg zzo(InputStream inputStream) throws IOException {
                return (zzg) zzibr.zzca(zzh, inputStream);
            }

            public static zzg zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
                return (zzg) zzibr.zzcb(zzh, inputStream, zzibbVar);
            }

            public static zzg zzq(zziaq zziaqVar) throws IOException {
                return (zzg) zzibr.zzbY(zzh, zziaqVar);
            }

            public static zzg zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
                return (zzg) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
            }

            public static zza zzs() {
                return (zza) zzh.zzbn();
            }

            public static zza zzt(zzg zzgVar) {
                return (zza) zzh.zzbo(zzgVar);
            }

            public static zzidk<zzg> zzv() {
                return zzh.zzbd();
            }

            private zzg() {
            }

            @Override // com.google.android.gms.internal.ads.zzibr
            protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
                zzidk zzibmVar;
                int iOrdinal = zzibqVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            byte[] bArr = null;
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    if (iOrdinal == 6) {
                                        zzidk<zzg> zzidkVar = zzi;
                                        if (zzidkVar == null) {
                                            synchronized (zzg.class) {
                                                try {
                                                    zzibmVar = zzi;
                                                    if (zzibmVar == null) {
                                                        zzibmVar = new zzibm(zzh);
                                                        zzi = zzibmVar;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            return zzibmVar;
                                        }
                                        return zzidkVar;
                                    }
                                    throw null;
                                }
                                return zzh;
                            }
                            return new zza(bArr);
                        }
                        return new zzg();
                    }
                    return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
                }
                return (byte) 1;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public interface zzh extends zzidd {
            boolean zza();

            boolean zzb();

            boolean zze();

            boolean zzf();

            boolean zzi();

            int zzj();
        }

        public static zzb zzu() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzc
        public List<zza> zza() {
            return this.zzb;
        }

        public List<? extends InterfaceC0778zzb> zzd() {
            return this.zzb;
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzibr.zzbu(zzb.class, zzbVar);
        }

        private void zzD() {
            zzicd<zza> zzicdVar = this.zzb;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzb = zzibr.zzbN(zzicdVar);
        }

        public static zzb zzg(ByteBuffer byteBuffer) throws zzicg {
            return (zzb) zzibr.zzbR(zzc, byteBuffer);
        }

        public static zzb zzh(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzb) zzibr.zzbQ(zzc, byteBuffer, zzibbVar);
        }

        public static zzb zzi(zzian zzianVar) throws zzicg {
            return (zzb) zzibr.zzbS(zzc, zzianVar);
        }

        public static zzb zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzb) zzibr.zzbT(zzc, zzianVar, zzibbVar);
        }

        public static zzb zzk(byte[] bArr) throws zzicg {
            return (zzb) zzibr.zzbU(zzc, bArr);
        }

        public static zzb zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzb) zzibr.zzbV(zzc, bArr, zzibbVar);
        }

        public static zzb zzm(InputStream inputStream) throws IOException {
            return (zzb) zzibr.zzbW(zzc, inputStream);
        }

        public static zzb zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzb) zzibr.zzbX(zzc, inputStream, zzibbVar);
        }

        public static zzb zzo(InputStream inputStream) throws IOException {
            return (zzb) zzibr.zzca(zzc, inputStream);
        }

        public static zzb zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzb) zzibr.zzcb(zzc, inputStream, zzibbVar);
        }

        public static zzb zzq(zziaq zziaqVar) throws IOException {
            return (zzb) zzibr.zzbY(zzc, zziaqVar);
        }

        public static zzb zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzb) zzibr.zzbZ(zzc, zziaqVar, zzibbVar);
        }

        public static zzc zzs() {
            return (zzc) zzc.zzbn();
        }

        public static zzc zzt(zzb zzbVar) {
            return (zzc) zzc.zzbo(zzbVar);
        }

        public static zzidk<zzb> zzv() {
            return zzc.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzc
        public int zzb() {
            return this.zzb.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzc
        public zza zzc(int i2) {
            return this.zzb.get(i2);
        }

        public InterfaceC0778zzb zze(int i2) {
            return this.zzb.get(i2);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.set(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzx(zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzy(int i2, zza zzaVar) {
            zzaVar.getClass();
            zzD();
            this.zzb.add(i2, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzz(Iterable<? extends zza> iterable) {
            zzD();
            zzhzw.zzaW(iterable, this.zzb);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzb = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzB(int i2) {
            zzD();
            this.zzb.remove(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzb> zzidkVar = zzd;
                                    if (zzidkVar == null) {
                                        synchronized (zzb.class) {
                                            try {
                                                zzibmVar = zzd;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzc);
                                                    zzd = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzc;
                        }
                        return new zzc(bArr);
                    }
                    return new zzb();
                }
                return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zza.class});
            }
            return (byte) 1;
        }
    }

    public final class zzba extends zzibr<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzl;
        private static volatile zzidk<zzba> zzm;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zza extends zzibl<zzba, zza> implements zzbb {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzba.zzl);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public boolean zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public zzq zzb() {
                return ((zzba) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public boolean zze() {
                return ((zzba) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public zzaw zzf() {
                return ((zzba) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public boolean zzk() {
                return ((zzba) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public int zzl() {
                return ((zzba) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public boolean zzo() {
                return ((zzba) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public int zzp() {
                return ((zzba) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
            public int zzt() {
                return ((zzba) this.zza).zzt();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzba) this.zza).zzA(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzba) this.zza).zzB();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzba) this.zza).zzC(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzba) this.zza).zzC(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzba) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzba) this.zza).zzE();
                return this;
            }

            public zza zzm(int i2) {
                zzbg();
                ((zzba) this.zza).zzF(i2);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzba) this.zza).zzG();
                return this;
            }

            public zza zzq(int i2) {
                zzbg();
                ((zzba) this.zza).zzH(i2);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzba) this.zza).zzI();
                return this;
            }

            public zza zzu(int i2) {
                zzbg();
                ((zzba) this.zza).zzJ(i2);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzba) this.zza).zzK();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(int i2) {
            this.zzf |= 4;
            this.zzi = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2) {
            this.zzf |= 8;
            this.zzj = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzf &= -9;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i2) {
            this.zzf |= 16;
            this.zzk = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzf &= -17;
            this.zzk = 0;
        }

        public static zzba zzy() {
            return zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public boolean zza() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public boolean zze() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public boolean zzk() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public int zzl() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public boolean zzo() {
            return (this.zzf & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public int zzp() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public boolean zzs() {
            return (this.zzf & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public int zzt() {
            return this.zzk;
        }

        static {
            zzba zzbaVar = new zzba();
            zzl = zzbaVar;
            zzibr.zzbu(zzba.class, zzbaVar);
        }

        public static zzba zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzba) zzibr.zzbR(zzl, byteBuffer);
        }

        public static zzba zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzba) zzibr.zzbQ(zzl, byteBuffer, zzibbVar);
        }

        public static zzba zzg(zzian zzianVar) throws zzicg {
            return (zzba) zzibr.zzbS(zzl, zzianVar);
        }

        public static zzba zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzba) zzibr.zzbT(zzl, zzianVar, zzibbVar);
        }

        public static zzba zzi(byte[] bArr) throws zzicg {
            return (zzba) zzibr.zzbU(zzl, bArr);
        }

        public static zzba zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzba) zzibr.zzbV(zzl, bArr, zzibbVar);
        }

        public static zzba zzm(InputStream inputStream) throws IOException {
            return (zzba) zzibr.zzbW(zzl, inputStream);
        }

        public static zzba zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzba) zzibr.zzbX(zzl, inputStream, zzibbVar);
        }

        public static zzba zzq(InputStream inputStream) throws IOException {
            return (zzba) zzibr.zzca(zzl, inputStream);
        }

        public static zzba zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzba) zzibr.zzcb(zzl, inputStream, zzibbVar);
        }

        public static zzba zzu(zziaq zziaqVar) throws IOException {
            return (zzba) zzibr.zzbY(zzl, zziaqVar);
        }

        public static zzba zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzba) zzibr.zzbZ(zzl, zziaqVar, zzibbVar);
        }

        public static zza zzw() {
            return (zza) zzl.zzbn();
        }

        public static zza zzx(zzba zzbaVar) {
            return (zza) zzl.zzbo(zzbaVar);
        }

        public static zzidk<zzba> zzz() {
            return zzl.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbb
        public zzaw zzf() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        private zzba() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzba> zzidkVar = zzm;
                                    if (zzidkVar == null) {
                                        synchronized (zzba.class) {
                                            try {
                                                zzibmVar = zzm;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzl);
                                                    zzm = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzl;
                        }
                        return new zza(bArr);
                    }
                    return new zzba();
                }
                return zzibr.zzbv(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi", "zzj", "zzk"});
            }
            return (byte) 1;
        }
    }

    public interface zzbb extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        int zzl();

        boolean zzo();

        int zzp();

        boolean zzs();

        int zzt();
    }

    public final class zzbc extends zzibr<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzh;
        private static volatile zzidk<zzbc> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
        public final class zza extends zzibl<zzbc, zza> implements zzbd {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzbc.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
            public boolean zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
            public zzq zzb() {
                return ((zzbc) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
            public boolean zze() {
                return ((zzbc) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
            public zzaw zzf() {
                return ((zzbc) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
            public boolean zzk() {
                return ((zzbc) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
            public zzap zzl() {
                return ((zzbc) this.zza).zzl();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbc) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbc) this.zza).zzx();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbc) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbc) this.zza).zzy(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbc) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbc) this.zza).zzA();
                return this;
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzbc) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzbc) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzbc) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzbc) this.zza).zzD();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzbc zzu() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzh = zzbcVar;
            zzibr.zzbu(zzbc.class, zzbcVar);
        }

        public static zzbc zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbc) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzbc zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbc) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzbc zzg(zzian zzianVar) throws zzicg {
            return (zzbc) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzbc zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbc) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzbc zzi(byte[] bArr) throws zzicg {
            return (zzbc) zzibr.zzbU(zzh, bArr);
        }

        public static zzbc zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbc) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzbc zzm(InputStream inputStream) throws IOException {
            return (zzbc) zzibr.zzbW(zzh, inputStream);
        }

        public static zzbc zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbc) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzbc zzo(InputStream inputStream) throws IOException {
            return (zzbc) zzibr.zzca(zzh, inputStream);
        }

        public static zzbc zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbc) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzbc zzq(zziaq zziaqVar) throws IOException {
            return (zzbc) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzbc zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbc) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzbc zzbcVar) {
            return (zza) zzh.zzbo(zzbcVar);
        }

        public static zzidk<zzbc> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zze);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbd
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzbc> zzidkVar = zzi;
                                    if (zzidkVar == null) {
                                        synchronized (zzbc.class) {
                                            try {
                                                zzibmVar = zzi;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzh);
                                                    zzi = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzh;
                        }
                        return new zza(bArr);
                    }
                    return new zzbc();
                }
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    public interface zzbd extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public final class zzbe extends zzibr<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzn;
        private static volatile zzidk<zzbe> zzo;
        private int zzg;
        private int zzh = 1000;
        private zzaw zzi;
        private int zzj;
        private int zzk;
        private int zzl;
        private long zzm;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzbe, zza> implements zzbf {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzbe.zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public boolean zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public zzq zzb() {
                return ((zzbe) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public boolean zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public boolean zzk() {
                return ((zzbe) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public int zzl() {
                return ((zzbe) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public boolean zzo() {
                return ((zzbe) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public int zzp() {
                return ((zzbe) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public boolean zzs() {
                return ((zzbe) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public int zzt() {
                return ((zzbe) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
            public long zzx() {
                return ((zzbe) this.zza).zzx();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbe) this.zza).zzC(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbe) this.zza).zzD();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbe) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbe) this.zza).zzE(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbe) this.zza).zzF(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbe) this.zza).zzG();
                return this;
            }

            public zza zzm(int i2) {
                zzbg();
                ((zzbe) this.zza).zzH(i2);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzbe) this.zza).zzI();
                return this;
            }

            public zza zzq(int i2) {
                zzbg();
                ((zzbe) this.zza).zzJ(i2);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzbe) this.zza).zzK();
                return this;
            }

            public zza zzu(int i2) {
                zzbg();
                ((zzbe) this.zza).zzL(i2);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzbe) this.zza).zzM();
                return this;
            }

            public zza zzy(long j2) {
                zzbg();
                ((zzbe) this.zza).zzN(j2);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzbe) this.zza).zzO();
                return this;
            }
        }

        public static zzbe zzA() {
            return zzn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg &= -2;
            this.zzh = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2) {
            this.zzg |= 4;
            this.zzj = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzg &= -5;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i2) {
            this.zzg |= 8;
            this.zzk = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzK() {
            this.zzg &= -9;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzL(int i2) {
            this.zzg |= 16;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzg &= -17;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzN(long j2) {
            this.zzg |= 32;
            this.zzm = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzO() {
            this.zzg &= -33;
            this.zzm = 0L;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public boolean zza() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public boolean zze() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public boolean zzk() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public int zzl() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public boolean zzo() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public int zzp() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public boolean zzs() {
            return (this.zzg & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public int zzt() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public boolean zzw() {
            return (this.zzg & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public long zzx() {
            return this.zzm;
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzn = zzbeVar;
            zzibr.zzbu(zzbe.class, zzbeVar);
        }

        public static zzidk<zzbe> zzB() {
            return zzn.zzbd();
        }

        public static zzbe zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbe) zzibr.zzbR(zzn, byteBuffer);
        }

        public static zzbe zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbe) zzibr.zzbQ(zzn, byteBuffer, zzibbVar);
        }

        public static zzbe zzg(zzian zzianVar) throws zzicg {
            return (zzbe) zzibr.zzbS(zzn, zzianVar);
        }

        public static zzbe zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbe) zzibr.zzbT(zzn, zzianVar, zzibbVar);
        }

        public static zzbe zzi(byte[] bArr) throws zzicg {
            return (zzbe) zzibr.zzbU(zzn, bArr);
        }

        public static zzbe zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbe) zzibr.zzbV(zzn, bArr, zzibbVar);
        }

        public static zzbe zzm(InputStream inputStream) throws IOException {
            return (zzbe) zzibr.zzbW(zzn, inputStream);
        }

        public static zzbe zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbe) zzibr.zzbX(zzn, inputStream, zzibbVar);
        }

        public static zzbe zzq(InputStream inputStream) throws IOException {
            return (zzbe) zzibr.zzca(zzn, inputStream);
        }

        public static zzbe zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbe) zzibr.zzcb(zzn, inputStream, zzibbVar);
        }

        public static zzbe zzu(zziaq zziaqVar) throws IOException {
            return (zzbe) zzibr.zzbY(zzn, zziaqVar);
        }

        public static zzbe zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbe) zzibr.zzbZ(zzn, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzn.zzbn();
        }

        public static zza zzz(zzbe zzbeVar) {
            return (zza) zzn.zzbo(zzbeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzh);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzi;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        private zzbe() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzC(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzi = zzawVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzF(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzi;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzi = zzawVar;
            this.zzg |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzbe> zzidkVar = zzo;
                                    if (zzidkVar == null) {
                                        synchronized (zzbe.class) {
                                            try {
                                                zzibmVar = zzo;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzn);
                                                    zzo = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzn;
                        }
                        return new zza(bArr);
                    }
                    return new zzbe();
                }
                return zzibr.zzbv(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", zzq.zze(), "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            return (byte) 1;
        }
    }

    public interface zzbf extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        int zzl();

        boolean zzo();

        int zzp();

        boolean zzs();

        int zzt();

        boolean zzw();

        long zzx();
    }

    public final class zzbg extends zzibr<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzh;
        private static volatile zzidk<zzbg> zzi;
        private int zzd;
        private int zze = 1000;
        private zzaw zzf;
        private zzap zzg;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzbg, zza> implements zzbh {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzbg.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
            public boolean zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
            public zzq zzb() {
                return ((zzbg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
            public boolean zze() {
                return ((zzbg) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
            public zzaw zzf() {
                return ((zzbg) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
            public boolean zzk() {
                return ((zzbg) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
            public zzap zzl() {
                return ((zzbg) this.zza).zzl();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbg) this.zza).zzw(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbg) this.zza).zzx();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbg) this.zza).zzy(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbg) this.zza).zzy(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbg) this.zza).zzz(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbg) this.zza).zzA();
                return this;
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzbg) this.zza).zzB(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzbg) this.zza).zzB(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzbg) this.zza).zzC(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzbg) this.zza).zzD();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzd &= -2;
            this.zze = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzJ, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zzf = null;
            this.zzd &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzD() {
            this.zzg = null;
            this.zzd &= -5;
        }

        public static zzbg zzu() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
        public boolean zze() {
            return (this.zzd & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
        public boolean zzk() {
            return (this.zzd & 4) != 0;
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzh = zzbgVar;
            zzibr.zzbu(zzbg.class, zzbgVar);
        }

        public static zzbg zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbg) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzbg zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbg) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzbg zzg(zzian zzianVar) throws zzicg {
            return (zzbg) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzbg zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbg) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzbg zzi(byte[] bArr) throws zzicg {
            return (zzbg) zzibr.zzbU(zzh, bArr);
        }

        public static zzbg zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbg) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzbg zzm(InputStream inputStream) throws IOException {
            return (zzbg) zzibr.zzbW(zzh, inputStream);
        }

        public static zzbg zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbg) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzbg zzo(InputStream inputStream) throws IOException {
            return (zzbg) zzibr.zzca(zzh, inputStream);
        }

        public static zzbg zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbg) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzbg zzq(zziaq zziaqVar) throws IOException {
            return (zzbg) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzbg zzr(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbg) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzs() {
            return (zza) zzh.zzbn();
        }

        public static zza zzt(zzbg zzbgVar) {
            return (zza) zzh.zzbo(zzbgVar);
        }

        public static zzidk<zzbg> zzv() {
            return zzh.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zze);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
        public zzaw zzf() {
            zzaw zzawVar = this.zzf;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbh
        public zzap zzl() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzw(zzq zzqVar) {
            this.zze = zzqVar.zza();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzy(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzz(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzf;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zzf = zzawVar;
            this.zzd |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
        public void zzB(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public void zzC(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzg = zzapVar;
            this.zzd |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzbg> zzidkVar = zzi;
                                    if (zzidkVar == null) {
                                        synchronized (zzbg.class) {
                                            try {
                                                zzibmVar = zzi;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzh);
                                                    zzi = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzh;
                        }
                        return new zza(bArr);
                    }
                    return new zzbg();
                }
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzq.zze(), "zzf", "zzg"});
            }
            return (byte) 1;
        }
    }

    public interface zzbh extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();

        boolean zzk();

        zzap zzl();
    }

    public interface zzbi extends zzidd {
        boolean zzE();

        zzbc zzF();

        boolean zzK();

        zzay zzL();

        boolean zzQ();

        int zzR();

        boolean zzU();

        int zzV();

        boolean zzY();

        zzap zzZ();

        boolean zza();

        boolean zzae();

        int zzaf();

        boolean zzai();

        int zzaj();

        boolean zzam();

        int zzan();

        boolean zzaq();

        int zzar();

        boolean zzau();

        int zzav();

        boolean zzay();

        long zzaz();

        zzba zzb();

        boolean zzg();

        zzbe zzh();

        boolean zzm();

        zzbg zzn();

        boolean zzs();

        zzbj zzt();

        boolean zzy();

        zzau zzz();
    }

    public final class zzbj extends zzibr<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzf;
        private static volatile zzidk<zzbj> zzg;
        private int zzc;
        private int zzd = 1000;
        private zzaw zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public final class zza extends zzibl<zzbj, zza> implements zzbk {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzbj.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
            public boolean zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
            public zzq zzb() {
                return ((zzbj) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
            public boolean zze() {
                return ((zzbj) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
            public zzaw zzf() {
                return ((zzbj) this.zza).zzf();
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzbj) this.zza).zzu(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbj) this.zza).zzv();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbg();
                ((zzbj) this.zza).zzw(zzawVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbg();
                ((zzbj) this.zza).zzw(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbg();
                ((zzbj) this.zza).zzx(zzawVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzbj) this.zza).zzy();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzbj zzs() {
            return zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzf = zzbjVar;
            zzibr.zzbu(zzbj.class, zzbjVar);
        }

        public static zzbj zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbj) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzbj zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbj) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzbj zzg(zzian zzianVar) throws zzicg {
            return (zzbj) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzbj zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbj) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzbj zzi(byte[] bArr) throws zzicg {
            return (zzbj) zzibr.zzbU(zzf, bArr);
        }

        public static zzbj zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbj) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzbj zzk(InputStream inputStream) throws IOException {
            return (zzbj) zzibr.zzbW(zzf, inputStream);
        }

        public static zzbj zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbj) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzbj zzm(InputStream inputStream) throws IOException {
            return (zzbj) zzibr.zzca(zzf, inputStream);
        }

        public static zzbj zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbj) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzbj zzo(zziaq zziaqVar) throws IOException {
            return (zzbj) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzbj zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbj) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzbj zzbjVar) {
            return (zza) zzf.zzbo(zzbjVar);
        }

        public static zzidk<zzbj> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzd);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbk
        public zzaw zzf() {
            zzaw zzawVar = this.zze;
            return zzawVar == null ? zzaw.zzr() : zzawVar;
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzaw zzawVar) {
            zzawVar.getClass();
            this.zze = zzawVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zze;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzr()) {
                zzaw.zza zzaVarZzq = zzaw.zzq(zzawVar2);
                zzaVarZzq.zzbo(zzawVar);
                zzawVar = zzaVarZzq.zzbt();
            }
            this.zze = zzawVar;
            this.zzc |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzbj> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzbj.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzbj();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            return (byte) 1;
        }
    }

    public interface zzbk extends zzidd {
        boolean zza();

        zzq zzb();

        boolean zze();

        zzaw zzf();
    }

    public final class zzbl extends zzibr<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzf;
        private static volatile zzidk<zzbl> zzg;
        private int zzc;
        private boolean zzd;
        private int zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzbl, zza> implements zzbm {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzbl.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
            public boolean zza() {
                return ((zzbl) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
            public boolean zzb() {
                return ((zzbl) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
            public boolean zze() {
                return ((zzbl) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
            public int zzf() {
                return ((zzbl) this.zza).zzf();
            }

            public zza zzc(boolean z2) {
                zzbg();
                ((zzbl) this.zza).zzu(z2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzbl) this.zza).zzv();
                return this;
            }

            public zza zzg(int i2) {
                zzbg();
                ((zzbl) this.zza).zzw(i2);
                return this;
            }

            public zza zzh() {
                zzbg();
                ((zzbl) this.zza).zzx();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzw(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzx() {
            this.zzc &= -3;
            this.zze = 0;
        }

        public static zzbl zzs() {
            return zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
        public void zzu(boolean z2) {
            this.zzc |= 1;
            this.zzd = z2;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
        public boolean zzb() {
            return this.zzd;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzbm
        public int zzf() {
            return this.zze;
        }

        static {
            zzbl zzblVar = new zzbl();
            zzf = zzblVar;
            zzibr.zzbu(zzbl.class, zzblVar);
        }

        public static zzbl zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzbl) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzbl zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzbl) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzbl zzg(zzian zzianVar) throws zzicg {
            return (zzbl) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzbl zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzbl) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzbl zzi(byte[] bArr) throws zzicg {
            return (zzbl) zzibr.zzbU(zzf, bArr);
        }

        public static zzbl zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzbl) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzbl zzk(InputStream inputStream) throws IOException {
            return (zzbl) zzibr.zzbW(zzf, inputStream);
        }

        public static zzbl zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbl) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzbl zzm(InputStream inputStream) throws IOException {
            return (zzbl) zzibr.zzca(zzf, inputStream);
        }

        public static zzbl zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzbl) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzbl zzo(zziaq zziaqVar) throws IOException {
            return (zzbl) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzbl zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzbl) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzq() {
            return (zza) zzf.zzbn();
        }

        public static zza zzr(zzbl zzblVar) {
            return (zza) zzf.zzbo(zzblVar);
        }

        public static zzidk<zzbl> zzt() {
            return zzf.zzbd();
        }

        private zzbl() {
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzbl> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzbl.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzbl();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            return (byte) 1;
        }
    }

    public interface zzbm extends zzidd {
        boolean zza();

        boolean zzb();

        boolean zze();

        int zzf();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzc extends zzidd {
        List<zzb.zza> zza();

        int zzb();

        zzb.zza zzc(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zzd extends zzibr<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzf;
        private static volatile zzidk<zzd> zzg;
        private int zzc;
        private int zzd;
        private zzal zze;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public enum zza implements zzibv {
            zza(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zzibw<zza> zzw = new zzibw<zza>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzd.zza.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zza zzb(int i2) {
                    return zza.zzc(i2);
                }
            };
            private final int zzx;

            public static zza zzc(int i2) {
                switch (i2) {
                    case 0:
                        return zza;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzibw<zza> zzd() {
                return zzw;
            }

            public static zzibx zze() {
                return C0779zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzx);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzx;
            }

            /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$zzd$zza$zza, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
            final class C0779zza implements zzibx {
                static final zzibx zza = new C0779zza();

                private C0779zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zza.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zza(int i2) {
                this.zzx = i2;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        public final class zzb extends zzibl<zzd, zzb> implements zze {
            /* synthetic */ zzb(byte[] bArr) {
                this();
            }

            private zzb() {
                super(zzd.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zze
            public boolean zza() {
                return ((zzd) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zze
            public zza zzb() {
                return ((zzd) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zze
            public boolean zze() {
                return ((zzd) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zze
            public zzal zzf() {
                return ((zzd) this.zza).zzf();
            }

            public zzb zzc(zza zzaVar) {
                zzbg();
                ((zzd) this.zza).zzu(zzaVar);
                return this;
            }

            public zzb zzd() {
                zzbg();
                ((zzd) this.zza).zzv();
                return this;
            }

            public zzb zzg(zzal zzalVar) {
                zzbg();
                ((zzd) this.zza).zzw(zzalVar);
                return this;
            }

            public zzb zzh(zzal.zza zzaVar) {
                zzbg();
                ((zzd) this.zza).zzw(zzaVar.zzbu());
                return this;
            }

            public zzb zzi(zzal zzalVar) {
                zzbg();
                ((zzd) this.zza).zzx(zzalVar);
                return this;
            }

            public zzb zzj() {
                zzbg();
                ((zzd) this.zza).zzy();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
        public void zzv() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzE, reason: merged with bridge method [inline-methods] */
        public void zzy() {
            this.zze = null;
            this.zzc &= -3;
        }

        public static zzd zzs() {
            return zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zze
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zze
        public boolean zze() {
            return (this.zzc & 2) != 0;
        }

        static {
            zzd zzdVar = new zzd();
            zzf = zzdVar;
            zzibr.zzbu(zzd.class, zzdVar);
        }

        public static zzd zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzd) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzd zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzd) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzd zzg(zzian zzianVar) throws zzicg {
            return (zzd) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzd zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzd) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzd zzi(byte[] bArr) throws zzicg {
            return (zzd) zzibr.zzbU(zzf, bArr);
        }

        public static zzd zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzd) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzd zzk(InputStream inputStream) throws IOException {
            return (zzd) zzibr.zzbW(zzf, inputStream);
        }

        public static zzd zzl(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzd) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzd zzm(InputStream inputStream) throws IOException {
            return (zzd) zzibr.zzca(zzf, inputStream);
        }

        public static zzd zzn(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzd) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzd zzo(zziaq zziaqVar) throws IOException {
            return (zzd) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzd zzp(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzd) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zzb zzq() {
            return (zzb) zzf.zzbn();
        }

        public static zzb zzr(zzd zzdVar) {
            return (zzb) zzf.zzbo(zzdVar);
        }

        public static zzidk<zzd> zzt() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zze
        public zza zzb() {
            zza zzaVarZzc = zza.zzc(this.zzd);
            return zzaVarZzc == null ? zza.zza : zzaVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zze
        public zzal zzf() {
            zzal zzalVar = this.zze;
            return zzalVar == null ? zzal.zzs() : zzalVar;
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
        public void zzu(zza zzaVar) {
            this.zzd = zzaVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzw(zzal zzalVar) {
            zzalVar.getClass();
            this.zze = zzalVar;
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzx(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zze;
            if (zzalVar2 != null && zzalVar2 != zzal.zzs()) {
                zzal.zza zzaVarZzr = zzal.zzr(zzalVar2);
                zzaVarZzr.zzbo(zzalVar);
                zzalVar = zzaVarZzr.zzbt();
            }
            this.zze = zzalVar;
            this.zzc |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzd> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzd.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zzb(bArr);
                    }
                    return new zzd();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", zza.zze(), "zze"});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zze extends zzidd {
        boolean zza();

        zzd.zza zzb();

        boolean zze();

        zzal zzf();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzf extends zzidd {
        boolean zzG();

        zzk zzH();

        boolean zzM();

        zzah zzN();

        boolean zzS();

        zzac zzT();

        boolean zzY();

        zzx zzZ();

        boolean zza();

        boolean zzae();

        zzz zzaf();

        List<zzat> zzak();

        int zzal();

        zzat zzam(int i2);

        zza.EnumC0774zza zzb();

        boolean zze();

        zzq zzf();

        boolean zzi();

        zzg zzj();

        boolean zzo();

        zzi zzp();

        List<zzd> zzu();

        int zzv();

        zzd zzw(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zzg extends zzibr<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzh;
        private static volatile zzidk<zzg> zzi;
        private int zzd;
        private String zze = "";
        private zzicd<zzd> zzf = zzibr.zzbM();
        private int zzg;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        public final class zza extends zzibl<zzg, zza> implements zzh {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzg.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public boolean zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public String zzb() {
                return ((zzg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public zzian zzc() {
                return ((zzg) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public List<zzd> zzg() {
                return Collections.unmodifiableList(((zzg) this.zza).zzg());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public int zzh() {
                return ((zzg) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public zzd zzi(int i2) {
                return ((zzg) this.zza).zzi(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public boolean zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzh
            public zzq zzt() {
                return ((zzg) this.zza).zzt();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzg) this.zza).zzB(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzg) this.zza).zzC();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzg) this.zza).zzD(zzianVar);
                return this;
            }

            public zza zzj(int i2, zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzE(i2, zzdVar);
                return this;
            }

            public zza zzk(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzE(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzl(zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzF(zzdVar);
                return this;
            }

            public zza zzm(int i2, zzd zzdVar) {
                zzbg();
                ((zzg) this.zza).zzG(i2, zzdVar);
                return this;
            }

            public zza zzn(zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzF(zzbVar.zzbu());
                return this;
            }

            public zza zzo(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzg) this.zza).zzG(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzp(Iterable<? extends zzd> iterable) {
                zzbg();
                ((zzg) this.zza).zzH(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzg) this.zza).zzI();
                return this;
            }

            public zza zzr(int i2) {
                zzbg();
                ((zzg) this.zza).zzJ(i2);
                return this;
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzg) this.zza).zzK(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzg) this.zza).zzL();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzL() {
            this.zzd &= -3;
            this.zzg = 0;
        }

        public static zzg zzz() {
            return zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public boolean zza() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public String zzb() {
            return this.zze;
        }

        public List<? extends zze> zzd() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public List<zzd> zzg() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public boolean zzs() {
            return (this.zzd & 2) != 0;
        }

        static {
            zzg zzgVar = new zzg();
            zzh = zzgVar;
            zzibr.zzbu(zzg.class, zzgVar);
        }

        public static zzidk<zzg> zzA() {
            return zzh.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zzd &= -2;
            this.zze = zzz().zzb();
        }

        private void zzQ() {
            zzicd<zzd> zzicdVar = this.zzf;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzf = zzibr.zzbN(zzicdVar);
        }

        public static zzg zzj(ByteBuffer byteBuffer) throws zzicg {
            return (zzg) zzibr.zzbR(zzh, byteBuffer);
        }

        public static zzg zzk(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzg) zzibr.zzbQ(zzh, byteBuffer, zzibbVar);
        }

        public static zzg zzl(zzian zzianVar) throws zzicg {
            return (zzg) zzibr.zzbS(zzh, zzianVar);
        }

        public static zzg zzm(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzg) zzibr.zzbT(zzh, zzianVar, zzibbVar);
        }

        public static zzg zzn(byte[] bArr) throws zzicg {
            return (zzg) zzibr.zzbU(zzh, bArr);
        }

        public static zzg zzo(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzg) zzibr.zzbV(zzh, bArr, zzibbVar);
        }

        public static zzg zzp(InputStream inputStream) throws IOException {
            return (zzg) zzibr.zzbW(zzh, inputStream);
        }

        public static zzg zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzg) zzibr.zzbX(zzh, inputStream, zzibbVar);
        }

        public static zzg zzr(InputStream inputStream) throws IOException {
            return (zzg) zzibr.zzca(zzh, inputStream);
        }

        public static zzg zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzg) zzibr.zzcb(zzh, inputStream, zzibbVar);
        }

        public static zzg zzv(zziaq zziaqVar) throws IOException {
            return (zzg) zzibr.zzbY(zzh, zziaqVar);
        }

        public static zzg zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzg) zzibr.zzbZ(zzh, zziaqVar, zzibbVar);
        }

        public static zza zzx() {
            return (zza) zzh.zzbn();
        }

        public static zza zzy(zzg zzgVar) {
            return (zza) zzh.zzbo(zzgVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public zzian zzc() {
            return zzian.zzv(this.zze);
        }

        public zze zze(int i2) {
            return this.zzf.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public int zzh() {
            return this.zzf.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public zzd zzi(int i2) {
            return this.zzf.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzh
        public zzq zzt() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB(String str) {
            str.getClass();
            this.zzd |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzian zzianVar) {
            this.zze = zzianVar.zzz();
            this.zzd |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzE(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.set(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzF(zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzG(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzQ();
            this.zzf.add(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzH(Iterable<? extends zzd> iterable) {
            zzQ();
            zzhzw.zzaW(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzf = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzJ(int i2) {
            zzQ();
            this.zzf.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzK(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzd |= 2;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzg> zzidkVar = zzi;
                                    if (zzidkVar == null) {
                                        synchronized (zzg.class) {
                                            try {
                                                zzibmVar = zzi;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzh);
                                                    zzi = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzh;
                        }
                        return new zza(bArr);
                    }
                    return new zzg();
                }
                return zzibr.zzbv(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzd.class, "zzg", zzq.zze()});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public interface zzh extends zzidd {
        boolean zza();

        String zzb();

        zzian zzc();

        List<zzd> zzg();

        int zzh();

        zzd zzi(int i2);

        boolean zzs();

        zzq zzt();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public final class zzi extends zzibr<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzl;
        private static volatile zzidk<zzi> zzm;
        private int zzf;
        private String zzg = "";
        private zzicd<zzd> zzh = zzibr.zzbM();
        private int zzi = 1000;
        private int zzj = 1000;
        private int zzk = 1000;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zza extends zzibl<zzi, zza> implements zzj {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzi.zzl);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public zzq zzB() {
                return ((zzi) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public boolean zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public String zzb() {
                return ((zzi) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public zzian zzc() {
                return ((zzi) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public List<zzd> zzg() {
                return Collections.unmodifiableList(((zzi) this.zza).zzg());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public int zzh() {
                return ((zzi) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public zzd zzi(int i2) {
                return ((zzi) this.zza).zzi(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public boolean zzs() {
                return ((zzi) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public zzq zzt() {
                return ((zzi) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public boolean zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzj
            public zzq zzx() {
                return ((zzi) this.zza).zzx();
            }

            public zza zzC(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzS(zzqVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzi) this.zza).zzT();
                return this;
            }

            public zza zzd(String str) {
                zzbg();
                ((zzi) this.zza).zzF(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzi) this.zza).zzG();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzi) this.zza).zzH(zzianVar);
                return this;
            }

            public zza zzj(int i2, zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzI(i2, zzdVar);
                return this;
            }

            public zza zzk(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzI(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzl(zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzJ(zzdVar);
                return this;
            }

            public zza zzm(int i2, zzd zzdVar) {
                zzbg();
                ((zzi) this.zza).zzK(i2, zzdVar);
                return this;
            }

            public zza zzn(zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzJ(zzbVar.zzbu());
                return this;
            }

            public zza zzo(int i2, zzd.zzb zzbVar) {
                zzbg();
                ((zzi) this.zza).zzK(i2, zzbVar.zzbu());
                return this;
            }

            public zza zzp(Iterable<? extends zzd> iterable) {
                zzbg();
                ((zzi) this.zza).zzL(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzi) this.zza).zzM();
                return this;
            }

            public zza zzr(int i2) {
                zzbg();
                ((zzi) this.zza).zzN(i2);
                return this;
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzO(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzi) this.zza).zzP();
                return this;
            }

            public zza zzy(zzq zzqVar) {
                zzbg();
                ((zzi) this.zza).zzQ(zzqVar);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzi) this.zza).zzR();
                return this;
            }
        }

        public static zzi zzD() {
            return zzl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzf &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzR() {
            this.zzf &= -5;
            this.zzj = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzf &= -9;
            this.zzk = 1000;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public boolean zzA() {
            return (this.zzf & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public boolean zza() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public String zzb() {
            return this.zzg;
        }

        public List<? extends zze> zzd() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public List<zzd> zzg() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public boolean zzs() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public boolean zzw() {
            return (this.zzf & 4) != 0;
        }

        static {
            zzi zziVar = new zzi();
            zzl = zziVar;
            zzibr.zzbu(zzi.class, zziVar);
        }

        public static zza zzC(zzi zziVar) {
            return (zza) zzl.zzbo(zziVar);
        }

        public static zzidk<zzi> zzE() {
            return zzl.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zzf &= -2;
            this.zzg = zzD().zzb();
        }

        private void zzY() {
            zzicd<zzd> zzicdVar = this.zzh;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzh = zzibr.zzbN(zzicdVar);
        }

        public static zzi zzj(ByteBuffer byteBuffer) throws zzicg {
            return (zzi) zzibr.zzbR(zzl, byteBuffer);
        }

        public static zzi zzk(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzi) zzibr.zzbQ(zzl, byteBuffer, zzibbVar);
        }

        public static zzi zzl(zzian zzianVar) throws zzicg {
            return (zzi) zzibr.zzbS(zzl, zzianVar);
        }

        public static zzi zzm(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzi) zzibr.zzbT(zzl, zzianVar, zzibbVar);
        }

        public static zzi zzn(byte[] bArr) throws zzicg {
            return (zzi) zzibr.zzbU(zzl, bArr);
        }

        public static zzi zzo(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzi) zzibr.zzbV(zzl, bArr, zzibbVar);
        }

        public static zzi zzp(InputStream inputStream) throws IOException {
            return (zzi) zzibr.zzbW(zzl, inputStream);
        }

        public static zzi zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzi) zzibr.zzbX(zzl, inputStream, zzibbVar);
        }

        public static zzi zzr(InputStream inputStream) throws IOException {
            return (zzi) zzibr.zzca(zzl, inputStream);
        }

        public static zzi zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzi) zzibr.zzcb(zzl, inputStream, zzibbVar);
        }

        public static zzi zzv(zziaq zziaqVar) throws IOException {
            return (zzi) zzibr.zzbY(zzl, zziaqVar);
        }

        public static zzi zzy(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzi) zzibr.zzbZ(zzl, zziaqVar, zzibbVar);
        }

        public static zza zzz() {
            return (zza) zzl.zzbn();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public zzq zzB() {
            zzq zzqVarZzc = zzq.zzc(this.zzk);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public zzian zzc() {
            return zzian.zzv(this.zzg);
        }

        public zze zze(int i2) {
            return this.zzh.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public int zzh() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public zzd zzi(int i2) {
            return this.zzh.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public zzq zzt() {
            zzq zzqVarZzc = zzq.zzc(this.zzi);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzj
        public zzq zzx() {
            zzq zzqVarZzc = zzq.zzc(this.zzj);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzF(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzH(zzian zzianVar) {
            this.zzg = zzianVar.zzz();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzI(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.set(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzJ(zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzK(int i2, zzd zzdVar) {
            zzdVar.getClass();
            zzY();
            this.zzh.add(i2, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzL(Iterable<? extends zzd> iterable) {
            zzY();
            zzhzw.zzaW(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzh = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzN(int i2) {
            zzY();
            this.zzh.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzO(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzS(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzf |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzi> zzidkVar = zzm;
                                    if (zzidkVar == null) {
                                        synchronized (zzi.class) {
                                            try {
                                                zzibmVar = zzm;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzl);
                                                    zzm = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzl;
                        }
                        return new zza(bArr);
                    }
                    return new zzi();
                }
                return zzibr.zzbv(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze(), "zzj", zzq.zze(), "zzk", zzq.zze()});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzj extends zzidd {
        boolean zzA();

        zzq zzB();

        boolean zza();

        String zzb();

        zzian zzc();

        List<zzd> zzg();

        int zzh();

        zzd zzi(int i2);

        boolean zzs();

        zzq zzt();

        boolean zzw();

        zzq zzx();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public final class zzk extends zzibr<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzn;
        private static volatile zzidk<zzk> zzo;
        private int zzg;
        private int zzh;
        private zzap zzi;
        private zzap zzj;
        private zzap zzk;
        private zzicd<zzap> zzl = zzibr.zzbM();
        private int zzm;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzk, zza> implements zzl {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzk.zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public int zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public boolean zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public boolean zze() {
                return ((zzk) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public zzap zzf() {
                return ((zzk) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public boolean zzk() {
                return ((zzk) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public zzap zzl() {
                return ((zzk) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public boolean zzq() {
                return ((zzk) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public zzap zzr() {
                return ((zzk) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public List<zzap> zzw() {
                return Collections.unmodifiableList(((zzk) this.zza).zzw());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public int zzx() {
                return ((zzk) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzl
            public zzap zzy(int i2) {
                return ((zzk) this.zza).zzy(i2);
            }

            public zza zzA(int i2, zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzQ(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzB(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzR(zzapVar);
                return this;
            }

            public zza zzC(int i2, zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzS(i2, zzapVar);
                return this;
            }

            public zza zzD(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzR(zzaVar.zzbu());
                return this;
            }

            public zza zzE(int i2, zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzS(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzF(Iterable<? extends zzap> iterable) {
                zzbg();
                ((zzk) this.zza).zzT(iterable);
                return this;
            }

            public zza zzG() {
                zzbg();
                ((zzk) this.zza).zzU();
                return this;
            }

            public zza zzH(int i2) {
                zzbg();
                ((zzk) this.zza).zzV(i2);
                return this;
            }

            public zza zzK(int i2) {
                zzbg();
                ((zzk) this.zza).zzW(i2);
                return this;
            }

            public zza zzL() {
                zzbg();
                ((zzk) this.zza).zzX();
                return this;
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzk) this.zza).zzD(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzk) this.zza).zzE();
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzF(zzapVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzF(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzG(zzapVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzk) this.zza).zzH();
                return this;
            }

            public zza zzm(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzK(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzk) this.zza).zzM();
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbg();
                ((zzk) this.zza).zzN(zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzO(zzapVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzk) this.zza).zzP();
                return this;
            }

            public zza zzz(int i2, zzap zzapVar) {
                zzbg();
                ((zzk) this.zza).zzQ(i2, zzapVar);
                return this;
            }
        }

        public static zzk zzB() {
            return zzn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzD(int i2) {
            this.zzg |= 1;
            this.zzh = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzk = null;
            this.zzg &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzW(int i2) {
            this.zzg |= 16;
            this.zzm = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzX() {
            this.zzg &= -17;
            this.zzm = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public boolean zzI() {
            return (this.zzg & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public int zzJ() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public boolean zza() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public int zzb() {
            return this.zzh;
        }

        public List<? extends zzaq> zzc() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public boolean zze() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public boolean zzk() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public boolean zzq() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public List<zzap> zzw() {
            return this.zzl;
        }

        static {
            zzk zzkVar = new zzk();
            zzn = zzkVar;
            zzibr.zzbu(zzk.class, zzkVar);
        }

        public static zza zzA(zzk zzkVar) {
            return (zza) zzn.zzbo(zzkVar);
        }

        public static zzidk<zzk> zzC() {
            return zzn.zzbd();
        }

        private void zzak() {
            zzicd<zzap> zzicdVar = this.zzl;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzl = zzibr.zzbN(zzicdVar);
        }

        public static zzk zzg(ByteBuffer byteBuffer) throws zzicg {
            return (zzk) zzibr.zzbR(zzn, byteBuffer);
        }

        public static zzk zzh(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzk) zzibr.zzbQ(zzn, byteBuffer, zzibbVar);
        }

        public static zzk zzi(zzian zzianVar) throws zzicg {
            return (zzk) zzibr.zzbS(zzn, zzianVar);
        }

        public static zzk zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzk) zzibr.zzbT(zzn, zzianVar, zzibbVar);
        }

        public static zzk zzm(byte[] bArr) throws zzicg {
            return (zzk) zzibr.zzbU(zzn, bArr);
        }

        public static zzk zzn(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzk) zzibr.zzbV(zzn, bArr, zzibbVar);
        }

        public static zzk zzo(InputStream inputStream) throws IOException {
            return (zzk) zzibr.zzbW(zzn, inputStream);
        }

        public static zzk zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzk) zzibr.zzbX(zzn, inputStream, zzibbVar);
        }

        public static zzk zzs(InputStream inputStream) throws IOException {
            return (zzk) zzibr.zzca(zzn, inputStream);
        }

        public static zzk zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzk) zzibr.zzcb(zzn, inputStream, zzibbVar);
        }

        public static zzk zzu(zziaq zziaqVar) throws IOException {
            return (zzk) zzibr.zzbY(zzn, zziaqVar);
        }

        public static zzk zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzk) zzibr.zzbZ(zzn, zziaqVar, zzibbVar);
        }

        public static zza zzz() {
            return (zza) zzn.zzbn();
        }

        public zzaq zzd(int i2) {
            return this.zzl.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public zzap zzf() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public zzap zzl() {
            zzap zzapVar = this.zzj;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public zzap zzr() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public int zzx() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzl
        public zzap zzy(int i2) {
            return this.zzl.get(i2);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzF(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzG(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            this.zzj = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzj;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzj = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzO(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzQ(int i2, zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.set(i2, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzR(zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzS(int i2, zzap zzapVar) {
            zzapVar.getClass();
            zzak();
            this.zzl.add(i2, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzT(Iterable<? extends zzap> iterable) {
            zzak();
            zzhzw.zzaW(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzl = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzV(int i2) {
            zzak();
            this.zzl.remove(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzk> zzidkVar = zzo;
                                    if (zzidkVar == null) {
                                        synchronized (zzk.class) {
                                            try {
                                                zzibmVar = zzo;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzn);
                                                    zzo = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzn;
                        }
                        return new zza(bArr);
                    }
                    return new zzk();
                }
                return zzibr.zzbv(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzap.class, "zzm"});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzl extends zzidd {
        boolean zzI();

        int zzJ();

        boolean zza();

        int zzb();

        boolean zze();

        zzap zzf();

        boolean zzk();

        zzap zzl();

        boolean zzq();

        zzap zzr();

        List<zzap> zzw();

        int zzx();

        zzap zzy(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zzm extends zzibr<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzv;
        private static volatile zzidk<zzm> zzw;
        private int zzi;
        private zzap zzk;
        private int zzl;
        private zzar zzm;
        private int zzn;
        private String zzj = "";
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu = 1000;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zza extends zzibl<zzm, zza> implements zzn {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzm.zzv);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public zzq zzB() {
                return ((zzm) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public zzq zzF() {
                return ((zzm) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public zzq zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public String zzb() {
                return ((zzm) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public zzian zzc() {
                return ((zzm) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzg() {
                return ((zzm) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public zzap zzh() {
                return ((zzm) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzm() {
                return ((zzm) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public int zzn() {
                return ((zzm) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzq() {
                return ((zzm) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public zzar zzr() {
                return ((zzm) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public boolean zzw() {
                return ((zzm) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzn
            public int zzx() {
                return ((zzm) this.zza).zzx();
            }

            public zza zzC(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzV(zzqVar);
                return this;
            }

            public zza zzD() {
                zzbg();
                ((zzm) this.zza).zzW();
                return this;
            }

            public zza zzG(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzX(zzqVar);
                return this;
            }

            public zza zzH() {
                zzbg();
                ((zzm) this.zza).zzY();
                return this;
            }

            public zza zzK(zzq zzqVar) {
                zzbg();
                ((zzm) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzL() {
                zzbg();
                ((zzm) this.zza).zzaa();
                return this;
            }

            public zza zzd(String str) {
                zzbg();
                ((zzm) this.zza).zzG(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzm) this.zza).zzH();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzm) this.zza).zzK(zzianVar);
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbg();
                ((zzm) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbg();
                ((zzm) this.zza).zzL(zzaVar.zzbu());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbg();
                ((zzm) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzl() {
                zzbg();
                ((zzm) this.zza).zzN();
                return this;
            }

            public zza zzo(int i2) {
                zzbg();
                ((zzm) this.zza).zzO(i2);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzm) this.zza).zzP();
                return this;
            }

            public zza zzs(zzar zzarVar) {
                zzbg();
                ((zzm) this.zza).zzQ(zzarVar);
                return this;
            }

            public zza zzt(zzar.zza zzaVar) {
                zzbg();
                ((zzm) this.zza).zzQ(zzaVar.zzbu());
                return this;
            }

            public zza zzu(zzar zzarVar) {
                zzbg();
                ((zzm) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzm) this.zza).zzS();
                return this;
            }

            public zza zzy(int i2) {
                zzbg();
                ((zzm) this.zza).zzT(i2);
                return this;
            }

            public zza zzz() {
                zzbg();
                ((zzm) this.zza).zzU();
                return this;
            }
        }

        public static zzm zzC() {
            return zzv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] */
        public void zzN() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzai, reason: merged with bridge method [inline-methods] */
        public void zzO(int i2) {
            this.zzi |= 4;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaj, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzam, reason: merged with bridge method [inline-methods] */
        public void zzS() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzan, reason: merged with bridge method [inline-methods] */
        public void zzT(int i2) {
            this.zzi |= 16;
            this.zzn = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzao, reason: merged with bridge method [inline-methods] */
        public void zzU() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaq, reason: merged with bridge method [inline-methods] */
        public void zzW() {
            this.zzi &= -33;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzY() {
            this.zzi &= -65;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzaa() {
            this.zzi &= -129;
            this.zzu = 1000;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzA() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzE() {
            return (this.zzi & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzI() {
            return (this.zzi & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zza() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public String zzb() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzg() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzm() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public int zzn() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzq() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public boolean zzw() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public int zzx() {
            return this.zzn;
        }

        static {
            zzm zzmVar = new zzm();
            zzv = zzmVar;
            zzibr.zzbu(zzm.class, zzmVar);
        }

        public static zzidk<zzm> zzD() {
            return zzv.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzi &= -2;
            this.zzj = zzC().zzb();
        }

        public static zzm zzd(ByteBuffer byteBuffer) throws zzicg {
            return (zzm) zzibr.zzbR(zzv, byteBuffer);
        }

        public static zzm zze(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzm) zzibr.zzbQ(zzv, byteBuffer, zzibbVar);
        }

        public static zzm zzi(zzian zzianVar) throws zzicg {
            return (zzm) zzibr.zzbS(zzv, zzianVar);
        }

        public static zzm zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzm) zzibr.zzbT(zzv, zzianVar, zzibbVar);
        }

        public static zzm zzk(byte[] bArr) throws zzicg {
            return (zzm) zzibr.zzbU(zzv, bArr);
        }

        public static zzm zzl(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzm) zzibr.zzbV(zzv, bArr, zzibbVar);
        }

        public static zzm zzo(InputStream inputStream) throws IOException {
            return (zzm) zzibr.zzbW(zzv, inputStream);
        }

        public static zzm zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzm) zzibr.zzbX(zzv, inputStream, zzibbVar);
        }

        public static zzm zzs(InputStream inputStream) throws IOException {
            return (zzm) zzibr.zzca(zzv, inputStream);
        }

        public static zzm zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzm) zzibr.zzcb(zzv, inputStream, zzibbVar);
        }

        public static zzm zzu(zziaq zziaqVar) throws IOException {
            return (zzm) zzibr.zzbY(zzv, zziaqVar);
        }

        public static zzm zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzm) zzibr.zzbZ(zzv, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzv.zzbn();
        }

        public static zza zzz(zzm zzmVar) {
            return (zza) zzv.zzbo(zzmVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public zzq zzB() {
            zzq zzqVarZzc = zzq.zzc(this.zzo);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public zzq zzF() {
            zzq zzqVarZzc = zzq.zzc(this.zzp);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public zzq zzJ() {
            zzq zzqVarZzc = zzq.zzc(this.zzu);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public zzian zzc() {
            return zzian.zzv(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public zzap zzh() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzn
        public zzar zzr() {
            zzar zzarVar = this.zzm;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzG(String str) {
            str.getClass();
            this.zzi |= 1;
            this.zzj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzK(zzian zzianVar) {
            this.zzj = zzianVar.zzz();
            this.zzi |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzak, reason: merged with bridge method [inline-methods] */
        public void zzQ(zzar zzarVar) {
            zzarVar.getClass();
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzal, reason: merged with bridge method [inline-methods] */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzm;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzm = zzarVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
        public void zzV(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzi |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
        public void zzX(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzi |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzZ(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzi |= 128;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzm> zzidkVar = zzw;
                                    if (zzidkVar == null) {
                                        synchronized (zzm.class) {
                                            try {
                                                zzibmVar = zzw;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzv);
                                                    zzw = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzv;
                        }
                        return new zza(bArr);
                    }
                    return new zzm();
                }
                return zzibr.zzbv(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", zzq.zze()});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzn extends zzidd {
        boolean zzA();

        zzq zzB();

        boolean zzE();

        zzq zzF();

        boolean zzI();

        zzq zzJ();

        boolean zza();

        String zzb();

        zzian zzc();

        boolean zzg();

        zzap zzh();

        boolean zzm();

        int zzn();

        boolean zzq();

        zzar zzr();

        boolean zzw();

        int zzx();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zzo extends zzibr<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zzj;
        private static volatile zzidk<zzo> zzk;
        private int zze;
        private int zzf;
        private zzar zzg;
        private String zzh = "";
        private String zzi = "";

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzo, zza> implements zzp {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzo.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public boolean zza() {
                return ((zzo) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public zzb zzb() {
                return ((zzo) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public boolean zze() {
                return ((zzo) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public zzar zzf() {
                return ((zzo) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public boolean zzk() {
                return ((zzo) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public String zzl() {
                return ((zzo) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public zzian zzm() {
                return ((zzo) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public boolean zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzp
            public zzian zzs() {
                return ((zzo) this.zza).zzs();
            }

            public zza zzc(zzb zzbVar) {
                zzbg();
                ((zzo) this.zza).zzA(zzbVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzo) this.zza).zzB();
                return this;
            }

            public zza zzg(zzar zzarVar) {
                zzbg();
                ((zzo) this.zza).zzC(zzarVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbg();
                ((zzo) this.zza).zzC(zzaVar.zzbu());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbg();
                ((zzo) this.zza).zzD(zzarVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzo) this.zza).zzE();
                return this;
            }

            public zza zzn(String str) {
                zzbg();
                ((zzo) this.zza).zzF(str);
                return this;
            }

            public zza zzo() {
                zzbg();
                ((zzo) this.zza).zzG();
                return this;
            }

            public zza zzp(zzian zzianVar) {
                zzbg();
                ((zzo) this.zza).zzH(zzianVar);
                return this;
            }

            public zza zzt(String str) {
                zzbg();
                ((zzo) this.zza).zzI(str);
                return this;
            }

            public zza zzu() {
                zzbg();
                ((zzo) this.zza).zzJ();
                return this;
            }

            public zza zzv(zzian zzianVar) {
                zzbg();
                ((zzo) this.zza).zzK(zzianVar);
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
        public enum zzb implements zzibv {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzibw<zzb> zzg = new zzibw<zzb>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzo.zzb.1
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i2) {
                    return zzb.zzc(i2);
                }
            };
            private final int zzh;

            public static zzb zzc(int i2) {
                if (i2 == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i2 == 1) {
                    return IOS;
                }
                if (i2 != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzibw<zzb> zzd() {
                return zzg;
            }

            public static zzibx zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzh);
            }

            @Override // com.google.android.gms.internal.ads.zzibv
            public final int zza() {
                return this.zzh;
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
            final class zza implements zzibx {
                static final zzibx zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzibx
                public boolean zza(int i2) {
                    if (zzb.zzc(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            zzb(int i2) {
                this.zzh = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzg = null;
            this.zze &= -3;
        }

        public static zzo zzy() {
            return zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public boolean zze() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public boolean zzk() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public String zzl() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public boolean zzq() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public String zzr() {
            return this.zzi;
        }

        static {
            zzo zzoVar = new zzo();
            zzj = zzoVar;
            zzibr.zzbu(zzo.class, zzoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzG() {
            this.zze &= -5;
            this.zzh = zzy().zzl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zze &= -9;
            this.zzi = zzy().zzr();
        }

        public static zzo zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzo) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzo zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzo) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzo zzg(zzian zzianVar) throws zzicg {
            return (zzo) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzo zzh(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzo) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzo zzi(byte[] bArr) throws zzicg {
            return (zzo) zzibr.zzbU(zzj, bArr);
        }

        public static zzo zzj(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzo) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzo zzn(InputStream inputStream) throws IOException {
            return (zzo) zzibr.zzbW(zzj, inputStream);
        }

        public static zzo zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzo) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzo zzp(InputStream inputStream) throws IOException {
            return (zzo) zzibr.zzca(zzj, inputStream);
        }

        public static zzo zzt(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzo) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzo zzu(zziaq zziaqVar) throws IOException {
            return (zzo) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzo zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzo) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzw() {
            return (zza) zzj.zzbn();
        }

        public static zza zzx(zzo zzoVar) {
            return (zza) zzj.zzbo(zzoVar);
        }

        public static zzidk<zzo> zzz() {
            return zzj.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public zzb zzb() {
            zzb zzbVarZzc = zzb.zzc(this.zzf);
            return zzbVarZzc == null ? zzb.PLATFORM_UNSPECIFIED : zzbVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public zzar zzf() {
            zzar zzarVar = this.zzg;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public zzian zzm() {
            return zzian.zzv(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzp
        public zzian zzs() {
            return zzian.zzv(this.zzi);
        }

        private zzo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
        public void zzA(zzb zzbVar) {
            this.zzf = zzbVar.zza();
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzC(zzar zzarVar) {
            zzarVar.getClass();
            this.zzg = zzarVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzD(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzg;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzg = zzarVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzF(String str) {
            str.getClass();
            this.zze |= 4;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzH(zzian zzianVar) {
            this.zzh = zzianVar.zzz();
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzI(String str) {
            str.getClass();
            this.zze |= 8;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzK(zzian zzianVar) {
            this.zzi = zzianVar.zzz();
            this.zze |= 8;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzo> zzidkVar = zzk;
                                    if (zzidkVar == null) {
                                        synchronized (zzo.class) {
                                            try {
                                                zzibmVar = zzk;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzj);
                                                    zzk = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzj;
                        }
                        return new zza(bArr);
                    }
                    return new zzo();
                }
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzb.zze(), "zzg", "zzh", "zzi"});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzp extends zzidd {
        boolean zza();

        zzo.zzb zzb();

        boolean zze();

        zzar zzf();

        boolean zzk();

        String zzl();

        zzian zzm();

        boolean zzq();

        String zzr();

        zzian zzs();
    }

    public enum zzq implements zzibv {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzibw<zzq> zzg = new zzibw<zzq>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzq.1
            /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzq zzb(int i2) {
                return zzq.zzc(i2);
            }
        };
        private final int zzh;

        public static zzq zzc(int i2) {
            if (i2 == 0) {
                return ENUM_FALSE;
            }
            if (i2 == 1) {
                return ENUM_TRUE;
            }
            if (i2 != 1000) {
                return null;
            }
            return ENUM_UNKNOWN;
        }

        public static zzibw<zzq> zzd() {
            return zzg;
        }

        public static zzibx zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzibv
        public final int zza() {
            return this.zzh;
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        final class zza implements zzibx {
            static final zzibx zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzibx
            public boolean zza(int i2) {
                if (zzq.zzc(i2) != null) {
                    return true;
                }
                return false;
            }
        }

        zzq(int i2) {
            this.zzh = i2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public final class zzr extends zzibr<zzr, zza> implements zzs {
        private static final zzr zzB;
        private static volatile zzidk<zzr> zzC = null;
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private int zzk;
        private int zzl;
        private zzar zzn;
        private int zzo;
        private int zzv;
        private int zzw;
        private static final zzica<zzd.zza> zzy = new zzica<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzr.1
            @Override // com.google.android.gms.internal.ads.zzica
            /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i2) {
                zzd.zza zzaVarZzc = zzd.zza.zzc(i2);
                if (zzaVarZzc == null) {
                    return zzd.zza.zza;
                }
                return zzaVarZzc;
            }
        };
        private static final zzica<zzd.zza> zzA = new zzica<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbgj.zzr.2
            @Override // com.google.android.gms.internal.ads.zzica
            /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i2) {
                zzd.zza zzaVarZzc = zzd.zza.zzc(i2);
                if (zzaVarZzc == null) {
                    return zzd.zza.zza;
                }
                return zzaVarZzc;
            }
        };
        private String zzm = "";
        private String zzp = "";
        private String zzu = "";
        private zzibz zzx = zzibr.zzbC();
        private zzibz zzz = zzibr.zzbC();

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzr, zza> implements zzs {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzr.zzB);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zzA() {
                return ((zzr) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public String zzB() {
                return ((zzr) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzian zzC() {
                return ((zzr) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zzG() {
                return ((zzr) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzab.zzc zzH() {
                return ((zzr) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zza.EnumC0774zza zzL() {
                return ((zzr) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public List<zzd.zza> zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public int zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzd.zza zzQ(int i2) {
                return ((zzr) this.zza).zzQ(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public List<zzd.zza> zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public int zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzd.zza zzX(int i2) {
                return ((zzr) this.zza).zzX(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zza() {
                return ((zzr) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zze() {
                return ((zzr) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public String zzf() {
                return ((zzr) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzian zzg() {
                return ((zzr) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zzk() {
                return ((zzr) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzar zzl() {
                return ((zzr) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zzq() {
                return ((zzr) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzo.zzb zzr() {
                return ((zzr) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public boolean zzu() {
                return ((zzr) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public String zzv() {
                return ((zzr) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzs
            public zzian zzw() {
                return ((zzr) this.zza).zzw();
            }

            public zza zzD(String str) {
                zzbg();
                ((zzr) this.zza).zzac(str);
                return this;
            }

            public zza zzE() {
                zzbg();
                ((zzr) this.zza).zzad();
                return this;
            }

            public zza zzF(zzian zzianVar) {
                zzbg();
                ((zzr) this.zza).zzae(zzianVar);
                return this;
            }

            public zza zzI(zzab.zzc zzcVar) {
                zzbg();
                ((zzr) this.zza).zzaf(zzcVar);
                return this;
            }

            public zza zzJ() {
                zzbg();
                ((zzr) this.zza).zzag();
                return this;
            }

            public zza zzM(zza.EnumC0774zza enumC0774zza) {
                zzbg();
                ((zzr) this.zza).zzah(enumC0774zza);
                return this;
            }

            public zza zzN() {
                zzbg();
                ((zzr) this.zza).zzai();
                return this;
            }

            public zza zzR(int i2, zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzaj(i2, zzaVar);
                return this;
            }

            public zza zzS(zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzak(zzaVar);
                return this;
            }

            public zza zzT(Iterable<? extends zzd.zza> iterable) {
                zzbg();
                ((zzr) this.zza).zzal(iterable);
                return this;
            }

            public zza zzU() {
                zzbg();
                ((zzr) this.zza).zzam();
                return this;
            }

            public zza zzY(int i2, zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzan(i2, zzaVar);
                return this;
            }

            public zza zzZ(zzd.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzao(zzaVar);
                return this;
            }

            public zza zzaa(Iterable<? extends zzd.zza> iterable) {
                zzbg();
                ((zzr) this.zza).zzap(iterable);
                return this;
            }

            public zza zzab() {
                zzbg();
                ((zzr) this.zza).zzaq();
                return this;
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzr) this.zza).zzF(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzr) this.zza).zzI();
                return this;
            }

            public zza zzh(String str) {
                zzbg();
                ((zzr) this.zza).zzJ(str);
                return this;
            }

            public zza zzi() {
                zzbg();
                ((zzr) this.zza).zzM();
                return this;
            }

            public zza zzj(zzian zzianVar) {
                zzbg();
                ((zzr) this.zza).zzN(zzianVar);
                return this;
            }

            public zza zzm(zzar zzarVar) {
                zzbg();
                ((zzr) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzn(zzar.zza zzaVar) {
                zzbg();
                ((zzr) this.zza).zzR(zzaVar.zzbu());
                return this;
            }

            public zza zzo(zzar zzarVar) {
                zzbg();
                ((zzr) this.zza).zzS(zzarVar);
                return this;
            }

            public zza zzp() {
                zzbg();
                ((zzr) this.zza).zzT();
                return this;
            }

            public zza zzs(zzo.zzb zzbVar) {
                zzbg();
                ((zzr) this.zza).zzU(zzbVar);
                return this;
            }

            public zza zzt() {
                zzbg();
                ((zzr) this.zza).zzY();
                return this;
            }

            public zza zzx(String str) {
                zzbg();
                ((zzr) this.zza).zzZ(str);
                return this;
            }

            public zza zzy() {
                zzbg();
                ((zzr) this.zza).zzaa();
                return this;
            }

            public zza zzz(zzian zzianVar) {
                zzbg();
                ((zzr) this.zza).zzab(zzianVar);
                return this;
            }
        }

        public static zzr zzD() {
            return zzB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
        public void zzY() {
            this.zzk &= -9;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzag() {
            this.zzk &= -65;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzai() {
            this.zzk &= -129;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzas, reason: merged with bridge method [inline-methods] */
        public void zzF(int i2) {
            this.zzk |= 1;
            this.zzl = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
        public void zzI() {
            this.zzk &= -2;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
        public void zzT() {
            this.zzn = null;
            this.zzk &= -5;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zzA() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public String zzB() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zzG() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zzK() {
            return (this.zzk & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zza() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zze() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public String zzf() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zzk() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zzq() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public boolean zzu() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public String zzv() {
            return this.zzp;
        }

        static {
            zzr zzrVar = new zzr();
            zzB = zzrVar;
            zzibr.zzbu(zzr.class, zzrVar);
        }

        public static zzidk<zzr> zzE() {
            return zzB.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
        public void zzaa() {
            this.zzk &= -17;
            this.zzp = zzD().zzv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzad() {
            this.zzk &= -33;
            this.zzu = zzD().zzB();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzk &= -3;
            this.zzm = zzD().zzf();
        }

        public static zzr zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzr) zzibr.zzbR(zzB, byteBuffer);
        }

        private void zzce() {
            zzibz zzibzVar = this.zzx;
            if (zzibzVar.zza()) {
                return;
            }
            this.zzx = zzibr.zzbD(zzibzVar);
        }

        private void zzcj() {
            zzibz zzibzVar = this.zzz;
            if (zzibzVar.zza()) {
                return;
            }
            this.zzz = zzibr.zzbD(zzibzVar);
        }

        public static zzr zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzr) zzibr.zzbQ(zzB, byteBuffer, zzibbVar);
        }

        public static zzr zzh(zzian zzianVar) throws zzicg {
            return (zzr) zzibr.zzbS(zzB, zzianVar);
        }

        public static zzr zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzr) zzibr.zzbT(zzB, zzianVar, zzibbVar);
        }

        public static zzr zzj(byte[] bArr) throws zzicg {
            return (zzr) zzibr.zzbU(zzB, bArr);
        }

        public static zzr zzm(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzr) zzibr.zzbV(zzB, bArr, zzibbVar);
        }

        public static zzr zzn(InputStream inputStream) throws IOException {
            return (zzr) zzibr.zzbW(zzB, inputStream);
        }

        public static zzr zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzr) zzibr.zzbX(zzB, inputStream, zzibbVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zzibr.zzca(zzB, inputStream);
        }

        public static zzr zzs(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzr) zzibr.zzcb(zzB, inputStream, zzibbVar);
        }

        public static zzr zzt(zziaq zziaqVar) throws IOException {
            return (zzr) zzibr.zzbY(zzB, zziaqVar);
        }

        public static zzr zzx(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzr) zzibr.zzbZ(zzB, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzB.zzbn();
        }

        public static zza zzz(zzr zzrVar) {
            return (zza) zzB.zzbo(zzrVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzian zzC() {
            return zzian.zzv(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzab.zzc zzH() {
            zzab.zzc zzcVarZzc = zzab.zzc.zzc(this.zzv);
            return zzcVarZzc == null ? zzab.zzc.NETWORKTYPE_UNSPECIFIED : zzcVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zza.EnumC0774zza zzL() {
            zza.EnumC0774zza enumC0774zzaZzc = zza.EnumC0774zza.zzc(this.zzw);
            return enumC0774zzaZzc == null ? zza.EnumC0774zza.AD_INITIATER_UNSPECIFIED : enumC0774zzaZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public List<zzd.zza> zzO() {
            return new zzicb(this.zzx, zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public int zzP() {
            return this.zzx.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzd.zza zzQ(int i2) {
            zzd.zza zzaVarZzc = zzd.zza.zzc(this.zzx.zzf(i2));
            return zzaVarZzc == null ? zzd.zza.zza : zzaVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public List<zzd.zza> zzV() {
            return new zzicb(this.zzz, zzA);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public int zzW() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzd.zza zzX(int i2) {
            zzd.zza zzaVarZzc = zzd.zza.zzc(this.zzz.zzf(i2));
            return zzaVarZzc == null ? zzd.zza.zza : zzaVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzian zzg() {
            return zzian.zzv(this.zzm);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzar zzl() {
            zzar zzarVar = this.zzn;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzo.zzb zzr() {
            zzo.zzb zzbVarZzc = zzo.zzb.zzc(this.zzo);
            return zzbVarZzc == null ? zzo.zzb.PLATFORM_UNSPECIFIED : zzbVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzs
        public zzian zzw() {
            return zzian.zzv(this.zzp);
        }

        private zzr() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
        public void zzU(zzo.zzb zzbVar) {
            this.zzo = zzbVar.zza();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaC, reason: merged with bridge method [inline-methods] */
        public void zzZ(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzab(zzian zzianVar) {
            this.zzp = zzianVar.zzz();
            this.zzk |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzac(String str) {
            str.getClass();
            this.zzk |= 32;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzae(zzian zzianVar) {
            this.zzu = zzianVar.zzz();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzaf(zzab.zzc zzcVar) {
            this.zzv = zzcVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzah(zza.EnumC0774zza enumC0774zza) {
            this.zzw = enumC0774zza.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzau, reason: merged with bridge method [inline-methods] */
        public void zzJ(String str) {
            str.getClass();
            this.zzk |= 2;
            this.zzm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaw, reason: merged with bridge method [inline-methods] */
        public void zzN(zzian zzianVar) {
            this.zzm = zzianVar.zzz();
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzax, reason: merged with bridge method [inline-methods] */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            this.zzn = zzarVar;
            this.zzk |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzay, reason: merged with bridge method [inline-methods] */
        public void zzS(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzn;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzn = zzarVar;
            this.zzk |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzaj(int i2, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzce();
            this.zzx.zzg(i2, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzak(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzce();
            this.zzx.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzal(Iterable<? extends zzd.zza> iterable) {
            zzce();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzx.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzci, reason: merged with bridge method [inline-methods] */
        public void zzam() {
            this.zzx = zzibr.zzbC();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzan(int i2, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzcj();
            this.zzz.zzg(i2, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzao(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzcj();
            this.zzz.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzap(Iterable<? extends zzd.zza> iterable) {
            zzcj();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzz.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzaq() {
            this.zzz = zzibr.zzbC();
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzr> zzidkVar = zzC;
                                    if (zzidkVar == null) {
                                        synchronized (zzr.class) {
                                            try {
                                                zzibmVar = zzC;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzB);
                                                    zzC = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzB;
                        }
                        return new zza(bArr);
                    }
                    return new zzr();
                }
                return zzibr.zzbv(zzB, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", zzo.zzb.zze(), "zzp", "zzu", "zzv", zzab.zzc.zze(), "zzw", zza.EnumC0774zza.zze(), "zzx", zzd.zza.zze(), "zzz", zzd.zza.zze()});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface zzs extends zzidd {
        boolean zzA();

        String zzB();

        zzian zzC();

        boolean zzG();

        zzab.zzc zzH();

        boolean zzK();

        zza.EnumC0774zza zzL();

        List<zzd.zza> zzO();

        int zzP();

        zzd.zza zzQ(int i2);

        List<zzd.zza> zzV();

        int zzW();

        zzd.zza zzX(int i2);

        boolean zza();

        int zzb();

        boolean zze();

        String zzf();

        zzian zzg();

        boolean zzk();

        zzar zzl();

        boolean zzq();

        zzo.zzb zzr();

        boolean zzu();

        String zzv();

        zzian zzw();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public final class zzt extends zzibr<zzt, zza> implements zzu {
        private static final zzt zzF;
        private static volatile zzidk<zzt> zzG = null;
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private zzab zzA;
        private zza zzB;
        private zzaf zzC;
        private zzbl zzD;
        private zzb zzE;
        private int zzn;
        private int zzo;
        private int zzu;
        private zzar zzw;
        private zzm zzy;
        private zzo zzz;
        private String zzp = "";
        private int zzv = 1000;
        private zzicc zzx = zzibr.zzbE();

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        public final class zza extends zzibl<zzt, zza> implements zzu {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzt.zzF);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public long zzA(int i2) {
                return ((zzt) this.zza).zzA(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzF() {
                return ((zzt) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzm zzG() {
                return ((zzt) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzL() {
                return ((zzt) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzo zzM() {
                return ((zzt) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzR() {
                return ((zzt) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzab zzS() {
                return ((zzt) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzX() {
                return ((zzt) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zza zzY() {
                return ((zzt) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zza() {
                return ((zzt) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzaf zzae() {
                return ((zzt) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzbl zzak() {
                return ((zzt) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzb zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public String zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzian zzg() {
                return ((zzt) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzk() {
                return ((zzt) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public int zzl() {
                return ((zzt) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzo() {
                return ((zzt) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzq zzp() {
                return ((zzt) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public boolean zzs() {
                return ((zzt) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public zzar zzt() {
                return ((zzt) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public List<Long> zzy() {
                return Collections.unmodifiableList(((zzt) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzu
            public int zzz() {
                return ((zzt) this.zza).zzz();
            }

            public zza zzB(int i2, long j2) {
                zzbg();
                ((zzt) this.zza).zzW(i2, j2);
                return this;
            }

            public zza zzC(long j2) {
                zzbg();
                ((zzt) this.zza).zzZ(j2);
                return this;
            }

            public zza zzD(Iterable<? extends Long> iterable) {
                zzbg();
                ((zzt) this.zza).zzaa(iterable);
                return this;
            }

            public zza zzE() {
                zzbg();
                ((zzt) this.zza).zzab();
                return this;
            }

            public zza zzH(zzm zzmVar) {
                zzbg();
                ((zzt) this.zza).zzac(zzmVar);
                return this;
            }

            public zza zzI(zzm.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzac(zzaVar.zzbu());
                return this;
            }

            public zza zzJ(zzm zzmVar) {
                zzbg();
                ((zzt) this.zza).zzaf(zzmVar);
                return this;
            }

            public zza zzK() {
                zzbg();
                ((zzt) this.zza).zzag();
                return this;
            }

            public zza zzN(zzo zzoVar) {
                zzbg();
                ((zzt) this.zza).zzah(zzoVar);
                return this;
            }

            public zza zzO(zzo.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzah(zzaVar.zzbu());
                return this;
            }

            public zza zzP(zzo zzoVar) {
                zzbg();
                ((zzt) this.zza).zzai(zzoVar);
                return this;
            }

            public zza zzQ() {
                zzbg();
                ((zzt) this.zza).zzal();
                return this;
            }

            public zza zzT(zzab zzabVar) {
                zzbg();
                ((zzt) this.zza).zzam(zzabVar);
                return this;
            }

            public zza zzU(zzab.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzam(zzaVar.zzbu());
                return this;
            }

            public zza zzV(zzab zzabVar) {
                zzbg();
                ((zzt) this.zza).zzan(zzabVar);
                return this;
            }

            public zza zzW() {
                zzbg();
                ((zzt) this.zza).zzao();
                return this;
            }

            public zza zzZ(zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzar(zzaVar);
                return this;
            }

            public zza zzaa(zza.zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzar(zzbVar.zzbu());
                return this;
            }

            public zza zzab(zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzas(zzaVar);
                return this;
            }

            public zza zzac() {
                zzbg();
                ((zzt) this.zza).zzat();
                return this;
            }

            public zza zzaf(zzaf zzafVar) {
                zzbg();
                ((zzt) this.zza).zzau(zzafVar);
                return this;
            }

            public zza zzag(zzaf.zzc zzcVar) {
                zzbg();
                ((zzt) this.zza).zzau(zzcVar.zzbu());
                return this;
            }

            public zza zzah(zzaf zzafVar) {
                zzbg();
                ((zzt) this.zza).zzav(zzafVar);
                return this;
            }

            public zza zzai() {
                zzbg();
                ((zzt) this.zza).zzaw();
                return this;
            }

            public zza zzal(zzbl zzblVar) {
                zzbg();
                ((zzt) this.zza).zzax(zzblVar);
                return this;
            }

            public zza zzam(zzbl.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzax(zzaVar.zzbu());
                return this;
            }

            public zza zzan(zzbl zzblVar) {
                zzbg();
                ((zzt) this.zza).zzay(zzblVar);
                return this;
            }

            public zza zzao() {
                zzbg();
                ((zzt) this.zza).zzaz();
                return this;
            }

            public zza zzar(zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzaA(zzbVar);
                return this;
            }

            public zza zzas(zzb.zzc zzcVar) {
                zzbg();
                ((zzt) this.zza).zzaA(zzcVar.zzbu());
                return this;
            }

            public zza zzat(zzb zzbVar) {
                zzbg();
                ((zzt) this.zza).zzaB(zzbVar);
                return this;
            }

            public zza zzau() {
                zzbg();
                ((zzt) this.zza).zzaC();
                return this;
            }

            public zza zzc(int i2) {
                zzbg();
                ((zzt) this.zza).zzE(i2);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzt) this.zza).zzH();
                return this;
            }

            public zza zzh(String str) {
                zzbg();
                ((zzt) this.zza).zzI(str);
                return this;
            }

            public zza zzi() {
                zzbg();
                ((zzt) this.zza).zzJ();
                return this;
            }

            public zza zzj(zzian zzianVar) {
                zzbg();
                ((zzt) this.zza).zzK(zzianVar);
                return this;
            }

            public zza zzm(int i2) {
                zzbg();
                ((zzt) this.zza).zzN(i2);
                return this;
            }

            public zza zzn() {
                zzbg();
                ((zzt) this.zza).zzO();
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbg();
                ((zzt) this.zza).zzP(zzqVar);
                return this;
            }

            public zza zzr() {
                zzbg();
                ((zzt) this.zza).zzQ();
                return this;
            }

            public zza zzu(zzar zzarVar) {
                zzbg();
                ((zzt) this.zza).zzT(zzarVar);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbg();
                ((zzt) this.zza).zzT(zzaVar.zzbu());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbg();
                ((zzt) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzx() {
                zzbg();
                ((zzt) this.zza).zzV();
                return this;
            }
        }

        public static zzt zzC() {
            return zzF;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
        public void zzE(int i2) {
            this.zzn |= 1;
            this.zzo = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaF, reason: merged with bridge method [inline-methods] */
        public void zzH() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
        public void zzN(int i2) {
            this.zzn |= 4;
            this.zzu = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
        public void zzO() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcB, reason: merged with bridge method [inline-methods] */
        public void zzaw() {
            this.zzC = null;
            this.zzn &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcE, reason: merged with bridge method [inline-methods] */
        public void zzaz() {
            this.zzD = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcH, reason: merged with bridge method [inline-methods] */
        public void zzaC() {
            this.zzE = null;
            this.zzn &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzce, reason: merged with bridge method [inline-methods] */
        public void zzQ() {
            this.zzn &= -9;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzch, reason: merged with bridge method [inline-methods] */
        public void zzV() {
            this.zzw = null;
            this.zzn &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcp, reason: merged with bridge method [inline-methods] */
        public void zzag() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcs, reason: merged with bridge method [inline-methods] */
        public void zzal() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcv, reason: merged with bridge method [inline-methods] */
        public void zzao() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcy, reason: merged with bridge method [inline-methods] */
        public void zzat() {
            this.zzB = null;
            this.zzn &= -257;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzF() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzL() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzR() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzX() {
            return (this.zzn & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zza() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzad() {
            return (this.zzn & 512) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzaj() {
            return (this.zzn & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzap() {
            return (this.zzn & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public int zzb() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zze() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public String zzf() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzk() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public int zzl() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzo() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public boolean zzs() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public List<Long> zzy() {
            return this.zzx;
        }

        static {
            zzt zztVar = new zzt();
            zzF = zztVar;
            zzibr.zzbu(zzt.class, zztVar);
        }

        public static zza zzB(zzt zztVar) {
            return (zza) zzF.zzbo(zztVar);
        }

        public static zzidk<zzt> zzD() {
            return zzF.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzn &= -3;
            this.zzp = zzC().zzf();
        }

        public static zzt zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzt) zzibr.zzbR(zzF, byteBuffer);
        }

        private void zzci() {
            zzicc zziccVar = this.zzx;
            if (zziccVar.zza()) {
                return;
            }
            this.zzx = zzibr.zzbF(zziccVar);
        }

        public static zzt zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzt) zzibr.zzbQ(zzF, byteBuffer, zzibbVar);
        }

        public static zzt zzh(zzian zzianVar) throws zzicg {
            return (zzt) zzibr.zzbS(zzF, zzianVar);
        }

        public static zzt zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzt) zzibr.zzbT(zzF, zzianVar, zzibbVar);
        }

        public static zzt zzj(byte[] bArr) throws zzicg {
            return (zzt) zzibr.zzbU(zzF, bArr);
        }

        public static zzt zzm(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzt) zzibr.zzbV(zzF, bArr, zzibbVar);
        }

        public static zzt zzn(InputStream inputStream) throws IOException {
            return (zzt) zzibr.zzbW(zzF, inputStream);
        }

        public static zzt zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzt) zzibr.zzbX(zzF, inputStream, zzibbVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zzibr.zzca(zzF, inputStream);
        }

        public static zzt zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzt) zzibr.zzcb(zzF, inputStream, zzibbVar);
        }

        public static zzt zzv(zziaq zziaqVar) throws IOException {
            return (zzt) zzibr.zzbY(zzF, zziaqVar);
        }

        public static zzt zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzt) zzibr.zzbZ(zzF, zziaqVar, zzibbVar);
        }

        public static zza zzx() {
            return (zza) zzF.zzbn();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public long zzA(int i2) {
            return this.zzx.zzc(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzm zzG() {
            zzm zzmVar = this.zzy;
            return zzmVar == null ? zzm.zzC() : zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzo zzM() {
            zzo zzoVar = this.zzz;
            return zzoVar == null ? zzo.zzy() : zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzab zzS() {
            zzab zzabVar = this.zzA;
            return zzabVar == null ? zzab.zzs() : zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zza zzY() {
            zza zzaVar = this.zzB;
            return zzaVar == null ? zza.zzD() : zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzaf zzae() {
            zzaf zzafVar = this.zzC;
            return zzafVar == null ? zzaf.zzD() : zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzbl zzak() {
            zzbl zzblVar = this.zzD;
            return zzblVar == null ? zzbl.zzs() : zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzb zzaq() {
            zzb zzbVar = this.zzE;
            return zzbVar == null ? zzb.zzu() : zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzian zzg() {
            return zzian.zzv(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzq zzp() {
            zzq zzqVarZzc = zzq.zzc(this.zzv);
            return zzqVarZzc == null ? zzq.ENUM_UNKNOWN : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public zzar zzt() {
            zzar zzarVar = this.zzw;
            return zzarVar == null ? zzar.zzu() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzu
        public int zzz() {
            return this.zzx.size();
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaG, reason: merged with bridge method [inline-methods] */
        public void zzI(String str) {
            str.getClass();
            this.zzn |= 2;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
        public void zzK(zzian zzianVar) {
            this.zzp = zzianVar.zzz();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaL, reason: merged with bridge method [inline-methods] */
        public void zzP(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcA, reason: merged with bridge method [inline-methods] */
        public void zzav(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzC;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzD()) {
                zzaf.zzc zzcVarZzC = zzaf.zzC(zzafVar2);
                zzcVarZzC.zzbo(zzafVar);
                zzafVar = zzcVarZzC.zzbt();
            }
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcC, reason: merged with bridge method [inline-methods] */
        public void zzax(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcD, reason: merged with bridge method [inline-methods] */
        public void zzay(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzD;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzs()) {
                zzbl.zza zzaVarZzr = zzbl.zzr(zzblVar2);
                zzaVarZzr.zzbo(zzblVar);
                zzblVar = zzaVarZzr.zzbt();
            }
            this.zzD = zzblVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcF, reason: merged with bridge method [inline-methods] */
        public void zzaA(zzb zzbVar) {
            zzbVar.getClass();
            this.zzE = zzbVar;
            this.zzn |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcG, reason: merged with bridge method [inline-methods] */
        public void zzaB(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzE;
            if (zzbVar2 != null && zzbVar2 != zzb.zzu()) {
                zzb.zzc zzcVarZzt = zzb.zzt(zzbVar2);
                zzcVarZzt.zzbo(zzbVar);
                zzbVar = zzcVarZzt.zzbt();
            }
            this.zzE = zzbVar;
            this.zzn |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcf, reason: merged with bridge method [inline-methods] */
        public void zzT(zzar zzarVar) {
            zzarVar.getClass();
            this.zzw = zzarVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcg, reason: merged with bridge method [inline-methods] */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzw;
            if (zzarVar2 != null && zzarVar2 != zzar.zzu()) {
                zzar.zza zzaVarZzt = zzar.zzt(zzarVar2);
                zzaVarZzt.zzbo(zzarVar);
                zzarVar = zzaVarZzt.zzbt();
            }
            this.zzw = zzarVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcj, reason: merged with bridge method [inline-methods] */
        public void zzW(int i2, long j2) {
            zzci();
            this.zzx.zze(i2, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzck, reason: merged with bridge method [inline-methods] */
        public void zzZ(long j2) {
            zzci();
            this.zzx.zzd(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcl, reason: merged with bridge method [inline-methods] */
        public void zzaa(Iterable<? extends Long> iterable) {
            zzci();
            zzhzw.zzaW(iterable, this.zzx);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcm, reason: merged with bridge method [inline-methods] */
        public void zzab() {
            this.zzx = zzibr.zzbE();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcn, reason: merged with bridge method [inline-methods] */
        public void zzac(zzm zzmVar) {
            zzmVar.getClass();
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzco, reason: merged with bridge method [inline-methods] */
        public void zzaf(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzy;
            if (zzmVar2 != null && zzmVar2 != zzm.zzC()) {
                zzm.zza zzaVarZzz = zzm.zzz(zzmVar2);
                zzaVarZzz.zzbo(zzmVar);
                zzmVar = zzaVarZzz.zzbt();
            }
            this.zzy = zzmVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcq, reason: merged with bridge method [inline-methods] */
        public void zzah(zzo zzoVar) {
            zzoVar.getClass();
            this.zzz = zzoVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcr, reason: merged with bridge method [inline-methods] */
        public void zzai(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzz;
            if (zzoVar2 != null && zzoVar2 != zzo.zzy()) {
                zzo.zza zzaVarZzx = zzo.zzx(zzoVar2);
                zzaVarZzx.zzbo(zzoVar);
                zzoVar = zzaVarZzx.zzbt();
            }
            this.zzz = zzoVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzct, reason: merged with bridge method [inline-methods] */
        public void zzam(zzab zzabVar) {
            zzabVar.getClass();
            this.zzA = zzabVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcu, reason: merged with bridge method [inline-methods] */
        public void zzan(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzA;
            if (zzabVar2 != null && zzabVar2 != zzab.zzs()) {
                zzab.zza zzaVarZzr = zzab.zzr(zzabVar2);
                zzaVarZzr.zzbo(zzabVar);
                zzabVar = zzaVarZzr.zzbt();
            }
            this.zzA = zzabVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcw, reason: merged with bridge method [inline-methods] */
        public void zzar(zza zzaVar) {
            zzaVar.getClass();
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcx, reason: merged with bridge method [inline-methods] */
        public void zzas(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzB;
            if (zzaVar2 != null && zzaVar2 != zza.zzD()) {
                zza.zzb zzbVarZzC = zza.zzC(zzaVar2);
                zzbVarZzC.zzbo(zzaVar);
                zzaVar = zzbVarZzC.zzbt();
            }
            this.zzB = zzaVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzcz, reason: merged with bridge method [inline-methods] */
        public void zzau(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzC = zzafVar;
            this.zzn |= 512;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzt> zzidkVar = zzG;
                                    if (zzidkVar == null) {
                                        synchronized (zzt.class) {
                                            try {
                                                zzibmVar = zzG;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzF);
                                                    zzG = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzF;
                        }
                        return new zza(bArr);
                    }
                    return new zzt();
                }
                return zzibr.zzbv(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", zzq.zze(), "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", PtsLKY.SpKPrg, "zzD", "zzE"});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public interface zzu extends zzidd {
        long zzA(int i2);

        boolean zzF();

        zzm zzG();

        boolean zzL();

        zzo zzM();

        boolean zzR();

        zzab zzS();

        boolean zzX();

        zza zzY();

        boolean zza();

        boolean zzad();

        zzaf zzae();

        boolean zzaj();

        zzbl zzak();

        boolean zzap();

        zzb zzaq();

        int zzb();

        boolean zze();

        String zzf();

        zzian zzg();

        boolean zzk();

        int zzl();

        boolean zzo();

        zzq zzp();

        boolean zzs();

        zzar zzt();

        List<Long> zzy();

        int zzz();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public final class zzv extends zzibr<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zzj;
        private static volatile zzidk<zzv> zzk;
        private int zze;
        private int zzg;
        private zzap zzi;
        private String zzf = "";
        private zzibz zzh = zzibr.zzbC();

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
        public final class zza extends zzibl<zzv, zza> implements zzw {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzv.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public boolean zza() {
                return ((zzv) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public String zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public zzian zzc() {
                return ((zzv) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public boolean zzg() {
                return ((zzv) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public zzq zzh() {
                return ((zzv) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public List<Integer> zzk() {
                return Collections.unmodifiableList(((zzv) this.zza).zzk());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public int zzl() {
                return ((zzv) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public int zzm(int i2) {
                return ((zzv) this.zza).zzm(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public boolean zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzw
            public zzap zzs() {
                return ((zzv) this.zza).zzs();
            }

            public zza zzd(String str) {
                zzbg();
                ((zzv) this.zza).zzB(str);
                return this;
            }

            public zza zze() {
                zzbg();
                ((zzv) this.zza).zzC();
                return this;
            }

            public zza zzf(zzian zzianVar) {
                zzbg();
                ((zzv) this.zza).zzD(zzianVar);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbg();
                ((zzv) this.zza).zzE(zzqVar);
                return this;
            }

            public zza zzj() {
                zzbg();
                ((zzv) this.zza).zzF();
                return this;
            }

            public zza zzn(int i2, int i3) {
                zzbg();
                ((zzv) this.zza).zzG(i2, i3);
                return this;
            }

            public zza zzo(int i2) {
                zzbg();
                ((zzv) this.zza).zzH(i2);
                return this;
            }

            public zza zzp(Iterable<? extends Integer> iterable) {
                zzbg();
                ((zzv) this.zza).zzI(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzv) this.zza).zzJ();
                return this;
            }

            public zza zzt(zzap zzapVar) {
                zzbg();
                ((zzv) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzu(zzap.zza zzaVar) {
                zzbg();
                ((zzv) this.zza).zzK(zzaVar.zzbu());
                return this;
            }

            public zza zzv(zzap zzapVar) {
                zzbg();
                ((zzv) this.zza).zzL(zzapVar);
                return this;
            }

            public zza zzw() {
                zzbg();
                ((zzv) this.zza).zzM();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzF() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zzi = null;
            this.zze &= -5;
        }

        public static zzv zzz() {
            return zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public String zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public List<Integer> zzk() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public boolean zzr() {
            return (this.zze & 4) != 0;
        }

        static {
            zzv zzvVar = new zzv();
            zzj = zzvVar;
            zzibr.zzbu(zzv.class, zzvVar);
        }

        public static zzidk<zzv> zzA() {
            return zzj.zzbd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
        public void zzC() {
            this.zze &= -2;
            this.zzf = zzz().zzb();
        }

        private void zzT() {
            zzibz zzibzVar = this.zzh;
            if (zzibzVar.zza()) {
                return;
            }
            this.zzh = zzibr.zzbD(zzibzVar);
        }

        public static zzv zzd(ByteBuffer byteBuffer) throws zzicg {
            return (zzv) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzv zze(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzv) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzv zzi(zzian zzianVar) throws zzicg {
            return (zzv) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzv zzj(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzv) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzv zzn(byte[] bArr) throws zzicg {
            return (zzv) zzibr.zzbU(zzj, bArr);
        }

        public static zzv zzo(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzv) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzv zzp(InputStream inputStream) throws IOException {
            return (zzv) zzibr.zzbW(zzj, inputStream);
        }

        public static zzv zzq(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzv) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzv zzt(InputStream inputStream) throws IOException {
            return (zzv) zzibr.zzca(zzj, inputStream);
        }

        public static zzv zzu(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzv) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzv zzv(zziaq zziaqVar) throws IOException {
            return (zzv) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzv zzw(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzv) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzx() {
            return (zza) zzj.zzbn();
        }

        public static zza zzy(zzv zzvVar) {
            return (zza) zzj.zzbo(zzvVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public zzian zzc() {
            return zzian.zzv(this.zzf);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public zzq zzh() {
            zzq zzqVarZzc = zzq.zzc(this.zzg);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public int zzl() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public int zzm(int i2) {
            return this.zzh.zzf(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzw
        public zzap zzs() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzv() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
        public void zzB(String str) {
            str.getClass();
            this.zze |= 1;
            this.zzf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzQ, reason: merged with bridge method [inline-methods] */
        public void zzD(zzian zzianVar) {
            this.zzf = zzianVar.zzz();
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzE(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
        public void zzG(int i2, int i3) {
            zzT();
            this.zzh.zzg(i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2) {
            zzT();
            this.zzh.zzi(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzI(Iterable<? extends Integer> iterable) {
            zzT();
            zzhzw.zzaW(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzh = zzibr.zzbC();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzL(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzv> zzidkVar = zzk;
                                    if (zzidkVar == null) {
                                        synchronized (zzv.class) {
                                            try {
                                                zzibmVar = zzk;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzj);
                                                    zzk = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzj;
                        }
                        return new zza(bArr);
                    }
                    return new zzv();
                }
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public interface zzw extends zzidd {
        boolean zza();

        String zzb();

        zzian zzc();

        boolean zzg();

        zzq zzh();

        List<Integer> zzk();

        int zzl();

        int zzm(int i2);

        boolean zzr();

        zzap zzs();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public final class zzx extends zzibr<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzf;
        private static volatile zzidk<zzx> zzg;
        private int zzc;
        private int zzd;
        private zzibz zze = zzibr.zzbC();

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
        public final class zza extends zzibl<zzx, zza> implements zzy {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzx.zzf);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzy
            public boolean zza() {
                return ((zzx) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzy
            public zzq zzb() {
                return ((zzx) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzy
            public List<Integer> zze() {
                return Collections.unmodifiableList(((zzx) this.zza).zze());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzy
            public int zzf() {
                return ((zzx) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzy
            public int zzg(int i2) {
                return ((zzx) this.zza).zzg(i2);
            }

            public zza zzc(zzq zzqVar) {
                zzbg();
                ((zzx) this.zza).zzv(zzqVar);
                return this;
            }

            public zza zzd() {
                zzbg();
                ((zzx) this.zza).zzw();
                return this;
            }

            public zza zzh(int i2, int i3) {
                zzbg();
                ((zzx) this.zza).zzx(i2, i3);
                return this;
            }

            public zza zzi(int i2) {
                zzbg();
                ((zzx) this.zza).zzy(i2);
                return this;
            }

            public zza zzj(Iterable<? extends Integer> iterable) {
                zzbg();
                ((zzx) this.zza).zzz(iterable);
                return this;
            }

            public zza zzk() {
                zzbg();
                ((zzx) this.zza).zzA();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
        public void zzw() {
            this.zzc &= -2;
            this.zzd = 0;
        }

        public static zzx zzt() {
            return zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzy
        public boolean zza() {
            return (this.zzc & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzy
        public List<Integer> zze() {
            return this.zze;
        }

        static {
            zzx zzxVar = new zzx();
            zzf = zzxVar;
            zzibr.zzbu(zzx.class, zzxVar);
        }

        private void zzE() {
            zzibz zzibzVar = this.zze;
            if (zzibzVar.zza()) {
                return;
            }
            this.zze = zzibr.zzbD(zzibzVar);
        }

        public static zzx zzc(ByteBuffer byteBuffer) throws zzicg {
            return (zzx) zzibr.zzbR(zzf, byteBuffer);
        }

        public static zzx zzd(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzx) zzibr.zzbQ(zzf, byteBuffer, zzibbVar);
        }

        public static zzx zzh(zzian zzianVar) throws zzicg {
            return (zzx) zzibr.zzbS(zzf, zzianVar);
        }

        public static zzx zzi(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzx) zzibr.zzbT(zzf, zzianVar, zzibbVar);
        }

        public static zzx zzj(byte[] bArr) throws zzicg {
            return (zzx) zzibr.zzbU(zzf, bArr);
        }

        public static zzx zzk(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzx) zzibr.zzbV(zzf, bArr, zzibbVar);
        }

        public static zzx zzl(InputStream inputStream) throws IOException {
            return (zzx) zzibr.zzbW(zzf, inputStream);
        }

        public static zzx zzm(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzx) zzibr.zzbX(zzf, inputStream, zzibbVar);
        }

        public static zzx zzn(InputStream inputStream) throws IOException {
            return (zzx) zzibr.zzca(zzf, inputStream);
        }

        public static zzx zzo(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzx) zzibr.zzcb(zzf, inputStream, zzibbVar);
        }

        public static zzx zzp(zziaq zziaqVar) throws IOException {
            return (zzx) zzibr.zzbY(zzf, zziaqVar);
        }

        public static zzx zzq(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzx) zzibr.zzbZ(zzf, zziaqVar, zzibbVar);
        }

        public static zza zzr() {
            return (zza) zzf.zzbn();
        }

        public static zza zzs(zzx zzxVar) {
            return (zza) zzf.zzbo(zzxVar);
        }

        public static zzidk<zzx> zzu() {
            return zzf.zzbd();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzy
        public zzq zzb() {
            zzq zzqVarZzc = zzq.zzc(this.zzd);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzy
        public int zzf() {
            return this.zze.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzy
        public int zzg(int i2) {
            return this.zze.zzf(i2);
        }

        private zzx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
        public void zzv(zzq zzqVar) {
            this.zzd = zzqVar.zza();
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
        public void zzx(int i2, int i3) {
            zzE();
            this.zze.zzg(i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
        public void zzy(int i2) {
            zzE();
            this.zze.zzi(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
        public void zzz(Iterable<? extends Integer> iterable) {
            zzE();
            zzhzw.zzaW(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
        public void zzA() {
            this.zze = zzibr.zzbC();
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzx> zzidkVar = zzg;
                                    if (zzidkVar == null) {
                                        synchronized (zzx.class) {
                                            try {
                                                zzibmVar = zzg;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzf);
                                                    zzg = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzf;
                        }
                        return new zza(bArr);
                    }
                    return new zzx();
                }
                return zzibr.zzbv(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", zzq.zze(), "zze"});
            }
            return (byte) 1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public interface zzy extends zzidd {
        boolean zza();

        zzq zzb();

        List<Integer> zze();

        int zzf();

        int zzg(int i2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public final class zzz extends zzibr<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zzj;
        private static volatile zzidk<zzz> zzk;
        private int zze;
        private zzv zzf;
        private zzicd<zzan> zzg = zzibr.zzbM();
        private int zzh;
        private zzap zzi;

        public final class zza extends zzibl<zzz, zza> implements zzaa {
            /* synthetic */ zza(byte[] bArr) {
                this();
            }

            private zza() {
                super(zzz.zzj);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public boolean zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public zzv zzb() {
                return ((zzz) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public List<zzan> zzg() {
                return Collections.unmodifiableList(((zzz) this.zza).zzg());
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public int zzh() {
                return ((zzz) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public zzan zzi(int i2) {
                return ((zzz) this.zza).zzi(i2);
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public boolean zzs() {
                return ((zzz) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public zzq zzt() {
                return ((zzz) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public boolean zzw() {
                return ((zzz) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            public zza zzA(zzap zzapVar) {
                zzbg();
                ((zzz) this.zza).zzO(zzapVar);
                return this;
            }

            public zza zzB() {
                zzbg();
                ((zzz) this.zza).zzP();
                return this;
            }

            public zza zzc(zzv zzvVar) {
                zzbg();
                ((zzz) this.zza).zzC(zzvVar);
                return this;
            }

            public zza zzd(zzv.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzC(zzaVar.zzbu());
                return this;
            }

            public zza zze(zzv zzvVar) {
                zzbg();
                ((zzz) this.zza).zzD(zzvVar);
                return this;
            }

            public zza zzf() {
                zzbg();
                ((zzz) this.zza).zzE();
                return this;
            }

            public zza zzj(int i2, zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzF(i2, zzanVar);
                return this;
            }

            public zza zzk(int i2, zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzF(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzl(zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzG(zzanVar);
                return this;
            }

            public zza zzm(int i2, zzan zzanVar) {
                zzbg();
                ((zzz) this.zza).zzH(i2, zzanVar);
                return this;
            }

            public zza zzn(zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzG(zzaVar.zzbu());
                return this;
            }

            public zza zzo(int i2, zzan.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzH(i2, zzaVar.zzbu());
                return this;
            }

            public zza zzp(Iterable<? extends zzan> iterable) {
                zzbg();
                ((zzz) this.zza).zzI(iterable);
                return this;
            }

            public zza zzq() {
                zzbg();
                ((zzz) this.zza).zzJ();
                return this;
            }

            public zza zzr(int i2) {
                zzbg();
                ((zzz) this.zza).zzK(i2);
                return this;
            }

            public zza zzu(zzq zzqVar) {
                zzbg();
                ((zzz) this.zza).zzL(zzqVar);
                return this;
            }

            public zza zzv() {
                zzbg();
                ((zzz) this.zza).zzM();
                return this;
            }

            public zza zzy(zzap zzapVar) {
                zzbg();
                ((zzz) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbg();
                ((zzz) this.zza).zzN(zzaVar.zzbu());
                return this;
            }
        }

        public static zzz zzA() {
            return zzj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
        public void zzE() {
            this.zzf = null;
            this.zze &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzac, reason: merged with bridge method [inline-methods] */
        public void zzM() {
            this.zze &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
        public void zzP() {
            this.zzi = null;
            this.zze &= -5;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public boolean zza() {
            return (this.zze & 1) != 0;
        }

        public List<? extends zzao> zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public List<zzan> zzg() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public boolean zzs() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public boolean zzw() {
            return (this.zze & 4) != 0;
        }

        static {
            zzz zzzVar = new zzz();
            zzj = zzzVar;
            zzibr.zzbu(zzz.class, zzzVar);
        }

        public static zzidk<zzz> zzB() {
            return zzj.zzbd();
        }

        private void zzU() {
            zzicd<zzan> zzicdVar = this.zzg;
            if (zzicdVar.zza()) {
                return;
            }
            this.zzg = zzibr.zzbN(zzicdVar);
        }

        public static zzz zze(ByteBuffer byteBuffer) throws zzicg {
            return (zzz) zzibr.zzbR(zzj, byteBuffer);
        }

        public static zzz zzj(ByteBuffer byteBuffer, zzibb zzibbVar) throws zzicg {
            return (zzz) zzibr.zzbQ(zzj, byteBuffer, zzibbVar);
        }

        public static zzz zzk(zzian zzianVar) throws zzicg {
            return (zzz) zzibr.zzbS(zzj, zzianVar);
        }

        public static zzz zzl(zzian zzianVar, zzibb zzibbVar) throws zzicg {
            return (zzz) zzibr.zzbT(zzj, zzianVar, zzibbVar);
        }

        public static zzz zzm(byte[] bArr) throws zzicg {
            return (zzz) zzibr.zzbU(zzj, bArr);
        }

        public static zzz zzn(byte[] bArr, zzibb zzibbVar) throws zzicg {
            return (zzz) zzibr.zzbV(zzj, bArr, zzibbVar);
        }

        public static zzz zzo(InputStream inputStream) throws IOException {
            return (zzz) zzibr.zzbW(zzj, inputStream);
        }

        public static zzz zzp(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzz) zzibr.zzbX(zzj, inputStream, zzibbVar);
        }

        public static zzz zzq(InputStream inputStream) throws IOException {
            return (zzz) zzibr.zzca(zzj, inputStream);
        }

        public static zzz zzr(InputStream inputStream, zzibb zzibbVar) throws IOException {
            return (zzz) zzibr.zzcb(zzj, inputStream, zzibbVar);
        }

        public static zzz zzu(zziaq zziaqVar) throws IOException {
            return (zzz) zzibr.zzbY(zzj, zziaqVar);
        }

        public static zzz zzv(zziaq zziaqVar, zzibb zzibbVar) throws IOException {
            return (zzz) zzibr.zzbZ(zzj, zziaqVar, zzibbVar);
        }

        public static zza zzy() {
            return (zza) zzj.zzbn();
        }

        public static zza zzz(zzz zzzVar) {
            return (zza) zzj.zzbo(zzzVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public zzv zzb() {
            zzv zzvVar = this.zzf;
            return zzvVar == null ? zzv.zzz() : zzvVar;
        }

        public zzao zzd(int i2) {
            return this.zzg.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public int zzh() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public zzan zzi(int i2) {
            return this.zzg.get(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public zzq zzt() {
            zzq zzqVarZzc = zzq.zzc(this.zzh);
            return zzqVarZzc == null ? zzq.ENUM_FALSE : zzqVarZzc;
        }

        @Override // com.google.android.gms.internal.ads.zzbgj.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzs() : zzapVar;
        }

        private zzz() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public void zzC(zzv zzvVar) {
            zzvVar.getClass();
            this.zzf = zzvVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
        public void zzD(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzf;
            if (zzvVar2 != null && zzvVar2 != zzv.zzz()) {
                zzv.zza zzaVarZzy = zzv.zzy(zzvVar2);
                zzaVarZzy.zzbo(zzvVar);
                zzvVar = zzaVarZzy.zzbt();
            }
            this.zzf = zzvVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
        public void zzF(int i2, zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.set(i2, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
        public void zzG(zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public void zzH(int i2, zzan zzanVar) {
            zzanVar.getClass();
            zzU();
            this.zzg.add(i2, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
        public void zzI(Iterable<? extends zzan> iterable) {
            zzU();
            zzhzw.zzaW(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public void zzJ() {
            this.zzg = zzibr.zzbM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzaa, reason: merged with bridge method [inline-methods] */
        public void zzK(int i2) {
            zzU();
            this.zzg.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
        public void zzL(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: zzae, reason: merged with bridge method [inline-methods] */
        public void zzO(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzs()) {
                zzap.zza zzaVarZzr = zzap.zzr(zzapVar2);
                zzaVarZzr.zzbo(zzapVar);
                zzapVar = zzaVarZzr.zzbt();
            }
            this.zzi = zzapVar;
            this.zze |= 4;
        }

        @Override // com.google.android.gms.internal.ads.zzibr
        protected final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
            zzidk zzibmVar;
            int iOrdinal = zzibqVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        byte[] bArr = null;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                if (iOrdinal == 6) {
                                    zzidk<zzz> zzidkVar = zzk;
                                    if (zzidkVar == null) {
                                        synchronized (zzz.class) {
                                            try {
                                                zzibmVar = zzk;
                                                if (zzibmVar == null) {
                                                    zzibmVar = new zzibm(zzj);
                                                    zzk = zzibmVar;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        return zzibmVar;
                                    }
                                    return zzidkVar;
                                }
                                throw null;
                            }
                            return zzj;
                        }
                        return new zza(bArr);
                    }
                    return new zzz();
                }
                return zzibr.zzbv(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzan.class, "zzh", zzq.zze(), "zzi"});
            }
            return (byte) 1;
        }
    }

    private zzbgj() {
    }

    public static void zza(zzibb zzibbVar) {
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzbgj$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzibq.values().length];
            zza = iArr;
            try {
                iArr[zzibq.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzibq.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzibq.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzibq.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzibq.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzibq.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzibq.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
