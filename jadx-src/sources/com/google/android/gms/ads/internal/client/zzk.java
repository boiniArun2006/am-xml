package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbyr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzk extends RemoteCreator {
    private zzbyr zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
    }

    @Nullable
    public final zzbx zza(Context context, zzr zzrVar, String str, zzbtt zzbttVar, int i2) {
        zzbhe.zza(context);
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmf)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i2);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (iInterfaceQueryLocalInterface instanceof zzbx) {
                    return (zzbx) iInterfaceQueryLocalInterface;
                }
                return new zzbv(iBinderZze);
            } catch (RemoteException e2) {
                e = e2;
                Throwable th = e;
                zzbyr zzbyrVarZza = zzbyp.zza(context);
                this.zza = zzbyrVarZza;
                zzbyrVarZza.zzh(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e3) {
                e = e3;
                Throwable th2 = e;
                zzbyr zzbyrVarZza2 = zzbyp.zza(context);
                this.zza = zzbyrVarZza2;
                zzbyrVarZza2.zzh(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
                return null;
            } catch (NullPointerException e4) {
                e = e4;
                Throwable th22 = e;
                zzbyr zzbyrVarZza22 = zzbyp.zza(context);
                this.zza = zzbyrVarZza22;
                zzbyrVarZza22.zzh(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzby) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbttVar, ModuleDescriptor.MODULE_VERSION, i2);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface2 instanceof zzbx) {
                return (zzbx) iInterfaceQueryLocalInterface2;
            }
            return new zzbv(iBinderZze2);
        } catch (RemoteException e5) {
            e = e5;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e6) {
            e = e6;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
            return null;
        }
    }
}
