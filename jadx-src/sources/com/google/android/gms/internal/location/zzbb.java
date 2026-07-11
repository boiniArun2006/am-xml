package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List<ClientIdentity> listCreateTypedList = zzba.zza;
        LocationRequest locationRequest = null;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = Long.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        listCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 7:
                        z2 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 8:
                        z3 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 9:
                        z4 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 10:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 11:
                        z5 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 12:
                        z6 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 13:
                        strCreateString3 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 14:
                        j2 = SafeParcelReader.readLong(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, header, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzba(locationRequest, listCreateTypedList, strCreateString, z2, z3, z4, strCreateString2, z5, z6, strCreateString3, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i2) {
        return new zzba[i2];
    }
}
