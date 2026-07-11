package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzps {

    @VisibleForTesting
    static final zzgui zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzps zza = new zzps(zzguf.zzj(zzpr.zza));
    private static final zzguf zzc = zzguf.zzl(2, 5, 6);

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzps zzb(Context context, @Nullable Intent intent, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        AudioManager audioManagerZza = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerZza.getAudioDevicesForAttributes(zzdVar.zza());
                audioDeviceInfo = audioDevicesForAttributes.isEmpty() ? null : (AudioDeviceInfo) audioDevicesForAttributes.get(0);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            List directProfilesForAttributes = audioManagerZza.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgxz.zzg(12)));
            for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
                AudioProfile audioProfileN = androidx.media3.exoplayer.audio.j.n(directProfilesForAttributes.get(i3));
                if (audioProfileN.getEncapsulationType() != 1) {
                    int format = audioProfileN.getFormat();
                    if (zzfj.zzA(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgxz.zzg(audioProfileN.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgxz.zzg(audioProfileN.getChannelMasks())));
                        }
                    }
                }
            }
            int i5 = zzguf.zzd;
            zzguc zzgucVar = new zzguc();
            for (Map.Entry entry : map.entrySet()) {
                zzgucVar.zzf(new zzpr(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzps(zzgucVar.zzi());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo == null ? audioManagerZza.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo};
        zzguo zzguoVar = new zzguo();
        zzguoVar.zzg(8, 7);
        if (i2 >= 31) {
            zzguoVar.zzg(26, 27);
        }
        if (i2 >= 33) {
            zzguoVar.zzf((Object) 30);
        }
        zzgup zzgupVarZzi = zzguoVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (zzgupVarZzi.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return zza;
            }
        }
        zzguo zzguoVar2 = new zzguo();
        zzguoVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            int i7 = zzguf.zzd;
            zzguc zzgucVar2 = new zzguc();
            zzgwt it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzfj.zzC(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgucVar2.zzf(num);
                }
            }
            zzgucVar2.zzf((Object) 2);
            zzguoVar2.zzh(zzgucVar2.zzi());
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z2 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z2 || zze()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzguoVar2.zzh(zzc);
        }
        if (intent == null || z2 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzguoVar2.zzh(zzgxz.zzg(intArrayExtra));
        }
        return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzps)) {
            return false;
        }
        zzps zzpsVar = (zzps) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = zzpsVar.zzd;
        String str = zzfj.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                        break;
                    }
                }
                if (this.zze != zzpsVar.zze) {
                    break;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze != zzpsVar.zze) {
                return true;
            }
        }
        return false;
    }

    static {
        zzguh zzguhVar = new zzguh();
        zzguhVar.zza(5, 6);
        zzguhVar.zza(17, 6);
        zzguhVar.zza(7, 6);
        zzguhVar.zza(30, 10);
        zzguhVar.zza(18, 6);
        zzguhVar.zza(6, 8);
        zzguhVar.zza(8, 8);
        zzguhVar.zza(14, 8);
        zzb = zzguhVar.zzc();
    }

    static zzps zza(Context context, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo);
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzguf zzf(@Nullable int[] iArr, int i2) {
        int i3 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i5 : iArr) {
            zzgucVar.zzf(new zzpr(i5, i2));
        }
        return zzgucVar.zzi();
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfj.zza;
        int i2 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i3)) * 31) + Objects.hashCode(sparseArray.valueAt(i3));
            }
            iContentHashCode = iKeyAt;
        }
        return this.zze + (iContentHashCode * 31);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int i2 = this.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 50 + string.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i2);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
      0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zzd(zzv zzvVar, zzd zzdVar) {
        String str = zzvVar.zzo;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZzg))) {
            return null;
        }
        int i2 = 8;
        if (iZzg != 18) {
            if (iZzg == 8) {
                if (zzfj.zza(this.zzd, 8)) {
                    iZzg = 8;
                    if (iZzg == 30) {
                    }
                }
                iZzg = 7;
            } else if (iZzg == 30 && !zzfj.zza(this.zzd, 30)) {
                iZzg = 7;
            }
        } else if (zzfj.zza(this.zzd, 18)) {
            iZzg = 18;
            if (iZzg == 8) {
            }
        } else {
            iZzg = 6;
        }
        SparseArray sparseArray = this.zzd;
        if (!zzfj.zza(sparseArray, iZzg)) {
            return null;
        }
        zzpr zzprVar = (zzpr) sparseArray.get(iZzg);
        zzprVar.getClass();
        int iZzb = zzvVar.zzG;
        if (iZzb == -1 || iZzg == 18) {
            int i3 = zzvVar.zzH;
            if (i3 == -1) {
                i3 = 48000;
            }
            iZzb = zzprVar.zzb(i3, zzdVar);
        } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!zzprVar.zza(iZzb)) {
                return null;
            }
        } else if (iZzb > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i2 = iZzb;
        } else if (iZzb != 7) {
            if (iZzb == 3 || iZzb == 4 || iZzb == 5) {
                i2 = 6;
            }
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        int iZzB = zzfj.zzB(i2);
        if (iZzB != 0) {
            return Pair.create(Integer.valueOf(iZzg), Integer.valueOf(iZzB));
        }
        return null;
    }

    private zzps(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzpr zzprVar = (zzpr) list.get(i2);
            this.zzd.put(zzprVar.zzb, zzprVar);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            iMax = Math.max(iMax, ((zzpr) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = iMax;
    }

    @Nullable
    static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }
}
