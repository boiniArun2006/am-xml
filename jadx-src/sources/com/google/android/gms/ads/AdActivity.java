package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxs;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@KeepForSdk
public final class AdActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    @Nullable
    private zzbxs zza;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63168h, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        zzbxs zzbxsVarZzh = zzbb.zzb().zzh(this);
        this.zza = zzbxsVarZzh;
        if (zzbxsVarZzh == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbxsVarZzh.zzh(bundle);
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        super.setContentView(i2);
        zza();
    }

    private final void zza() {
        zzbxs zzbxsVar = this.zza;
        if (zzbxsVar != null) {
            try {
                zzbxsVar.zzs();
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i2, int i3, @NonNull Intent intent) {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzm(i2, i3, intent);
            }
        } catch (Exception e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                if (!zzbxsVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
        super.onBackPressed();
        try {
            zzbxs zzbxsVar2 = this.zza;
            if (zzbxsVar2 != null) {
                zzbxsVar2.zze();
            }
        } catch (RemoteException e3) {
            zzo.zzl("#007 Could not call remote method.", e3);
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        zzo.zzd("AdActivity onDestroy");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzq();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        zzo.zzd("AdActivity onPause");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzl();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzH(i2, strArr, iArr);
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzk();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzo(bundle);
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        zzo.zzd("AdActivity onStop");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzp();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzn(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzi();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzj();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxs zzbxsVar = this.zza;
            if (zzbxsVar != null) {
                zzbxsVar.zzf();
            }
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
