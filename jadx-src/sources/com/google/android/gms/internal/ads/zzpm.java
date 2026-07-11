package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.exoplayer.analytics.FPL;
import androidx.media3.exoplayer.analytics.U;
import androidx.media3.exoplayer.analytics.U4;
import androidx.media3.exoplayer.analytics.W;
import androidx.media3.exoplayer.analytics.eZk;
import androidx.media3.exoplayer.analytics.t6;
import androidx.media3.exoplayer.analytics.yr;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RequiresApi
public final class zzpm implements zzna, zzpn {
    private boolean zzA;
    private final Context zza;
    private final zzpo zzc;
    private final PlaybackSession zzd;

    @Nullable
    private String zzj;

    @Nullable
    private PlaybackMetrics.Builder zzk;
    private int zzl;

    @Nullable
    private zzau zzo;

    @Nullable
    private zzpl zzp;

    @Nullable
    private zzpl zzq;

    @Nullable
    private zzpl zzr;

    @Nullable
    private zzv zzs;

    @Nullable
    private zzv zzt;

    @Nullable
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzde(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i2) {
        if (i2 == 1) {
            this.zzv = true;
            i2 = 1;
        }
        this.zzl = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z2) {
    }

    private final void zzB(zzbf zzbfVar, @Nullable zzwk zzwkVar) {
        int iZze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzwkVar == null || (iZze = zzbfVar.zze(zzwkVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i2 = 0;
        zzbfVar.zzd(iZze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int iZzF = zzfj.zzF(zzagVar.zza);
            i2 = iZzF != 0 ? iZzF != 1 ? iZzF != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i2);
        long j2 = zzbeVar.zzm;
        if (j2 != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfj.zzp(j2));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l2 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l5 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l5 == null ? 0L : l5.longValue());
            this.zzk.setStreamSource((l5 == null || l5.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    @Nullable
    public static zzpm zza(Context context) {
        MediaMetricsManager mediaMetricsManagerN = FPL.n(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerN == null) {
            return null;
        }
        return new zzpm(context, mediaMetricsManagerN.createPlaybackSession());
    }

    private final boolean zzw(@Nullable zzpl zzplVar) {
        if (zzplVar != null) {
            return zzplVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j2, @Nullable zzv zzvVar, int i2) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i3 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j2, zzvVar, i3);
    }

    private final void zzy(long j2, @Nullable zzv zzvVar, int i2) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i3 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j2, zzvVar, i3);
    }

    private final void zzz(long j2, @Nullable zzv zzvVar, int i2) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i3 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j2, zzvVar, i3);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzc(zzmy zzmyVar, String str) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = W.n().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion("1.9.0-beta01");
            zzB(zzmyVar.zzb, zzwkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpn
    public final void zzd(zzmy zzmyVar, String str, boolean z2) {
        zzwk zzwkVar = zzmyVar.zzd;
        if ((zzwkVar == null || !zzwkVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdf(zzmy zzmyVar, zzwg zzwgVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return;
        }
        zzv zzvVar = zzwgVar.zzb;
        zzvVar.getClass();
        zzpl zzplVar = new zzpl(zzvVar, 0, this.zzc.zzb(zzmyVar.zzb, zzwkVar));
        int i2 = zzwgVar.zza;
        if (i2 != 0) {
            if (i2 == 1) {
                this.zzq = zzplVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zzr = zzplVar;
                return;
            }
        }
        this.zzp = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdg(zzmy zzmyVar, int i2, long j2, long j3) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar != null) {
            String strZzb = this.zzc.zzb(zzmyVar.zzb, zzwkVar);
            HashMap map = this.zzi;
            Long l2 = (Long) map.get(strZzb);
            HashMap map2 = this.zzh;
            Long l5 = (Long) map2.get(strZzb);
            map.put(strZzb, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j2));
            map2.put(strZzb, Long.valueOf((l5 != null ? l5.longValue() : 0L) + ((long) i2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzdh(zzmy zzmyVar, zzin zzinVar) {
        this.zzx += zzinVar.zzg;
        this.zzy += zzinVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029a  */
    @Override // com.google.android.gms.internal.ads.zzna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdi(zzbb zzbbVar, zzmz zzmzVar) {
        int i2;
        int i3;
        int iZzD;
        int i5;
        int errorCode;
        int iZzQ;
        zzq zzqVar;
        int i7;
        int i8;
        if (zzmzVar.zzc() == 0) {
            return;
        }
        for (int i9 = 0; i9 < zzmzVar.zzc(); i9++) {
            int iZzd = zzmzVar.zzd(i9);
            zzmy zzmyVarZza = zzmzVar.zza(iZzd);
            if (iZzd == 0) {
                this.zzc.zzd(zzmyVarZza);
            } else if (iZzd == 11) {
                this.zzc.zze(zzmyVarZza, this.zzl);
            } else {
                this.zzc.zzc(zzmyVarZza);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmzVar.zzb(0)) {
            zzmy zzmyVarZza2 = zzmzVar.zza(0);
            if (this.zzk != null) {
                zzB(zzmyVarZza2.zzb, zzmyVarZza2.zzd);
            }
        }
        if (zzmzVar.zzb(2) && this.zzk != null) {
            zzguf zzgufVarZza = zzbbVar.zzp().zza();
            int size = zzgufVarZza.size();
            int i10 = 0;
            loop1: while (true) {
                if (i10 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zzgufVarZza.get(i10);
                int i11 = 0;
                while (true) {
                    i8 = i10 + 1;
                    if (i11 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i11) && (zzqVar = zzbmVar.zza(i11).zzs) != null) {
                            break loop1;
                        } else {
                            i11++;
                        }
                    }
                }
                i10 = i8;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzfj.zza;
                PlaybackMetrics.Builder builderN = U4.n(builder);
                int i12 = 0;
                while (true) {
                    if (i12 >= zzqVar.zzb) {
                        i7 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.zza(i12).zza;
                    if (uuid.equals(zzg.zzd)) {
                        i7 = 3;
                        break;
                    } else if (uuid.equals(zzg.zze)) {
                        i7 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.zzc)) {
                            i7 = 6;
                            break;
                        }
                        i12++;
                    }
                }
                builderN.setDrmType(i7);
            }
        }
        if (zzmzVar.zzb(1011)) {
            this.zzz++;
        }
        zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            Context context = this.zza;
            int i13 = zzauVar.zza;
            if (i13 == 1001) {
                i5 = 20;
            } else {
                zziw zziwVar = (zziw) zzauVar;
                boolean z2 = zziwVar.zzc == 1;
                int i14 = zziwVar.zzg;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhs) {
                        iZzQ = ((zzhs) cause).zzc;
                        i5 = 5;
                    } else if ((cause instanceof zzhr) || (cause instanceof zzat)) {
                        iZzQ = 0;
                        i5 = 11;
                    } else {
                        boolean z3 = cause instanceof zzhq;
                        if (z3 || (cause instanceof zzia)) {
                            if (zzep.zza(context).zzc() == 1) {
                                iZzQ = 0;
                                i5 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzQ = 0;
                                    i5 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzQ = 0;
                                    i5 = 7;
                                } else if (z3 && ((zzhq) cause).zzb == 1) {
                                    iZzQ = 0;
                                    i5 = 4;
                                } else {
                                    iZzQ = 0;
                                    i5 = 8;
                                }
                            }
                        } else if (i13 == 1002) {
                            i5 = 21;
                        } else if (cause instanceof zztg) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfj.zzQ(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzD = zzD(errorCode);
                                int i15 = iZzD;
                                iZzQ = errorCode;
                                i5 = i15;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i5 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i5 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i5 = 29;
                            } else {
                                if (!(cause3 instanceof zztq)) {
                                    i5 = cause3 instanceof zztf ? 28 : 30;
                                }
                                iZzQ = 0;
                                i5 = 23;
                            }
                        } else if ((cause instanceof zzhn) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i5 = 32;
                            } else {
                                iZzQ = 0;
                                i5 = 31;
                            }
                        } else {
                            iZzQ = 0;
                            i5 = 9;
                        }
                    }
                    final PlaybackErrorEvent playbackErrorEventBuild = t6.n().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i5).setSubErrorCode(iZzQ).setException(zzauVar).build();
                    this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzr(playbackErrorEventBuild);
                        }
                    });
                    this.zzA = true;
                    this.zzo = null;
                } else if (z2) {
                    i5 = 35;
                    if (i14 != 0 && i14 != 1) {
                        if (z2 && i14 == 3) {
                            i5 = 15;
                        } else {
                            if (z2 && i14 == 2) {
                                iZzQ = 0;
                                i5 = 23;
                            } else if (cause instanceof zzuq) {
                                iZzQ = zzfj.zzQ(((zzuq) cause).zzd);
                                i5 = 13;
                            } else {
                                iZzD = 14;
                                if (cause instanceof zzum) {
                                    errorCode = ((zzum) cause).zza;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i5 = 14;
                                } else if (cause instanceof zzrf) {
                                    i5 = 17;
                                } else if (cause instanceof zzri) {
                                    errorCode = ((zzri) cause).zza;
                                    iZzD = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    iZzD = zzD(errorCode);
                                } else {
                                    i5 = 22;
                                }
                                int i152 = iZzD;
                                iZzQ = errorCode;
                                i5 = i152;
                            }
                            final PlaybackErrorEvent playbackErrorEventBuild2 = t6.n().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i5).setSubErrorCode(iZzQ).setException(zzauVar).build();
                            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzr(playbackErrorEventBuild2);
                                }
                            });
                            this.zzA = true;
                            this.zzo = null;
                        }
                    }
                }
            }
            iZzQ = 0;
            final PlaybackErrorEvent playbackErrorEventBuild22 = t6.n().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i5).setSubErrorCode(iZzQ).setException(zzauVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(playbackErrorEventBuild22);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmzVar.zzb(2)) {
            zzbn zzbnVarZzp = zzbbVar.zzp();
            boolean zZzb = zzbnVarZzp.zzb(2);
            boolean zZzb2 = zzbnVarZzp.zzb(1);
            boolean zZzb3 = zzbnVarZzp.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzx(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                }
                if (!zZzb2) {
                }
                if (!zZzb3) {
                }
            }
        }
        if (zzw(this.zzp)) {
            zzv zzvVar = this.zzp.zza;
            if (zzvVar.zzw != -1) {
                zzx(jElapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzy(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzz(jElapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzep.zza(this.zza).zzc()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 9;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
            case 8:
            default:
                i2 = 1;
                break;
            case 7:
                i2 = 3;
                break;
            case 9:
                i2 = 8;
                break;
            case 10:
                i2 = 7;
                break;
        }
        if (i2 != this.zzn) {
            this.zzn = i2;
            final NetworkEvent networkEventBuild = eZk.n().setNetworkType(i2).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(networkEventBuild);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((zzmv) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zzmzVar.zzb(10)) {
            this.zzw = true;
        }
        int iZzh = zzbbVar.zzh();
        if (this.zzv) {
            i3 = 5;
        } else if (this.zzw) {
            i3 = 13;
        } else {
            i3 = 4;
            if (iZzh == 4) {
                i3 = 11;
            } else if (iZzh == 2) {
                int i16 = this.zzm;
                i3 = (i16 == 0 || i16 == 2 || i16 == 12) ? 2 : !zzbbVar.zzk() ? 7 : zzbbVar.zzi() != 0 ? 10 : 6;
            } else if (iZzh != 3) {
                i3 = (iZzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i3 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i3) {
            this.zzm = i3;
            this.zzA = true;
            final PlaybackStateEvent playbackStateEventBuild = U.n().setState(this.zzm).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(playbackStateEventBuild);
                }
            });
        }
        if (zzmzVar.zzb(1028)) {
            this.zzc.zzg(zzmzVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzpl zzplVar = this.zzp;
        if (zzplVar != null) {
            zzv zzvVar = zzplVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(zzbvVar.zzb);
                zztVarZza.zzu(zzbvVar.zzc);
                this.zzp = new zzpl(zztVarZza.zzM(), 0, zzplVar.zzc);
            }
        }
    }

    final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }

    private zzpm(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpf zzpfVar = new zzpf(zzpf.zza);
        this.zzc = zzpfVar;
        zzpfVar.zza(this);
    }

    private final void zzA(int i2, long j2, @Nullable zzv zzvVar, int i3) {
        int i5;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = yr.n(i2).setTimeSinceCreatedMillis(j2 - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i3 != 1) {
                i5 = 1;
            } else {
                i5 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i5);
            String str2 = zzvVar.zzn;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzvVar.zzo;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzvVar.zzk;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i7 = zzvVar.zzj;
            if (i7 != -1) {
                timeSinceCreatedMillis.setBitrate(i7);
            }
            int i8 = zzvVar.zzv;
            if (i8 != -1) {
                timeSinceCreatedMillis.setWidth(i8);
            }
            int i9 = zzvVar.zzw;
            if (i9 != -1) {
                timeSinceCreatedMillis.setHeight(i9);
            }
            int i10 = zzvVar.zzG;
            if (i10 != -1) {
                timeSinceCreatedMillis.setChannelCount(i10);
            }
            int i11 = zzvVar.zzH;
            if (i11 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i11);
            }
            String str5 = zzvVar.zzd;
            if (str5 != null) {
                String str6 = zzfj.zza;
                String[] strArrSplit = str5.split("-", -1);
                String str7 = strArrSplit[0];
                if (strArrSplit.length >= 2) {
                    str = strArrSplit[1];
                } else {
                    str = null;
                }
                Pair pairCreate = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f3 = zzvVar.zzz;
            if (f3 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f3);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(trackChangeEventBuild);
            }
        });
    }

    private static int zzD(int i2) {
        switch (zzfj.zzE(i2)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }
}
