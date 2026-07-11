package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", id = 1)
    final int zza;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, id = 2)
    final zzba zzb;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, getter = "getLocationListenerBinder", id = 3, type = "android.os.IBinder")
    final com.google.android.gms.location.zzbd zzc;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, id = 4)
    final PendingIntent zzd;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, getter = "getLocationCallbackBinder", id = 5, type = "android.os.IBinder")
    final com.google.android.gms.location.zzba zze;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, getter = "getFusedLocationProviderCallbackBinder", id = 6, type = "android.os.IBinder")
    final zzai zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.zzbd] */
    public static zzbc zza(com.google.android.gms.location.zzbd zzbdVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, zzbdVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, @Nullable zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, com.google.android.gms.location.zzba] */
    public static zzbc zzc(com.google.android.gms.location.zzba zzbaVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, zzbaVar, zzaiVar);
    }

    @SafeParcelable.Constructor
    zzbc(@SafeParcelable.Param(id = 1) int i2, @Nullable @SafeParcelable.Param(id = 2) zzba zzbaVar, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder2, @Nullable @SafeParcelable.Param(id = 6) IBinder iBinder3) {
        com.google.android.gms.location.zzbd zzbdVarZzb;
        com.google.android.gms.location.zzba zzbaVarZzb;
        this.zza = i2;
        this.zzb = zzbaVar;
        zzai zzagVar = null;
        if (iBinder == null) {
            zzbdVarZzb = null;
        } else {
            zzbdVarZzb = com.google.android.gms.location.zzbc.zzb(iBinder);
        }
        this.zzc = zzbdVarZzb;
        this.zzd = pendingIntent;
        if (iBinder2 == null) {
            zzbaVarZzb = null;
        } else {
            zzbaVarZzb = com.google.android.gms.location.zzaz.zzb(iBinder2);
        }
        this.zze = zzbaVarZzb;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface instanceof zzai) {
                zzagVar = (zzai) iInterfaceQueryLocalInterface;
            } else {
                zzagVar = new zzag(iBinder3);
            }
        }
        this.zzf = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinderAsBinder;
        IBinder iBinderAsBinder2;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i2, false);
        com.google.android.gms.location.zzbd zzbdVar = this.zzc;
        IBinder iBinderAsBinder3 = null;
        if (zzbdVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzbdVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinderAsBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        com.google.android.gms.location.zzba zzbaVar = this.zze;
        if (zzbaVar == null) {
            iBinderAsBinder2 = null;
        } else {
            iBinderAsBinder2 = zzbaVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinderAsBinder2, false);
        zzai zzaiVar = this.zzf;
        if (zzaiVar != null) {
            iBinderAsBinder3 = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinderAsBinder3, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
