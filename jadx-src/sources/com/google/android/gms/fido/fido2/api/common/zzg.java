package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzf[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzgx zzgxVarZzl;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzgx zzgxVarZzl2 = null;
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                }
            } else {
                bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (bArrCreateByteArray == null) {
            zzgxVarZzl = null;
        } else {
            zzgxVarZzl = zzgx.zzl(bArrCreateByteArray, 0, bArrCreateByteArray.length);
        }
        if (bArrCreateByteArray2 != null) {
            zzgxVarZzl2 = zzgx.zzl(bArrCreateByteArray2, 0, bArrCreateByteArray2.length);
        }
        return new zzf(zzgxVarZzl, zzgxVarZzl2);
    }
}
