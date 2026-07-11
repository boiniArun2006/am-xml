package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Handler f40619C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private boolean f40620G7;
    private final Runnable Jk;
    private final List Mx;
    private boolean eWT;
    private int fcU;
    private OnExpandButtonClickListener n1;
    final SimpleArrayMap ofS;
    private int ul;

    @RestrictTo
    public interface OnExpandButtonClickListener {
        void n();
    }

    public interface PreferencePositionCallback {
        int mUb(String str);

        int t(Preference preference);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.ofS = new SimpleArrayMap();
        this.f40619C = new Handler(Looper.getMainLooper());
        this.f40620G7 = true;
        this.fcU = 0;
        this.eWT = false;
        this.ul = Integer.MAX_VALUE;
        this.n1 = null;
        this.Jk = new Runnable() { // from class: androidx.preference.PreferenceGroup.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    PreferenceGroup.this.ofS.clear();
                }
            }
        };
        this.Mx = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GD, i2, i3);
        int i5 = R.styleable.EWS;
        this.f40620G7 = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i5, i5, true);
        int i7 = R.styleable.Po6;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            RQ(TypedArrayUtils.nr(typedArrayObtainStyledAttributes, i7, i7, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean W(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.FX();
                if (preference.Z() == this) {
                    preference.n(null);
                }
                zRemove = this.Mx.remove(preference);
                if (zRemove) {
                    String strIk = preference.Ik();
                    if (strIk != null) {
                        this.ofS.put(strIk, Long.valueOf(preference.HI()));
                        this.f40619C.removeCallbacks(this.Jk);
                        this.f40619C.post(this.Jk);
                    }
                    if (this.eWT) {
                        preference.p5();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemove;
    }

    protected boolean ER() {
        return true;
    }

    void F() {
        synchronized (this) {
            Collections.sort(this.Mx);
        }
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f40622n;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f40622n = parcel.readInt();
        }

        SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f40622n = i2;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f40622n);
        }
    }

    @Override // androidx.preference.Preference
    protected void B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.ul = savedState.f40622n;
        super.B(savedState.getSuperState());
    }

    public Preference How(int i2) {
        return (Preference) this.Mx.get(i2);
    }

    public OnExpandButtonClickListener K() {
        return this.n1;
    }

    public Preference UhV(CharSequence charSequence) {
        Preference preferenceUhV;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(Ik(), charSequence)) {
            return this;
        }
        int iTUK = tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            Preference preferenceHow = How(i2);
            if (TextUtils.equals(preferenceHow.Ik(), charSequence)) {
                return preferenceHow;
            }
            if ((preferenceHow instanceof PreferenceGroup) && (preferenceUhV = ((PreferenceGroup) preferenceHow).UhV(charSequence)) != null) {
                return preferenceUhV;
            }
        }
        return null;
    }

    public void a63(boolean z2) {
        this.f40620G7 = z2;
    }

    public boolean hRu(Preference preference) {
        long jNr;
        if (this.Mx.contains(preference)) {
            return true;
        }
        if (preference.Ik() != null) {
            PreferenceGroup preferenceGroupZ = this;
            while (preferenceGroupZ.Z() != null) {
                preferenceGroupZ = preferenceGroupZ.Z();
            }
            String strIk = preference.Ik();
            if (preferenceGroupZ.UhV(strIk) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + strIk + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.o() == Integer.MAX_VALUE) {
            if (this.f40620G7) {
                int i2 = this.fcU;
                this.fcU = i2 + 1;
                preference.eWT(i2);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).a63(this.f40620G7);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.Mx, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!lLA(preference)) {
            return false;
        }
        synchronized (this) {
            this.Mx.add(iBinarySearch, preference);
        }
        PreferenceManager preferenceManagerNY = nY();
        String strIk2 = preference.Ik();
        if (strIk2 == null || !this.ofS.containsKey(strIk2)) {
            jNr = preferenceManagerNY.nr();
        } else {
            jNr = ((Long) this.ofS.get(strIk2)).longValue();
            this.ofS.remove(strIk2);
        }
        preference.jB(preferenceManagerNY, jNr);
        preference.n(this);
        if (this.eWT) {
            preference.bzg();
        }
        rV9();
        return true;
    }

    public int i() {
        return this.ul;
    }

    public int tUK() {
        return this.Mx.size();
    }

    public void EWS(Preference preference) {
        hRu(preference);
    }

    @Override // androidx.preference.Preference
    protected Parcelable J() {
        return new SavedState(super.J(), this.ul);
    }

    @Override // androidx.preference.Preference
    protected void J2(Bundle bundle) {
        super.J2(bundle);
        int iTUK = tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            How(i2).J2(bundle);
        }
    }

    public void RQ(int i2) {
        if (i2 != Integer.MAX_VALUE && !e()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.ul = i2;
    }

    @Override // androidx.preference.Preference
    protected void Uo(Bundle bundle) {
        super.Uo(bundle);
        int iTUK = tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            How(i2).Uo(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void bzg() {
        super.bzg();
        this.eWT = true;
        int iTUK = tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            How(i2).bzg();
        }
    }

    public boolean kSg(Preference preference) {
        boolean zW = W(preference);
        rV9();
        return zW;
    }

    protected boolean lLA(Preference preference) {
        preference.M(this, qm());
        return true;
    }

    @Override // androidx.preference.Preference
    public void p5() {
        super.p5();
        this.eWT = false;
        int iTUK = tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            How(i2).p5();
        }
    }

    @Override // androidx.preference.Preference
    public void v(boolean z2) {
        super.v(z2);
        int iTUK = tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            How(i2).M(this, z2);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
