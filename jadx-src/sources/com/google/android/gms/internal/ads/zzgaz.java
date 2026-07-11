package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgaz {
    private final zzgdf zza;
    private final zzgeg zzb;
    private final zzgmz zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final long zzf;
    private final zzika zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public final com.google.common.util.concurrent.Xo zza() {
        return this.zza.zza();
    }

    public final String zzb(final Context context) {
        String string;
        boolean z2 = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z2 = true;
            }
        }
        zzgoc zzgocVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgay
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhaf.zza()).get(z2 ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    if (z2) {
                        string = ((zzghi) this.zzg.zzb()).zza(true, this.zzi);
                    } else {
                        this.zzd.zzb(56);
                        string = Integer.toString(17);
                    }
                } catch (Throwable th) {
                    zzgocVarZza.zzb(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                zzgocVarZza.zzb(e2);
                string = "";
            } catch (ExecutionException e3) {
                e = e3;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgocVarZza.zzb(e);
                string = Integer.toString(3);
            }
            zzgocVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgcl) = (r2 I:com.google.android.gms.internal.ads.zzgaz) (LINE:128) com.google.android.gms.internal.ads.zzgaz.zze com.google.android.gms.internal.ads.zzgcl, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgaz] */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        final zzgaz zzgazVar;
        ?? r2;
        String string;
        zzgoc zzgocVarZza = this.zzd.zza(4);
        try {
            try {
                zzgocVarZza.zza();
                final String str2 = null;
                zzgazVar = this;
                try {
                    string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgaw
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ View zzc;
                        private final /* synthetic */ Activity zzd;

                        {
                            this.zzc = view;
                            this.zzd = activity;
                        }

                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                            return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                        }
                    }, zzhaf.zza()).get(zzgazVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e = e2;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgocVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgocVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgazVar.zzd.zzb(57);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgocVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgocVarZza.zzc();
                r2.zze.zzb();
                throw th4;
            }
        } catch (InterruptedException e4) {
            e = e4;
            zzgazVar = this;
        } catch (ExecutionException e5) {
            e = e5;
            zzgazVar = this;
        } catch (TimeoutException unused2) {
            zzgazVar = this;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgocVarZza.zzc();
        zzgazVar.zze.zzb();
        return string;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x007e: IGET (r9 I:com.google.android.gms.internal.ads.zzgcl) = (r2 I:com.google.android.gms.internal.ads.zzgaz) (LINE:128) com.google.android.gms.internal.ads.zzgaz.zze com.google.android.gms.internal.ads.zzgcl, block:B:32:0x007b */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzgaz] */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        final zzgaz zzgazVar;
        ?? r2;
        String string;
        zzgoc zzgocVarZza = this.zzd.zza(5);
        try {
            try {
                zzgocVarZza.zza();
                final Activity activity2 = null;
                zzgazVar = this;
                try {
                    string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgax
                        private final /* synthetic */ Context zzb;
                        private final /* synthetic */ String zzc;
                        private final /* synthetic */ View zzd;

                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                            return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                        }
                    }, zzhaf.zza()).get(zzgazVar.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e = e2;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgocVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgocVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException unused) {
                    zzgazVar.zzd.zzb(58);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgocVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgocVarZza.zzc();
                r2.zze.zzb();
                throw th4;
            }
        } catch (InterruptedException e4) {
            e = e4;
            zzgazVar = this;
        } catch (ExecutionException e5) {
            e = e5;
            zzgazVar = this;
        } catch (TimeoutException unused2) {
            zzgazVar = this;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgocVarZza.zzc();
        zzgazVar.zze.zzb();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzg(Context context, Void r2) {
        return this.zzb.zzb(context);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzh(Context context, String str, View view, Activity activity, Void r52) {
        return this.zzb.zzc(context, null, view, activity);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzi(Context context, String str, View view, Activity activity, Void r52) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }

    zzgaz(zzgdf zzgdfVar, zzgeg zzgegVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgcl zzgclVar, zzika zzikaVar, zzgbf zzgbfVar) {
        this.zza = zzgdfVar;
        this.zzb = zzgegVar;
        this.zzc = zzgmzVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = zzgbfVar.zzh();
        this.zzg = zzikaVar;
        this.zzh = zzgbfVar.zzg();
        this.zzj = zzgbfVar.zzq();
        this.zzk = zzgbfVar.zzp();
    }
}
