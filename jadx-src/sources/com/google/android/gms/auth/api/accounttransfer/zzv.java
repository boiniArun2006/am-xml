package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzu[i2];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        zzw zzwVar = null;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                strCreateString3 = SafeParcelReader.createString(parcel, header);
                                hashSet.add(5);
                            }
                        } else {
                            strCreateString2 = SafeParcelReader.createString(parcel, header);
                            hashSet.add(4);
                        }
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        hashSet.add(3);
                    }
                } else {
                    zzwVar = (zzw) SafeParcelReader.createParcelable(parcel, header, zzw.CREATOR);
                    hashSet.add(2);
                }
            } else {
                i2 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(1);
            }
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzu(hashSet, i2, zzwVar, strCreateString, strCreateString2, strCreateString3);
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + iValidateObjectHeader, parcel);
    }
}
