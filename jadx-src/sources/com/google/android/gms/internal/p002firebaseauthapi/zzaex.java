package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.Wre;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import oW.Xo;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class zzaex<ResultT, CallbackT> implements zzafi<ResultT> {
    protected final int zza;
    protected Wre zzc;
    protected FirebaseUser zzd;
    protected CallbackT zze;
    protected Xo zzf;
    protected zzaey<ResultT> zzg;
    protected Executor zzi;
    protected zzahn zzj;
    protected zzahc zzk;
    protected zzagn zzl;
    protected zzahx zzm;
    protected AuthCredential zzn;
    protected String zzo;
    protected String zzp;
    protected zzaaj zzq;
    protected zzahk zzr;
    protected zzahj zzs;
    protected zzaij zzt;
    private boolean zzu;
    protected final zzaez zzb = new zzaez(this);
    protected final List<PhoneAuthProvider.j> zzh = new ArrayList();

    private static class zza extends LifecycleCallback {
        private final List<PhoneAuthProvider.j> zza;

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        @MainThread
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }

        private zza(LifecycleFragment lifecycleFragment, List<PhoneAuthProvider.j> list) {
            super(lifecycleFragment);
            this.mLifecycleFragment.addCallback("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<PhoneAuthProvider.j> list) {
            LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.getCallbackOrNull("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaex<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) Preconditions.checkNotNull(callbackt, "external callback cannot be null");
        return this;
    }

    public zzaex(int i2) {
        this.zza = i2;
    }

    public final zzaex<ResultT, CallbackT> zza(Xo xo) {
        this.zzf = (Xo) Preconditions.checkNotNull(xo, "external failure callback cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(Wre wre) {
        this.zzc = (Wre) Preconditions.checkNotNull(wre, "firebaseApp cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(FirebaseUser firebaseUser) {
        this.zzd = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(PhoneAuthProvider.j jVar, @Nullable Activity activity, Executor executor, String str) {
        PhoneAuthProvider.j jVarZza = zzaft.zza(str, jVar, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.j) Preconditions.checkNotNull(jVarZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    static /* synthetic */ void zza(zzaex zzaexVar) {
        zzaexVar.zzb();
        Preconditions.checkState(zzaexVar.zzu, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzaex zzaexVar, Status status) {
        Xo xo = zzaexVar.zzf;
        if (xo != null) {
            xo.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
