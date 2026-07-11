package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    };
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    BackStackRecordState[] f38597O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    ArrayList f38598S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    ArrayList f38599Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f38600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f38601o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    String f38602r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ArrayList f38603t;

    public FragmentManagerState() {
        this.f38602r = null;
        this.f38601o = new ArrayList();
        this.f38599Z = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f38600n);
        parcel.writeStringList(this.f38603t);
        parcel.writeTypedArray(this.f38597O, i2);
        parcel.writeInt(this.J2);
        parcel.writeString(this.f38602r);
        parcel.writeStringList(this.f38601o);
        parcel.writeTypedList(this.f38599Z);
        parcel.writeTypedList(this.f38598S);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f38602r = null;
        this.f38601o = new ArrayList();
        this.f38599Z = new ArrayList();
        this.f38600n = parcel.createStringArrayList();
        this.f38603t = parcel.createStringArrayList();
        this.f38597O = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.J2 = parcel.readInt();
        this.f38602r = parcel.readString();
        this.f38601o = parcel.createStringArrayList();
        this.f38599Z = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f38598S = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
