package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzazd implements zzazc {
    protected static volatile zzbak zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;

    @Nullable
    protected zzbac zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected abstract zzawg zza(Context context, zzavs zzavsVar);

    protected abstract zzawg zzb(Context context, View view, Activity activity);

    protected abstract zzawg zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zzd(@Nullable MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.zzu) {
                zzo();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d2 = rawX - this.zzs;
                double d4 = rawY - this.zzt;
                this.zzk += Math.sqrt((d2 * d2) + (d4 * d4));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        LinkedList linkedList = this.zzc;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzn(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += (long) (motionEvent.getHistorySize() + 1);
                        zzbam zzbamVarZzm = zzm(motionEvent);
                        Long l5 = zzbamVarZzm.zzd;
                        if (l5 != null && zzbamVarZzm.zzg != null) {
                            this.zzi += l5.longValue() + zzbamVarZzm.zzg.longValue();
                        }
                        if (this.zzq != null && (l2 = zzbamVarZzm.zze) != null && zzbamVarZzm.zzh != null) {
                            this.zzj += l2.longValue() + zzbamVarZzm.zzh.longValue();
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzbaa unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    protected abstract zzbam zzm(MotionEvent motionEvent) throws zzbaa;

    protected abstract long zzn(StackTraceElement[] stackTraceElementArr) throws zzbaa;

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp(Context context, String str, int i2, View view, Activity activity, byte[] bArr) {
        zzazb zzazbVarZzh;
        String str2;
        int i3;
        Exception exc;
        int i5;
        int i7;
        String strZzb;
        zzawg zzawgVarZza;
        int i8;
        int i9;
        int i10 = i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdm)).booleanValue();
        zzawg zzawgVarZzb = null;
        if (zBooleanValue) {
            zzazbVarZzh = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzazbVarZzh = null;
            str2 = null;
        }
        try {
            if (i10 == 3) {
                zzawgVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i9 = 1002;
                } catch (Exception e2) {
                    exc = e2;
                    i3 = 3;
                    if (zBooleanValue) {
                        if (i10 != i3) {
                        }
                        i5 = i7;
                        zzazbVarZzh.zza(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (i10 == 2) {
                    zzawgVarZza = zzc(context, view, activity);
                    i8 = 1008;
                } else {
                    zzawgVarZza = zza(context, null);
                    i8 = 1000;
                }
                zzawgVarZzb = zzawgVarZza;
                i9 = i8;
            }
            if (!zBooleanValue || zzazbVarZzh == null) {
                i3 = 3;
            } else {
                i3 = 3;
                try {
                    zzazbVarZzh.zza(i9, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    if (zBooleanValue && zzazbVarZzh != null) {
                        if (i10 != i3) {
                            i7 = 1003;
                        } else if (i10 == 2) {
                            i7 = 1009;
                        } else {
                            i5 = 1001;
                            i10 = 1;
                            zzazbVarZzh.zza(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i5 = i7;
                        zzazbVarZzh.zza(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
            i3 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (zzawgVarZzb != null) {
            try {
                if (((zzaxg) zzawgVarZzb.zzbu()).zzbr() == 0) {
                    strZzb = Integer.toString(5);
                } else {
                    zzaxg zzaxgVar = (zzaxg) zzawgVarZzb.zzbu();
                    int i11 = zzayg.zzc;
                    strZzb = zzayg.zzb(zzaxgVar.zzaN(), str);
                    if (zBooleanValue && zzazbVarZzh != null) {
                        zzazbVarZzh.zza(i10 == i3 ? 1006 : i10 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    }
                }
            } catch (Exception e5) {
                strZzb = Integer.toString(7);
                if (zBooleanValue && zzazbVarZzh != null) {
                    zzazbVarZzh.zza(i10 == i3 ? 1007 : i10 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e5);
                }
            }
        } else {
            strZzb = Integer.toString(5);
        }
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zze(int i2, int i3, int i5) {
        try {
            if (this.zzb != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdk)).booleanValue()) {
                    zzo();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f3 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i5, 1, i2 * f3, i3 * f3, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue() || (zzbacVar = this.zzr) == null) {
            return;
        }
        zzbacVar.zza(Arrays.asList(stackTraceElementArr));
    }

    protected zzazd(Context context) {
        try {
            zzayg.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzr = new zzbac();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        if (!zzban.zzd()) {
            return zzp(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
