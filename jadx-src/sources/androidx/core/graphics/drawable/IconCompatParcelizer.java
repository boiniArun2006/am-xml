package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public class IconCompatParcelizer {
    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.aYN(true, true);
        iconCompat.XQ(versionedParcel.J2());
        int i2 = iconCompat.f36438n;
        if (-1 != i2) {
            versionedParcel.e(i2, 1);
        }
        byte[] bArr = iconCompat.f36439t;
        if (bArr != null) {
            versionedParcel.te(bArr, 2);
        }
        Parcelable parcelable = iconCompat.nr;
        if (parcelable != null) {
            versionedParcel.T(parcelable, 3);
        }
        int i3 = iconCompat.f36437O;
        if (i3 != 0) {
            versionedParcel.e(i3, 4);
        }
        int i5 = iconCompat.J2;
        if (i5 != 0) {
            versionedParcel.e(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.Uo;
        if (colorStateList != null) {
            versionedParcel.T(colorStateList, 6);
        }
        String str = iconCompat.xMQ;
        if (str != null) {
            versionedParcel.nHg(str, 7);
        }
        String str2 = iconCompat.mUb;
        if (str2 != null) {
            versionedParcel.nHg(str2, 8);
        }
    }

    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f36438n = versionedParcel.ck(iconCompat.f36438n, 1);
        iconCompat.f36439t = versionedParcel.mUb(iconCompat.f36439t, 2);
        iconCompat.nr = versionedParcel.r(iconCompat.nr, 3);
        iconCompat.f36437O = versionedParcel.ck(iconCompat.f36437O, 4);
        iconCompat.J2 = versionedParcel.ck(iconCompat.J2, 5);
        iconCompat.Uo = (ColorStateList) versionedParcel.r(iconCompat.Uo, 6);
        iconCompat.xMQ = versionedParcel.Z(iconCompat.xMQ, 7);
        iconCompat.mUb = versionedParcel.Z(iconCompat.mUb, 8);
        iconCompat.Z();
        return iconCompat;
    }
}
