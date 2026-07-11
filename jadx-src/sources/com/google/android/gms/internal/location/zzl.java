package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", id = 1)
    final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, id = 2)
    final zzj zzb;

    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, getter = "getDeviceOrientationListenerBinder", id = 3, type = "android.os.IBinder")
    final com.google.android.gms.location.zzax zzc;

    @SafeParcelable.Field(defaultValueUnchecked = V8ValueNull.NULL, getter = "getFusedLocationProviderCallbackBinder", id = 4, type = "android.os.IBinder")
    final zzai zzd;

    @SafeParcelable.Constructor
    zzl(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) zzj zzjVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        com.google.android.gms.location.zzax zzaxVarZzb;
        this.zza = i2;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        if (iBinder == null) {
            zzaxVarZzb = null;
        } else {
            zzaxVarZzb = com.google.android.gms.location.zzaw.zzb(iBinder);
        }
        this.zzc = zzaxVarZzb;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface instanceof zzai) {
                zzagVar = (zzai) iInterfaceQueryLocalInterface;
            } else {
                zzagVar = new zzag(iBinder2);
            }
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinderAsBinder;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i2, false);
        com.google.android.gms.location.zzax zzaxVar = this.zzc;
        IBinder iBinderAsBinder2 = null;
        if (zzaxVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = zzaxVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, iBinderAsBinder, false);
        zzai zzaiVar = this.zzd;
        if (zzaiVar != null) {
            iBinderAsBinder2 = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinderAsBinder2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
