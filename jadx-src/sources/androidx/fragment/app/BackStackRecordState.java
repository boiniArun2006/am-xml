package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.Lifecycle;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i2) {
            return new BackStackRecordState[i2];
        }
    };
    final int E2;
    final int[] J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final boolean f38469N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final int[] f38470O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final int f38471S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final ArrayList f38472T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final ArrayList f38473X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final int f38474Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final CharSequence f38475e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f38476g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int[] f38477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final String f38478o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f38479r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayList f38480t;

    BackStackRecordState(BackStackRecord backStackRecord) {
        int size = backStackRecord.f38646t.size();
        this.f38477n = new int[size * 6];
        if (!backStackRecord.xMQ) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f38480t = new ArrayList(size);
        this.f38470O = new int[size];
        this.J2 = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            FragmentTransaction.Op op = (FragmentTransaction.Op) backStackRecord.f38646t.get(i3);
            int i5 = i2 + 1;
            this.f38477n[i2] = op.f38648n;
            ArrayList arrayList = this.f38480t;
            Fragment fragment = op.rl;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f38477n;
            iArr[i5] = op.f38649t ? 1 : 0;
            iArr[i2 + 2] = op.nr;
            iArr[i2 + 3] = op.f38647O;
            int i7 = i2 + 5;
            iArr[i2 + 4] = op.J2;
            i2 += 6;
            iArr[i7] = op.Uo;
            this.f38470O[i3] = op.KN.ordinal();
            this.J2[i3] = op.xMQ.ordinal();
        }
        this.f38479r = backStackRecord.KN;
        this.f38478o = backStackRecord.gh;
        this.f38474Z = backStackRecord.f38467S;
        this.f38471S = backStackRecord.qie;
        this.f38476g = backStackRecord.az;
        this.E2 = backStackRecord.ty;
        this.f38475e = backStackRecord.HI;
        this.f38473X = backStackRecord.ck;
        this.f38472T = backStackRecord.Ik;
        this.f38469N = backStackRecord.f38645r;
    }

    private void n(BackStackRecord backStackRecord) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= this.f38477n.length) {
                backStackRecord.KN = this.f38479r;
                backStackRecord.gh = this.f38478o;
                backStackRecord.xMQ = true;
                backStackRecord.qie = this.f38471S;
                backStackRecord.az = this.f38476g;
                backStackRecord.ty = this.E2;
                backStackRecord.HI = this.f38475e;
                backStackRecord.ck = this.f38473X;
                backStackRecord.Ik = this.f38472T;
                backStackRecord.f38645r = this.f38469N;
                return;
            }
            FragmentTransaction.Op op = new FragmentTransaction.Op();
            int i5 = i2 + 1;
            op.f38648n = this.f38477n[i2];
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i3 + " base fragment #" + this.f38477n[i5]);
            }
            op.KN = Lifecycle.State.values()[this.f38470O[i3]];
            op.xMQ = Lifecycle.State.values()[this.J2[i3]];
            int[] iArr = this.f38477n;
            int i7 = i2 + 2;
            if (iArr[i5] == 0) {
                z2 = false;
            }
            op.f38649t = z2;
            int i8 = iArr[i7];
            op.nr = i8;
            int i9 = iArr[i2 + 3];
            op.f38647O = i9;
            int i10 = i2 + 5;
            int i11 = iArr[i2 + 4];
            op.J2 = i11;
            i2 += 6;
            int i12 = iArr[i10];
            op.Uo = i12;
            backStackRecord.nr = i8;
            backStackRecord.f38642O = i9;
            backStackRecord.J2 = i11;
            backStackRecord.Uo = i12;
            backStackRecord.J2(op);
            i3++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BackStackRecord rl(FragmentManager fragmentManager) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        n(backStackRecord);
        backStackRecord.f38467S = this.f38474Z;
        for (int i2 = 0; i2 < this.f38480t.size(); i2++) {
            String str = (String) this.f38480t.get(i2);
            if (str != null) {
                ((FragmentTransaction.Op) backStackRecord.f38646t.get(i2)).rl = fragmentManager.m(str);
            }
        }
        backStackRecord.te(1);
        return backStackRecord;
    }

    public BackStackRecord t(FragmentManager fragmentManager, Map map) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManager);
        n(backStackRecord);
        for (int i2 = 0; i2 < this.f38480t.size(); i2++) {
            String str = (String) this.f38480t.get(i2);
            if (str != null) {
                Fragment fragment = (Fragment) map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f38478o + " failed due to missing saved state for Fragment (" + str + ")");
                }
                ((FragmentTransaction.Op) backStackRecord.f38646t.get(i2)).rl = fragment;
            }
        }
        return backStackRecord;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f38477n);
        parcel.writeStringList(this.f38480t);
        parcel.writeIntArray(this.f38470O);
        parcel.writeIntArray(this.J2);
        parcel.writeInt(this.f38479r);
        parcel.writeString(this.f38478o);
        parcel.writeInt(this.f38474Z);
        parcel.writeInt(this.f38471S);
        TextUtils.writeToParcel(this.f38476g, parcel, 0);
        parcel.writeInt(this.E2);
        TextUtils.writeToParcel(this.f38475e, parcel, 0);
        parcel.writeStringList(this.f38473X);
        parcel.writeStringList(this.f38472T);
        parcel.writeInt(this.f38469N ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f38477n = parcel.createIntArray();
        this.f38480t = parcel.createStringArrayList();
        this.f38470O = parcel.createIntArray();
        this.J2 = parcel.createIntArray();
        this.f38479r = parcel.readInt();
        this.f38478o = parcel.readString();
        this.f38474Z = parcel.readInt();
        this.f38471S = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f38476g = (CharSequence) creator.createFromParcel(parcel);
        this.E2 = parcel.readInt();
        this.f38475e = (CharSequence) creator.createFromParcel(parcel);
        this.f38473X = parcel.createStringArrayList();
        this.f38472T = parcel.createStringArrayList();
        this.f38469N = parcel.readInt() != 0;
    }
}
