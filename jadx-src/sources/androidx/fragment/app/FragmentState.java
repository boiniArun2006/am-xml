package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.Lifecycle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() { // from class: androidx.fragment.app.FragmentState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    };
    final boolean E2;
    final boolean J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final int f38609N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final boolean f38610O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final boolean f38611S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final String f38612T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    final int f38613X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final String f38614Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f38615e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f38616g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f38617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int f38618o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f38619r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final String f38620t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final boolean f38621v;

    FragmentState(Fragment fragment) {
        this.f38617n = fragment.getClass().getName();
        this.f38620t = fragment.mWho;
        this.f38610O = fragment.mFromLayout;
        this.J2 = fragment.mInDynamicContainer;
        this.f38619r = fragment.mFragmentId;
        this.f38618o = fragment.mContainerId;
        this.f38614Z = fragment.mTag;
        this.f38611S = fragment.mRetainInstance;
        this.f38616g = fragment.mRemoving;
        this.E2 = fragment.mDetached;
        this.f38615e = fragment.mHidden;
        this.f38613X = fragment.mMaxState.ordinal();
        this.f38612T = fragment.mTargetWho;
        this.f38609N = fragment.mTargetRequestCode;
        this.f38621v = fragment.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Fragment n(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        Fragment fragmentN = fragmentFactory.n(classLoader, this.f38617n);
        fragmentN.mWho = this.f38620t;
        fragmentN.mFromLayout = this.f38610O;
        fragmentN.mInDynamicContainer = this.J2;
        fragmentN.mRestored = true;
        fragmentN.mFragmentId = this.f38619r;
        fragmentN.mContainerId = this.f38618o;
        fragmentN.mTag = this.f38614Z;
        fragmentN.mRetainInstance = this.f38611S;
        fragmentN.mRemoving = this.f38616g;
        fragmentN.mDetached = this.E2;
        fragmentN.mHidden = this.f38615e;
        fragmentN.mMaxState = Lifecycle.State.values()[this.f38613X];
        fragmentN.mTargetWho = this.f38612T;
        fragmentN.mTargetRequestCode = this.f38609N;
        fragmentN.mUserVisibleHint = this.f38621v;
        return fragmentN;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f38617n);
        sb.append(" (");
        sb.append(this.f38620t);
        sb.append(")}:");
        if (this.f38610O) {
            sb.append(" fromLayout");
        }
        if (this.J2) {
            sb.append(" dynamicContainer");
        }
        if (this.f38618o != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f38618o));
        }
        String str = this.f38614Z;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f38614Z);
        }
        if (this.f38611S) {
            sb.append(" retainInstance");
        }
        if (this.f38616g) {
            sb.append(" removing");
        }
        if (this.E2) {
            sb.append(" detached");
        }
        if (this.f38615e) {
            sb.append(" hidden");
        }
        if (this.f38612T != null) {
            sb.append(" targetWho=");
            sb.append(this.f38612T);
            sb.append(" targetRequestCode=");
            sb.append(this.f38609N);
        }
        if (this.f38621v) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f38617n);
        parcel.writeString(this.f38620t);
        parcel.writeInt(this.f38610O ? 1 : 0);
        parcel.writeInt(this.J2 ? 1 : 0);
        parcel.writeInt(this.f38619r);
        parcel.writeInt(this.f38618o);
        parcel.writeString(this.f38614Z);
        parcel.writeInt(this.f38611S ? 1 : 0);
        parcel.writeInt(this.f38616g ? 1 : 0);
        parcel.writeInt(this.E2 ? 1 : 0);
        parcel.writeInt(this.f38615e ? 1 : 0);
        parcel.writeInt(this.f38613X);
        parcel.writeString(this.f38612T);
        parcel.writeInt(this.f38609N);
        parcel.writeInt(this.f38621v ? 1 : 0);
    }

    FragmentState(Parcel parcel) {
        this.f38617n = parcel.readString();
        this.f38620t = parcel.readString();
        this.f38610O = parcel.readInt() != 0;
        this.J2 = parcel.readInt() != 0;
        this.f38619r = parcel.readInt();
        this.f38618o = parcel.readInt();
        this.f38614Z = parcel.readString();
        this.f38611S = parcel.readInt() != 0;
        this.f38616g = parcel.readInt() != 0;
        this.E2 = parcel.readInt() != 0;
        this.f38615e = parcel.readInt() != 0;
        this.f38613X = parcel.readInt();
        this.f38612T = parcel.readString();
        this.f38609N = parcel.readInt();
        this.f38621v = parcel.readInt() != 0;
    }
}
