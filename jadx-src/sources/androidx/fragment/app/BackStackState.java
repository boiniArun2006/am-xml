package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final List f38481n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final List f38482t;

    BackStackState(List list, List list2) {
        this.f38481n = list;
        this.f38482t = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    List n(FragmentManager fragmentManager, Map map) {
        HashMap map2 = new HashMap(this.f38481n.size());
        for (String str : this.f38481n) {
            Fragment fragment = (Fragment) map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleTe = fragmentManager.GD().te(str, null);
                if (bundleTe != null) {
                    ClassLoader classLoader = fragmentManager.EWS().getContext().getClassLoader();
                    Fragment fragmentN = ((FragmentState) bundleTe.getParcelable("state")).n(fragmentManager.HV(), classLoader);
                    fragmentN.mSavedFragmentState = bundleTe;
                    if (bundleTe.getBundle("savedInstanceState") == null) {
                        fragmentN.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleTe.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentN.setArguments(bundle);
                    map2.put(fragmentN.mWho, fragmentN);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f38482t.iterator();
        while (it.hasNext()) {
            arrayList.add(((BackStackRecordState) it.next()).t(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f38481n);
        parcel.writeTypedList(this.f38482t);
    }

    BackStackState(Parcel parcel) {
        this.f38481n = parcel.createStringArrayList();
        this.f38482t = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
