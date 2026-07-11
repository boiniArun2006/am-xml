package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class MultiSelectListPreference extends DialogPreference {
    private Set Jk;
    private CharSequence[] n1;
    private CharSequence[] ul;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.Jk = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.E2, i2, i3);
        this.ul = TypedArrayUtils.HI(typedArrayObtainStyledAttributes, R.styleable.f40676T, R.styleable.f40683e);
        this.n1 = TypedArrayUtils.HI(typedArrayObtainStyledAttributes, R.styleable.f40673N, R.styleable.f40679X);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.MultiSelectListPreference.SavedState.1
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
        Set f40533n;

        SavedState(Parcel parcel) {
            super(parcel);
            int i2 = parcel.readInt();
            this.f40533n = new HashSet();
            String[] strArr = new String[i2];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f40533n, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f40533n.size());
            Set set = this.f40533n;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // androidx.preference.Preference
    protected void B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.B(savedState.getSuperState());
        kSg(savedState.f40533n);
    }

    @Override // androidx.preference.Preference
    protected void D(Object obj) {
        kSg(aYN((Set) obj));
    }

    public CharSequence[] ER() {
        return this.n1;
    }

    public void kSg(Set set) {
        this.Jk.clear();
        this.Jk.addAll(set);
        dR0(set);
        wTp();
    }

    public Set lLA() {
        return this.Jk;
    }

    public CharSequence[] tUK() {
        return this.ul;
    }

    @Override // androidx.preference.Preference
    protected Parcelable J() {
        Parcelable parcelableJ = super.J();
        if (N()) {
            return parcelableJ;
        }
        SavedState savedState = new SavedState(parcelableJ);
        savedState.f40533n = lLA();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected Object eF(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.rl, android.R.attr.dialogPreferenceStyle));
    }
}
