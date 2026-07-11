package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbki implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        com.google.android.gms.ads.internal.client.zzga zzgaVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    i5 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    zzgaVar = (com.google.android.gms.ads.internal.client.zzga) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.ads.internal.client.zzga.CREATOR);
                    break;
                case 7:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i8 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 10:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    i9 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbkh(i2, z2, i3, z3, i5, zzgaVar, z4, i7, i8, z5, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbkh[i2];
    }
}
