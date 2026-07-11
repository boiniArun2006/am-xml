package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
class VersionedParcelParcel extends VersionedParcel {
    private final int J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Parcel f42340O;
    private final int Uo;
    private int gh;
    private int mUb;
    private final SparseIntArray nr;
    private int xMQ;

    VersionedParcelParcel(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    private VersionedParcelParcel(Parcel parcel, int i2, int i3, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.nr = new SparseIntArray();
        this.xMQ = -1;
        this.gh = -1;
        this.f42340O = parcel;
        this.J2 = i2;
        this.Uo = i3;
        this.mUb = i2;
        this.KN = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E2(int i2) {
        this.f42340O.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int HI() {
        return this.f42340O.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable Ik() {
        return this.f42340O.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void N(String str) {
        this.f42340O.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean Uo() {
        return this.f42340O.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void ViF(boolean z2) {
        this.f42340O.writeInt(z2 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void X(Parcelable parcelable) {
        this.f42340O.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean az(int i2) {
        while (this.mUb < this.Uo) {
            int i3 = this.gh;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f42340O.setDataPosition(this.mUb);
            int i5 = this.f42340O.readInt();
            this.gh = this.f42340O.readInt();
            this.mUb += i5;
        }
        return this.gh == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void g(byte[] bArr) {
        if (bArr == null) {
            this.f42340O.writeInt(-1);
        } else {
            this.f42340O.writeInt(bArr.length);
            this.f42340O.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence gh() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f42340O);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void iF(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f42340O, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void n() {
        int i2 = this.xMQ;
        if (i2 >= 0) {
            int i3 = this.nr.get(i2);
            int iDataPosition = this.f42340O.dataPosition();
            this.f42340O.setDataPosition(i3);
            this.f42340O.writeInt(iDataPosition - i3);
            this.f42340O.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String o() {
        return this.f42340O.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel rl() {
        Parcel parcel = this.f42340O;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.mUb;
        if (i2 == this.J2) {
            i2 = this.Uo;
        }
        return new VersionedParcelParcel(parcel, iDataPosition, i2, this.KN + "  ", this.f42338n, this.rl, this.f42339t);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] xMQ() {
        int i2 = this.f42340O.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f42340O.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void WPU(int i2) {
        n();
        this.xMQ = i2;
        this.nr.put(i2, this.f42340O.dataPosition());
        E2(0);
        E2(i2);
    }
}
