package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        double d2 = 0.0d;
        double d4 = 0.0d;
        float f3 = 0.0f;
        long j2 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s2 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d2 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d4 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f3 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbe(strCreateString, i2, s2, d2, d4, f3, j2, i3, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i2) {
        return new zzbe[i2];
    }
}
