package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ListPreference extends DialogPreference {
    private String Jk;
    private String Rl;
    private CharSequence[] n1;
    private boolean qm;
    private CharSequence[] ul;

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<ListPreference> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SimpleSummaryProvider f40526n;

        public static SimpleSummaryProvider rl() {
            if (f40526n == null) {
                f40526n = new SimpleSummaryProvider();
            }
            return f40526n;
        }

        private SimpleSummaryProvider() {
        }

        @Override // androidx.preference.Preference.SummaryProvider
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public CharSequence n(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.lLA())) {
                return listPreference.mUb().getString(R.string.f40659t);
            }
            return listPreference.lLA();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViF, i2, i3);
        this.ul = TypedArrayUtils.HI(typedArrayObtainStyledAttributes, R.styleable.te, R.styleable.nY);
        this.n1 = TypedArrayUtils.HI(typedArrayObtainStyledAttributes, R.styleable.iF, R.styleable.f40685g);
        int i5 = R.styleable.fD;
        if (TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i5, i5, false)) {
            n1(SimpleSummaryProvider.rl());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.nHg, i2, i3);
        this.Rl = TypedArrayUtils.az(typedArrayObtainStyledAttributes2, R.styleable.f40662C, R.styleable.f40677U);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
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
        String f40525n;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f40525n = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f40525n);
        }
    }

    private int RQ() {
        return tUK(this.Jk);
    }

    @Override // androidx.preference.Preference
    protected void B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.B(savedState.getSuperState());
        a63(savedState.f40525n);
    }

    @Override // androidx.preference.Preference
    protected void D(Object obj) {
        a63(WPU((String) obj));
    }

    public CharSequence[] ER() {
        return this.ul;
    }

    public String W() {
        return this.Jk;
    }

    public void a63(String str) {
        boolean zEquals = TextUtils.equals(this.Jk, str);
        if (zEquals && this.qm) {
            return;
        }
        this.Jk = str;
        this.qm = true;
        k(str);
        if (zEquals) {
            return;
        }
        wTp();
    }

    public CharSequence[] kSg() {
        return this.n1;
    }

    public int tUK(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.n1) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.n1[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    protected Parcelable J() {
        Parcelable parcelableJ = super.J();
        if (N()) {
            return parcelableJ;
        }
        SavedState savedState = new SavedState(parcelableJ);
        savedState.f40525n = W();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected Object eF(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public CharSequence lLA() {
        CharSequence[] charSequenceArr;
        int iRQ = RQ();
        if (iRQ >= 0 && (charSequenceArr = this.ul) != null) {
            return charSequenceArr[iRQ];
        }
        return null;
    }

    @Override // androidx.preference.Preference
    public CharSequence te() {
        if (iF() != null) {
            return iF().n(this);
        }
        CharSequence charSequenceLLA = lLA();
        CharSequence charSequenceTe = super.te();
        String str = this.Rl;
        if (str != null) {
            if (charSequenceLLA == null) {
                charSequenceLLA = "";
            }
            String str2 = String.format(str, charSequenceLLA);
            if (!TextUtils.equals(str2, charSequenceTe)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceTe;
    }

    @Override // androidx.preference.Preference
    public void ul(CharSequence charSequence) {
        super.ul(charSequence);
        if (charSequence == null) {
            this.Rl = null;
        } else {
            this.Rl = charSequence.toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.rl, android.R.attr.dialogPreferenceStyle));
    }
}
